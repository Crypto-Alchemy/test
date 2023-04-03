package p000;

import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: jt8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class jt8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzkq f30614a;

    /* renamed from: d */
    public final /* synthetic */ zzp f30615d;

    /* renamed from: e */
    public final /* synthetic */ rt8 f30616e;

    public jt8(rt8 rt8, zzkq zzkq, zzp zzp) {
        this.f30616e = rt8;
        this.f30614a = zzkq;
        this.f30615d = zzp;
    }

    public final void run() {
        this.f30616e.f33579a.mo47670i();
        if (this.f30614a.mo31423r1() == null) {
            this.f30616e.f33579a.mo47677m(this.f30614a, this.f30615d);
        } else {
            this.f30616e.f33579a.mo47676l(this.f30614a, this.f30615d);
        }
    }
}
