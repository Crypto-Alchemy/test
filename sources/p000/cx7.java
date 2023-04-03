package p000;

/* renamed from: cx7 */
/* compiled from: uisAES */
public class cx7 {

    /* renamed from: a */
    public long f10403a;

    /* renamed from: b */
    public boolean f10404b;

    /* renamed from: c */
    public C1599b f10405c;

    /* renamed from: d */
    public boolean f10406d;

    public cx7(boolean z) {
        this.f10405c = new C1599b();
        this.f10404b = z;
        this.f10403a = 0;
        mo18378j();
    }

    /* renamed from: a */
    public byte[] mo18369a(byte[] bArr) {
        int i;
        int length = bArr.length;
        if (!this.f10406d) {
            this.f10403a = x70.f19446v;
            return null;
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        int i2 = length / 16;
        byte[] bArr4 = new byte[length];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = 0;
            while (i6 < 16) {
                bArr2[i6] = bArr[i3];
                i6++;
                i3++;
            }
            this.f10405c.mo11318e(bArr2, bArr3, 8);
            int i7 = 0;
            while (i7 < 16) {
                bArr4[i4] = bArr3[i7];
                i7++;
                i4++;
            }
        }
        C2540id3.m19562d(bArr4);
        int i8 = length - 1;
        if (bArr4[i8] == 1) {
            byte[] bArr5 = new byte[20];
            int i9 = i8 - 20;
            System.arraycopy(bArr4, i9, bArr5, 0, 20);
            i = C2540id3.m19571m(bArr4, i9 - 4);
            if (i > length) {
                this.f10403a = x70.f19455y;
                return null;
            }
            yi5 yi5 = new yi5();
            yi5.mo28099n();
            yi5.mo22981d(bArr4, 0, i);
            yi5.mo28098m();
            if (!yi5.f20239f) {
                this.f10403a = x70.f19455y;
                return null;
            }
            for (int i10 = 0; i10 < 20; i10++) {
                if (yi5.f20238e[i10] != bArr5[i10]) {
                    this.f10403a = x70.f19455y;
                    return null;
                }
            }
        } else {
            i = C2540id3.m19571m(bArr4, i8 - 4);
            if (i > length) {
                this.f10403a = x70.f19455y;
                return null;
            }
        }
        byte[] bArr6 = new byte[i];
        System.arraycopy(bArr4, 0, bArr6, 0, i);
        this.f10403a = 0;
        return bArr6;
    }

    /* renamed from: b */
    public String mo18370b(String str) {
        if (!this.f10406d) {
            this.f10403a = x70.f19446v;
            return new String();
        } else if (str == null || str.length() == 0) {
            this.f10403a = x70.f19389c;
            return new String();
        } else {
            new String();
            byte[] c = C3311sx.m27173c(str);
            StringBuffer stringBuffer = new StringBuffer();
            byte[] a = mo18369a(c);
            if (a == null) {
                return new String();
            }
            for (byte b : a) {
                stringBuffer.append((char) b);
            }
            this.f10403a = 0;
            return stringBuffer.toString();
        }
    }

    /* renamed from: c */
    public byte[] mo18371c(byte[] bArr) {
        int i;
        int i2;
        byte[] bArr2 = bArr;
        if (!this.f10406d) {
            this.f10403a = x70.f19446v;
            return null;
        } else if (bArr2 == null) {
            return null;
        } else {
            byte[] bArr3 = new byte[16];
            byte[] bArr4 = new byte[16];
            int length = bArr2.length;
            int i3 = length + 4;
            if (this.f10404b) {
                i = 20;
            } else {
                i = 0;
            }
            int i4 = i3 + i + 1;
            int i5 = i4 % 16;
            if (i5 == 0) {
                i2 = 0;
            } else {
                i2 = 16 - i5;
            }
            int i6 = i4 + i2;
            byte[] bArr5 = new byte[i6];
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                bArr5[i8] = bArr2[i7];
                i7++;
                i8++;
            }
            int i9 = 0;
            while (i9 < i2) {
                bArr5[i8] = 32;
                i9++;
                i8++;
            }
            C2540id3.m19572n(length, bArr5, i8);
            int i10 = i8 + 4;
            if (this.f10404b) {
                int length2 = bArr2.length;
                byte[] bArr6 = new byte[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    bArr6[i11] = bArr2[i11];
                }
                yi5 yi5 = new yi5();
                yi5.mo28099n();
                yi5.mo22980c(bArr6);
                yi5.mo28098m();
                int i12 = 0;
                while (i12 < 20) {
                    bArr5[i10] = yi5.f20238e[i12];
                    i12++;
                    i10++;
                }
            }
            bArr5[i10] = this.f10404b ? (byte) 1 : 0;
            int i13 = i6 / 16;
            byte[] bArr7 = new byte[i6];
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = 0;
                while (i17 < 16) {
                    bArr3[i17] = bArr5[i14];
                    i17++;
                    i14++;
                }
                this.f10405c.mo11319f(bArr3, bArr4, 8);
                int i18 = 0;
                while (i18 < 16) {
                    bArr7[i15] = bArr4[i18];
                    i18++;
                    i15++;
                }
            }
            this.f10403a = 0;
            return bArr7;
        }
    }

    /* renamed from: d */
    public String mo18372d(String str) {
        if (!this.f10406d) {
            this.f10403a = x70.f19446v;
            return new String();
        } else if (str == null || str.length() == 0) {
            this.f10403a = x70.f19389c;
            return new String();
        } else {
            byte[] bArr = new byte[str.length()];
            for (int i = 0; i < str.length(); i++) {
                bArr[i] = (byte) str.charAt(i);
            }
            return mo18373e(bArr);
        }
    }

    /* renamed from: e */
    public String mo18373e(byte[] bArr) {
        if (!this.f10406d) {
            this.f10403a = x70.f19446v;
            return new String();
        } else if (bArr != null) {
            return C3311sx.m27176f(mo18371c(bArr));
        } else {
            this.f10403a = x70.f19389c;
            return new String();
        }
    }

    /* renamed from: f */
    public long mo18374f() {
        return this.f10403a;
    }

    /* renamed from: g */
    public boolean mo18375g(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) bArr[i];
        }
        this.f10406d = true;
        C1599b bVar = new C1599b();
        this.f10405c = bVar;
        return bVar.mo11316c(cArr);
    }

    /* renamed from: h */
    public boolean mo18376h(byte[] bArr, int i) {
        C1599b bVar = new C1599b();
        this.f10405c = bVar;
        boolean b = bVar.mo11315b(bArr);
        this.f10406d = true;
        return b;
    }

    /* renamed from: i */
    public void mo18377i(boolean z) {
        this.f10404b = z;
    }

    /* renamed from: j */
    public void mo18378j() {
        this.f10406d = false;
        this.f10405c.mo11317d();
    }

    public cx7() {
        this.f10405c = new C1599b();
        this.f10404b = false;
        this.f10403a = 0;
        mo18378j();
    }
}
