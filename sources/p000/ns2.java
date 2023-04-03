package p000;

/* renamed from: ns2 */
/* compiled from: ImmutableQualityInfo */
public class ns2 implements qz4 {

    /* renamed from: d */
    public static final qz4 f15676d = m23450d(Integer.MAX_VALUE, true, true);

    /* renamed from: a */
    public int f15677a;

    /* renamed from: b */
    public boolean f15678b;

    /* renamed from: c */
    public boolean f15679c;

    public ns2(int i, boolean z, boolean z2) {
        this.f15677a = i;
        this.f15678b = z;
        this.f15679c = z2;
    }

    /* renamed from: d */
    public static qz4 m23450d(int i, boolean z, boolean z2) {
        return new ns2(i, z, z2);
    }

    /* renamed from: a */
    public boolean mo23795a() {
        return this.f15679c;
    }

    /* renamed from: b */
    public boolean mo23796b() {
        return this.f15678b;
    }

    /* renamed from: c */
    public int mo23797c() {
        return this.f15677a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ns2)) {
            return false;
        }
        ns2 ns2 = (ns2) obj;
        if (this.f15677a == ns2.f15677a && this.f15678b == ns2.f15678b && this.f15679c == ns2.f15679c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = this.f15677a;
        int i3 = 0;
        if (this.f15678b) {
            i = 4194304;
        } else {
            i = 0;
        }
        int i4 = i2 ^ i;
        if (this.f15679c) {
            i3 = 8388608;
        }
        return i4 ^ i3;
    }
}
