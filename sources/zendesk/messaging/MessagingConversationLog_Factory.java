package zendesk.messaging;

public final class MessagingConversationLog_Factory implements ry1<MessagingConversationLog> {
    private final ky4<MessagingEventSerializer> messagingEventSerializerProvider;

    public MessagingConversationLog_Factory(ky4<MessagingEventSerializer> ky4) {
        this.messagingEventSerializerProvider = ky4;
    }

    public static MessagingConversationLog_Factory create(ky4<MessagingEventSerializer> ky4) {
        return new MessagingConversationLog_Factory(ky4);
    }

    public static MessagingConversationLog newInstance(Object obj) {
        return new MessagingConversationLog((MessagingEventSerializer) obj);
    }

    public MessagingConversationLog get() {
        return newInstance(this.messagingEventSerializerProvider.get());
    }
}
