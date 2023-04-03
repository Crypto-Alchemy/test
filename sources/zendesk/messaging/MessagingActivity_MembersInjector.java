package zendesk.messaging;

import com.squareup.picasso.Picasso;
import zendesk.messaging.p026ui.MessagingCellFactory;
import zendesk.messaging.p026ui.MessagingComposer;

public final class MessagingActivity_MembersInjector implements ts3<MessagingActivity> {
    public static void injectEventFactory(MessagingActivity messagingActivity, EventFactory eventFactory) {
        messagingActivity.eventFactory = eventFactory;
    }

    public static void injectMessagingCellFactory(MessagingActivity messagingActivity, MessagingCellFactory messagingCellFactory) {
        messagingActivity.messagingCellFactory = messagingCellFactory;
    }

    public static void injectMessagingComposer(MessagingActivity messagingActivity, MessagingComposer messagingComposer) {
        messagingActivity.messagingComposer = messagingComposer;
    }

    public static void injectMessagingDialog(MessagingActivity messagingActivity, Object obj) {
        messagingActivity.messagingDialog = (MessagingDialog) obj;
    }

    public static void injectPicasso(MessagingActivity messagingActivity, Picasso picasso) {
        messagingActivity.picasso = picasso;
    }

    public static void injectViewModel(MessagingActivity messagingActivity, MessagingViewModel messagingViewModel) {
        messagingActivity.viewModel = messagingViewModel;
    }
}
