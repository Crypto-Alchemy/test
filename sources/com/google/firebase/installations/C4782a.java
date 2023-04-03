package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.C4788b;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.C4798c;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.installations.a */
/* compiled from: FirebaseInstallations */
public class C4782a implements o22 {

    /* renamed from: m */
    public static final Object f25329m = new Object();

    /* renamed from: n */
    public static final ThreadFactory f25330n = new C4783a();

    /* renamed from: a */
    public final f22 f25331a;

    /* renamed from: b */
    public final C4798c f25332b;

    /* renamed from: c */
    public final PersistedInstallation f25333c;

    /* renamed from: d */
    public final p77 f25334d;

    /* renamed from: e */
    public final iq2 f25335e;

    /* renamed from: f */
    public final z65 f25336f;

    /* renamed from: g */
    public final Object f25337g;

    /* renamed from: h */
    public final ExecutorService f25338h;

    /* renamed from: i */
    public final ExecutorService f25339i;

    /* renamed from: j */
    public String f25340j;

    /* renamed from: k */
    public Set<d02> f25341k;

    /* renamed from: l */
    public final List<y86> f25342l;

    /* renamed from: com.google.firebase.installations.a$a */
    /* compiled from: FirebaseInstallations */
    public class C4783a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f25343a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f25343a.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.a$b */
    /* compiled from: FirebaseInstallations */
    public static /* synthetic */ class C4784b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25344a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f25345b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25345b = r0
                r1 = 1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = com.google.firebase.installations.remote.TokenResult.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f25345b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f25345b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f25344a = r2
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r3 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f25344a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C4782a.C4784b.<clinit>():void");
        }
    }

    public C4782a(f22 f22, ly4<q57> ly4, ly4<HeartBeatInfo> ly42) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f25330n), f22, new C4798c(f22.mo42485h(), ly4, ly42), new PersistedInstallation(f22), p77.m49814c(), new iq2(f22), new z65());
    }

    /* renamed from: n */
    public static C4782a m38440n() {
        return m38441o(f22.m44161i());
    }

    /* renamed from: o */
    public static C4782a m38441o(f22 f22) {
        boolean z;
        if (f22 != null) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43212b(z, "Null is not a valid value of FirebaseApp.");
        return (C4782a) f22.mo42484g(o22.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m38443u() {
        m38444v(false);
    }

    /* renamed from: A */
    public final void mo36107A(C4788b bVar) {
        synchronized (this.f25337g) {
            Iterator<y86> it = this.f25342l.iterator();
            while (it.hasNext()) {
                if (it.next().mo47754b(bVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: B */
    public final synchronized void mo36108B(String str) {
        this.f25340j = str;
    }

    /* renamed from: C */
    public final synchronized void mo36109C(C4788b bVar, C4788b bVar2) {
        if (this.f25341k.size() != 0 && !bVar.mo36135d().equals(bVar2.mo36135d())) {
            for (d02 a : this.f25341k) {
                a.mo41795a(bVar2.mo36135d());
            }
        }
    }

    /* renamed from: a */
    public tl6<vv2> mo36110a(boolean z) {
        mo36125w();
        tl6<vv2> e = mo36111e();
        this.f25338h.execute(new l22(this, z));
        return e;
    }

    /* renamed from: e */
    public final tl6<vv2> mo36111e() {
        xl6 xl6 = new xl6();
        mo36113g(new sf2(this.f25334d, xl6));
        return xl6.mo49503a();
    }

    /* renamed from: f */
    public final tl6<String> mo36112f() {
        xl6 xl6 = new xl6();
        mo36113g(new uf2(xl6));
        return xl6.mo49503a();
    }

    /* renamed from: g */
    public final void mo36113g(y86 y86) {
        synchronized (this.f25337g) {
            this.f25342l.add(y86);
        }
    }

    public tl6<String> getId() {
        mo36125w();
        String m = mo36120m();
        if (m != null) {
            return jm6.m46619e(m);
        }
        tl6<String> f = mo36112f();
        this.f25338h.execute(new m22(this));
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m38442t(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.local.b r0 = r2.mo36121p()
            boolean r1 = r0.mo36152i()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo36155l()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            p77 r3 = r2.f25334d     // Catch:{ FirebaseInstallationsException -> 0x005f }
            boolean r3 = r3.mo46661f(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.local.b r3 = r2.mo36117j(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.local.b r3 = r2.mo36127y(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
        L_0x0026:
            r2.mo36124s(r3)
            r2.mo36109C(r0, r3)
            boolean r0 = r3.mo36154k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo36135d()
            r2.mo36108B(r0)
        L_0x0039:
            boolean r0 = r3.mo36152i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r3.<init>(r0)
            r2.mo36128z(r3)
            goto L_0x005e
        L_0x004a:
            boolean r0 = r3.mo36153j()
            if (r0 == 0) goto L_0x005b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.mo36128z(r3)
            goto L_0x005e
        L_0x005b:
            r2.mo36107A(r3)
        L_0x005e:
            return
        L_0x005f:
            r3 = move-exception
            r2.mo36128z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C4782a.m38442t(boolean):void");
    }

    /* renamed from: i */
    public final void m38444v(boolean z) {
        C4788b q = mo36122q();
        if (z) {
            q = q.mo36158p();
        }
        mo36107A(q);
        this.f25339i.execute(new n22(this, z));
    }

    /* renamed from: j */
    public final C4788b mo36117j(C4788b bVar) throws FirebaseInstallationsException {
        TokenResult e = this.f25332b.mo36188e(mo36118k(), bVar.mo36135d(), mo36123r(), bVar.mo36138f());
        int i = C4784b.f25345b[e.mo36174b().ordinal()];
        if (i == 1) {
            return bVar.mo36157o(e.mo36175c(), e.mo36176d(), this.f25334d.mo46659b());
        } else if (i == 2) {
            return bVar.mo36159q("BAD CONFIG");
        } else {
            if (i == 3) {
                mo36108B((String) null);
                return bVar.mo36160r();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: k */
    public String mo36118k() {
        return this.f25331a.mo42488k().mo29851b();
    }

    /* renamed from: l */
    public String mo36119l() {
        return this.f25331a.mo42488k().mo29852c();
    }

    /* renamed from: m */
    public final synchronized String mo36120m() {
        return this.f25340j;
    }

    /* renamed from: p */
    public final C4788b mo36121p() {
        C4788b c;
        synchronized (f25329m) {
            dw0 a = dw0.m43715a(this.f25331a.mo42485h(), "generatefid.lock");
            try {
                c = this.f25333c.mo36132c();
                if (a != null) {
                    a.mo42076b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo42076b();
                }
                throw th;
            }
        }
        return c;
    }

    /* renamed from: q */
    public final C4788b mo36122q() {
        C4788b c;
        synchronized (f25329m) {
            dw0 a = dw0.m43715a(this.f25331a.mo42485h(), "generatefid.lock");
            try {
                c = this.f25333c.mo36132c();
                if (c.mo36153j()) {
                    c = this.f25333c.mo36130a(c.mo36162t(mo36126x(c)));
                }
                if (a != null) {
                    a.mo42076b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo42076b();
                }
                throw th;
            }
        }
        return c;
    }

    /* renamed from: r */
    public String mo36123r() {
        return this.f25331a.mo42488k().mo29854e();
    }

    /* renamed from: s */
    public final void mo36124s(C4788b bVar) {
        synchronized (f25329m) {
            dw0 a = dw0.m43715a(this.f25331a.mo42485h(), "generatefid.lock");
            try {
                this.f25333c.mo36130a(bVar);
                if (a != null) {
                    a.mo42076b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo42076b();
                }
                throw th;
            }
        }
    }

    /* renamed from: w */
    public final void mo36125w() {
        cu4.m43218h(mo36119l(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        cu4.m43218h(mo36123r(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        cu4.m43218h(mo36118k(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        cu4.m43212b(p77.m49817h(mo36119l()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        cu4.m43212b(p77.m49816g(mo36118k()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: x */
    public final String mo36126x(C4788b bVar) {
        if ((!this.f25331a.mo42487j().equals("CHIME_ANDROID_SDK") && !this.f25331a.mo42492r()) || !bVar.mo36156m()) {
            return this.f25336f.mo49799a();
        }
        String f = this.f25335e.mo43897f();
        if (TextUtils.isEmpty(f)) {
            return this.f25336f.mo49799a();
        }
        return f;
    }

    /* renamed from: y */
    public final C4788b mo36127y(C4788b bVar) throws FirebaseInstallationsException {
        String str;
        if (bVar.mo36135d() == null || bVar.mo36135d().length() != 11) {
            str = null;
        } else {
            str = this.f25335e.mo43900i();
        }
        InstallationResponse d = this.f25332b.mo36187d(mo36118k(), bVar.mo36135d(), mo36123r(), mo36119l(), str);
        int i = C4784b.f25344a[d.mo36166e().ordinal()];
        if (i == 1) {
            return bVar.mo36161s(d.mo36164c(), d.mo36165d(), this.f25334d.mo46659b(), d.mo36163b().mo36175c(), d.mo36163b().mo36176d());
        } else if (i == 2) {
            return bVar.mo36159q("BAD CONFIG");
        } else {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: z */
    public final void mo36128z(Exception exc) {
        synchronized (this.f25337g) {
            Iterator<y86> it = this.f25342l.iterator();
            while (it.hasNext()) {
                if (it.next().mo47753a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public C4782a(ExecutorService executorService, f22 f22, C4798c cVar, PersistedInstallation persistedInstallation, p77 p77, iq2 iq2, z65 z65) {
        this.f25337g = new Object();
        this.f25341k = new HashSet();
        this.f25342l = new ArrayList();
        this.f25331a = f22;
        this.f25332b = cVar;
        this.f25333c = persistedInstallation;
        this.f25334d = p77;
        this.f25335e = iq2;
        this.f25336f = z65;
        this.f25338h = executorService;
        this.f25339i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f25330n);
    }
}
