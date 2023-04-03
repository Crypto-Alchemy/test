package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: v54 */
/* compiled from: NetworkStateTracker */
public class v54 extends lq0<t54> {

    /* renamed from: j */
    public static final String f18676j = qk3.m25728f("NetworkStateTracker");

    /* renamed from: g */
    public final ConnectivityManager f18677g = ((ConnectivityManager) this.f14632b.getSystemService("connectivity"));

    /* renamed from: h */
    public C3460b f18678h;

    /* renamed from: i */
    public C3459a f18679i;

    /* renamed from: v54$a */
    /* compiled from: NetworkStateTracker */
    public class C3459a extends BroadcastReceiver {
        public C3459a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                qk3.m25726c().mo25135a(v54.f18676j, "Network broadcast received", new Throwable[0]);
                v54 v54 = v54.this;
                v54.mo22923d(v54.mo27062g());
            }
        }
    }

    /* renamed from: v54$b */
    /* compiled from: NetworkStateTracker */
    public class C3460b extends ConnectivityManager.NetworkCallback {
        public C3460b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            qk3.m25726c().mo25135a(v54.f18676j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            v54 v54 = v54.this;
            v54.mo22923d(v54.mo27062g());
        }

        public void onLost(Network network) {
            qk3.m25726c().mo25135a(v54.f18676j, "Network connection lost", new Throwable[0]);
            v54 v54 = v54.this;
            v54.mo22923d(v54.mo27062g());
        }
    }

    public v54(Context context, bm6 bm6) {
        super(context, bm6);
        if (m28626j()) {
            this.f18678h = new C3460b();
        } else {
            this.f18679i = new C3459a();
        }
    }

    /* renamed from: j */
    public static boolean m28626j() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo20940e() {
        if (m28626j()) {
            try {
                qk3.m25726c().mo25135a(f18676j, "Registering network callback", new Throwable[0]);
                this.f18677g.registerDefaultNetworkCallback(this.f18678h);
            } catch (IllegalArgumentException | SecurityException e) {
                qk3.m25726c().mo25136b(f18676j, "Received exception while registering network callback", e);
            }
        } else {
            qk3.m25726c().mo25135a(f18676j, "Registering broadcast receiver", new Throwable[0]);
            this.f14632b.registerReceiver(this.f18679i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: f */
    public void mo20941f() {
        if (m28626j()) {
            try {
                qk3.m25726c().mo25135a(f18676j, "Unregistering network callback", new Throwable[0]);
                this.f18677g.unregisterNetworkCallback(this.f18678h);
            } catch (IllegalArgumentException | SecurityException e) {
                qk3.m25726c().mo25136b(f18676j, "Received exception while unregistering network callback", e);
            }
        } else {
            qk3.m25726c().mo25135a(f18676j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f14632b.unregisterReceiver(this.f18679i);
        }
    }

    /* renamed from: g */
    public t54 mo27062g() {
        boolean z;
        NetworkInfo activeNetworkInfo = this.f18677g.getActiveNetworkInfo();
        boolean z2 = true;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        boolean i = mo27064i();
        boolean a = up0.m28377a(this.f18677g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z2 = false;
        }
        return new t54(z, i, a, z2);
    }

    /* renamed from: h */
    public t54 mo19843b() {
        return mo27062g();
    }

    /* renamed from: i */
    public boolean mo27064i() {
        try {
            NetworkCapabilities networkCapabilities = this.f18677g.getNetworkCapabilities(this.f18677g.getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        } catch (SecurityException e) {
            qk3.m25726c().mo25136b(f18676j, "Unable to validate active network", e);
            return false;
        }
    }
}
