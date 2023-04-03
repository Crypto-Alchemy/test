package p000;

import java.util.concurrent.Executor;

/* renamed from: a79 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class a79 implements sg9 {

    /* renamed from: a */
    public final Executor f20827a;

    /* renamed from: b */
    public final Object f20828b = new Object();

    /* renamed from: c */
    public hh4 f20829c;

    public a79(Executor executor, hh4 hh4) {
        this.f20827a = executor;
        this.f20829c = hh4;
    }

    /* renamed from: b */
    public final void mo28891b(tl6 tl6) {
        if (!tl6.mo48145p() && !tl6.mo48143n()) {
            synchronized (this.f20828b) {
                if (this.f20829c != null) {
                    this.f20827a.execute(new g49(this, tl6));
                }
            }
        }
    }
}
