package zendesk.core;

public final class ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory implements ry1<ZendeskLocaleConverter> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(zendeskApplicationModule);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter(ZendeskApplicationModule zendeskApplicationModule) {
        return (ZendeskLocaleConverter) fu4.m44415f(zendeskApplicationModule.provideZendeskLocaleConverter());
    }

    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter(this.module);
    }
}
