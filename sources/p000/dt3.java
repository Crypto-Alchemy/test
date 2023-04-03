package p000;

import com.facebook.common.memory.PooledByteBuffer;
import java.nio.ByteBuffer;

/* renamed from: dt3 */
/* compiled from: MemoryPooledByteBuffer */
public class dt3 implements PooledByteBuffer {

    /* renamed from: a */
    public final int f10853a;

    /* renamed from: d */
    public nh0<bt3> f10854d;

    public dt3(nh0<bt3> nh0, int i) {
        boolean z;
        au4.m10792g(nh0);
        if (i < 0 || i > nh0.mo23684j().getSize()) {
            z = false;
        } else {
            z = true;
        }
        au4.m10787b(Boolean.valueOf(z));
        this.f10854d = nh0.clone();
        this.f10853a = i;
    }

    /* renamed from: B */
    public synchronized long mo13164B() throws UnsupportedOperationException {
        mo18927a();
        return this.f10854d.mo23684j().mo11798B();
    }

    /* renamed from: a */
    public synchronized void mo18927a() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    public synchronized void close() {
        nh0.m23178h(this.f10854d);
        this.f10854d = null;
    }

    public synchronized boolean isClosed() {
        return !nh0.m23180p(this.f10854d);
    }

    public synchronized int size() {
        mo18927a();
        return this.f10853a;
    }

    /* renamed from: t */
    public synchronized int mo13167t(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        mo18927a();
        if (i + i3 <= this.f10853a) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        return this.f10854d.mo23684j().mo11805t(i, bArr, i2, i3);
    }

    /* renamed from: u */
    public synchronized ByteBuffer mo13168u() {
        return this.f10854d.mo23684j().mo11806u();
    }

    /* renamed from: w */
    public synchronized byte mo13169w(int i) {
        boolean z;
        mo18927a();
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        if (i >= this.f10853a) {
            z2 = false;
        }
        au4.m10787b(Boolean.valueOf(z2));
        return this.f10854d.mo23684j().mo11807w(i);
    }
}
