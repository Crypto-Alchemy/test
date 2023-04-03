package p000;

/* renamed from: u36 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class u36 {

    /* renamed from: a */
    public final int f34454a;

    /* renamed from: b */
    public final int f34455b;

    public u36(int i, int i2) {
        this.f34454a = i;
        this.f34455b = i2;
    }

    /* renamed from: a */
    public int mo48301a() {
        return this.f34455b;
    }

    /* renamed from: b */
    public int mo48302b() {
        return this.f34454a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof u36) {
            u36 u36 = (u36) obj;
            if (this.f34454a == u36.f34454a && this.f34455b == u36.f34455b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f34455b;
        int i2 = this.f34454a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        int i = this.f34454a;
        int i2 = this.f34455b;
        return i + "x" + i2;
    }
}
