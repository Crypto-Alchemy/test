package p000;

/* renamed from: yi5 */
/* compiled from: SHA1 */
public final class yi5 extends lu3 {

    /* renamed from: c */
    public int[] f20236c = new int[5];

    /* renamed from: d */
    public long f20237d = 0;

    /* renamed from: e */
    public byte[] f20238e = new byte[20];

    /* renamed from: f */
    public boolean f20239f = false;

    /* renamed from: g */
    public int[] f20240g = {1518500249, 1859775393, -1894007588, -899497514};

    /* renamed from: h */
    public int[] f20241h = new int[16];

    /* renamed from: i */
    public int f20242i;

    /* renamed from: j */
    public int[] f20243j = new int[5];

    public yi5() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f20238e;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo22979b(byte b) {
        int i = this.f20242i;
        int i2 = (i & 3) * 8;
        this.f20237d += 8;
        int[] iArr = this.f20241h;
        int i3 = i >> 2;
        iArr[i3] = iArr[i3] & (~(255 << i2));
        int i4 = i >> 2;
        iArr[i4] = ((b & 255) << i2) | iArr[i4];
        int i5 = i + 1;
        this.f20242i = i5;
        if (i5 == 64) {
            mo28101p();
            this.f20242i = 0;
        }
    }

    /* renamed from: e */
    public final void mo28090e(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = iArr[i5];
        int i8 = iArr[i2];
        int i9 = iArr[i3];
        int i10 = iArr[i4];
        iArr[i5] = i7 + (((i9 ^ i10) & i8) ^ i10) + mo28097l(i6) + 1518500249 + mo28100o(iArr[i], 5);
        iArr[i2] = mo28100o(iArr[i2], 30);
    }

    /* renamed from: f */
    public final void mo28091f(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = iArr[i5];
        int i8 = iArr[i2];
        int i9 = iArr[i3];
        int i10 = iArr[i4];
        iArr[i5] = i7 + (((i9 ^ i10) & i8) ^ i10) + mo28096k(i6) + 1518500249 + mo28100o(iArr[i], 5);
        iArr[i2] = mo28100o(iArr[i2], 30);
    }

    /* renamed from: g */
    public final void mo28092g(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        iArr[i5] = iArr[i5] + ((iArr[i3] ^ iArr[i2]) ^ iArr[i4]) + mo28096k(i6) + 1859775393 + mo28100o(iArr[i], 5);
        iArr[i2] = mo28100o(iArr[i2], 30);
    }

    /* renamed from: h */
    public final void mo28093h(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = iArr[i5];
        int i8 = iArr[i2];
        int i9 = iArr[i3];
        int i10 = i9 & i8;
        iArr[i5] = i7 + (((i10 | (iArr[i4] & (i8 | i9))) + mo28096k(i6)) - 1894007588) + mo28100o(iArr[i], 5);
        iArr[i2] = mo28100o(iArr[i2], 30);
    }

    /* renamed from: i */
    public final void mo28094i(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        iArr[i5] = iArr[i5] + ((((iArr[i3] ^ iArr[i2]) ^ iArr[i4]) + mo28096k(i6)) - 899497514) + mo28100o(iArr[i], 5);
        iArr[i2] = mo28100o(iArr[i2], 30);
    }

    /* renamed from: j */
    public void mo28095j() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f20238e;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public final int mo28096k(int i) {
        int i2 = i & 15;
        int[] iArr = this.f20241h;
        int i3 = iArr[(i + 13) & 15];
        int i4 = iArr[(i + 8) & 15];
        int o = mo28100o((iArr[(i + 2) & 15] ^ (i3 ^ i4)) ^ iArr[i2], 1) & -1;
        this.f20241h[i2] = o;
        return o;
    }

    /* renamed from: l */
    public final int mo28097l(int i) {
        int[] iArr = this.f20241h;
        iArr[i] = (mo28100o(iArr[i], 24) & -16711936) | (mo28100o(this.f20241h[i], 8) & 16711935);
        return this.f20241h[i];
    }

