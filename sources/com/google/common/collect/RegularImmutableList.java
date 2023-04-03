package com.google.common.collect;

import java.util.Objects;

class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList<Object> EMPTY = new RegularImmutableList(new Object[0], 0);
    public final transient Object[] array;

    /* renamed from: e */
    public final transient int f24978e;

    public RegularImmutableList(Object[] objArr, int i) {
        this.array = objArr;
        this.f24978e = i;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.array, 0, objArr, i, this.f24978e);
        return i + this.f24978e;
    }

    public E get(int i) {
        du4.m43689i(i, this.f24978e);
        E e = this.array[i];
        Objects.requireNonNull(e);
        return e;
    }

    public Object[] internalArray() {
        return this.array;
    }

    public int internalArrayEnd() {
        return this.f24978e;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f24978e;
    }
}
