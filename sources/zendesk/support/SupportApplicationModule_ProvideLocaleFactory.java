package zendesk.support;

import java.util.Locale;

public final class SupportApplicationModule_ProvideLocaleFactory implements ry1<Locale> {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideLocaleFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static SupportApplicationModule_ProvideLocaleFactory create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvideLocaleFactory(supportApplicationModule);
    }

    public static Locale provideLocale(SupportApplicationModule supportApplicationModule) {
        return (Locale) fu4.m44415f(supportApplicationModule.provideLocale());
    }

    public Locale get() {
        return provideLocale(this.module);
    }
}
