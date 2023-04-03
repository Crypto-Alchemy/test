package p000;

import com.fasterxml.jackson.core.filter.TokenFilter;

/* renamed from: o53 */
/* compiled from: JsonPointerBasedFilter */
public class o53 extends TokenFilter {

    /* renamed from: b */
    public final n53 f15817b;

    public o53(String str) {
        this(n53.m22805e(str));
    }

    /* renamed from: a */
    public boolean mo14032a() {
        return this.f15817b.mo23517j();
    }

    /* renamed from: c */
    public TokenFilter mo14034c() {
        return this;
    }

    /* renamed from: d */
    public TokenFilter mo14035d() {
        return this;
    }

    /* renamed from: e */
    public TokenFilter mo14036e(int i) {
        n53 h = this.f15817b.mo23514h(i);
        if (h == null) {
            return null;
        }
        if (h.mo23517j()) {
            return TokenFilter.f9844a;
        }
        return new o53(h);
    }

    /* renamed from: f */
    public TokenFilter mo14037f(String str) {
        n53 i = this.f15817b.mo23516i(str);
        if (i == null) {
            return null;
        }
        if (i.mo23517j()) {
            return TokenFilter.f9844a;
        }
        return new o53(i);
    }

    public String toString() {
        return "[JsonPointerFilter at: " + this.f15817b + "]";
    }

    public o53(n53 n53) {
        this.f15817b = n53;
    }
}