    /* renamed from: m */
    public void mo28098m() {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[8];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        long[] jArr = new long[8];
        for (int i = 0; i < 8; i++) {
            int i2 = (7 - i) * 8;
            iArr[i] = i2;
            if (i2 > 31) {
                iArr2[i] = ((int) this.f20237d) >>> 31;
            } else {
                iArr2[i] = ((int) this.f20237d) >>> i2;
            }
            int i3 = iArr2[i] & 255;
            iArr3[i] = i3;
            long j = this.f20237d;
            jArr[i] = j >>> i2;
            bArr[i] = (byte) i3;
            bArr2[i] = (byte) ((int) ((j >>> i2) & 255));
        }
        mo22979b(Byte.MIN_VALUE);
        while (this.f20242i != 56) {
            mo22979b((byte) 0);
        }
        mo22980c(bArr2);
        for (int i4 = 0; i4 < 20; i4++) {
            this.f20238e[i4] = (byte) ((this.f20236c[i4 >> 2] >> ((3 - (i4 & 3)) * 8)) & 255);
        }
        this.f20239f = true;
    }

    /* renamed from: n */
    public void mo28099n() {
        int[] iArr = this.f20236c;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
        iArr[4] = -1009589776;
        this.f20237d = 0;
        this.f20238e = new byte[20];
        this.f20239f = false;
        this.f20242i = 0;
    }

