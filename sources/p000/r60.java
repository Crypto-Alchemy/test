package p000;

import com.bumptech.glide.load.data.C1735a;
import java.nio.ByteBuffer;

/* renamed from: r60 */
/* compiled from: ByteBufferRewinder */
public class r60 implements C1735a<ByteBuffer> {

    /* renamed from: a */
    public final ByteBuffer f17134a;

    /* renamed from: r60$a */
    /* compiled from: ByteBufferRewinder */
    public static class C3181a implements C1735a.C1736a<ByteBuffer> {
        /* renamed from: a */
        public Class<ByteBuffer> mo12401a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public C1735a<ByteBuffer> mo12402b(ByteBuffer byteBuffer) {
            return new r60(byteBuffer);
        }
    }

    public r60(ByteBuffer byteBuffer) {
        this.f17134a = byteBuffer;
    }

    /* renamed from: b */
    public void mo12398b() {
    }

    /* renamed from: c */
    public ByteBuffer mo12397a() {
        this.f17134a.position(0);
        return this.f17134a;
    }
}
