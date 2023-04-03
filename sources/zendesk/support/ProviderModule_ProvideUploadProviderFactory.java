package zendesk.support;

public final class ProviderModule_ProvideUploadProviderFactory implements ry1<UploadProvider> {
    private final ProviderModule module;
    private final ky4<ZendeskUploadService> uploadServiceProvider;

    public ProviderModule_ProvideUploadProviderFactory(ProviderModule providerModule, ky4<ZendeskUploadService> ky4) {
        this.module = providerModule;
        this.uploadServiceProvider = ky4;
    }

    public static ProviderModule_ProvideUploadProviderFactory create(ProviderModule providerModule, ky4<ZendeskUploadService> ky4) {
        return new ProviderModule_ProvideUploadProviderFactory(providerModule, ky4);
    }

    public static UploadProvider provideUploadProvider(ProviderModule providerModule, Object obj) {
        return (UploadProvider) fu4.m44415f(providerModule.provideUploadProvider((ZendeskUploadService) obj));
    }

    public UploadProvider get() {
        return provideUploadProvider(this.module, this.uploadServiceProvider.get());
    }
}
