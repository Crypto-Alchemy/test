package zendesk.core;

public final class ZendeskProvidersModule_ProvideProviderStoreFactory implements ry1<ProviderStore> {
    private final ky4<PushRegistrationProvider> pushRegistrationProvider;
    private final ky4<UserProvider> userProvider;

    public ZendeskProvidersModule_ProvideProviderStoreFactory(ky4<UserProvider> ky4, ky4<PushRegistrationProvider> ky42) {
        this.userProvider = ky4;
        this.pushRegistrationProvider = ky42;
    }

    public static ZendeskProvidersModule_ProvideProviderStoreFactory create(ky4<UserProvider> ky4, ky4<PushRegistrationProvider> ky42) {
        return new ZendeskProvidersModule_ProvideProviderStoreFactory(ky4, ky42);
    }

    public static ProviderStore provideProviderStore(UserProvider userProvider2, PushRegistrationProvider pushRegistrationProvider2) {
        return (ProviderStore) fu4.m44415f(ZendeskProvidersModule.provideProviderStore(userProvider2, pushRegistrationProvider2));
    }

    public ProviderStore get() {
        return provideProviderStore(this.userProvider.get(), this.pushRegistrationProvider.get());
    }
}
