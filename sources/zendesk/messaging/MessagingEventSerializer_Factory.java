package zendesk.messaging;

import android.content.Context;

public final class MessagingEventSerializer_Factory implements ry1<MessagingEventSerializer> {
    private final ky4<Context> contextProvider;
    private final ky4<TimestampFactory> timestampFactoryProvider;

    public MessagingEventSerializer_Factory(ky4<Context> ky4, ky4<TimestampFactory> ky42) {
        this.contextProvider = ky4;
        this.timestampFactoryProvider = ky42;
    }

    public static MessagingEventSerializer_Factory create(ky4<Context> ky4, ky4<TimestampFactory> ky42) {
        return new MessagingEventSerializer_Factory(ky4, ky42);
    }

    public static MessagingEventSerializer newInstance(Context context, Object obj) {
        return new MessagingEventSerializer(context, (TimestampFactory) obj);
    }

    public MessagingEventSerializer get() {
        return newInstance(this.contextProvider.get(), this.timestampFactoryProvider.get());
    }
}
