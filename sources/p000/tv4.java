package p000;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C1515a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1550a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p000.jn7;

/* renamed from: tv4 */
/* compiled from: Processor */
public class tv4 implements tu1, x72 {

    /* renamed from: C */
    public static final String f18287C = qk3.m25728f("Processor");

    /* renamed from: A */
    public final List<tu1> f18288A;

    /* renamed from: B */
    public final Object f18289B;

    /* renamed from: a */
    public PowerManager.WakeLock f18290a;

    /* renamed from: d */
    public Context f18291d;

    /* renamed from: e */
    public C1515a f18292e;

    /* renamed from: g */
    public bm6 f18293g;

    /* renamed from: k */
    public WorkDatabase f18294k;

    /* renamed from: r */
    public Map<String, jn7> f18295r = new HashMap();

    /* renamed from: s */
    public Map<String, jn7> f18296s = new HashMap();

    /* renamed from: x */
    public List<om5> f18297x;

    /* renamed from: y */
    public Set<String> f18298y;

    /* renamed from: tv4$a */
    /* compiled from: Processor */
    public static class C3387a implements Runnable {

        /* renamed from: a */
        public tu1 f18299a;

        /* renamed from: d */
        public String f18300d;

        /* renamed from: e */
        public hi3<Boolean> f18301e;

        public C3387a(tu1 tu1, String str, hi3<Boolean> hi3) {
            this.f18299a = tu1;
            this.f18300d = str;
            this.f18301e = hi3;
        }

        public void run() {
            boolean z;
            try {
                z = this.f18301e.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f18299a.mo10971e(this.f18300d, z);
        }
    }

    public tv4(Context context, C1515a aVar, bm6 bm6, WorkDatabase workDatabase, List<om5> list) {
        this.f18291d = context;
        this.f18292e = aVar;
        this.f18293g = bm6;
        this.f18294k = workDatabase;
        this.f18297x = list;
        this.f18298y = new HashSet();
        this.f18288A = new ArrayList();
        this.f18290a = null;
        this.f18289B = new Object();
    }

    /* renamed from: d */
    public static boolean m27933d(String str, jn7 jn7) {
        if (jn7 != null) {
            jn7.mo21989d();
            qk3.m25726c().mo25135a(f18287C, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        qk3.m25726c().mo25135a(f18287C, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    /* renamed from: a */
    public void mo26574a(String str, w72 w72) {
        synchronized (this.f18289B) {
            qk3.m25726c().mo25137d(f18287C, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
            jn7 remove = this.f18296s.remove(str);
            if (remove != null) {
                if (this.f18290a == null) {
                    PowerManager.WakeLock b = fg7.m16992b(this.f18291d, "ProcessorForegroundLck");
                    this.f18290a = b;
                    b.acquire();
                }
                this.f18295r.put(str, remove);
                zr0.m31449l(this.f18291d, C1550a.m10598c(this.f18291d, str, w72));
            }
        }
    }

    /* renamed from: b */
    public void mo26575b(String str) {
        synchronized (this.f18289B) {
            this.f18295r.remove(str);
            mo26584m();
        }
    }

    /* renamed from: c */
    public void mo26576c(tu1 tu1) {
        synchronized (this.f18289B) {
            this.f18288A.add(tu1);
        }
    }

    /* renamed from: e */
    public void mo10971e(String str, boolean z) {
        synchronized (this.f18289B) {
            this.f18296s.remove(str);
            qk3.m25726c().mo25135a(f18287C, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (tu1 e : this.f18288A) {
                e.mo10971e(str, z);
            }
        }
    }

    /* renamed from: f */
    public boolean mo26577f(String str) {
        boolean contains;
        synchronized (this.f18289B) {
            contains = this.f18298y.contains(str);
        }
        return contains;
    }

    /* renamed from: g */
    public boolean mo26578g(String str) {
        boolean z;
        synchronized (this.f18289B) {
            if (!this.f18296s.containsKey(str)) {
                if (!this.f18295r.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo26579h(String str) {
        boolean containsKey;
        synchronized (this.f18289B) {
            containsKey = this.f18295r.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: i */
    public void mo26580i(tu1 tu1) {
        synchronized (this.f18289B) {
            this.f18288A.remove(tu1);
        }
    }

    /* renamed from: j */
    public boolean mo26581j(String str) {
        return mo26582k(str, (WorkerParameters.C1514a) null);
    }

    /* renamed from: k */
    public boolean mo26582k(String str, WorkerParameters.C1514a aVar) {
        synchronized (this.f18289B) {
            if (mo26578g(str)) {
                qk3.m25726c().mo25135a(f18287C, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            jn7 a = new jn7.C2622c(this.f18291d, this.f18292e, this.f18293g, this, this.f18294k, str).mo22006c(this.f18297x).mo22005b(aVar).mo22004a();
            hi3<Boolean> b = a.mo21987b();
            b.mo10867l(new C3387a(this, str, b), this.f18293g.mo11699a());
            this.f18296s.put(str, a);
            this.f18293g.mo11701c().execute(a);
            qk3.m25726c().mo25135a(f18287C, String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: l */
    public boolean mo26583l(String str) {
        boolean d;
        synchronized (this.f18289B) {
            boolean z = true;
            qk3.m25726c().mo25135a(f18287C, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f18298y.add(str);
            jn7 remove = this.f18295r.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.f18296s.remove(str);
            }
            d = m27933d(str, remove);
            if (z) {
                mo26584m();
            }
        }
        return d;
    }

    /* renamed from: m */
    public final void mo26584m() {
        synchronized (this.f18289B) {
            if (!(!this.f18295r.isEmpty())) {
                try {
                    this.f18291d.startService(C1550a.m10599d(this.f18291d));
                } catch (Throwable th) {
                    qk3.m25726c().mo25136b(f18287C, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f18290a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f18290a = null;
                }
            }
        }
    }

    /* renamed from: n */
    public boolean mo26585n(String str) {
        boolean d;
        synchronized (this.f18289B) {
            qk3.m25726c().mo25135a(f18287C, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            d = m27933d(str, this.f18295r.remove(str));
        }
        return d;
    }

    /* renamed from: o */
    public boolean mo26586o(String str) {
        boolean d;
        synchronized (this.f18289B) {
            qk3.m25726c().mo25135a(f18287C, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            d = m27933d(str, this.f18296s.remove(str));
        }
        return d;
    }
}
