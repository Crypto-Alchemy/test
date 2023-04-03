package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Llo3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "Lrw2;", "b", "Lrw2;", "getRange", "()Lrw2;", "range", "<init>", "(Ljava/lang/String;Lrw2;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: lo3 */
/* compiled from: Regex.kt */
public final class lo3 {

    /* renamed from: a */
    public final String f40665a;

    /* renamed from: b */
    public final rw2 f40666b;

    public lo3(String str, rw2 rw2) {
        vx2.m53591g(str, "value");
        vx2.m53591g(rw2, "range");
        this.f40665a = str;
        this.f40666b = rw2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo3)) {
            return false;
        }
        lo3 lo3 = (lo3) obj;
        return vx2.m53586b(this.f40665a, lo3.f40665a) && vx2.m53586b(this.f40666b, lo3.f40666b);
    }

    public int hashCode() {
        return (this.f40665a.hashCode() * 31) + this.f40666b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f40665a + ", range=" + this.f40666b + ')';
    }
}
