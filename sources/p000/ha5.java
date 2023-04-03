package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: ha5 */
/* compiled from: ReflectJavaPackage.kt */
public final class ha5 extends aa5 implements s13 {

    /* renamed from: a */
    public final u82 f38186a;

    public ha5(u82 u82) {
        vx2.m53591g(u82, "fqName");
        this.f38186a = u82;
    }

    /* renamed from: D */
    public boolean mo51412D() {
        return false;
    }

    /* renamed from: P */
    public List<h03> getAnnotations() {
        return ck0.m33062j();
    }

    /* renamed from: e */
    public u82 mo52164e() {
        return this.f38186a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ha5) || !vx2.m53586b(mo52164e(), ((ha5) obj).mo52164e())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo52164e().hashCode();
    }

    /* renamed from: r */
    public Collection<p03> mo52167r(rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(rc2, "nameFilter");
        return ck0.m33062j();
    }

    public String toString() {
        return ha5.class.getName() + ": " + mo52164e();
    }

    /* renamed from: u */
    public Collection<s13> mo52169u() {
        return ck0.m33062j();
    }

    /* renamed from: x */
    public h03 mo51429x(u82 u82) {
        vx2.m53591g(u82, "fqName");
        return null;
    }
}
