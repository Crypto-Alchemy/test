package p000;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* renamed from: bl8 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class bl8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ tl6 f21359a;

    /* renamed from: d */
    public final /* synthetic */ ro8 f21360d;

    public bl8(ro8 ro8, tl6 tl6) {
        this.f21360d = ro8;
        this.f21359a = tl6;
    }

    public final void run() {
        try {
            tl6 tl6 = (tl6) this.f21360d.f33554b.mo41856a(this.f21359a);
            if (tl6 == null) {
                this.f21360d.mo42787a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = em6.f28635b;
            tl6.mo48136g(executor, this.f21360d);
            tl6.mo48134e(executor, this.f21360d);
            tl6.mo48130a(executor, this.f21360d);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f21360d.f33555c.mo48402s((Exception) e.getCause());
            } else {
                this.f21360d.f33555c.mo48402s(e);
            }
        } catch (Exception e2) {
            this.f21360d.f33555c.mo48402s(e2);
        }
    }
}
