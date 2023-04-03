package p000;

/* renamed from: ap7 */
public class ap7 extends C7926n4 {

    /* renamed from: a */
    public final int f36530a;

    /* renamed from: d */
    public final int f36531d;

    /* renamed from: e */
    public final byte[] f36532e;

    /* renamed from: g */
    public final byte[] f36533g;

    /* renamed from: k */
    public final byte[] f36534k;

    /* renamed from: r */
    public final byte[] f36535r;

    /* renamed from: s */
    public final int f36536s;

    /* renamed from: x */
    public final byte[] f36537x;

    public ap7(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f36530a = 0;
        this.f36531d = i;
        this.f36532e = C9367tq.m72422f(bArr);
        this.f36533g = C9367tq.m72422f(bArr2);
        this.f36534k = C9367tq.m72422f(bArr3);
        this.f36535r = C9367tq.m72422f(bArr4);
        this.f36537x = C9367tq.m72422f(bArr5);
        this.f36536s = -1;
    }

    public ap7(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.f36530a = 1;
        this.f36531d = i;
        this.f36532e = C9367tq.m72422f(bArr);
        this.f36533g = C9367tq.m72422f(bArr2);
        this.f36534k = C9367tq.m72422f(bArr3);
        this.f36535r = C9367tq.m72422f(bArr4);
        this.f36537x = C9367tq.m72422f(bArr5);
        this.f36536s = i2;
    }

    public ap7(C9480w4 w4Var) {
        int i;
        C7333k4 L = C7333k4.m59688L(w4Var.mo52675M(0));
        if (L.mo52859N(0) || L.mo52859N(1)) {
            this.f36530a = L.mo52860Q();
            if (w4Var.size() == 2 || w4Var.size() == 3) {
                C9480w4 L2 = C9480w4.m73427L(w4Var.mo52675M(1));
                this.f36531d = C7333k4.m59688L(L2.mo52675M(0)).mo52860Q();
                this.f36532e = C9367tq.m72422f(C9203q4.m71176L(L2.mo52675M(1)).mo65418M());
                this.f36533g = C9367tq.m72422f(C9203q4.m71176L(L2.mo52675M(2)).mo65418M());
                this.f36534k = C9367tq.m72422f(C9203q4.m71176L(L2.mo52675M(3)).mo65418M());
                this.f36535r = C9367tq.m72422f(C9203q4.m71176L(L2.mo52675M(4)).mo65418M());
                if (L2.size() == 6) {
                    C6848b5 R = C6848b5.m55750R(L2.mo52675M(5));
                    if (R.mo50479U() == 0) {
                        i = C7333k4.m59687J(R, false).mo52860Q();
                    } else {
                        throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
                    }
                } else if (L2.size() == 5) {
                    i = -1;
                } else {
                    throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
                }
                this.f36536s = i;
                if (w4Var.size() == 3) {
                    this.f36537x = C9367tq.m72422f(C9203q4.m71175J(C6848b5.m55750R(w4Var.mo52675M(2)), true).mo65418M());
                } else {
                    this.f36537x = null;
                }
            } else {
                throw new IllegalArgumentException("key sequence wrong size");
            }
        } else {
            throw new IllegalArgumentException("unknown version of sequence");
        }
    }

    /* renamed from: t */
    public static ap7 m55620t(Object obj) {
        if (obj instanceof ap7) {
            return (ap7) obj;
        }
        if (obj != null) {
            return new ap7(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: A */
    public byte[] mo50286A() {
        return C9367tq.m72422f(this.f36535r);
    }

    /* renamed from: B */
    public byte[] mo50287B() {
        return C9367tq.m72422f(this.f36533g);
    }

    /* renamed from: D */
    public byte[] mo50288D() {
        return C9367tq.m72422f(this.f36532e);
    }

    /* renamed from: E */
    public int mo50289E() {
        return this.f36530a;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        c4Var.mo50805a(this.f36536s >= 0 ? new C7333k4(1) : new C7333k4(0));
        C6923c4 c4Var2 = new C6923c4();
        c4Var2.mo50805a(new C7333k4((long) this.f36531d));
        c4Var2.mo50805a(new yz0(this.f36532e));
        c4Var2.mo50805a(new yz0(this.f36533g));
        c4Var2.mo50805a(new yz0(this.f36534k));
        c4Var2.mo50805a(new yz0(this.f36535r));
        if (this.f36536s >= 0) {
            c4Var2.mo50805a(new f01(false, 0, new C7333k4((long) this.f36536s)));
        }
        c4Var.mo50805a(new c01(c4Var2));
        c4Var.mo50805a(new f01(true, 0, new yz0(this.f36537x)));
        return new c01(c4Var);
    }

    /* renamed from: r */
    public byte[] mo50290r() {
        return C9367tq.m72422f(this.f36537x);
    }

    /* renamed from: s */
    public int mo50291s() {
        return this.f36531d;
    }

    /* renamed from: u */
    public int mo50292u() {
        return this.f36536s;
    }

    /* renamed from: w */
    public byte[] mo50293w() {
        return C9367tq.m72422f(this.f36534k);
    }
}
