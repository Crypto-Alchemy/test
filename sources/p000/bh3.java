package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.kg3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0002H\u0002\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0002H\u0002¨\u0006\t"}, mo44877d2 = {"", "Llq6;", "Lkg3$a;", "a", "other", "", "b", "c", "d", "scarlet"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* renamed from: bh3 */
/* compiled from: LifecycleStateUtils.kt */
public final class bh3 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 5, 1})
    /* renamed from: bh3$a */
    /* compiled from: Comparisons.kt */
    public static final class C3895a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(Long.valueOf(((lq6) t).mo45487a()), Long.valueOf(((lq6) t2).mo45487a()));
        }
    }

    /* renamed from: a */
    public static final kg3.C6147a m32525a(List<lq6<kg3.C6147a>> list) {
        boolean z;
        vx2.m53591g(list, "<this>");
        boolean z2 = list instanceof Collection;
        boolean z3 = true;
        if (!z2 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object b = ((lq6) it.next()).mo45488b();
                vx2.m53590f(b, "it.value()");
                if (m32528d((kg3.C6147a) b)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return kg3.C6147a.C6150c.C6151a.f30872a;
        }
        if (!z2 || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object b2 = ((lq6) it2.next()).mo45488b();
                vx2.m53590f(b2, "it.value()");
                if (m32527c((kg3.C6147a) b2)) {
                    break;
                }
            }
        }
        z3 = false;
        if (!z3) {
            return kg3.C6147a.C6149b.f30871a;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            Object b3 = ((lq6) next).mo45488b();
            vx2.m53590f(b3, "it.value()");
            if (m32527c((kg3.C6147a) b3)) {
                arrayList.add(next);
            }
        }
        Object b4 = ((lq6) CollectionsKt___CollectionsKt.m47329Z(CollectionsKt___CollectionsKt.m47304D0(arrayList, new C3895a()))).mo45488b();
        vx2.m53590f(b4, "filter { it.value().isSt…st()\n            .value()");
        return (kg3.C6147a) b4;
    }

    /* renamed from: b */
    public static final boolean m32526b(kg3.C6147a aVar, kg3.C6147a aVar2) {
        vx2.m53591g(aVar, "<this>");
        vx2.m53591g(aVar2, "other");
        if (vx2.m53586b(aVar, aVar2) || (m32527c(aVar) && m32527c(aVar2))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m32527c(kg3.C6147a aVar) {
        return aVar instanceof kg3.C6147a.C6150c;
    }

    /* renamed from: d */
    public static final boolean m32528d(kg3.C6147a aVar) {
        return vx2.m53586b(aVar, kg3.C6147a.C6150c.C6151a.f30872a);
    }
}
