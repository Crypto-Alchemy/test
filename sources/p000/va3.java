package p000;

/* renamed from: va3 */
public class va3 implements we0 {

    /* renamed from: a */
    public byte[] f45249a;

    public va3(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public va3(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f45249a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    /* renamed from: a */
    public byte[] mo66464a() {
        return this.f45249a;
    }
}
