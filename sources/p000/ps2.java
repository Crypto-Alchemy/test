package p000;

/* renamed from: ps2 */
/* compiled from: ImplicitClassReceiver.kt */
public class ps2 implements j85, cp6 {

    /* renamed from: a */
    public final if0 f44104a;

    /* renamed from: b */
    public final ps2 f44105b;

    /* renamed from: c */
    public final if0 f44106c;

    public ps2(if0 if0, ps2 ps2) {
        vx2.m53591g(if0, "classDescriptor");
        this.f44104a = if0;
        this.f44105b = ps2 == null ? this : ps2;
        this.f44106c = if0;
    }

    /* renamed from: b */
    public d36 getType() {
        d36 n = this.f44104a.mo51464n();
        vx2.m53590f(n, "classDescriptor.defaultType");
        return n;
    }

    public boolean equals(Object obj) {
        ps2 ps2;
        if0 if0 = this.f44104a;
        if0 if02 = null;
        if (obj instanceof ps2) {
            ps2 = (ps2) obj;
        } else {
            ps2 = null;
        }
        if (ps2 != null) {
            if02 = ps2.f44104a;
        }
        return vx2.m53586b(if0, if02);
    }

    public int hashCode() {
        return this.f44104a.hashCode();
    }

    /* renamed from: r */
    public final if0 mo50936r() {
        return this.f44104a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
