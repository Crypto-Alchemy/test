package p000;

import java.io.IOException;
import p000.lr8;

/* renamed from: lr8 */
public class lr8<M extends lr8<M>> extends as8 {

    /* renamed from: d */
    public qr8 f31388d;

    /* renamed from: a */
    public void mo29047a(gr8 gr8) throws IOException {
        if (this.f31388d != null) {
            for (int i = 0; i < this.f31388d.mo47263b(); i++) {
                this.f31388d.mo47265d(i).mo48163b(gr8);
            }
        }
    }

    /* renamed from: f */
    public int mo29050f() {
        if (this.f31388d != null) {
            for (int i = 0; i < this.f31388d.mo47263b(); i++) {
                this.f31388d.mo47265d(i).mo48165d();
            }
        }
        return 0;
    }

    /* renamed from: g */
    public /* synthetic */ as8 mo29051g() throws CloneNotSupportedException {
        return (lr8) clone();
    }

    /* renamed from: h */
    public M clone() throws CloneNotSupportedException {
        M m = (lr8) super.clone();
        xr8.m54531h(this, m);
        return m;
    }
}