    /* renamed from: o */
    public final int mo28100o(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: p */
    public void mo28101p() {
        int[] iArr = this.f20243j;
        int[] iArr2 = this.f20236c;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        iArr[2] = iArr2[2];
        iArr[3] = iArr2[3];
        iArr[4] = iArr2[4];
        mo28090e(iArr, 0, 1, 2, 3, 4, 0);
        mo28090e(this.f20243j, 4, 0, 1, 2, 3, 1);
        mo28090e(this.f20243j, 3, 4, 0, 1, 2, 2);
        mo28090e(this.f20243j, 2, 3, 4, 0, 1, 3);
        mo28090e(this.f20243j, 1, 2, 3, 4, 0, 4);
        mo28090e(this.f20243j, 0, 1, 2, 3, 4, 5);
        mo28090e(this.f20243j, 4, 0, 1, 2, 3, 6);
        mo28090e(this.f20243j, 3, 4, 0, 1, 2, 7);
        mo28090e(this.f20243j, 2, 3, 4, 0, 1, 8);
        mo28090e(this.f20243j, 1, 2, 3, 4, 0, 9);
        mo28090e(this.f20243j, 0, 1, 2, 3, 4, 10);
        mo28090e(this.f20243j, 4, 0, 1, 2, 3, 11);
        mo28090e(this.f20243j, 3, 4, 0, 1, 2, 12);
        mo28090e(this.f20243j, 2, 3, 4, 0, 1, 13);
        mo28090e(this.f20243j, 1, 2, 3, 4, 0, 14);
        mo28090e(this.f20243j, 0, 1, 2, 3, 4, 15);
        mo28091f(this.f20243j, 4, 0, 1, 2, 3, 16);
        mo28091f(this.f20243j, 3, 4, 0, 1, 2, 17);
        mo28091f(this.f20243j, 2, 3, 4, 0, 1, 18);
        mo28091f(this.f20243j, 1, 2, 3, 4, 0, 19);
        mo28092g(this.f20243j, 0, 1, 2, 3, 4, 20);
        mo28092g(this.f20243j, 4, 0, 1, 2, 3, 21);
        mo28092g(this.f20243j, 3, 4, 0, 1, 2, 22);
        mo28092g(this.f20243j, 2, 3, 4, 0, 1, 23);
        mo28092g(this.f20243j, 1, 2, 3, 4, 0, 24);
        mo28092g(this.f20243j, 0, 1, 2, 3, 4, 25);
        mo28092g(this.f20243j, 4, 0, 1, 2, 3, 26);
        mo28092g(this.f20243j, 3, 4, 0, 1, 2, 27);
        mo28092g(this.f20243j, 2, 3, 4, 0, 1, 28);
        mo28092g(this.f20243j, 1, 2, 3, 4, 0, 29);
        mo28092g(this.f20243j, 0, 1, 2, 3, 4, 30);
        mo28092g(this.f20243j, 4, 0, 1, 2, 3, 31);
        mo28092g(this.f20243j, 3, 4, 0, 1, 2, 32);
        mo28092g(this.f20243j, 2, 3, 4, 0, 1, 33);
        mo28092g(this.f20243j, 1, 2, 3, 4, 0, 34);
        mo28092g(this.f20243j, 0, 1, 2, 3, 4, 35);
        mo28092g(this.f20243j, 4, 0, 1, 2, 3, 36);
        mo28092g(this.f20243j, 3, 4, 0, 1, 2, 37);
        mo28092g(this.f20243j, 2, 3, 4, 0, 1, 38);
        mo28092g(this.f20243j, 1, 2, 3, 4, 0, 39);
        mo28093h(this.f20243j, 0, 1, 2, 3, 4, 40);
        mo28093h(this.f20243j, 4, 0, 1, 2, 3, 41);
        mo28093h(this.f20243j, 3, 4, 0, 1, 2, 42);
        mo28093h(this.f20243j, 2, 3, 4, 0, 1, 43);
        mo28093h(this.f20243j, 1, 2, 3, 4, 0, 44);
        mo28093h(this.f20243j, 0, 1, 2, 3, 4, 45);
        mo28093h(this.f20243j, 4, 0, 1, 2, 3, 46);
        mo28093h(this.f20243j, 3, 4, 0, 1, 2, 47);
        mo28093h(this.f20243j, 2, 3, 4, 0, 1, 48);
        mo28093h(this.f20243j, 1, 2, 3, 4, 0, 49);
        mo28093h(this.f20243j, 0, 1, 2, 3, 4, 50);
        mo28093h(this.f20243j, 4, 0, 1, 2, 3, 51);
        mo28093h(this.f20243j, 3, 4, 0, 1, 2, 52);
        mo28093h(this.f20243j, 2, 3, 4, 0, 1, 53);
        mo28093h(this.f20243j, 1, 2, 3, 4, 0, 54);
        mo28093h(this.f20243j, 0, 1, 2, 3, 4, 55);
        mo28093h(this.f20243j, 4, 0, 1, 2, 3, 56);
        mo28093h(this.f20243j, 3, 4, 0, 1, 2, 57);
        mo28093h(this.f20243j, 2, 3, 4, 0, 1, 58);
        mo28093h(this.f20243j, 1, 2, 3, 4, 0, 59);
        mo28094i(this.f20243j, 0, 1, 2, 3, 4, 60);
        mo28094i(this.f20243j, 4, 0, 1, 2, 3, 61);
        mo28094i(this.f20243j, 3, 4, 0, 1, 2, 62);
        mo28094i(this.f20243j, 2, 3, 4, 0, 1, 63);
        mo28094i(this.f20243j, 1, 2, 3, 4, 0, 64);
        mo28094i(this.f20243j, 0, 1, 2, 3, 4, 65);
        mo28094i(this.f20243j, 4, 0, 1, 2, 3, 66);
        mo28094i(this.f20243j, 3, 4, 0, 1, 2, 67);
        mo28094i(this.f20243j, 2, 3, 4, 0, 1, 68);
        mo28094i(this.f20243j, 1, 2, 3, 4, 0, 69);
        mo28094i(this.f20243j, 0, 1, 2, 3, 4, 70);
        mo28094i(this.f20243j, 4, 0, 1, 2, 3, 71);
        mo28094i(this.f20243j, 3, 4, 0, 1, 2, 72);
        mo28094i(this.f20243j, 2, 3, 4, 0, 1, 73);
        mo28094i(this.f20243j, 1, 2, 3, 4, 0, 74);
        mo28094i(this.f20243j, 0, 1, 2, 3, 4, 75);
        mo28094i(this.f20243j, 4, 0, 1, 2, 3, 76);
        mo28094i(this.f20243j, 3, 4, 0, 1, 2, 77);
        mo28094i(this.f20243j, 2, 3, 4, 0, 1, 78);
        mo28094i(this.f20243j, 1, 2, 3, 4, 0, 79);
        int[] iArr3 = this.f20236c;
        int i = iArr3[0];
        int[] iArr4 = this.f20243j;
        iArr3[0] = i + iArr4[0];
        iArr3[1] = iArr3[1] + iArr4[1];
        iArr3[2] = iArr3[2] + iArr4[2];
        iArr3[3] = iArr3[3] + iArr4[3];
        iArr3[4] = iArr3[4] + iArr4[4];
    }
}
