package p000;

import java.util.concurrent.Executor;

/* renamed from: ru7 */
public final class ru7<ResultT> implements hv7<ResultT> {

    /* renamed from: a */
    public final Executor f33600a;

    /* renamed from: b */
    public final Object f33601b = new Object();

    /* renamed from: c */
    public final gh4 f33602c;

    public ru7(Executor executor, gh4 gh4) {
        this.f33600a = executor;
        this.f33602c = gh4;
    }

    /* renamed from: a */
    public final void mo42075a(ul6<ResultT> ul6) {
        if (!ul6.mo41745f()) {
            synchronized (this.f33601b) {
                if (this.f33602c != null) {
                    this.f33600a.execute(new pt7(this, ul6));
                }
            }
        }
    }
}
