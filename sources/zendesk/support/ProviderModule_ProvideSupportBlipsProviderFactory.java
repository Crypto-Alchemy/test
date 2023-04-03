package zendesk.support;

import zendesk.core.BlipsProvider;

public final class ProviderModule_ProvideSupportBlipsProviderFactory implements ry1<SupportBlipsProvider> {
    private final ky4<BlipsProvider> blipsProvider;
    private final ProviderModule module;

    public ProviderModule_ProvideSupportBlipsProviderFactory(ProviderModule providerModule, ky4<BlipsProvider> ky4) {
        this.module = providerModule;
        this.blipsProvider = ky4;
    }

    public static ProviderModule_ProvideSupportBlipsProviderFactory create(ProviderModule providerModule, ky4<BlipsProvider> ky4) {
        return new ProviderModule_ProvideSupportBlipsProviderFactory(providerModule, ky4);
    }

    public static SupportBlipsProvider provideSupportBlipsProvider(ProviderModule providerModule, BlipsProvider blipsProvider2) {
        return (SupportBlipsProvider) fu4.m44415f(providerModule.provideSupportBlipsProvider(blipsProvider2));
    }

    public SupportBlipsProvider get() {
        return provideSupportBlipsProvider(this.module, this.blipsProvider.get());
    }
}
