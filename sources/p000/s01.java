package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: s01 */
public class s01 extends C9302s4 {
    public s01(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: e */
    public s01 mo65786e() {
        return this;
    }

    /* renamed from: l */
    public void mo50015l(C6843b4[] b4VarArr) throws IOException {
        for (C6843b4 n : b4VarArr) {
            n.mo50158n().mo50473F().mo50767s(this, true);
        }
    }

    /* renamed from: u */
    public void mo50016u(C9326t4 t4Var, boolean z) throws IOException {
        t4Var.mo50473F().mo50767s(this, z);
    }

    /* renamed from: v */
    public void mo50017v(C9326t4[] t4VarArr) throws IOException {
        for (C9326t4 F : t4VarArr) {
            F.mo50473F().mo50767s(this, true);
        }
    }
}
