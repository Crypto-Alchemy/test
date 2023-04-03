package p000;

/* renamed from: eq3 */
public class eq3 extends C7926n4 {

    /* renamed from: a */
    public int f37586a;

    /* renamed from: d */
    public int f37587d;

    /* renamed from: e */
    public byte[] f37588e;

    /* renamed from: g */
    public byte[] f37589g;

    /* renamed from: k */
    public byte[] f37590k;

    /* renamed from: r */
    public byte[] f37591r;

    /* renamed from: s */
    public byte[] f37592s;

    public eq3(int i, int i2, oe2 oe2, fs4 fs4, mn4 mn4, mn4 mn42, me2 me2) {
        this.f37586a = i;
        this.f37587d = i2;
        this.f37588e = oe2.mo62889e();
        this.f37589g = fs4.mo51785h();
        this.f37590k = me2.mo56242c();
        this.f37591r = mn4.mo56277a();
        this.f37592s = mn42.mo56277a();
    }

    public eq3(C9480w4 w4Var) {
        this.f37586a = ((C7333k4) w4Var.mo52675M(0)).mo52860Q();
        this.f37587d = ((C7333k4) w4Var.mo52675M(1)).mo52860Q();
        this.f37588e = ((C9203q4) w4Var.mo52675M(2)).mo65418M();
        this.f37589g = ((C9203q4) w4Var.mo52675M(3)).mo65418M();
        this.f37591r = ((C9203q4) w4Var.mo52675M(4)).mo65418M();
        this.f37592s = ((C9203q4) w4Var.mo52675M(5)).mo65418M();
        this.f37590k = ((C9203q4) w4Var.mo52675M(6)).mo65418M();
    }

    /* renamed from: t */
    public static eq3 m57435t(Object obj) {
        if (obj instanceof eq3) {
            return (eq3) obj;
        }
        if (obj != null) {
            return new eq3(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: A */
    public mn4 mo51517A() {
        return new mn4(this.f37591r);
    }

    /* renamed from: B */
    public mn4 mo51518B() {
        return new mn4(this.f37592s);
    }

    /* renamed from: D */
    public me2 mo51519D() {
        return new me2(this.f37590k);
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        c4Var.mo50805a(new C7333k4((long) this.f37586a));
        c4Var.mo50805a(new C7333k4((long) this.f37587d));
        c4Var.mo50805a(new yz0(this.f37588e));
        c4Var.mo50805a(new yz0(this.f37589g));
        c4Var.mo50805a(new yz0(this.f37591r));
        c4Var.mo50805a(new yz0(this.f37592s));
        c4Var.mo50805a(new yz0(this.f37590k));
        return new c01(c4Var);
    }

    /* renamed from: r */
    public oe2 mo51520r() {
        return new oe2(this.f37588e);
    }

    /* renamed from: s */
    public fs4 mo51521s() {
        return new fs4(mo51520r(), this.f37589g);
    }

    /* renamed from: u */
    public int mo51522u() {
        return this.f37587d;
    }

    /* renamed from: w */
    public int mo51523w() {
        return this.f37586a;
    }
}
