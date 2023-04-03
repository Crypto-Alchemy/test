package p000;

/* renamed from: vp */
/* compiled from: CapturedTypeApproximation.kt */
public final class C9466vp<T> {

    /* renamed from: a */
    public final T f45360a;

    /* renamed from: b */
    public final T f45361b;

    public C9466vp(T t, T t2) {
        this.f45360a = t;
        this.f45361b = t2;
    }

    /* renamed from: a */
    public final T mo66562a() {
        return this.f45360a;
    }

    /* renamed from: b */
    public final T mo66563b() {
        return this.f45361b;
    }

    /* renamed from: c */
    public final T mo66564c() {
        return this.f45360a;
    }

    /* renamed from: d */
    public final T mo66565d() {
        return this.f45361b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9466vp)) {
            return false;
        }
        C9466vp vpVar = (C9466vp) obj;
        return vx2.m53586b(this.f45360a, vpVar.f45360a) && vx2.m53586b(this.f45361b, vpVar.f45361b);
    }

    public int hashCode() {
        T t = this.f45360a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f45361b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f45360a + ", upper=" + this.f45361b + ')';
    }
}
