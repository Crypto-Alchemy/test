package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
public final class LazyJavaAnnotationDescriptor implements C9460vl, ot4 {

    /* renamed from: i */
    public static final /* synthetic */ i93<Object>[] f39472i;

    /* renamed from: a */
    public final pf3 f39473a;

    /* renamed from: b */
    public final h03 f39474b;

    /* renamed from: c */
    public final gc4 f39475c;

    /* renamed from: d */
    public final q84 f39476d;

    /* renamed from: e */
    public final a23 f39477e;

    /* renamed from: f */
    public final q84 f39478f;

    /* renamed from: g */
    public final boolean f39479g;

    /* renamed from: h */
    public final boolean f39480h;

    static {
        Class<LazyJavaAnnotationDescriptor> cls = LazyJavaAnnotationDescriptor.class;
        f39472i = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public LazyJavaAnnotationDescriptor(pf3 pf3, h03 h03, boolean z) {
        vx2.m53591g(pf3, "c");
        vx2.m53591g(h03, "javaAnnotation");
        this.f39473a = pf3;
        this.f39474b = h03;
        this.f39475c = pf3.mo65300e().mo51162g(new LazyJavaAnnotationDescriptor$fqName$2(this));
        this.f39476d = pf3.mo65300e().mo51164i(new LazyJavaAnnotationDescriptor$type$2(this));
        this.f39477e = pf3.mo65296a().mo67017t().mo50460a(h03);
        this.f39478f = pf3.mo65300e().mo51164i(new LazyJavaAnnotationDescriptor$allValueArguments$2(this));
        this.f39479g = h03.mo52090j();
        this.f39480h = h03.mo52087F() || z;
    }

    /* renamed from: e */
    public u82 mo53263e() {
        return (u82) ca6.m56365b(this.f39475c, this, f39472i[0]);
    }

    /* renamed from: f */
    public Map<r24, fq0<?>> mo53264f() {
        return (Map) ca6.m56364a(this.f39478f, this, f39472i[2]);
    }

    /* renamed from: g */
    public final if0 mo53505g(u82 u82) {
        mx3 d = this.f39473a.mo65299d();
        nf0 m = nf0.m69751m(u82);
        vx2.m53590f(m, "topLevel(fqName)");
        return FindClassInModuleKt.m60280c(d, m, this.f39473a.mo65296a().mo66999b().mo53798d().mo52450q());
    }

    /* renamed from: h */
    public a23 getSource() {
        return this.f39477e;
    }

    /* renamed from: i */
    public d36 getType() {
        return (d36) ca6.m56364a(this.f39476d, this, f39472i[1]);
    }

    /* renamed from: j */
    public boolean mo53479j() {
        return this.f39479g;
    }

    /* renamed from: k */
    public final boolean mo53508k() {
        return this.f39480h;
    }

    /* renamed from: l */
    public final fq0<?> mo53509l(i03 i03) {
        if (i03 instanceof j13) {
            return ConstantValueFactory.f40088a.mo55066c(((j13) i03).getValue());
        }
        if (i03 instanceof e13) {
            e13 e13 = (e13) i03;
            return mo53512o(e13.mo50548d(), e13.mo50549e());
        } else if (i03 instanceof m03) {
            m03 m03 = (m03) i03;
            r24 name = m03.getName();
            if (name == null) {
                name = t73.f44655c;
            }
            vx2.m53590f(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            return mo53511n(name, m03.mo56000c());
        } else if (i03 instanceof j03) {
            return mo53510m(((j03) i03).mo52571a());
        } else {
            if (i03 instanceof u03) {
                return mo53513p(((u03) i03).mo66156b());
            }
            return null;
        }
    }

    /* renamed from: m */
    public final fq0<?> mo53510m(h03 h03) {
        return new C6948cm(new LazyJavaAnnotationDescriptor(this.f39473a, h03, false, 4, (DefaultConstructorMarker) null));
    }

    /* renamed from: n */
    public final fq0<?> mo53511n(r24 r24, List<? extends i03> list) {
        xc3 xc3;
        d36 i = getType();
        vx2.m53590f(i, "type");
        if (zc3.m74855a(i)) {
            return null;
        }
        if0 e = DescriptorUtilsKt.m62444e(this);
        vx2.m53588d(e);
        n87 b = ad1.m55454b(r24, e);
        if (b == null || (xc3 = b.getType()) == null) {
            xc3 = this.f39473a.mo65296a().mo67010m().mo51535k().mo53172l(Variance.INVARIANT, nr1.m70033d(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        vx2.m53590f(xc3, "DescriptorResolverUtils.…GUMENT)\n                )");
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (i03 l : list) {
            Object l2 = mo53509l(l);
            if (l2 == null) {
                l2 = new zb4();
            }
            arrayList.add(l2);
        }
        return ConstantValueFactory.f40088a.mo55064a(arrayList, xc3);
    }

    /* renamed from: o */
    public final fq0<?> mo53512o(nf0 nf0, r24 r24) {
        if (nf0 == null || r24 == null) {
            return null;
        }
        return new zq1(nf0, r24);
    }

    /* renamed from: p */
    public final fq0<?> mo53513p(e23 e23) {
        return t83.f44686b.mo65991a(this.f39473a.mo65302g().mo53660o(e23, l23.m63664d(TypeUsage.COMMON, false, (a17) null, 3, (Object) null)));
    }

    public String toString() {
        return DescriptorRenderer.m62073s(DescriptorRenderer.f39992g, this, (AnnotationUseSiteTarget) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyJavaAnnotationDescriptor(pf3 pf3, h03 h03, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pf3, h03, (i & 4) != 0 ? false : z);
    }
}
