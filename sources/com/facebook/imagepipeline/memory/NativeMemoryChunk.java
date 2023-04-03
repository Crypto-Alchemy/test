package com.facebook.imagepipeline.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

@ii1
public class NativeMemoryChunk implements bt3, Closeable {

    /* renamed from: a */
    public final long f9631a;

    /* renamed from: d */
    public final int f9632d;

    /* renamed from: e */
    public boolean f9633e;

    static {
        u34.m28058d("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        au4.m10787b(Boolean.valueOf(i > 0));
        this.f9632d = i;
        this.f9631a = nativeAllocate(i);
        this.f9633e = false;
    }

    @ii1
    private static native long nativeAllocate(int i);

    @ii1
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @ii1
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @ii1
    private static native void nativeFree(long j);

    @ii1
    private static native void nativeMemcpy(long j, long j2, int i);

    @ii1
    private static native byte nativeReadByte(long j);

    /* renamed from: B */
    public long mo11798B() {
        return this.f9631a;
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
        a = ct3.m14491a(i, i3, this.f9632d);
        ct3.m14492b(i, bArr.length, i2, a, this.f9632d);
        nativeCopyFromByteArray(this.f9631a + ((long) i), bArr, i2, a);
        return a;
    }

    /* renamed from: G */
    public void mo11800G(int i, bt3 bt3, int i2, int i3) {
        au4.m10792g(bt3);
        if (bt3.getUniqueId() == getUniqueId()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Copying from NativeMemoryChunk ");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" to NativeMemoryChunk ");
            sb.append(Integer.toHexString(System.identityHashCode(bt3)));
            sb.append(" which share the same address ");
            sb.append(Long.toHexString(this.f9631a));
            au4.m10787b(Boolean.FALSE);
        }
        if (bt3.getUniqueId() < getUniqueId()) {
            synchronized (bt3) {
                synchronized (this) {
                    mo13362a(i, bt3, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (bt3) {
                mo13362a(i, bt3, i2, i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo13362a(int i, bt3 bt3, int i2, int i3) {
        if (bt3 instanceof NativeMemoryChunk) {
            au4.m10794i(!isClosed());
            au4.m10794i(!bt3.isClosed());
            ct3.m14492b(i, bt3.getSize(), i2, i3, this.f9632d);
            nativeMemcpy(bt3.mo11798B() + ((long) i2), this.f9631a + ((long) i), i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public synchronized void close() {
        if (!this.f9633e) {
            this.f9633e = true;
            nativeFree(this.f9631a);
        }
    }

    public void finalize() throws Throwable {
        if (!isClosed()) {
            StringBuilder sb = new StringBuilder();
            sb.append("finalize: Chunk ");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" still active. ");
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public int getSize() {
        return this.f9632d;
    }

    public long getUniqueId() {
        return this.f9631a;
    }

    public synchronized boolean isClosed() {
        return this.f9633e;
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
        a = ct3.m14491a(i, i3, this.f9632d);
        ct3.m14492b(i, bArr.length, i2, a, this.f9632d);
        nativeCopyToByteArray(this.f9631a + ((long) i), bArr, i2, a);
        return a;
    }

    /* renamed from: u */
    public ByteBuffer mo11806u() {
        return null;
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
        if (i >= this.f9632d) {
            z3 = false;
        }
        au4.m10787b(Boolean.valueOf(z3));
        return nativeReadByte(this.f9631a + ((long) i));
    }

    public NativeMemoryChunk() {
        this.f9632d = 0;
        this.f9631a = 0;
        this.f9633e = true;
    }
}
