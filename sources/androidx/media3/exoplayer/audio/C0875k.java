package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.audio.k */
/* compiled from: TrimmingAudioProcessor */
public final class C0875k extends C0864c {

    /* renamed from: i */
    public int f4789i;

    /* renamed from: j */
    public int f4790j;

    /* renamed from: k */
    public boolean f4791k;

    /* renamed from: l */
    public int f4792l;

    /* renamed from: m */
    public byte[] f4793m = w67.f19026f;

    /* renamed from: n */
    public int f4794n;

    /* renamed from: o */
    public long f4795o;

    /* renamed from: c */
    public void mo6979c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f4792l);
            this.f4795o += (long) (min / this.f4727b.f4603d);
            this.f4792l -= min;
            byteBuffer.position(position + min);
            if (this.f4792l <= 0) {
                int i2 = i - min;
                int length = (this.f4794n + i2) - this.f4793m.length;
                ByteBuffer k = mo7126k(length);
                int q = w67.m29374q(length, 0, this.f4794n);
                k.put(this.f4793m, 0, q);
                int q2 = w67.m29374q(length - q, 0, i2);
                byteBuffer.limit(byteBuffer.position() + q2);
                k.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - q2;
                int i4 = this.f4794n - q;
                this.f4794n = i4;
                byte[] bArr = this.f4793m;
                System.arraycopy(bArr, q, bArr, 0, i4);
                byteBuffer.get(this.f4793m, this.f4794n, i3);
                this.f4794n += i3;
                k.flip();
            }
        }
    }

    /* renamed from: e */
    public boolean mo6981e() {
        if (!super.mo6981e() || this.f4794n != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public AudioProcessor.C0846a mo7122g(AudioProcessor.C0846a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f4602c == 2) {
            this.f4791k = true;
            if (this.f4789i == 0 && this.f4790j == 0) {
                return AudioProcessor.C0846a.f4599e;
            }
            return aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    public ByteBuffer getOutput() {
        int i;
        if (super.mo6981e() && (i = this.f4794n) > 0) {
            mo7126k(i).put(this.f4793m, 0, this.f4794n).flip();
            this.f4794n = 0;
        }
        return super.getOutput();
    }

    /* renamed from: h */
    public void mo7123h() {
        if (this.f4791k) {
            this.f4791k = false;
            int i = this.f4790j;
            int i2 = this.f4727b.f4603d;
            this.f4793m = new byte[(i * i2)];
            this.f4792l = this.f4789i * i2;
        }
        this.f4794n = 0;
    }

    /* renamed from: i */
    public void mo7124i() {
        if (this.f4791k) {
            int i = this.f4794n;
            if (i > 0) {
                this.f4795o += (long) (i / this.f4727b.f4603d);
            }
            this.f4794n = 0;
        }
    }

    /* renamed from: j */
    public void mo7125j() {
        this.f4793m = w67.f19026f;
    }

    /* renamed from: l */
    public long mo7178l() {
        return this.f4795o;
    }

    /* renamed from: m */
    public void mo7179m() {
        this.f4795o = 0;
    }

    /* renamed from: n */
    public void mo7180n(int i, int i2) {
        this.f4789i = i;
        this.f4790j = i2;
    }
}
