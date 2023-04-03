package com.google.common.collect;

final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    public final transient E element;

    public SingletonImmutableSet(E e) {
        this.element = du4.m43691k(e);
    }

    public ImmutableList<E> asList() {
        return ImmutableList.m36628of(this.element);
    }

    public boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    public int copyIntoArray(Object[] objArr, int i) {
        objArr[i] = this.element;
        return i + 1;
    }

    public final int hashCode() {
        return this.element.hashCode();
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.element.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public c47<E> iterator() {
        return Iterators.m36780q(this.element);
    }
}
