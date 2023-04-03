package zendesk.core;

import okhttp3.logging.HttpLoggingInterceptor;

public final class ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory implements ry1<HttpLoggingInterceptor> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory INSTANCE = new ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return (HttpLoggingInterceptor) fu4.m44415f(ZendeskApplicationModule.provideHttpLoggingInterceptor());
    }

    public HttpLoggingInterceptor get() {
        return provideHttpLoggingInterceptor();
    }
}
