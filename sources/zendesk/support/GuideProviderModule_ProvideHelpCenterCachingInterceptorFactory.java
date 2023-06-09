package zendesk.support;

public final class GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory implements ry1<HelpCenterCachingInterceptor> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory INSTANCE = new GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory();

        private InstanceHolder() {
        }
    }

    public static GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor() {
        return (HelpCenterCachingInterceptor) fu4.m44415f(GuideProviderModule.provideHelpCenterCachingInterceptor());
    }

    public HelpCenterCachingInterceptor get() {
        return provideHelpCenterCachingInterceptor();
    }
}
