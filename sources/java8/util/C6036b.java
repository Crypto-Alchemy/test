package java8.util;

import java.util.List;
import java8.util.ImmutableCollections;

/* renamed from: java8.util.b */
/* compiled from: Lists */
public final class C6036b {
    /* renamed from: a */
    public static <E> List<E> m46205a(E... eArr) {
        int length = eArr.length;
        if (length == 0) {
            return ImmutableCollections.m46191b();
        }
        if (length == 1) {
            return new ImmutableCollections.List12(eArr[0]);
        }
        if (length != 2) {
            return new ImmutableCollections.ListN(eArr);
        }
        return new ImmutableCollections.List12(eArr[0], eArr[1]);
    }
}
