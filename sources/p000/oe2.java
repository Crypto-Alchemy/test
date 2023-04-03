package p000;

/* renamed from: oe2 */
public class oe2 {

    /* renamed from: a */
    public int f43634a = 0;

    /* renamed from: b */
    public int f43635b;

    public oe2(byte[] bArr) {
        if (bArr.length == 4) {
            int d = oi3.m70290d(bArr);
            this.f43635b = d;
            if (gs4.m58238c(d)) {
                this.f43634a = gs4.m58236a(this.f43635b);
                return;
            }
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }

    /* renamed from: i */
    public static String m70241i(int i) {
        if (i == 0) {
            return "0";
        }
        String str = ((byte) (i & 1)) == 1 ? "1" : "";
        int i2 = i >>> 1;
        int i3 = 1;
        while (i2 != 0) {
            if (((byte) (i2 & 1)) == 1) {
                str = str + "+x^" + i3;
            }
            i2 >>>= 1;
            i3++;
        }
        return str;
    }

    /* renamed from: a */
    public int mo62885a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: b */
    public String mo62886b(int i) {
        String str;
        StringBuilder sb;
        String str2 = "";
        for (int i2 = 0; i2 < this.f43634a; i2++) {
            if ((((byte) i) & 1) == 0) {
                sb = new StringBuilder();
                str = "0";
            } else {
                sb = new StringBuilder();
                str = "1";
            }
            sb.append(str);
            sb.append(str2);
            str2 = sb.toString();
            i >>>= 1;
        }
        return str2;
    }

    /* renamed from: c */
    public int mo62887c(int i, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = mo62891f(i);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = mo62893h(i3, i);
            }
            i = mo62893h(i, i);
            i2 >>>= 1;
        }
        return i3;
    }

    /* renamed from: d */
    public int mo62888d() {
        return this.f43634a;
    }

    /* renamed from: e */
    public byte[] mo62889e() {
        return oi3.m70289c(this.f43635b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof oe2)) {
            oe2 oe2 = (oe2) obj;
            return this.f43634a == oe2.f43634a && this.f43635b == oe2.f43635b;
        }
    }

    /* renamed from: f */
    public int mo62891f(int i) {
        return mo62887c(i, (1 << this.f43634a) - 2);
    }

    /* renamed from: g */
    public boolean mo62892g(int i) {
        int i2 = this.f43634a;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    /* renamed from: h */
    public int mo62893h(int i, int i2) {
        return gs4.m58239d(i, i2, this.f43635b);
    }

    public int hashCode() {
        return this.f43635b;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.f43634a + ") = GF(2)[X]/<" + m70241i(this.f43635b) + "> ";
    }
}
