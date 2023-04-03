package zendesk.core;

public final class ZendeskProvidersModule_ProviderBlipsProviderFactory implements ry1<BlipsProvider> {
    private final ky4<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsProviderFactory(ky4<ZendeskBlipsProvider> ky4) {
        this.zendeskBlipsProvider = ky4;
    }

    public static ZendeskProvidersModule_ProviderBlipsProviderFactory create(ky4<ZendeskBlipsProvider> ky4) {
        return new ZendeskProvidersModule_ProviderBlipsProviderFactory(ky4);
    }

    public static BlipsProvider providerBlipsProvider(Object obj) {
        return (BlipsProvider) fu4.m44415f(ZendeskProvidersModule.providerBlipsProvider((ZendeskBlipsProvider) obj));
    }

    public BlipsProvider get() {
        return providerBlipsProvider(this.zendeskBlipsProvider.get());
    }
}
