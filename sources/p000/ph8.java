package p000;

import java.util.concurrent.Executor;

/* renamed from: ph8 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class ph8 implements sg9 {

    /* renamed from: a */
    public final Executor f32707a;

    /* renamed from: b */
    public final ms0 f32708b;

    /* renamed from: c */
    public final uj9 f32709c;

    public ph8(Executor executor, ms0 ms0, uj9 uj9) {
        this.f32707a = executor;
        this.f32708b = ms0;
        this.f32709c = uj9;
    }

    /* renamed from: b */
    public final void mo28891b(tl6 tl6) {
        this.f32707a.execute(new fe8(this, tl6));
    }
}
