package zendesk.support.request;

import java.util.List;
import zendesk.support.suas.Reducer;
import zendesk.support.suas.Store;

public final class RequestModule_ProvidesStoreFactory implements ry1<Store> {
    private final ky4<AsyncMiddleware> asyncMiddlewareProvider;
    private final ky4<List<Reducer>> reducersProvider;

    public RequestModule_ProvidesStoreFactory(ky4<List<Reducer>> ky4, ky4<AsyncMiddleware> ky42) {
        this.reducersProvider = ky4;
        this.asyncMiddlewareProvider = ky42;
    }

    public static RequestModule_ProvidesStoreFactory create(ky4<List<Reducer>> ky4, ky4<AsyncMiddleware> ky42) {
        return new RequestModule_ProvidesStoreFactory(ky4, ky42);
    }

    public static Store providesStore(List<Reducer> list, Object obj) {
        return (Store) fu4.m44415f(RequestModule.providesStore(list, (AsyncMiddleware) obj));
    }

    public Store get() {
        return providesStore(this.reducersProvider.get(), this.asyncMiddlewareProvider.get());
    }
}
