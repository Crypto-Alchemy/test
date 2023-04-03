package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zv8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class zv8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f36286a;

    /* renamed from: d */
    public final /* synthetic */ sx8 f36287d;

    public zv8(sx8 sx8, long j) {
        this.f36287d = sx8;
        this.f36286a = j;
    }

    public final void run() {
        this.f36287d.mo47928r(this.f36286a, true);
        this.f36287d.f34342a.mo45254R().mo42726T(new AtomicReference());
    }
}
