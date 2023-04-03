package p000;

/* renamed from: sc1 */
/* compiled from: Descriptor */
public final class sc1 {

    /* renamed from: a */
    public final String f17608a;

    /* renamed from: b */
    public final String f17609b;

    /* renamed from: c */
    public final String f17610c;

    public sc1(String str, String str2, String str3) {
        this.f17608a = str;
        this.f17609b = str2;
        this.f17610c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sc1.class != obj.getClass()) {
            return false;
        }
        sc1 sc1 = (sc1) obj;
        if (!w67.m29346c(this.f17608a, sc1.f17608a) || !w67.m29346c(this.f17609b, sc1.f17609b) || !w67.m29346c(this.f17610c, sc1.f17610c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f17608a.hashCode() * 31;
        String str = this.f17609b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f17610c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}
