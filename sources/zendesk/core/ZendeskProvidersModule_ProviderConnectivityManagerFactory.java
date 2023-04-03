package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;

public final class ZendeskProvidersModule_ProviderConnectivityManagerFactory implements ry1<ConnectivityManager> {
    private final ky4<Context> contextProvider;

    public ZendeskProvidersModule_ProviderConnectivityManagerFactory(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static ZendeskProvidersModule_ProviderConnectivityManagerFactory create(ky4<Context> ky4) {
        return new ZendeskProvidersModule_ProviderConnectivityManagerFactory(ky4);
    }

    public static ConnectivityManager providerConnectivityManager(Context context) {
        return (ConnectivityManager) fu4.m44415f(ZendeskProvidersModule.providerConnectivityManager(context));
    }

    public ConnectivityManager get() {
        return providerConnectivityManager(this.contextProvider.get());
    }
}
