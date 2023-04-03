package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: yr7 */
public final class yr7 implements nt7 {

    /* renamed from: a */
    public final ByteBuffer f35915a;

    public yr7(ByteBuffer byteBuffer) {
        this.f35915a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final long mo46219a() {
        return (long) this.f35915a.capacity();
    }

    /* renamed from: a */
    public final void mo46220a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f35915a) {
            int i2 = (int) j;
            this.f35915a.position(i2);
            this.f35915a.limit(i2 + i);
            slice = this.f35915a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }
}
