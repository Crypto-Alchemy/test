package zendesk.core;

public final class ZendeskProvidersModule_ProvideUserServiceFactory implements ry1<UserService> {
    private final ky4<og5> retrofitProvider;

    public ZendeskProvidersModule_ProvideUserServiceFactory(ky4<og5> ky4) {
        this.retrofitProvider = ky4;
    }

    public static ZendeskProvidersModule_ProvideUserServiceFactory create(ky4<og5> ky4) {
        return new ZendeskProvidersModule_ProvideUserServiceFactory(ky4);
    }

    public static UserService provideUserService(og5 og5) {
        return (UserService) fu4.m44415f(ZendeskProvidersModule.provideUserService(og5));
    }

    public UserService get() {
        return provideUserService(this.retrofitProvider.get());
    }
}
