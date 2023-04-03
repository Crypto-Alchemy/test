package p000;

/* renamed from: lt2 */
/* compiled from: IncompatibleVersionErrorData.kt */
public final class lt2<T> {

    /* renamed from: a */
    public final T f40696a;

    /* renamed from: b */
    public final T f40697b;

    /* renamed from: c */
    public final String f40698c;

    /* renamed from: d */
    public final nf0 f40699d;

    public lt2(T t, T t2, String str, nf0 nf0) {
        vx2.m53591g(str, "filePath");
        vx2.m53591g(nf0, "classId");
        this.f40696a = t;
        this.f40697b = t2;
        this.f40698c = str;
        this.f40699d = nf0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt2)) {
            return false;
        }
        lt2 lt2 = (lt2) obj;
        return vx2.m53586b(this.f40696a, lt2.f40696a) && vx2.m53586b(this.f40697b, lt2.f40697b) && vx2.m53586b(this.f40698c, lt2.f40698c) && vx2.m53586b(this.f40699d, lt2.f40699d);
    }

    public int hashCode() {
        T t = this.f40696a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f40697b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f40698c.hashCode()) * 31) + this.f40699d.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f40696a + ", expectedVersion=" + this.f40697b + ", filePath=" + this.f40698c + ", classId=" + this.f40699d + ')';
    }
}
