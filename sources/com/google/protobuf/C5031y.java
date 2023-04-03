package com.google.protobuf;

import com.google.protobuf.C5011t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y */
/* compiled from: LongArrayList */
public final class C5031y extends C4955c<Long> implements C5011t.C5019h, RandomAccess, bv4 {

    /* renamed from: g */
    public static final C5031y f25767g;

    /* renamed from: d */
    public long[] f25768d;

    /* renamed from: e */
    public int f25769e;

    static {
        C5031y yVar = new C5031y(new long[0], 0);
        f25767g = yVar;
        yVar.mo37085p();
    }

    public C5031y() {
        this(new long[10], 0);
    }

    /* renamed from: q */
    public static C5031y m39979q() {
        return f25767g;
    }

    /* renamed from: A */
    public Long set(int i, Long l) {
        return Long.valueOf(mo37561B(i, l.longValue()));
    }

    /* renamed from: B */
    public long mo37561B(int i, long j) {
        mo37082e();
        mo37570r(i);
        long[] jArr = this.f25768d;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo37082e();
        C5011t.m39927a(collection);
        if (!(collection instanceof C5031y)) {
            return super.addAll(collection);
        }
        C5031y yVar = (C5031y) collection;
        int i = yVar.f25769e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25769e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f25768d;
            if (i3 > jArr.length) {
                this.f25768d = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(yVar.f25768d, 0, this.f25768d, this.f25769e, yVar.f25769e);
            this.f25769e = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5031y)) {
            return super.equals(obj);
        }
        C5031y yVar = (C5031y) obj;
        if (this.f25769e != yVar.f25769e) {
            return false;
        }
        long[] jArr = yVar.f25768d;
        for (int i = 0; i < this.f25769e; i++) {
            if (this.f25768d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25769e; i2++) {
            i = (i * 31) + C5011t.m39932f(this.f25768d[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f25768d[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void add(int i, Long l) {
        mo37568n(i, l.longValue());
    }

    /* renamed from: k */
    public boolean add(Long l) {
        mo37569o(l.longValue());
        return true;
    }

    /* renamed from: n */
    public final void mo37568n(int i, long j) {
        int i2;
        mo37082e();
        if (i < 0 || i > (i2 = this.f25769e)) {
            throw new IndexOutOfBoundsException(mo37576u(i));
        }
        long[] jArr = this.f25768d;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f25768d, i, jArr2, i + 1, this.f25769e - i);
            this.f25768d = jArr2;
        }
        this.f25768d[i] = j;
        this.f25769e++;
        this.modCount++;
    }

    /* renamed from: o */
    public void mo37569o(long j) {
        mo37082e();
        int i = this.f25769e;
        long[] jArr = this.f25768d;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f25768d = jArr2;
        }
        long[] jArr3 = this.f25768d;
        int i2 = this.f25769e;
        this.f25769e = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: r */
    public final void mo37570r(int i) {
        if (i < 0 || i >= this.f25769e) {
            throw new IndexOutOfBoundsException(mo37576u(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo37082e();
        if (i2 >= i) {
            long[] jArr = this.f25768d;
            System.arraycopy(jArr, i2, jArr, i, this.f25769e - i2);
            this.f25769e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Long get(int i) {
        return Long.valueOf(mo37575t(i));
    }

    public int size() {
        return this.f25769e;
    }

    /* renamed from: t */
    public long mo37575t(int i) {
        mo37570r(i);
        return this.f25768d[i];
    }

    /* renamed from: u */
    public final String mo37576u(int i) {
        return "Index:" + i + ", Size:" + this.f25769e;
    }

    /* renamed from: w */
    public Long remove(int i) {
        mo37082e();
        mo37570r(i);
        long[] jArr = this.f25768d;
        long j = jArr[i];
        int i2 = this.f25769e;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f25769e--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public C5031y(long[] jArr, int i) {
        this.f25768d = jArr;
        this.f25769e = i;
    }

    /* renamed from: a */
    public C5011t.C5019h m39983a(int i) {
        if (i >= this.f25769e) {
            return new C5031y(Arrays.copyOf(this.f25768d, i), this.f25769e);
        }
        throw new IllegalArgumentException();
    }
}
