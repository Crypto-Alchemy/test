package p000;

/* renamed from: jk2 */
public class jk2 implements pc1 {

    /* renamed from: a */
    public final byte[] f38740a;

    /* renamed from: b */
    public final boolean f38741b;

    /* renamed from: c */
    public final byte[] f38742c;

    /* renamed from: d */
    public final byte[] f38743d;

    public jk2(byte[] bArr, boolean z, byte[] bArr2, byte[] bArr3) {
        if (bArr != null) {
            this.f38740a = C9367tq.m72422f(bArr);
            this.f38741b = z;
            if (bArr2 == null || bArr2.length == 0) {
                this.f38742c = null;
            } else {
                this.f38742c = C9367tq.m72422f(bArr2);
            }
            if (bArr3 == null) {
                this.f38743d = new byte[0];
            } else {
                this.f38743d = C9367tq.m72422f(bArr3);
            }
        } else {
            throw new IllegalArgumentException("IKM (input keying material) should not be null");
        }
    }

    public jk2(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(bArr, false, bArr2, bArr3);
    }

    /* renamed from: a */
    public byte[] mo52732a() {
        return C9367tq.m72422f(this.f38740a);
    }

    /* renamed from: b */
    public byte[] mo52733b() {
        return C9367tq.m72422f(this.f38743d);
    }

    /* renamed from: c */
    public byte[] mo52734c() {
        return C9367tq.m72422f(this.f38742c);
    }

    /* renamed from: d */
    public boolean mo52735d() {
        return this.f38741b;
    }
}
