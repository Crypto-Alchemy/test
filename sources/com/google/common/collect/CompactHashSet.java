package com.google.common.collect;

import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    public static final double HASH_FLOODING_FPP = 0.001d;

    /* renamed from: a */
    public transient Object f24851a;

    /* renamed from: d */
    public transient int[] f24852d;

    /* renamed from: e */
    public transient int f24853e;
    public transient Object[] elements;

    /* renamed from: g */
    public transient int f24854g;

    /* renamed from: com.google.common.collect.CompactHashSet$a */
    public class C4531a implements Iterator<E> {

        /* renamed from: a */
        public int f24855a;

        /* renamed from: d */
        public int f24856d;

        /* renamed from: e */
        public int f24857e = -1;

        public C4531a() {
            this.f24855a = CompactHashSet.this.f24853e;
            this.f24856d = CompactHashSet.this.firstEntryIndex();
        }

        /* renamed from: a */
        public final void mo34630a() {
            if (CompactHashSet.this.f24853e != this.f24855a) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        public void mo34631b() {
            this.f24855a += 32;
        }

        public boolean hasNext() {
            if (this.f24856d >= 0) {
                return true;
            }
            return false;
        }

        public E next() {
            mo34630a();
            if (hasNext()) {
                int i = this.f24856d;
                this.f24857e = i;
                E access$100 = CompactHashSet.this.mo34612j(i);
                this.f24856d = CompactHashSet.this.getSuccessor(this.f24856d);
                return access$100;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            mo34630a();
            if (this.f24857e >= 0) {
                z = true;
            } else {
                z = false;
            }
            ki0.m47102d(z);
            mo34631b();
            CompactHashSet compactHashSet = CompactHashSet.this;
            compactHashSet.remove(compactHashSet.mo34612j(this.f24857e));
            this.f24856d = CompactHashSet.this.adjustAfterRemove(this.f24856d, this.f24857e);
            this.f24857e = -1;
        }
    }

    public CompactHashSet() {
        init(3);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i) {
        return new CompactHashSet<>(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            init(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* renamed from: A */
    public final void mo34595A(int i) {
        this.f24853e = tl0.m52347d(this.f24853e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    @CanIgnoreReturnValue
    public boolean add(E e) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.add(e);
        }
        int[] q = mo34618q();
        Object[] o = mo34617o();
        int i = this.f24854g;
        int i2 = i + 1;
        int c = ml2.m48362c(e);
        int n = mo34615n();
        int i3 = c & n;
        int h = tl0.m52351h(mo34619r(), i3);
        if (h != 0) {
            int b = tl0.m52345b(c, n);
            int i4 = 0;
            while (true) {
                int i5 = h - 1;
                int i6 = q[i5];
                if (tl0.m52345b(i6, n) == b && jf4.m46496a(e, o[i5])) {
                    return false;
                }
                int c2 = tl0.m52346c(i6, n);
                i4++;
                if (c2 != 0) {
                    h = c2;
                } else if (i4 >= 9) {
                    return convertToHashFloodingResistantImplementation().add(e);
                } else {
                    if (i2 > n) {
                        n = mo34624t(n, tl0.m52348e(n), c, i);
                    } else {
                        q[i5] = tl0.m52347d(i6, i2, n);
                    }
                }
            }
        } else if (i2 > n) {
            n = mo34624t(n, tl0.m52348e(n), c, i);
        } else {
            tl0.m52352i(mo34619r(), i3, i2);
        }
        mo34622s(i2);
        insertEntry(i, e, c, n);
        this.f24854g = i2;
        incrementModCount();
        return true;
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    public int allocArrays() {
        du4.m43697q(needsAllocArrays(), "Arrays already allocated");
        int i = this.f24853e;
        int j = tl0.m52353j(i);
        this.f24851a = tl0.m52344a(j);
        mo34595A(j - 1);
        this.f24852d = new int[i];
        this.elements = new Object[i];
        return i;
    }

    public void clear() {
        if (!needsAllocArrays()) {
            incrementModCount();
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.f24853e = Ints.m37047f(size(), 3, 1073741823);
                delegateOrNull.clear();
                this.f24851a = null;
                this.f24854g = 0;
                return;
            }
            Arrays.fill(mo34617o(), 0, this.f24854g, (Object) null);
            tl0.m52350g(mo34619r());
            Arrays.fill(mo34618q(), 0, this.f24854g, 0);
            this.f24854g = 0;
        }
    }

    public boolean contains(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.contains(obj);
        }
        int c = ml2.m48362c(obj);
        int n = mo34615n();
        int h = tl0.m52351h(mo34619r(), c & n);
        if (h == 0) {
            return false;
        }
        int b = tl0.m52345b(c, n);
        do {
            int i = h - 1;
            int k = mo34613k(i);
            if (tl0.m52345b(k, n) == b && jf4.m46496a(obj, mo34612j(i))) {
                return true;
            }
            h = tl0.m52346c(k, n);
        } while (h != 0);
        return false;
    }

    @CanIgnoreReturnValue
    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> e = mo34603e(mo34615n() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            e.add(mo34612j(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.f24851a = e;
        this.f24852d = null;
        this.elements = null;
        incrementModCount();
        return e;
    }

    public Set<E> delegateOrNull() {
        Object obj = this.f24851a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    /* renamed from: e */
    public final Set<E> mo34603e(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.f24854g) {
            return i2;
        }
        return -1;
    }

    public void incrementModCount() {
        this.f24853e += 32;
    }

    public void init(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        du4.m43685e(z, "Expected size must be >= 0");
        this.f24853e = Ints.m37047f(i, 1, 1073741823);
    }

    public void insertEntry(int i, E e, int i2, int i3) {
        mo34629w(i, tl0.m52347d(i2, 0, i3));
        mo34628u(i, e);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isUsingHashFloodingResistance() {
        if (delegateOrNull() != null) {
            return true;
        }
        return false;
    }

    public Iterator<E> iterator() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.iterator();
        }
        return new C4531a();
    }

    /* renamed from: j */
    public final E mo34612j(int i) {
        return mo34617o()[i];
    }

    /* renamed from: k */
    public final int mo34613k(int i) {
        return mo34618q()[i];
    }

    public void moveLastEntry(int i, int i2) {
        Object r = mo34619r();
        int[] q = mo34618q();
        Object[] o = mo34617o();
        int size = size() - 1;
        if (i < size) {
            Object obj = o[size];
            o[i] = obj;
            o[size] = null;
            q[i] = q[size];
            q[size] = 0;
            int c = ml2.m48362c(obj) & i2;
            int h = tl0.m52351h(r, c);
            int i3 = size + 1;
            if (h == i3) {
                tl0.m52352i(r, c, i + 1);
                return;
            }
            while (true) {
                int i4 = h - 1;
                int i5 = q[i4];
                int c2 = tl0.m52346c(i5, i2);
                if (c2 == i3) {
                    q[i4] = tl0.m52347d(i5, i + 1, i2);
                    return;
                }
                h = c2;
            }
        } else {
            o[i] = null;
            q[i] = 0;
        }
    }

    /* renamed from: n */
    public final int mo34615n() {
        return (1 << (this.f24853e & 31)) - 1;
    }

    public boolean needsAllocArrays() {
        if (this.f24851a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final Object[] mo34617o() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: q */
    public final int[] mo34618q() {
        int[] iArr = this.f24852d;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: r */
    public final Object mo34619r() {
        Object obj = this.f24851a;
        Objects.requireNonNull(obj);
        return obj;
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        int n = mo34615n();
        int f = tl0.m52349f(obj, (Object) null, n, mo34619r(), mo34618q(), mo34617o(), (Object[]) null);
        if (f == -1) {
            return false;
        }
        moveLastEntry(f, n);
        this.f24854g--;
        incrementModCount();
        return true;
    }

    public void resizeEntries(int i) {
        this.f24852d = Arrays.copyOf(mo34618q(), i);
        this.elements = Arrays.copyOf(mo34617o(), i);
    }

    /* renamed from: s */
    public final void mo34622s(int i) {
        int min;
        int length = mo34618q().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(min);
        }
    }

    public int size() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.f24854g;
    }

    @CanIgnoreReturnValue
    /* renamed from: t */
    public final int mo34624t(int i, int i2, int i3, int i4) {
        Object a = tl0.m52344a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            tl0.m52352i(a, i3 & i5, i4 + 1);
        }
        Object r = mo34619r();
        int[] q = mo34618q();
        for (int i6 = 0; i6 <= i; i6++) {
            int h = tl0.m52351h(r, i6);
            while (h != 0) {
                int i7 = h - 1;
                int i8 = q[i7];
                int b = tl0.m52345b(i8, i) | i6;
                int i9 = b & i5;
                int h2 = tl0.m52351h(a, i9);
                tl0.m52352i(a, i9, h);
                q[i7] = tl0.m52347d(b, h2, i5);
                h = tl0.m52346c(i8, i);
            }
        }
        this.f24851a = a;
        mo34595A(i5);
        return i5;
    }

    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.toArray() : Arrays.copyOf(mo34617o(), this.f24854g);
    }

    public void trimToSize() {
        if (!needsAllocArrays()) {
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                Set e = mo34603e(size());
                e.addAll(delegateOrNull);
                this.f24851a = e;
                return;
            }
            int i = this.f24854g;
            if (i < mo34618q().length) {
                resizeEntries(i);
            }
            int j = tl0.m52353j(i);
            int n = mo34615n();
            if (j < n) {
                mo34624t(n, j, 0, 0);
            }
        }
    }

    /* renamed from: u */
    public final void mo34628u(int i, E e) {
        mo34617o()[i] = e;
    }

    /* renamed from: w */
    public final void mo34629w(int i, int i2) {
        mo34618q()[i] = i2;
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(collection.size());
        createWithExpectedSize.addAll(collection);
        return createWithExpectedSize;
    }

    public CompactHashSet(int i) {
        init(i);
    }

    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(createWithExpectedSize, eArr);
        return createWithExpectedSize;
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (needsAllocArrays()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.toArray(tArr);
        }
        return ve4.m53367e(mo34617o(), 0, this.f24854g, tArr);
    }
}
