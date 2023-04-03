package zendesk.support.request;

public final class RequestModule_ProvidesAsyncMiddlewareFactory implements ry1<AsyncMiddleware> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final RequestModule_ProvidesAsyncMiddlewareFactory INSTANCE = new RequestModule_ProvidesAsyncMiddlewareFactory();

        private InstanceHolder() {
        }
    }

    public static RequestModule_ProvidesAsyncMiddlewareFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AsyncMiddleware providesAsyncMiddleware() {
        return (AsyncMiddleware) fu4.m44415f(RequestModule.providesAsyncMiddleware());
    }

    public AsyncMiddleware get() {
        return providesAsyncMiddleware();
    }
}
