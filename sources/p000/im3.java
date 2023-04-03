package p000;

/* renamed from: im3 */
public class im3 extends xe2 {

    /* renamed from: d */
    public int f38411d;

    /* renamed from: e */
    public int f38412e;

    /* renamed from: f */
    public int f38413f;

    /* renamed from: g */
    public int f38414g;

    /* renamed from: h */
    public int[] f38415h = new int[16];

    /* renamed from: i */
    public int f38416i;

    public im3() {
        reset();
    }

    public im3(im3 im3) {
        super(im3);
        mo52503q(im3);
    }

    /* renamed from: a */
    public int mo50198a(byte[] bArr, int i) {
        mo66860i();
        mo52505s(this.f38411d, bArr, i);
        mo52505s(this.f38412e, bArr, i + 4);
        mo52505s(this.f38413f, bArr, i + 8);
        mo52505s(this.f38414g, bArr, i + 12);
        reset();
        return 16;
    }

    /* renamed from: c */
    public void mo50199c(us3 us3) {
        mo52503q((im3) us3);
    }

    public us3 copy() {
        return new im3(this);
    }

    /* renamed from: d */
    public String mo50201d() {
        return "MD5";
    }

    /* renamed from: e */
    public int mo50202e() {
        return 16;
    }

    /* renamed from: j */
    public void mo50203j() {
        int i = this.f38411d;
        int i2 = this.f38412e;
        int i3 = this.f38413f;
        int i4 = this.f38414g;
        int r = mo52504r(((i + mo52499m(i2, i3, i4)) + this.f38415h[0]) - 680876936, 7) + i2;
        int r2 = mo52504r(((i4 + mo52499m(r, i2, i3)) + this.f38415h[1]) - 389564586, 12) + r;
        int r3 = mo52504r(i3 + mo52499m(r2, r, i2) + this.f38415h[2] + 606105819, 17) + r2;
        int r4 = mo52504r(((i2 + mo52499m(r3, r2, r)) + this.f38415h[3]) - 1044525330, 22) + r3;
        int r5 = mo52504r(((r + mo52499m(r4, r3, r2)) + this.f38415h[4]) - 176418897, 7) + r4;
        int r6 = mo52504r(r2 + mo52499m(r5, r4, r3) + this.f38415h[5] + 1200080426, 12) + r5;
        int r7 = mo52504r(((r3 + mo52499m(r6, r5, r4)) + this.f38415h[6]) - 1473231341, 17) + r6;
        int r8 = mo52504r(((r4 + mo52499m(r7, r6, r5)) + this.f38415h[7]) - 45705983, 22) + r7;
        int r9 = mo52504r(r5 + mo52499m(r8, r7, r6) + this.f38415h[8] + 1770035416, 7) + r8;
        int r10 = mo52504r(((r6 + mo52499m(r9, r8, r7)) + this.f38415h[9]) - 1958414417, 12) + r9;
        int r11 = mo52504r(((r7 + mo52499m(r10, r9, r8)) + this.f38415h[10]) - 42063, 17) + r10;
        int r12 = mo52504r(((r8 + mo52499m(r11, r10, r9)) + this.f38415h[11]) - 1990404162, 22) + r11;
        int r13 = mo52504r(r9 + mo52499m(r12, r11, r10) + this.f38415h[12] + 1804603682, 7) + r12;
        int r14 = mo52504r(((r10 + mo52499m(r13, r12, r11)) + this.f38415h[13]) - 40341101, 12) + r13;
        int r15 = mo52504r(((r11 + mo52499m(r14, r13, r12)) + this.f38415h[14]) - 1502002290, 17) + r14;
        int r16 = mo52504r(r12 + mo52499m(r15, r14, r13) + this.f38415h[15] + 1236535329, 22) + r15;
        int r17 = mo52504r(((r13 + mo52500n(r16, r15, r14)) + this.f38415h[1]) - 165796510, 5) + r16;
        int r18 = mo52504r(((r14 + mo52500n(r17, r16, r15)) + this.f38415h[6]) - 1069501632, 9) + r17;
        int r19 = mo52504r(r15 + mo52500n(r18, r17, r16) + this.f38415h[11] + 643717713, 14) + r18;
        int r20 = mo52504r(((r16 + mo52500n(r19, r18, r17)) + this.f38415h[0]) - 373897302, 20) + r19;
        int r21 = mo52504r(((r17 + mo52500n(r20, r19, r18)) + this.f38415h[5]) - 701558691, 5) + r20;
        int r22 = mo52504r(r18 + mo52500n(r21, r20, r19) + this.f38415h[10] + 38016083, 9) + r21;
        int r23 = mo52504r(((r19 + mo52500n(r22, r21, r20)) + this.f38415h[15]) - 660478335, 14) + r22;
        int r24 = mo52504r(((r20 + mo52500n(r23, r22, r21)) + this.f38415h[4]) - 405537848, 20) + r23;
        int r25 = mo52504r(r21 + mo52500n(r24, r23, r22) + this.f38415h[9] + 568446438, 5) + r24;
        int r26 = mo52504r(((r22 + mo52500n(r25, r24, r23)) + this.f38415h[14]) - 1019803690, 9) + r25;
        int r27 = mo52504r(((r23 + mo52500n(r26, r25, r24)) + this.f38415h[3]) - 187363961, 14) + r26;
        int r28 = mo52504r(r24 + mo52500n(r27, r26, r25) + this.f38415h[8] + 1163531501, 20) + r27;
        int r29 = mo52504r(((r25 + mo52500n(r28, r27, r26)) + this.f38415h[13]) - 1444681467, 5) + r28;
        int r30 = mo52504r(((r26 + mo52500n(r29, r28, r27)) + this.f38415h[2]) - 51403784, 9) + r29;
        int r31 = mo52504r(r27 + mo52500n(r30, r29, r28) + this.f38415h[7] + 1735328473, 14) + r30;
        int r32 = mo52504r(((r28 + mo52500n(r31, r30, r29)) + this.f38415h[12]) - 1926607734, 20) + r31;
        int r33 = mo52504r(((r29 + mo52501o(r32, r31, r30)) + this.f38415h[5]) - 378558, 4) + r32;
        int r34 = mo52504r(((r30 + mo52501o(r33, r32, r31)) + this.f38415h[8]) - 2022574463, 11) + r33;
        int r35 = mo52504r(r31 + mo52501o(r34, r33, r32) + this.f38415h[11] + 1839030562, 16) + r34;
        int r36 = mo52504r(((r32 + mo52501o(r35, r34, r33)) + this.f38415h[14]) - 35309556, 23) + r35;
        int r37 = mo52504r(((r33 + mo52501o(r36, r35, r34)) + this.f38415h[1]) - 1530992060, 4) + r36;
        int r38 = mo52504r(r34 + mo52501o(r37, r36, r35) + this.f38415h[4] + 1272893353, 11) + r37;
        int r39 = mo52504r(((r35 + mo52501o(r38, r37, r36)) + this.f38415h[7]) - 155497632, 16) + r38;
        int r40 = mo52504r(((r36 + mo52501o(r39, r38, r37)) + this.f38415h[10]) - 1094730640, 23) + r39;
        int r41 = mo52504r(r37 + mo52501o(r40, r39, r38) + this.f38415h[13] + 681279174, 4) + r40;
        int r42 = mo52504r(((r38 + mo52501o(r41, r40, r39)) + this.f38415h[0]) - 358537222, 11) + r41;
        int r43 = mo52504r(((r39 + mo52501o(r42, r41, r40)) + this.f38415h[3]) - 722521979, 16) + r42;
        int r44 = mo52504r(r40 + mo52501o(r43, r42, r41) + this.f38415h[6] + 76029189, 23) + r43;
        int r45 = mo52504r(((r41 + mo52501o(r44, r43, r42)) + this.f38415h[9]) - 640364487, 4) + r44;
        int r46 = mo52504r(((r42 + mo52501o(r45, r44, r43)) + this.f38415h[12]) - 421815835, 11) + r45;
        int r47 = mo52504r(r43 + mo52501o(r46, r45, r44) + this.f38415h[15] + 530742520, 16) + r46;
        int r48 = mo52504r(((r44 + mo52501o(r47, r46, r45)) + this.f38415h[2]) - 995338651, 23) + r47;
        int r49 = mo52504r(((r45 + mo52502p(r48, r47, r46)) + this.f38415h[0]) - 198630844, 6) + r48;
        int r50 = mo52504r(r46 + mo52502p(r49, r48, r47) + this.f38415h[7] + 1126891415, 10) + r49;
        int r51 = mo52504r(((r47 + mo52502p(r50, r49, r48)) + this.f38415h[14]) - 1416354905, 15) + r50;
        int r52 = mo52504r(((r48 + mo52502p(r51, r50, r49)) + this.f38415h[5]) - 57434055, 21) + r51;
        int r53 = mo52504r(r49 + mo52502p(r52, r51, r50) + this.f38415h[12] + 1700485571, 6) + r52;
        int r54 = mo52504r(((r50 + mo52502p(r53, r52, r51)) + this.f38415h[3]) - 1894986606, 10) + r53;
        int r55 = mo52504r(((r51 + mo52502p(r54, r53, r52)) + this.f38415h[10]) - 1051523, 15) + r54;
        int r56 = mo52504r(((r52 + mo52502p(r55, r54, r53)) + this.f38415h[1]) - 2054922799, 21) + r55;
        int r57 = mo52504r(r53 + mo52502p(r56, r55, r54) + this.f38415h[8] + 1873313359, 6) + r56;
        int r58 = mo52504r(((r54 + mo52502p(r57, r56, r55)) + this.f38415h[15]) - 30611744, 10) + r57;
        int r59 = mo52504r(((r55 + mo52502p(r58, r57, r56)) + this.f38415h[6]) - 1560198380, 15) + r58;
        int r60 = mo52504r(r56 + mo52502p(r59, r58, r57) + this.f38415h[13] + 1309151649, 21) + r59;
        int r61 = mo52504r(((r57 + mo52502p(r60, r59, r58)) + this.f38415h[4]) - 145523070, 6) + r60;
        int r62 = mo52504r(((r58 + mo52502p(r61, r60, r59)) + this.f38415h[11]) - 1120210379, 10) + r61;
        int r63 = mo52504r(r59 + mo52502p(r62, r61, r60) + this.f38415h[2] + 718787259, 15) + r62;
        this.f38411d += r61;
        this.f38412e += mo52504r(((r60 + mo52502p(r63, r62, r61)) + this.f38415h[9]) - 343485551, 21) + r63;
        this.f38413f += r63;
        this.f38414g += r62;
        this.f38416i = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f38415h;
            if (i5 != iArr.length) {
                iArr[i5] = 0;
                i5++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo50204k(long j) {
        if (this.f38416i > 14) {
            mo50203j();
        }
        int[] iArr = this.f38415h;
        iArr[14] = (int) (-1 & j);
        iArr[15] = (int) (j >>> 32);
    }

    /* renamed from: l */
    public void mo50205l(byte[] bArr, int i) {
        int[] iArr = this.f38415h;
        int i2 = this.f38416i;
        int i3 = i2 + 1;
        this.f38416i = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            mo50203j();
        }
    }

    /* renamed from: m */
    public final int mo52499m(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: n */
    public final int mo52500n(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    /* renamed from: o */
    public final int mo52501o(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: p */
    public final int mo52502p(int i, int i2, int i3) {
        return (i | (~i3)) ^ i2;
    }

    /* renamed from: q */
    public final void mo52503q(im3 im3) {
        super.mo66859h(im3);
        this.f38411d = im3.f38411d;
        this.f38412e = im3.f38412e;
        this.f38413f = im3.f38413f;
        this.f38414g = im3.f38414g;
        int[] iArr = im3.f38415h;
        System.arraycopy(iArr, 0, this.f38415h, 0, iArr.length);
        this.f38416i = im3.f38416i;
    }

    /* renamed from: r */
    public final int mo52504r(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public void reset() {
        super.reset();
        this.f38411d = 1732584193;
        this.f38412e = -271733879;
        this.f38413f = -1732584194;
        this.f38414g = 271733878;
        this.f38416i = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f38415h;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    public final void mo52505s(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }
}
