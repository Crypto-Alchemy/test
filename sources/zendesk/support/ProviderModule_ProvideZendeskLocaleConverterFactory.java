package zendesk.support;

import zendesk.core.ZendeskLocaleConverter;

public final class ProviderModule_ProvideZendeskLocaleConverterFactory implements ry1<ZendeskLocaleConverter> {
    private final ProviderModule module;

    public ProviderModule_ProvideZendeskLocaleConverterFactory(ProviderModule providerModule) {
        this.module = providerModule;
    }

    public static ProviderModule_ProvideZendeskLocaleConverterFactory create(ProviderModule providerModule) {
        return new ProviderModule_ProvideZendeskLocaleConverterFactory(providerModule);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter(ProviderModule providerModule) {
        return (ZendeskLocaleConverter) fu4.m44415f(providerModule.provideZendeskLocaleConverter());
    }

    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter(this.module);
    }
}
