package zendesk.core;

public final class ZendeskProvidersModule_ProviderBlipsCoreProviderFactory implements ry1<BlipsCoreProvider> {
    private final ky4<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(ky4<ZendeskBlipsProvider> ky4) {
        this.zendeskBlipsProvider = ky4;
    }

    public static ZendeskProvidersModule_ProviderBlipsCoreProviderFactory create(ky4<ZendeskBlipsProvider> ky4) {
        return new ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(ky4);
    }

    public static BlipsCoreProvider providerBlipsCoreProvider(Object obj) {
        return (BlipsCoreProvider) fu4.m44415f(ZendeskProvidersModule.providerBlipsCoreProvider((ZendeskBlipsProvider) obj));
    }

    public BlipsCoreProvider get() {
        return providerBlipsCoreProvider(this.zendeskBlipsProvider.get());
    }
}
