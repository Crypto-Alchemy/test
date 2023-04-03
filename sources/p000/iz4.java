package p000;

/* renamed from: iz4 */
public final class iz4 extends C9414ur {

    /* renamed from: d */
    public int f38536d;

    /* renamed from: e */
    public byte[] f38537e;

    public iz4(int i, byte[] bArr) {
        super(true);
        if (bArr.length == kz4.m63639b(i)) {
            this.f38536d = i;
            this.f38537e = C9367tq.m72422f(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    /* renamed from: a */
    public byte[] mo52555a() {
        return C9367tq.m72422f(this.f38537e);
    }

    /* renamed from: b */
    public int mo52556b() {
        return this.f38536d;
    }
}
