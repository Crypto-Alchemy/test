package p000;

/* renamed from: uo7 */
public class uo7 extends C7926n4 {

    /* renamed from: a */
    public final int f45154a;

    /* renamed from: d */
    public final long f45155d;

    /* renamed from: e */
    public final long f45156e;

    /* renamed from: g */
    public final byte[] f45157g;

    /* renamed from: k */
    public final byte[] f45158k;

    /* renamed from: r */
    public final byte[] f45159r;

    /* renamed from: s */
    public final byte[] f45160s;

    /* renamed from: x */
    public final byte[] f45161x;

    public uo7(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f45154a = 0;
        this.f45155d = j;
        this.f45157g = C9367tq.m72422f(bArr);
        this.f45158k = C9367tq.m72422f(bArr2);
        this.f45159r = C9367tq.m72422f(bArr3);
        this.f45160s = C9367tq.m72422f(bArr4);
        this.f45161x = C9367tq.m72422f(bArr5);
        this.f45156e = -1;
    }

    public uo7(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.f45154a = 1;
        this.f45155d = j;
        this.f45157g = C9367tq.m72422f(bArr);
        this.f45158k = C9367tq.m72422f(bArr2);
        this.f45159r = C9367tq.m72422f(bArr3);
        this.f45160s = C9367tq.m72422f(bArr4);
        this.f45161x = C9367tq.m72422f(bArr5);
        this.f45156e = j2;
    }

    public uo7(C9480w4 w4Var) {
        long j;
        C7333k4 L = C7333k4.m59688L(w4Var.mo52675M(0));
        if (L.mo52859N(0) || L.mo52859N(1)) {
            this.f45154a = L.mo52860Q();
            if (w4Var.size() == 2 || w4Var.size() == 3) {
                C9480w4 L2 = C9480w4.m73427L(w4Var.mo52675M(1));
                this.f45155d = C7333k4.m59688L(L2.mo52675M(0)).mo52861T();
                this.f45157g = C9367tq.m72422f(C9203q4.m71176L(L2.mo52675M(1)).mo65418M());
                this.f45158k = C9367tq.m72422f(C9203q4.m71176L(L2.mo52675M(2)).mo65418M());
                this.f45159r = C9367tq.m72422f(C9203q4.m71176L(L2.mo52675M(3)).mo65418M());
                this.f45160s = C9367tq.m72422f(C9203q4.m71176L(L2.mo52675M(4)).mo65418M());
                if (L2.size() == 6) {
                    C6848b5 R = C6848b5.m55750R(L2.mo52675M(5));
                    if (R.mo50479U() == 0) {
                        j = C7333k4.m59687J(R, false).mo52861T();
                    } else {
                        throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
                    }
                } else if (L2.size() == 5) {
                    j = -1;
                } else {
                    throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
                }
                this.f45156e = j;
                if (w4Var.size() == 3) {
                    this.f45161x = C9367tq.m72422f(C9203q4.m71175J(C6848b5.m55750R(w4Var.mo52675M(2)), true).mo65418M());
                } else {
                    this.f45161x = null;
                }
            } else {
                throw new IllegalArgumentException("key sequence wrong size");
            }
        } else {
            throw new IllegalArgumentException("unknown version of sequence");
        }
    }

    /* renamed from: t */
    public static uo7 m72946t(Object obj) {
        if (obj instanceof uo7) {
            return (uo7) obj;
        }
        if (obj != null) {
            return new uo7(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: A */
    public byte[] mo66343A() {
        return C9367tq.m72422f(this.f45160s);
    }

    /* renamed from: B */
    public byte[] mo66344B() {
        return C9367tq.m72422f(this.f45158k);
    }

    /* renamed from: D */
    public byte[] mo66345D() {
        return C9367tq.m72422f(this.f45157g);
    }

    /* renamed from: E */
    public int mo66346E() {
        return this.f45154a;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        c4Var.mo50805a(this.f45156e >= 0 ? new C7333k4(1) : new C7333k4(0));
        C6923c4 c4Var2 = new C6923c4();
        c4Var2.mo50805a(new C7333k4(this.f45155d));
        c4Var2.mo50805a(new yz0(this.f45157g));
        c4Var2.mo50805a(new yz0(this.f45158k));
        c4Var2.mo50805a(new yz0(this.f45159r));
        c4Var2.mo50805a(new yz0(this.f45160s));
        if (this.f45156e >= 0) {
            c4Var2.mo50805a(new f01(false, 0, new C7333k4(this.f45156e)));
        }
        c4Var.mo50805a(new c01(c4Var2));
        c4Var.mo50805a(new f01(true, 0, new yz0(this.f45161x)));
        return new c01(c4Var);
    }

    /* renamed from: r */
    public byte[] mo66347r() {
        return C9367tq.m72422f(this.f45161x);
    }

    /* renamed from: s */
    public long mo66348s() {
        return this.f45155d;
    }

    /* renamed from: u */
    public long mo66349u() {
        return this.f45156e;
    }

    /* renamed from: w */
    public byte[] mo66350w() {
        return C9367tq.m72422f(this.f45159r);
    }
}
