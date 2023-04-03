package p000;

/* renamed from: t99 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class t99 extends da9 {

    /* renamed from: a */
    public final String f34172a;

    /* renamed from: b */
    public final boolean f34173b;

    /* renamed from: c */
    public final int f34174c;

    public /* synthetic */ t99(String str, boolean z, int i, q99 q99) {
        this.f34172a = str;
        this.f34173b = z;
        this.f34174c = i;
    }

    /* renamed from: a */
    public final int mo41871a() {
        return this.f34174c;
    }

    /* renamed from: b */
    public final String mo41872b() {
        return this.f34172a;
    }

    /* renamed from: c */
    public final boolean mo41873c() {
        return this.f34173b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof da9) {
            da9 da9 = (da9) obj;
            if (this.f34172a.equals(da9.mo41872b()) && this.f34173b == da9.mo41873c() && this.f34174c == da9.mo41871a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f34172a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f34173b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f34174c;
    }

    public final String toString() {
        String str = this.f34172a;
        boolean z = this.f34173b;
        int i = this.f34174c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }
}
