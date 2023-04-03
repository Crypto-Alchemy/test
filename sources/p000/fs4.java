package p000;

import org.slf4j.Marker;

/* renamed from: fs4 */
public class fs4 {

    /* renamed from: a */
    public oe2 f37906a;

    /* renamed from: b */
    public int f37907b;

    /* renamed from: c */
    public int[] f37908c;

    public fs4(fs4 fs4) {
        this.f37906a = fs4.f37906a;
        this.f37907b = fs4.f37907b;
        this.f37908c = zw2.m75241a(fs4.f37908c);
    }

    public fs4(oe2 oe2, int i) {
        this.f37906a = oe2;
        this.f37907b = i;
        int[] iArr = new int[(i + 1)];
        this.f37908c = iArr;
        iArr[i] = 1;
    }

    public fs4(oe2 oe2, byte[] bArr) {
        this.f37906a = oe2;
        int i = 8;
        int i2 = 1;
        while (oe2.mo62888d() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 == 0) {
            this.f37908c = new int[(bArr.length / i2)];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = this.f37908c;
                if (i3 < iArr.length) {
                    int i5 = 0;
                    while (i5 < i) {
                        int[] iArr2 = this.f37908c;
                        iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                        i5 += 8;
                        i4++;
                    }
                    if (this.f37906a.mo62892g(this.f37908c[i3])) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                } else if (iArr.length == 1 || iArr[iArr.length - 1] != 0) {
                    mo51780d();
                    return;
                } else {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
            }
        } else {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
    }

    public fs4(oe2 oe2, int[] iArr) {
        this.f37906a = oe2;
        this.f37908c = m57911q(iArr);
        mo51780d();
    }

    /* renamed from: c */
    public static int m57907c(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    /* renamed from: i */
    public static int m57908i(int[] iArr) {
        int c = m57907c(iArr);
        if (c == -1) {
            return 0;
        }
        return iArr[c];
    }

    /* renamed from: j */
    public static boolean m57909j(int[] iArr, int[] iArr2) {
        int c = m57907c(iArr);
        if (c != m57907c(iArr2)) {
            return false;
        }
        for (int i = 0; i <= c; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static int[] m57910p(int[] iArr, int i) {
        int c = m57907c(iArr);
        if (c == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[(c + i + 1)];
        System.arraycopy(iArr, 0, iArr2, i, c + 1);
        return iArr2;
    }

    /* renamed from: q */
    public static int[] m57911q(int[] iArr) {
        int c = m57907c(iArr);
        if (c == -1) {
            return new int[1];
        }
        int i = c + 1;
        if (iArr.length == i) {
            return zw2.m75241a(iArr);
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    /* renamed from: a */
    public final int[] mo51778a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.f37906a.mo62885a(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    /* renamed from: b */
    public void mo51779b(fs4 fs4) {
        this.f37908c = mo51778a(this.f37908c, fs4.f37908c);
        mo51780d();
    }

    /* renamed from: d */
    public final void mo51780d() {
        int length = this.f37908c.length;
        do {
            this.f37907b = length - 1;
            length = this.f37907b;
            if (length < 0 || this.f37908c[length] != 0) {
            }
            this.f37907b = length - 1;
            length = this.f37907b;
            return;
        } while (this.f37908c[length] != 0);
    }

    /* renamed from: e */
    public int mo51781e(int i) {
        int[] iArr = this.f37908c;
        int i2 = this.f37907b;
        int i3 = iArr[i2];
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 = this.f37906a.mo62893h(i3, i) ^ this.f37908c[i4];
        }
        return i3;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof fs4)) {
            fs4 fs4 = (fs4) obj;
            return this.f37906a.equals(fs4.f37906a) && this.f37907b == fs4.f37907b && m57909j(this.f37908c, fs4.f37908c);
        }
    }

    /* renamed from: f */
    public int mo51783f(int i) {
        if (i < 0 || i > this.f37907b) {
            return 0;
        }
        return this.f37908c[i];
    }

    /* renamed from: g */
    public int mo51784g() {
        int[] iArr = this.f37908c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    /* renamed from: h */
    public byte[] mo51785h() {
        int i = 8;
        int i2 = 1;
        while (this.f37906a.mo62888d() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[(this.f37908c.length * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f37908c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.f37908c[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = this.f37906a.hashCode();
        int i = 0;
        while (true) {
            int[] iArr = this.f37908c;
            if (i >= iArr.length) {
                return hashCode;
            }
            hashCode = (hashCode * 31) + iArr[i];
            i++;
        }
    }

    /* renamed from: k */
    public fs4 mo51787k(fs4 fs4) {
        return new fs4(this.f37906a, mo51788l(this.f37908c, fs4.f37908c));
    }

    /* renamed from: l */
    public final int[] mo51788l(int[] iArr, int[] iArr2) {
        int c = m57907c(iArr2);
        if (c != -1) {
            int length = iArr.length;
            int[] iArr3 = new int[length];
            int f = this.f37906a.mo62891f(m57908i(iArr2));
            System.arraycopy(iArr, 0, iArr3, 0, length);
            while (c <= m57907c(iArr3)) {
                iArr3 = mo51778a(mo51791o(m57910p(iArr2, m57907c(iArr3) - c), this.f37906a.mo62893h(m57908i(iArr3), f)), iArr3);
            }
            return iArr3;
        }
        throw new ArithmeticException("Division by zero");
    }

    /* renamed from: m */
    public void mo51789m(int i) {
        if (this.f37906a.mo62892g(i)) {
            this.f37908c = mo51791o(this.f37908c, i);
            mo51780d();
            return;
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    /* renamed from: n */
    public fs4 mo51790n(int i) {
        if (this.f37906a.mo62892g(i)) {
            return new fs4(this.f37906a, mo51791o(this.f37908c, i));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    /* renamed from: o */
    public final int[] mo51791o(int[] iArr, int i) {
        int c = m57907c(iArr);
        if (c == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return zw2.m75241a(iArr);
        }
        int[] iArr2 = new int[(c + 1)];
        while (c >= 0) {
            iArr2[c] = this.f37906a.mo62893h(iArr[c], i);
            c--;
        }
        return iArr2;
    }

    public String toString() {
        String str = " Polynomial over " + this.f37906a.toString() + ": \n";
        for (int i = 0; i < this.f37908c.length; i++) {
            str = str + this.f37906a.mo62886b(this.f37908c[i]) + "Y^" + i + Marker.ANY_NON_NULL_MARKER;
        }
        return str + ";";
    }
}
