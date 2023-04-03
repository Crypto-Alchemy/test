package p000;

/* renamed from: zp3 */
public class zp3 extends C7926n4 {

    /* renamed from: a */
    public final int f46470a;

    /* renamed from: d */
    public final int f46471d;

    /* renamed from: e */
    public final me2 f46472e;

    /* renamed from: g */
    public final C6825af f46473g;

    public zp3(int i, int i2, me2 me2, C6825af afVar) {
        this.f46470a = i;
        this.f46471d = i2;
        this.f46472e = new me2(me2.mo56242c());
        this.f46473g = afVar;
    }

    public zp3(C9480w4 w4Var) {
        this.f46470a = ((C7333k4) w4Var.mo52675M(0)).mo52860Q();
        this.f46471d = ((C7333k4) w4Var.mo52675M(1)).mo52860Q();
        this.f46472e = new me2(((C9203q4) w4Var.mo52675M(2)).mo65418M());
        this.f46473g = C6825af.m55483s(w4Var.mo52675M(3));
    }

    /* renamed from: t */
    public static zp3 m75184t(Object obj) {
        if (obj instanceof zp3) {
            return (zp3) obj;
        }
        if (obj != null) {
            return new zp3(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        c4Var.mo50805a(new C7333k4((long) this.f46470a));
        c4Var.mo50805a(new C7333k4((long) this.f46471d));
        c4Var.mo50805a(new yz0(this.f46472e.mo56242c()));
        c4Var.mo50805a(this.f46473g);
        return new c01(c4Var);
    }

    /* renamed from: r */
    public C6825af mo67376r() {
        return this.f46473g;
    }

    /* renamed from: s */
    public me2 mo67377s() {
        return this.f46472e;
    }

    /* renamed from: u */
    public int mo67378u() {
        return this.f46470a;
    }

    /* renamed from: w */
    public int mo67379w() {
        return this.f46471d;
    }
}
