package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.audio.i */
/* compiled from: SilenceSkippingAudioProcessor */
public final class C0873i extends C0864c {

    /* renamed from: i */
    public final long f4762i;

    /* renamed from: j */
    public final long f4763j;

    /* renamed from: k */
    public final short f4764k;

    /* renamed from: l */
    public int f4765l;

    /* renamed from: m */
    public boolean f4766m;

    /* renamed from: n */
    public byte[] f4767n;

    /* renamed from: o */
    public byte[] f4768o;

    /* renamed from: p */
    public int f4769p;

    /* renamed from: q */
    public int f4770q;

    /* renamed from: r */
    public int f4771r;

    /* renamed from: s */
    public boolean f4772s;

    /* renamed from: t */
    public long f4773t;

    public C0873i() {
        this(150000, 20000, 1024);
    }

    /* renamed from: a */
    public boolean mo6977a() {
        return this.f4766m;
    }

    /* renamed from: c */
    public void mo6979c(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !mo7121f()) {
            int i = this.f4769p;
            if (i == 0) {
                mo7171s(byteBuffer);
            } else if (i == 1) {
                mo7170r(byteBuffer);
            } else if (i == 2) {
                mo7172t(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: g */
    public AudioProcessor.C0846a mo7122g(AudioProcessor.C0846a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f4602c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        } else if (this.f4766m) {
            return aVar;
        } else {
            return AudioProcessor.C0846a.f4599e;
        }
    }

    /* renamed from: h */
    public void mo7123h() {
        if (this.f4766m) {
            this.f4765l = this.f4727b.f4603d;
            int l = mo7164l(this.f4762i) * this.f4765l;
            if (this.f4767n.length != l) {
                this.f4767n = new byte[l];
            }
            int l2 = mo7164l(this.f4763j) * this.f4765l;
            this.f4771r = l2;
            if (this.f4768o.length != l2) {
                this.f4768o = new byte[l2];
            }
        }
        this.f4769p = 0;
        this.f4773t = 0;
        this.f4770q = 0;
        this.f4772s = false;
    }

    /* renamed from: i */
    public void mo7124i() {
        int i = this.f4770q;
        if (i > 0) {
            mo7169q(this.f4767n, i);
        }
        if (!this.f4772s) {
            this.f4773t += (long) (this.f4771r / this.f4765l);
        }
    }

    /* renamed from: j */
    public void mo7125j() {
        this.f4766m = false;
        this.f4771r = 0;
        byte[] bArr = w67.f19026f;
        this.f4767n = bArr;
        this.f4768o = bArr;
    }

    /* renamed from: l */
    public final int mo7164l(long j) {
        return (int) ((j * ((long) this.f4727b.f4600a)) / 1000000);
    }

    /* renamed from: m */
    public final int mo7165m(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs(byteBuffer.getShort(limit)) > this.f4764k) {
                int i = this.f4765l;
                return ((limit / i) * i) + i;
            }
        }
    }

    /* renamed from: n */
    public final int mo7166n(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f4764k) {
                int i = this.f4765l;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: o */
    public long mo7167o() {
        return this.f4773t;
    }

    /* renamed from: p */
    public final void mo7168p(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo7126k(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f4772s = true;
        }
    }

    /* renamed from: q */
    public final void mo7169q(byte[] bArr, int i) {
        mo7126k(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f4772s = true;
        }
    }

    /* renamed from: r */
    public final void mo7170r(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int n = mo7166n(byteBuffer);
        int position = n - byteBuffer.position();
        byte[] bArr = this.f4767n;
        int length = bArr.length;
        int i = this.f4770q;
        int i2 = length - i;
        if (n >= limit || position >= i2) {
            int min = Math.min(position, i2);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f4767n, this.f4770q, min);
            int i3 = this.f4770q + min;
            this.f4770q = i3;
            byte[] bArr2 = this.f4767n;
            if (i3 == bArr2.length) {
                if (this.f4772s) {
                    mo7169q(bArr2, this.f4771r);
                    this.f4773t += (long) ((this.f4770q - (this.f4771r * 2)) / this.f4765l);
                } else {
                    this.f4773t += (long) ((i3 - this.f4771r) / this.f4765l);
                }
                mo7174v(byteBuffer, this.f4767n, this.f4770q);
                this.f4770q = 0;
                this.f4769p = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        mo7169q(bArr, i);
        this.f4770q = 0;
        this.f4769p = 0;
    }

    /* renamed from: s */
    public final void mo7171s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f4767n.length));
        int m = mo7165m(byteBuffer);
        if (m == byteBuffer.position()) {
            this.f4769p = 1;
        } else {
            byteBuffer.limit(m);
            mo7168p(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: t */
    public final void mo7172t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int n = mo7166n(byteBuffer);
        byteBuffer.limit(n);
        this.f4773t += (long) (byteBuffer.remaining() / this.f4765l);
        mo7174v(byteBuffer, this.f4768o, this.f4771r);
        if (n < limit) {
            mo7169q(this.f4768o, this.f4771r);
            this.f4769p = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: u */
    public void mo7173u(boolean z) {
        this.f4766m = z;
    }

    /* renamed from: v */
    public final void mo7174v(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f4771r);
        int i2 = this.f4771r - min;
        System.arraycopy(bArr, i - i2, this.f4768o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f4768o, i2, min);
    }

    public C0873i(long j, long j2, short s) {
        C2725kr.m20981a(j2 <= j);
        this.f4762i = j;
        this.f4763j = j2;
        this.f4764k = s;
        byte[] bArr = w67.f19026f;
        this.f4767n = bArr;
        this.f4768o = bArr;
    }
}
