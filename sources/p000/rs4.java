package p000;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;

/* renamed from: rs4 */
/* compiled from: PooledByteBufferInputStream */
public class rs4 extends InputStream {

    /* renamed from: a */
    public final PooledByteBuffer f17358a;

    /* renamed from: d */
    public int f17359d = 0;

    /* renamed from: e */
    public int f17360e = 0;

    public rs4(PooledByteBuffer pooledByteBuffer) {
        au4.m10787b(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.f17358a = (PooledByteBuffer) au4.m10792g(pooledByteBuffer);
    }

    public int available() {
        return this.f17358a.size() - this.f17359d;
    }

    public void mark(int i) {
        this.f17360e = this.f17359d;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.f17358a;
        int i = this.f17359d;
        this.f17359d = i + 1;
        return pooledByteBuffer.mo13169w(i) & 255;
    }

    public void reset() {
        this.f17359d = this.f17360e;
    }

    public long skip(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        int min = Math.min((int) j, available());
        this.f17359d += min;
        return (long) min;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.f17358a.mo13167t(this.f17359d, bArr, i, min);
        this.f17359d += min;
        return min;
    }
}
