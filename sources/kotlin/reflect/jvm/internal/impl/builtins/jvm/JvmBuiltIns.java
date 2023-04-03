package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;

/* compiled from: JvmBuiltIns.kt */
public final class JvmBuiltIns extends C7389b {

    /* renamed from: k */
    public static final /* synthetic */ i93<Object>[] f39219k = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: h */
    public final Kind f39220h;

    /* renamed from: i */
    public pc2<C7401a> f39221i;

    /* renamed from: j */
    public final q84 f39222j;

    /* compiled from: JvmBuiltIns.kt */
    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a */
    /* compiled from: JvmBuiltIns.kt */
    public static final class C7401a {

        /* renamed from: a */
        public final mx3 f39224a;

        /* renamed from: b */
        public final boolean f39225b;

        public C7401a(mx3 mx3, boolean z) {
            vx2.m53591g(mx3, "ownerModuleDescriptor");
            this.f39224a = mx3;
            this.f39225b = z;
        }

        /* renamed from: a */
        public final mx3 mo53216a() {
            return this.f39224a;
        }

        /* renamed from: b */
        public final boolean mo53217b() {
            return this.f39225b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$b */
    /* compiled from: JvmBuiltIns.kt */
    public /* synthetic */ class C7402b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39226a;

        static {
            int[] iArr = new int[Kind.values().length];
            iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[Kind.FALLBACK.ordinal()] = 3;
            f39226a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(da6 da6, Kind kind) {
        super(da6);
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(kind, "kind");
        this.f39220h = kind;
        this.f39222j = da6.mo51164i(new JvmBuiltIns$customizer$2(this, da6));
        int i = C7402b.f39226a[kind.ordinal()];
        if (i == 2) {
            mo53166f(false);
        } else if (i == 3) {
            mo53166f(true);
        }
    }

    /* renamed from: G0 */
    public List<kf0> mo53182v() {
        Iterable<kf0> v = super.mo53182v();
        vx2.m53590f(v, "super.getClassDescriptorFactories()");
        da6 U = mo53160U();
        vx2.m53590f(U, "storageManager");
        ModuleDescriptorImpl r = mo53178r();
        vx2.m53590f(r, "builtInsModule");
        return CollectionsKt___CollectionsKt.m47349t0(v, new JvmBuiltInClassDescriptorFactory(U, r, (rc2) null, 4, (DefaultConstructorMarker) null));
    }

    /* renamed from: H0 */
    public final JvmBuiltInsCustomizer mo53213H0() {
        return (JvmBuiltInsCustomizer) ca6.m56364a(this.f39222j, this, f39219k[0]);
    }

    /* renamed from: I0 */
    public final void mo53214I0(mx3 mx3, boolean z) {
        vx2.m53591g(mx3, "moduleDescriptor");
        mo53215J0(new JvmBuiltIns$initialize$1(mx3, z));
    }

    /* renamed from: J0 */
    public final void mo53215J0(pc2<C7401a> pc2) {
        vx2.m53591g(pc2, "computation");
        this.f39221i = pc2;
    }

    /* renamed from: M */
    public bp4 mo53155M() {
        return mo53213H0();
    }

    /* renamed from: g */
    public C6818ad mo53167g() {
        return mo53213H0();
    }
}
