package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: a01 */
public class a01 extends s01 {
    public a01(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: d */
    public a01 mo50014d() {
        return this;
    }

    /* renamed from: l */
    public void mo50015l(C6843b4[] b4VarArr) throws IOException {
        for (C6843b4 n : b4VarArr) {
            n.mo50158n().mo50472E().mo50767s(this, true);
        }
    }

    /* renamed from: u */
    public void mo50016u(C9326t4 t4Var, boolean z) throws IOException {
        t4Var.mo50472E().mo50767s(this, z);
    }

    /* renamed from: v */
    public void mo50017v(C9326t4[] t4VarArr) throws IOException {
        for (C9326t4 E : t4VarArr) {
            E.mo50472E().mo50767s(this, true);
        }
    }
}
