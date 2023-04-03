package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
public final class JvmBuiltInClassDescriptorFactory implements kf0 {

    /* renamed from: d */
    public static final C7400a f39211d = new C7400a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final /* synthetic */ i93<Object>[] f39212e = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: f */
    public static final u82 f39213f = C7395c.f39113r;

    /* renamed from: g */
    public static final r24 f39214g;

    /* renamed from: h */
    public static final nf0 f39215h;

    /* renamed from: a */
    public final mx3 f39216a;

    /* renamed from: b */
    public final rc2<mx3, d31> f39217b;

    /* renamed from: c */
    public final q84 f39218c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$a */
    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class C7400a {
        public C7400a() {
        }

        public /* synthetic */ C7400a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final nf0 mo53211a() {
            return JvmBuiltInClassDescriptorFactory.f39215h;
        }
    }

    static {
        v82 v82 = C7395c.C7396a.f39162d;
        r24 i = v82.mo66451i();
        vx2.m53590f(i, "cloneable.shortName()");
        f39214g = i;
        nf0 m = nf0.m69751m(v82.mo66454l());
        vx2.m53590f(m, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        f39215h = m;
    }

    public JvmBuiltInClassDescriptorFactory(da6 da6, mx3 mx3, rc2<? super mx3, ? extends d31> rc2) {
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(mx3, "moduleDescriptor");
        vx2.m53591g(rc2, "computeContainingDeclaration");
        this.f39216a = mx3;
        this.f39217b = rc2;
        this.f39218c = da6.mo51164i(new JvmBuiltInClassDescriptorFactory$cloneable$2(this, da6));
    }

    /* renamed from: a */
    public if0 mo51602a(nf0 nf0) {
        vx2.m53591g(nf0, "classId");
        if (vx2.m53586b(nf0, f39215h)) {
            return mo53209i();
        }
        return null;
    }

    /* renamed from: b */
    public Collection<if0> mo51603b(u82 u82) {
        vx2.m53591g(u82, "packageFqName");
        if (vx2.m53586b(u82, f39213f)) {
            return my5.m48548d(mo53209i());
        }
        return ny5.m49095e();
    }

    /* renamed from: c */
    public boolean mo51604c(u82 u82, r24 r24) {
        vx2.m53591g(u82, "packageFqName");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        if (!vx2.m53586b(r24, f39214g) || !vx2.m53586b(u82, f39213f)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final lf0 mo53209i() {
        return (lf0) ca6.m56364a(this.f39218c, this, f39212e[0]);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JvmBuiltInClassDescriptorFactory(da6 da6, mx3 mx3, rc2 rc2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(da6, mx3, (i & 4) != 0 ? C73991.INSTANCE : rc2);
    }
}
