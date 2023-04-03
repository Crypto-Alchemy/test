package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* renamed from: ak0 */
/* compiled from: collections.kt */
public final class ak0 {
    /* renamed from: a */
    public static final <T> void m55531a(Collection<T> collection, T t) {
        vx2.m53591g(collection, "<this>");
        if (t != null) {
            collection.add(t);
        }
    }

    /* renamed from: b */
    public static final int m55532b(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    /* renamed from: c */
    public static final <T> List<T> m55533c(ArrayList<T> arrayList) {
        vx2.m53591g(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return ck0.m33062j();
        }
        if (size == 1) {
            return bk0.m32598e(CollectionsKt___CollectionsKt.m47329Z(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* renamed from: d */
    public static final <K> Map<K, Integer> m55534d(Iterable<? extends K> iterable) {
        vx2.m53591g(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object put : iterable) {
            linkedHashMap.put(put, Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public static final <K, V> HashMap<K, V> m55535e(int i) {
        return new HashMap<>(m55532b(i));
    }

    /* renamed from: f */
    public static final <E> HashSet<E> m55536f(int i) {
        return new HashSet<>(m55532b(i));
    }

    /* renamed from: g */
    public static final <E> LinkedHashSet<E> m55537g(int i) {
        return new LinkedHashSet<>(m55532b(i));
    }
}
