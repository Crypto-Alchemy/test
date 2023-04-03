package p000;

/* renamed from: qr8 */
public final class qr8 implements Cloneable {

    /* renamed from: k */
    public static final tr8 f33251k = new tr8();

    /* renamed from: a */
    public boolean f33252a;

    /* renamed from: d */
    public int[] f33253d;

    /* renamed from: e */
    public tr8[] f33254e;

    /* renamed from: g */
    public int f33255g;

    public qr8() {
        this(10);
    }

    public qr8(int i) {
        this.f33252a = false;
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f33253d = new int[i5];
        this.f33254e = new tr8[i5];
        this.f33255g = 0;
    }

    /* renamed from: a */
    public final boolean mo47262a() {
        return this.f33255g == 0;
    }

    /* renamed from: b */
    public final int mo47263b() {
        return this.f33255g;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f33255g;
        qr8 qr8 = new qr8(i);
        System.arraycopy(this.f33253d, 0, qr8.f33253d, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            tr8 tr8 = this.f33254e[i2];
            if (tr8 != null) {
                qr8.f33254e[i2] = (tr8) tr8.clone();
            }
        }
        qr8.f33255g = i;
        return qr8;
    }

    /* renamed from: d */
    public final tr8 mo47265d(int i) {
        return this.f33254e[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qr8)) {
            return false;
        }
        qr8 qr8 = (qr8) obj;
        int i = this.f33255g;
        if (i != qr8.f33255g) {
            return false;
        }
        int[] iArr = this.f33253d;
        int[] iArr2 = qr8.f33253d;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            tr8[] tr8Arr = this.f33254e;
            tr8[] tr8Arr2 = qr8.f33254e;
            int i3 = this.f33255g;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!tr8Arr[i4].equals(tr8Arr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f33255g; i2++) {
            i = (((i * 31) + this.f33253d[i2]) * 31) + this.f33254e[i2].hashCode();
        }
        return i;
    }
}
