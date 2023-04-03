package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\u001a&\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a/\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a*\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000b\u001a*\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000b\u001a;\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a*\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000b\u001a;\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, mo44877d2 = {"T", "", "", "elements", "", "z", "", "A", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "I", "", "Lkotlin/Function1;", "predicate", "D", "H", "predicateResultToRemove", "B", "(Ljava/lang/Iterable;Lrc2;Z)Z", "", "F", "(Ljava/util/List;)Ljava/lang/Object;", "G", "E", "C", "(Ljava/util/List;Lrc2;Z)Z", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/CollectionsKt")
/* renamed from: hk0 */
/* compiled from: MutableCollections.kt */
public class hk0 extends gk0 {
    /* renamed from: A */
    public static final <T> boolean m45266A(Collection<? super T> collection, T[] tArr) {
        vx2.m53591g(collection, "<this>");
        vx2.m53591g(tArr, "elements");
        return collection.addAll(C6706xq.m54490d(tArr));
    }

    /* renamed from: B */
    public static final <T> boolean m45267B(Iterable<? extends T> iterable, rc2<? super T, Boolean> rc2, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (rc2.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: C */
    public static final <T> boolean m45268C(List<T> list, rc2<? super T, Boolean> rc2, boolean z) {
        if (!(list instanceof RandomAccess)) {
            vx2.m53589e(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m45267B(t07.m52023b(list), rc2, z);
        }
        lw2 s = new rw2(0, ck0.m33064l(list)).iterator();
        int i = 0;
        while (s.hasNext()) {
            int nextInt = s.nextInt();
            T t = list.get(nextInt);
            if (rc2.invoke(t).booleanValue() != z) {
                if (i != nextInt) {
                    list.set(i, t);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int l = ck0.m33064l(list);
        if (i > l) {
            return true;
        }
        while (true) {
            list.remove(l);
            if (l == i) {
                return true;
            }
            l--;
        }
    }

    /* renamed from: D */
    public static final <T> boolean m45269D(Iterable<? extends T> iterable, rc2<? super T, Boolean> rc2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(rc2, "predicate");
        return m45267B(iterable, rc2, true);
    }

    /* renamed from: E */
    public static final <T> boolean m45270E(List<T> list, rc2<? super T, Boolean> rc2) {
        vx2.m53591g(list, "<this>");
        vx2.m53591g(rc2, "predicate");
        return m45268C(list, rc2, true);
    }

    /* renamed from: F */
    public static final <T> T m45271F(List<T> list) {
        vx2.m53591g(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: G */
    public static final <T> T m45272G(List<T> list) {
        vx2.m53591g(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(ck0.m33064l(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: H */
    public static final <T> boolean m45273H(Iterable<? extends T> iterable, rc2<? super T, Boolean> rc2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(rc2, "predicate");
        return m45267B(iterable, rc2, false);
    }

    /* renamed from: I */
    public static final <T> boolean m45274I(Collection<? super T> collection, Iterable<? extends T> iterable) {
        vx2.m53591g(collection, "<this>");
        vx2.m53591g(iterable, "elements");
        return t07.m52022a(collection).retainAll(f40.m44189a(iterable, collection));
    }

    /* renamed from: z */
    public static final <T> boolean m45275z(Collection<? super T> collection, Iterable<? extends T> iterable) {
        vx2.m53591g(collection, "<this>");
        vx2.m53591g(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }
}
