package p000;

import java.io.IOException;

/* renamed from: mw */
public class C7915mw extends C9480w4 {
    public C7915mw() {
    }

    public C7915mw(C6843b4 b4Var) {
        super(b4Var);
    }

    public C7915mw(C6923c4 c4Var) {
        super(c4Var);
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        int i = z ? 4 : 3;
        for (C6843b4 n : this.f45435a) {
            i += n.mo50158n().mo50761A(true);
        }
        return i;
    }

    /* renamed from: O */
    public C9584x3 mo50762O() {
        return new C7194hw(mo66614H());
    }

    /* renamed from: Q */
    public C7013e4 mo50763Q() {
        return ((C9480w4) mo50473F()).mo50763Q();
    }

    /* renamed from: R */
    public C9203q4 mo50764R() {
        return new C7808kw(mo66615J());
    }

    /* renamed from: S */
    public C9586x4 mo50765S() {
        return new C9147ow(false, mo66616T());
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65815r(z, 48, this.f45435a);
    }
}
