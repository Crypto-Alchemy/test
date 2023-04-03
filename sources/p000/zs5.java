package p000;

/* renamed from: zs5 */
/* compiled from: SeekPoint */
public final class zs5 {

    /* renamed from: c */
    public static final zs5 f20674c = new zs5(0, 0);

    /* renamed from: a */
    public final long f20675a;

    /* renamed from: b */
    public final long f20676b;

    public zs5(long j, long j2) {
        this.f20675a = j;
        this.f20676b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zs5.class != obj.getClass()) {
            return false;
        }
        zs5 zs5 = (zs5) obj;
        if (this.f20675a == zs5.f20675a && this.f20676b == zs5.f20676b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f20675a) * 31) + ((int) this.f20676b);
    }

    public String toString() {
        return "[timeUs=" + this.f20675a + ", position=" + this.f20676b + "]";
    }
}
