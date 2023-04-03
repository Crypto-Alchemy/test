package p000;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: en6 */
/* compiled from: TextBuffer */
public final class en6 {

    /* renamed from: l */
    public static final char[] f11284l = new char[0];

    /* renamed from: a */
    public final r40 f11285a;

    /* renamed from: b */
    public char[] f11286b;

    /* renamed from: c */
    public int f11287c;

    /* renamed from: d */
    public int f11288d;

    /* renamed from: e */
    public ArrayList<char[]> f11289e;

    /* renamed from: f */
    public boolean f11290f;

    /* renamed from: g */
    public int f11291g;

    /* renamed from: h */
    public char[] f11292h;

    /* renamed from: i */
    public int f11293i;

    /* renamed from: j */
    public String f11294j;

    /* renamed from: k */
    public char[] f11295k;

    public en6(r40 r40) {
        this.f11285a = r40;
    }

    /* renamed from: q */
    public static en6 m16225q(char[] cArr) {
        return new en6((r40) null, cArr);
    }

    /* renamed from: A */
    public void mo19395A(char[] cArr, int i, int i2) {
        this.f11294j = null;
        this.f11295k = null;
        this.f11286b = cArr;
        this.f11287c = i;
        this.f11288d = i2;
        if (this.f11290f) {
            mo19407f();
        }
    }

    /* renamed from: B */
    public void mo19396B(String str) {
        this.f11286b = null;
        this.f11287c = -1;
        this.f11288d = 0;
        this.f11294j = str;
        this.f11295k = null;
        if (this.f11290f) {
            mo19407f();
        }
        this.f11293i = 0;
    }

