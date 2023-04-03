package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;

/* compiled from: LazyJavaPackageFragment.kt */
public final class LazyJavaPackageFragment extends gk4 {

    /* renamed from: I */
    public static final /* synthetic */ i93<Object>[] f39510I;

    /* renamed from: A */
    public final JvmPackageScope f39511A;

    /* renamed from: B */
    public final q84<List<u82>> f39512B;

    /* renamed from: C */
    public final C6983dm f39513C;

    /* renamed from: H */
    public final q84 f39514H;

    /* renamed from: s */
    public final s13 f39515s;

    /* renamed from: x */
    public final pf3 f39516x;

    /* renamed from: y */
    public final q84 f39517y;

    static {
        Class<LazyJavaPackageFragment> cls = LazyJavaPackageFragment.class;
        f39510I = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(pf3 pf3, s13 s13) {
        super(pf3.mo65299d(), s13.mo52164e());
        C6983dm dmVar;
        vx2.m53591g(pf3, "outerContext");
        vx2.m53591g(s13, "jPackage");
        this.f39515s = s13;
        pf3 d = ContextKt.m60736d(pf3, this, (i23) null, 0, 6, (Object) null);
        this.f39516x = d;
        this.f39517y = d.mo65300e().mo51164i(new LazyJavaPackageFragment$binaryClasses$2(this));
        this.f39511A = new JvmPackageScope(d, s13, this);
        this.f39512B = d.mo65300e().mo51161f(new LazyJavaPackageFragment$subPackages$1(this), ck0.m33062j());
        if (d.mo65296a().mo67006i().mo53439b()) {
            dmVar = C6983dm.f37317b.mo51228b();
        } else {
            dmVar = of3.m70255a(d, s13);
        }
        this.f39513C = dmVar;
        this.f39514H = d.mo65300e().mo51164i(new LazyJavaPackageFragment$partToFacade$2(this));
    }

    /* renamed from: F0 */
    public final if0 mo53590F0(p03 p03) {
        vx2.m53591g(p03, "jClass");
        return this.f39511A.mo53501j().mo53595O(p03);
    }

    /* renamed from: G0 */
    public final Map<String, tc3> mo53591G0() {
        return (Map) ca6.m56364a(this.f39517y, this, f39510I[0]);
    }

    /* renamed from: H0 */
    public JvmPackageScope mo51712m() {
        return this.f39511A;
    }

    /* renamed from: I0 */
    public final List<u82> mo53593I0() {
        return (List) this.f39512B.invoke();
    }

    public C6983dm getAnnotations() {
        return this.f39513C;
    }

    public a66 getSource() {
        return new uc3(this);
    }

    public String toString() {
        return "Lazy Java package fragment: " + mo51711e() + " of module " + this.f39516x.mo65296a().mo67010m();
    }
}
