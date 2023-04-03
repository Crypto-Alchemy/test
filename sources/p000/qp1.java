package p000;

/* renamed from: qp1 */
/* compiled from: Encoding */
public final class qp1 {

    /* renamed from: a */
    public final String f33210a;

    public qp1(String str) {
        if (str != null) {
            this.f33210a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static qp1 m50725b(String str) {
        return new qp1(str);
    }

    /* renamed from: a */
    public String mo47222a() {
        return this.f33210a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp1)) {
            return false;
        }
        return this.f33210a.equals(((qp1) obj).f33210a);
    }

    public int hashCode() {
        return this.f33210a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f33210a + "\"}";
    }
}
