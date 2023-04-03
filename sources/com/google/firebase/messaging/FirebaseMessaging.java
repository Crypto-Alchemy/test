package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.messaging.C4809e;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class FirebaseMessaging {

    /* renamed from: n */
    public static final long f25396n = TimeUnit.HOURS.toSeconds(8);
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: o */
    public static C4809e f25397o;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: p */
    public static ix6 f25398p;

    /* renamed from: q */
    public static ScheduledExecutorService f25399q;

    /* renamed from: a */
    public final f22 f25400a;

    /* renamed from: b */
    public final q22 f25401b;

    /* renamed from: c */
    public final o22 f25402c;

    /* renamed from: d */
    public final Context f25403d;

    /* renamed from: e */
    public final oh2 f25404e;

    /* renamed from: f */
    public final C4807d f25405f;

    /* renamed from: g */
    public final C4800a f25406g;

    /* renamed from: h */
    public final Executor f25407h;

    /* renamed from: i */
    public final Executor f25408i;

    /* renamed from: j */
    public final tl6<is6> f25409j;

    /* renamed from: k */
    public final zu3 f25410k;

    /* renamed from: l */
    public boolean f25411l;

    /* renamed from: m */
    public final Application.ActivityLifecycleCallbacks f25412m;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public class C4800a {

        /* renamed from: a */
        public final oc6 f25413a;

        /* renamed from: b */
        public boolean f25414b;

        /* renamed from: c */
        public lt1<o11> f25415c;

        /* renamed from: d */
        public Boolean f25416d;

        public C4800a(oc6 oc6) {
            this.f25413a = oc6;
        }

        /* renamed from: a */
        public synchronized void mo36231a() {
            if (!this.f25414b) {
                Boolean d = mo36234d();
                this.f25416d = d;
                if (d == null) {
                    a32 a32 = new a32(this);
                    this.f25415c = a32;
                    this.f25413a.mo43919b(o11.class, a32);
                }
                this.f25414b = true;
            }
        }

        /* renamed from: b */
        public synchronized boolean mo36232b() {
            boolean z;
            mo36231a();
            Boolean bool = this.f25416d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.f25400a.mo42491q();
            }
            return z;
        }

        /* renamed from: c */
        public final /* synthetic */ void mo36233c(dt1 dt1) {
            if (mo36232b()) {
                FirebaseMessaging.this.mo36229y();
            }
        }

        /* renamed from: d */
        public final Boolean mo36234d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context h = FirebaseMessaging.this.f25400a.mo42485h();
            SharedPreferences sharedPreferences = h.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = h.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(h.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(f22 f22, q22 q22, ly4<q57> ly4, ly4<HeartBeatInfo> ly42, o22 o22, ix6 ix6, oc6 oc6) {
        this(f22, q22, ly4, ly42, o22, ix6, oc6, new zu3(f22.mo42485h()));
    }

    /* renamed from: g */
    public static synchronized FirebaseMessaging m38582g() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(f22.m44161i());
        }
        return instance;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(f22 f22) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) f22.mo42484g(cls);
            cu4.m43222l(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: k */
    public static ix6 m38583k() {
        return f25398p;
    }

    /* renamed from: A */
    public boolean mo36208A(C4809e.C4810a aVar) {
        if (aVar == null || aVar.mo36282b(this.f25410k.mo49976a())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public String mo36209c() throws IOException {
        q22 q22 = this.f25401b;
        if (q22 != null) {
            try {
                return (String) jm6.m46615a(q22.mo46937c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            C4809e.C4810a j = mo36215j();
            if (!mo36208A(j)) {
                return j.f25455a;
            }
            String c = zu3.m55265c(this.f25400a);
            try {
                String str = (String) jm6.m46615a(this.f25402c.getId().mo48139j(nz1.m49103d(), new y22(this, c)));
                f25397o.mo36281g(mo36213h(), c, str, this.f25410k.mo49976a());
                if (j == null || !str.equals(j.f25455a)) {
                    mo36216l(str);
                }
                return str;
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    /* renamed from: d */
    public tl6<Void> mo36210d() {
        if (this.f25401b != null) {
            xl6 xl6 = new xl6();
            this.f25407h.execute(new w22(this, xl6));
            return xl6.mo49503a();
        } else if (mo36215j() == null) {
            return jm6.m46619e(null);
        } else {
            ExecutorService d = nz1.m49103d();
            return this.f25402c.getId().mo48139j(d, new x22(this, d));
        }
    }

    /* renamed from: e */
    public void mo36211e(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f25399q == null) {
                f25399q = new ScheduledThreadPoolExecutor(1, new z24("TAG"));
            }
            f25399q.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: f */
    public Context mo36212f() {
        return this.f25403d;
    }

    /* renamed from: h */
    public final String mo36213h() {
        if ("[DEFAULT]".equals(this.f25400a.mo42487j())) {
            return "";
        }
        return this.f25400a.mo42489l();
    }

    /* renamed from: i */
    public tl6<String> mo36214i() {
        q22 q22 = this.f25401b;
        if (q22 != null) {
            return q22.mo46937c();
        }
        xl6 xl6 = new xl6();
        this.f25407h.execute(new v22(this, xl6));
        return xl6.mo49503a();
    }

    /* renamed from: j */
    public C4809e.C4810a mo36215j() {
        return f25397o.mo36279e(mo36213h(), zu3.m55265c(this.f25400a));
    }

    /* renamed from: l */
    public final void mo36216l(String str) {
        if ("[DEFAULT]".equals(this.f25400a.mo42487j())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(this.f25400a.mo42487j());
                if (valueOf.length() != 0) {
                    "Invoking onNewToken for app: ".concat(valueOf);
                }
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new mz1(this.f25403d).mo45933g(intent);
        }
    }

    /* renamed from: m */
    public boolean mo36217m() {
        return this.f25406g.mo36232b();
    }

    /* renamed from: n */
    public boolean mo36218n() {
        return this.f25410k.mo49981g();
    }

    /* renamed from: o */
    public final /* synthetic */ tl6 mo36219o(tl6 tl6) {
        return this.f25404e.mo46400e((String) tl6.mo48141l());
    }

    /* renamed from: p */
    public final /* synthetic */ tl6 mo36220p(String str, tl6 tl6) throws Exception {
        return this.f25405f.mo36272a(str, new z22(this, tl6));
    }

    /* renamed from: q */
    public final /* synthetic */ void mo36221q(xl6 xl6) {
        try {
            this.f25401b.mo46936b(zu3.m55265c(this.f25400a), "FCM");
            xl6.mo49505c(null);
        } catch (Exception e) {
            xl6.mo49504b(e);
        }
    }

    /* renamed from: r */
    public final /* synthetic */ Void mo36222r(tl6 tl6) throws Exception {
        f25397o.mo36278d(mo36213h(), zu3.m55265c(this.f25400a));
        return null;
    }

    /* renamed from: s */
    public final /* synthetic */ tl6 mo36223s(ExecutorService executorService, tl6 tl6) throws Exception {
        return this.f25404e.mo46397b((String) tl6.mo48141l()).mo48138i(executorService, new s22(this));
    }

    /* renamed from: t */
    public final /* synthetic */ void mo36224t(xl6 xl6) {
        try {
            xl6.mo49505c(mo36209c());
        } catch (Exception e) {
            xl6.mo49504b(e);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ void mo36225u() {
        if (mo36217m()) {
            mo36229y();
        }
    }

    /* renamed from: v */
    public final /* synthetic */ void mo36226v(is6 is6) {
        if (mo36217m()) {
            is6.mo43914n();
        }
    }

    /* renamed from: w */
    public synchronized void mo36227w(boolean z) {
        this.f25411l = z;
    }

    /* renamed from: x */
    public final synchronized void mo36228x() {
        if (!this.f25411l) {
            mo36230z(0);
        }
    }

    /* renamed from: y */
    public final void mo36229y() {
        q22 q22 = this.f25401b;
        if (q22 != null) {
            q22.getToken();
        } else if (mo36208A(mo36215j())) {
            mo36228x();
        }
    }

    /* renamed from: z */
    public synchronized void mo36230z(long j) {
        mo36211e(new zj6(this, Math.min(Math.max(30, j + j), f25396n)), j);
        this.f25411l = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseMessaging(p000.f22 r11, p000.q22 r12, p000.ly4<p000.q57> r13, p000.ly4<com.google.firebase.heartbeatinfo.HeartBeatInfo> r14, p000.o22 r15, p000.ix6 r16, p000.oc6 r17, p000.zu3 r18) {
        /*
            r10 = this;
            oh2 r7 = new oh2
            r0 = r7
            r1 = r11
            r2 = r18
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = p000.nz1.m49104e()
            java.util.concurrent.ScheduledExecutorService r9 = p000.nz1.m49101b()
            r0 = r10
            r2 = r12
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(f22, q22, ly4, ly4, o22, ix6, oc6, zu3):void");
    }

    public FirebaseMessaging(f22 f22, q22 q22, o22 o22, ix6 ix6, oc6 oc6, zu3 zu3, oh2 oh2, Executor executor, Executor executor2) {
        this.f25411l = false;
        f25398p = ix6;
        this.f25400a = f22;
        this.f25401b = q22;
        this.f25402c = o22;
        this.f25406g = new C4800a(oc6);
        Context h = f22.mo42485h();
        this.f25403d = h;
        oz1 oz1 = new oz1();
        this.f25412m = oz1;
        this.f25410k = zu3;
        this.f25408i = executor;
        this.f25404e = oh2;
        this.f25405f = new C4807d(executor);
        this.f25407h = executor2;
        Context h2 = f22.mo42485h();
        if (h2 instanceof Application) {
            ((Application) h2).registerActivityLifecycleCallbacks(oz1);
        } else {
            String valueOf = String.valueOf(h2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 125);
            sb.append("Context ");
            sb.append(valueOf);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (q22 != null) {
            q22.mo46935a(new r22(this));
        }
        synchronized (FirebaseMessaging.class) {
            if (f25397o == null) {
                f25397o = new C4809e(h);
            }
        }
        executor2.execute(new t22(this));
        tl6<is6> d = is6.m45935d(this, o22, zu3, oh2, h, nz1.m49105f());
        this.f25409j = d;
        d.mo48136g(nz1.m49106g(), new u22(this));
    }
}
