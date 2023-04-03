package p000;

import android.media.MediaFormat;
import androidx.media3.common.C0787e;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: dr3 */
/* compiled from: MediaFormatUtil */
public final class dr3 {
    /* renamed from: a */
    public static void m15336a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m15337b(MediaFormat mediaFormat, C0787e eVar) {
        if (eVar != null) {
            m15339d(mediaFormat, "color-transfer", eVar.f4160e);
            m15339d(mediaFormat, "color-standard", eVar.f4158a);
            m15339d(mediaFormat, "color-range", eVar.f4159d);
            m15336a(mediaFormat, "hdr-static-info", eVar.f4161g);
        }
    }

    /* renamed from: c */
    public static void m15338c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: d */
    public static void m15339d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: e */
    public static void m15340e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
