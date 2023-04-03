package p000;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: lv4 */
public class lv4 extends C7926n4 {

    /* renamed from: a */
    public C7333k4 f40703a;

    /* renamed from: d */
    public C6825af f40704d;

    /* renamed from: e */
    public C9203q4 f40705e;

    /* renamed from: g */
    public C9586x4 f40706g;

    /* renamed from: k */
    public C9584x3 f40707k;

    public lv4(C6825af afVar, C6843b4 b4Var) throws IOException {
        this(afVar, b4Var, (C9586x4) null, (byte[]) null);
    }

    public lv4(C6825af afVar, C6843b4 b4Var, C9586x4 x4Var) throws IOException {
        this(afVar, b4Var, x4Var, (byte[]) null);
    }

    public lv4(C6825af afVar, C6843b4 b4Var, C9586x4 x4Var, byte[] bArr) throws IOException {
        this.f40703a = new C7333k4(bArr != null ? i10.f38311b : i10.f38310a);
        this.f40704d = afVar;
        this.f40705e = new yz0(b4Var);
        this.f40706g = x4Var;
        this.f40707k = bArr == null ? null : new pz0(bArr);
    }

    public lv4(C9480w4 w4Var) {
        Enumeration N = w4Var.mo52676N();
        C7333k4 L = C7333k4.m59688L(N.nextElement());
        this.f40703a = L;
        int w = m64013w(L);
        this.f40704d = C6825af.m55483s(N.nextElement());
        this.f40705e = C9203q4.m71176L(N.nextElement());
        int i = -1;
        while (N.hasMoreElements()) {
            C6848b5 b5Var = (C6848b5) N.nextElement();
            int U = b5Var.mo50479U();
            if (U > i) {
                if (U == 0) {
                    this.f40706g = C9586x4.m73865J(b5Var, false);
                } else if (U != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                } else if (w >= 1) {
                    this.f40707k = pz0.m71125S(b5Var, false);
                } else {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                i = U;
            } else {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
        }
    }

    /* renamed from: s */
    public static lv4 m64012s(Object obj) {
        if (obj instanceof lv4) {
            return (lv4) obj;
        }
        if (obj != null) {
            return new lv4(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: w */
    public static int m64013w(C7333k4 k4Var) {
        int Q = k4Var.mo52860Q();
        if (Q >= 0 && Q <= 1) {
            return Q;
        }
        throw new IllegalArgumentException("invalid version for private key info");
    }

    /* renamed from: A */
    public C6843b4 mo55983A() throws IOException {
        return C9326t4.m72150D(this.f40705e.mo65418M());
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4(5);
        c4Var.mo50805a(this.f40703a);
        c4Var.mo50805a(this.f40704d);
        c4Var.mo50805a(this.f40705e);
        C9586x4 x4Var = this.f40706g;
        if (x4Var != null) {
            c4Var.mo50805a(new f01(false, 0, x4Var));
        }
        C9584x3 x3Var = this.f40707k;
        if (x3Var != null) {
            c4Var.mo50805a(new f01(false, 1, x3Var));
        }
        return new c01(c4Var);
    }

    /* renamed from: r */
    public C9586x4 mo55984r() {
        return this.f40706g;
    }

    /* renamed from: t */
    public C6825af mo55985t() {
        return this.f40704d;
    }

    /* renamed from: u */
    public C9584x3 mo55986u() {
        return this.f40707k;
    }
}
