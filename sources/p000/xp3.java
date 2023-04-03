package p000;

/* renamed from: xp3 */
public class xp3 extends C7926n4 {

    /* renamed from: a */
    public int f46000a;

    /* renamed from: d */
    public int f46001d;

    /* renamed from: e */
    public byte[] f46002e;

    /* renamed from: g */
    public byte[] f46003g;

    /* renamed from: k */
    public byte[] f46004k;

    /* renamed from: r */
    public C6825af f46005r;

    public xp3(int i, int i2, oe2 oe2, fs4 fs4, mn4 mn4, C6825af afVar) {
        this.f46000a = i;
        this.f46001d = i2;
        this.f46002e = oe2.mo62889e();
        this.f46003g = fs4.mo51785h();
        this.f46004k = mn4.mo56277a();
        this.f46005r = afVar;
    }

    public xp3(C9480w4 w4Var) {
        this.f46000a = ((C7333k4) w4Var.mo52675M(0)).mo52860Q();
        this.f46001d = ((C7333k4) w4Var.mo52675M(1)).mo52860Q();
        this.f46002e = ((C9203q4) w4Var.mo52675M(2)).mo65418M();
        this.f46003g = ((C9203q4) w4Var.mo52675M(3)).mo65418M();
        this.f46004k = ((C9203q4) w4Var.mo52675M(4)).mo65418M();
        this.f46005r = C6825af.m55483s(w4Var.mo52675M(5));
    }

    /* renamed from: u */
    public static xp3 m74054u(Object obj) {
        if (obj instanceof xp3) {
            return (xp3) obj;
        }
        if (obj != null) {
            return new xp3(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: A */
    public int mo66916A() {
        return this.f46000a;
    }

    /* renamed from: B */
    public mn4 mo66917B() {
        return new mn4(this.f46004k);
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        c4Var.mo50805a(new C7333k4((long) this.f46000a));
        c4Var.mo50805a(new C7333k4((long) this.f46001d));
        c4Var.mo50805a(new yz0(this.f46002e));
        c4Var.mo50805a(new yz0(this.f46003g));
        c4Var.mo50805a(new yz0(this.f46004k));
        c4Var.mo50805a(this.f46005r);
        return new c01(c4Var);
    }

    /* renamed from: r */
    public C6825af mo66918r() {
        return this.f46005r;
    }

    /* renamed from: s */
    public oe2 mo66919s() {
        return new oe2(this.f46002e);
    }

    /* renamed from: t */
    public fs4 mo66920t() {
        return new fs4(mo66919s(), this.f46003g);
    }

    /* renamed from: w */
    public int mo66921w() {
        return this.f46001d;
    }
}
