package zendesk.messaging;

import android.os.Handler;

public final class TypingEventDispatcher_Factory implements ry1<TypingEventDispatcher> {
    private final ky4<EventFactory> eventFactoryProvider;
    private final ky4<EventListener> eventListenerProvider;
    private final ky4<Handler> handlerProvider;

    public TypingEventDispatcher_Factory(ky4<EventListener> ky4, ky4<Handler> ky42, ky4<EventFactory> ky43) {
        this.eventListenerProvider = ky4;
        this.handlerProvider = ky42;
        this.eventFactoryProvider = ky43;
    }

    public static TypingEventDispatcher_Factory create(ky4<EventListener> ky4, ky4<Handler> ky42, ky4<EventFactory> ky43) {
        return new TypingEventDispatcher_Factory(ky4, ky42, ky43);
    }

    public static TypingEventDispatcher newInstance(EventListener eventListener, Handler handler, EventFactory eventFactory) {
        return new TypingEventDispatcher(eventListener, handler, eventFactory);
    }

    public TypingEventDispatcher get() {
        return newInstance(this.eventListenerProvider.get(), this.handlerProvider.get(), this.eventFactoryProvider.get());
    }
}
