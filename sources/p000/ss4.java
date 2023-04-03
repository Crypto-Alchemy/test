package p000;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ss4 */
/* compiled from: PooledByteBufferOutputStream */
public abstract class ss4 extends OutputStream {
    /* renamed from: a */
    public abstract PooledByteBuffer mo13354a();

    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            pp6.m25127a(e);
        }
    }

    public abstract int size();
}
