package p000;

/* renamed from: gk4 */
/* compiled from: PackageFragmentDescriptorImpl.kt */
public abstract class gk4 extends g31 implements fk4 {

    /* renamed from: k */
    public final u82 f38035k;

    /* renamed from: r */
    public final String f38036r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gk4(mx3 mx3, u82 u82) {
        super(mx3, C6983dm.f37317b.mo51228b(), u82.mo66202h(), a66.f36360a);
        vx2.m53591g(mx3, "module");
        vx2.m53591g(u82, "fqName");
        this.f38035k = u82;
        this.f38036r = "package " + u82 + " of " + mx3;
    }

    /* renamed from: e */
    public final u82 mo51711e() {
        return this.f38035k;
    }

    public a66 getSource() {
        a66 a66 = a66.f36360a;
        vx2.m53590f(a66, "NO_SOURCE");
        return a66;
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        vx2.m53591g(h31, "visitor");
        return h31.mo52109g(this, d);
    }

    public String toString() {
        return this.f38036r;
    }

    /* renamed from: b */
    public mx3 m58138b() {
        d31 b = super.mo51119b();
        vx2.m53589e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (mx3) b;
    }
}
