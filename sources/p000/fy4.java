package p000;

/* renamed from: fy4 */
/* compiled from: Protocol */
public class fy4 implements uo2 {

    /* renamed from: a */
    public final String f37928a;

    public fy4(String str) {
        if (str != null) {
            this.f37928a = str;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public uo2 mo51817a() {
        return new fy4(mo51819c());
    }

    /* renamed from: b */
    public boolean mo51818b(String str) {
        for (String equals : str.replaceAll(" ", "").split(",")) {
            if (this.f37928a.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String mo51819c() {
        return this.f37928a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f37928a.equals(((fy4) obj).f37928a);
    }

    public int hashCode() {
        return this.f37928a.hashCode();
    }

    public String toString() {
        return mo51819c();
    }
}
