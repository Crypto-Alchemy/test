package p000;

/* renamed from: dx2 */
/* compiled from: IntegerParser */
public class dx2 {

    /* renamed from: a */
    public int f10972a;

    /* renamed from: b */
    public long f10973b;

    public dx2(long j, int i) {
        this.f10973b = j;
        this.f10972a = i;
    }

    /* renamed from: b */
    public static dx2 m15490b(String str, int i, int i2) {
        long j;
        int i3;
        if (i >= i2) {
            return null;
        }
        long j2 = 0;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                if (charAt < 'A' || charAt > 'F') {
                    if (charAt < 'a' || charAt > 'f') {
                        break;
                    }
                    j = j2 * 16;
                    i3 = charAt - 'a';
                } else {
                    j = j2 * 16;
                    i3 = charAt - 'A';
                }
                j2 = j + ((long) i3) + 10;
            } else {
                j2 = (j2 * 16) + ((long) (charAt - '0'));
            }
            if (j2 > 4294967295L) {
                return null;
            }
            i4++;
        }
        if (i4 == i) {
            return null;
        }
        return new dx2(j2, i4);
    }

    /* renamed from: c */
    public static dx2 m15491c(String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return null;
        }
        boolean z2 = false;
        if (z) {
            char charAt = str.charAt(i);
            if (charAt != '+') {
                if (charAt == '-') {
                    z2 = true;
                }
            }
            i++;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            if (z2) {
                j = (j * 10) - ((long) (charAt2 - '0'));
                if (j < -2147483648L) {
                    return null;
                }
            } else {
                j = (j * 10) + ((long) (charAt2 - '0'));
                if (j > 2147483647L) {
                    return null;
                }
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new dx2(j, i3);
    }

    /* renamed from: a */
    public int mo18999a() {
        return this.f10972a;
    }

    /* renamed from: d */
    public int mo19000d() {
        return (int) this.f10973b;
    }
}
