package p000;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: bd9 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class bd9 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ tl6 f21258a;

    /* renamed from: d */
    public final /* synthetic */ ze9 f21259d;

    public bd9(ze9 ze9, tl6 tl6) {
        this.f21259d = ze9;
        this.f21258a = tl6;
    }

    public final void run() {
        try {
            tl6 a = this.f21259d.f36138b.mo44766a(this.f21258a.mo48141l());
            if (a == null) {
                this.f21259d.mo42787a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = em6.f28635b;
            a.mo48136g(executor, this.f21259d);
            a.mo48134e(executor, this.f21259d);
            a.mo48130a(executor, this.f21259d);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f21259d.mo42787a((Exception) e.getCause());
            } else {
                this.f21259d.mo42787a(e);
            }
        } catch (CancellationException unused) {
            this.f21259d.mo28978c();
        } catch (Exception e2) {
            this.f21259d.mo42787a(e2);
        }
    }
}
