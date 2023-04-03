package p000;

/* renamed from: mk6 */
/* compiled from: SystemIdInfo */
public class mk6 {

    /* renamed from: a */
    public final String f14997a;

    /* renamed from: b */
    public final int f14998b;

    public mk6(String str, int i) {
        this.f14997a = str;
        this.f14998b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk6)) {
            return false;
        }
        mk6 mk6 = (mk6) obj;
        if (this.f14998b != mk6.f14998b) {
            return false;
        }
        return this.f14997a.equals(mk6.f14997a);
    }

    public int hashCode() {
        return (this.f14997a.hashCode() * 31) + this.f14998b;
    }
}
