package p000;

/* renamed from: lu4 */
/* compiled from: Preference */
public class lu4 {

    /* renamed from: a */
    public String f14734a;

    /* renamed from: b */
    public Long f14735b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public lu4(String str, boolean z) {
        this(str, z ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu4)) {
            return false;
        }
        lu4 lu4 = (lu4) obj;
        if (!this.f14734a.equals(lu4.f14734a)) {
            return false;
        }
        Long l = this.f14735b;
        Long l2 = lu4.f14735b;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f14734a.hashCode() * 31;
        Long l = this.f14735b;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public lu4(String str, long j) {
        this.f14734a = str;
        this.f14735b = Long.valueOf(j);
    }
}
