package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ar7 */
public final class ar7 extends rq7 {

    /* renamed from: d */
    public final /* synthetic */ IBinder f20983d;

    /* renamed from: e */
    public final /* synthetic */ er7 f20984e;

    public ar7(er7 er7, IBinder iBinder) {
        this.f20984e = er7;
        this.f20983d = iBinder;
    }

    /* renamed from: a */
    public final void mo29043a() {
        gr7 gr7 = this.f20984e.f28648a;
        gr7.f29336k = (IInterface) gr7.f29332g.mo29377a(this.f20983d);
        gr7.m44849j(this.f20984e.f28648a);
        this.f20984e.f28648a.f29330e = false;
        for (Runnable run : this.f20984e.f28648a.f29329d) {
            run.run();
        }
        this.f20984e.f28648a.f29329d.clear();
    }
}
