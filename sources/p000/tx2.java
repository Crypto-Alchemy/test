package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* renamed from: tx2 */
/* compiled from: IntersectionType.kt */
public final class tx2 {
    /* renamed from: a */
    public static final w47 m72478a(List<? extends w47> list) {
        d36 d36;
        vx2.m53591g(list, "types");
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        } else if (size == 1) {
            return (w47) CollectionsKt___CollectionsKt.m47355z0(list);
        } else {
            ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
            boolean z = false;
            boolean z2 = false;
            for (w47 w47 : list) {
                if (z || zc3.m74855a(w47)) {
                    z = true;
                } else {
                    z = false;
                }
                if (w47 instanceof d36) {
                    d36 = (d36) w47;
                } else if (!(w47 instanceof i42)) {
                    throw new NoWhenBranchMatchedException();
                } else if (ql1.m71288a(w47)) {
                    return w47;
                } else {
                    d36 = ((i42) w47).mo52399P0();
                    z2 = true;
                }
                arrayList.add(d36);
            }
            if (z) {
                return nr1.m70033d(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, list.toString());
            } else if (!z2) {
                return TypeIntersector.f40298a.mo55360c(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(dk0.m43495u(list, 10));
                for (w47 d : list) {
                    arrayList2.add(n42.m64518d(d));
                }
                TypeIntersector typeIntersector = TypeIntersector.f40298a;
                return KotlinTypeFactory.m62849d(typeIntersector.mo55360c(arrayList), typeIntersector.mo55360c(arrayList2));
            }
        }
    }
}
