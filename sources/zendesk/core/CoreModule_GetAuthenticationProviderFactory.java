package zendesk.core;

public final class CoreModule_GetAuthenticationProviderFactory implements ry1<AuthenticationProvider> {
    private final CoreModule module;

    public CoreModule_GetAuthenticationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetAuthenticationProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetAuthenticationProviderFactory(coreModule);
    }

    public static AuthenticationProvider getAuthenticationProvider(CoreModule coreModule) {
        return (AuthenticationProvider) fu4.m44415f(coreModule.getAuthenticationProvider());
    }

    public AuthenticationProvider get() {
        return getAuthenticationProvider(this.module);
    }
}
