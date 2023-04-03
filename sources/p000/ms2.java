package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: ms2 */
/* compiled from: ImmutableList */
public final class ms2<E> implements List<E>, RandomAccess {

    /* renamed from: a */
    public final List<E> f31768a;

    public ms2(List<E> list) {
        this.f31768a = Collections.unmodifiableList(list);
    }

    /* renamed from: e */
    public static <E> ms2<E> m48439e(List<E> list) {
        return new ms2<>(list);
    }

    /* renamed from: j */
    public static <E> ms2<E> m48440j(E... eArr) {
        return new ms2<>(Arrays.asList(eArr));
    }

    public boolean add(E e) {
        return this.f31768a.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return this.f31768a.addAll(collection);
    }

    public void clear() {
        this.f31768a.clear();
    }

    public boolean contains(Object obj) {
        return this.f31768a.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f31768a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this.f31768a.equals(obj);
    }

    public E get(int i) {
        return this.f31768a.get(i);
    }

    public int hashCode() {
        return this.f31768a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f31768a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f31768a.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f31768a.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f31768a.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return this.f31768a.listIterator();
    }

    public boolean remove(Object obj) {
        return this.f31768a.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.f31768a.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.f31768a.retainAll(collection);
    }

    public E set(int i, E e) {
        return this.f31768a.set(i, e);
    }

    public int size() {
        return this.f31768a.size();
    }

    public List<E> subList(int i, int i2) {
        return this.f31768a.subList(i, i2);
    }

    public Object[] toArray() {
        return this.f31768a.toArray();
    }

    public void add(int i, E e) {
        this.f31768a.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.f31768a.addAll(i, collection);
    }

    public ListIterator<E> listIterator(int i) {
        return this.f31768a.listIterator(i);
    }

    public E remove(int i) {
        return this.f31768a.remove(i);
    }

    public <T> T[] toArray(T[] tArr) {
        return this.f31768a.toArray(tArr);
    }
}
