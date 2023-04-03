package net.safemoon.androidwallet.receivers;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0019\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\b\u0010\u0006\u001a\u00020\u0003H\u0003J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/receivers/ConnectionLiveData;", "Landroidx/lifecycle/LiveData;", "", "Lr37;", "onActive", "onInactive", "d", "Landroid/net/ConnectivityManager$NetworkCallback;", "c", "e", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Landroid/net/ConnectivityManager;", "b", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager$NetworkCallback;", "connectivityManagerCallback", "Landroid/net/NetworkRequest$Builder;", "Landroid/net/NetworkRequest$Builder;", "networkRequestBuilder", "net/safemoon/androidwallet/receivers/ConnectionLiveData$networkReceiver$1", "Lnet/safemoon/androidwallet/receivers/ConnectionLiveData$networkReceiver$1;", "networkReceiver", "<init>", "(Landroid/content/Context;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ConnectionLiveData.kt */
public final class ConnectionLiveData extends LiveData<Boolean> {

    /* renamed from: a */
    public final Context f42497a;

    /* renamed from: b */
    public ConnectivityManager f42498b;

    /* renamed from: c */
    public ConnectivityManager.NetworkCallback f42499c;

    /* renamed from: d */
    public final NetworkRequest.Builder f42500d;

    /* renamed from: e */
    public final ConnectionLiveData$networkReceiver$1 f42501e = new ConnectionLiveData$networkReceiver$1(this);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo44877d2 = {"net/safemoon/androidwallet/receivers/ConnectionLiveData$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "Lr37;", "onCapabilitiesChanged", "onLost", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.receivers.ConnectionLiveData$a */
    /* compiled from: ConnectionLiveData.kt */
    public static final class C8608a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ ConnectionLiveData f42502a;

        public C8608a(ConnectionLiveData connectionLiveData) {
            this.f42502a = connectionLiveData;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            vx2.m53591g(network, "network");
            vx2.m53591g(networkCapabilities, "networkCapabilities");
            ConnectionLiveData connectionLiveData = this.f42502a;
            if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                connectionLiveData.postValue(Boolean.TRUE);
            }
        }

        public void onLost(Network network) {
            vx2.m53591g(network, "network");
            this.f42502a.postValue(Boolean.FALSE);
        }
    }

    public ConnectionLiveData(Context context) {
        vx2.m53591g(context, "context");
        this.f42497a = context;
        Object systemService = context.getSystemService("connectivity");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f42498b = (ConnectivityManager) systemService;
        NetworkRequest.Builder addTransportType = new NetworkRequest.Builder().addTransportType(0).addTransportType(1);
        vx2.m53590f(addTransportType, "Builder()\n        .addTr…abilities.TRANSPORT_WIFI)");
        this.f42500d = addTransportType;
    }

    /* renamed from: c */
    public final ConnectivityManager.NetworkCallback mo60715c() {
        C8608a aVar = new C8608a(this);
        this.f42499c = aVar;
        return aVar;
    }

    @TargetApi(23)
    /* renamed from: d */
    public final void mo60716d() {
        this.f42498b.registerNetworkCallback(this.f42500d.build(), mo60715c());
    }

    /* renamed from: e */
    public final void mo60717e() {
        NetworkInfo activeNetworkInfo = this.f42498b.getActiveNetworkInfo();
        boolean z = true;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z = false;
        }
        postValue(Boolean.valueOf(z));
    }

    public void onActive() {
        super.onActive();
        mo60717e();
        if (Build.VERSION.SDK_INT >= 24) {
            this.f42498b.registerDefaultNetworkCallback(mo60715c());
        } else {
            mo60716d();
        }
    }

    public void onInactive() {
        super.onInactive();
        ConnectivityManager connectivityManager = this.f42498b;
        ConnectivityManager.NetworkCallback networkCallback = this.f42499c;
        if (networkCallback == null) {
            vx2.m53605u("connectivityManagerCallback");
            networkCallback = null;
        }
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
