package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.audio.d */
/* compiled from: ChannelMappingAudioProcessor */
public final class C0865d extends C0864c {

    /* renamed from: i */
    public int[] f4734i;

    /* renamed from: j */
    public int[] f4735j;

    /* renamed from: c */
    public void mo6979c(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C2725kr.m20985e(this.f4735j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k = mo7126k(((limit - position) / this.f4727b.f4603d) * this.f4728c.f4603d);
        while (position < limit) {
            for (int i : iArr) {
                k.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f4727b.f4603d;
        }
        byteBuffer.position(limit);
        k.flip();
    }

    /* renamed from: g */
    public AudioProcessor.C0846a mo7122g(AudioProcessor.C0846a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        boolean z;
        boolean z2;
        int[] iArr = this.f4734i;
        if (iArr == null) {
            return AudioProcessor.C0846a.f4599e;
        }
        if (aVar.f4602c == 2) {
            if (aVar.f4601b != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 < aVar.f4601b) {
                    if (i2 != i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                    i++;
                } else {
                    throw new AudioProcessor.UnhandledAudioFormatException(aVar);
                }
            }
            if (z) {
                return new AudioProcessor.C0846a(aVar.f4600a, iArr.length, 2);
            }
            return AudioProcessor.C0846a.f4599e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* renamed from: h */
    public void mo7123h() {
        this.f4735j = this.f4734i;
    }

    /* renamed from: j */
    public void mo7125j() {
        this.f4735j = null;
        this.f4734i = null;
    }

    /* renamed from: l */
    public void mo7127l(int[] iArr) {
        this.f4734i = iArr;
    }
}
