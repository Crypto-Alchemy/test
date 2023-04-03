package p000;

import java.io.IOException;

/* renamed from: z3 */
public class C9663z3 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f46326d = new C9664a(C9663z3.class, 1);

    /* renamed from: e */
    public static final C9663z3 f46327e = new C9663z3((byte) 0);

    /* renamed from: g */
    public static final C9663z3 f46328g = new C9663z3((byte) -1);

    /* renamed from: a */
    public final byte f46329a;

    /* renamed from: z3$a */
    public static class C9664a extends C7119g5 {
        public C9664a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C9663z3.m74736H(yz0.mo65418M());
        }
    }

    public C9663z3(byte b) {
        this.f46329a = b;
    }

    /* renamed from: H */
    public static C9663z3 m74736H(byte[] bArr) {
        if (bArr.length == 1) {
            byte b = bArr[0];
            return b != -1 ? b != 0 ? new C9663z3(b) : f46327e : f46328g;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    /* renamed from: A */
    public int mo50761A(boolean z) {
        return C9302s4.m71859g(z, 1);
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return mo67212J() ? f46328g : f46327e;
    }

    /* renamed from: J */
    public boolean mo67212J() {
        return this.f46329a != 0;
    }

    public int hashCode() {
        return mo67212J() ? 1 : 0;
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        return (t4Var instanceof C9663z3) && mo67212J() == ((C9663z3) t4Var).mo67212J();
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65810m(z, 1, this.f46329a);
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo67212J() ? "TRUE" : "FALSE";
    }
}
