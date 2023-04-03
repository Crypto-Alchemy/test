package p000;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: gm4 */
/* compiled from: ParsableByteArray */
public final class gm4 {

    /* renamed from: a */
    public byte[] f12483a;

    /* renamed from: b */
    public int f12484b;

    /* renamed from: c */
    public int f12485c;

    public gm4() {
        this.f12483a = w67.f19026f;
    }

    /* renamed from: A */
    public String mo20659A(int i) {
        return mo20660B(i, be0.f21263c);
    }

    /* renamed from: B */
    public String mo20660B(int i, Charset charset) {
        String str = new String(this.f12483a, this.f12484b, i, charset);
        this.f12484b += i;
        return str;
    }

    /* renamed from: C */
    public int mo20661C() {
        return (mo20662D() << 21) | (mo20662D() << 14) | (mo20662D() << 7) | mo20662D();
    }

    /* renamed from: D */
    public int mo20662D() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        this.f12484b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: E */
    public int mo20663E() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        byte b = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f12484b = i2 + 1 + 2;
        return b;
    }

    /* renamed from: F */
    public long mo20664F() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f12484b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: G */
    public int mo20665G() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f12484b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: H */
    public int mo20666H() {
        int n = mo20689n();
        if (n >= 0) {
            return n;
        }
        throw new IllegalStateException("Top bit not zero: " + n);
    }

    /* renamed from: I */
    public long mo20667I() {
        long w = mo20698w();
        if (w >= 0) {
            return w;
        }
        throw new IllegalStateException("Top bit not zero: " + w);
    }

    /* renamed from: J */
    public int mo20668J() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        this.f12484b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: K */
    public long mo20669K() {
        int i;
        int i2;
        long j = (long) this.f12483a[this.f12484b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f12483a[this.f12484b + i];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f12484b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: L */
    public void mo20670L(int i) {
        byte[] bArr;
        if (mo20677b() < i) {
            bArr = new byte[i];
        } else {
            bArr = this.f12483a;
        }
        mo20672N(bArr, i);
    }

    /* renamed from: M */
    public void mo20671M(byte[] bArr) {
        mo20672N(bArr, bArr.length);
    }

    /* renamed from: N */
    public void mo20672N(byte[] bArr, int i) {
        this.f12483a = bArr;
        this.f12485c = i;
        this.f12484b = 0;
    }

    /* renamed from: O */
    public void mo20673O(int i) {
        boolean z;
        if (i < 0 || i > this.f12483a.length) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20981a(z);
        this.f12485c = i;
    }

    /* renamed from: P */
    public void mo20674P(int i) {
        boolean z;
        if (i < 0 || i > this.f12485c) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20981a(z);
        this.f12484b = i;
    }

    /* renamed from: Q */
    public void mo20675Q(int i) {
        mo20674P(this.f12484b + i);
    }

    /* renamed from: a */
    public int mo20676a() {
        return this.f12485c - this.f12484b;
    }

    /* renamed from: b */
    public int mo20677b() {
        return this.f12483a.length;
    }

    /* renamed from: c */
    public void mo20678c(int i) {
        if (i > mo20677b()) {
            this.f12483a = Arrays.copyOf(this.f12483a, i);
        }
    }

    /* renamed from: d */
    public byte[] mo20679d() {
        return this.f12483a;
    }

    /* renamed from: e */
    public int mo20680e() {
        return this.f12484b;
    }

    /* renamed from: f */
    public int mo20681f() {
        return this.f12485c;
    }

    /* renamed from: g */
    public char mo20682g() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: h */
    public int mo20683h() {
        return this.f12483a[this.f12484b] & 255;
    }

    /* renamed from: i */
    public void mo20684i(fm4 fm4, int i) {
        mo20685j(fm4.f11939a, 0, i);
        fm4.mo20012p(0);
    }

    /* renamed from: j */
    public void mo20685j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f12483a, this.f12484b, bArr, i, i2);
        this.f12484b += i2;
    }

    /* renamed from: k */
    public String mo20686k(char c) {
        if (mo20676a() == 0) {
            return null;
        }
        int i = this.f12484b;
        while (i < this.f12485c && this.f12483a[i] != c) {
            i++;
        }
        byte[] bArr = this.f12483a;
        int i2 = this.f12484b;
        String C = w67.m29298C(bArr, i2, i - i2);
        this.f12484b = i;
        if (i < this.f12485c) {
            this.f12484b = i + 1;
        }
        return C;
    }

    /* renamed from: l */
    public double mo20687l() {
        return Double.longBitsToDouble(mo20698w());
    }

    /* renamed from: m */
    public float mo20688m() {
        return Float.intBitsToFloat(mo20689n());
    }

    /* renamed from: n */
    public int mo20689n() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        this.f12484b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    /* renamed from: o */
    public int mo20690o() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.f12484b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: p */
    public String mo20691p() {
        if (mo20676a() == 0) {
            return null;
        }
        int i = this.f12484b;
        while (i < this.f12485c && !w67.m29377r0(this.f12483a[i])) {
            i++;
        }
        int i2 = this.f12484b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f12483a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f12484b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f12483a;
        int i3 = this.f12484b;
        String C = w67.m29298C(bArr2, i3, i - i3);
        this.f12484b = i;
        int i4 = this.f12485c;
        if (i == i4) {
            return C;
        }
        byte[] bArr3 = this.f12483a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f12484b = i5;
            if (i5 == i4) {
                return C;
            }
        }
        int i6 = this.f12484b;
        if (bArr3[i6] == 10) {
            this.f12484b = i6 + 1;
        }
        return C;
    }

    /* renamed from: q */
    public int mo20692q() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        byte b2 = b | ((bArr[i3] & 255) << 16);
        this.f12484b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b2;
    }

    /* renamed from: r */
    public long mo20693r() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.f12484b = i8 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: s */
    public short mo20694s() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        this.f12484b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: t */
    public long mo20695t() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f12484b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: u */
    public int mo20696u() {
        int q = mo20692q();
        if (q >= 0) {
            return q;
        }
        throw new IllegalStateException("Top bit not zero: " + q);
    }

    /* renamed from: v */
    public int mo20697v() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        this.f12484b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: w */
    public long mo20698w() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.f12484b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: x */
    public String mo20699x() {
        return mo20686k(0);
    }

    /* renamed from: y */
    public String mo20700y(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.f12484b;
        int i4 = (i3 + i) - 1;
        if (i4 >= this.f12485c || this.f12483a[i4] != 0) {
            i2 = i;
        } else {
            i2 = i - 1;
        }
        String C = w67.m29298C(this.f12483a, i3, i2);
        this.f12484b += i;
        return C;
    }

    /* renamed from: z */
    public short mo20701z() {
        byte[] bArr = this.f12483a;
        int i = this.f12484b;
        int i2 = i + 1;
        this.f12484b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public gm4(int i) {
        this.f12483a = new byte[i];
        this.f12485c = i;
    }

    public gm4(byte[] bArr) {
        this.f12483a = bArr;
        this.f12485c = bArr.length;
    }

    public gm4(byte[] bArr, int i) {
        this.f12483a = bArr;
        this.f12485c = i;
    }
}
