package zendesk.core;

public final class ZendeskApplicationModule_ProvideApplicationConfigurationFactory implements ry1<ApplicationConfiguration> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationConfigurationFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationConfigurationFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationConfigurationFactory(zendeskApplicationModule);
    }

    public static ApplicationConfiguration provideApplicationConfiguration(ZendeskApplicationModule zendeskApplicationModule) {
        return (ApplicationConfiguration) fu4.m44415f(zendeskApplicationModule.provideApplicationConfiguration());
    }

    public ApplicationConfiguration get() {
        return provideApplicationConfiguration(this.module);
    }
}
