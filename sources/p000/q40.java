package p000;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: q40 */
/* compiled from: BufferMemoryChunk */
public class q40 implements bt3, Closeable {

    /* renamed from: a */
    public ByteBuffer f16780a;

    /* renamed from: d */
    public final int f16781d;

    /* renamed from: e */
    public final long f16782e = ((long) System.identityHashCode(this));

    public q40(int i) {
        this.f16780a = ByteBuffer.allocateDirect(i);
        this.f16781d = i;
    }

    /* renamed from: B */
    public long mo11798B() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    /* renamed from: C */
    public synchronized int mo11799C(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int a;
        au4.m10792g(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        au4.m10794i(z);
        au4.m10792g(this.f16780a);
        a = ct3.m14491a(i, i3, this.f16781d);
        ct3.m14492b(i, bArr.length, i2, a, this.f16781d);
        this.f16780a.position(i);
        this.f16780a.put(bArr, i2, a);
        return a;
    }

    /* renamed from: G */
    public void mo11800G(int i, bt3 bt3, int i2, int i3) {
        au4.m10792g(bt3);
        if (bt3.getUniqueId() == getUniqueId()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Copying from BufferMemoryChunk ");
            sb.append(Long.toHexString(getUniqueId()));
            sb.append(" to BufferMemoryChunk ");
            sb.append(Long.toHexString(bt3.getUniqueId()));
            sb.append(" which are the same ");
            au4.m10787b(Boolean.FALSE);
        }
        if (bt3.getUniqueId() < getUniqueId()) {
            synchronized (bt3) {
                synchronized (this) {
                    mo24922a(i, bt3, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (bt3) {
                mo24922a(i, bt3, i2, i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo24922a(int i, bt3 bt3, int i2, int i3) {
        if (bt3 instanceof q40) {
            au4.m10794i(!isClosed());
            au4.m10794i(!bt3.isClosed());
            au4.m10792g(this.f16780a);
            ct3.m14492b(i, bt3.getSize(), i2, i3, this.f16781d);
            this.f16780a.position(i);
            ByteBuffer byteBuffer = (ByteBuffer) au4.m10792g(bt3.mo11806u());
            byteBuffer.position(i2);
            byte[] bArr = new byte[i3];
            this.f16780a.get(bArr, 0, i3);
            byteBuffer.put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public synchronized void close() {
        this.f16780a = null;
    }

    public int getSize() {
        return this.f16781d;
    }

    public long getUniqueId() {
        return this.f16782e;
    }

    public synchronized boolean isClosed() {
        boolean z;
        if (this.f16780a == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: t */
    public synchronized int mo11805t(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int a;
        au4.m10792g(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        au4.m10794i(z);
        au4.m10792g(this.f16780a);
        a = ct3.m14491a(i, i3, this.f16781d);
        ct3.m14492b(i, bArr.length, i2, a, this.f16781d);
        this.f16780a.position(i);
        this.f16780a.get(bArr, i2, a);
        return a;
    }

    /* renamed from: u */
    public synchronized ByteBuffer mo11806u() {
        return this.f16780a;
    }

    /* renamed from: w */
    public synchronized byte mo11807w(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        au4.m10794i(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        au4.m10787b(Boolean.valueOf(z2));
        if (i >= this.f16781d) {
            z3 = false;
        }
        au4.m10787b(Boolean.valueOf(z3));
        au4.m10792g(this.f16780a);
        return this.f16780a.get(i);
    }
}
