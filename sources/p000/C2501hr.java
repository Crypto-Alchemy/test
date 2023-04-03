package p000;

import android.annotation.TargetApi;
import android.p001os.SharedMemory;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

@TargetApi(27)
/* renamed from: hr */
/* compiled from: AshmemMemoryChunk */
public class C2501hr implements bt3, Closeable {

    /* renamed from: a */
    public SharedMemory f12996a;

    /* renamed from: d */
    public ByteBuffer f12997d;

    /* renamed from: e */
    public final long f12998e;

    public C2501hr(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i);
            this.f12996a = create;
            this.f12997d = create.mapReadWrite();
            this.f12998e = (long) System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    /* renamed from: B */
    public long mo11798B() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    /* renamed from: C */
    public synchronized int mo11799C(int i, byte[] bArr, int i2, int i3) {
        int a;
        au4.m10792g(bArr);
        au4.m10792g(this.f12997d);
        a = ct3.m14491a(i, i3, getSize());
        ct3.m14492b(i, bArr.length, i2, a, getSize());
        this.f12997d.position(i);
        this.f12997d.put(bArr, i2, a);
        return a;
    }

    /* renamed from: G */
    public void mo11800G(int i, bt3 bt3, int i2, int i3) {
        au4.m10792g(bt3);
        if (bt3.getUniqueId() == getUniqueId()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Copying from AshmemMemoryChunk ");
            sb.append(Long.toHexString(getUniqueId()));
            sb.append(" to AshmemMemoryChunk ");
            sb.append(Long.toHexString(bt3.getUniqueId()));
            sb.append(" which are the same ");
            au4.m10787b(Boolean.FALSE);
        }
        if (bt3.getUniqueId() < getUniqueId()) {
            synchronized (bt3) {
                synchronized (this) {
                    mo21336a(i, bt3, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (bt3) {
                mo21336a(i, bt3, i2, i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo21336a(int i, bt3 bt3, int i2, int i3) {
        if (bt3 instanceof C2501hr) {
            au4.m10794i(!isClosed());
            au4.m10794i(!bt3.isClosed());
            au4.m10792g(this.f12997d);
            au4.m10792g(bt3.mo11806u());
            ct3.m14492b(i, bt3.getSize(), i2, i3, getSize());
            this.f12997d.position(i);
            bt3.mo11806u().position(i2);
            byte[] bArr = new byte[i3];
            this.f12997d.get(bArr, 0, i3);
            bt3.mo11806u().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory sharedMemory = this.f12996a;
            if (sharedMemory != null) {
                sharedMemory.close();
            }
            ByteBuffer byteBuffer = this.f12997d;
            if (byteBuffer != null) {
                SharedMemory.unmap(byteBuffer);
            }
            this.f12997d = null;
            this.f12996a = null;
        }
    }

    public int getSize() {
        au4.m10792g(this.f12996a);
        return this.f12996a.getSize();
    }

    public long getUniqueId() {
        return this.f12998e;
    }

    public synchronized boolean isClosed() {
        boolean z;
        if (this.f12997d == null || this.f12996a == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: t */
    public synchronized int mo11805t(int i, byte[] bArr, int i2, int i3) {
        int a;
        au4.m10792g(bArr);
        au4.m10792g(this.f12997d);
        a = ct3.m14491a(i, i3, getSize());
        ct3.m14492b(i, bArr.length, i2, a, getSize());
        this.f12997d.position(i);
        this.f12997d.get(bArr, i2, a);
        return a;
    }

    /* renamed from: u */
    public ByteBuffer mo11806u() {
        return this.f12997d;
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
        if (i >= getSize()) {
            z3 = false;
        }
        au4.m10787b(Boolean.valueOf(z3));
        au4.m10792g(this.f12997d);
        return this.f12997d.get(i);
    }
}
