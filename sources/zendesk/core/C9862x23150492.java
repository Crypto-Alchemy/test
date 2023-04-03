package zendesk.core;

import android.content.Context;

/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory */
public final class C9862x23150492 implements ry1<AcceptLanguageHeaderInterceptor> {
    private final ky4<Context> contextProvider;

    public C9862x23150492(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static C9862x23150492 create(ky4<Context> ky4) {
        return new C9862x23150492(ky4);
    }

    public static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(Context context) {
        return (AcceptLanguageHeaderInterceptor) fu4.m44415f(ZendeskNetworkModule.provideAcceptLanguageHeaderInterceptor(context));
    }

    public AcceptLanguageHeaderInterceptor get() {
        return provideAcceptLanguageHeaderInterceptor(this.contextProvider.get());
    }
}
