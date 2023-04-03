package com.google.protobuf;

import com.google.protobuf.C5011t;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.c */
/* compiled from: AbstractProtobufList */
public abstract class C4955c<E> extends AbstractList<E> implements C5011t.C5020i<E> {

    /* renamed from: a */
    public boolean f25593a = true;

    public boolean add(E e) {
        mo37082e();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo37082e();
        return super.addAll(collection);
    }

    public void clear() {
        mo37082e();
        super.clear();
    }

    /* renamed from: e */
    public void mo37082e() {
        if (!this.f25593a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: p */
    public final void mo37085p() {
        this.f25593a = false;
    }

    public abstract E remove(int i);

    public boolean remove(Object obj) {
        mo37082e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        mo37082e();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo37082e();
        return super.retainAll(collection);
    }

    /* renamed from: v */
    public boolean mo37090v() {
        return this.f25593a;
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo37082e();
        return super.addAll(i, collection);
    }
}
