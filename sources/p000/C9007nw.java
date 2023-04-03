package p000;

import java.io.IOException;

/* renamed from: nw */
public class C9007nw implements C6843b4, ct2 {

    /* renamed from: a */
    public C9626y4 f43568a;

    public C9007nw(C9626y4 y4Var) {
        this.f43568a = y4Var;
    }

    /* renamed from: a */
    public static C7915mw m70095a(C9626y4 y4Var) throws IOException {
        return new C7915mw(y4Var.mo67034h());
    }

    /* renamed from: k */
    public C9326t4 mo50484k() throws IOException {
        return m70095a(this.f43568a);
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
