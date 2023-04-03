package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0016\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017¨\u0006\u001d"}, mo44877d2 = {"Lyp0;", "", "Landroid/net/Network;", "", "e", "Landroid/net/ConnectivityManager;", "a", "Landroid/net/ConnectivityManager;", "connectivityManager", "Lu04;", "b", "Lu04;", "_isAvailable", "Lt86;", "c", "Lt86;", "d", "()Lt86;", "isAvailable", "", "Ljava/util/Set;", "networks", "yp0$a", "Lyp0$a;", "callback", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: yp0 */
/* compiled from: ConnectivityState.kt */
public final class yp0 {

    /* renamed from: a */
    public final ConnectivityManager f35908a;

    /* renamed from: b */
    public final u04<Boolean> f35909b;

    /* renamed from: c */
    public final t86<Boolean> f35910c;

    /* renamed from: d */
    public final Set<Network> f35911d = new LinkedHashSet();

    /* renamed from: e */
    public final C6746a f35912e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo44877d2 = {"yp0$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Lr37;", "onAvailable", "onLost", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: yp0$a */
    /* compiled from: ConnectivityState.kt */
    public static final class C6746a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ yp0 f35913a;

        public C6746a(yp0 yp0) {
            this.f35913a = yp0;
        }

        public void onAvailable(Network network) {
            vx2.m53591g(network, "network");
            if (this.f35913a.mo49724e(network)) {
                this.f35913a.f35911d.add(network);
                this.f35913a.f35909b.mo55657e(Boolean.FALSE, Boolean.TRUE);
                return;
            }
            this.f35913a.f35909b.mo55657e(Boolean.TRUE, Boolean.FALSE);
        }

        public void onLost(Network network) {
            vx2.m53591g(network, "network");
            this.f35913a.f35911d.remove(network);
            if (!this.f35913a.f35911d.isEmpty()) {
                this.f35913a.f35909b.mo55657e(Boolean.FALSE, Boolean.TRUE);
            } else {
                this.f35913a.f35909b.mo55657e(Boolean.TRUE, Boolean.FALSE);
            }
        }
    }

    public yp0(Context context) {
        vx2.m53591g(context, "context");
        Object systemService = context.getSystemService("connectivity");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.f35908a = connectivityManager;
        u04<Boolean> a = u86.m72658a(Boolean.FALSE);
        this.f35909b = a;
        this.f35910c = e52.m57210b(a);
        C6746a aVar = new C6746a(this);
        this.f35912e = aVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(16).addTransportType(0).addTransportType(1).build(), aVar);
    }

    /* renamed from: d */
    public final t86<Boolean> mo49723d() {
        return this.f35910c;
    }

    /* renamed from: e */
    public final boolean mo49724e(Network network) {
        NetworkCapabilities networkCapabilities = this.f35908a.getNetworkCapabilities(network);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16) || (!networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(1))) {
            return false;
        }
        return true;
    }
}
