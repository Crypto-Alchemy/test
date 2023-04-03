package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;

public abstract class Worker extends ListenableWorker {

    /* renamed from: r */
    public ry5<ListenableWorker.C1509a> f7486r;

    /* renamed from: androidx.work.Worker$a */
    public class C1513a implements Runnable {
        public C1513a() {
        }

        public void run() {
            try {
                Worker.this.f7486r.mo11044p(Worker.this.mo10897r());
            } catch (Throwable th) {
                Worker.this.f7486r.mo11045q(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: p */
    public final hi3<ListenableWorker.C1509a> mo10852p() {
        this.f7486r = ry5.m26468t();
        mo10870c().execute(new C1513a());
        return this.f7486r;
    }

    /* renamed from: r */
    public abstract ListenableWorker.C1509a mo10897r();
}
