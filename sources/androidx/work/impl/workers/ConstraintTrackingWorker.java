package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements bm7 {

    /* renamed from: B */
    public static final String f7670B = qk3.m25728f("ConstraintTrkngWrkr");

    /* renamed from: A */
    public ListenableWorker f7671A;

    /* renamed from: r */
    public WorkerParameters f7672r;

    /* renamed from: s */
    public final Object f7673s = new Object();

    /* renamed from: x */
    public volatile boolean f7674x = false;

    /* renamed from: y */
    public ry5<ListenableWorker.C1509a> f7675y = ry5.m26468t();

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    public class C1562a implements Runnable {
        public C1562a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.mo11063u();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    public class C1563b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ hi3 f7677a;

        public C1563b(hi3 hi3) {
            this.f7677a = hi3;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f7673s) {
                if (ConstraintTrackingWorker.this.f7674x) {
                    ConstraintTrackingWorker.this.mo11062t();
                } else {
                    ConstraintTrackingWorker.this.f7675y.mo11046r(this.f7677a);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f7672r = workerParameters;
    }

    /* renamed from: b */
    public void mo10982b(List<String> list) {
        qk3.m25726c().mo25135a(f7670B, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f7673s) {
            this.f7674x = true;
        }
    }

    /* renamed from: f */
    public void mo10985f(List<String> list) {
    }

    /* renamed from: h */
    public bm6 mo10873h() {
        return nm7.m23322m(mo10869a()).mo23744r();
    }

    /* renamed from: j */
    public boolean mo10875j() {
        ListenableWorker listenableWorker = this.f7671A;
        if (listenableWorker == null || !listenableWorker.mo10875j()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public void mo10851m() {
        super.mo10851m();
        ListenableWorker listenableWorker = this.f7671A;
        if (listenableWorker != null && !listenableWorker.mo10876k()) {
            this.f7671A.mo10880q();
        }
    }

    /* renamed from: p */
    public hi3<ListenableWorker.C1509a> mo10852p() {
        mo10870c().execute(new C1562a());
        return this.f7675y;
    }

    /* renamed from: r */
    public WorkDatabase mo11060r() {
        return nm7.m23322m(mo10869a()).mo23743q();
    }

    /* renamed from: s */
    public void mo11061s() {
        this.f7675y.mo11044p(ListenableWorker.C1509a.m10432a());
    }

    /* renamed from: t */
    public void mo11062t() {
        this.f7675y.mo11044p(ListenableWorker.C1509a.m10433b());
    }

    /* renamed from: u */
    public void mo11063u() {
        String l = mo10872g().mo10927l("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(l)) {
            qk3.m25726c().mo25136b(f7670B, "No worker to delegate to.", new Throwable[0]);
            mo11061s();
            return;
        }
        ListenableWorker b = mo10874i().mo21580b(mo10869a(), l, this.f7672r);
        this.f7671A = b;
        if (b == null) {
            qk3.m25726c().mo25135a(f7670B, "No worker to delegate to.", new Throwable[0]);
            mo11061s();
            return;
        }
        an7 f = mo11060r().mo10955N().mo11715f(mo10871e().toString());
        if (f == null) {
            mo11061s();
            return;
        }
        cm7 cm7 = new cm7(mo10869a(), mo10873h(), this);
        cm7.mo12128d(Collections.singletonList(f));
        if (cm7.mo12127c(mo10871e().toString())) {
            qk3.m25726c().mo25135a(f7670B, String.format("Constraints met for delegate %s", new Object[]{l}), new Throwable[0]);
            try {
                hi3<ListenableWorker.C1509a> p = this.f7671A.mo10852p();
                p.mo10867l(new C1563b(p), mo10870c());
            } catch (Throwable th) {
                qk3 c = qk3.m25726c();
                String str = f7670B;
                c.mo25135a(str, String.format("Delegated worker %s threw exception in startWork.", new Object[]{l}), th);
                synchronized (this.f7673s) {
                    if (this.f7674x) {
                        qk3.m25726c().mo25135a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        mo11062t();
                    } else {
                        mo11061s();
                    }
                }
            }
        } else {
            qk3.m25726c().mo25135a(f7670B, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{l}), new Throwable[0]);
            mo11062t();
        }
    }
}
