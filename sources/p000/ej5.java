package p000;

/* renamed from: ej5 */
public class ej5 extends u93 {
    public ej5(int i) {
        super(m57363q(i));
    }

    /* renamed from: q */
    public static int m57363q(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHA-3");
    }

    /* renamed from: a */
    public int mo50198a(byte[] bArr, int i) {
        mo66217l(2, 2);
        return super.mo50198a(bArr, i);
    }

    /* renamed from: d */
    public String mo50201d() {
        return "SHA3-" + this.f44937e;
    }
}
