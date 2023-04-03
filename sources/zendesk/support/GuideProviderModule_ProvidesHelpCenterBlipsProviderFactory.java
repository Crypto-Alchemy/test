package zendesk.support;

import java.util.Locale;
import zendesk.core.BlipsProvider;

public final class GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory implements ry1<HelpCenterBlipsProvider> {
    private final ky4<BlipsProvider> blipsProvider;
    private final ky4<Locale> localeProvider;
    private final GuideProviderModule module;

    public GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory(GuideProviderModule guideProviderModule, ky4<BlipsProvider> ky4, ky4<Locale> ky42) {
        this.module = guideProviderModule;
        this.blipsProvider = ky4;
        this.localeProvider = ky42;
    }

    public static GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory create(GuideProviderModule guideProviderModule, ky4<BlipsProvider> ky4, ky4<Locale> ky42) {
        return new GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory(guideProviderModule, ky4, ky42);
    }

    public static HelpCenterBlipsProvider providesHelpCenterBlipsProvider(GuideProviderModule guideProviderModule, BlipsProvider blipsProvider2, Locale locale) {
        return (HelpCenterBlipsProvider) fu4.m44415f(guideProviderModule.providesHelpCenterBlipsProvider(blipsProvider2, locale));
    }

    public HelpCenterBlipsProvider get() {
        return providesHelpCenterBlipsProvider(this.module, this.blipsProvider.get(), this.localeProvider.get());
    }
}
