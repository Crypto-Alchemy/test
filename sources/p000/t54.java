package p000;

/* renamed from: t54 */
/* compiled from: NetworkState */
public class t54 {

    /* renamed from: a */
    public boolean f17953a;

    /* renamed from: b */
    public boolean f17954b;

    /* renamed from: c */
    public boolean f17955c;

    /* renamed from: d */
    public boolean f17956d;

    public t54(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f17953a = z;
        this.f17954b = z2;
        this.f17955c = z3;
        this.f17956d = z4;
    }

    /* renamed from: a */
    public boolean mo26160a() {
        return this.f17953a;
    }

    /* renamed from: b */
    public boolean mo26161b() {
        return this.f17955c;
    }

    /* renamed from: c */
    public boolean mo26162c() {
        return this.f17956d;
    }

    /* renamed from: d */
    public boolean mo26163d() {
        return this.f17954b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t54)) {
            return false;
        }
        t54 t54 = (t54) obj;
        if (this.f17953a == t54.f17953a && this.f17954b == t54.f17954b && this.f17955c == t54.f17955c && this.f17956d == t54.f17956d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f17953a;
        if (this.f17954b) {
            i += 16;
        }
        if (this.f17955c) {
            i += 256;
        }
        if (this.f17956d) {
            return i + 4096;
        }
        return i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f17953a), Boolean.valueOf(this.f17954b), Boolean.valueOf(this.f17955c), Boolean.valueOf(this.f17956d)});
    }
}
