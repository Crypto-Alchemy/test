package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
public class LazyPackageViewDescriptorImpl extends e31 implements tk4 {

    /* renamed from: x */
    public static final /* synthetic */ i93<Object>[] f39293x;

    /* renamed from: e */
    public final ModuleDescriptorImpl f39294e;

    /* renamed from: g */
    public final u82 f39295g;

    /* renamed from: k */
    public final q84 f39296k;

    /* renamed from: r */
    public final q84 f39297r;

    /* renamed from: s */
    public final MemberScope f39298s;

    static {
        Class<LazyPackageViewDescriptorImpl> cls = LazyPackageViewDescriptorImpl.class;
        f39293x = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "fragments", "getFragments()Ljava/util/List;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "empty", "getEmpty()Z"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(ModuleDescriptorImpl moduleDescriptorImpl, u82 u82, da6 da6) {
        super(C6983dm.f37317b.mo51228b(), u82.mo66202h());
        vx2.m53591g(moduleDescriptorImpl, "module");
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(da6, "storageManager");
        this.f39294e = moduleDescriptorImpl;
        this.f39295g = u82;
        this.f39296k = da6.mo51164i(new LazyPackageViewDescriptorImpl$fragments$2(this));
        this.f39297r = da6.mo51164i(new LazyPackageViewDescriptorImpl$empty$2(this));
        this.f39298s = new LazyScopeAdapter(da6, new LazyPackageViewDescriptorImpl$memberScope$1(this));
    }

    /* renamed from: A0 */
    public final boolean mo53280A0() {
        return ((Boolean) ca6.m56364a(this.f39297r, this, f39293x[1])).booleanValue();
    }

    /* renamed from: E0 */
    public ModuleDescriptorImpl getModule() {
        return this.f39294e;
    }

    /* renamed from: c0 */
    public List<fk4> mo53282c0() {
        return (List) ca6.m56364a(this.f39296k, this, f39293x[0]);
    }

    /* renamed from: e */
    public u82 mo53283e() {
        return this.f39295g;
    }

    public boolean equals(Object obj) {
        tk4 tk4;
        if (obj instanceof tk4) {
            tk4 = (tk4) obj;
        } else {
            tk4 = null;
        }
        if (tk4 != null && vx2.m53586b(mo53283e(), tk4.mo53283e()) && vx2.m53586b(getModule(), tk4.getModule())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (getModule().hashCode() * 31) + mo53283e().hashCode();
    }

    public boolean isEmpty() {
        return mo53280A0();
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        vx2.m53591g(h31, "visitor");
        return h31.mo52108f(this, d);
    }

    /* renamed from: m */
    public MemberScope mo53288m() {
        return this.f39298s;
    }

    /* renamed from: y0 */
    public tk4 mo51119b() {
        if (mo53283e().mo66197d()) {
            return null;
        }
        ModuleDescriptorImpl E0 = getModule();
        u82 e = mo53283e().mo66198e();
        vx2.m53590f(e, "fqName.parent()");
        return E0.mo51532N(e);
    }
}
