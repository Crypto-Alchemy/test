package p000;

/* renamed from: gq3 */
public class gq3 extends C7926n4 {

    /* renamed from: a */
    public final int f38057a;

    /* renamed from: d */
    public final int f38058d;

    /* renamed from: e */
    public final me2 f38059e;

    public gq3(int i, int i2, me2 me2) {
        this.f38057a = i;
        this.f38058d = i2;
        this.f38059e = new me2(me2);
    }

    public gq3(C9480w4 w4Var) {
        this.f38057a = ((C7333k4) w4Var.mo52675M(0)).mo52860Q();
        this.f38058d = ((C7333k4) w4Var.mo52675M(1)).mo52860Q();
        this.f38059e = new me2(((C9203q4) w4Var.mo52675M(2)).mo65418M());
    }

    /* renamed from: s */
    public static gq3 m58205s(Object obj) {
        if (obj instanceof gq3) {
            return (gq3) obj;
        }
        if (obj != null) {
            return new gq3(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        c4Var.mo50805a(new C7333k4((long) this.f38057a));
        c4Var.mo50805a(new C7333k4((long) this.f38058d));
        c4Var.mo50805a(new yz0(this.f38059e.mo56242c()));
        return new c01(c4Var);
    }

    /* renamed from: r */
    public me2 mo51969r() {
        return new me2(this.f38059e);
    }

    /* renamed from: t */
    public int mo51970t() {
        return this.f38057a;
    }

    /* renamed from: u */
    public int mo51971u() {
        return this.f38058d;
    }
}
