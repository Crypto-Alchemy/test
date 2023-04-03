package p000;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;

/* renamed from: z96 */
/* compiled from: StopWorkRunnable */
public class z96 implements Runnable {

    /* renamed from: g */
    public static final String f20512g = qk3.m25728f("StopWorkRunnable");

    /* renamed from: a */
    public final nm7 f20513a;

    /* renamed from: d */
    public final String f20514d;

    /* renamed from: e */
    public final boolean f20515e;

    public z96(nm7 nm7, String str, boolean z) {
        this.f20513a = nm7;
        this.f20514d = str;
        this.f20515e = z;
    }

    public void run() {
        boolean z;
        WorkDatabase q = this.f20513a.mo23743q();
        tv4 o = this.f20513a.mo23741o();
        bn7 N = q.mo10955N();
        q.mo10119e();
        try {
            boolean h = o.mo26579h(this.f20514d);
            if (this.f20515e) {
                z = this.f20513a.mo23741o().mo26585n(this.f20514d);
            } else {
                if (!h && N.mo11714e(this.f20514d) == WorkInfo.State.RUNNING) {
                    N.mo11709a(WorkInfo.State.ENQUEUED, this.f20514d);
                }
                z = this.f20513a.mo23741o().mo26586o(this.f20514d);
            }
            qk3.m25726c().mo25135a(f20512g, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f20514d, Boolean.valueOf(z)}), new Throwable[0]);
            q.mo10115C();
        } finally {
            q.mo10124j();
        }
    }
}
