package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Ll57;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "url", "<init>", "(Ljava/lang/String;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: l57 */
/* compiled from: UrlAnnotation.kt */
public final class l57 {

    /* renamed from: a */
    public final String f14421a;

    public l57(String str) {
        vx2.m53591g(str, "url");
        this.f14421a = str;
    }

    /* renamed from: a */
    public final String mo22664a() {
        return this.f14421a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l57) && vx2.m53586b(this.f14421a, ((l57) obj).f14421a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f14421a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f14421a + ')';
    }
}
