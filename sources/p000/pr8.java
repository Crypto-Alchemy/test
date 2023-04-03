package p000;

import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: pr8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class pr8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzaa f32791a;

    /* renamed from: d */
    public final /* synthetic */ zzp f32792d;

    /* renamed from: e */
    public final /* synthetic */ rt8 f32793e;

    public pr8(rt8 rt8, zzaa zzaa, zzp zzp) {
        this.f32793e = rt8;
        this.f32791a = zzaa;
        this.f32792d = zzp;
    }

    public final void run() {
        this.f32793e.f33579a.mo47670i();
        if (this.f32791a.f23066e.mo31423r1() == null) {
            this.f32793e.f33579a.mo47685w(this.f32791a, this.f32792d);
        } else {
            this.f32793e.f33579a.mo47683u(this.f32791a, this.f32792d);
        }
    }
}
