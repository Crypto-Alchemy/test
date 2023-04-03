package p000;

import android.content.Context;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1550a;
import java.util.UUID;

/* renamed from: hm7 */
/* compiled from: WorkForegroundUpdater */
public class hm7 implements y72 {

    /* renamed from: d */
    public static final String f12967d = qk3.m25728f("WMFgUpdater");

    /* renamed from: a */
    public final bm6 f12968a;

    /* renamed from: b */
    public final x72 f12969b;

    /* renamed from: c */
    public final bn7 f12970c;

    /* renamed from: hm7$a */
    /* compiled from: WorkForegroundUpdater */
    public class C2495a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ry5 f12971a;

        /* renamed from: d */
        public final /* synthetic */ UUID f12972d;

        /* renamed from: e */
        public final /* synthetic */ w72 f12973e;

        /* renamed from: g */
        public final /* synthetic */ Context f12974g;

        public C2495a(ry5 ry5, UUID uuid, w72 w72, Context context) {
            this.f12971a = ry5;
            this.f12972d = uuid;
            this.f12973e = w72;
            this.f12974g = context;
        }

        public void run() {
            try {
                if (!this.f12971a.isCancelled()) {
                    String uuid = this.f12972d.toString();
                    WorkInfo.State e = hm7.this.f12970c.mo11714e(uuid);
                    if (e == null || e.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    hm7.this.f12969b.mo26574a(uuid, this.f12973e);
                    this.f12974g.startService(C1550a.m10597a(this.f12974g, uuid, this.f12973e));
                }
                this.f12971a.mo11044p(null);
            } catch (Throwable th) {
                this.f12971a.mo11045q(th);
            }
        }
    }

    public hm7(WorkDatabase workDatabase, x72 x72, bm6 bm6) {
        this.f12969b = x72;
        this.f12968a = bm6;
        this.f12970c = workDatabase.mo10955N();
    }

    /* renamed from: a */
    public hi3<Void> mo21309a(Context context, UUID uuid, w72 w72) {
        ry5 t = ry5.m26468t();
        this.f12968a.mo11700b(new C2495a(t, uuid, w72, context));
        return t;
    }
}
