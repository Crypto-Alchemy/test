package p000;

/* renamed from: hn1 */
public final class hn1 extends C9414ur {

    /* renamed from: d */
    public final byte[] f38236d;

    public hn1(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.f38236d = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }

    /* renamed from: a */
    public void mo52245a(byte[] bArr, int i) {
        System.arraycopy(this.f38236d, 0, bArr, i, 32);
    }

    public byte[] getEncoded() {
        return C9367tq.m72422f(this.f38236d);
    }
}
