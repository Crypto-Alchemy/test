package p000;

/* renamed from: bj5 */
public class bj5 extends xe2 {

    /* renamed from: n */
    public static final int[] f36824n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d */
    public int f36825d;

    /* renamed from: e */
    public int f36826e;

    /* renamed from: f */
    public int f36827f;

    /* renamed from: g */
    public int f36828g;

    /* renamed from: h */
    public int f36829h;

    /* renamed from: i */
    public int f36830i;

    /* renamed from: j */
    public int f36831j;

    /* renamed from: k */
    public int f36832k;

    /* renamed from: l */
    public int[] f36833l = new int[64];

    /* renamed from: m */
    public int f36834m;

    public bj5() {
        reset();
    }

    public bj5(bj5 bj5) {
        super(bj5);
        mo50601s(bj5);
    }

    /* renamed from: m */
    public static int m55981m(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    /* renamed from: n */
    public static int m55982n(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    /* renamed from: o */
    public static int m55983o(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* renamed from: p */
    public static int m55984p(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: q */
    public static int m55985q(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    /* renamed from: r */
    public static int m55986r(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    /* renamed from: a */
    public int mo50198a(byte[] bArr, int i) {
        mo66860i();
        ek4.m57383c(this.f36825d, bArr, i);
        ek4.m57383c(this.f36826e, bArr, i + 4);
        ek4.m57383c(this.f36827f, bArr, i + 8);
        ek4.m57383c(this.f36828g, bArr, i + 12);
        ek4.m57383c(this.f36829h, bArr, i + 16);
        ek4.m57383c(this.f36830i, bArr, i + 20);
        ek4.m57383c(this.f36831j, bArr, i + 24);
        ek4.m57383c(this.f36832k, bArr, i + 28);
        reset();
        return 32;
    }

    /* renamed from: c */
    public void mo50199c(us3 us3) {
        mo50601s((bj5) us3);
    }

    public us3 copy() {
        return new bj5(this);
    }

    /* renamed from: d */
    public String mo50201d() {
        return "SHA-256";
    }

    /* renamed from: e */
    public int mo50202e() {
        return 32;
    }

    /* renamed from: j */
    public void mo50203j() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f36833l;
            int r = m55986r(iArr[i - 2]);
            int[] iArr2 = this.f36833l;
            iArr[i] = r + iArr2[i - 7] + m55985q(iArr2[i - 15]) + this.f36833l[i - 16];
        }
        int i2 = this.f36825d;
        int i3 = this.f36826e;
        int i4 = this.f36827f;
        int i5 = this.f36828g;
        int i6 = this.f36829h;
        int i7 = this.f36830i;
        int i8 = this.f36831j;
        int i9 = this.f36832k;
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            int p = m55984p(i6) + m55981m(i6, i7, i8);
            int[] iArr3 = f36824n;
            int i12 = i9 + p + iArr3[i10] + this.f36833l[i10];
            int i13 = i5 + i12;
            int o = i12 + m55983o(i2) + m55982n(i2, i3, i4);
            int i14 = i10 + 1;
            int p2 = i8 + m55984p(i13) + m55981m(i13, i6, i7) + iArr3[i14] + this.f36833l[i14];
            int i15 = i4 + p2;
            int o2 = p2 + m55983o(o) + m55982n(o, i2, i3);
            int i16 = i14 + 1;
            int p3 = i7 + m55984p(i15) + m55981m(i15, i13, i6) + iArr3[i16] + this.f36833l[i16];
            int i17 = i3 + p3;
            int o3 = p3 + m55983o(o2) + m55982n(o2, o, i2);
            int i18 = i16 + 1;
            int p4 = i6 + m55984p(i17) + m55981m(i17, i15, i13) + iArr3[i18] + this.f36833l[i18];
            int i19 = i2 + p4;
            int o4 = p4 + m55983o(o3) + m55982n(o3, o2, o);
            int i20 = i18 + 1;
            int p5 = i13 + m55984p(i19) + m55981m(i19, i17, i15) + iArr3[i20] + this.f36833l[i20];
            i9 = o + p5;
            i5 = p5 + m55983o(o4) + m55982n(o4, o3, o2);
            int i21 = i20 + 1;
            int p6 = i15 + m55984p(i9) + m55981m(i9, i19, i17) + iArr3[i21] + this.f36833l[i21];
            i8 = o2 + p6;
            i4 = p6 + m55983o(i5) + m55982n(i5, o4, o3);
            int i22 = i21 + 1;
            int p7 = i17 + m55984p(i8) + m55981m(i8, i9, i19) + iArr3[i22] + this.f36833l[i22];
            i7 = o3 + p7;
            i3 = p7 + m55983o(i4) + m55982n(i4, i5, o4);
            int i23 = i22 + 1;
            int p8 = i19 + m55984p(i7) + m55981m(i7, i8, i9) + iArr3[i23] + this.f36833l[i23];
            i6 = o4 + p8;
            i2 = p8 + m55983o(i3) + m55982n(i3, i4, i5);
            i10 = i23 + 1;
        }
        this.f36825d += i2;
        this.f36826e += i3;
        this.f36827f += i4;
        this.f36828g += i5;
        this.f36829h += i6;
        this.f36830i += i7;
        this.f36831j += i8;
        this.f36832k += i9;
        this.f36834m = 0;
        for (int i24 = 0; i24 < 16; i24++) {
            this.f36833l[i24] = 0;
        }
    }

    /* renamed from: k */
    public void mo50204k(long j) {
        if (this.f36834m > 14) {
            mo50203j();
        }
        int[] iArr = this.f36833l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & -1);
    }

    /* renamed from: l */
    public void mo50205l(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f36833l;
        int i5 = this.f36834m;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f36834m = i6;
        if (i6 == 16) {
            mo50203j();
        }
    }

    public void reset() {
        super.reset();
        this.f36825d = 1779033703;
        this.f36826e = -1150833019;
        this.f36827f = 1013904242;
        this.f36828g = -1521486534;
        this.f36829h = 1359893119;
        this.f36830i = -1694144372;
        this.f36831j = 528734635;
        this.f36832k = 1541459225;
        this.f36834m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f36833l;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    public final void mo50601s(bj5 bj5) {
        super.mo66859h(bj5);
        this.f36825d = bj5.f36825d;
        this.f36826e = bj5.f36826e;
        this.f36827f = bj5.f36827f;
        this.f36828g = bj5.f36828g;
        this.f36829h = bj5.f36829h;
        this.f36830i = bj5.f36830i;
        this.f36831j = bj5.f36831j;
        this.f36832k = bj5.f36832k;
        int[] iArr = bj5.f36833l;
        System.arraycopy(iArr, 0, this.f36833l, 0, iArr.length);
        this.f36834m = bj5.f36834m;
    }
}
