package zendesk.messaging;

public final class MessagingViewModel_Factory implements ry1<MessagingViewModel> {
    private final ky4<MessagingModel> messagingModelProvider;

    public MessagingViewModel_Factory(ky4<MessagingModel> ky4) {
        this.messagingModelProvider = ky4;
    }

    public static MessagingViewModel_Factory create(ky4<MessagingModel> ky4) {
        return new MessagingViewModel_Factory(ky4);
    }

    public static MessagingViewModel newInstance(Object obj) {
        return new MessagingViewModel((MessagingModel) obj);
    }

    public MessagingViewModel get() {
        return newInstance(this.messagingModelProvider.get());
    }
}
