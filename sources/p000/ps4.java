package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ps4 */
/* compiled from: PooledByteArrayBufferedInputStream */
public class ps4 extends InputStream {

    /* renamed from: a */
    public final InputStream f16645a;

    /* renamed from: d */
    public final byte[] f16646d;

    /* renamed from: e */
    public final rf5<byte[]> f16647e;

    /* renamed from: g */
    public int f16648g = 0;

    /* renamed from: k */
    public int f16649k = 0;

    /* renamed from: r */
    public boolean f16650r = false;

    /* JADX WARNING: type inference failed for: r3v0, types: [rf5<byte[]>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ps4(java.io.InputStream r1, byte[] r2, p000.rf5<byte[]> r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p000.au4.m10792g(r1)
            java.io.InputStream r1 = (java.io.InputStream) r1
            r0.f16645a = r1
            java.lang.Object r1 = p000.au4.m10792g(r2)
            byte[] r1 = (byte[]) r1
            r0.f16646d = r1
            java.lang.Object r1 = p000.au4.m10792g(r3)
            rf5 r1 = (p000.rf5) r1
            r0.f16647e = r1
            r1 = 0
            r0.f16648g = r1
            r0.f16649k = r1
            r0.f16650r = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ps4.<init>(java.io.InputStream, byte[], rf5):void");
    }

    /* renamed from: a */
    public final boolean mo24783a() throws IOException {
        if (this.f16649k < this.f16648g) {
            return true;
        }
        int read = this.f16645a.read(this.f16646d);
        if (read <= 0) {
            return false;
        }
        this.f16648g = read;
        this.f16649k = 0;
        return true;
    }

    public int available() throws IOException {
        boolean z;
        if (this.f16649k <= this.f16648g) {
            z = true;
        } else {
            z = false;
        }
        au4.m10794i(z);
        mo24785b();
        return (this.f16648g - this.f16649k) + this.f16645a.available();
    }

    /* renamed from: b */
    public final void mo24785b() throws IOException {
        if (this.f16650r) {
            throw new IOException("stream already closed");
        }
    }

    public void close() throws IOException {
        if (!this.f16650r) {
            this.f16650r = true;
            this.f16647e.mo360a(this.f16646d);
            super.close();
        }
    }

    public void finalize() throws Throwable {
        if (!this.f16650r) {
            oy1.m24421h("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    public int read() throws IOException {
        au4.m10794i(this.f16649k <= this.f16648g);
        mo24785b();
        if (!mo24783a()) {
            return -1;
        }
        byte[] bArr = this.f16646d;
        int i = this.f16649k;
        this.f16649k = i + 1;
        return bArr[i] & 255;
    }

    public long skip(long j) throws IOException {
        boolean z;
        if (this.f16649k <= this.f16648g) {
            z = true;
        } else {
            z = false;
        }
        au4.m10794i(z);
        mo24785b();
        int i = this.f16648g;
        int i2 = this.f16649k;
        long j2 = (long) (i - i2);
        if (j2 >= j) {
            this.f16649k = (int) (((long) i2) + j);
            return j;
        }
        this.f16649k = i;
        return j2 + this.f16645a.skip(j - j2);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        au4.m10794i(this.f16649k <= this.f16648g);
        mo24785b();
        if (!mo24783a()) {
            return -1;
        }
        int min = Math.min(this.f16648g - this.f16649k, i2);
        System.arraycopy(this.f16646d, this.f16649k, bArr, i, min);
        this.f16649k += min;
        return min;
    }
}
