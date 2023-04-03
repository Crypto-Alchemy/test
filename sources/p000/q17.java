package p000;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;

/* renamed from: q17 */
/* compiled from: TypeSubstitution.kt */
public final class q17 {
    /* renamed from: a */
    public static final d36 m71165a(xc3 xc3) {
        d36 d36;
        vx2.m53591g(xc3, "<this>");
        w47 K0 = xc3.mo64506K0();
        if (K0 instanceof d36) {
            d36 = (d36) K0;
        } else {
            d36 = null;
        }
        if (d36 != null) {
            return d36;
        }
        throw new IllegalStateException(("This is should be simple type: " + xc3).toString());
    }

    /* renamed from: b */
    public static final xc3 m71166b(xc3 xc3, List<? extends f17> list, C6983dm dmVar) {
        vx2.m53591g(xc3, "<this>");
        vx2.m53591g(list, "newArguments");
        vx2.m53591g(dmVar, "newAnnotations");
        return m71169e(xc3, list, dmVar, (List) null, 4, (Object) null);
    }

    /* renamed from: c */
    public static final xc3 m71167c(xc3 xc3, List<? extends f17> list, C6983dm dmVar, List<? extends f17> list2) {
        vx2.m53591g(xc3, "<this>");
        vx2.m53591g(list, "newArguments");
        vx2.m53591g(dmVar, "newAnnotations");
        vx2.m53591g(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == xc3.mo51132F0()) && dmVar == xc3.getAnnotations()) {
            return xc3;
        }
        rz6 G0 = xc3.mo51133G0();
        if ((dmVar instanceof s12) && dmVar.isEmpty()) {
            dmVar = C6983dm.f37317b.mo51228b();
        }
        rz6 a = sz6.m72127a(G0, dmVar);
        w47 K0 = xc3.mo64506K0();
        if (K0 instanceof i42) {
            i42 i42 = (i42) K0;
            return KotlinTypeFactory.m62849d(m71168d(i42.mo52399P0(), list, a), m71168d(i42.mo52400Q0(), list2, a));
        } else if (K0 instanceof d36) {
            return m71168d((d36) K0, list, a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public static final d36 m71168d(d36 d36, List<? extends f17> list, rz6 rz6) {
        vx2.m53591g(d36, "<this>");
        vx2.m53591g(list, "newArguments");
        vx2.m53591g(rz6, "newAttributes");
        if (list.isEmpty() && rz6 == d36.mo51133G0()) {
            return d36;
        }
        if (list.isEmpty()) {
            return d36.mo51122P0(rz6);
        }
        return KotlinTypeFactory.m62853i(rz6, d36.mo51134H0(), list, d36.mo51135I0(), (bd3) null, 16, (Object) null);
    }

    /* renamed from: e */
    public static /* synthetic */ xc3 m71169e(xc3 xc3, List<f17> list, C6983dm dmVar, List<f17> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = xc3.mo51132F0();
        }
        if ((i & 2) != 0) {
            dmVar = xc3.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return m71167c(xc3, list, dmVar, list2);
    }

    /* renamed from: f */
    public static /* synthetic */ d36 m71170f(d36 d36, List<f17> list, rz6 rz6, int i, Object obj) {
        if ((i & 1) != 0) {
            list = d36.mo51132F0();
        }
        if ((i & 2) != 0) {
            rz6 = d36.mo51133G0();
        }
        return m71168d(d36, list, rz6);
    }
}
