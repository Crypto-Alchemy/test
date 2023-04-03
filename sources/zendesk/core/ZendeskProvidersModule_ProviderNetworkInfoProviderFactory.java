package zendesk.core;

import android.net.ConnectivityManager;

public final class ZendeskProvidersModule_ProviderNetworkInfoProviderFactory implements ry1<NetworkInfoProvider> {
    private final ky4<ConnectivityManager> connectivityManagerProvider;

    public ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(ky4<ConnectivityManager> ky4) {
        this.connectivityManagerProvider = ky4;
    }

    public static ZendeskProvidersModule_ProviderNetworkInfoProviderFactory create(ky4<ConnectivityManager> ky4) {
        return new ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(ky4);
    }

    public static NetworkInfoProvider providerNetworkInfoProvider(ConnectivityManager connectivityManager) {
        return (NetworkInfoProvider) fu4.m44415f(ZendeskProvidersModule.providerNetworkInfoProvider(connectivityManager));
    }

    public NetworkInfoProvider get() {
        return providerNetworkInfoProvider(this.connectivityManagerProvider.get());
    }
}
