package p000;

/* renamed from: hm4 */
/* compiled from: ParsableNalUnitBitArray */
public final class hm4 {

    /* renamed from: a */
    public byte[] f12961a;

    /* renamed from: b */
    public int f12962b;

    /* renamed from: c */
    public int f12963c;

    /* renamed from: d */
    public int f12964d;

    public hm4(byte[] bArr, int i, int i2) {
        mo21296i(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo21288a() {
        boolean z;
        int i;
        int i2 = this.f12963c;
        if (i2 < 0 || (i2 >= (i = this.f12962b) && !(i2 == i && this.f12964d == 0))) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20987g(z);
    }

    /* renamed from: b */
    public boolean mo21289b(int i) {
        int i2 = this.f12963c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f12964d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f12962b) {
                int i6 = this.f12962b;
            } else if (mo21297j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f12962b;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo21290c() {
        boolean z;
        int i = this.f12963c;
        int i2 = this.f12964d;
        int i3 = 0;
        while (this.f12963c < this.f12962b && !mo21291d()) {
            i3++;
        }
        if (this.f12963c == this.f12962b) {
            z = true;
        } else {
            z = false;
        }
        this.f12963c = i;
        this.f12964d = i2;
        if (z || !mo21289b((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo21291d() {
        boolean z;
        if ((this.f12961a[this.f12963c] & (128 >> this.f12964d)) != 0) {
            z = true;
        } else {
            z = false;
        }
        mo21298k();
        return z;
    }

    /* renamed from: e */
    public int mo21292e(int i) {
        int i2;
        int i3;
        this.f12964d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f12964d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f12964d = i5;
            byte[] bArr = this.f12961a;
            int i6 = this.f12963c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!mo21297j(i6 + 1)) {
                i3 = 1;
            }
            this.f12963c = i6 + i3;
        }
        byte[] bArr2 = this.f12961a;
        int i7 = this.f12963c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f12964d = 0;
            if (!mo21297j(i7 + 1)) {
                i3 = 1;
            }
            this.f12963c = i7 + i3;
        }
        mo21288a();
        return i8;
    }

    /* renamed from: f */
    public final int mo21293f() {
        int i = 0;
        int i2 = 0;
        while (!mo21291d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo21292e(i2);
        }
        return i3 + i;
    }

    /* renamed from: g */
    public int mo21294g() {
        int i;
        int f = mo21293f();
        if (f % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return i * ((f + 1) / 2);
    }

    /* renamed from: h */
    public int mo21295h() {
        return mo21293f();
    }

    /* renamed from: i */
    public void mo21296i(byte[] bArr, int i, int i2) {
        this.f12961a = bArr;
        this.f12963c = i;
        this.f12962b = i2;
        this.f12964d = 0;
        mo21288a();
    }

    /* renamed from: j */
    public final boolean mo21297j(int i) {
        if (2 <= i && i < this.f12962b) {
            byte[] bArr = this.f12961a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: k */
    public void mo21298k() {
        int i = 1;
        int i2 = this.f12964d + 1;
        this.f12964d = i2;
        if (i2 == 8) {
            this.f12964d = 0;
            int i3 = this.f12963c;
            if (mo21297j(i3 + 1)) {
                i = 2;
            }
            this.f12963c = i3 + i;
        }
        mo21288a();
    }

    /* renamed from: l */
    public void mo21299l(int i) {
        int i2 = this.f12963c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f12963c = i4;
        int i5 = this.f12964d + (i - (i3 * 8));
        this.f12964d = i5;
        if (i5 > 7) {
            this.f12963c = i4 + 1;
            this.f12964d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f12963c) {
                mo21288a();
                return;
            } else if (mo21297j(i2)) {
                this.f12963c++;
                i2 += 2;
            }
        }
    }
}
