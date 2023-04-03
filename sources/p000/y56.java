package p000;

import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: y56 */
/* compiled from: SortedIterables */
public final class y56 {
    /* renamed from: a */
    public static <E> Comparator<? super E> m54625a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            return Ordering.natural();
        }
        return comparator;
    }

    /* renamed from: b */
    public static boolean m54626b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        du4.m43691k(comparator);
        du4.m43691k(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m54625a((SortedSet) iterable);
        } else if (!(iterable instanceof x56)) {
            return false;
        } else {
            comparator2 = ((x56) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
