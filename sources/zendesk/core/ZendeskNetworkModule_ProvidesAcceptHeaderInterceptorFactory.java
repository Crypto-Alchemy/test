package zendesk.core;

public final class ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory implements ry1<AcceptHeaderInterceptor> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory INSTANCE = new ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        return (AcceptHeaderInterceptor) fu4.m44415f(ZendeskNetworkModule.providesAcceptHeaderInterceptor());
    }

    public AcceptHeaderInterceptor get() {
        return providesAcceptHeaderInterceptor();
    }
}
