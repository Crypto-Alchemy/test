package p000;

/* renamed from: zk */
/* compiled from: AnimationFrameCacheKey */
public class C3741zk implements f80 {

    /* renamed from: a */
    public final String f20588a;

    /* renamed from: b */
    public final boolean f20589b;

    public C3741zk(int i, boolean z) {
        this.f20588a = "anim://" + i;
        this.f20589b = z;
    }

    /* renamed from: a */
    public String mo11960a() {
        return this.f20588a;
    }

    /* renamed from: b */
    public boolean mo11961b() {
        return false;
    }

    public boolean equals(Object obj) {
        if (!this.f20589b) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f20588a.equals(((C3741zk) obj).f20588a);
    }

    public int hashCode() {
        if (!this.f20589b) {
            return super.hashCode();
        }
        return this.f20588a.hashCode();
    }
}
