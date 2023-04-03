package p000;

/* renamed from: c26 */
/* compiled from: SimpleCacheKey */
public class c26 implements f80 {

    /* renamed from: a */
    public final String f8321a;

    /* renamed from: b */
    public final boolean f8322b;

    public c26(String str) {
        this(str, false);
    }

    /* renamed from: a */
    public String mo11960a() {
        return this.f8321a;
    }

    /* renamed from: b */
    public boolean mo11961b() {
        return this.f8322b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c26) {
            return this.f8321a.equals(((c26) obj).f8321a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8321a.hashCode();
    }

    public String toString() {
        return this.f8321a;
    }

    public c26(String str, boolean z) {
        this.f8321a = (String) au4.m10792g(str);
        this.f8322b = z;
    }
}
