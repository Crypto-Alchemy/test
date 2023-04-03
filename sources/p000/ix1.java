package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ix1 */
/* compiled from: ExperimentalBitmapAnimationDrawableFactory */
public class ix1 implements lj1 {

    /* renamed from: a */
    public final C2297fk f13404a;

    /* renamed from: b */
    public final ScheduledExecutorService f13405b;

    /* renamed from: c */
    public final ExecutorService f13406c;

    /* renamed from: d */
    public final vx3 f13407d;

    /* renamed from: e */
    public final xo4 f13408e;

    /* renamed from: f */
    public final nu0<f80, kh0> f13409f;

    /* renamed from: g */
    public final td6<Integer> f13410g;

    /* renamed from: h */
    public final td6<Integer> f13411h;

    /* renamed from: i */
    public final td6<Boolean> f13412i;

    public ix1(C2297fk fkVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, vx3 vx3, xo4 xo4, nu0<f80, kh0> nu0, td6<Integer> td6, td6<Integer> td62, td6<Boolean> td63) {
        this.f13404a = fkVar;
        this.f13405b = scheduledExecutorService;
        this.f13406c = executorService;
        this.f13407d = vx3;
        this.f13408e = xo4;
        this.f13409f = nu0;
        this.f13410g = td6;
        this.f13411h = td62;
        this.f13412i = td63;
    }

    /* renamed from: b */
    public boolean mo21647b(kh0 kh0) {
        return kh0 instanceof hh0;
    }

    /* renamed from: c */
    public final C1637bk mo21648c(C3078pk pkVar) {
        C2687kk d = pkVar.mo24625d();
        return this.f13404a.mo13317a(pkVar, new Rect(0, 0, d.getWidth(), d.getHeight()));
    }

    /* renamed from: d */
    public final C2610jk mo21649d(C3078pk pkVar) {
        return new C2610jk(new C3741zk(pkVar.hashCode(), this.f13412i.get().booleanValue()), this.f13409f);
    }

    /* renamed from: e */
    public final C3418uk mo21650e(C3078pk pkVar, Bitmap.Config config) {
        h20 h20;
        j32 j32;
        C1637bk c = mo21648c(pkVar);
        f20 f = mo21651f(pkVar);
        C2168dk dkVar = new C2168dk(f, c);
        int intValue = this.f13411h.get().intValue();
        if (intValue > 0) {
            j32 j322 = new j32(intValue);
            h20 = mo21652g(dkVar, config);
            j32 = j322;
        } else {
            j32 = null;
            h20 = null;
        }
        return C3553wk.m29614o(new w10(this.f13408e, f, new C1683ck(c), dkVar, j32, h20), this.f13407d, this.f13405b);
    }

    /* renamed from: f */
    public final f20 mo21651f(C3078pk pkVar) {
        int intValue = this.f13410g.get().intValue();
        if (intValue == 1) {
            return new jc2(mo21649d(pkVar), true);
        }
        if (intValue == 2) {
            return new jc2(mo21649d(pkVar), false);
        }
        if (intValue != 3) {
            return new o74();
        }
        return new w93();
    }

    /* renamed from: g */
    public final h20 mo21652g(i20 i20, Bitmap.Config config) {
        xo4 xo4 = this.f13408e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new t61(xo4, i20, config, this.f13406c);
    }

    /* renamed from: h */
    public C0025ak mo21646a(kh0 kh0) {
        Bitmap.Config config;
        hh0 hh0 = (hh0) kh0;
        C2687kk f = hh0.mo21178f();
        C3078pk pkVar = (C3078pk) au4.m10792g(hh0.mo21179g());
        if (f != null) {
            config = f.mo13079h();
        } else {
            config = null;
        }
        return new C0025ak(mo21650e(pkVar, config));
    }
}
