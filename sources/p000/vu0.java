package p000;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.jk3;

/* renamed from: vu0 */
/* compiled from: CrashlyticsCore */
public class vu0 {

    /* renamed from: a */
    public final Context f35138a;

    /* renamed from: b */
    public final f22 f35139b;

    /* renamed from: c */
    public final m11 f35140c;

    /* renamed from: d */
    public final long f35141d = System.currentTimeMillis();

    /* renamed from: e */
    public wu0 f35142e;

    /* renamed from: f */
    public wu0 f35143f;

    /* renamed from: g */
    public boolean f35144g;

    /* renamed from: h */
    public tu0 f35145h;

    /* renamed from: i */
    public final zp2 f35146i;

    /* renamed from: j */
    public final e40 f35147j;

    /* renamed from: k */
    public final C6700xf f35148k;

    /* renamed from: l */
    public final ExecutorService f35149l;

    /* renamed from: m */
    public final ru0 f35150m;

    /* renamed from: n */
    public final xu0 f35151n;

    /* renamed from: vu0$a */
    /* compiled from: CrashlyticsCore */
    public class C6631a implements Callable<tl6<Void>> {

        /* renamed from: a */
        public final /* synthetic */ az5 f35152a;

        public C6631a(az5 az5) {
            this.f35152a = az5;
        }

        /* renamed from: a */
        public tl6<Void> call() throws Exception {
            return vu0.this.mo48809f(this.f35152a);
        }
    }

    /* renamed from: vu0$b */
    /* compiled from: CrashlyticsCore */
    public class C6632b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ az5 f35154a;

        public C6632b(az5 az5) {
            this.f35154a = az5;
        }

        public void run() {
            tl6 unused = vu0.this.mo48809f(this.f35154a);
        }
    }

    /* renamed from: vu0$c */
    /* compiled from: CrashlyticsCore */
    public class C6633c implements Callable<Boolean> {
        public C6633c() {
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            try {
                boolean d = vu0.this.f35142e.mo49278d();
                if (!d) {
                    rk3.m51112f().mo47431k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                rk3.m51112f().mo47426e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: vu0$d */
    /* compiled from: CrashlyticsCore */
    public class C6634d implements Callable<Boolean> {
        public C6634d() {
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            return Boolean.valueOf(vu0.this.f35145h.mo48208o());
        }
    }

    /* renamed from: vu0$e */
    /* compiled from: CrashlyticsCore */
    public static final class C6635e implements jk3.C6103b {

        /* renamed from: a */
        public final y02 f35158a;

        public C6635e(y02 y02) {
            this.f35158a = y02;
        }

        /* renamed from: a */
        public File mo44482a() {
            File file = new File(this.f35158a.mo49576a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    public vu0(f22 f22, zp2 zp2, xu0 xu0, m11 m11, e40 e40, C6700xf xfVar, ExecutorService executorService) {
        this.f35139b = f22;
        this.f35140c = m11;
        this.f35138a = f22.mo42485h();
        this.f35146i = zp2;
        this.f35151n = xu0;
        this.f35147j = e40;
        this.f35148k = xfVar;
        this.f35149l = executorService;
        this.f35150m = new ru0(executorService);
    }

    /* renamed from: i */
    public static String m53527i() {
        return "18.2.0";
    }

    /* renamed from: j */
    public static boolean m53528j(String str, boolean z) {
        if (!z) {
            rk3.m51112f().mo47429i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final void mo48807d() {
        try {
            this.f35144g = Boolean.TRUE.equals((Boolean) o77.m49176b(this.f35150m.mo47502g(new C6634d())));
        } catch (Exception unused) {
            this.f35144g = false;
        }
    }

    /* renamed from: e */
    public boolean mo48808e() {
        return this.f35142e.mo49277c();
    }

    /* renamed from: f */
    public final tl6<Void> mo48809f(az5 az5) {
        mo48814m();
        try {
            this.f35147j.mo29869b(new uu0(this));
            if (!az5.mo29403a().mo49570a().f32881a) {
                rk3.m51112f().mo47423b("Collection of crash reports disabled in Crashlytics settings.");
                return jm6.m46618d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f35145h.mo48215w(az5)) {
                rk3.m51112f().mo47431k("Previous sessions could not be finalized.");
            }
            tl6<Void> O = this.f35145h.mo48200O(az5.mo29404b());
            mo48813l();
            return O;
        } catch (Exception e) {
            rk3.m51112f().mo47426e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return jm6.m46618d(e);
        } finally {
            mo48813l();
        }
    }

    /* renamed from: g */
    public tl6<Void> mo48810g(az5 az5) {
        return o77.m49177c(this.f35149l, new C6631a(az5));
    }

    /* renamed from: h */
    public final void mo48811h(az5 az5) {
        Future<?> submit = this.f35149l.submit(new C6632b(az5));
        rk3.m51112f().mo47423b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            rk3.m51112f().mo47426e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            rk3.m51112f().mo47426e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            rk3.m51112f().mo47426e("Crashlytics timed out during initialization.", e3);
        }
    }

    /* renamed from: k */
    public void mo48812k(String str) {
        this.f35145h.mo48207V(System.currentTimeMillis() - this.f35141d, str);
    }

    /* renamed from: l */
    public void mo48813l() {
        this.f35150m.mo47502g(new C6633c());
    }

    /* renamed from: m */
    public void mo48814m() {
        this.f35150m.mo47497b();
        this.f35142e.mo49275a();
        rk3.m51112f().mo47429i("Initialization marker file was created.");
    }

    /* renamed from: n */
    public boolean mo48815n(C6670wn wnVar, az5 az5) {
        az5 az52 = az5;
        if (m53528j(wnVar.f35392b, CommonUtils.m38408k(this.f35138a, "com.crashlytics.RequireBuildId", true))) {
            try {
                z02 z02 = new z02(this.f35138a);
                this.f35143f = new wu0("crash_marker", z02);
                this.f35142e = new wu0("initialization_marker", z02);
                u57 u57 = new u57();
                C6635e eVar = new C6635e(z02);
                jk3 jk3 = new jk3(this.f35138a, eVar);
                ux5 g = ux5.m53040g(this.f35138a, this.f35146i, z02, wnVar, jk3, u57, new qv3(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE, new zc5(10)), az5);
                Context context = this.f35138a;
                ru0 ru0 = this.f35150m;
                jk3 jk32 = jk3;
                Context context2 = context;
                C6635e eVar2 = eVar;
                ru0 ru02 = ru0;
                z02 z022 = z02;
                this.f35145h = new tu0(context2, ru02, this.f35146i, this.f35140c, z022, this.f35143f, wnVar, u57, jk32, eVar2, g, this.f35151n, this.f35148k);
                boolean e = mo48808e();
                mo48807d();
                this.f35145h.mo48213t(Thread.getDefaultUncaughtExceptionHandler(), az52);
                if (!e || !CommonUtils.m38400c(this.f35138a)) {
                    rk3.m51112f().mo47423b("Successfully configured exception handler.");
                    return true;
                }
                rk3.m51112f().mo47423b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                mo48811h(az52);
                return false;
            } catch (Exception e2) {
                rk3.m51112f().mo47426e("Crashlytics was not started due to an exception during initialization", e2);
                this.f35145h = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }
}
