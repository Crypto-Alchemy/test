package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: hd */
public class C5889hd {

    /* renamed from: a */
    public o30 f29524a;

    /* renamed from: b */
    public kl8 f29525b;

    /* renamed from: c */
    public boolean f29526c;

    /* renamed from: d */
    public final Object f29527d = new Object();

    /* renamed from: e */
    public C5891b f29528e;

    /* renamed from: f */
    public final Context f29529f;

    /* renamed from: g */
    public final boolean f29530g;

    /* renamed from: h */
    public final long f29531h;

    /* renamed from: hd$a */
    public static final class C5890a {

        /* renamed from: a */
        public final String f29532a;

        /* renamed from: b */
        public final boolean f29533b;

        public C5890a(String str, boolean z) {
            this.f29532a = str;
            this.f29533b = z;
        }

        /* renamed from: a */
        public final String mo43135a() {
            return this.f29532a;
        }

        /* renamed from: b */
        public final boolean mo43136b() {
            return this.f29533b;
        }

        public final String toString() {
            String str = this.f29532a;
            boolean z = this.f29533b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: hd$b */
    public static class C5891b extends Thread {

        /* renamed from: a */
        public WeakReference<C5889hd> f29534a;

        /* renamed from: d */
        public long f29535d;

        /* renamed from: e */
        public CountDownLatch f29536e = new CountDownLatch(1);

        /* renamed from: g */
        public boolean f29537g = false;

        public C5891b(C5889hd hdVar, long j) {
            this.f29534a = new WeakReference<>(hdVar);
            this.f29535d = j;
            start();
        }

        /* renamed from: a */
        public final void mo43138a() {
            C5889hd hdVar = this.f29534a.get();
            if (hdVar != null) {
                hdVar.mo43129a();
                this.f29537g = true;
            }
        }

        public final void run() {
            try {
                if (!this.f29536e.await(this.f29535d, TimeUnit.MILLISECONDS)) {
                    mo43138a();
                }
            } catch (InterruptedException unused) {
                mo43138a();
            }
        }
    }

    public C5889hd(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        cu4.m43221k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f29529f = context;
        this.f29526c = false;
        this.f29531h = j;
        this.f29530g = z2;
    }

    /* renamed from: b */
    public static C5890a m45127b(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        ab8 ab8 = new ab8(context);
        boolean a = ab8.mo28911a("gads:ad_id_app_context:enabled", false);
        float b = ab8.mo28912b("gads:ad_id_app_context:ping_ratio", Utils.FLOAT_EPSILON);
        String c = ab8.mo28913c("gads:ad_id_use_shared_preference:experiment_id", "");
        C5889hd hdVar = new C5889hd(context, -1, a, ab8.mo28911a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            hdVar.mo43133h(false);
            C5890a c2 = hdVar.mo43130c();
            hdVar.mo43134i(c2, a, b, SystemClock.elapsedRealtime() - elapsedRealtime, c, (Throwable) null);
            hdVar.mo43129a();
            return c2;
        } catch (Throwable th) {
            hdVar.mo43129a();
            throw th;
        }
    }

    /* renamed from: d */
    public static void m45128d(boolean z) {
    }

    /* renamed from: e */
    public static o30 m45129e(Context context, boolean z) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int j = zh2.m55108h().mo49670j(context, mi2.f31711a);
            if (j == 0 || j == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                o30 o30 = new o30();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (rp0.m51209b().mo47466a(context, intent, o30, 1)) {
                        return o30;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    /* renamed from: f */
    public static kl8 m45130f(Context context, o30 o30) throws IOException {
        try {
            return bp8.m32682E0(o30.mo46304a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43129a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            p000.cu4.m43220j(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f29529f     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            o30 r0 = r3.f29524a     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            boolean r0 = r3.f29526c     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001e
            rp0 r0 = p000.rp0.m51209b()     // Catch:{ all -> 0x001e }
            android.content.Context r1 = r3.f29529f     // Catch:{ all -> 0x001e }
            o30 r2 = r3.f29524a     // Catch:{ all -> 0x001e }
            r0.mo47467c(r1, r2)     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = 0
            r3.f29526c = r0     // Catch:{ all -> 0x002a }
            r0 = 0
            r3.f29525b = r0     // Catch:{ all -> 0x002a }
            r3.f29524a = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5889hd.mo43129a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0063, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005c */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.C5889hd.C5890a mo43130c() throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            p000.cu4.m43220j(r0)
            monitor-enter(r4)
            boolean r0 = r4.f29526c     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x003b
            java.lang.Object r0 = r4.f29527d     // Catch:{ all -> 0x0064 }
            monitor-enter(r0)     // Catch:{ all -> 0x0064 }
            hd$b r1 = r4.f29528e     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.f29537g     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0030
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            r0 = 0
            r4.mo43133h(r0)     // Catch:{ Exception -> 0x0027 }
            boolean r0 = r4.f29526c     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x001f
            goto L_0x003b
        L_0x001f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0027:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0064 }
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0030:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x0038 }
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x003b:
            o30 r0 = r4.f29524a     // Catch:{ all -> 0x0064 }
            p000.cu4.m43221k(r0)     // Catch:{ all -> 0x0064 }
            kl8 r0 = r4.f29525b     // Catch:{ all -> 0x0064 }
            p000.cu4.m43221k(r0)     // Catch:{ all -> 0x0064 }
            hd$a r0 = new hd$a     // Catch:{ RemoteException -> 0x005c }
            kl8 r1 = r4.f29525b     // Catch:{ RemoteException -> 0x005c }
            java.lang.String r1 = r1.getId()     // Catch:{ RemoteException -> 0x005c }
            kl8 r2 = r4.f29525b     // Catch:{ RemoteException -> 0x005c }
            r3 = 1
            boolean r2 = r2.mo44838t(r3)     // Catch:{ RemoteException -> 0x005c }
            r0.<init>(r1, r2)     // Catch:{ RemoteException -> 0x005c }
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
            r4.mo43132g()
            return r0
        L_0x005c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5889hd.mo43130c():hd$a");
    }

    public void finalize() throws Throwable {
        mo43129a();
        super.finalize();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43132g() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f29527d
            monitor-enter(r0)
            hd$b r1 = r5.f29528e     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f29536e     // Catch:{ all -> 0x0024 }
            r1.countDown()     // Catch:{ all -> 0x0024 }
            hd$b r1 = r5.f29528e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r5.f29531h     // Catch:{ all -> 0x0024 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0022
            hd$b r1 = new hd$b     // Catch:{ all -> 0x0024 }
            long r2 = r5.f29531h     // Catch:{ all -> 0x0024 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0024 }
            r5.f29528e = r1     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5889hd.mo43132g():void");
    }

    /* renamed from: h */
    public final void mo43133h(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        cu4.m43220j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f29526c) {
                mo43129a();
            }
            o30 e = m45129e(this.f29529f, this.f29530g);
            this.f29524a = e;
            this.f29525b = m45130f(this.f29529f, e);
            this.f29526c = true;
            if (z) {
                mo43132g();
            }
        }
    }

    /* renamed from: i */
    public final boolean mo43134i(C5890a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (aVar != null) {
            if (!aVar.mo43136b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(aVar == null || aVar.mo43135a() == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.mo43135a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new f58(this, hashMap).start();
        return true;
    }
}
