package p000;

import java.nio.charset.Charset;

/* renamed from: fm4 */
/* compiled from: ParsableBitArray */
public final class fm4 {

    /* renamed from: a */
    public byte[] f11939a;

    /* renamed from: b */
    public int f11940b;

    /* renamed from: c */
    public int f11941c;

    /* renamed from: d */
    public int f11942d;

    public fm4() {
        this.f11939a = w67.f19026f;
    }

    /* renamed from: a */
    public final void mo19997a() {
        boolean z;
        int i;
        int i2 = this.f11940b;
        if (i2 < 0 || (i2 >= (i = this.f11942d) && !(i2 == i && this.f11941c == 0))) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20987g(z);
    }

    /* renamed from: b */
    public int mo19998b() {
        return ((this.f11942d - this.f11940b) * 8) - this.f11941c;
    }

    /* renamed from: c */
    public void mo19999c() {
        if (this.f11941c != 0) {
            this.f11941c = 0;
            this.f11940b++;
            mo19997a();
        }
    }

    /* renamed from: d */
    public int mo20000d() {
        boolean z;
        if (this.f11941c == 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        return this.f11940b;
    }

    /* renamed from: e */
    public int mo20001e() {
        return (this.f11940b * 8) + this.f11941c;
    }

    /* renamed from: f */
    public void mo20002f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f11941c, i2);
        int i3 = this.f11941c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f11939a;
        int i5 = this.f11940b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = i2 - min;
        bArr[i5] = (byte) (b | ((i >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f11939a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f11939a;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | b2);
        mo20014r(i2);
        mo19997a();
    }

    /* renamed from: g */
    public boolean mo20003g() {
        boolean z;
        if ((this.f11939a[this.f11940b] & (128 >> this.f11941c)) != 0) {
            z = true;
        } else {
            z = false;
        }
        mo20013q();
        return z;
    }

    /* renamed from: h */
    public int mo20004h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f11941c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f11941c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f11941c = i4;
            byte[] bArr = this.f11939a;
            int i5 = this.f11940b;
            this.f11940b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f11939a;
        int i6 = this.f11940b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f11941c = 0;
            this.f11940b = i6 + 1;
        }
        mo19997a();
        return i7;
    }

    /* renamed from: i */
    public void mo20005i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f11939a;
            int i4 = this.f11940b;
            int i5 = i4 + 1;
            this.f11940b = i5;
            byte b = bArr2[i4];
            int i6 = this.f11941c;
            byte b2 = (byte) (b << i6);
            bArr[i] = b2;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i3] & (255 >> i7));
            bArr[i3] = b3;
            int i8 = this.f11941c;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.f11939a;
                int i9 = this.f11940b;
                this.f11940b = i9 + 1;
                bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                this.f11941c = i8 - 8;
            }
            int i10 = this.f11941c + i7;
            this.f11941c = i10;
            byte[] bArr4 = this.f11939a;
            int i11 = this.f11940b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.f11941c = 0;
                this.f11940b = i11 + 1;
            }
            mo19997a();
        }
    }

    /* renamed from: j */
    public long mo20006j(int i) {
        if (i <= 32) {
            return w67.m29331S0(mo20004h(i));
        }
        return w67.m29329R0(mo20004h(i - 32), mo20004h(32));
    }

    /* renamed from: k */
    public void mo20007k(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.f11941c == 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        System.arraycopy(this.f11939a, this.f11940b, bArr, i, i2);
        this.f11940b += i2;
        mo19997a();
    }

    /* renamed from: l */
    public String mo20008l(int i, Charset charset) {
        byte[] bArr = new byte[i];
        mo20007k(bArr, 0, i);
        return new String(bArr, charset);
    }

    /* renamed from: m */
    public void mo20009m(gm4 gm4) {
        mo20011o(gm4.mo20679d(), gm4.mo20681f());
        mo20012p(gm4.mo20680e() * 8);
    }

    /* renamed from: n */
    public void mo20010n(byte[] bArr) {
        mo20011o(bArr, bArr.length);
    }

    /* renamed from: o */
    public void mo20011o(byte[] bArr, int i) {
        this.f11939a = bArr;
        this.f11940b = 0;
        this.f11941c = 0;
        this.f11942d = i;
    }

    /* renamed from: p */
    public void mo20012p(int i) {
        int i2 = i / 8;
        this.f11940b = i2;
        this.f11941c = i - (i2 * 8);
        mo19997a();
    }

    /* renamed from: q */
    public void mo20013q() {
        int i = this.f11941c + 1;
        this.f11941c = i;
        if (i == 8) {
            this.f11941c = 0;
            this.f11940b++;
        }
        mo19997a();
    }

    /* renamed from: r */
    public void mo20014r(int i) {
        int i2 = i / 8;
        int i3 = this.f11940b + i2;
        this.f11940b = i3;
        int i4 = this.f11941c + (i - (i2 * 8));
        this.f11941c = i4;
        if (i4 > 7) {
            this.f11940b = i3 + 1;
            this.f11941c = i4 - 8;
        }
        mo19997a();
    }

    /* renamed from: s */
    public void mo20015s(int i) {
        boolean z;
        if (this.f11941c == 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        this.f11940b += i;
        mo19997a();
    }

    public fm4(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public fm4(byte[] bArr, int i) {
        this.f11939a = bArr;
        this.f11942d = i;
    }
}
