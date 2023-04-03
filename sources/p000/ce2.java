package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: ce2 */
/* compiled from: functionTypes.kt */
public final class ce2 {
    /* renamed from: a */
    public static final int m56395a(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        C9460vl x = xc3.getAnnotations().mo51226x(C7395c.C7396a.f39126D);
        if (x == null) {
            return 0;
        }
        fq0 fq0 = (fq0) C6177b.m47362j(x.mo53264f(), C7395c.f39104i);
        vx2.m53589e(fq0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((ax2) fq0).mo51739b()).intValue();
    }

    /* renamed from: b */
    public static final d36 m56396b(C7389b bVar, C6983dm dmVar, xc3 xc3, List<? extends xc3> list, List<? extends xc3> list2, List<r24> list3, xc3 xc32, boolean z) {
        int i;
        vx2.m53591g(bVar, "builtIns");
        vx2.m53591g(dmVar, "annotations");
        vx2.m53591g(list, "contextReceiverTypes");
        vx2.m53591g(list2, "parameterTypes");
        vx2.m53591g(xc32, "returnType");
        List<f17> g = m56401g(xc3, list, list2, list3, xc32, bVar);
        int size = list2.size() + list.size();
        if (xc3 == null) {
            i = 0;
        } else {
            i = 1;
        }
        if0 f = m56400f(bVar, size + i, z);
        if (xc3 != null) {
            dmVar = m56414t(dmVar, bVar);
        }
        if (!list.isEmpty()) {
            dmVar = m56413s(dmVar, bVar, list.size());
        }
        return KotlinTypeFactory.m62851g(sz6.m72128b(dmVar), f, g);
    }

