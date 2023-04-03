package p000;

import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: dt8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class dt8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzas f28295a;

    /* renamed from: d */
    public final /* synthetic */ zzp f28296d;

    /* renamed from: e */
    public final /* synthetic */ rt8 f28297e;

    public dt8(rt8 rt8, zzas zzas, zzp zzp) {
        this.f28297e = rt8;
        this.f28295a = zzas;
        this.f28296d = zzp;
    }

    public final void run() {
        zzas t1 = this.f28297e.mo47490t1(this.f28295a, this.f28296d);
        zf9.m55099a();
        if (this.f28297e.f33579a.mo47648S().mo45997v((String) null, rl8.f33461F0)) {
            this.f28297e.mo47489s1(t1, this.f28296d);
        } else {
            this.f28297e.mo47493y1(t1, this.f28296d);
        }
    }
}
