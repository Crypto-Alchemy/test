package p000;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p000.bh2;
import p000.vp0;

/* renamed from: q36 */
/* compiled from: SingletonConnectivityReceiver */
public final class q36 {

    /* renamed from: d */
    public static volatile q36 f16760d;

    /* renamed from: a */
    public final C3115c f16761a;

    /* renamed from: b */
    public final Set<vp0.C3503a> f16762b = new HashSet();

    /* renamed from: c */
    public boolean f16763c;

    /* renamed from: q36$a */
    /* compiled from: SingletonConnectivityReceiver */
    public class C3113a implements bh2.C1635b<ConnectivityManager> {

        /* renamed from: a */
        public final /* synthetic */ Context f16764a;

        public C3113a(Context context) {
            this.f16764a = context;
        }

        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f16764a.getSystemService("connectivity");
        }
    }

    /* renamed from: q36$b */
    /* compiled from: SingletonConnectivityReceiver */
    public class C3114b implements vp0.C3503a {
        public C3114b() {
        }

        /* renamed from: a */
        public void mo23167a(boolean z) {
            ArrayList<vp0.C3503a> arrayList;
            synchronized (q36.this) {
                arrayList = new ArrayList<>(q36.this.f16762b);
            }
            for (vp0.C3503a a : arrayList) {
                a.mo23167a(z);
            }
        }
    }

    /* renamed from: q36$c */
    /* compiled from: SingletonConnectivityReceiver */
    public interface C3115c {
        boolean register();

        void unregister();
    }

    /* renamed from: q36$d */
    /* compiled from: SingletonConnectivityReceiver */
    public static final class C3116d implements C3115c {

        /* renamed from: a */
        public boolean f16767a;

        /* renamed from: b */
        public final vp0.C3503a f16768b;

        /* renamed from: c */
        public final bh2.C1635b<ConnectivityManager> f16769c;

        /* renamed from: d */
        public final ConnectivityManager.NetworkCallback f16770d = new C3117a();

        /* renamed from: q36$d$a */
        /* compiled from: SingletonConnectivityReceiver */
        public class C3117a extends ConnectivityManager.NetworkCallback {

            /* renamed from: q36$d$a$a */
            /* compiled from: SingletonConnectivityReceiver */
            public class C3118a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ boolean f16772a;

                public C3118a(boolean z) {
                    this.f16772a = z;
                }

                public void run() {
                    C3117a.this.mo24915a(this.f16772a);
                }
            }

            public C3117a() {
            }

            /* renamed from: a */
            public void mo24915a(boolean z) {
                p67.m24674b();
                C3116d dVar = C3116d.this;
                boolean z2 = dVar.f16767a;
                dVar.f16767a = z;
                if (z2 != z) {
                    dVar.f16768b.mo23167a(z);
                }
            }

            /* renamed from: b */
            public final void mo24916b(boolean z) {
                p67.m24693u(new C3118a(z));
            }

            public void onAvailable(Network network) {
                mo24916b(true);
            }

            public void onLost(Network network) {
                mo24916b(false);
            }
        }

        public C3116d(bh2.C1635b<ConnectivityManager> bVar, vp0.C3503a aVar) {
            this.f16769c = bVar;
            this.f16768b = aVar;
        }

        @SuppressLint({"MissingPermission"})
        public boolean register() {
            boolean z;
            if (this.f16769c.get().getActiveNetwork() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f16767a = z;
            try {
                this.f16769c.get().registerDefaultNetworkCallback(this.f16770d);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        public void unregister() {
            this.f16769c.get().unregisterNetworkCallback(this.f16770d);
        }
    }

    /* renamed from: q36$e */
    /* compiled from: SingletonConnectivityReceiver */
    public static final class C3119e implements C3115c {

        /* renamed from: a */
        public final Context f16774a;

        /* renamed from: b */
        public final vp0.C3503a f16775b;

        /* renamed from: c */
        public final bh2.C1635b<ConnectivityManager> f16776c;

        /* renamed from: d */
        public boolean f16777d;

        /* renamed from: e */
        public final BroadcastReceiver f16778e = new C3120a();

        /* renamed from: q36$e$a */
        /* compiled from: SingletonConnectivityReceiver */
        public class C3120a extends BroadcastReceiver {
            public C3120a() {
            }

            public void onReceive(Context context, Intent intent) {
                C3119e eVar = C3119e.this;
                boolean z = eVar.f16777d;
                eVar.f16777d = eVar.mo24920a();
                if (z != C3119e.this.f16777d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("connectivity changed, isConnected: ");
                        sb.append(C3119e.this.f16777d);
                    }
                    C3119e eVar2 = C3119e.this;
                    eVar2.f16775b.mo23167a(eVar2.f16777d);
                }
            }
        }

        public C3119e(Context context, bh2.C1635b<ConnectivityManager> bVar, vp0.C3503a aVar) {
            this.f16774a = context.getApplicationContext();
            this.f16776c = bVar;
            this.f16775b = aVar;
        }

        @SuppressLint({"MissingPermission"})
        /* renamed from: a */
        public boolean mo24920a() {
            try {
                NetworkInfo activeNetworkInfo = this.f16776c.get().getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return false;
                }
                return true;
            } catch (RuntimeException unused) {
                return true;
            }
        }

        public boolean register() {
            this.f16777d = mo24920a();
            try {
                this.f16774a.registerReceiver(this.f16778e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }

        public void unregister() {
            this.f16774a.unregisterReceiver(this.f16778e);
        }
    }

    public q36(Context context) {
        C3115c cVar;
        bh2.C1635b a = bh2.m11409a(new C3113a(context));
        C3114b bVar = new C3114b();
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new C3116d(a, bVar);
        } else {
            cVar = new C3119e(context, a, bVar);
        }
        this.f16761a = cVar;
    }

    /* renamed from: a */
    public static q36 m25369a(Context context) {
        if (f16760d == null) {
            synchronized (q36.class) {
                if (f16760d == null) {
                    f16760d = new q36(context.getApplicationContext());
                }
            }
        }
        return f16760d;
    }

    /* renamed from: b */
    public final void mo24908b() {
        if (!this.f16763c && !this.f16762b.isEmpty()) {
            this.f16763c = this.f16761a.register();
        }
    }

    /* renamed from: c */
    public final void mo24909c() {
        if (this.f16763c && this.f16762b.isEmpty()) {
            this.f16761a.unregister();
            this.f16763c = false;
        }
    }

    /* renamed from: d */
    public synchronized void mo24910d(vp0.C3503a aVar) {
        this.f16762b.add(aVar);
        mo24908b();
    }

    /* renamed from: e */
    public synchronized void mo24911e(vp0.C3503a aVar) {
        this.f16762b.remove(aVar);
        mo24909c();
    }
}
