package p000;

/* renamed from: yl4 */
public class yl4 implements we0 {

    /* renamed from: a */
    public byte[] f46218a;

    /* renamed from: d */
    public we0 f46219d;

    public yl4(we0 we0, byte[] bArr) {
        this(we0, bArr, 0, bArr.length);
    }

    public yl4(we0 we0, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f46218a = bArr2;
        this.f46219d = we0;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    /* renamed from: a */
    public byte[] mo67127a() {
        return this.f46218a;
    }

    /* renamed from: b */
    public we0 mo67128b() {
        return this.f46219d;
    }
}
