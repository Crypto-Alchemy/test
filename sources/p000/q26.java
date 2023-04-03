package p000;

import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

/* renamed from: q26 */
/* compiled from: SimpleMetadataDecoder */
public abstract class q26 implements cv3 {
    /* renamed from: a */
    public final Metadata mo18362a(ev3 ev3) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) C2725kr.m20985e(ev3.f4592e);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        if (ev3.mo23892o()) {
            return null;
        }
        return mo24902b(ev3, byteBuffer);
    }

    /* renamed from: b */
    public abstract Metadata mo24902b(ev3 ev3, ByteBuffer byteBuffer);
}
