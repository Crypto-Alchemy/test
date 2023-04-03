package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.C0997p;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p000.C2891nf;
import p000.zs6;

/* renamed from: androidx.media3.exoplayer.source.o */
/* compiled from: SampleDataQueue */
public class C0995o {

    /* renamed from: a */
    public final C2891nf f5363a;

    /* renamed from: b */
    public final int f5364b;

    /* renamed from: c */
    public final gm4 f5365c = new gm4(32);

    /* renamed from: d */
    public C0996a f5366d;

    /* renamed from: e */
    public C0996a f5367e;

    /* renamed from: f */
    public C0996a f5368f;

    /* renamed from: g */
    public long f5369g;

    /* renamed from: androidx.media3.exoplayer.source.o$a */
    /* compiled from: SampleDataQueue */
    public static final class C0996a implements C2891nf.C2892a {

        /* renamed from: a */
        public long f5370a;

        /* renamed from: b */
        public long f5371b;

        /* renamed from: c */
        public C2825mf f5372c;

        /* renamed from: d */
        public C0996a f5373d;

        public C0996a(long j, int i) {
            mo7749d(j, i);
        }

        /* renamed from: a */
        public C2825mf mo7746a() {
            return (C2825mf) C2725kr.m20985e(this.f5372c);
        }

        /* renamed from: b */
        public C0996a mo7747b() {
            this.f5372c = null;
            C0996a aVar = this.f5373d;
            this.f5373d = null;
            return aVar;
        }

        /* renamed from: c */
        public void mo7748c(C2825mf mfVar, C0996a aVar) {
            this.f5372c = mfVar;
            this.f5373d = aVar;
        }

        /* renamed from: d */
        public void mo7749d(long j, int i) {
            boolean z;
            if (this.f5372c == null) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z);
            this.f5370a = j;
            this.f5371b = j + ((long) i);
        }

        /* renamed from: e */
        public int mo7750e(long j) {
            return ((int) (j - this.f5370a)) + this.f5372c.f14961b;
        }

