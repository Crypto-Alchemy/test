package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.collect.d */
/* compiled from: Multiset */
public interface C4623d<E> extends Collection<E> {

    /* renamed from: com.google.common.collect.d$a */
    /* compiled from: Multiset */
    public interface C4624a<E> {
        int getCount();

        E getElement();
    }

    @CanIgnoreReturnValue
    int add(E e, int i);

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    int count(@CompatibleWith("E") Object obj);

    Set<E> elementSet();

    Set<C4624a<E>> entrySet();

    @CanIgnoreReturnValue
    int remove(@CompatibleWith("E") Object obj, int i);

    @CanIgnoreReturnValue
    boolean remove(Object obj);

    @CanIgnoreReturnValue
    int setCount(E e, int i);

    @CanIgnoreReturnValue
    boolean setCount(E e, int i, int i2);

    int size();
}