    /* renamed from: c */
    public static /* synthetic */ d36 m56397c(C7389b bVar, C6983dm dmVar, xc3 xc3, List list, List list2, List list3, xc3 xc32, boolean z, int i, Object obj) {
        boolean z2;
        if ((i & 128) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return m56396b(bVar, dmVar, xc3, list, list2, list3, xc32, z2);
    }

    /* renamed from: d */
    public static final r24 m56398d(xc3 xc3) {
        lb6 lb6;
        String str;
        vx2.m53591g(xc3, "<this>");
        C9460vl x = xc3.getAnnotations().mo51226x(C7395c.C7396a.f39128E);
        if (x == null) {
            return null;
        }
        Object A0 = CollectionsKt___CollectionsKt.m47301A0(x.mo53264f().values());
        if (A0 instanceof lb6) {
            lb6 = (lb6) A0;
        } else {
            lb6 = null;
        }
        if (!(lb6 == null || (str = (String) lb6.mo51739b()) == null)) {
            if (!r24.m71446l(str)) {
                str = null;
            }
            if (str != null) {
                return r24.m71445h(str);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final List<xc3> m56399e(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        m56409o(xc3);
        int a = m56395a(xc3);
        if (a == 0) {
            return ck0.m33062j();
        }
        List<f17> subList = xc3.mo51132F0().subList(0, a);
        ArrayList arrayList = new ArrayList(dk0.m43495u(subList, 10));
        for (f17 type : subList) {
            xc3 type2 = type.getType();
            vx2.m53590f(type2, "it.type");
            arrayList.add(type2);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final if0 m56400f(C7389b bVar, int i, boolean z) {
        if0 if0;
        vx2.m53591g(bVar, "builtIns");
        if (z) {
            if0 = bVar.mo53163X(i);
        } else {
            if0 = bVar.mo53144C(i);
        }
        vx2.m53590f(if0, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return if0;
    }

    /* renamed from: g */
    public static final List<f17> m56401g(xc3 xc3, List<? extends xc3> list, List<? extends xc3> list2, List<r24> list3, xc3 xc32, C7389b bVar) {
        int i;
        f17 f17;
        r24 r24;
        vx2.m53591g(list, "contextReceiverTypes");
        vx2.m53591g(list2, "parameterTypes");
        vx2.m53591g(xc32, "returnType");
        vx2.m53591g(bVar, "builtIns");
        int size = list2.size() + list.size();
        int i2 = 0;
        if (xc3 != null) {
            i = 1;
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(size + i + 1);
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(list, 10));
        for (xc3 a : list) {
            arrayList2.add(TypeUtilsKt.m62945a(a));
        }
        arrayList.addAll(arrayList2);
        if (xc3 != null) {
            f17 = TypeUtilsKt.m62945a(xc3);
        } else {
            f17 = null;
        }
        ak0.m55531a(arrayList, f17);
        for (T next : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ck0.m33072t();
            }
            xc3 xc33 = (xc3) next;
            if (list3 == null || (r24 = list3.get(i2)) == null || r24.mo65599i()) {
                r24 = null;
            }
            if (r24 != null) {
                u82 u82 = C7395c.C7396a.f39128E;
                r24 h = r24.m71445h(PublicResolver.FUNC_NAME);
                String d = r24.mo65594d();
                vx2.m53590f(d, "name.asString()");
                xc33 = TypeUtilsKt.m62965u(xc33, C6983dm.f37317b.mo51227a(CollectionsKt___CollectionsKt.m47349t0(xc33.getAnnotations(), new BuiltInAnnotationDescriptor(bVar, u82, ao3.m31894f(wy6.m54142a(h, new lb6(d)))))));
            }
            arrayList.add(TypeUtilsKt.m62945a(xc33));
            i2 = i3;
        }
        arrayList.add(TypeUtilsKt.m62945a(xc32));
        return arrayList;
    }

    /* renamed from: h */
    public static final FunctionClassKind m56402h(d31 d31) {
        vx2.m53591g(d31, "<this>");
        if ((d31 instanceof if0) && C7389b.m60114A0(d31)) {
            return m56403i(DescriptorUtilsKt.m62448i(d31));
        }
        return null;
    }

    /* renamed from: i */
    public static final FunctionClassKind m56403i(v82 v82) {
        if (!v82.mo66447f() || v82.mo66445e()) {
            return null;
        }
        FunctionClassKind.C7397a aVar = FunctionClassKind.Companion;
        String d = v82.mo66451i().mo65594d();
        vx2.m53590f(d, "shortName().asString()");
        u82 e = v82.mo66454l().mo66198e();
        vx2.m53590f(e, "toSafe().parent()");
        return aVar.mo53200b(d, e);
    }

    /* renamed from: j */
    public static final xc3 m56404j(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        m56409o(xc3);
        if (!m56412r(xc3)) {
            return null;
        }
        return xc3.mo51132F0().get(m56395a(xc3)).getType();
    }

    /* renamed from: k */
    public static final xc3 m56405k(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        m56409o(xc3);
        xc3 type = ((f17) CollectionsKt___CollectionsKt.m47340k0(xc3.mo51132F0())).getType();
        vx2.m53590f(type, "arguments.last().type");
        return type;
    }

    /* renamed from: l */
    public static final List<f17> m56406l(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        m56409o(xc3);
        List<f17> F0 = xc3.mo51132F0();
        return F0.subList(m56395a(xc3) + (m56407m(xc3) ? 1 : 0), F0.size() - 1);
    }

    /* renamed from: m */
    public static final boolean m56407m(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        if (!m56409o(xc3) || !m56412r(xc3)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m56408n(d31 d31) {
        vx2.m53591g(d31, "<this>");
        FunctionClassKind h = m56402h(d31);
        if (h == FunctionClassKind.Function || h == FunctionClassKind.SuspendFunction) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final boolean m56409o(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d == null || !m56408n(d)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static final boolean m56410p(xc3 xc3) {
        FunctionClassKind functionClassKind;
        vx2.m53591g(xc3, "<this>");
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d != null) {
            functionClassKind = m56402h(d);
        } else {
            functionClassKind = null;
        }
        if (functionClassKind == FunctionClassKind.Function) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static final boolean m56411q(xc3 xc3) {
        FunctionClassKind functionClassKind;
        vx2.m53591g(xc3, "<this>");
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d != null) {
            functionClassKind = m56402h(d);
        } else {
            functionClassKind = null;
        }
        if (functionClassKind == FunctionClassKind.SuspendFunction) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static final boolean m56412r(xc3 xc3) {
        if (xc3.getAnnotations().mo51226x(C7395c.C7396a.f39124C) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static final C6983dm m56413s(C6983dm dmVar, C7389b bVar, int i) {
        vx2.m53591g(dmVar, "<this>");
        vx2.m53591g(bVar, "builtIns");
        u82 u82 = C7395c.C7396a.f39126D;
        if (dmVar.mo51224C0(u82)) {
            return dmVar;
        }
        return C6983dm.f37317b.mo51227a(CollectionsKt___CollectionsKt.m47349t0(dmVar, new BuiltInAnnotationDescriptor(bVar, u82, ao3.m31894f(wy6.m54142a(C7395c.f39104i, new ax2(i))))));
    }

    /* renamed from: t */
    public static final C6983dm m56414t(C6983dm dmVar, C7389b bVar) {
        vx2.m53591g(dmVar, "<this>");
        vx2.m53591g(bVar, "builtIns");
        u82 u82 = C7395c.C7396a.f39124C;
        if (dmVar.mo51224C0(u82)) {
            return dmVar;
        }
        return C6983dm.f37317b.mo51227a(CollectionsKt___CollectionsKt.m47349t0(dmVar, new BuiltInAnnotationDescriptor(bVar, u82, C6177b.m47361i())));
    }
}
