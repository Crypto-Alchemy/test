package p000;

import android.content.Context;
import android.os.Build;
import com.facebook.common.memory.PooledByteBuffer;

/* renamed from: pr2 */
/* compiled from: ImagePipelineFactory */
public class pr2 {

    /* renamed from: t */
    public static final Class<?> f16616t = pr2.class;

    /* renamed from: u */
    public static pr2 f16617u;

    /* renamed from: v */
    public static boolean f16618v;

    /* renamed from: w */
    public static lr2 f16619w;

    /* renamed from: a */
    public final fp6 f16620a;

    /* renamed from: b */
    public final nr2 f16621b;

    /* renamed from: c */
    public final oh0 f16622c;

    /* renamed from: d */
    public nu0<f80, kh0> f16623d;

    /* renamed from: e */
    public fw2<f80, kh0> f16624e;

    /* renamed from: f */
    public nu0<f80, PooledByteBuffer> f16625f;

    /* renamed from: g */
    public fw2<f80, PooledByteBuffer> f16626g;

    /* renamed from: h */
    public t40 f16627h;

    /* renamed from: i */
    public n02 f16628i;

    /* renamed from: j */
    public nq2 f16629j;

    /* renamed from: k */
    public lr2 f16630k;

    /* renamed from: l */
    public zr2 f16631l;

    /* renamed from: m */
    public zv4 f16632m;

    /* renamed from: n */
    public dw4 f16633n;

    /* renamed from: o */
    public t40 f16634o;

    /* renamed from: p */
    public n02 f16635p;

    /* renamed from: q */
    public xo4 f16636q;

    /* renamed from: r */
    public zo4 f16637r;

    /* renamed from: s */
    public C2475hk f16638s;

