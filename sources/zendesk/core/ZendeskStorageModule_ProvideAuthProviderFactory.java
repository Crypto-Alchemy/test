package zendesk.core;

public final class ZendeskStorageModule_ProvideAuthProviderFactory implements ry1<AuthenticationProvider> {
    private final ky4<IdentityManager> identityManagerProvider;

    public ZendeskStorageModule_ProvideAuthProviderFactory(ky4<IdentityManager> ky4) {
        this.identityManagerProvider = ky4;
    }

    public static ZendeskStorageModule_ProvideAuthProviderFactory create(ky4<IdentityManager> ky4) {
        return new ZendeskStorageModule_ProvideAuthProviderFactory(ky4);
    }

    public static AuthenticationProvider provideAuthProvider(Object obj) {
        return (AuthenticationProvider) fu4.m44415f(ZendeskStorageModule.provideAuthProvider((IdentityManager) obj));
    }

    public AuthenticationProvider get() {
        return provideAuthProvider(this.identityManagerProvider.get());
    }
}
