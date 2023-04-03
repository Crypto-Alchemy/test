package p000;

/* renamed from: aj5 */
public class aj5 extends xe2 {

    /* renamed from: n */
    public static final int[] f36466n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d */
    public int f36467d;

    /* renamed from: e */
    public int f36468e;

    /* renamed from: f */
    public int f36469f;

    /* renamed from: g */
    public int f36470g;

    /* renamed from: h */
    public int f36471h;

    /* renamed from: i */
    public int f36472i;

    /* renamed from: j */
    public int f36473j;

    /* renamed from: k */
    public int f36474k;

    /* renamed from: l */
    public int[] f36475l = new int[64];

    /* renamed from: m */
    public int f36476m;

    public aj5() {
        reset();
    }

    public aj5(aj5 aj5) {
        super(aj5);
        mo50213s(aj5);
    }

    /* renamed from: a */
    public int mo50198a(byte[] bArr, int i) {
        mo66860i();
        ek4.m57383c(this.f36467d, bArr, i);
        ek4.m57383c(this.f36468e, bArr, i + 4);
        ek4.m57383c(this.f36469f, bArr, i + 8);
        ek4.m57383c(this.f36470g, bArr, i + 12);
        ek4.m57383c(this.f36471h, bArr, i + 16);
        ek4.m57383c(this.f36472i, bArr, i + 20);
        ek4.m57383c(this.f36473j, bArr, i + 24);
        reset();
        return 28;
    }

    /* renamed from: c */
    public void mo50199c(us3 us3) {
        mo50213s((aj5) us3);
    }

    public us3 copy() {
        return new aj5(this);
    }

    /* renamed from: d */
    public String mo50201d() {
        return "SHA-224";
    }

    /* renamed from: e */
    public int mo50202e() {
        return 28;
    }

    /* renamed from: j */
    public void mo50203j() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f36475l;
            int r = mo50211r(iArr[i - 2]);
            int[] iArr2 = this.f36475l;
            iArr[i] = r + iArr2[i - 7] + mo50210q(iArr2[i - 15]) + this.f36475l[i - 16];
        }
        int i2 = this.f36467d;
        int i3 = this.f36468e;
        int i4 = this.f36469f;
        int i5 = this.f36470g;
        int i6 = this.f36471h;
        int i7 = this.f36472i;
        int i8 = this.f36473j;
        int i9 = this.f36474k;
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            int p = mo50209p(i6) + mo50206m(i6, i7, i8);
            int[] iArr3 = f36466n;
            int i12 = i9 + p + iArr3[i10] + this.f36475l[i10];
            int i13 = i5 + i12;
            int o = i12 + mo50208o(i2) + mo50207n(i2, i3, i4);
            int i14 = i10 + 1;
            int p2 = i8 + mo50209p(i13) + mo50206m(i13, i6, i7) + iArr3[i14] + this.f36475l[i14];
            int i15 = i4 + p2;
            int o2 = p2 + mo50208o(o) + mo50207n(o, i2, i3);
            int i16 = i14 + 1;
            int p3 = i7 + mo50209p(i15) + mo50206m(i15, i13, i6) + iArr3[i16] + this.f36475l[i16];
            int i17 = i3 + p3;
            int o3 = p3 + mo50208o(o2) + mo50207n(o2, o, i2);
            int i18 = i16 + 1;
            int p4 = i6 + mo50209p(i17) + mo50206m(i17, i15, i13) + iArr3[i18] + this.f36475l[i18];
            int i19 = i2 + p4;
            int o4 = p4 + mo50208o(o3) + mo50207n(o3, o2, o);
            int i20 = i18 + 1;
            int p5 = i13 + mo50209p(i19) + mo50206m(i19, i17, i15) + iArr3[i20] + this.f36475l[i20];
            i9 = o + p5;
            i5 = p5 + mo50208o(o4) + mo50207n(o4, o3, o2);
            int i21 = i20 + 1;
            int p6 = i15 + mo50209p(i9) + mo50206m(i9, i19, i17) + iArr3[i21] + this.f36475l[i21];
            i8 = o2 + p6;
            i4 = p6 + mo50208o(i5) + mo50207n(i5, o4, o3);
            int i22 = i21 + 1;
            int p7 = i17 + mo50209p(i8) + mo50206m(i8, i9, i19) + iArr3[i22] + this.f36475l[i22];
            i7 = o3 + p7;
            i3 = p7 + mo50208o(i4) + mo50207n(i4, i5, o4);
            int i23 = i22 + 1;
            int p8 = i19 + mo50209p(i7) + mo50206m(i7, i8, i9) + iArr3[i23] + this.f36475l[i23];
            i6 = o4 + p8;
            i2 = p8 + mo50208o(i3) + mo50207n(i3, i4, i5);
            i10 = i23 + 1;
        }
        this.f36467d += i2;
        this.f36468e += i3;
        this.f36469f += i4;
        this.f36470g += i5;
        this.f36471h += i6;
        this.f36472i += i7;
        this.f36473j += i8;
        this.f36474k += i9;
        this.f36476m = 0;
        for (int i24 = 0; i24 < 16; i24++) {
            this.f36475l[i24] = 0;
        }
    }

    /* renamed from: k */
    public void mo50204k(long j) {
        if (this.f36476m > 14) {
            mo50203j();
        }
        int[] iArr = this.f36475l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & -1);
    }

    /* renamed from: l */
    public void mo50205l(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f36475l;
        int i5 = this.f36476m;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f36476m = i6;
        if (i6 == 16) {
            mo50203j();
        }
    }

    /* renamed from: m */
    public final int mo50206m(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    /* renamed from: n */
    public final int mo50207n(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    /* renamed from: o */
    public final int mo50208o(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* renamed from: p */
    public final int mo50209p(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: q */
    public final int mo50210q(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    /* renamed from: r */
    public final int mo50211r(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    public void reset() {
        super.reset();
        this.f36467d = -1056596264;
        this.f36468e = 914150663;
        this.f36469f = 812702999;
        this.f36470g = -150054599;
        this.f36471h = -4191439;
        this.f36472i = 1750603025;
        this.f36473j = 1694076839;
        this.f36474k = -1090891868;
        this.f36476m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f36475l;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    public final void mo50213s(aj5 aj5) {
        super.mo66859h(aj5);
        this.f36467d = aj5.f36467d;
        this.f36468e = aj5.f36468e;
        this.f36469f = aj5.f36469f;
        this.f36470g = aj5.f36470g;
        this.f36471h = aj5.f36471h;
        this.f36472i = aj5.f36472i;
        this.f36473j = aj5.f36473j;
        this.f36474k = aj5.f36474k;
        int[] iArr = aj5.f36475l;
        System.arraycopy(iArr, 0, this.f36475l, 0, iArr.length);
        this.f36476m = aj5.f36476m;
    }
}
