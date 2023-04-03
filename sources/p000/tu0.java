package p000;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.jk3;
import p000.rv0;

/* renamed from: tu0 */
/* compiled from: CrashlyticsController */
public class tu0 {

    /* renamed from: t */
    public static final FilenameFilter f34349t = new su0();

    /* renamed from: a */
    public final Context f34350a;

    /* renamed from: b */
    public final m11 f34351b;

    /* renamed from: c */
    public final wu0 f34352c;

    /* renamed from: d */
    public final u57 f34353d;

    /* renamed from: e */
    public final ru0 f34354e;

    /* renamed from: f */
    public final zp2 f34355f;

    /* renamed from: g */
    public final y02 f34356g;

    /* renamed from: h */
    public final C6670wn f34357h;

    /* renamed from: i */
    public final jk3.C6103b f34358i;

    /* renamed from: j */
    public final jk3 f34359j;

    /* renamed from: k */
    public final xu0 f34360k;

    /* renamed from: l */
    public final String f34361l;

    /* renamed from: m */
    public final C6700xf f34362m;

    /* renamed from: n */
    public final ux5 f34363n;

    /* renamed from: o */
    public rv0 f34364o;

    /* renamed from: p */
    public final xl6<Boolean> f34365p = new xl6<>();

    /* renamed from: q */
    public final xl6<Boolean> f34366q = new xl6<>();

    /* renamed from: r */
    public final xl6<Void> f34367r = new xl6<>();

    /* renamed from: s */
    public final AtomicBoolean f34368s = new AtomicBoolean(false);

    /* renamed from: tu0$a */
    /* compiled from: CrashlyticsController */
    public class C6543a implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ long f34369a;

