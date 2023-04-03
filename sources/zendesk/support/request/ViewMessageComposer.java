package zendesk.support.request;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.LinkedList;
import java.util.List;
import zendesk.belvedere.C9802b;
import zendesk.support.UiUtils;

class ViewMessageComposer extends FrameLayout implements View.OnClickListener, View.OnFocusChangeListener, View.OnLayoutChangeListener, TextView.OnEditorActionListener, TextWatcher {
    private static final String LOG_TAG = "ViewMessageComposer";
    private ViewAttachmentsIndicator attachmentsIndicator;
    private AnimatorSet attachmentsOffCollapseAnimatorSet;
    private AnimatorSet attachmentsOffExpandAnimatorSet;
    private AnimatorSet attachmentsOnCollapseAnimatorSet;
    private AnimatorSet attachmentsOnExpandAnimatorSet;
    private C9802b imageStream;
    private List<InputListener> inputListenerList = new LinkedList();
    private EditText inputTextField;
    private boolean isAttachmentsButtonDisabled = true;
    private boolean isSendButtonDisabled = true;
    private List<View.OnFocusChangeListener> onFocusChangeListenerList = new LinkedList();
    private OnHeightChangeListener onHeightChangeListener;
    private ImageView sendButton;
    private MessageComposerStateHelper stateHelper;

    public interface InputListener {
        void onAddAttachmentsRequested();

        void onSendMessageRequested(String str);
    }

    public static class MessageComposerState {
        public static final int BUTTON_DISABLED = 11;
        public static final int BUTTON_ENABLED = 12;
        public static final int BUTTON_HIDDEN = 10;
        public static final int FIELD_COLLAPSED = 2;
        public static final int FIELD_EXPANDED = 1;
        private final int attachmentButtonState;
        private final int fieldState;
        private final int sendButtonState;

        public MessageComposerState(int i, int i2, int i3) {
            this.fieldState = i;
            this.sendButtonState = i2;
            this.attachmentButtonState = i3;
        }

        public int getFieldState() {
            return this.fieldState;
        }

        public int getSendButtonState() {
            return this.sendButtonState;
        }

        public boolean isAttachmentButtonActivated() {
            if (this.attachmentButtonState == 12) {
                return true;
            }
            return false;
        }

        public boolean isAttachmentButtonEnabled() {
            if (this.attachmentButtonState != 10) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "MessageComposerState{fieldState=" + this.fieldState + ", sendButtonState=" + this.sendButtonState + ", attachmentButtonEnabled=" + this.attachmentButtonState + '}';
        }
    }

    public static class MessageComposerStateHelper {
        private boolean hasAttachments(ViewAttachmentsIndicator viewAttachmentsIndicator) {
            if (viewAttachmentsIndicator.getAttachmentsCount() > 0) {
                return true;
            }
            return false;
        }

        private boolean hasLength(String str) {
            if (str == null || str.length() <= 0) {
                return false;
            }
            return true;
        }

        private boolean hasValidText(String str) {
            return kb6.m46949b(str);
        }

        public int getAttachmentButtonState(boolean z, boolean z2) {
            if (z) {
                return 10;
            }
            return z2 ? 12 : 11;
        }

        public int getFieldState(boolean z, boolean z2, boolean z3, boolean z4) {
            return (z || z2 || z4 || z3) ? 1 : 2;
        }

        public int getSendButtonState(boolean z, boolean z2, boolean z3, int i) {
            if (z2) {
                return 12;
            }
            if (!z3 || z) {
                return i == 1 ? 11 : 10;
            }
            return 12;
        }

        public MessageComposerState getState(EditText editText, EditText editText2, ViewAttachmentsIndicator viewAttachmentsIndicator, boolean z, boolean z2, boolean z3) {
            String obj = editText.getText().toString();
            boolean hasLength = hasLength(obj);
            boolean hasValidText = hasValidText(obj);
            boolean hasFocus = editText.hasFocus();
            boolean hasFocus2 = editText2.hasFocus();
            boolean hasAttachments = hasAttachments(viewAttachmentsIndicator);
            int fieldState = getFieldState(hasFocus, hasLength, hasFocus2, hasAttachments);
            return new MessageComposerState(fieldState, getSendButtonState(z2, hasValidText, hasAttachments, fieldState), getAttachmentButtonState(z3, z));
        }

