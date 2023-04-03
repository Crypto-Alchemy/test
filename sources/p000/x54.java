package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: x54 */
/* compiled from: NetworkTypeObserver */
public final class x54 {

    /* renamed from: e */
    public static x54 f19320e;

    /* renamed from: a */
    public final Handler f19321a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<C3572c>> f19322b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Object f19323c = new Object();

    /* renamed from: d */
    public int f19324d = 0;

    /* renamed from: x54$b */
    /* compiled from: NetworkTypeObserver */
    public static final class C3570b {

        /* renamed from: x54$b$a */
        /* compiled from: NetworkTypeObserver */
        public static final class C3571a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a */
            public final x54 f19325a;

            public C3571a(x54 x54) {
                this.f19325a = x54;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                boolean z;
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                int i = 5;
                if (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) {
                    z = true;
                } else {
                    z = false;
                }
                x54 x54 = this.f19325a;
                if (z) {
                    i = 10;
                }
                x54.mo27676k(i);
            }
        }

        /* renamed from: a */
        public static void m29909a(Context context, x54 x54) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C2725kr.m20985e((TelephonyManager) context.getSystemService("phone"));
                C3571a aVar = new C3571a(x54);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                x54.mo27676k(5);
            }
        }
    }

    /* renamed from: x54$c */
    /* compiled from: NetworkTypeObserver */
    public interface C3572c {
        /* renamed from: a */
        void mo25340a(int i);
    }

    /* renamed from: x54$d */
    /* compiled from: NetworkTypeObserver */
    public final class C3573d extends BroadcastReceiver {
        public C3573d() {
        }

        public void onReceive(Context context, Intent intent) {
            int b = x54.m29903g(context);
            if (w67.f19021a < 31 || b != 5) {
                x54.this.mo27676k(b);
            } else {
                C3570b.m29909a(context, x54.this);
            }
        }
    }

    public x54(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C3573d(), intentFilter);
    }

    /* renamed from: d */
    public static synchronized x54 m29901d(Context context) {
        x54 x54;
        synchronized (x54.class) {
            if (f19320e == null) {
                f19320e = new x54(context);
            }
            x54 = f19320e;
        }
        return x54;
    }

    /* renamed from: e */
    public static int m29902e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            case 20:
                if (w67.f19021a >= 29) {
                    return 9;
                }
                return 0;
            default:
                return 6;
        }
    }

    /* renamed from: g */
    public static int m29903g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type == 6) {
                            return 5;
                        }
                        if (type != 9) {
                            return 8;
                        }
                        return 7;
                    }
                }
                return m29902e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m29904h(C3572c cVar) {
        cVar.mo25340a(mo27673f());
    }

    /* renamed from: f */
    public int mo27673f() {
        int i;
        synchronized (this.f19323c) {
            i = this.f19324d;
        }
        return i;
    }

    /* renamed from: i */
    public void mo27674i(C3572c cVar) {
        mo27675j();
        this.f19322b.add(new WeakReference(cVar));
        this.f19321a.post(new w54(this, cVar));
    }

    /* renamed from: j */
    public final void mo27675j() {
        Iterator<WeakReference<C3572c>> it = this.f19322b.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == null) {
                this.f19322b.remove(next);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (p000.x54.C3572c) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.mo25340a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.f19322b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f19322b.iterator();
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27676k(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f19323c
            monitor-enter(r0)
            int r1 = r3.f19324d     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0009:
            r3.f19324d = r4     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<x54$c>> r0 = r3.f19322b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            x54$c r2 = (p000.x54.C3572c) r2
            if (r2 == 0) goto L_0x002a
            r2.mo25340a(r4)
            goto L_0x0012
        L_0x002a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<x54$c>> r2 = r3.f19322b
            r2.remove(r1)
            goto L_0x0012
        L_0x0030:
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x54.mo27676k(int):void");
    }
}
