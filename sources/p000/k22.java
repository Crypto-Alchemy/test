package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: k22 */
/* compiled from: FirebaseCrashlytics */
public class k22 {

    /* renamed from: a */
    public final vu0 f30698a;

    /* renamed from: k22$a */
    /* compiled from: FirebaseCrashlytics */
    public class C6133a implements ms0<Void, Object> {
        /* renamed from: a */
        public Object mo41856a(tl6<Void> tl6) throws Exception {
            if (tl6.mo48145p()) {
                return null;
            }
            rk3.m51112f().mo47426e("Error fetching settings.", tl6.mo48140k());
            return null;
        }
    }

    /* renamed from: k22$b */
    /* compiled from: FirebaseCrashlytics */
    public class C6134b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ boolean f30699a;

        /* renamed from: d */
        public final /* synthetic */ vu0 f30700d;

        /* renamed from: e */
        public final /* synthetic */ yy5 f30701e;

        public C6134b(boolean z, vu0 vu0, yy5 yy5) {
            this.f30699a = z;
            this.f30700d = vu0;
            this.f30701e = yy5;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            if (!this.f30699a) {
                return null;
            }
            this.f30700d.mo48810g(this.f30701e);
            return null;
        }
    }

    public k22(vu0 vu0) {
        this.f30698a = vu0;
    }

    /* renamed from: a */
    public static k22 m46857a(f22 f22, o22 o22, ly4<xu0> ly4, ya1<C6436rf> ya1) {
        Context h = f22.mo42485h();
        String packageName = h.getPackageName();
        rk3 f = rk3.m51112f();
        f.mo47427g("Initializing Firebase Crashlytics " + vu0.m53527i() + " for " + packageName);
        f22 f222 = f22;
        m11 m11 = new m11(f22);
        o22 o222 = o22;
        zp2 zp2 = new zp2(h, packageName, o22, m11);
        ny4 ny4 = new ny4(ly4);
        C6661wf wfVar = new C6661wf(ya1);
        f22 f223 = f22;
        zp2 zp22 = zp2;
        m11 m112 = m11;
        vu0 vu0 = new vu0(f223, zp22, ny4, m112, wfVar.mo49191e(), wfVar.mo49190d(), zu1.m55260c("Crashlytics Exception Handler"));
        String c = f22.mo42488k().mo29852c();
        String n = CommonUtils.m38411n(h);
        rk3 f2 = rk3.m51112f();
        f2.mo47423b("Mapping file ID is: " + n);
        try {
            C6670wn a = C6670wn.m53989a(h, zp2, c, n, new tf5(h));
            rk3 f3 = rk3.m51112f();
            f3.mo47429i("Installer package name is: " + a.f35393c);
            ExecutorService c2 = zu1.m55260c("com.google.firebase.crashlytics.startup");
            yy5 l = yy5.m54904l(h, c, zp2, new en2(), a.f35395e, a.f35396f, m11);
            l.mo49758p(c2).mo48138i(c2, new C6133a());
            jm6.m46617c(c2, new C6134b(vu0.mo48815n(a, l), vu0, l));
            return new k22(vu0);
        } catch (PackageManager.NameNotFoundException e) {
            rk3.m51112f().mo47426e("Error retrieving app package info.", e);
            return null;
        }
    }
}
