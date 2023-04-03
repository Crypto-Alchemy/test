package com.google.common.collect;

final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final RegularImmutableSet<Object> EMPTY;

    /* renamed from: r */
    public static final Object[] f24992r;

    /* renamed from: e */
    public final transient int f24993e;
    public final transient Object[] elements;

    /* renamed from: g */
    public final transient int f24994g;

    /* renamed from: k */
    public final transient int f24995k;
    public final transient Object[] table;

    static {
        Object[] objArr = new Object[0];
        f24992r = objArr;
        EMPTY = new RegularImmutableSet(objArr, 0, objArr, 0, 0);
    }

    public RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.elements = objArr;
        this.f24993e = i;
        this.table = objArr2;
        this.f24994g = i2;
        this.f24995k = i3;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.table;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c = ml2.m48362c(obj);
        while (true) {
            int i = c & this.f24994g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c = i + 1;
        }
    }

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.elements, 0, objArr, i, this.f24995k);
        return i + this.f24995k;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(this.elements, this.f24995k);
    }

    public int hashCode() {
        return this.f24993e;
    }

    public Object[] internalArray() {
        return this.elements;
    }

    public int internalArrayEnd() {
        return this.f24995k;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f24995k;
    }

    public c47<E> iterator() {
        return asList().iterator();
    }
}
