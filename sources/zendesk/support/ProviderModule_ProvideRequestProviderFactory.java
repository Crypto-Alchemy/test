package zendesk.support;

import zendesk.core.AuthenticationProvider;

public final class ProviderModule_ProvideRequestProviderFactory implements ry1<RequestProvider> {
    private final ky4<AuthenticationProvider> authenticationProvider;
    private final ky4<SupportBlipsProvider> blipsProvider;
    private final ProviderModule module;
    private final ky4<ZendeskRequestService> requestServiceProvider;
    private final ky4<RequestSessionCache> requestSessionCacheProvider;
    private final ky4<RequestStorage> requestStorageProvider;
    private final ky4<SupportSettingsProvider> settingsProvider;
    private final ky4<SupportSdkMetadata> supportSdkMetadataProvider;
    private final ky4<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideRequestProviderFactory(ProviderModule providerModule, ky4<SupportSettingsProvider> ky4, ky4<AuthenticationProvider> ky42, ky4<ZendeskRequestService> ky43, ky4<RequestStorage> ky44, ky4<RequestSessionCache> ky45, ky4<ZendeskTracker> ky46, ky4<SupportSdkMetadata> ky47, ky4<SupportBlipsProvider> ky48) {
        this.module = providerModule;
        this.settingsProvider = ky4;
        this.authenticationProvider = ky42;
        this.requestServiceProvider = ky43;
        this.requestStorageProvider = ky44;
        this.requestSessionCacheProvider = ky45;
        this.zendeskTrackerProvider = ky46;
        this.supportSdkMetadataProvider = ky47;
        this.blipsProvider = ky48;
    }

    public static ProviderModule_ProvideRequestProviderFactory create(ProviderModule providerModule, ky4<SupportSettingsProvider> ky4, ky4<AuthenticationProvider> ky42, ky4<ZendeskRequestService> ky43, ky4<RequestStorage> ky44, ky4<RequestSessionCache> ky45, ky4<ZendeskTracker> ky46, ky4<SupportSdkMetadata> ky47, ky4<SupportBlipsProvider> ky48) {
        return new ProviderModule_ProvideRequestProviderFactory(providerModule, ky4, ky42, ky43, ky44, ky45, ky46, ky47, ky48);
    }

    public static RequestProvider provideRequestProvider(ProviderModule providerModule, SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, SupportBlipsProvider supportBlipsProvider) {
        return (RequestProvider) fu4.m44415f(providerModule.provideRequestProvider(supportSettingsProvider, authenticationProvider2, (ZendeskRequestService) obj, (RequestStorage) obj2, (RequestSessionCache) obj3, (ZendeskTracker) obj4, (SupportSdkMetadata) obj5, supportBlipsProvider));
    }

    public RequestProvider get() {
        return provideRequestProvider(this.module, this.settingsProvider.get(), this.authenticationProvider.get(), this.requestServiceProvider.get(), this.requestStorageProvider.get(), this.requestSessionCacheProvider.get(), this.zendeskTrackerProvider.get(), this.supportSdkMetadataProvider.get(), this.blipsProvider.get());
    }
}
