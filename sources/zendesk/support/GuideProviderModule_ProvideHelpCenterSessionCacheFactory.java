package zendesk.support;

public final class GuideProviderModule_ProvideHelpCenterSessionCacheFactory implements ry1<HelpCenterSessionCache> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final GuideProviderModule_ProvideHelpCenterSessionCacheFactory INSTANCE = new GuideProviderModule_ProvideHelpCenterSessionCacheFactory();

        private InstanceHolder() {
        }
    }

    public static GuideProviderModule_ProvideHelpCenterSessionCacheFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HelpCenterSessionCache provideHelpCenterSessionCache() {
        return (HelpCenterSessionCache) fu4.m44415f(GuideProviderModule.provideHelpCenterSessionCache());
    }

    public HelpCenterSessionCache get() {
        return provideHelpCenterSessionCache();
    }
}
