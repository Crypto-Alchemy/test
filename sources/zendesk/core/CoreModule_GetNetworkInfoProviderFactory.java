package zendesk.core;

public final class CoreModule_GetNetworkInfoProviderFactory implements ry1<NetworkInfoProvider> {
    private final CoreModule module;

    public CoreModule_GetNetworkInfoProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetNetworkInfoProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetNetworkInfoProviderFactory(coreModule);
    }

    public static NetworkInfoProvider getNetworkInfoProvider(CoreModule coreModule) {
        return (NetworkInfoProvider) fu4.m44415f(coreModule.getNetworkInfoProvider());
    }

    public NetworkInfoProvider get() {
        return getNetworkInfoProvider(this.module);
    }
}
