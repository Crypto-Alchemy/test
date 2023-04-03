package p000;

import java.io.IOException;

/* renamed from: u01 */
public class u01 implements C6843b4, ct2 {

    /* renamed from: a */
    public C9626y4 f44837a;

    public u01(C9626y4 y4Var) {
        this.f44837a = y4Var;
    }

    /* renamed from: k */
    public C9326t4 mo50484k() throws IOException {
        return r01.m71419a(this.f44837a.mo67034h());
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        try {
            return mo50484k();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
