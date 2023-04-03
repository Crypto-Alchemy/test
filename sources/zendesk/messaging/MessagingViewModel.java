package zendesk.messaging;

import androidx.lifecycle.LiveData;
import java.util.List;
import zendesk.messaging.Update;
import zendesk.messaging.p026ui.MessagingState;

public class MessagingViewModel extends ad7 implements EventListener {
    /* access modifiers changed from: private */
    public final ls3<Banner> liveBannersState;
    private final ls3<DialogContent> liveDialogState = new ls3<>();
    /* access modifiers changed from: private */
    public final ls3<MessagingState> liveMessagingState;
    private final LiveData<Update.Action.Navigation> liveNavigationStream;
    private final MessagingModel messagingModel;

    public MessagingViewModel(MessagingModel messagingModel2) {
        this.messagingModel = messagingModel2;
        ls3<MessagingState> ls3 = new ls3<>();
        this.liveMessagingState = ls3;
        this.liveNavigationStream = messagingModel2.getLiveNavigationUpdates();
        ls3.setValue(new MessagingState.Builder().withEnabled(true).build());
        ls3<Banner> ls32 = new ls3<>();
        this.liveBannersState = ls32;
        ls3.mo22951a(messagingModel2.getLiveMessagingItems(), new pf4<List<MessagingItem>>() {
            public void onChanged(List<MessagingItem> list) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withMessagingItems(list).build());
            }
        });
        ls3.mo22951a(messagingModel2.getLiveComposerEnabled(), new pf4<Boolean>() {
            public void onChanged(Boolean bool) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withEnabled(bool.booleanValue()).build());
            }
        });
        ls3.mo22951a(messagingModel2.getLiveTyping(), new pf4<Typing>() {
            public void onChanged(Typing typing) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withTypingIndicatorState(new MessagingState.TypingState(typing.isTyping(), typing.getAgentDetails())).build());
            }
        });
        ls3.mo22951a(messagingModel2.getLiveConnection(), new pf4<ConnectionState>() {
            public void onChanged(ConnectionState connectionState) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withConnectionState(connectionState).build());
            }
        });
        ls3.mo22951a(messagingModel2.getLiveComposerHint(), new pf4<String>() {
            public void onChanged(String str) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withComposerHint(str).build());
            }
        });
        ls3.mo22951a(messagingModel2.getLiveKeyboardInputType(), new pf4<Integer>() {
            public void onChanged(Integer num) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withKeyboardInputType(num.intValue()).build());
            }
        });
        ls3.mo22951a(messagingModel2.getLiveAttachmentSettings(), new pf4<AttachmentSettings>() {
            public void onChanged(AttachmentSettings attachmentSettings) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withAttachmentSettings(attachmentSettings).build());
            }
        });
        ls32.mo22951a(messagingModel2.getLiveInterfaceUpdates(), new pf4<Banner>() {
            public void onChanged(Banner banner) {
                MessagingViewModel.this.liveBannersState.setValue(banner);
            }
        });
    }

    public SingleLiveEvent<DialogContent> getDialogUpdates() {
        return this.messagingModel.getLiveDialogUpdates();
    }

    public SingleLiveEvent<Banner> getLiveInterfaceUpdateItems() {
        return this.messagingModel.getLiveInterfaceUpdates();
    }

    public LiveData<List<MenuItem>> getLiveMenuItems() {
        return this.messagingModel.getLiveMenuItems();
    }

    public LiveData<MessagingState> getLiveMessagingState() {
        return this.liveMessagingState;
    }

    public LiveData<Update.Action.Navigation> getLiveNavigationStream() {
        return this.liveNavigationStream;
    }

    public void onCleared() {
        this.messagingModel.stop();
    }

    public void onEvent(Event event) {
        this.messagingModel.onEvent(event);
    }

    public void start() {
        this.messagingModel.start();
    }
}
