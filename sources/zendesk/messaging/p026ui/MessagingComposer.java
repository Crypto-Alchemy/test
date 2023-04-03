package zendesk.messaging.p026ui;

import android.text.Editable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import zendesk.belvedere.C9802b;
import zendesk.belvedere.MediaResult;
import zendesk.messaging.AttachmentSettings;
import zendesk.messaging.BelvedereMediaHolder;
import zendesk.messaging.MessagingViewModel;
import zendesk.messaging.R$string;
import zendesk.messaging.TypingEventDispatcher;

/* renamed from: zendesk.messaging.ui.MessagingComposer */
public class MessagingComposer {
    public static final int DEFAULT_HINT = R$string.zui_hint_type_message;
    private final AppCompatActivity activity;
    private final BelvedereMediaHolder belvedereMediaHolder;
    private BelvedereMediaPickerListener belvedereMediaPickerListener;
    private final C9802b imageStream;
    private final InputBoxAttachmentClickListener inputBoxAttachmentClickListener;
    private final InputBoxConsumer inputBoxConsumer;
    /* access modifiers changed from: private */
    public final TypingEventDispatcher typingEventDispatcher;
    private final MessagingViewModel viewModel;

    /* renamed from: zendesk.messaging.ui.MessagingComposer$BelvedereMediaPickerListener */
    public static final class BelvedereMediaPickerListener implements C9802b.C9804b {
        private final BelvedereMediaHolder belvedereMediaHolder;
        private final C9802b imageStream;
        private final InputBox inputBox;

        public BelvedereMediaPickerListener(BelvedereMediaHolder belvedereMediaHolder2, InputBox inputBox2, C9802b bVar) {
            this.belvedereMediaHolder = belvedereMediaHolder2;
            this.inputBox = inputBox2;
            this.imageStream = bVar;
        }

        public void onDismissed() {
            if (this.imageStream.mo73734l().getInputTrap().hasFocus()) {
                this.inputBox.requestFocus();
            }
        }

        public void onMediaDeselected(List<MediaResult> list) {
            this.belvedereMediaHolder.removeAll(list);
            this.inputBox.setAttachmentsCount(this.belvedereMediaHolder.getSelectedMediaCount());
        }

        public void onMediaSelected(List<MediaResult> list) {
            this.belvedereMediaHolder.addAll(list);
            this.inputBox.setAttachmentsCount(this.belvedereMediaHolder.getSelectedMediaCount());
        }

        public void onVisible() {
        }
    }

    public MessagingComposer(AppCompatActivity appCompatActivity, MessagingViewModel messagingViewModel, C9802b bVar, BelvedereMediaHolder belvedereMediaHolder2, InputBoxConsumer inputBoxConsumer2, InputBoxAttachmentClickListener inputBoxAttachmentClickListener2, TypingEventDispatcher typingEventDispatcher2) {
        this.activity = appCompatActivity;
        this.viewModel = messagingViewModel;
        this.imageStream = bVar;
        this.belvedereMediaHolder = belvedereMediaHolder2;
        this.inputBoxConsumer = inputBoxConsumer2;
        this.inputBoxAttachmentClickListener = inputBoxAttachmentClickListener2;
        this.typingEventDispatcher = typingEventDispatcher2;
    }

    public void bind(final InputBox inputBox) {
        inputBox.setInputTextConsumer(this.inputBoxConsumer);
        inputBox.setInputTextWatcher(new ro6() {
            public void afterTextChanged(Editable editable) {
                MessagingComposer.this.typingEventDispatcher.onTyping();
            }
        });
        BelvedereMediaPickerListener belvedereMediaPickerListener2 = new BelvedereMediaPickerListener(this.belvedereMediaHolder, inputBox, this.imageStream);
        this.belvedereMediaPickerListener = belvedereMediaPickerListener2;
        this.imageStream.mo73731i(belvedereMediaPickerListener2);
        this.viewModel.getLiveMessagingState().observe(this.activity, new pf4<MessagingState>() {
            public void onChanged(MessagingState messagingState) {
                MessagingComposer.this.renderState(messagingState, inputBox);
            }
        });
    }

    public void renderState(MessagingState messagingState, InputBox inputBox) {
        String str;
        if (messagingState != null) {
            if (kb6.m46949b(messagingState.hint)) {
                str = messagingState.hint;
            } else {
                str = this.activity.getString(DEFAULT_HINT);
            }
            inputBox.setHint(str);
            inputBox.setEnabled(messagingState.enabled);
            inputBox.setInputType(Integer.valueOf(messagingState.keyboardInputType));
            AttachmentSettings attachmentSettings = messagingState.attachmentSettings;
            if (attachmentSettings == null || !attachmentSettings.isSendingEnabled()) {
                inputBox.setAttachmentsIndicatorClickListener((View.OnClickListener) null);
                return;
            }
            inputBox.setAttachmentsIndicatorClickListener(this.inputBoxAttachmentClickListener);
            inputBox.setAttachmentsCount(this.belvedereMediaHolder.getSelectedMediaCount());
        }
    }
}
