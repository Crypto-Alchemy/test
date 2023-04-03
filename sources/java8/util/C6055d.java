package java8.util;

import java.util.Set;
import java8.util.ImmutableCollections;

/* renamed from: java8.util.d */
/* compiled from: Sets */
public final class C6055d {
    /* renamed from: a */
    public static <E> Set<E> m46308a(E e) {
        return new ImmutableCollections.Set12(e);
    }

    /* renamed from: b */
    public static <E> Set<E> m46309b(E... eArr) {
        int length = eArr.length;
        if (length == 0) {
            return ImmutableCollections.m46193d();
        }
        if (length == 1) {
            return new ImmutableCollections.Set12(eArr[0]);
        }
        if (length != 2) {
            return new ImmutableCollections.SetN(eArr);
        }
        return new ImmutableCollections.Set12(eArr[0], eArr[1]);
    }
}
