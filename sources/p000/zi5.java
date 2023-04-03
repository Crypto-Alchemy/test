package p000;

/* renamed from: zi5 */
public class zi5 extends xe2 {

    /* renamed from: d */
    public int f46389d;

    /* renamed from: e */
    public int f46390e;

    /* renamed from: f */
    public int f46391f;

    /* renamed from: g */
    public int f46392g;

    /* renamed from: h */
    public int f46393h;

    /* renamed from: i */
    public int[] f46394i = new int[80];

    /* renamed from: j */
    public int f46395j;

    public zi5() {
        reset();
    }

    public zi5(zi5 zi5) {
        super(zi5);
        mo67308m(zi5);
    }

    /* renamed from: a */
    public int mo50198a(byte[] bArr, int i) {
        mo66860i();
        ek4.m57383c(this.f46389d, bArr, i);
        ek4.m57383c(this.f46390e, bArr, i + 4);
        ek4.m57383c(this.f46391f, bArr, i + 8);
        ek4.m57383c(this.f46392g, bArr, i + 12);
        ek4.m57383c(this.f46393h, bArr, i + 16);
        reset();
        return 20;
    }

    /* renamed from: c */
    public void mo50199c(us3 us3) {
        zi5 zi5 = (zi5) us3;
        super.mo66859h(zi5);
        mo67308m(zi5);
    }

    public us3 copy() {
        return new zi5(this);
    }

    /* renamed from: d */
    public String mo50201d() {
        return "SHA-1";
    }

    /* renamed from: e */
    public int mo50202e() {
        return 20;
    }

