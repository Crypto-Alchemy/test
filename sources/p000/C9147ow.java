package p000;

import java.io.IOException;

/* renamed from: ow */
public class C9147ow extends C9586x4 {
    public C9147ow() {
    }

    public C9147ow(C6923c4 c4Var) {
        super(c4Var, false);
    }

    public C9147ow(boolean z, C6843b4[] b4VarArr) {
        super(z, b4VarArr);
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        int i = z ? 4 : 3;
        for (C6843b4 n : this.f45844a) {
            i += n.mo50158n().mo50761A(true);
        }
        return i;
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65815r(z, 49, this.f45844a);
    }
}
