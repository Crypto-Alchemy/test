package p000;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: ic6 */
public class ic6 extends C7926n4 {

    /* renamed from: a */
    public C6825af f38350a;

    /* renamed from: d */
    public C9584x3 f38351d;

    public ic6(C6825af afVar, C6843b4 b4Var) throws IOException {
        this.f38351d = new pz0(b4Var);
        this.f38350a = afVar;
    }

    public ic6(C6825af afVar, byte[] bArr) {
        this.f38351d = new pz0(bArr);
        this.f38350a = afVar;
    }

    public ic6(C9480w4 w4Var) {
        if (w4Var.size() == 2) {
            Enumeration N = w4Var.mo52676N();
            this.f38350a = C6825af.m55483s(N.nextElement());
            this.f38351d = pz0.m71126T(N.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + w4Var.size());
    }

    /* renamed from: s */
    public static ic6 m58895s(Object obj) {
        if (obj instanceof ic6) {
            return (ic6) obj;
        }
        if (obj != null) {
            return new ic6(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4(2);
        c4Var.mo50805a(this.f38350a);
        c4Var.mo50805a(this.f38351d);
        return new c01(c4Var);
    }

    /* renamed from: r */
    public C6825af mo52430r() {
        return this.f38350a;
    }

    /* renamed from: t */
    public C9584x3 mo52431t() {
        return this.f38351d;
    }

    /* renamed from: u */
    public C9326t4 mo52432u() throws IOException {
        return C9326t4.m72150D(this.f38351d.mo66825N());
    }
}
