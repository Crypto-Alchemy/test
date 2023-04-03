package p000;

import java.util.concurrent.Executor;

/* renamed from: g19 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class g19 implements sg9 {

    /* renamed from: a */
    public final Executor f29053a;

    /* renamed from: b */
    public final Object f29054b = new Object();

    /* renamed from: c */
    public bh4 f29055c;

    public g19(Executor executor, bh4 bh4) {
        this.f29053a = executor;
        this.f29055c = bh4;
    }

    /* renamed from: b */
    public final void mo28891b(tl6 tl6) {
        synchronized (this.f29054b) {
            if (this.f29055c != null) {
                this.f29053a.execute(new by8(this, tl6));
            }
        }
    }
}
