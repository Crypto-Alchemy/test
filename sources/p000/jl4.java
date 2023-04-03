package p000;

/* renamed from: jl4 */
/* compiled from: Pair */
public class jl4<F, S> {

    /* renamed from: a */
    public final F f13688a;

    /* renamed from: b */
    public final S f13689b;

    public jl4(F f, S s) {
        this.f13688a = f;
        this.f13689b = s;
    }

    /* renamed from: a */
    public static <A, B> jl4<A, B> m20216a(A a, B b) {
        return new jl4<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jl4)) {
            return false;
        }
        jl4 jl4 = (jl4) obj;
        if (!mf4.m22283a(jl4.f13688a, this.f13688a) || !mf4.m22283a(jl4.f13689b, this.f13689b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        F f = this.f13688a;
        int i2 = 0;
        if (f == null) {
            i = 0;
        } else {
            i = f.hashCode();
        }
        S s = this.f13689b;
        if (s != null) {
            i2 = s.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        return "Pair{" + this.f13688a + " " + this.f13689b + "}";
    }
}
