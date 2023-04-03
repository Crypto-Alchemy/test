package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;

/* compiled from: ReflectionTypes.kt */
public final class ReflectionTypes {

    /* renamed from: k */
    public static final C7386b f39064k = new C7386b((DefaultConstructorMarker) null);

    /* renamed from: l */
    public static final /* synthetic */ i93<Object>[] f39065l;

    /* renamed from: a */
    public final NotFoundClasses f39066a;

    /* renamed from: b */
    public final ef3 f39067b;

    /* renamed from: c */
    public final C7385a f39068c = new C7385a(1);

    /* renamed from: d */
    public final C7385a f39069d = new C7385a(1);

    /* renamed from: e */
    public final C7385a f39070e = new C7385a(1);

    /* renamed from: f */
    public final C7385a f39071f = new C7385a(2);

    /* renamed from: g */
    public final C7385a f39072g = new C7385a(3);

    /* renamed from: h */
    public final C7385a f39073h = new C7385a(1);

    /* renamed from: i */
    public final C7385a f39074i = new C7385a(2);

    /* renamed from: j */
    public final C7385a f39075j = new C7385a(3);

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$a */
    /* compiled from: ReflectionTypes.kt */
    public static final class C7385a {

        /* renamed from: a */
        public final int f39076a;

        public C7385a(int i) {
            this.f39076a = i;
        }

        /* renamed from: a */
        public final if0 mo53136a(ReflectionTypes reflectionTypes, i93<?> i93) {
            vx2.m53591g(reflectionTypes, "types");
            vx2.m53591g(i93, "property");
            return reflectionTypes.mo53133b(hb0.m58513a(i93.getName()), this.f39076a);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$b */
    /* compiled from: ReflectionTypes.kt */
    public static final class C7386b {
        public C7386b() {
        }

        public /* synthetic */ C7386b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final xc3 mo53137a(mx3 mx3) {
            vx2.m53591g(mx3, "module");
            if0 a = FindClassInModuleKt.m60278a(mx3, C7395c.C7396a.f39193s0);
            if (a == null) {
                return null;
            }
            rz6 h = rz6.f44504d.mo65783h();
            List<a17> parameters = a.mo50046g().getParameters();
            vx2.m53590f(parameters, "kPropertyClass.typeConstructor.parameters");
            Object z0 = CollectionsKt___CollectionsKt.m47355z0(parameters);
            vx2.m53590f(z0, "kPropertyClass.typeConstructor.parameters.single()");
            return KotlinTypeFactory.m62851g(h, a, bk0.m32598e(new StarProjectionImpl((a17) z0)));
        }
    }

    static {
        Class<ReflectionTypes> cls = ReflectionTypes.class;
        f39065l = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    }

    public ReflectionTypes(mx3 mx3, NotFoundClasses notFoundClasses) {
        vx2.m53591g(mx3, "module");
        vx2.m53591g(notFoundClasses, "notFoundClasses");
        this.f39066a = notFoundClasses;
        this.f39067b = C6169a.m47233b(LazyThreadSafetyMode.PUBLICATION, new ReflectionTypes$kotlinReflectScope$2(mx3));
    }

    /* renamed from: b */
    public final if0 mo53133b(String str, int i) {
        if0 if0;
        r24 h = r24.m71445h(str);
        vx2.m53590f(h, "identifier(className)");
        eg0 e = mo53135d().mo50864e(h, NoLookupLocation.FROM_REFLECTION);
        if (e instanceof if0) {
            if0 = (if0) e;
        } else {
            if0 = null;
        }
        if (if0 == null) {
            return this.f39066a.mo53241d(new nf0(C7395c.f39110o, h), bk0.m32598e(Integer.valueOf(i)));
        }
        return if0;
    }

    /* renamed from: c */
    public final if0 mo53134c() {
        return this.f39068c.mo53136a(this, f39065l[0]);
    }

    /* renamed from: d */
    public final MemberScope mo53135d() {
        return (MemberScope) this.f39067b.getValue();
    }
}