        public C6543a(long j) {
            this.f34369a = j;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f34369a);
            tu0.this.f34362m.mo45344b("_ae", bundle);
            return null;
        }
    }

    /* renamed from: tu0$b */
    /* compiled from: CrashlyticsController */
    public class C6544b implements rv0.C6458a {
        public C6544b() {
        }

        /* renamed from: a */
        public void mo47510a(az5 az5, Thread thread, Throwable th) {
            tu0.this.mo48193F(az5, thread, th);
        }
    }

    /* renamed from: tu0$c */
    /* compiled from: CrashlyticsController */
    public class C6545c implements Callable<tl6<Void>> {

        /* renamed from: a */
        public final /* synthetic */ long f34372a;

        /* renamed from: d */
        public final /* synthetic */ Throwable f34373d;

        /* renamed from: e */
        public final /* synthetic */ Thread f34374e;

        /* renamed from: g */
        public final /* synthetic */ az5 f34375g;

        /* renamed from: tu0$c$a */
        /* compiled from: CrashlyticsController */
        public class C6546a implements kd6<C5845fo, Void> {

            /* renamed from: a */
            public final /* synthetic */ Executor f34377a;

            public C6546a(Executor executor) {
                this.f34377a = executor;
            }

            /* renamed from: b */
            public tl6<Void> mo44766a(C5845fo foVar) throws Exception {
                if (foVar == null) {
                    rk3.m51112f().mo47431k("Received null app settings, cannot send reports at crash time.");
                    return jm6.m46619e(null);
                }
                return jm6.m46621g(tu0.this.mo48198M(), tu0.this.f34363n.mo48549t(this.f34377a));
            }
        }

        public C6545c(long j, Throwable th, Thread thread, az5 az5) {
            this.f34372a = j;
            this.f34373d = th;
            this.f34374e = thread;
            this.f34375g = az5;
        }

        /* renamed from: a */
        public tl6<Void> call() throws Exception {
            long b = tu0.m52462E(this.f34372a);
            String c = tu0.this.mo48217z();
            if (c == null) {
                rk3.m51112f().mo47425d("Tried to write a fatal exception while no session was open.");
                return jm6.m46619e(null);
            }
            tu0.this.f34352c.mo49275a();
            tu0.this.f34363n.mo48547r(this.f34373d, this.f34374e, c, b);
            tu0.this.mo48212s(this.f34372a);
            tu0.this.mo48209p(this.f34375g);
            tu0.this.mo48211r();
            if (!tu0.this.f34351b.mo45599d()) {
                return jm6.m46619e(null);
            }
            Executor c2 = tu0.this.f34354e.mo47498c();
            return this.f34375g.mo29404b().mo48147r(c2, new C6546a(c2));
        }
    }

    /* renamed from: tu0$d */
    /* compiled from: CrashlyticsController */
    public class C6547d implements kd6<Void, Boolean> {
        public C6547d() {
        }

        /* renamed from: b */
        public tl6<Boolean> mo44766a(Void voidR) throws Exception {
            return jm6.m46619e(Boolean.TRUE);
        }
    }

    /* renamed from: tu0$e */
    /* compiled from: CrashlyticsController */
    public class C6548e implements kd6<Boolean, Void> {

        /* renamed from: a */
        public final /* synthetic */ tl6 f34380a;

        /* renamed from: tu0$e$a */
        /* compiled from: CrashlyticsController */
        public class C6549a implements Callable<tl6<Void>> {

            /* renamed from: a */
            public final /* synthetic */ Boolean f34382a;

            /* renamed from: tu0$e$a$a */
            /* compiled from: CrashlyticsController */
            public class C6550a implements kd6<C5845fo, Void> {

                /* renamed from: a */
                public final /* synthetic */ Executor f34384a;

                public C6550a(Executor executor) {
                    this.f34384a = executor;
                }

                /* renamed from: b */
                public tl6<Void> mo44766a(C5845fo foVar) throws Exception {
                    if (foVar == null) {
                        rk3.m51112f().mo47431k("Received null app settings at app startup. Cannot send cached reports");
                        return jm6.m46619e(null);
                    }
                    tl6 unused = tu0.this.mo48198M();
                    tu0.this.f34363n.mo48549t(this.f34384a);
                    tu0.this.f34367r.mo49507e(null);
                    return jm6.m46619e(null);
                }
            }

            public C6549a(Boolean bool) {
                this.f34382a = bool;
            }

            /* renamed from: a */
            public tl6<Void> call() throws Exception {
                if (!this.f34382a.booleanValue()) {
                    rk3.m51112f().mo47429i("Deleting cached crash reports...");
                    tu0.m52478n(tu0.this.mo48195I());
                    tu0.this.f34363n.mo48548s();
                    tu0.this.f34367r.mo49507e(null);
                    return jm6.m46619e(null);
                }
                rk3.m51112f().mo47423b("Sending cached crash reports...");
                tu0.this.f34351b.mo45598c(this.f34382a.booleanValue());
                Executor c = tu0.this.f34354e.mo47498c();
                return C6548e.this.f34380a.mo48147r(c, new C6550a(c));
            }
        }

        public C6548e(tl6 tl6) {
            this.f34380a = tl6;
        }

        /* renamed from: b */
        public tl6<Void> mo44766a(Boolean bool) throws Exception {
            return tu0.this.f34354e.mo47503h(new C6549a(bool));
        }
    }

    /* renamed from: tu0$f */
    /* compiled from: CrashlyticsController */
    public class C6551f implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ long f34386a;

        /* renamed from: d */
        public final /* synthetic */ String f34387d;

        public C6551f(long j, String str) {
            this.f34386a = j;
            this.f34387d = str;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            if (tu0.this.mo48194G()) {
                return null;
            }
            tu0.this.f34359j.mo44481g(this.f34386a, this.f34387d);
            return null;
        }
    }

    /* renamed from: tu0$g */
    /* compiled from: CrashlyticsController */
    public class C6552g implements Callable<Void> {
        public C6552g() {
        }

        /* renamed from: a */
        public Void call() throws Exception {
            tu0.this.mo48211r();
            return null;
        }
    }

    public tu0(Context context, ru0 ru0, zp2 zp2, m11 m11, y02 y02, wu0 wu0, C6670wn wnVar, u57 u57, jk3 jk3, jk3.C6103b bVar, ux5 ux5, xu0 xu0, C6700xf xfVar) {
        this.f34350a = context;
        this.f34354e = ru0;
        this.f34355f = zp2;
        this.f34351b = m11;
        this.f34356g = y02;
        this.f34352c = wu0;
        this.f34357h = wnVar;
        this.f34353d = u57;
        this.f34359j = jk3;
        this.f34358i = bVar;
        this.f34360k = xu0;
        this.f34361l = wnVar.f35397g.mo48103a();
        this.f34362m = xfVar;
        this.f34363n = ux5;
    }

    /* renamed from: A */
    public static long m52460A() {
        return m52462E(System.currentTimeMillis());
    }

    /* renamed from: C */
    public static List<y34> m52461C(a44 a44, String str, File file, byte[] bArr) {
        xu3 xu3 = new xu3(file);
        File c = xu3.mo49552c(str);
        File b = xu3.mo49551b(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h70("logs_file", "logs", bArr));
        arrayList.add(new k02("crash_meta_file", "metadata", a44.mo28828c()));
        arrayList.add(new k02("session_meta_file", "session", a44.mo28831f()));
        arrayList.add(new k02("app_meta_file", "app", a44.mo28829d()));
        arrayList.add(new k02("device_meta_file", "device", a44.mo28826a()));
        arrayList.add(new k02("os_meta_file", "os", a44.mo28830e()));
        arrayList.add(new k02("minidump_file", "minidump", a44.mo28827b()));
        arrayList.add(new k02("user_meta_file", "user", c));
        arrayList.add(new k02("keys_file", "keys", b));
        return arrayList;
    }

    /* renamed from: E */
    public static long m52462E(long j) {
        return j / 1000;
    }

    /* renamed from: J */
    public static File[] m52464J(File file, FilenameFilter filenameFilter) {
        return m52479u(file.listFiles(filenameFilter));
    }

    /* renamed from: n */
    public static void m52478n(File[] fileArr) {
        if (fileArr != null) {
            for (File delete : fileArr) {
                delete.delete();
            }
        }
    }

    /* renamed from: u */
    public static File[] m52479u(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* renamed from: x */
    public static boolean m52480x() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: B */
    public File mo48191B() {
        return this.f34356g.mo49576a();
    }

    /* renamed from: D */
    public File mo48192D() {
        return new File(mo48191B(), "native-sessions");
    }

    /* renamed from: F */
    public synchronized void mo48193F(az5 az5, Thread thread, Throwable th) {
        rk3 f = rk3.m51112f();
        f.mo47423b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            o77.m49176b(this.f34354e.mo47503h(new C6545c(System.currentTimeMillis(), th, thread, az5)));
        } catch (Exception e) {
            rk3.m51112f().mo47426e("Error handling uncaught exception", e);
        }
        return;
    }

    /* renamed from: G */
    public boolean mo48194G() {
        rv0 rv0 = this.f34364o;
        if (rv0 == null || !rv0.mo47508a()) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public File[] mo48195I() {
        return mo48196K(f34349t);
    }

    /* renamed from: K */
    public final File[] mo48196K(FilenameFilter filenameFilter) {
        return m52464J(mo48191B(), filenameFilter);
    }

    /* renamed from: L */
    public final tl6<Void> mo48197L(long j) {
        if (m52480x()) {
            rk3.m51112f().mo47431k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return jm6.m46619e(null);
        }
        rk3.m51112f().mo47423b("Logging app exception event to Firebase Analytics");
        return jm6.m46617c(new ScheduledThreadPoolExecutor(1), new C6543a(j));
    }

    /* renamed from: M */
    public final tl6<Void> mo48198M() {
        ArrayList arrayList = new ArrayList();
        for (File file : mo48195I()) {
            try {
                arrayList.add(mo48197L(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                rk3.m51112f().mo47431k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return jm6.m46620f(arrayList);
    }

    /* renamed from: N */
    public void mo48199N() {
        this.f34354e.mo47502g(new C6552g());
    }

    /* renamed from: O */
    public tl6<Void> mo48200O(tl6<C5845fo> tl6) {
        if (!this.f34363n.mo48541k()) {
            rk3.m51112f().mo47429i("No crash reports are available to be sent.");
            this.f34365p.mo49507e(Boolean.FALSE);
            return jm6.m46619e(null);
        }
        rk3.m51112f().mo47429i("Crash reports are available to be sent.");
        return mo48201P().mo48146q(new C6548e(tl6));
    }

    /* renamed from: P */
    public final tl6<Boolean> mo48201P() {
        if (this.f34351b.mo45599d()) {
            rk3.m51112f().mo47423b("Automatic data collection is enabled. Allowing upload.");
            this.f34365p.mo49507e(Boolean.FALSE);
            return jm6.m46619e(Boolean.TRUE);
        }
        rk3.m51112f().mo47423b("Automatic data collection is disabled.");
        rk3.m51112f().mo47429i("Notifying that unsent reports are available.");
        this.f34365p.mo49507e(Boolean.TRUE);
        tl6<TContinuationResult> q = this.f34351b.mo45601g().mo48146q(new C6547d());
        rk3.m51112f().mo47423b("Waiting for send/deleteUnsentReports to be called.");
        return o77.m49179e(q, this.f34366q.mo49503a());
    }

    /* renamed from: Q */
    public final void mo48202Q(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            List a = ((ActivityManager) this.f34350a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 1);
            if (a.size() != 0) {
                jk3 jk3 = new jk3(this.f34350a, this.f34358i, str);
                u57 u57 = new u57();
                u57.mo48323c(new xu3(mo48191B()).mo49553e(str));
                this.f34363n.mo48545p(str, (ApplicationExitInfo) a.get(0), jk3, u57);
                return;
            }
            return;
        }
        rk3 f = rk3.m51112f();
        f.mo47429i("ANR feature enabled, but device is API " + i);
    }

    /* renamed from: R */
    public final void mo48203R(String str, long j) {
        this.f34360k.mo46260c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{vu0.m53527i()}), j);
    }

    /* renamed from: S */
    public final void mo48204S(String str) {
        String f = this.f34355f.mo49897f();
        C6670wn wnVar = this.f34357h;
        String str2 = str;
        this.f34360k.mo46264g(str2, f, wnVar.f35395e, wnVar.f35396f, this.f34355f.mo48534a(), DeliveryMechanism.determineFrom(this.f34357h.f35393c).getId(), this.f34361l);
    }

    /* renamed from: T */
    public final void mo48205T(String str) {
        Context y = mo48216y();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int l = CommonUtils.m38409l();
        String str2 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s = CommonUtils.m38416s();
        long blockSize = (long) statFs.getBlockSize();
        boolean x = CommonUtils.m38421x(y);
        int m = CommonUtils.m38410m(y);
        String str3 = Build.MANUFACTURER;
        String str4 = Build.PRODUCT;
        this.f34360k.mo46262e(str, l, str2, availableProcessors, s, blockSize * ((long) statFs.getBlockCount()), x, m, str3, str4);
    }

    /* renamed from: U */
    public final void mo48206U(String str) {
        this.f34360k.mo46265h(str, Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.m38422y(mo48216y()));
    }

    /* renamed from: V */
    public void mo48207V(long j, String str) {
        this.f34354e.mo47502g(new C6551f(j, str));
    }

    /* renamed from: o */
    public boolean mo48208o() {
        if (!this.f34352c.mo49277c()) {
            String z = mo48217z();
            if (z == null || !this.f34360k.mo46263f(z)) {
                return false;
            }
            return true;
        }
        rk3.m51112f().mo47429i("Found previous crash marker.");
        this.f34352c.mo49278d();
        return true;
    }

    /* renamed from: p */
    public void mo48209p(az5 az5) {
        mo48210q(false, az5);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48210q(boolean r5, p000.az5 r6) {
        /*
            r4 = this;
            ux5 r0 = r4.f34363n
            java.util.List r0 = r0.mo48542m()
            int r1 = r0.size()
            if (r1 > r5) goto L_0x0016
            rk3 r5 = p000.rk3.m51112f()
            java.lang.String r6 = "No open sessions to be closed."
            r5.mo47429i(r6)
            return
        L_0x0016:
            java.lang.Object r1 = r0.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            xy5 r6 = r6.mo29403a()
            pz1 r6 = r6.mo49570a()
            boolean r6 = r6.f32882b
            if (r6 == 0) goto L_0x002b
            r4.mo48202Q(r1)
        L_0x002b:
            xu0 r6 = r4.f34360k
            boolean r6 = r6.mo46263f(r1)
            if (r6 == 0) goto L_0x0056
            r4.mo48214v(r1)
            xu0 r6 = r4.f34360k
            boolean r6 = r6.mo46258a(r1)
            if (r6 != 0) goto L_0x0056
            rk3 r6 = p000.rk3.m51112f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not finalize native session: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r6.mo47431k(r1)
        L_0x0056:
            r6 = 0
            if (r5 == 0) goto L_0x0061
            r5 = 0
            java.lang.Object r5 = r0.get(r5)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
        L_0x0061:
            ux5 r5 = r4.f34363n
            long r0 = m52460A()
            r5.mo48540i(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tu0.mo48210q(boolean, az5):void");
    }

    /* renamed from: r */
    public final void mo48211r() {
        long A = m52460A();
        String o70 = new o70(this.f34355f).toString();
        rk3 f = rk3.m51112f();
        f.mo47423b("Opening a new session with ID " + o70);
        this.f34360k.mo46261d(o70);
        mo48203R(o70, A);
        mo48204S(o70);
        mo48206U(o70);
        mo48205T(o70);
        this.f34359j.mo44479e(o70);
        this.f34363n.mo48543n(o70, A);
    }

    /* renamed from: s */
    public final void mo48212s(long j) {
        try {
            File B = mo48191B();
            new File(B, ".ae" + j).createNewFile();
        } catch (IOException e) {
            rk3.m51112f().mo47432l("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: t */
    public void mo48213t(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, az5 az5) {
        mo48199N();
        rv0 rv0 = new rv0(new C6544b(), az5, uncaughtExceptionHandler);
        this.f34364o = rv0;
        Thread.setDefaultUncaughtExceptionHandler(rv0);
    }

    /* renamed from: v */
    public final void mo48214v(String str) {
        rk3 f = rk3.m51112f();
        f.mo47429i("Finalizing native report for session " + str);
        a44 b = this.f34360k.mo46259b(str);
        File b2 = b.mo28827b();
        if (b2 == null || !b2.exists()) {
            rk3 f2 = rk3.m51112f();
            f2.mo47431k("No minidump data found for session " + str);
            return;
        }
        long lastModified = b2.lastModified();
        jk3 jk3 = new jk3(this.f34350a, this.f34358i, str);
        File file = new File(mo48192D(), str);
        if (!file.mkdirs()) {
            rk3.m51112f().mo47431k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        mo48212s(lastModified);
        List<y34> C = m52461C(b, str, mo48191B(), jk3.mo44476b());
        z34.m54946b(file, C);
        this.f34363n.mo48539h(str, C);
        jk3.mo44475a();
    }

    /* renamed from: w */
    public boolean mo48215w(az5 az5) {
        this.f34354e.mo47497b();
        if (mo48194G()) {
            rk3.m51112f().mo47431k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        rk3.m51112f().mo47429i("Finalizing previously open sessions.");
        try {
            mo48210q(true, az5);
            rk3.m51112f().mo47429i("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            rk3.m51112f().mo47426e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* renamed from: y */
    public final Context mo48216y() {
        return this.f34350a;
    }

    /* renamed from: z */
    public final String mo48217z() {
        List<String> m = this.f34363n.mo48542m();
        if (!m.isEmpty()) {
            return m.get(0);
        }
        return null;
    }
}
