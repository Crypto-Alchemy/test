package zendesk.messaging;

import zendesk.messaging.components.DateProvider;

public final class EventFactory_Factory implements ry1<EventFactory> {
    private final ky4<DateProvider> dateProvider;

    public EventFactory_Factory(ky4<DateProvider> ky4) {
        this.dateProvider = ky4;
    }

    public static EventFactory_Factory create(ky4<DateProvider> ky4) {
        return new EventFactory_Factory(ky4);
    }

    public static EventFactory newInstance(DateProvider dateProvider2) {
        return new EventFactory(dateProvider2);
    }

    public EventFactory get() {
        return newInstance(this.dateProvider.get());
    }
}
