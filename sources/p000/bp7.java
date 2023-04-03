package p000;

/* renamed from: bp7 */
public class bp7 extends C7926n4 {

    /* renamed from: a */
    public final byte[] f36929a;

    /* renamed from: d */
    public final byte[] f36930d;

    public bp7(C9480w4 w4Var) {
        if (C7333k4.m59688L(w4Var.mo52675M(0)).mo52859N(0)) {
            this.f36929a = C9367tq.m72422f(C9203q4.m71176L(w4Var.mo52675M(1)).mo65418M());
            this.f36930d = C9367tq.m72422f(C9203q4.m71176L(w4Var.mo52675M(2)).mo65418M());
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    public bp7(byte[] bArr, byte[] bArr2) {
        this.f36929a = C9367tq.m72422f(bArr);
        this.f36930d = C9367tq.m72422f(bArr2);
    }

    /* renamed from: r */
    public static bp7 m56110r(Object obj) {
        if (obj instanceof bp7) {
            return (bp7) obj;
        }
        if (obj != null) {
            return new bp7(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        c4Var.mo50805a(new C7333k4(0));
        c4Var.mo50805a(new yz0(this.f36929a));
        c4Var.mo50805a(new yz0(this.f36930d));
        return new c01(c4Var);
    }

    /* renamed from: s */
    public byte[] mo50690s() {
        return C9367tq.m72422f(this.f36929a);
    }

    /* renamed from: t */
    public byte[] mo50691t() {
        return C9367tq.m72422f(this.f36930d);
    }
}
