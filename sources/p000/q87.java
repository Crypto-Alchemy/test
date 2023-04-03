package p000;

import java.io.IOException;

/* renamed from: q87 */
/* compiled from: VarintReader */
public final class q87 {

    /* renamed from: d */
    public static final long[] f16882d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f16883a = new byte[8];

    /* renamed from: b */
    public int f16884b;

    /* renamed from: c */
    public int f16885c;

    /* renamed from: a */
    public static long m25550a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f16882d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: c */
    public static int m25551c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f16882d;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public int mo25038b() {
        return this.f16885c;
    }

    /* renamed from: d */
    public long mo25039d(iy1 iy1, boolean z, boolean z2, int i) throws IOException {
        if (this.f16884b == 0) {
            if (!iy1.mo86f(this.f16883a, 0, 1, z)) {
                return -1;
            }
            int c = m25551c(this.f16883a[0] & 255);
            this.f16885c = c;
            if (c != -1) {
                this.f16884b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f16885c;
        if (i2 > i) {
            this.f16884b = 0;
            return -2;
        }
        if (i2 != 1) {
            iy1.readFully(this.f16883a, 1, i2 - 1);
        }
        this.f16884b = 0;
        return m25550a(this.f16883a, this.f16885c, z2);
    }

    /* renamed from: e */
    public void mo25040e() {
        this.f16884b = 0;
        this.f16885c = 0;
    }
}
