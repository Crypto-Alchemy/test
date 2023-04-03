package p000;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;

/* renamed from: jw0 */
/* compiled from: CryptoInfo */
public final class jw0 {

    /* renamed from: a */
    public byte[] f13888a;

    /* renamed from: b */
    public byte[] f13889b;

    /* renamed from: c */
    public int f13890c;

    /* renamed from: d */
    public int[] f13891d;

    /* renamed from: e */
    public int[] f13892e;

    /* renamed from: f */
    public int f13893f;

    /* renamed from: g */
    public int f13894g;

    /* renamed from: h */
    public int f13895h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f13896i;

    /* renamed from: j */
    public final C2637b f13897j;

    /* renamed from: jw0$b */
    /* compiled from: CryptoInfo */
    public static final class C2637b {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f13898a;

        /* renamed from: b */
        public final MediaCodec$CryptoInfo$Pattern f13899b;

        /* renamed from: b */
        public final void mo22099b(int i, int i2) {
            this.f13899b.set(i, i2);
            this.f13898a.setPattern(this.f13899b);
        }

        public C2637b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f13898a = cryptoInfo;
            this.f13899b = new MediaCodec$CryptoInfo$Pattern(0, 0);
        }
    }

    public jw0() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f13896i = cryptoInfo;
        this.f13897j = w67.f19021a >= 24 ? new C2637b(cryptoInfo) : null;
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo mo22096a() {
        return this.f13896i;
    }

    /* renamed from: b */
    public void mo22097b(int i) {
        if (i != 0) {
            if (this.f13891d == null) {
                int[] iArr = new int[1];
                this.f13891d = iArr;
                this.f13896i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f13891d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    /* renamed from: c */
    public void mo22098c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f13893f = i;
        this.f13891d = iArr;
        this.f13892e = iArr2;
        this.f13889b = bArr;
        this.f13888a = bArr2;
        this.f13890c = i2;
        this.f13894g = i3;
        this.f13895h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f13896i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (w67.f19021a >= 24) {
            ((C2637b) C2725kr.m20985e(this.f13897j)).mo22099b(i3, i4);
        }
    }
}