        public MessageComposerState onAttachmentClicked(boolean z, boolean z2, EditText editText, EditText editText2, ViewAttachmentsIndicator viewAttachmentsIndicator) {
            int i;
            MessageComposerState state = getState(editText, editText2, viewAttachmentsIndicator, true, z, z2);
            if (state.getSendButtonState() == 10) {
                i = 11;
            } else {
                i = state.getSendButtonState();
            }
            return new MessageComposerState(1, i, getAttachmentButtonState(z2, true));
        }
    }

    public interface OnHeightChangeListener {
        void onHeightChange(int i);
    }

    public ViewMessageComposer(Context context) {
        super(context);
        viewInit(context);
    }

    private void applyState(MessageComposerState messageComposerState) {
        if (messageComposerState.getFieldState() != 1 || isExpanded()) {
            if (messageComposerState.getFieldState() == 2 && isExpanded()) {
                if (this.isAttachmentsButtonDisabled) {
                    this.attachmentsOffCollapseAnimatorSet.start();
                } else {
                    this.attachmentsOnCollapseAnimatorSet.start();
                }
            }
        } else if (this.isAttachmentsButtonDisabled) {
            this.attachmentsOffExpandAnimatorSet.start();
        } else {
            this.attachmentsOnExpandAnimatorSet.start();
        }
        int i = 0;
        if (messageComposerState.getSendButtonState() == 10) {
            updateSendBtn(false, false);
        } else if (messageComposerState.getSendButtonState() == 11) {
            updateSendBtn(true, false);
        } else if (messageComposerState.getSendButtonState() == 12) {
            updateSendBtn(true, true);
        }
        if (!messageComposerState.isAttachmentButtonEnabled()) {
            i = 8;
        }
        if (this.attachmentsIndicator.getVisibility() != i) {
            updateAttachmentButtonPosition();
            this.attachmentsIndicator.setVisibility(i);
        }
        if (messageComposerState.isAttachmentButtonEnabled() && this.attachmentsIndicator.getAttachmentsCount() == 0) {
            this.attachmentsIndicator.enableActiveState(messageComposerState.isAttachmentButtonActivated());
            this.attachmentsIndicator.setBottomBorderVisible(messageComposerState.isAttachmentButtonActivated());
        }
    }

    private void bindViews() {
        this.inputTextField = (EditText) findViewById(l35.message_composer_input_text);
        this.attachmentsIndicator = (ViewAttachmentsIndicator) findViewById(l35.message_composer_attachments_indicator);
        this.sendButton = (ImageView) findViewById(l35.message_composer_send_btn);
    }

