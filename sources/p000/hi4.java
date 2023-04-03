package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lhi4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "<init>", "(Ljava/lang/String;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: hi4 */
/* compiled from: OpaqueKey.kt */
public final class hi4 {

    /* renamed from: a */
    public final String f12893a;

    public hi4(String str) {
        vx2.m53591g(str, "key");
        this.f12893a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hi4) && vx2.m53586b(this.f12893a, ((hi4) obj).f12893a);
    }

    public int hashCode() {
        return this.f12893a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f12893a + ')';
    }
}