    public pr2(nr2 nr2) {
        fp6 fp6;
        if (lc2.m21369d()) {
            lc2.m21366a("ImagePipelineConfig()");
        }
        nr2 nr22 = (nr2) au4.m10792g(nr2);
        this.f16621b = nr22;
        if (nr22.mo23322D().mo24074u()) {
            fp6 = new kx1(nr2.mo23323E().mo27971a());
        } else {
            fp6 = new gp6(nr2.mo23323E().mo27971a());
        }
        this.f16620a = fp6;
        nh0.m23173G(nr2.mo23322D().mo24055b());
        this.f16622c = new oh0(nr2.mo23347w());
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: l */
    public static pr2 m25146l() {
        return (pr2) au4.m10793h(f16617u, "ImagePipelineFactory was not initialized!");
    }

    /* renamed from: u */
    public static synchronized void m25147u(nr2 nr2) {
        synchronized (pr2.class) {
            if (f16617u != null) {
                oy1.m24433t(f16616t, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f16617u = new pr2(nr2);
        }
    }

    /* renamed from: v */
    public static synchronized void m25148v(Context context) {
        synchronized (pr2.class) {
            if (lc2.m21369d()) {
                lc2.m21366a("ImagePipelineFactory#initialize");
            }
            m25147u(mr2.m22521J(context).mo23352K());
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: a */
    public final lr2 mo24761a() {
        return new lr2(mo24777r(), this.f16621b.mo23329f(), this.f16621b.mo23324a(), this.f16621b.mo23325b(), mo24765e(), mo24768h(), mo24772m(), mo24778s(), this.f16621b.mo23349y(), this.f16620a, this.f16621b.mo23322D().mo24062i(), this.f16621b.mo23322D().mo24076w(), this.f16621b.mo23321C(), this.f16621b);
    }

    /* renamed from: b */
    public lj1 mo24762b(Context context) {
        C2475hk c = mo24763c();
        if (c == null) {
            return null;
        }
        return c.mo13306a(context);
    }

    /* renamed from: c */
    public final C2475hk mo24763c() {
        if (this.f16638s == null) {
            this.f16638s = C2551ik.m19688a(mo24774o(), this.f16621b.mo23323E(), mo24764d(), this.f16621b.mo23322D().mo24050B(), this.f16621b.mo23336l());
        }
        return this.f16638s;
    }

    /* renamed from: d */
    public nu0<f80, kh0> mo24764d() {
        if (this.f16623d == null) {
            this.f16623d = this.f16621b.mo23348x().mo22976a(this.f16621b.mo23341q(), this.f16621b.mo23320B(), this.f16621b.mo23330g(), this.f16621b.mo23322D().mo24053E(), this.f16621b.mo23322D().mo24051C(), this.f16621b.mo23334j());
        }
        return this.f16623d;
    }

    /* renamed from: e */
    public fw2<f80, kh0> mo24765e() {
        if (this.f16624e == null) {
            this.f16624e = gw2.m18442a(mo24764d(), this.f16621b.mo23319A());
        }
        return this.f16624e;
    }

    /* renamed from: f */
    public oh0 mo24766f() {
        return this.f16622c;
    }

    /* renamed from: g */
    public nu0<f80, PooledByteBuffer> mo24767g() {
        if (this.f16625f == null) {
            this.f16625f = ep1.m16269a(this.f16621b.mo23343s(), this.f16621b.mo23320B());
        }
        return this.f16625f;
    }

    /* renamed from: h */
    public fw2<f80, PooledByteBuffer> mo24768h() {
        ys3 ys3;
        if (this.f16626g == null) {
            if (this.f16621b.mo23327d() != null) {
                ys3 = this.f16621b.mo23327d();
            } else {
                ys3 = mo24767g();
            }
            this.f16626g = hp1.m19133a(ys3, this.f16621b.mo23319A());
        }
        return this.f16626g;
    }

    /* renamed from: i */
    public final nq2 mo24769i() {
        nq2 nq2;
        if (this.f16629j == null) {
            if (this.f16621b.mo23342r() != null) {
                this.f16629j = this.f16621b.mo23342r();
            } else {
                C2475hk c = mo24763c();
                nq2 nq22 = null;
                if (c != null) {
                    nq22 = c.mo13308c();
                    nq2 = c.mo13307b();
                } else {
                    nq2 = null;
                }
                this.f16621b.mo23339o();
                this.f16629j = new p81(nq22, nq2, mo24775p());
            }
        }
        return this.f16629j;
    }

    /* renamed from: j */
    public lr2 mo24770j() {
        if (f16618v) {
            if (f16619w == null) {
                lr2 a = mo24761a();
                f16619w = a;
                this.f16630k = a;
            }
            return f16619w;
        }
        if (this.f16630k == null) {
            this.f16630k = mo24761a();
        }
        return this.f16630k;
    }

    /* renamed from: k */
    public final zr2 mo24771k() {
        if (this.f16631l == null) {
            if (this.f16621b.mo23338n() == null && this.f16621b.mo23337m() == null && this.f16621b.mo23322D().mo24077x()) {
                this.f16631l = new o26(this.f16621b.mo23322D().mo24059f());
            } else {
                this.f16631l = new pz3(this.f16621b.mo23322D().mo24059f(), this.f16621b.mo23322D().mo24065l(), this.f16621b.mo23338n(), this.f16621b.mo23337m(), this.f16621b.mo23322D().mo24073t());
            }
        }
        return this.f16631l;
    }

    /* renamed from: m */
    public t40 mo24772m() {
        if (this.f16627h == null) {
            this.f16627h = new t40(mo24773n(), this.f16621b.mo23344t().mo22963i(this.f16621b.mo23345u()), this.f16621b.mo23344t().mo22964j(), this.f16621b.mo23323E().mo27976f(), this.f16621b.mo23323E().mo27972b(), this.f16621b.mo23319A());
        }
        return this.f16627h;
    }

    /* renamed from: n */
    public n02 mo24773n() {
        if (this.f16628i == null) {
            this.f16628i = this.f16621b.mo23346v().mo19915a(this.f16621b.mo23328e());
        }
        return this.f16628i;
    }

    /* renamed from: o */
    public xo4 mo24774o() {
        if (this.f16636q == null) {
            this.f16636q = yo4.m30719a(this.f16621b.mo23344t(), mo24775p(), mo24766f());
        }
        return this.f16636q;
    }

    /* renamed from: p */
    public zo4 mo24775p() {
        if (this.f16637r == null) {
            this.f16637r = ap4.m10688a(this.f16621b.mo23344t(), this.f16621b.mo23322D().mo24075v());
        }
        return this.f16637r;
    }

    /* renamed from: q */
    public final zv4 mo24776q() {
        if (this.f16632m == null) {
            this.f16632m = this.f16621b.mo23322D().mo24061h().mo24081a(this.f16621b.getContext(), this.f16621b.mo23344t().mo22965k(), mo24769i(), this.f16621b.mo23332h(), this.f16621b.mo23335k(), this.f16621b.mo23350z(), this.f16621b.mo23322D().mo24069p(), this.f16621b.mo23323E(), this.f16621b.mo23344t().mo22963i(this.f16621b.mo23345u()), this.f16621b.mo23344t().mo22964j(), mo24765e(), mo24768h(), mo24772m(), mo24778s(), this.f16621b.mo23349y(), mo24774o(), this.f16621b.mo23322D().mo24058e(), this.f16621b.mo23322D().mo24057d(), this.f16621b.mo23322D().mo24056c(), this.f16621b.mo23322D().mo24059f(), mo24766f(), this.f16621b.mo23322D().mo24052D(), this.f16621b.mo23322D().mo24063j());
        }
        return this.f16632m;
    }

    /* renamed from: r */
    public final dw4 mo24777r() {
        boolean z;
        if (Build.VERSION.SDK_INT < 24 || !this.f16621b.mo23322D().mo24064k()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        if (this.f16633n == null) {
            this.f16633n = new dw4(this.f16621b.getContext().getApplicationContext().getContentResolver(), mo24776q(), this.f16621b.mo23326c(), this.f16621b.mo23350z(), this.f16621b.mo23322D().mo24079z(), this.f16620a, this.f16621b.mo23335k(), z2, this.f16621b.mo23322D().mo24078y(), this.f16621b.mo23340p(), mo24771k(), this.f16621b.mo23322D().mo24072s(), this.f16621b.mo23322D().mo24070q(), this.f16621b.mo23322D().mo24054a());
        }
        return this.f16633n;
    }

    /* renamed from: s */
    public final t40 mo24778s() {
        if (this.f16634o == null) {
            this.f16634o = new t40(mo24779t(), this.f16621b.mo23344t().mo22963i(this.f16621b.mo23345u()), this.f16621b.mo23344t().mo22964j(), this.f16621b.mo23323E().mo27976f(), this.f16621b.mo23323E().mo27972b(), this.f16621b.mo23319A());
        }
        return this.f16634o;
    }

    /* renamed from: t */
    public n02 mo24779t() {
        if (this.f16635p == null) {
            this.f16635p = this.f16621b.mo23346v().mo19915a(this.f16621b.mo23333i());
        }
        return this.f16635p;
    }
}
