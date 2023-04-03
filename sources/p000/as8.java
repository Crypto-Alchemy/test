package p000;

import java.io.IOException;

/* renamed from: as8 */
public class as8 {

    /* renamed from: a */
    public volatile int f20992a = -1;

    /* renamed from: b */
    public static final void m31920b(as8 as8, byte[] bArr, int i, int i2) {
        try {
            gr8 t = gr8.m44871t(bArr, 0, i2);
            as8.mo29047a(t);
            t.mo42966p();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public void mo29047a(gr8 gr8) throws IOException {
    }

    /* renamed from: d */
    public final int mo29049d() {
        int f = mo29050f();
        this.f20992a = f;
        return f;
    }

    /* renamed from: f */
    public int mo29050f() {
        return 0;
    }

    /* renamed from: g */
    public as8 clone() throws CloneNotSupportedException {
        return (as8) super.clone();
    }

    public String toString() {
        return ts8.m52431a(this);
    }
}