        public C2891nf.C2892a next() {
            C0996a aVar = this.f5373d;
            if (aVar == null || aVar.f5372c == null) {
                return null;
            }
            return aVar;
        }
    }

    public C0995o(C2891nf nfVar) {
        this.f5363a = nfVar;
        int e = nfVar.mo23664e();
        this.f5364b = e;
        C0996a aVar = new C0996a(0, e);
        this.f5366d = aVar;
        this.f5367e = aVar;
        this.f5368f = aVar;
    }

    /* renamed from: d */
    public static C0996a m7402d(C0996a aVar, long j) {
        while (j >= aVar.f5371b) {
            aVar = aVar.f5373d;
        }
        return aVar;
    }

    /* renamed from: i */
    public static C0996a m7403i(C0996a aVar, long j, ByteBuffer byteBuffer, int i) {
        C0996a d = m7402d(aVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (d.f5371b - j));
            byteBuffer.put(d.f5372c.f14960a, d.mo7750e(j), min);
            i -= min;
            j += (long) min;
            if (j == d.f5371b) {
                d = d.f5373d;
            }
        }
        return d;
    }

    /* renamed from: j */
    public static C0996a m7404j(C0996a aVar, long j, byte[] bArr, int i) {
        C0996a d = m7402d(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (d.f5371b - j));
            System.arraycopy(d.f5372c.f14960a, d.mo7750e(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == d.f5371b) {
                d = d.f5373d;
            }
        }
        return d;
    }

    /* renamed from: k */
    public static C0996a m7405k(C0996a aVar, DecoderInputBuffer decoderInputBuffer, C0997p.C0999b bVar, gm4 gm4) {
        boolean z;
        C0997p.C0999b bVar2 = bVar;
        gm4 gm42 = gm4;
        long j = bVar2.f5408b;
        int i = 1;
        gm42.mo20670L(1);
        C0996a j2 = m7404j(aVar, j, gm4.mo20679d(), 1);
        long j3 = j + 1;
        byte b = gm4.mo20679d()[0];
        if ((b & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        byte b2 = b & Byte.MAX_VALUE;
        jw0 jw0 = decoderInputBuffer.f4591d;
        byte[] bArr = jw0.f13888a;
        if (bArr == null) {
            jw0.f13888a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        C0996a j4 = m7404j(j2, j3, jw0.f13888a, b2);
        long j5 = j3 + ((long) b2);
        if (z) {
            gm42.mo20670L(2);
            j4 = m7404j(j4, j5, gm4.mo20679d(), 2);
            j5 += 2;
            i = gm4.mo20668J();
        }
        int i2 = i;
        int[] iArr = jw0.f13891d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = jw0.f13892e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            gm42.mo20670L(i3);
            j4 = m7404j(j4, j5, gm4.mo20679d(), i3);
            j5 += (long) i3;
            gm42.mo20674P(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = gm4.mo20668J();
                iArr4[i4] = gm4.mo20666H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar2.f5407a - ((int) (j5 - bVar2.f5408b));
        }
        zs6.C3758a aVar2 = (zs6.C3758a) w67.m29360j(bVar2.f5409c);
        jw0.mo22098c(i2, iArr2, iArr4, aVar2.f20678b, jw0.f13888a, aVar2.f20677a, aVar2.f20679c, aVar2.f20680d);
        long j6 = bVar2.f5408b;
        int i5 = (int) (j5 - j6);
        bVar2.f5408b = j6 + ((long) i5);
        bVar2.f5407a -= i5;
        return j4;
    }

    /* renamed from: l */
    public static C0996a m7406l(C0996a aVar, DecoderInputBuffer decoderInputBuffer, C0997p.C0999b bVar, gm4 gm4) {
        if (decoderInputBuffer.mo6972y()) {
            aVar = m7405k(aVar, decoderInputBuffer, bVar, gm4);
        }
        if (decoderInputBuffer.mo23891m()) {
            gm4.mo20670L(4);
            C0996a j = m7404j(aVar, bVar.f5408b, gm4.mo20679d(), 4);
            int H = gm4.mo20666H();
            bVar.f5408b += 4;
            bVar.f5407a -= 4;
            decoderInputBuffer.mo6970w(H);
            C0996a i = m7403i(j, bVar.f5408b, decoderInputBuffer.f4592e, H);
            bVar.f5408b += (long) H;
            int i2 = bVar.f5407a - H;
            bVar.f5407a = i2;
            decoderInputBuffer.mo6967B(i2);
            return m7403i(i, bVar.f5408b, decoderInputBuffer.f4595r, bVar.f5407a);
        }
        decoderInputBuffer.mo6970w(bVar.f5407a);
        return m7403i(aVar, bVar.f5408b, decoderInputBuffer.f4592e, bVar.f5407a);
    }

    /* renamed from: a */
    public final void mo7734a(C0996a aVar) {
        if (aVar.f5372c != null) {
            this.f5363a.mo23660a(aVar);
            aVar.mo7747b();
        }
    }

    /* renamed from: b */
    public void mo7735b(long j) {
        C0996a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.f5366d;
                if (j < aVar.f5371b) {
                    break;
                }
                this.f5363a.mo23662c(aVar.f5372c);
                this.f5366d = this.f5366d.mo7747b();
            }
            if (this.f5367e.f5370a < aVar.f5370a) {
                this.f5367e = aVar;
            }
        }
    }

    /* renamed from: c */
    public void mo7736c(long j) {
        boolean z;
        if (j <= this.f5369g) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f5369g = j;
        if (j != 0) {
            C0996a aVar = this.f5366d;
            if (j != aVar.f5370a) {
                while (this.f5369g > aVar.f5371b) {
                    aVar = aVar.f5373d;
                }
                C0996a aVar2 = (C0996a) C2725kr.m20985e(aVar.f5373d);
                mo7734a(aVar2);
                C0996a aVar3 = new C0996a(aVar.f5371b, this.f5364b);
                aVar.f5373d = aVar3;
                if (this.f5369g == aVar.f5371b) {
                    aVar = aVar3;
                }
                this.f5368f = aVar;
                if (this.f5367e == aVar2) {
                    this.f5367e = aVar3;
                    return;
                }
                return;
            }
        }
        mo7734a(this.f5366d);
        C0996a aVar4 = new C0996a(this.f5369g, this.f5364b);
        this.f5366d = aVar4;
        this.f5367e = aVar4;
        this.f5368f = aVar4;
    }

    /* renamed from: e */
    public long mo7737e() {
        return this.f5369g;
    }

    /* renamed from: f */
    public void mo7738f(DecoderInputBuffer decoderInputBuffer, C0997p.C0999b bVar) {
        m7406l(this.f5367e, decoderInputBuffer, bVar, this.f5365c);
    }

    /* renamed from: g */
    public final void mo7739g(int i) {
        long j = this.f5369g + ((long) i);
        this.f5369g = j;
        C0996a aVar = this.f5368f;
        if (j == aVar.f5371b) {
            this.f5368f = aVar.f5373d;
        }
    }

    /* renamed from: h */
    public final int mo7740h(int i) {
        C0996a aVar = this.f5368f;
        if (aVar.f5372c == null) {
            aVar.mo7748c(this.f5363a.mo23661b(), new C0996a(this.f5368f.f5371b, this.f5364b));
        }
        return Math.min(i, (int) (this.f5368f.f5371b - this.f5369g));
    }

    /* renamed from: m */
    public void mo7741m(DecoderInputBuffer decoderInputBuffer, C0997p.C0999b bVar) {
        this.f5367e = m7406l(this.f5367e, decoderInputBuffer, bVar, this.f5365c);
    }

    /* renamed from: n */
    public void mo7742n() {
        mo7734a(this.f5366d);
        this.f5366d.mo7749d(0, this.f5364b);
        C0996a aVar = this.f5366d;
        this.f5367e = aVar;
        this.f5368f = aVar;
        this.f5369g = 0;
        this.f5363a.mo23663d();
    }

    /* renamed from: o */
    public void mo7743o() {
        this.f5367e = this.f5366d;
    }

    /* renamed from: p */
    public int mo7744p(u11 u11, int i, boolean z) throws IOException {
        int h = mo7740h(i);
        C0996a aVar = this.f5368f;
        int read = u11.read(aVar.f5372c.f14960a, aVar.mo7750e(this.f5369g), h);
        if (read != -1) {
            mo7739g(read);
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: q */
    public void mo7745q(gm4 gm4, int i) {
        while (i > 0) {
            int h = mo7740h(i);
            C0996a aVar = this.f5368f;
            gm4.mo20685j(aVar.f5372c.f14960a, aVar.mo7750e(this.f5369g), h);
            i -= h;
            mo7739g(h);
        }
    }
}
