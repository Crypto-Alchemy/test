package zendesk.support;

import zendesk.core.ZendeskLocaleConverter;

public final class GuideProviderModule_ProvideZendeskLocaleConverterFactory implements ry1<ZendeskLocaleConverter> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final GuideProviderModule_ProvideZendeskLocaleConverterFactory INSTANCE = new GuideProviderModule_ProvideZendeskLocaleConverterFactory();

        private InstanceHolder() {
        }
    }

    public static GuideProviderModule_ProvideZendeskLocaleConverterFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter() {
        return (ZendeskLocaleConverter) fu4.m44415f(GuideProviderModule.provideZendeskLocaleConverter());
    }

    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter();
    }
}
