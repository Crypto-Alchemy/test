package p000;

/* renamed from: ob3 */
public final class ob3 {

    /* renamed from: a */
    public final ig1 f43601a;

    /* renamed from: b */
    public final int f43602b;

    public ob3(C9156p4 p4Var, int i) {
        if (p4Var != null) {
            this.f43601a = kg1.m59760a(p4Var);
            this.f43602b = i;
            return;
        }
        throw new NullPointerException("digest == null");
    }

    /* renamed from: a */
    public byte[] mo62859a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f43602b;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == i) {
            return mo62862d(0, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong in length");
        }
    }

    /* renamed from: b */
    public byte[] mo62860b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f43602b;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == i * 2) {
            return mo62862d(1, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong in length");
        }
    }

    /* renamed from: c */
    public byte[] mo62861c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f43602b) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == 32) {
            return mo62862d(3, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong address length");
        }
    }

    /* renamed from: d */
    public final byte[] mo62862d(int i, byte[] bArr, byte[] bArr2) {
        byte[] q = dp7.m57007q((long) i, this.f43602b);
        this.f43601a.update(q, 0, q.length);
        this.f43601a.update(bArr, 0, bArr.length);
        this.f43601a.update(bArr2, 0, bArr2.length);
        int i2 = this.f43602b;
        byte[] bArr3 = new byte[i2];
        ig1 ig1 = this.f43601a;
        if (ig1 instanceof hp7) {
            ((hp7) ig1).mo51935f(bArr3, 0, i2);
        } else {
            ig1.mo50198a(bArr3, 0);
        }
        return bArr3;
    }
}
