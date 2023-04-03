package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u0000 \u001a*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u001a\u001b\u001c\u001dB\t\b\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0016¨\u0006\u001e"}, mo44877d2 = {"Li6;", "E", "Lkotlin/collections/AbstractCollection;", "", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "", "equals", "hashCode", "<init>", "()V", "a", "b", "c", "d", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: i6 */
/* compiled from: AbstractList.kt */
public abstract class C5946i6<E> extends AbstractCollection<E> implements List<E> {

    /* renamed from: a */
    public static final C5947a f29820a = new C5947a((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00142\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00102\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo44877d2 = {"Li6$a;", "", "", "index", "size", "Lr37;", "b", "(II)V", "c", "fromIndex", "toIndex", "d", "(III)V", "startIndex", "endIndex", "a", "", "f", "(Ljava/util/Collection;)I", "other", "", "e", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: i6$a */
    /* compiled from: AbstractList.kt */
    public static final class C5947a {
        public C5947a() {
        }

        public /* synthetic */ C5947a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo43483a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
            }
        }

        /* renamed from: b */
        public final void mo43484b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void mo43485c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: d */
        public final void mo43486d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: e */
        public final boolean mo43487e(Collection<?> collection, Collection<?> collection2) {
            vx2.m53591g(collection, "c");
            vx2.m53591g(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object b : collection) {
                if (!vx2.m53586b(b, it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final int mo43488f(Collection<?> collection) {
            int i;
            vx2.m53591g(collection, "c");
            int i2 = 1;
            for (Object next : collection) {
                int i3 = i2 * 31;
                if (next != null) {
                    i = next.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
            return i2;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\f\u001a\u00020\u00068\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Li6$b;", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "a", "I", "()I", "b", "(I)V", "index", "<init>", "(Li6;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: i6$b */
    /* compiled from: AbstractList.kt */
    public class C5948b implements Iterator<E>, a93 {

        /* renamed from: a */
        public int f29821a;

        public C5948b() {
        }

        /* renamed from: a */
        public final int mo43489a() {
            return this.f29821a;
        }

        /* renamed from: b */
        public final void mo43490b(int i) {
            this.f29821a = i;
        }

        public boolean hasNext() {
            if (this.f29821a < C5946i6.this.size()) {
                return true;
            }
            return false;
        }

        public E next() {
            if (hasNext()) {
                C5946i6<E> i6Var = C5946i6.this;
                int i = this.f29821a;
                this.f29821a = i + 1;
                return i6Var.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, mo44877d2 = {"Li6$c;", "Li6$b;", "Li6;", "", "", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "index", "<init>", "(Li6;I)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: i6$c */
    /* compiled from: AbstractList.kt */
    public class C5949c extends C5946i6<E>.C1599b implements ListIterator<E> {
        public C5949c(int i) {
            super();
            C5946i6.f29820a.mo43485c(i, C5946i6.this.size());
            mo43490b(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            if (mo43489a() > 0) {
                return true;
            }
            return false;
        }

        public int nextIndex() {
            return mo43489a();
        }

        public E previous() {
            if (hasPrevious()) {
                C5946i6<E> i6Var = C5946i6.this;
                mo43490b(mo43489a() - 1);
                return i6Var.get(mo43489a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo43489a() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004B%\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0011¨\u0006\u0016"}, mo44877d2 = {"Li6$d;", "E", "Li6;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "get", "(I)Ljava/lang/Object;", "d", "Li6;", "list", "e", "I", "fromIndex", "g", "_size", "()I", "size", "toIndex", "<init>", "(Li6;II)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: i6$d */
    /* compiled from: AbstractList.kt */
    public static final class C5950d<E> extends C5946i6<E> implements RandomAccess {

        /* renamed from: d */
        public final C5946i6<E> f29824d;

        /* renamed from: e */
        public final int f29825e;

        /* renamed from: g */
        public int f29826g;

        public C5950d(C5946i6<? extends E> i6Var, int i, int i2) {
            vx2.m53591g(i6Var, "list");
            this.f29824d = i6Var;
            this.f29825e = i;
            C5946i6.f29820a.mo43486d(i, i2, i6Var.size());
            this.f29826g = i2 - i;
        }

        /* renamed from: e */
        public int mo11067e() {
            return this.f29826g;
        }

        public E get(int i) {
            C5946i6.f29820a.mo43484b(i, this.f29826g);
            return this.f29824d.get(this.f29825e + i);
        }
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f29820a.mo43487e(this, (Collection) obj);
    }

    public abstract E get(int i);

    public int hashCode() {
        return f29820a.mo43488f(this);
    }

    public int indexOf(E e) {
        int i = 0;
        for (Object b : this) {
            if (vx2.m53586b(b, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C5948b();
    }

    public int lastIndexOf(E e) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (vx2.m53586b(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C5949c(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C5950d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new C5949c(i);
    }
}
