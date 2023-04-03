package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioProcessor;
import com.github.mikephil.charting.utils.Utils;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.audio.f */
/* compiled from: FloatResamplingAudioProcessor */
public final class C0868f extends C0864c {

    /* renamed from: i */
    public static final int f4748i = Float.floatToIntBits(Float.NaN);

    /* renamed from: l */
    public static void m6205l(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == f4748i) {
            floatToIntBits = Float.floatToIntBits(Utils.FLOAT_EPSILON);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: c */
    public void mo6979c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f4727b.f4602c;
        if (i2 == 536870912) {
            byteBuffer2 = mo7126k((i / 3) * 4);
            while (position < limit) {
                m6205l(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo7126k(i);
            while (position < limit) {
                m6205l((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: g */
    public AudioProcessor.C0846a mo7122g(AudioProcessor.C0846a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i = aVar.f4602c;
        if (!w67.m29373p0(i)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        } else if (i != 4) {
            return new AudioProcessor.C0846a(aVar.f4600a, aVar.f4601b, 4);
        } else {
            return AudioProcessor.C0846a.f4599e;
        }
    }
}
