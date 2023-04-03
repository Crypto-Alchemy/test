package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: hu3 */
/* compiled from: MergedStream */
public final class hu3 extends InputStream {

    /* renamed from: a */
    public final po2 f13068a;

    /* renamed from: d */
    public final InputStream f13069d;

    /* renamed from: e */
    public byte[] f13070e;

    /* renamed from: g */
    public int f13071g;

    /* renamed from: k */
    public final int f13072k;

    public hu3(po2 po2, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f13068a = po2;
        this.f13069d = inputStream;
        this.f13070e = bArr;
        this.f13071g = i;
        this.f13072k = i2;
    }

    /* renamed from: a */
    public final void mo21390a() {
        byte[] bArr = this.f13070e;
        if (bArr != null) {
            this.f13070e = null;
            po2 po2 = this.f13068a;
            if (po2 != null) {
                po2.mo24748r(bArr);
            }
        }
    }

    public int available() throws IOException {
        if (this.f13070e != null) {
            return this.f13072k - this.f13071g;
        }
        return this.f13069d.available();
    }

    public void close() throws IOException {
        mo21390a();
        this.f13069d.close();
    }

    public synchronized void mark(int i) {
        if (this.f13070e == null) {
            this.f13069d.mark(i);
        }
    }

    public boolean markSupported() {
        if (this.f13070e != null || !this.f13069d.markSupported()) {
            return false;
        }
        return true;
    }

    public int read() throws IOException {
        byte[] bArr = this.f13070e;
        if (bArr == null) {
            return this.f13069d.read();
        }
        int i = this.f13071g;
        int i2 = i + 1;
        this.f13071g = i2;
        byte b = bArr[i] & 255;
        if (i2 >= this.f13072k) {
            mo21390a();
        }
        return b;
    }

    public synchronized void reset() throws IOException {
        if (this.f13070e == null) {
            this.f13069d.reset();
        }
    }

    public long skip(long j) throws IOException {
        long j2;
        if (this.f13070e != null) {
            int i = this.f13072k;
            int i2 = this.f13071g;
            long j3 = (long) (i - i2);
            if (j3 > j) {
                this.f13071g = i2 + ((int) j);
                return j;
            }
            mo21390a();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        if (j > 0) {
            return j2 + this.f13069d.skip(j);
        }
        return j2;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f13070e;
        if (bArr2 == null) {
            return this.f13069d.read(bArr, i, i2);
        }
        int i3 = this.f13072k;
        int i4 = this.f13071g;
        int i5 = i3 - i4;
        if (i2 > i5) {
            i2 = i5;
        }
        System.arraycopy(bArr2, i4, bArr, i, i2);
        int i6 = this.f13071g + i2;
        this.f13071g = i6;
        if (i6 >= this.f13072k) {
            mo21390a();
        }
        return i2;
    }
}
