package p000;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: qz2 */
/* compiled from: Iterables */
public final class qz2 {
    /* renamed from: a */
    public static <T> boolean m50910a(Iterable<T> iterable, ku4<? super T> ku4) {
        return Iterators.m36765b(iterable.iterator(), ku4);
    }

    /* renamed from: b */
    public static <E> Collection<E> m50911b(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return Lists.m36793j(iterable.iterator());
    }

    /* renamed from: c */
    public static <T> T m50912c(Iterable<? extends T> iterable, T t) {
        return Iterators.m36775l(iterable.iterator(), t);
    }

    /* renamed from: d */
    public static <T> T m50913d(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return Iterators.m36774k(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return m50914e(list);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public static <T> T m50914e(List<T> list) {
        return list.get(list.size() - 1);
    }

    @CanIgnoreReturnValue
    /* renamed from: f */
    public static <T> boolean m50915f(Iterable<T> iterable, ku4<? super T> ku4) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return Iterators.m36779p(iterable.iterator(), ku4);
        }
        return m50916g((List) iterable, (ku4) du4.m43691k(ku4));
    }

    /* renamed from: g */
    public static <T> boolean m50916g(List<T> list, ku4<? super T> ku4) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!ku4.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (UnsupportedOperationException unused) {
                        m50917h(list, ku4, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        m50917h(list, ku4, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static <T> void m50917h(List<T> list, ku4<? super T> ku4, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (ku4.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* renamed from: i */
    public static Object[] m50918i(Iterable<?> iterable) {
        return m50911b(iterable).toArray();
    }

    /* renamed from: j */
    public static <T> T[] m50919j(Iterable<? extends T> iterable, T[] tArr) {
        return m50911b(iterable).toArray(tArr);
    }
}
