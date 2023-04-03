package p000;

/* renamed from: ev */
/* compiled from: AutoValue_LibraryVersion */
public final class C5820ev extends gg3 {

    /* renamed from: a */
    public final String f28686a;

    /* renamed from: b */
    public final String f28687b;

    public C5820ev(String str, String str2) {
        if (str != null) {
            this.f28686a = str;
            if (str2 != null) {
                this.f28687b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    /* renamed from: b */
    public String mo42429b() {
        return this.f28686a;
    }

    /* renamed from: c */
    public String mo42430c() {
        return this.f28687b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gg3)) {
            return false;
        }
        gg3 gg3 = (gg3) obj;
        if (!this.f28686a.equals(gg3.mo42429b()) || !this.f28687b.equals(gg3.mo42430c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f28686a.hashCode() ^ 1000003) * 1000003) ^ this.f28687b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f28686a + ", version=" + this.f28687b + "}";
    }
}
