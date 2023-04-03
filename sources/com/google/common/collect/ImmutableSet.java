package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public static final int MAX_TABLE_SIZE = 1073741824;
    @RetainedWith
    @LazyInit

    /* renamed from: d */
    public transient ImmutableList<E> f24901d;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf((E[]) this.elements);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSet$a */
    public static class C4549a<E> extends ImmutableCollection.C4532a<E> {

        /* renamed from: d */
        public Object[] f24902d;

        /* renamed from: e */
        public int f24903e;

        public C4549a() {
            super(4);
        }

        @CanIgnoreReturnValue
        /* renamed from: i */
        public C4549a<E> mo34667a(E e) {
            du4.m43691k(e);
            if (this.f24902d == null || ImmutableSet.chooseTableSize(this.f24861b) > this.f24902d.length) {
                this.f24902d = null;
                super.mo34664f(e);
                return this;
            }
            mo34797l(e);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: j */
        public C4549a<E> mo34795j(E... eArr) {
            if (this.f24902d != null) {
                for (E i : eArr) {
                    mo34667a(i);
                }
            } else {
                super.mo34662b(eArr);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: k */
        public C4549a<E> mo34796k(Iterator<? extends E> it) {
            du4.m43691k(it);
            while (it.hasNext()) {
                mo34667a(it.next());
            }
            return this;
        }

        /* renamed from: l */
        public final void mo34797l(E e) {
            Objects.requireNonNull(this.f24902d);
            int length = this.f24902d.length - 1;
            int hashCode = e.hashCode();
            int b = ml2.m48361b(hashCode);
            while (true) {
                int i = b & length;
                Object[] objArr = this.f24902d;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.f24903e += hashCode;
                    super.mo34664f(e);
                    return;
                } else if (!obj.equals(e)) {
                    b = i + 1;
                } else {
                    return;
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.common.collect.ImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.common.collect.ImmutableSet<E> mo34798m() {
            /*
                r8 = this;
                int r0 = r8.f24861b
                if (r0 == 0) goto L_0x005c
                r1 = 1
                if (r0 == r1) goto L_0x004f
                java.lang.Object[] r2 = r8.f24902d
                if (r2 == 0) goto L_0x003b
                int r0 = com.google.common.collect.ImmutableSet.chooseTableSize(r0)
                java.lang.Object[] r2 = r8.f24902d
                int r2 = r2.length
                if (r0 != r2) goto L_0x003b
                int r0 = r8.f24861b
                java.lang.Object[] r2 = r8.f24860a
                int r2 = r2.length
                boolean r0 = com.google.common.collect.ImmutableSet.m36711j(r0, r2)
                if (r0 == 0) goto L_0x0028
                java.lang.Object[] r0 = r8.f24860a
                int r2 = r8.f24861b
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
                goto L_0x002a
            L_0x0028:
                java.lang.Object[] r0 = r8.f24860a
            L_0x002a:
                r3 = r0
                com.google.common.collect.RegularImmutableSet r0 = new com.google.common.collect.RegularImmutableSet
                int r4 = r8.f24903e
                java.lang.Object[] r5 = r8.f24902d
                int r2 = r5.length
                int r6 = r2 + -1
                int r7 = r8.f24861b
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0049
            L_0x003b:
                int r0 = r8.f24861b
                java.lang.Object[] r2 = r8.f24860a
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m36710e(r0, r2)
                int r2 = r0.size()
                r8.f24861b = r2
            L_0x0049:
                r8.f24862c = r1
                r1 = 0
                r8.f24902d = r1
                return r0
            L_0x004f:
                java.lang.Object[] r0 = r8.f24860a
                r1 = 0
                r0 = r0[r1]
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m36713of(r0)
                return r0
            L_0x005c:
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m36712of()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSet.C4549a.mo34798m():com.google.common.collect.ImmutableSet");
        }

        public C4549a(int i) {
            super(i);
            this.f24902d = new Object[ImmutableSet.chooseTableSize(i)];
        }
    }

    public static <E> C4549a<E> builder() {
        return new C4549a<>();
    }

    public static <E> C4549a<E> builderWithExpectedSize(int i) {
        ki0.m47100b(i, "expectedSize");
        return new C4549a<>(i);
    }

    public static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        du4.m43685e(z, "collection too large");
        return 1073741824;
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return m36710e(array.length, array);
    }

    /* renamed from: e */
    public static <E> ImmutableSet<E> m36710e(int i, Object... objArr) {
        if (i == 0) {
            return m36712of();
        }
        if (i != 1) {
            int chooseTableSize = chooseTableSize(i);
            Object[] objArr2 = new Object[chooseTableSize];
            int i2 = chooseTableSize - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object a = ve4.m53363a(objArr[i5], i5);
                int hashCode = a.hashCode();
                int b = ml2.m48361b(hashCode);
                while (true) {
                    int i6 = b & i2;
                    Object obj = objArr2[i6];
                    if (obj == null) {
                        objArr[i4] = a;
                        objArr2[i6] = a;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj.equals(a)) {
                        break;
                    } else {
                        b++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                return new SingletonImmutableSet(obj2);
            } else if (chooseTableSize(i4) < chooseTableSize / 2) {
                return m36710e(i4, objArr);
            } else {
                if (m36711j(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return m36713of(obj3);
        }
    }

    /* renamed from: j */
    public static boolean m36711j(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m36712of() {
        return RegularImmutableSet.EMPTY;
    }

    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.f24901d;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> createAsList = createAsList();
        this.f24901d = createAsList;
        return createAsList;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !isHashCodeFast() || !((ImmutableSet) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return C4632i.m37030a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C4632i.m37033d(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract c47<E> iterator();

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m36713of(E e) {
        return new SingletonImmutableSet(e);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m36714of(E e, E e2) {
        return m36710e(2, e, e2);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m36715of(E e, E e2, E e3) {
        return m36710e(3, e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m36716of(E e, E e2, E e3, E e4) {
        return m36710e(4, e, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m36717of(E e, E e2, E e3, E e4, E e5) {
        return m36710e(5, e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m36718of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        du4.m43685e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return m36710e(length, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m36712of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m36713of(next);
        }
        return new C4549a().mo34667a(next).mo34796k(it).mo34798m();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m36712of();
        }
        if (length != 1) {
            return m36710e(eArr.length, (Object[]) eArr.clone());
        }
        return m36713of(eArr[0]);
    }
}
