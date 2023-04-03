package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001ZBO\b\u0002\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0010G\u001a\u00020\n\u0012\u0006\u0010I\u001a\u00020\n\u0012\u0006\u0010J\u001a\u00020\u0013\u0012\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\bU\u0010VB\t\b\u0016¢\u0006\u0004\bU\u0010WB\u0011\b\u0016\u0012\u0006\u0010X\u001a\u00020\n¢\u0006\u0004\bU\u0010YJ\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0014\u0010\u000f\u001a\u00020\u00132\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0017\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0002J.\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010!\u001a\u00020\u0013H\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\b\u0010$\u001a\u00020\u0013H\u0016J\u0018\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010\u001dJ \u0010'\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010%\u001a\u00020\nH\u0016J\u0017\u00100\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\f2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010\u0018J\u0016\u00102\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u001e\u00102\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\b\u00103\u001a\u00020\fH\u0016J\u0017\u00104\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\u001dJ\u0017\u00105\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u00101J\u0016\u00106\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u0016\u00107\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\nH\u0016J)\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010<\"\u0004\b\u0001\u0010;2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00010<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0<H\u0016¢\u0006\u0004\b>\u0010@J\u0013\u0010A\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010B\u001a\u00020\nH\u0016J\b\u0010D\u001a\u00020CH\u0016R\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010J\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010L\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001c\u0010N\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u0014\u0010Q\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006["}, mo44877d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lp6;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "minCapacity", "Lr37;", "q", "k", "n", "r", "", "other", "", "i", "s", "element", "j", "(ILjava/lang/Object;)V", "", "elements", "e", "u", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "w", "retain", "A", "build", "isEmpty", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "", "listIterator", "add", "(Ljava/lang/Object;)Z", "addAll", "clear", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "T", "", "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "", "toString", "array", "[Ljava/lang/Object;", "offset", "I", "length", "isReadOnly", "Z", "backing", "Lkotlin/collections/builders/ListBuilder;", "root", "t", "()Z", "isEffectivelyReadOnly", "getSize", "()I", "size", "<init>", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "()V", "initialCapacity", "(I)V", "a", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ListBuilder.kt */
public final class ListBuilder<E> extends C6341p6<E> implements RandomAccess, Serializable {
    /* access modifiers changed from: private */
    public E[] array;
    private final ListBuilder<E> backing;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    public int length;
    /* access modifiers changed from: private */
    public int offset;
    private final ListBuilder<E> root;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\b\u0016\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0011\u001a\u00020\rH\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, mo44877d2 = {"Lkotlin/collections/builders/ListBuilder$a;", "E", "", "", "hasPrevious", "hasNext", "", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "Lr37;", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lkotlin/collections/builders/ListBuilder;", "a", "Lkotlin/collections/builders/ListBuilder;", "list", "d", "I", "index", "e", "lastIndex", "<init>", "(Lkotlin/collections/builders/ListBuilder;I)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.builders.ListBuilder$a */
    /* compiled from: ListBuilder.kt */
    public static final class C6178a<E> implements ListIterator<E>, a93 {

        /* renamed from: a */
        public final ListBuilder<E> f30969a;

        /* renamed from: d */
        public int f30970d;

        /* renamed from: e */
        public int f30971e = -1;

        public C6178a(ListBuilder<E> listBuilder, int i) {
            vx2.m53591g(listBuilder, "list");
            this.f30969a = listBuilder;
            this.f30970d = i;
        }

        public void add(E e) {
            ListBuilder<E> listBuilder = this.f30969a;
            int i = this.f30970d;
            this.f30970d = i + 1;
            listBuilder.add(i, e);
            this.f30971e = -1;
        }

        public boolean hasNext() {
            if (this.f30970d < this.f30969a.length) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.f30970d > 0) {
                return true;
            }
            return false;
        }

        public E next() {
            if (this.f30970d < this.f30969a.length) {
                int i = this.f30970d;
                this.f30970d = i + 1;
                this.f30971e = i;
                return this.f30969a.array[this.f30969a.offset + this.f30971e];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f30970d;
        }

        public E previous() {
            int i = this.f30970d;
            if (i > 0) {
                int i2 = i - 1;
                this.f30970d = i2;
                this.f30971e = i2;
                return this.f30969a.array[this.f30969a.offset + this.f30971e];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f30970d - 1;
        }

        public void remove() {
            boolean z;
            int i = this.f30971e;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f30969a.remove(i);
                this.f30970d = this.f30971e;
                this.f30971e = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public void set(E e) {
            boolean z;
            int i = this.f30971e;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f30969a.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public ListBuilder(E[] eArr, int i, int i2, boolean z, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.array = eArr;
        this.offset = i;
        this.length = i2;
        this.isReadOnly = z;
        this.backing = listBuilder;
        this.root = listBuilder2;
    }

    private final Object writeReplace() {
        if (mo45044t()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* renamed from: A */
    public final int mo45018A(int i, int i2, Collection<? extends E> collection, boolean z) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            int A = listBuilder.mo45018A(i, i2, collection, z);
            this.length -= A;
            return A;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.array[i5]) == z) {
                E[] eArr = this.array;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.array;
        C6706xq.m54495i(eArr2, eArr2, i + i4, i2 + i, this.length);
        E[] eArr3 = this.array;
        int i7 = this.length;
        wh3.m53891g(eArr3, i7 - i6, i7);
        this.length -= i6;
        return i6;
    }

    public boolean add(E e) {
        mo45032k();
        mo45031j(this.offset + this.length, e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        vx2.m53591g(collection, "elements");
        mo45032k();
        int size = collection.size();
        mo45024e(this.offset + this.length, collection, size);
        return size > 0;
    }

    public final List<E> build() {
        if (this.backing == null) {
            mo45032k();
            this.isReadOnly = true;
            return this;
        }
        throw new IllegalStateException();
    }

    public void clear() {
        mo45032k();
        mo45049w(this.offset, this.length);
    }

    /* renamed from: e */
    public final void mo45024e(int i, Collection<? extends E> collection, int i2) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo45024e(i, collection, i2);
            this.array = this.backing.array;
            this.length += i2;
            return;
        }
        mo45042s(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.array[i + i3] = it.next();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof List) && mo45036n((List) obj))) {
            return true;
        }
        return false;
    }

    public E get(int i) {
        C5946i6.f29820a.mo43484b(i, this.length);
        return this.array[this.offset + i];
    }

    public int getSize() {
        return this.length;
    }

    public int hashCode() {
        return wh3.m53893i(this.array, this.offset, this.length);
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (vx2.m53586b(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        }
        return false;
    }

    public Iterator<E> iterator() {
        return new C6178a(this, 0);
    }

    /* renamed from: j */
    public final void mo45031j(int i, E e) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo45031j(i, e);
            this.array = this.backing.array;
            this.length++;
            return;
        }
        mo45042s(i, 1);
        this.array[i] = e;
    }

    /* renamed from: k */
    public final void mo45032k() {
        if (mo45044t()) {
            throw new UnsupportedOperationException();
        }
    }

    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (vx2.m53586b(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C6178a(this, 0);
    }

    /* renamed from: n */
    public final boolean mo45036n(List<?> list) {
        return wh3.m53892h(this.array, this.offset, this.length, list);
    }

    /* renamed from: q */
    public final void mo45037q(int i) {
        if (this.backing != null) {
            throw new IllegalStateException();
        } else if (i >= 0) {
            E[] eArr = this.array;
            if (i > eArr.length) {
                this.array = wh3.m53889e(this.array, C5808eq.f28642g.mo42378a(eArr.length, i));
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    /* renamed from: r */
    public final void mo45038r(int i) {
        mo45037q(this.length + i);
    }

    public boolean remove(Object obj) {
        mo45032k();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        mo45032k();
        if (mo45018A(this.offset, this.length, collection, false) > 0) {
            return true;
        }
        return false;
    }

    public E removeAt(int i) {
        mo45032k();
        C5946i6.f29820a.mo43484b(i, this.length);
        return mo45048u(this.offset + i);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        mo45032k();
        if (mo45018A(this.offset, this.length, collection, true) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void mo45042s(int i, int i2) {
        mo45038r(i2);
        E[] eArr = this.array;
        C6706xq.m54495i(eArr, eArr, i + i2, i, this.offset + this.length);
        this.length += i2;
    }

    public E set(int i, E e) {
        mo45032k();
        C5946i6.f29820a.mo43484b(i, this.length);
        E[] eArr = this.array;
        int i2 = this.offset;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    public List<E> subList(int i, int i2) {
        ListBuilder<E> listBuilder;
        C5946i6.f29820a.mo43486d(i, i2, this.length);
        E[] eArr = this.array;
        int i3 = this.offset + i;
        int i4 = i2 - i;
        boolean z = this.isReadOnly;
        ListBuilder<E> listBuilder2 = this.root;
        if (listBuilder2 == null) {
            listBuilder = this;
        } else {
            listBuilder = listBuilder2;
        }
        return new ListBuilder(eArr, i3, i4, z, this, listBuilder);
    }

    /* renamed from: t */
    public final boolean mo45044t() {
        ListBuilder<E> listBuilder;
        if (this.isReadOnly || ((listBuilder = this.root) != null && listBuilder.isReadOnly)) {
            return true;
        }
        return false;
    }

    public <T> T[] toArray(T[] tArr) {
        vx2.m53591g(tArr, "destination");
        int length2 = tArr.length;
        int i = this.length;
        if (length2 < i) {
            E[] eArr = this.array;
            int i2 = this.offset;
            T[] copyOfRange = Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            vx2.m53590f(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        E[] eArr2 = this.array;
        int i3 = this.offset;
        C6706xq.m54495i(eArr2, tArr, 0, i3, i + i3);
        int length3 = tArr.length;
        int i4 = this.length;
        if (length3 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    public String toString() {
        return wh3.m53894j(this.array, this.offset, this.length);
    }

    /* renamed from: u */
    public final E mo45048u(int i) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            this.length--;
            return listBuilder.mo45048u(i);
        }
        E[] eArr = this.array;
        E e = eArr[i];
        C6706xq.m54495i(eArr, eArr, i, i + 1, this.offset + this.length);
        wh3.m53890f(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e;
    }

    /* renamed from: w */
    public final void mo45049w(int i, int i2) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo45049w(i, i2);
        } else {
            E[] eArr = this.array;
            C6706xq.m54495i(eArr, eArr, i, i + i2, this.length);
            E[] eArr2 = this.array;
            int i3 = this.length;
            wh3.m53891g(eArr2, i3 - i2, i3);
        }
        this.length -= i2;
    }

    public ListIterator<E> listIterator(int i) {
        C5946i6.f29820a.mo43485c(i, this.length);
        return new C6178a(this, i);
    }

    public void add(int i, E e) {
        mo45032k();
        C5946i6.f29820a.mo43485c(i, this.length);
        mo45031j(this.offset + i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        vx2.m53591g(collection, "elements");
        mo45032k();
        C5946i6.f29820a.mo43485c(i, this.length);
        int size = collection.size();
        mo45024e(this.offset + i, collection, size);
        return size > 0;
    }

    public Object[] toArray() {
        E[] eArr = this.array;
        int i = this.offset;
        return C6706xq.m54501o(eArr, i, this.length + i);
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i) {
        this(wh3.m53888d(i), 0, 0, false, (ListBuilder) null, (ListBuilder) null);
    }
}
