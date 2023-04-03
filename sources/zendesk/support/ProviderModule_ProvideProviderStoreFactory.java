package zendesk.support;

public final class ProviderModule_ProvideProviderStoreFactory implements ry1<ProviderStore> {
    private final ky4<HelpCenterProvider> helpCenterProvider;
    private final ProviderModule module;
    private final ky4<RequestProvider> requestProvider;
    private final ky4<UploadProvider> uploadProvider;

    public ProviderModule_ProvideProviderStoreFactory(ProviderModule providerModule, ky4<HelpCenterProvider> ky4, ky4<RequestProvider> ky42, ky4<UploadProvider> ky43) {
        this.module = providerModule;
        this.helpCenterProvider = ky4;
        this.requestProvider = ky42;
        this.uploadProvider = ky43;
    }

    public static ProviderModule_ProvideProviderStoreFactory create(ProviderModule providerModule, ky4<HelpCenterProvider> ky4, ky4<RequestProvider> ky42, ky4<UploadProvider> ky43) {
        return new ProviderModule_ProvideProviderStoreFactory(providerModule, ky4, ky42, ky43);
    }

    public static ProviderStore provideProviderStore(ProviderModule providerModule, HelpCenterProvider helpCenterProvider2, RequestProvider requestProvider2, UploadProvider uploadProvider2) {
        return (ProviderStore) fu4.m44415f(providerModule.provideProviderStore(helpCenterProvider2, requestProvider2, uploadProvider2));
    }

    public ProviderStore get() {
        return provideProviderStore(this.module, this.helpCenterProvider.get(), this.requestProvider.get(), this.uploadProvider.get());
    }
}
