package zendesk.messaging.p026ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$dimen;
import zendesk.messaging.R$drawable;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;

/* renamed from: zendesk.messaging.ui.InputBox */
public class InputBox extends FrameLayout {
    /* access modifiers changed from: private */
    public AttachmentsIndicator attachmentsIndicator;
    /* access modifiers changed from: private */
    public View.OnClickListener attachmentsIndicatorClickListener;
    /* access modifiers changed from: private */
    public FrameLayout inputBox;
    /* access modifiers changed from: private */
    public InputTextConsumer inputTextConsumer;
    /* access modifiers changed from: private */
    public EditText inputTextField;
    /* access modifiers changed from: private */
    public TextWatcher inputTextWatcher;
    private ImageView sendButton;
    /* access modifiers changed from: private */
    public final List<View.OnClickListener> sendButtonClickListeners = new ArrayList();

    /* renamed from: zendesk.messaging.ui.InputBox$InputTextConsumer */
    public interface InputTextConsumer {
        boolean onConsumeText(String str);
    }

    public InputBox(Context context) {
        super(context);
        viewInit(context);
    }

    private void bindViews() {
        this.inputBox = (FrameLayout) findViewById(R$id.zui_view_input_box);
        this.inputTextField = (EditText) findViewById(R$id.input_box_input_text);
        this.attachmentsIndicator = (AttachmentsIndicator) findViewById(R$id.input_box_attachments_indicator);
        this.sendButton = (ImageView) findViewById(R$id.input_box_send_btn);
    }

    private void initListeners() {
        this.inputBox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                InputBox.this.inputTextField.requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) InputBox.this.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.toggleSoftInput(2, 1);
                }
            }
        });
        this.attachmentsIndicator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (InputBox.this.attachmentsIndicatorClickListener != null) {
                    InputBox.this.attachmentsIndicatorClickListener.onClick(view);
                }
            }
        });
        this.sendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (InputBox.this.inputTextConsumer != null && InputBox.this.inputTextConsumer.onConsumeText(InputBox.this.inputTextField.getText().toString().trim())) {
                    InputBox.this.attachmentsIndicator.reset();
                    InputBox.this.inputTextField.setText((CharSequence) null);
                }
                for (View.OnClickListener onClick : InputBox.this.sendButtonClickListeners) {
                    onClick.onClick(view);
                }
            }
        });
        this.inputTextField.addTextChangedListener(new ro6() {
            public void afterTextChanged(Editable editable) {
                boolean z;
                boolean b = kb6.m46949b(editable.toString());
                boolean z2 = true;
                if (InputBox.this.attachmentsIndicator.getAttachmentsCount() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                InputBox inputBox = InputBox.this;
                if (!b && !z) {
                    z2 = false;
                }
                inputBox.updateSendBtn(z2);
                if (InputBox.this.inputTextWatcher != null) {
                    InputBox.this.inputTextWatcher.afterTextChanged(editable);
                }
            }
        });
        this.inputTextField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    InputBox.this.inputBox.setBackgroundResource(R$drawable.zui_background_composer_selected);
                } else {
                    InputBox.this.inputBox.setBackgroundResource(R$drawable.zui_background_composer_inactive);
                }
            }
        });
    }

    private void showAttachmentsIndicator(boolean z) {
        if (z) {
            this.attachmentsIndicator.setEnabled(true);
            this.attachmentsIndicator.setVisibility(0);
            updateInputFieldPosition(true);
            return;
        }
        this.attachmentsIndicator.setEnabled(false);
        this.attachmentsIndicator.setVisibility(8);
        updateInputFieldPosition(false);
    }

    private void updateInputFieldPosition(boolean z) {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.zui_input_box_expanded_side_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.zui_input_box_collapsed_side_margin);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.inputTextField.getLayoutParams();
        if (z) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        layoutParams.leftMargin = dimensionPixelSize;
        this.inputTextField.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    public void updateSendBtn(boolean z) {
        int i;
        Context context = getContext();
        if (z) {
            i = k37.m75281e(R$attr.colorPrimary, context, R$color.zui_color_primary);
        } else {
            i = k37.m75278b(R$color.zui_color_disabled, context);
        }
        this.sendButton.setEnabled(z);
        k37.m75279c(i, this.sendButton.getDrawable(), this.sendButton);
    }

    private void viewInit(Context context) {
        View.inflate(context, R$layout.zui_view_input_box, this);
        if (!isInEditMode()) {
            bindViews();
            initListeners();
            showAttachmentsIndicator(false);
            updateSendBtn(false);
        }
    }

    public boolean addSendButtonClickListener(View.OnClickListener onClickListener) {
        return this.sendButtonClickListeners.add(onClickListener);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            this.inputTextField.clearFocus();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean requestFocus(int i, Rect rect) {
        return this.inputTextField.requestFocus();
    }

    public void setAttachmentsCount(int i) {
        boolean z;
        this.attachmentsIndicator.setAttachmentsCount(i);
        boolean b = kb6.m46949b(this.inputTextField.getText().toString());
        boolean z2 = true;
        if (this.attachmentsIndicator.getAttachmentsCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!b && !z) {
            z2 = false;
        }
        updateSendBtn(z2);
    }

    public void setAttachmentsIndicatorClickListener(View.OnClickListener onClickListener) {
        boolean z;
        this.attachmentsIndicatorClickListener = onClickListener;
        if (onClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        showAttachmentsIndicator(z);
    }

    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        this.inputTextField.setEnabled(z);
        if (!z) {
            this.inputTextField.clearFocus();
        }
        this.inputBox.setEnabled(z);
        ImageView imageView = this.sendButton;
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.2f;
        }
        imageView.setAlpha(f);
        AttachmentsIndicator attachmentsIndicator2 = this.attachmentsIndicator;
        if (!z) {
            f2 = 0.2f;
        }
        attachmentsIndicator2.setAlpha(f2);
    }

    public void setHint(String str) {
        this.inputTextField.setHint(str);
    }

    public void setInputTextConsumer(InputTextConsumer inputTextConsumer2) {
        this.inputTextConsumer = inputTextConsumer2;
    }

    public void setInputTextWatcher(TextWatcher textWatcher) {
        this.inputTextWatcher = textWatcher;
    }

    public void setInputType(Integer num) {
        this.inputTextField.setInputType(num.intValue());
    }

    public InputBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit(context);
    }

    public InputBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit(context);
    }
}
