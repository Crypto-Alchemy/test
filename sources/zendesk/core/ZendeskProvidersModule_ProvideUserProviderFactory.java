package zendesk.core;

public final class ZendeskProvidersModule_ProvideUserProviderFactory implements ry1<UserProvider> {
    private final ky4<UserService> userServiceProvider;

    public ZendeskProvidersModule_ProvideUserProviderFactory(ky4<UserService> ky4) {
        this.userServiceProvider = ky4;
    }

    public static ZendeskProvidersModule_ProvideUserProviderFactory create(ky4<UserService> ky4) {
        return new ZendeskProvidersModule_ProvideUserProviderFactory(ky4);
    }

    public static UserProvider provideUserProvider(Object obj) {
        return (UserProvider) fu4.m44415f(ZendeskProvidersModule.provideUserProvider((UserService) obj));
    }

    public UserProvider get() {
        return provideUserProvider(this.userServiceProvider.get());
    }
}
