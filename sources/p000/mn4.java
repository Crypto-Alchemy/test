package p000;

/* renamed from: mn4 */
public class mn4 {

    /* renamed from: a */
    public int[] f40973a;

    public mn4(byte[] bArr) {
        if (bArr.length > 4) {
            int e = oi3.m70291e(bArr, 0);
            int a = cx2.m56584a(e - 1);
            if (bArr.length == (e * a) + 4) {
                this.f40973a = new int[e];
                for (int i = 0; i < e; i++) {
                    this.f40973a[i] = oi3.m70292f(bArr, (i * a) + 4, a);
                }
                if (!mo56278b(this.f40973a)) {
                    throw new IllegalArgumentException("invalid encoding");
                }
                return;
            }
            throw new IllegalArgumentException("invalid encoding");
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    /* renamed from: a */
    public byte[] mo56277a() {
        int length = this.f40973a.length;
        int a = cx2.m56584a(length - 1);
        byte[] bArr = new byte[((length * a) + 4)];
        oi3.m70287a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            oi3.m70288b(this.f40973a[i], bArr, (i * a) + 4, a);
        }
        return bArr;
    }

    /* renamed from: b */
    public final boolean mo56278b(int[] iArr) {
        boolean[] zArr = new boolean[r0];
        for (int i : iArr) {
            if (i < 0 || i >= r0 || zArr[i]) {
                return false;
            }
            zArr[i] = true;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mn4)) {
            return false;
        }
        return zw2.m75242b(this.f40973a, ((mn4) obj).f40973a);
    }

    public int hashCode() {
        return C9367tq.m72440x(this.f40973a);
    }

    public String toString() {
        String str = "[" + this.f40973a[0];
        for (int i = 1; i < this.f40973a.length; i++) {
            str = str + ", " + this.f40973a[i];
        }
        return str + "]";
    }
}
