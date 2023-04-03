package zendesk.support;

import java.util.Locale;

public final class GuideProviderModule_ProvideDeviceLocaleFactory implements ry1<Locale> {
    private final GuideProviderModule module;

    public GuideProviderModule_ProvideDeviceLocaleFactory(GuideProviderModule guideProviderModule) {
        this.module = guideProviderModule;
    }

    public static GuideProviderModule_ProvideDeviceLocaleFactory create(GuideProviderModule guideProviderModule) {
        return new GuideProviderModule_ProvideDeviceLocaleFactory(guideProviderModule);
    }

    public static Locale provideDeviceLocale(GuideProviderModule guideProviderModule) {
        return (Locale) fu4.m44415f(guideProviderModule.provideDeviceLocale());
    }

    public Locale get() {
        return provideDeviceLocale(this.module);
    }
}
