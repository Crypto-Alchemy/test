package zendesk.core;

public final class ZendeskProvidersModule_ProvideAccessProviderFactory implements ry1<AccessProvider> {
    private final ky4<AccessService> accessServiceProvider;
    private final ky4<IdentityManager> identityManagerProvider;

    public ZendeskProvidersModule_ProvideAccessProviderFactory(ky4<IdentityManager> ky4, ky4<AccessService> ky42) {
        this.identityManagerProvider = ky4;
        this.accessServiceProvider = ky42;
    }

    public static ZendeskProvidersModule_ProvideAccessProviderFactory create(ky4<IdentityManager> ky4, ky4<AccessService> ky42) {
        return new ZendeskProvidersModule_ProvideAccessProviderFactory(ky4, ky42);
    }

    public static AccessProvider provideAccessProvider(Object obj, Object obj2) {
        return (AccessProvider) fu4.m44415f(ZendeskProvidersModule.provideAccessProvider((IdentityManager) obj, (AccessService) obj2));
    }

    public AccessProvider get() {
        return provideAccessProvider(this.identityManagerProvider.get(), this.accessServiceProvider.get());
    }
}
