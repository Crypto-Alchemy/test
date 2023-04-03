package p000;

import com.google.android.gms.internal.clearcut.zzco;

/* renamed from: mc8 */
public final class mc8 extends hc8 {

    /* renamed from: d */
    public final byte[] f31649d;

    /* renamed from: e */
    public final boolean f31650e;

    /* renamed from: f */
    public int f31651f;

    /* renamed from: g */
    public int f31652g;

    /* renamed from: h */
    public int f31653h;

    /* renamed from: i */
    public int f31654i;

    /* renamed from: j */
    public int f31655j;

    public mc8(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f31655j = Integer.MAX_VALUE;
        this.f31649d = bArr;
        this.f31651f = i2 + i;
        this.f31653h = i;
        this.f31654i = i;
        this.f31650e = z;
    }

    /* renamed from: c */
    public final int mo43127c() {
        return this.f31653h - this.f31654i;
    }

    /* renamed from: d */
    public final int mo43128d(int i) throws zzco {
        if (i >= 0) {
            int c = i + mo43127c();
            int i2 = this.f31655j;
            if (c <= i2) {
                this.f31655j = c;
                int i3 = this.f31651f + this.f31652g;
                this.f31651f = i3;
                int i4 = i3 - this.f31654i;
                if (i4 > c) {
                    int i5 = i4 - c;
                    this.f31652g = i5;
                    this.f31651f = i3 - i5;
                } else {
                    this.f31652g = 0;
                }
                return i2;
            }
            throw zzco.zzbl();
        }
        throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
