package zendesk.messaging;

public final class BelvedereMediaResolverCallback_Factory implements ry1<BelvedereMediaResolverCallback> {
    private final ky4<EventFactory> eventFactoryProvider;
    private final ky4<EventListener> eventListenerProvider;

    public BelvedereMediaResolverCallback_Factory(ky4<EventListener> ky4, ky4<EventFactory> ky42) {
        this.eventListenerProvider = ky4;
        this.eventFactoryProvider = ky42;
    }

    public static BelvedereMediaResolverCallback_Factory create(ky4<EventListener> ky4, ky4<EventFactory> ky42) {
        return new BelvedereMediaResolverCallback_Factory(ky4, ky42);
    }

    public static BelvedereMediaResolverCallback newInstance(EventListener eventListener, EventFactory eventFactory) {
        return new BelvedereMediaResolverCallback(eventListener, eventFactory);
    }

    public BelvedereMediaResolverCallback get() {
        return newInstance(this.eventListenerProvider.get(), this.eventFactoryProvider.get());
    }
}
