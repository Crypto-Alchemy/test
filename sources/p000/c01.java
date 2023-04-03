package p000;

import java.io.IOException;

/* renamed from: c01 */
public class c01 extends C9480w4 {

    /* renamed from: e */
    public int f37026e = -1;

    public c01(C6843b4 b4Var) {
        super(b4Var);
    }

    public c01(C6923c4 c4Var) {
        super(c4Var);
    }

    public c01(C6843b4[] b4VarArr, boolean z) {
        super(b4VarArr, z);
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        return C9302s4.m71859g(z, mo50766U());
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return this;
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return this;
    }

    /* renamed from: O */
    public C9584x3 mo50762O() {
        return new pz0(C7194hw.m58703Q(mo66614H()), false);
    }

    /* renamed from: Q */
    public C7013e4 mo50763Q() {
        return new qz0(this);
    }

    /* renamed from: R */
    public C9203q4 mo50764R() {
        return new yz0(C7808kw.m63626N(mo66615J()));
    }

    /* renamed from: S */
    public C9586x4 mo50765S() {
        return new v01(false, mo66616T());
    }

    /* renamed from: U */
    public final int mo50766U() throws IOException {
        if (this.f37026e < 0) {
            int i = 0;
            for (C6843b4 n : this.f45435a) {
                i += n.mo50158n().mo50472E().mo50761A(true);
            }
            this.f37026e = i;
        }
        return this.f37026e;
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65816s(z, 48);
        a01 d = s4Var.mo50014d();
        int length = this.f45435a.length;
        int i = 0;
        if (this.f37026e >= 0 || length > 16) {
            s4Var.mo65809k(mo50766U());
            while (i < length) {
                this.f45435a[i].mo50158n().mo50472E().mo50767s(d, true);
                i++;
            }
            return;
        }
        C9326t4[] t4VarArr = new C9326t4[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C9326t4 E = this.f45435a[i3].mo50158n().mo50472E();
            t4VarArr[i3] = E;
            i2 += E.mo50761A(true);
        }
        this.f37026e = i2;
        s4Var.mo65809k(i2);
        while (i < length) {
            t4VarArr[i].mo50767s(d, true);
            i++;
        }
    }
}
