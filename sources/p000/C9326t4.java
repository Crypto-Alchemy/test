package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: t4 */
public abstract class C9326t4 extends C7926n4 {
    /* renamed from: D */
    public static C9326t4 m72150D(byte[] bArr) throws IOException {
        C7243j4 j4Var = new C7243j4(bArr);
        try {
            C9326t4 i = j4Var.mo52620i();
            if (j4Var.available() == 0) {
                return i;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    /* renamed from: A */
    public abstract int mo50761A(boolean z) throws IOException;

    /* renamed from: B */
    public final boolean mo65963B(C9326t4 t4Var) {
        return this == t4Var || mo50485r(t4Var);
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return this;
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6843b4) && mo50485r(((C6843b4) obj).mo50158n());
    }

    public abstract int hashCode();

    /* renamed from: n */
    public final C9326t4 mo50158n() {
        return this;
    }

    /* renamed from: r */
    public abstract boolean mo50485r(C9326t4 t4Var);

    /* renamed from: s */
    public abstract void mo50767s(C9302s4 s4Var, boolean z) throws IOException;

    /* renamed from: t */
    public abstract boolean mo51124t();

    /* renamed from: u */
    public void mo65964u(OutputStream outputStream) throws IOException {
        C9302s4 a = C9302s4.m71856a(outputStream);
        a.mo50016u(this, true);
        a.mo65806c();
    }

    /* renamed from: w */
    public void mo65965w(OutputStream outputStream, String str) throws IOException {
        C9302s4 b = C9302s4.m71857b(outputStream, str);
        b.mo50016u(this, true);
        b.mo65806c();
    }
}