    private void initAnimationsAndAdjustLeftMargin() {
        Resources resources = getResources();
        int integer = resources.getInteger(x35.zs_request_message_composer_animation_duration);
        int dimensionPixelSize = resources.getDimensionPixelSize(m25.zs_request_message_composer_collapsed_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(m25.zs_request_message_composer_expanded_min_height);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(m25.zs_request_message_composer_expanded_side_margin);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(m25.zs_request_message_composer_collapsed_side_margin);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(m25.zs_request_message_composer_expanded_top_padding);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(m25.zs_request_message_composer_collapsed_top_padding);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(m25.zs_request_message_composer_expanded_bottom_padding);
        this.attachmentsOnExpandAnimatorSet = new AnimatorSet();
        this.attachmentsOffExpandAnimatorSet = new AnimatorSet();
        this.attachmentsOnCollapseAnimatorSet = new AnimatorSet();
        this.attachmentsOffCollapseAnimatorSet = new AnimatorSet();
        oh3 oh3 = new oh3();
        bz1 bz1 = new bz1();
        this.attachmentsOnExpandAnimatorSet.setInterpolator(oh3);
        this.attachmentsOffExpandAnimatorSet.setInterpolator(oh3);
        this.attachmentsOnCollapseAnimatorSet.setInterpolator(bz1);
        this.attachmentsOffCollapseAnimatorSet.setInterpolator(bz1);
        this.attachmentsOnExpandAnimatorSet.play(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize, dimensionPixelSize2, integer)).with(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize4, dimensionPixelSize3, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize6, dimensionPixelSize5, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, 0, dimensionPixelOffset, integer));
        this.attachmentsOnCollapseAnimatorSet.play(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize4, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize5, dimensionPixelSize6, integer)).with(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize2, dimensionPixelSize, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, dimensionPixelOffset, 0, integer));
        this.attachmentsOffExpandAnimatorSet.play(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize, dimensionPixelSize2, integer)).with(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize3, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize6, dimensionPixelSize5, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, 0, dimensionPixelOffset, integer));
        this.attachmentsOffCollapseAnimatorSet.play(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize3, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize5, dimensionPixelSize6, integer)).with(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize2, dimensionPixelSize, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, dimensionPixelOffset, 0, integer));
        updateAttachmentButtonPosition();
    }

    private void initListener() {
        this.attachmentsIndicator.setOnClickListener(this);
        this.sendButton.setOnClickListener(this);
        this.inputTextField.addTextChangedListener(this);
        this.inputTextField.setOnEditorActionListener(this);
        this.inputTextField.setOnFocusChangeListener(this);
        addOnLayoutChangeListener(this);
    }

    private boolean isExpanded() {
        if (this.inputTextField.getHeight() > this.inputTextField.getResources().getDimensionPixelSize(m25.zs_request_message_composer_collapsed_height)) {
            return true;
        }
        return false;
    }

    private void notifyAddAttachmentsRequested() {
        for (InputListener onAddAttachmentsRequested : this.inputListenerList) {
            onAddAttachmentsRequested.onAddAttachmentsRequested();
        }
    }

    private void notifyOnFocusChangeListeners(View view, boolean z) {
        for (View.OnFocusChangeListener onFocusChange : this.onFocusChangeListenerList) {
            onFocusChange.onFocusChange(view, z);
        }
    }

    private void notifySendMessageRequested(String str) {
        for (InputListener onSendMessageRequested : this.inputListenerList) {
            onSendMessageRequested.onSendMessageRequested(str);
        }
    }

    private void updateAttachmentButtonPosition() {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(m25.zs_request_message_composer_expanded_side_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(m25.zs_request_message_composer_collapsed_side_margin);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.inputTextField.getLayoutParams();
        if (!this.isAttachmentsButtonDisabled) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        layoutParams.leftMargin = dimensionPixelSize;
        this.inputTextField.setLayoutParams(layoutParams);
    }

    private void updateSendBtn(boolean z, boolean z2) {
        int i;
        boolean z3;
        Context context = getContext();
        if (z2) {
            i = UiUtils.themeAttributeToColor(l15.colorPrimary, context, y15.zs_request_fallback_color_primary);
        } else {
            i = UiUtils.resolveColor(y15.zs_request_message_composer_send_btn_color_inactive, context);
        }
        ImageView imageView = this.sendButton;
        int i2 = 0;
        if (!z || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        imageView.setEnabled(z3);
        ImageView imageView2 = this.sendButton;
        if (!z) {
            i2 = 4;
        }
        imageView2.setVisibility(i2);
        UiUtils.setTint(i, this.sendButton.getDrawable(), this.sendButton);
    }

    private void viewInit(Context context) {
        View.inflate(context, g45.zs_view_request_message_composer, this);
        if (!isInEditMode()) {
            bindViews();
            initListener();
            initAnimationsAndAdjustLeftMargin();
            this.stateHelper = new MessageComposerStateHelper();
        }
    }

    public void addListener(InputListener inputListener) {
        this.inputListenerList.add(inputListener);
    }

    public void addOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.onFocusChangeListenerList.add(onFocusChangeListener);
    }

    public void afterTextChanged(Editable editable) {
        triggerStateUpdate();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            this.inputTextField.clearFocus();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public void enableAttachmentsButton(boolean z) {
        this.isAttachmentsButtonDisabled = !z;
        triggerStateUpdate();
    }

    public void enableSendButton(boolean z) {
        this.isSendButtonDisabled = !z;
        triggerStateUpdate();
    }

    public String getMessage() {
        return this.inputTextField.getText().toString();
    }

    public void hide(boolean z) {
        if (z) {
            setVisibility(8);
            this.onHeightChangeListener.onHeightChange(0);
            return;
        }
        setVisibility(0);
        requestLayout();
    }

    public void init(C9802b bVar) {
        this.imageStream = bVar;
        triggerStateUpdate();
    }

    public void onClick(View view) {
        if (view.getId() == this.attachmentsIndicator.getId()) {
            applyState(this.stateHelper.onAttachmentClicked(this.isSendButtonDisabled, this.isAttachmentsButtonDisabled, this.inputTextField, this.imageStream.mo73734l().getInputTrap(), this.attachmentsIndicator));
            notifyAddAttachmentsRequested();
        } else if (view.getId() == this.sendButton.getId()) {
            String trim = this.inputTextField.getText().toString().trim();
            this.inputTextField.setText("");
            this.attachmentsIndicator.reset();
            triggerStateUpdate();
            notifySendMessageRequested(trim);
        }
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (textView.getId() != this.inputTextField.getId() || i != 6) {
            return false;
        }
        this.inputTextField.clearFocus();
        UiUtils.dismissKeyboard((View) this.inputTextField);
        triggerStateUpdate();
        return false;
    }

    public void onFocusChange(View view, boolean z) {
        if (view.getId() == this.inputTextField.getId()) {
            notifyOnFocusChangeListeners(view, z);
            triggerStateUpdate();
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        OnHeightChangeListener onHeightChangeListener2;
        int i9 = i4 - i2;
        if (i9 != i8 - i6 && (onHeightChangeListener2 = this.onHeightChangeListener) != null) {
            onHeightChangeListener2.onHeightChange(i9);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void removeAllListener() {
        this.inputListenerList.clear();
    }

    public void requestFocusForInput() {
        this.inputTextField.requestFocus();
    }

    public void setAttachmentsCount(int i) {
        this.attachmentsIndicator.setAttachmentsCount(i);
        triggerStateUpdate();
    }

    public void setOnHeightChangeListener(OnHeightChangeListener onHeightChangeListener2) {
        this.onHeightChangeListener = onHeightChangeListener2;
    }

    public void triggerStateUpdate() {
        C9802b bVar = this.imageStream;
        if (bVar != null) {
            applyState(this.stateHelper.getState(this.inputTextField, bVar.mo73734l().getInputTrap(), this.attachmentsIndicator, this.imageStream.mo73736n(), this.isSendButtonDisabled, this.isAttachmentsButtonDisabled));
        }
    }

    public ViewMessageComposer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit(context);
    }

    public ViewMessageComposer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit(context);
    }

    public ViewMessageComposer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        viewInit(context);
    }

    public ViewMessageComposer(Context context, ViewAttachmentsIndicator viewAttachmentsIndicator, EditText editText, ImageView imageView, AnimatorSet animatorSet, AnimatorSet animatorSet2, AnimatorSet animatorSet3, AnimatorSet animatorSet4) {
        super(context);
        this.attachmentsIndicator = viewAttachmentsIndicator;
        this.inputTextField = editText;
        this.sendButton = imageView;
        this.attachmentsOnExpandAnimatorSet = animatorSet;
        this.attachmentsOffExpandAnimatorSet = animatorSet3;
        this.attachmentsOnCollapseAnimatorSet = animatorSet2;
        this.attachmentsOffCollapseAnimatorSet = animatorSet4;
        this.stateHelper = new MessageComposerStateHelper();
    }
}