    /* renamed from: C */
    public final char[] mo19397C() {
        int i;
        String str = this.f11294j;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.f11287c;
        if (i2 >= 0) {
            int i3 = this.f11288d;
            if (i3 < 1) {
                return f11284l;
            }
            if (i2 == 0) {
                return Arrays.copyOf(this.f11286b, i3);
            }
            return Arrays.copyOfRange(this.f11286b, i2, i3 + i2);
        }
        int F = mo19400F();
        if (F < 1) {
            return f11284l;
        }
        char[] e = mo19406e(F);
        ArrayList<char[]> arrayList = this.f11289e;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr = this.f11289e.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, e, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.f11292h, 0, e, i, this.f11293i);
        return e;
    }

    /* renamed from: D */
    public String mo19398D(int i) {
        String str;
        this.f11293i = i;
        if (this.f11291g > 0) {
            return mo19413l();
        }
        if (i == 0) {
            str = "";
        } else {
            str = new String(this.f11292h, 0, i);
        }
        this.f11294j = str;
        return str;
    }

    /* renamed from: E */
    public void mo19399E(int i) {
        this.f11293i = i;
    }

    /* renamed from: F */
    public int mo19400F() {
        if (this.f11287c >= 0) {
            return this.f11288d;
        }
        char[] cArr = this.f11295k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f11294j;
        if (str != null) {
            return str.length();
        }
        return this.f11291g + this.f11293i;
    }

    /* renamed from: G */
    public final void mo19401G(int i) {
        int i2 = this.f11288d;
        this.f11288d = 0;
        char[] cArr = this.f11286b;
        this.f11286b = null;
        int i3 = this.f11287c;
        this.f11287c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.f11292h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.f11292h = mo19405d(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.f11292h, 0, i2);
        }
        this.f11291g = 0;
        this.f11293i = i2;
    }

    /* renamed from: a */
    public void mo19402a(char c) {
        if (this.f11287c >= 0) {
            mo19401G(16);
        }
        this.f11294j = null;
        this.f11295k = null;
        char[] cArr = this.f11292h;
        if (this.f11293i >= cArr.length) {
            mo19415n(1);
            cArr = this.f11292h;
        }
        int i = this.f11293i;
        this.f11293i = i + 1;
        cArr[i] = c;
    }

    /* renamed from: b */
    public void mo19403b(String str, int i, int i2) {
        if (this.f11287c >= 0) {
            mo19401G(i2);
        }
        this.f11294j = null;
        this.f11295k = null;
        char[] cArr = this.f11292h;
        int length = cArr.length;
        int i3 = this.f11293i;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.f11293i += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            mo19415n(i2);
            int min = Math.min(this.f11292h.length, i2);
            int i6 = i + min;
            str.getChars(i, i6, this.f11292h, 0);
            this.f11293i += min;
            i2 -= min;
            if (i2 > 0) {
                i = i6;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo19404c(char[] cArr, int i, int i2) {
        if (this.f11287c >= 0) {
            mo19401G(i2);
        }
        this.f11294j = null;
        this.f11295k = null;
        char[] cArr2 = this.f11292h;
        int length = cArr2.length;
        int i3 = this.f11293i;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.f11293i += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            mo19415n(i2);
            int min = Math.min(this.f11292h.length, i2);
            System.arraycopy(cArr, i, this.f11292h, 0, min);
            this.f11293i += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    /* renamed from: d */
    public final char[] mo19405d(int i) {
        r40 r40 = this.f11285a;
        if (r40 != null) {
            return r40.mo25319d(2, i);
        }
        return new char[Math.max(i, 500)];
    }

    /* renamed from: e */
    public final char[] mo19406e(int i) {
        return new char[i];
    }

    /* renamed from: f */
    public final void mo19407f() {
        this.f11290f = false;
        this.f11289e.clear();
        this.f11291g = 0;
        this.f11293i = 0;
    }

    /* renamed from: g */
    public char[] mo19408g() {
        char[] cArr = this.f11295k;
        if (cArr != null) {
            return cArr;
        }
        char[] C = mo19397C();
        this.f11295k = C;
        return C;
    }

    /* renamed from: h */
    public BigDecimal mo19409h() throws NumberFormatException {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.f11295k;
        if (cArr3 != null) {
            return kc4.m20644g(cArr3);
        }
        int i = this.f11287c;
        if (i >= 0 && (cArr2 = this.f11286b) != null) {
            return kc4.m20645h(cArr2, i, this.f11288d);
        }
        if (this.f11291g != 0 || (cArr = this.f11292h) == null) {
            return kc4.m20644g(mo19408g());
        }
        return kc4.m20645h(cArr, 0, this.f11293i);
    }

    /* renamed from: i */
    public double mo19410i() throws NumberFormatException {
        return kc4.m20646i(mo19413l());
    }

    /* renamed from: j */
    public int mo19411j(boolean z) {
        char[] cArr;
        int i = this.f11287c;
        if (i < 0 || (cArr = this.f11286b) == null) {
            if (z) {
                return -kc4.m20648k(this.f11292h, 1, this.f11293i - 1);
            }
            return kc4.m20648k(this.f11292h, 0, this.f11293i);
        } else if (z) {
            return -kc4.m20648k(cArr, i + 1, this.f11288d - 1);
        } else {
            return kc4.m20648k(cArr, i, this.f11288d);
        }
    }

    /* renamed from: k */
    public long mo19412k(boolean z) {
        char[] cArr;
        int i = this.f11287c;
        if (i < 0 || (cArr = this.f11286b) == null) {
            if (z) {
                return -kc4.m20650m(this.f11292h, 1, this.f11293i - 1);
            }
            return kc4.m20650m(this.f11292h, 0, this.f11293i);
        } else if (z) {
            return -kc4.m20650m(cArr, i + 1, this.f11288d - 1);
        } else {
            return kc4.m20650m(cArr, i, this.f11288d);
        }
    }

    /* renamed from: l */
    public String mo19413l() {
        if (this.f11294j == null) {
            char[] cArr = this.f11295k;
            if (cArr != null) {
                this.f11294j = new String(cArr);
            } else {
                int i = this.f11287c;
                String str = "";
                if (i >= 0) {
                    int i2 = this.f11288d;
                    if (i2 < 1) {
                        this.f11294j = str;
                        return str;
                    }
                    this.f11294j = new String(this.f11286b, i, i2);
                } else {
                    int i3 = this.f11291g;
                    int i4 = this.f11293i;
                    if (i3 == 0) {
                        if (i4 != 0) {
                            str = new String(this.f11292h, 0, i4);
                        }
                        this.f11294j = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this.f11289e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.f11289e.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.f11292h, 0, this.f11293i);
                        this.f11294j = sb.toString();
                    }
                }
            }
        }
        return this.f11294j;
    }

    /* renamed from: m */
    public char[] mo19414m() {
        this.f11287c = -1;
        this.f11293i = 0;
        this.f11288d = 0;
        this.f11286b = null;
        this.f11294j = null;
        this.f11295k = null;
        if (this.f11290f) {
            mo19407f();
        }
        char[] cArr = this.f11292h;
        if (cArr != null) {
            return cArr;
        }
        char[] d = mo19405d(0);
        this.f11292h = d;
        return d;
    }

    /* renamed from: n */
    public final void mo19415n(int i) {
        if (this.f11289e == null) {
            this.f11289e = new ArrayList<>();
        }
        char[] cArr = this.f11292h;
        this.f11290f = true;
        this.f11289e.add(cArr);
        this.f11291g += cArr.length;
        this.f11293i = 0;
        int length = cArr.length;
        int i2 = length + (length >> 1);
        if (i2 < 500) {
            i2 = 500;
        } else if (i2 > 65536) {
            i2 = 65536;
        }
        this.f11292h = mo19406e(i2);
    }

    /* renamed from: o */
    public char[] mo19416o() {
        char[] cArr = this.f11292h;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this.f11292h = copyOf;
        return copyOf;
    }

    /* renamed from: p */
    public char[] mo19417p() {
        if (this.f11289e == null) {
            this.f11289e = new ArrayList<>();
        }
        this.f11290f = true;
        this.f11289e.add(this.f11292h);
        int length = this.f11292h.length;
        this.f11291g += length;
        this.f11293i = 0;
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > 65536) {
            i = 65536;
        }
        char[] e = mo19406e(i);
        this.f11292h = e;
        return e;
    }

    /* renamed from: r */
    public char[] mo19418r() {
        return this.f11292h;
    }

    /* renamed from: s */
    public char[] mo19419s() {
        if (this.f11287c >= 0) {
            mo19401G(1);
        } else {
            char[] cArr = this.f11292h;
            if (cArr == null) {
                this.f11292h = mo19405d(0);
            } else if (this.f11293i >= cArr.length) {
                mo19415n(1);
            }
        }
        return this.f11292h;
    }

    /* renamed from: t */
    public int mo19420t() {
        return this.f11293i;
    }

    public String toString() {
        return mo19413l();
    }

    /* renamed from: u */
    public char[] mo19422u() {
        if (this.f11287c >= 0) {
            return this.f11286b;
        }
        char[] cArr = this.f11295k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f11294j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f11295k = charArray;
            return charArray;
        } else if (this.f11290f) {
            return mo19408g();
        } else {
            char[] cArr2 = this.f11292h;
            if (cArr2 == null) {
                return f11284l;
            }
            return cArr2;
        }
    }

    /* renamed from: v */
    public int mo19423v() {
        int i = this.f11287c;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    /* renamed from: w */
    public boolean mo19424w() {
        if (this.f11287c >= 0 || this.f11295k != null || this.f11294j == null) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public void mo19425x() {
        char[] cArr;
        this.f11287c = -1;
        this.f11293i = 0;
        this.f11288d = 0;
        this.f11286b = null;
        this.f11295k = null;
        if (this.f11290f) {
            mo19407f();
        }
        r40 r40 = this.f11285a;
        if (r40 != null && (cArr = this.f11292h) != null) {
            this.f11292h = null;
            r40.mo25325j(2, cArr);
        }
    }

    /* renamed from: y */
    public void mo19426y(String str, int i, int i2) {
        this.f11286b = null;
        this.f11287c = -1;
        this.f11288d = 0;
        this.f11294j = null;
        this.f11295k = null;
        if (this.f11290f) {
            mo19407f();
        } else if (this.f11292h == null) {
            this.f11292h = mo19405d(i2);
        }
        this.f11291g = 0;
        this.f11293i = 0;
        mo19403b(str, i, i2);
    }

    /* renamed from: z */
    public void mo19427z(char[] cArr, int i, int i2) {
        this.f11286b = null;
        this.f11287c = -1;
        this.f11288d = 0;
        this.f11294j = null;
        this.f11295k = null;
        if (this.f11290f) {
            mo19407f();
        } else if (this.f11292h == null) {
            this.f11292h = mo19405d(i2);
        }
        this.f11291g = 0;
        this.f11293i = 0;
        mo19404c(cArr, i, i2);
    }

    public en6(r40 r40, char[] cArr) {
        this.f11285a = r40;
        this.f11292h = cArr;
        this.f11293i = cArr.length;
        this.f11287c = -1;
    }
}
