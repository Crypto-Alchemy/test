package p000;

/* renamed from: l4 */
public abstract class C7820l4 extends C9326t4 {

    /* renamed from: a */
    public static final C7119g5 f40571a = new C7821a(C7820l4.class, 5);

    /* renamed from: l4$a */
    public static class C7821a extends C7119g5 {
        public C7821a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C7820l4.m63689H(yz0.mo65418M());
        }
    }

    /* renamed from: H */
    public static C7820l4 m63689H(byte[] bArr) {
        if (bArr.length == 0) {
            return wz0.f45797d;
        }
        throw new IllegalStateException("malformed NULL encoding encountered");
    }

    public int hashCode() {
        return -1;
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        return t4Var instanceof C7820l4;
    }

    public String toString() {
        return "NULL";
    }
}
