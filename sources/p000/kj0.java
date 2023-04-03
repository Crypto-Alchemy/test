package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: kj0 */
/* compiled from: CollectionUtils */
public class kj0 {

    /* renamed from: a */
    public static final long[] f30887a = new long[0];

    /* renamed from: b */
    public static final lp7 f30888b = new C6156a();

    /* renamed from: kj0$a */
    /* compiled from: CollectionUtils */
    public static class C6156a implements lp7 {
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* renamed from: a */
    public static <TypeT> List<TypeT> m47110a(Collection<TypeT> collection, TypeT typet, mp7<TypeT, TypeT, Boolean> mp7) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection);
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (mp7.apply(arrayList.get(i), typet).booleanValue()) {
                arrayList.set(i, typet);
                z = true;
            }
        }
        if (!z) {
            arrayList.add(typet);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static <TypeT> List<TypeT> m47111b(List<TypeT>... listArr) {
        if (listArr == null || listArr.length == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new CopyOnWriteArrayList(listArr).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            if (m47118i(list)) {
                Iterator it2 = new CopyOnWriteArrayList(list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static <TypeT> List<TypeT> m47112c(List<TypeT> list) {
        if (list == null) {
            return new ArrayList();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList.size());
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: d */
    public static <KeyT, ValueT> Map<KeyT, ValueT> m47113d(Map<KeyT, ValueT> map) {
        if (map == null) {
            return new HashMap();
        }
        Map<KeyT, ValueT> synchronizedMap = Collections.synchronizedMap(map);
        HashMap hashMap = new HashMap();
        hashMap.putAll(synchronizedMap);
        return hashMap;
    }

    /* renamed from: e */
    public static <TypeT> List<TypeT> m47114e(List<TypeT> list) {
        if (m47116g(list)) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: f */
    public static <TypeT> List<TypeT> m47115f(Collection<TypeT> collection, lp7<TypeT, Boolean> lp7) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (TypeT next : collection) {
            if (lp7.apply(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static <TypeT> boolean m47116g(Collection<TypeT> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static <TypeT> boolean m47117h(TypeT[] typetArr) {
        if (typetArr == null || typetArr.length == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static <TypeT> boolean m47118i(Collection<TypeT> collection) {
        return !m47116g(collection);
    }

    /* renamed from: j */
    public static <TypeT> boolean m47119j(TypeT[] typetArr) {
        return !m47117h(typetArr);
    }

    /* renamed from: k */
    public static <TypeT, ReturnT> List<ReturnT> m47120k(Collection<TypeT> collection, lp7<TypeT, ReturnT> lp7) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (TypeT apply : collection) {
            arrayList.add(lp7.apply(apply));
        }
        return arrayList;
    }

    /* renamed from: l */
    public static <TypeT> List<TypeT> m47121l(List<TypeT> list) {
        return Collections.unmodifiableList(m47114e(list));
    }
}
