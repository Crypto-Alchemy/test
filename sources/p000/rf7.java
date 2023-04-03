package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lrf7;", "", "", "toString", "", "hashCode", "other", "", "equals", "Les6;", "a", "Les6;", "d", "()Les6;", "topic", "", "b", "J", "()J", "id", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "method", "Lrg0;", "Lrg0;", "()Lrg0;", "params", "<init>", "(Les6;JLjava/lang/String;Lrg0;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rf7 */
/* compiled from: WCRequest.kt */
public final class rf7 {

    /* renamed from: a */
    public final es6 f33426a;

    /* renamed from: b */
    public final long f33427b;

    /* renamed from: c */
    public final String f33428c;

    /* renamed from: d */
    public final rg0 f33429d;

    public rf7(es6 es6, long j, String str, rg0 rg0) {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(str, "method");
        vx2.m53591g(rg0, "params");
        this.f33426a = es6;
        this.f33427b = j;
        this.f33428c = str;
        this.f33429d = rg0;
    }

    /* renamed from: a */
    public final long mo47397a() {
        return this.f33427b;
    }

    /* renamed from: b */
    public final String mo47398b() {
        return this.f33428c;
    }

    /* renamed from: c */
    public final rg0 mo47399c() {
        return this.f33429d;
    }

    /* renamed from: d */
    public final es6 mo47400d() {
        return this.f33426a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf7)) {
            return false;
        }
        rf7 rf7 = (rf7) obj;
        return vx2.m53586b(this.f33426a, rf7.f33426a) && this.f33427b == rf7.f33427b && vx2.m53586b(this.f33428c, rf7.f33428c) && vx2.m53586b(this.f33429d, rf7.f33429d);
    }

    public int hashCode() {
        return (((((this.f33426a.hashCode() * 31) + au0.m10781a(this.f33427b)) * 31) + this.f33428c.hashCode()) * 31) + this.f33429d.hashCode();
    }

    public String toString() {
        es6 es6 = this.f33426a;
        long j = this.f33427b;
        String str = this.f33428c;
        rg0 rg0 = this.f33429d;
        return "WCRequest(topic=" + es6 + ", id=" + j + ", method=" + str + ", params=" + rg0 + ")";
    }
}
