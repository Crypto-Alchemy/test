package p000;

import java.util.concurrent.Executor;

/* renamed from: fb9 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class fb9 implements sg9 {

    /* renamed from: a */
    public final Executor f28808a;

    /* renamed from: b */
    public final Object f28809b = new Object();

    /* renamed from: c */
    public uh4 f28810c;

    public fb9(Executor executor, uh4 uh4) {
        this.f28808a = executor;
        this.f28810c = uh4;
    }

    /* renamed from: b */
    public final void mo28891b(tl6 tl6) {
        if (tl6.mo48145p()) {
            synchronized (this.f28809b) {
                if (this.f28810c != null) {
                    this.f28808a.execute(new z89(this, tl6));
                }
            }
        }
    }
}
