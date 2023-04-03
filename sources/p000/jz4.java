package p000;

/* renamed from: jz4 */
public final class jz4 extends C9414ur {

    /* renamed from: d */
    public int f38816d;

    /* renamed from: e */
    public byte[] f38817e;

    public jz4(int i, byte[] bArr) {
        super(false);
        if (bArr.length == kz4.m63640c(i)) {
            this.f38816d = i;
            this.f38817e = C9367tq.m72422f(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    /* renamed from: a */
    public byte[] mo52822a() {
        return C9367tq.m72422f(this.f38817e);
    }

    /* renamed from: b */
    public int mo52823b() {
        return this.f38816d;
    }
}
