package p000;

/* renamed from: yf7 */
public final class yf7 {

    /* renamed from: a */
    public final byte[][] f46205a;

    public yf7(xf7 xf7, byte[][] bArr) {
        if (xf7 == null) {
            throw new NullPointerException("params == null");
        } else if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        } else if (dp7.m57001k(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        } else if (bArr.length == xf7.mo66862a()) {
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i].length == xf7.mo66864c()) {
                    i++;
                } else {
                    throw new IllegalArgumentException("wrong publicKey format");
                }
            }
            this.f46205a = dp7.m56994d(bArr);
        } else {
            throw new IllegalArgumentException("wrong publicKey size");
        }
    }

    /* renamed from: a */
    public byte[][] mo67092a() {
        return dp7.m56994d(this.f46205a);
    }
}
