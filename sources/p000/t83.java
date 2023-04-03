package p000;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* renamed from: t83 */
/* compiled from: constantValues.kt */
public final class t83 extends fq0<C9332b> {

    /* renamed from: b */
    public static final C9331a f44686b = new C9331a((DefaultConstructorMarker) null);

    /* renamed from: t83$a */
    /* compiled from: constantValues.kt */
    public static final class C9331a {
        public C9331a() {
        }

        public /* synthetic */ C9331a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final fq0<?> mo65991a(xc3 xc3) {
            vx2.m53591g(xc3, "argumentType");
            if (zc3.m74855a(xc3)) {
                return null;
            }
            xc3 xc32 = xc3;
            int i = 0;
            while (C7389b.m60125c0(xc32)) {
                xc32 = ((f17) CollectionsKt___CollectionsKt.m47355z0(xc32.mo51132F0())).getType();
                vx2.m53590f(xc32, "type.arguments.single().type");
                i++;
            }
            eg0 d = xc32.mo51134H0().mo51180d();
            if (d instanceof if0) {
                nf0 g = DescriptorUtilsKt.m62446g(d);
                if (g == null) {
                    return new t83((C9332b) new C9332b.C9333a(xc3));
                }
                return new t83(g, i);
            } else if (!(d instanceof a17)) {
                return null;
            } else {
                nf0 m = nf0.m69751m(C7395c.C7396a.f39158b.mo66454l());
                vx2.m53590f(m, "topLevel(StandardNames.FqNames.any.toSafe())");
                return new t83(m, 0);
            }
        }
    }

    /* renamed from: t83$b */
    /* compiled from: constantValues.kt */
    public static abstract class C9332b {

        /* renamed from: t83$b$a */
        /* compiled from: constantValues.kt */
        public static final class C9333a extends C9332b {

            /* renamed from: a */
            public final xc3 f44687a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9333a(xc3 xc3) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(xc3, "type");
                this.f44687a = xc3;
            }

            /* renamed from: a */
            public final xc3 mo65992a() {
                return this.f44687a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9333a) && vx2.m53586b(this.f44687a, ((C9333a) obj).f44687a);
            }

            public int hashCode() {
                return this.f44687a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f44687a + ')';
            }
        }

        /* renamed from: t83$b$b */
        /* compiled from: constantValues.kt */
        public static final class C9334b extends C9332b {

            /* renamed from: a */
            public final of0 f44688a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9334b(of0 of0) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(of0, "value");
                this.f44688a = of0;
            }

            /* renamed from: a */
            public final int mo65996a() {
                return this.f44688a.mo62898c();
            }

            /* renamed from: b */
            public final nf0 mo65997b() {
                return this.f44688a.mo62899d();
            }

            /* renamed from: c */
            public final of0 mo65998c() {
                return this.f44688a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9334b) && vx2.m53586b(this.f44688a, ((C9334b) obj).f44688a);
            }

            public int hashCode() {
                return this.f44688a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f44688a + ')';
            }
        }

        public C9332b() {
        }

        public /* synthetic */ C9332b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t83(C9332b bVar) {
        super(bVar);
        vx2.m53591g(bVar, "value");
    }

    /* renamed from: a */
    public xc3 mo50070a(mx3 mx3) {
        vx2.m53591g(mx3, "module");
        rz6 h = rz6.f44504d.mo65783h();
        if0 E = mx3.mo51535k().mo53147E();
        vx2.m53590f(E, "module.builtIns.kClass");
        return KotlinTypeFactory.m62851g(h, E, bk0.m32598e(new h17(mo65990c(mx3))));
    }

    /* renamed from: c */
    public final xc3 mo65990c(mx3 mx3) {
        vx2.m53591g(mx3, "module");
        C9332b bVar = (C9332b) mo51739b();
        if (bVar instanceof C9332b.C9333a) {
            return ((C9332b.C9333a) mo51739b()).mo65992a();
        }
        if (bVar instanceof C9332b.C9334b) {
            of0 c = ((C9332b.C9334b) mo51739b()).mo65998c();
            nf0 a = c.mo62896a();
            int b = c.mo62897b();
            if0 a2 = FindClassInModuleKt.m60278a(mx3, a);
            if (a2 == null) {
                ErrorTypeKind errorTypeKind = ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String nf0 = a.toString();
                vx2.m53590f(nf0, "classId.toString()");
                return nr1.m70033d(errorTypeKind, nf0, String.valueOf(b));
            }
            d36 n = a2.mo51464n();
            vx2.m53590f(n, "descriptor.defaultType");
            xc3 w = TypeUtilsKt.m62967w(n);
            for (int i = 0; i < b; i++) {
                w = mx3.mo51535k().mo53172l(Variance.INVARIANT, w);
                vx2.m53590f(w, "module.builtIns.getArray…Variance.INVARIANT, type)");
            }
            return w;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t83(of0 of0) {
        this((C9332b) new C9332b.C9334b(of0));
        vx2.m53591g(of0, "value");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t83(nf0 nf0, int i) {
        this(new of0(nf0, i));
        vx2.m53591g(nf0, "classId");
    }
}