    /* renamed from: j */
    public void mo50203j() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.f46394i;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int i3 = this.f46389d;
        int i4 = this.f46390e;
        int i5 = this.f46391f;
        int i6 = this.f46392g;
        int i7 = this.f46393h;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 4) {
            int i10 = i9 + 1;
            int n = i7 + ((i3 << 5) | (i3 >>> 27)) + mo67309n(i4, i5, i6) + this.f46394i[i9] + 1518500249;
            int i11 = (i4 >>> 2) | (i4 << 30);
            int i12 = i10 + 1;
            int n2 = i6 + ((n << 5) | (n >>> 27)) + mo67309n(i3, i11, i5) + this.f46394i[i10] + 1518500249;
            int i13 = (i3 >>> 2) | (i3 << 30);
            int i14 = i12 + 1;
            int n3 = i5 + ((n2 << 5) | (n2 >>> 27)) + mo67309n(n, i13, i11) + this.f46394i[i12] + 1518500249;
            i7 = (n >>> 2) | (n << 30);
            int i15 = i14 + 1;
            i4 = i11 + ((n3 << 5) | (n3 >>> 27)) + mo67309n(n2, i7, i13) + this.f46394i[i14] + 1518500249;
            i6 = (n2 >>> 2) | (n2 << 30);
            i3 = i13 + ((i4 << 5) | (i4 >>> 27)) + mo67309n(n3, i6, i7) + this.f46394i[i15] + 1518500249;
            i5 = (n3 >>> 2) | (n3 << 30);
            i8++;
            i9 = i15 + 1;
        }
        int i16 = 0;
        while (i16 < 4) {
            int i17 = i9 + 1;
            int p = i7 + ((i3 << 5) | (i3 >>> 27)) + mo67311p(i4, i5, i6) + this.f46394i[i9] + 1859775393;
            int i18 = (i4 >>> 2) | (i4 << 30);
            int i19 = i17 + 1;
            int p2 = i6 + ((p << 5) | (p >>> 27)) + mo67311p(i3, i18, i5) + this.f46394i[i17] + 1859775393;
            int i20 = (i3 >>> 2) | (i3 << 30);
            int i21 = i19 + 1;
            int p3 = i5 + ((p2 << 5) | (p2 >>> 27)) + mo67311p(p, i20, i18) + this.f46394i[i19] + 1859775393;
            i7 = (p >>> 2) | (p << 30);
            int i22 = i21 + 1;
            i4 = i18 + ((p3 << 5) | (p3 >>> 27)) + mo67311p(p2, i7, i20) + this.f46394i[i21] + 1859775393;
            i6 = (p2 >>> 2) | (p2 << 30);
            i3 = i20 + ((i4 << 5) | (i4 >>> 27)) + mo67311p(p3, i6, i7) + this.f46394i[i22] + 1859775393;
            i5 = (p3 >>> 2) | (p3 << 30);
            i16++;
            i9 = i22 + 1;
        }
        int i23 = 0;
        while (i23 < 4) {
            int i24 = i9 + 1;
            int o = i7 + (((((i3 << 5) | (i3 >>> 27)) + mo67310o(i4, i5, i6)) + this.f46394i[i9]) - 1894007588);
            int i25 = (i4 >>> 2) | (i4 << 30);
            int i26 = i24 + 1;
            int o2 = i6 + (((((o << 5) | (o >>> 27)) + mo67310o(i3, i25, i5)) + this.f46394i[i24]) - 1894007588);
            int i27 = (i3 >>> 2) | (i3 << 30);
            int i28 = i26 + 1;
            int o3 = i5 + (((((o2 << 5) | (o2 >>> 27)) + mo67310o(o, i27, i25)) + this.f46394i[i26]) - 1894007588);
            i7 = (o >>> 2) | (o << 30);
            int i29 = i28 + 1;
            i4 = i25 + (((((o3 << 5) | (o3 >>> 27)) + mo67310o(o2, i7, i27)) + this.f46394i[i28]) - 1894007588);
            i6 = (o2 >>> 2) | (o2 << 30);
            i3 = i27 + (((((i4 << 5) | (i4 >>> 27)) + mo67310o(o3, i6, i7)) + this.f46394i[i29]) - 1894007588);
            i5 = (o3 >>> 2) | (o3 << 30);
            i23++;
            i9 = i29 + 1;
        }
        int i30 = 0;
        while (i30 <= 3) {
            int i31 = i9 + 1;
            int p4 = i7 + (((((i3 << 5) | (i3 >>> 27)) + mo67311p(i4, i5, i6)) + this.f46394i[i9]) - 899497514);
            int i32 = (i4 >>> 2) | (i4 << 30);
            int i33 = i31 + 1;
            int p5 = i6 + (((((p4 << 5) | (p4 >>> 27)) + mo67311p(i3, i32, i5)) + this.f46394i[i31]) - 899497514);
            int i34 = (i3 >>> 2) | (i3 << 30);
            int i35 = i33 + 1;
            int p6 = i5 + (((((p5 << 5) | (p5 >>> 27)) + mo67311p(p4, i34, i32)) + this.f46394i[i33]) - 899497514);
            i7 = (p4 >>> 2) | (p4 << 30);
            int i36 = i35 + 1;
            i4 = i32 + (((((p6 << 5) | (p6 >>> 27)) + mo67311p(p5, i7, i34)) + this.f46394i[i35]) - 899497514);
            i6 = (p5 >>> 2) | (p5 << 30);
            i3 = i34 + (((((i4 << 5) | (i4 >>> 27)) + mo67311p(p6, i6, i7)) + this.f46394i[i36]) - 899497514);
            i5 = (p6 >>> 2) | (p6 << 30);
            i30++;
            i9 = i36 + 1;
        }
        this.f46389d += i3;
        this.f46390e += i4;
        this.f46391f += i5;
        this.f46392g += i6;
        this.f46393h += i7;
        this.f46395j = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            this.f46394i[i37] = 0;
        }
    }

    /* renamed from: k */
    public void mo50204k(long j) {
        if (this.f46395j > 14) {
            mo50203j();
        }
        int[] iArr = this.f46394i;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    /* renamed from: l */
    public void mo50205l(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f46394i;
        int i5 = this.f46395j;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f46395j = i6;
        if (i6 == 16) {
            mo50203j();
        }
    }

    /* renamed from: m */
    public final void mo67308m(zi5 zi5) {
        this.f46389d = zi5.f46389d;
        this.f46390e = zi5.f46390e;
        this.f46391f = zi5.f46391f;
        this.f46392g = zi5.f46392g;
        this.f46393h = zi5.f46393h;
        int[] iArr = zi5.f46394i;
        System.arraycopy(iArr, 0, this.f46394i, 0, iArr.length);
        this.f46395j = zi5.f46395j;
    }

    /* renamed from: n */
    public final int mo67309n(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: o */
    public final int mo67310o(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    /* renamed from: p */
    public final int mo67311p(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    public void reset() {
        super.reset();
        this.f46389d = 1732584193;
        this.f46390e = -271733879;
        this.f46391f = -1732584194;
        this.f46392g = 271733878;
        this.f46393h = -1009589776;
        this.f46395j = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f46394i;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }
}
