package p000;

/* renamed from: gj5 */
public class gj5 extends u93 implements hp7 {
    public gj5(int i) {
        super(m58131q(i));
    }

    /* renamed from: q */
    public static int m58131q(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHAKE");
    }

    /* renamed from: a */
    public int mo50198a(byte[] bArr, int i) {
        return mo51935f(bArr, i, mo50202e());
    }

    /* renamed from: d */
    public String mo50201d() {
        return "SHAKE" + this.f44937e;
    }

    /* renamed from: e */
    public int mo50202e() {
        return this.f44937e / 4;
    }

    /* renamed from: f */
    public int mo51935f(byte[] bArr, int i, int i2) {
        int r = mo51936r(bArr, i, i2);
        reset();
        return r;
    }

    /* renamed from: r */
    public int mo51936r(byte[] bArr, int i, int i2) {
        if (!this.f44938f) {
            mo66217l(15, 4);
        }
        mo66221p(bArr, i, ((long) i2) * 8);
        return i2;
    }
}
