package p000;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0005\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u001a.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¨\u0006\n"}, mo44877d2 = {"T", "", "element", "j", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "i", "l", "k", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/SetsKt")
/* renamed from: oy5 */
/* compiled from: _Sets.kt */
public class oy5 extends ny5 {
    /* renamed from: i */
    public static final <T> Set<T> m49609i(Set<? extends T> set, Iterable<? extends T> iterable) {
        vx2.m53591g(set, "<this>");
        vx2.m53591g(iterable, "elements");
        Collection<? extends T> a = f40.m44189a(iterable, set);
        if (a.isEmpty()) {
            return CollectionsKt___CollectionsKt.m47315O0(set);
        }
        if (a instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T next : set) {
                if (!a.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(a);
        return linkedHashSet2;
    }

    /* renamed from: j */
    public static final <T> Set<T> m49610j(Set<? extends T> set, T t) {
        vx2.m53591g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(ao3.m31893e(set.size()));
        boolean z = false;
        for (T next : set) {
            boolean z2 = true;
            if (!z && vx2.m53586b(next, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: k */
    public static final <T> Set<T> m49611k(Set<? extends T> set, Iterable<? extends T> iterable) {
        int i;
        vx2.m53591g(set, "<this>");
        vx2.m53591g(iterable, "elements");
        Integer v = dk0.m43496v(iterable);
        if (v != null) {
            i = set.size() + v.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(ao3.m31893e(i));
        linkedHashSet.addAll(set);
        hk0.m45275z(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* renamed from: l */
    public static final <T> Set<T> m49612l(Set<? extends T> set, T t) {
        vx2.m53591g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(ao3.m31893e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }
}
