package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;

/* renamed from: gm7 */
/* compiled from: WorkForegroundRunnable */
public class gm7 implements Runnable {

    /* renamed from: s */
    public static final String f12486s = qk3.m25728f("WorkForegroundRunnable");

    /* renamed from: a */
    public final ry5<Void> f12487a = ry5.m26468t();

    /* renamed from: d */
    public final Context f12488d;

    /* renamed from: e */
    public final an7 f12489e;

    /* renamed from: g */
    public final ListenableWorker f12490g;

    /* renamed from: k */
    public final y72 f12491k;

    /* renamed from: r */
    public final bm6 f12492r;

    /* renamed from: gm7$a */
    /* compiled from: WorkForegroundRunnable */
    public class C2406a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ry5 f12493a;

        public C2406a(ry5 ry5) {
            this.f12493a = ry5;
        }

        public void run() {
            this.f12493a.mo11046r(gm7.this.f12490g.mo10850d());
        }
    }

    /* renamed from: gm7$b */
    /* compiled from: WorkForegroundRunnable */
    public class C2407b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ry5 f12495a;

        public C2407b(ry5 ry5) {
            this.f12495a = ry5;
        }

        public void run() {
            try {
                w72 w72 = (w72) this.f12495a.get();
                if (w72 != null) {
                    qk3.m25726c().mo25135a(gm7.f12486s, String.format("Updating notification for %s", new Object[]{gm7.this.f12489e.f206c}), new Throwable[0]);
                    gm7.this.f12490g.mo10878n(true);
                    gm7 gm7 = gm7.this;
                    gm7.f12487a.mo11046r(gm7.f12491k.mo21309a(gm7.f12488d, gm7.f12490g.mo10871e(), w72));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{gm7.this.f12489e.f206c}));
            } catch (Throwable th) {
                gm7.this.f12487a.mo11045q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public gm7(Context context, an7 an7, ListenableWorker listenableWorker, y72 y72, bm6 bm6) {
        this.f12488d = context;
        this.f12489e = an7;
        this.f12490g = listenableWorker;
        this.f12491k = y72;
        this.f12492r = bm6;
    }

    /* renamed from: a */
    public hi3<Void> mo20702a() {
        return this.f12487a;
    }

    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f12489e.f220q || x40.m29874c()) {
            this.f12487a.mo11044p(null);
            return;
        }
        ry5 t = ry5.m26468t();
        this.f12492r.mo11699a().execute(new C2406a(t));
        t.mo10867l(new C2407b(t), this.f12492r.mo11699a());
    }
}
