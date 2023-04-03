package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ev1 */
/* compiled from: ExifOrientationStream */
public final class ev1 extends FilterInputStream {

    /* renamed from: e */
    public static final byte[] f11362e;

    /* renamed from: g */
    public static final int f11363g;

    /* renamed from: k */
    public static final int f11364k;

    /* renamed from: a */
    public final byte f11365a;

    /* renamed from: d */
    public int f11366d;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f11362e = bArr;
        int length = bArr.length;
        f11363g = length;
        f11364k = length + 2;
    }

    public ev1(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f11365a = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f11366d;
        if (i3 < 2 || i3 > (i2 = f11364k)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f11365a;
        } else {
            i = f11362e[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f11366d++;
        }
        return i;
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f11366d = (int) (((long) this.f11366d) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f11366d;
        int i5 = f11364k;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f11365a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f11362e, this.f11366d - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f11366d += i3;
        }
        return i3;
    }
}
