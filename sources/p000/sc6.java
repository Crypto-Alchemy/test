package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lsc6;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "<init>", "(Ljava/lang/String;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = false)
/* renamed from: sc6 */
/* compiled from: SubscriptionId.kt */
public final class sc6 {

    /* renamed from: a */
    public final String f33825a;

    public sc6(String str) {
        vx2.m53591g(str, "id");
        this.f33825a = str;
    }

    /* renamed from: a */
    public final String mo47732a() {
        return this.f33825a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sc6) && vx2.m53586b(this.f33825a, ((sc6) obj).f33825a);
    }

    public int hashCode() {
        return this.f33825a.hashCode();
    }

    public String toString() {
        String str = this.f33825a;
        return "SubscriptionId(id=" + str + ")";
    }
}
