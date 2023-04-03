package zendesk.support.request;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.C9802b;
import zendesk.belvedere.MediaResult;
import zendesk.support.RequestStatus;
import zendesk.support.UiUtils;
import zendesk.support.request.ViewMessageComposer;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

class ComponentMessageComposer implements Listener<MessageComposerModel>, ViewMessageComposer.InputListener, C9802b.C9804b {
    private final ActionFactory actionFactory;
    private final AppCompatActivity activity;
    private final AttachmentHelper attachmentHelper = new AttachmentHelper(l35.attachments_indicator_icon, l35.message_composer_send_btn);
    private final Dispatcher dispatcher;
    private final C9802b imageStream;
    /* access modifiers changed from: private */
    public final ViewMessageComposer messageComposerView;
    private final MessageComposerSelector messageFieldSelector = new MessageComposerSelector();

    public static class MessageComposerModel {
        private final boolean attachmentsButtonEnabled;
        private final List<StateRequestAttachment> extraAttachments;
        private final long maxFileSize;
        private final boolean messageComposerVisible;
        private final List<StateRequestAttachment> requestAttachments;
        private final boolean sendButtonEnabled;

        public MessageComposerModel(List<StateRequestAttachment> list, List<StateRequestAttachment> list2, long j, boolean z, boolean z2, boolean z3) {
            this.requestAttachments = list;
            this.extraAttachments = list2;
            this.maxFileSize = j;
            this.sendButtonEnabled = z;
            this.attachmentsButtonEnabled = z2;
            this.messageComposerVisible = z3;
        }

        public List<StateRequestAttachment> getExtraAttachments() {
            return this.extraAttachments;
        }

        public long getMaxFileSize() {
            return this.maxFileSize;
        }

        public List<StateRequestAttachment> getRequestAttachments() {
            return this.requestAttachments;
        }

        public boolean isAttachmentsButtonEnabled() {
            return this.attachmentsButtonEnabled;
        }

        public boolean isMessageComposerVisible() {
            return this.messageComposerVisible;
        }

        public boolean isSendButtonEnabled() {
            return this.sendButtonEnabled;
        }
    }

    public static class MessageComposerSelector implements StateSelector<MessageComposerModel> {
        public MessageComposerModel selectData(State state) {
            StateAttachments fromState = StateAttachments.fromState(state);
            StateConfig fromState2 = StateConfig.fromState(state);
            StateConversation fromState3 = StateConversation.fromState(state);
            ArrayList arrayList = new ArrayList(fromState.getAllSelectedAttachments());
            return new MessageComposerModel(kj0.m47112c(fromState.getSelectedAttachments()), arrayList, fromState2.getSettings().getMaxAttachmentSize(), kb6.m46949b(fromState3.getRemoteId()), fromState2.getSettings().isAttachmentsEnabled(), fromState3.getStatus() != RequestStatus.Closed);
        }
    }

    public ComponentMessageComposer(AppCompatActivity appCompatActivity, C9802b bVar, ViewMessageComposer viewMessageComposer, Dispatcher dispatcher2, ActionFactory actionFactory2) {
        this.activity = appCompatActivity;
        this.messageComposerView = viewMessageComposer;
        this.dispatcher = dispatcher2;
        this.actionFactory = actionFactory2;
        this.imageStream = bVar;
        viewMessageComposer.addListener(this);
        initImagePicker();
    }

    private void initImagePicker() {
        this.imageStream.mo73731i(this);
        if (this.imageStream.mo73734l().getInputTrap().hasFocus()) {
            this.messageComposerView.requestFocusForInput();
        }
        if (this.imageStream.mo73745w()) {
            this.messageComposerView.post(new Runnable() {
                public void run() {
                    ComponentMessageComposer.this.onAddAttachmentsRequested();
                }
            });
        }
    }

    public StateSelector<MessageComposerModel> getSelector() {
        return this.messageFieldSelector;
    }

    public boolean hasUnsavedInput() {
        if (kb6.m46949b(this.messageComposerView.getMessage()) || kj0.m47118i(this.attachmentHelper.getSelectedAttachments())) {
            return true;
        }
        return false;
    }

    public void onAddAttachmentsRequested() {
        if (!this.imageStream.mo73736n()) {
            this.attachmentHelper.showImagePicker(this.activity);
        } else {
            this.imageStream.mo73733k();
        }
    }

    public void onDismissed() {
        this.messageComposerView.requestFocusForInput();
    }

    public void onMediaDeselected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.deselectAttachment(list));
        if (!this.imageStream.mo73736n()) {
            onAddAttachmentsRequested();
        }
    }

    public void onMediaSelected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.selectAttachment(list));
        if (!this.imageStream.mo73736n()) {
            onAddAttachmentsRequested();
        }
    }

    public void onSendMessageRequested(String str) {
        if (this.imageStream.mo73736n()) {
            this.imageStream.mo73733k();
        }
        this.dispatcher.dispatch(this.actionFactory.createCommentAsync(str, this.attachmentHelper.getSelectedAttachments()));
        this.dispatcher.dispatch(this.actionFactory.clearAttachments());
        this.dispatcher.dispatch(this.actionFactory.updateCommentsAsync());
    }

    public void onVisible() {
        this.messageComposerView.post(new Runnable() {
            public void run() {
                ComponentMessageComposer.this.messageComposerView.triggerStateUpdate();
            }
        });
    }

    public void update(MessageComposerModel messageComposerModel) {
        this.attachmentHelper.updateMaxFileSize(messageComposerModel.getMaxFileSize());
        this.attachmentHelper.updateAttachments(messageComposerModel.getRequestAttachments(), messageComposerModel.getExtraAttachments());
        this.messageComposerView.setAttachmentsCount(messageComposerModel.getRequestAttachments().size());
        this.messageComposerView.enableSendButton(messageComposerModel.isSendButtonEnabled());
        this.messageComposerView.enableAttachmentsButton(messageComposerModel.isAttachmentsButtonEnabled());
        this.messageComposerView.hide(!messageComposerModel.isMessageComposerVisible());
        if (!messageComposerModel.isMessageComposerVisible()) {
            UiUtils.dismissKeyboard((View) this.messageComposerView);
        }
    }
}
