package zendesk.messaging.p026ui;

import zendesk.belvedere.C9800a;
import zendesk.belvedere.C9802b;
import zendesk.messaging.BelvedereMediaHolder;
import zendesk.messaging.BelvedereMediaResolverCallback;
import zendesk.messaging.EventFactory;
import zendesk.messaging.EventListener;

/* renamed from: zendesk.messaging.ui.InputBoxConsumer_Factory */
public final class InputBoxConsumer_Factory implements ry1<InputBoxConsumer> {
    private final ky4<BelvedereMediaHolder> belvedereMediaHolderProvider;
    private final ky4<BelvedereMediaResolverCallback> belvedereMediaResolverCallbackProvider;
    private final ky4<C9800a> belvedereProvider;
    private final ky4<EventFactory> eventFactoryProvider;
    private final ky4<EventListener> eventListenerProvider;
    private final ky4<C9802b> imageStreamProvider;

    public InputBoxConsumer_Factory(ky4<EventListener> ky4, ky4<EventFactory> ky42, ky4<C9802b> ky43, ky4<C9800a> ky44, ky4<BelvedereMediaHolder> ky45, ky4<BelvedereMediaResolverCallback> ky46) {
        this.eventListenerProvider = ky4;
        this.eventFactoryProvider = ky42;
        this.imageStreamProvider = ky43;
        this.belvedereProvider = ky44;
        this.belvedereMediaHolderProvider = ky45;
        this.belvedereMediaResolverCallbackProvider = ky46;
    }

    public static InputBoxConsumer_Factory create(ky4<EventListener> ky4, ky4<EventFactory> ky42, ky4<C9802b> ky43, ky4<C9800a> ky44, ky4<BelvedereMediaHolder> ky45, ky4<BelvedereMediaResolverCallback> ky46) {
        return new InputBoxConsumer_Factory(ky4, ky42, ky43, ky44, ky45, ky46);
    }

    public static InputBoxConsumer newInstance(EventListener eventListener, EventFactory eventFactory, C9802b bVar, C9800a aVar, BelvedereMediaHolder belvedereMediaHolder, BelvedereMediaResolverCallback belvedereMediaResolverCallback) {
        return new InputBoxConsumer(eventListener, eventFactory, bVar, aVar, belvedereMediaHolder, belvedereMediaResolverCallback);
    }

    public InputBoxConsumer get() {
        return newInstance(this.eventListenerProvider.get(), this.eventFactoryProvider.get(), this.imageStreamProvider.get(), this.belvedereProvider.get(), this.belvedereMediaHolderProvider.get(), this.belvedereMediaResolverCallbackProvider.get());
    }
}
