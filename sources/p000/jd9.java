package p000;

/* renamed from: jd9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class jd9 extends od9 {

    /* renamed from: a */
    public final String f30476a;

    /* renamed from: b */
    public final boolean f30477b;

    /* renamed from: c */
    public final int f30478c;

    public /* synthetic */ jd9(String str, boolean z, int i, hd9 hd9) {
        this.f30476a = str;
        this.f30477b = z;
        this.f30478c = i;
    }

    /* renamed from: a */
    public final int mo44430a() {
        return this.f30478c;
    }

    /* renamed from: b */
    public final String mo44431b() {
        return this.f30476a;
    }

    /* renamed from: c */
    public final boolean mo44432c() {
        return this.f30477b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof od9) {
            od9 od9 = (od9) obj;
            if (this.f30476a.equals(od9.mo44431b()) && this.f30477b == od9.mo44432c() && this.f30478c == od9.mo44430a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f30476a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f30477b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f30478c;
    }

    public final String toString() {
        String str = this.f30476a;
        boolean z = this.f30477b;
        int i = this.f30478c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }
}
