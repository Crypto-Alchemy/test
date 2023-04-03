package p000;

import java.nio.ByteBuffer;

/* renamed from: bt3 */
/* compiled from: MemoryChunk */
public interface bt3 {
    /* renamed from: B */
    long mo11798B() throws UnsupportedOperationException;

    /* renamed from: C */
    int mo11799C(int i, byte[] bArr, int i2, int i3);

    /* renamed from: G */
    void mo11800G(int i, bt3 bt3, int i2, int i3);

    void close();

    int getSize();

    long getUniqueId();

    boolean isClosed();

    /* renamed from: t */
    int mo11805t(int i, byte[] bArr, int i2, int i3);

    /* renamed from: u */
    ByteBuffer mo11806u();

    /* renamed from: w */
    byte mo11807w(int i);
}
