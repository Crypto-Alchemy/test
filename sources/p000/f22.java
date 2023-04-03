package p000;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Marker;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.C6676ww;

/* renamed from: f22 */
/* compiled from: FirebaseApp */
public class f22 {

    /* renamed from: j */
    public static final Object f28727j = new Object();

    /* renamed from: k */
    public static final Executor f28728k = new C5828d();

    /* renamed from: l */
    public static final Map<String, f22> f28729l = new C2781lq();

    /* renamed from: a */
    public final Context f28730a;

    /* renamed from: b */
    public final String f28731b;

    /* renamed from: c */
    public final c32 f28732c;

    /* renamed from: d */
    public final jn0 f28733d;

    /* renamed from: e */
    public final AtomicBoolean f28734e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f28735f = new AtomicBoolean();

    /* renamed from: g */
    public final ff3<n11> f28736g;

    /* renamed from: h */
    public final List<C5826b> f28737h = new CopyOnWriteArrayList();

    /* renamed from: i */
    public final List<Object> f28738i = new CopyOnWriteArrayList();

    /* renamed from: f22$b */
    /* compiled from: FirebaseApp */
    public interface C5826b {
        /* renamed from: a */
        void mo42495a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: f22$c */
    /* compiled from: FirebaseApp */
    public static class C5827c implements C6676ww.C6677a {

        /* renamed from: a */
        public static AtomicReference<C5827c> f28739a = new AtomicReference<>();

        /* renamed from: c */
        public static void m44179c(Context context) {
            if (xp4.m54476a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f28739a.get() == null) {
                    C5827c cVar = new C5827c();
                    if (ao0.m10672a(f28739a, (Object) null, cVar)) {
                        C6676ww.m54080c(application);
                        C6676ww.m54079b().mo49286a(cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo42496a(boolean z) {
            synchronized (f22.f28727j) {
                Iterator it = new ArrayList(f22.f28729l.values()).iterator();
                while (it.hasNext()) {
                    f22 f22 = (f22) it.next();
                    if (f22.f28734e.get()) {
                        f22.mo42494u(z);
                    }
                }
            }
        }
    }

    /* renamed from: f22$d */
    /* compiled from: FirebaseApp */
    public static class C5828d implements Executor {

        /* renamed from: a */
        public static final Handler f28740a = new Handler(Looper.getMainLooper());

        public C5828d() {
        }

        public void execute(Runnable runnable) {
            f28740a.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: f22$e */
    /* compiled from: FirebaseApp */
    public static class C5829e extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<C5829e> f28741b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f28742a;

        public C5829e(Context context) {
            this.f28742a = context;
        }

        /* renamed from: b */
        public static void m44182b(Context context) {
            if (f28741b.get() == null) {
                C5829e eVar = new C5829e(context);
                if (ao0.m10672a(f28741b, (Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo42498c() {
            this.f28742a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (f22.f28727j) {
                for (f22 c : f22.f28729l.values()) {
                    c.mo42490m();
                }
            }
            mo42498c();
        }
    }

    public f22(Context context, String str, c32 c32) {
        this.f28730a = (Context) cu4.m43221k(context);
        this.f28731b = cu4.m43217g(str);
        this.f28732c = (c32) cu4.m43221k(c32);
        this.f28733d = jn0.m46638h(f28728k).mo44533d(bn0.m32633c(context, ComponentDiscoveryService.class).mo29653b()).mo44532c(new FirebaseCommonRegistrar()).mo44531b(sm0.m51841p(context, Context.class, new Class[0])).mo44531b(sm0.m51841p(this, f22.class, new Class[0])).mo44531b(sm0.m51841p(c32, c32.class, new Class[0])).mo44534e();
        this.f28736g = new ff3<>(new e22(this, context));
    }

    /* renamed from: i */
    public static f22 m44161i() {
        f22 f22;
        synchronized (f28727j) {
            f22 = f28729l.get("[DEFAULT]");
            if (f22 == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + rv4.m51347a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return f22;
    }

    /* renamed from: n */
    public static f22 m44162n(Context context) {
        synchronized (f28727j) {
            if (f28729l.containsKey("[DEFAULT]")) {
                f22 i = m44161i();
                return i;
            }
            c32 a = c32.m32834a(context);
            if (a == null) {
                return null;
            }
            f22 o = m44163o(context, a);
            return o;
        }
    }

    /* renamed from: o */
    public static f22 m44163o(Context context, c32 c32) {
        return m44164p(context, c32, "[DEFAULT]");
    }

    /* renamed from: p */
    public static f22 m44164p(Context context, c32 c32, String str) {
        boolean z;
        f22 f22;
        C5827c.m44179c(context);
        String t = m44166t(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f28727j) {
            Map<String, f22> map = f28729l;
            if (!map.containsKey(t)) {
                z = true;
            } else {
                z = false;
            }
            cu4.m43226p(z, "FirebaseApp name " + t + " already exists!");
            cu4.m43222l(context, "Application context cannot be null.");
            f22 = new f22(context, t, c32);
            map.put(t, f22);
        }
        f22.mo42490m();
        return f22;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ n11 m44165s(Context context) {
        return new n11(context, mo42489l(), (wy4) this.f28733d.get(wy4.class));
    }

    /* renamed from: t */
    public static String m44166t(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f22)) {
            return false;
        }
        return this.f28731b.equals(((f22) obj).mo42487j());
    }

    /* renamed from: f */
    public final void mo42483f() {
        cu4.m43226p(!this.f28735f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: g */
    public <T> T mo42484g(Class<T> cls) {
        mo42483f();
        return this.f28733d.get(cls);
    }

    /* renamed from: h */
    public Context mo42485h() {
        mo42483f();
        return this.f28730a;
    }

    public int hashCode() {
        return this.f28731b.hashCode();
    }

    /* renamed from: j */
    public String mo42487j() {
        mo42483f();
        return this.f28731b;
    }

    /* renamed from: k */
    public c32 mo42488k() {
        mo42483f();
        return this.f28732c;
    }

    /* renamed from: l */
    public String mo42489l() {
        return C6585ux.m53031c(mo42487j().getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + C6585ux.m53031c(mo42488k().mo29852c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: m */
    public final void mo42490m() {
        if (!t57.m27455a(this.f28730a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            sb.append(mo42487j());
            C5829e.m44182b(this.f28730a);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        sb2.append(mo42487j());
        this.f28733d.mo44526k(mo42492r());
    }

    /* renamed from: q */
    public boolean mo42491q() {
        mo42483f();
        return this.f28736g.get().mo45944b();
    }

    /* renamed from: r */
    public boolean mo42492r() {
        return "[DEFAULT]".equals(mo42487j());
    }

    public String toString() {
        return if4.m45711c(this).mo43587a(PublicResolver.FUNC_NAME, this.f28731b).mo43587a("options", this.f28732c).toString();
    }

    /* renamed from: u */
    public final void mo42494u(boolean z) {
        for (C5826b a : this.f28737h) {
            a.mo42495a(z);
        }
    }
}
