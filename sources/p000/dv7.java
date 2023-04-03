package p000;

import java.util.concurrent.Executor;

/* renamed from: dv7 */
public final class dv7<ResultT> implements hv7<ResultT> {

    /* renamed from: a */
    public final Executor f28322a;

    /* renamed from: b */
    public final Object f28323b = new Object();

    /* renamed from: c */
    public final th4<? super ResultT> f28324c;

    public dv7(Executor executor, th4<? super ResultT> th4) {
        this.f28322a = executor;
        this.f28324c = th4;
    }

    /* renamed from: a */
    public final void mo42075a(ul6<ResultT> ul6) {
        if (ul6.mo41745f()) {
            synchronized (this.f28323b) {
                if (this.f28324c != null) {
                    this.f28322a.execute(new zu7(this, ul6));
                }
            }
        }
    }
}
