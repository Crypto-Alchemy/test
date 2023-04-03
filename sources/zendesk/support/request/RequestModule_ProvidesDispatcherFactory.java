package zendesk.support.request;

import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Store;

public final class RequestModule_ProvidesDispatcherFactory implements ry1<Dispatcher> {
    private final ky4<Store> storeProvider;

    public RequestModule_ProvidesDispatcherFactory(ky4<Store> ky4) {
        this.storeProvider = ky4;
    }

    public static RequestModule_ProvidesDispatcherFactory create(ky4<Store> ky4) {
        return new RequestModule_ProvidesDispatcherFactory(ky4);
    }

    public static Dispatcher providesDispatcher(Store store) {
        return (Dispatcher) fu4.m44415f(RequestModule.providesDispatcher(store));
    }

    public Dispatcher get() {
        return providesDispatcher(this.storeProvider.get());
    }
}
