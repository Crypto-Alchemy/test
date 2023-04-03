package zendesk.messaging;

public final class MessagingActivityModule_MultilineResponseOptionsEnabledFactory implements ry1<Boolean> {
    private final ky4<MessagingComponent> messagingComponentProvider;

    public MessagingActivityModule_MultilineResponseOptionsEnabledFactory(ky4<MessagingComponent> ky4) {
        this.messagingComponentProvider = ky4;
    }

    public static MessagingActivityModule_MultilineResponseOptionsEnabledFactory create(ky4<MessagingComponent> ky4) {
        return new MessagingActivityModule_MultilineResponseOptionsEnabledFactory(ky4);
    }

    public static boolean multilineResponseOptionsEnabled(Object obj) {
        return MessagingActivityModule.multilineResponseOptionsEnabled((MessagingComponent) obj);
    }

    public Boolean get() {
        return Boolean.valueOf(multilineResponseOptionsEnabled(this.messagingComponentProvider.get()));
    }
}
