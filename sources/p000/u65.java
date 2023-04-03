package p000;

/* renamed from: u65 */
public class u65 extends C7926n4 {

    /* renamed from: a */
    public C7333k4 f44894a;

    /* renamed from: d */
    public C9156p4 f44895d;

    /* renamed from: e */
    public C7333k4 f44896e;

    /* renamed from: g */
    public byte[][] f44897g;

    /* renamed from: k */
    public byte[][] f44898k;

    /* renamed from: r */
    public byte[] f44899r;

    public u65(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f44894a = new C7333k4(0);
        this.f44896e = new C7333k4((long) i);
        this.f44897g = x65.m73877c(sArr);
        this.f44898k = x65.m73877c(sArr2);
        this.f44899r = x65.m73875a(sArr3);
    }

    public u65(C9480w4 w4Var) {
        if (w4Var.mo52675M(0) instanceof C7333k4) {
            this.f44894a = C7333k4.m59688L(w4Var.mo52675M(0));
        } else {
            this.f44895d = C9156p4.m70910O(w4Var.mo52675M(0));
        }
        this.f44896e = C7333k4.m59688L(w4Var.mo52675M(1));
        C9480w4 L = C9480w4.m73427L(w4Var.mo52675M(2));
        this.f44897g = new byte[L.size()][];
        for (int i = 0; i < L.size(); i++) {
            this.f44897g[i] = C9203q4.m71176L(L.mo52675M(i)).mo65418M();
        }
        C9480w4 w4Var2 = (C9480w4) w4Var.mo52675M(3);
        this.f44898k = new byte[w4Var2.size()][];
        for (int i2 = 0; i2 < w4Var2.size(); i2++) {
            this.f44898k[i2] = C9203q4.m71176L(w4Var2.mo52675M(i2)).mo65418M();
        }
        this.f44899r = C9203q4.m71176L(((C9480w4) w4Var.mo52675M(4)).mo52675M(0)).mo65418M();
    }

    /* renamed from: w */
    public static u65 m72612w(Object obj) {
        if (obj instanceof u65) {
            return (u65) obj;
        }
        if (obj != null) {
            return new u65(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        C6843b4 b4Var = this.f44894a;
        if (b4Var == null) {
            b4Var = this.f44895d;
        }
        c4Var.mo50805a(b4Var);
        c4Var.mo50805a(this.f44896e);
        C6923c4 c4Var2 = new C6923c4();
        for (byte[] yz0 : this.f44897g) {
            c4Var2.mo50805a(new yz0(yz0));
        }
        c4Var.mo50805a(new c01(c4Var2));
        C6923c4 c4Var3 = new C6923c4();
        for (byte[] yz02 : this.f44898k) {
            c4Var3.mo50805a(new yz0(yz02));
        }
        c4Var.mo50805a(new c01(c4Var3));
        C6923c4 c4Var4 = new C6923c4();
        c4Var4.mo50805a(new yz0(this.f44899r));
        c4Var.mo50805a(new c01(c4Var4));
        return new c01(c4Var);
    }

    /* renamed from: r */
    public short[][] mo66182r() {
        return x65.m73878d(this.f44897g);
    }

    /* renamed from: s */
    public short[] mo66183s() {
        return x65.m73876b(this.f44899r);
    }

    /* renamed from: t */
    public short[][] mo66184t() {
        return x65.m73878d(this.f44898k);
    }

    /* renamed from: u */
    public int mo66185u() {
        return this.f44896e.mo52860Q();
    }
}
