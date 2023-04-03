package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4758t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.y */
/* compiled from: LongArrayList */
public final class C4778y extends C4704c<Long> implements C4758t.C4766h, RandomAccess, cv4 {

    /* renamed from: g */
    public static final C4778y f25311g;

    /* renamed from: d */
    public long[] f25312d;

    /* renamed from: e */
    public int f25313e;

    static {
        C4778y yVar = new C4778y(new long[0], 0);
        f25311g = yVar;
        yVar.mo35628p();
    }

    public C4778y() {
        this(new long[10], 0);
    }

    /* renamed from: A */
    public Long set(int i, Long l) {
        return Long.valueOf(mo36075B(i, l.longValue()));
    }

    /* renamed from: B */
    public long mo36075B(int i, long j) {
        mo35625e();
        mo36084q(i);
        long[] jArr = this.f25312d;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo35625e();
        C4758t.m38320a(collection);
        if (!(collection instanceof C4778y)) {
            return super.addAll(collection);
        }
        C4778y yVar = (C4778y) collection;
        int i = yVar.f25313e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25313e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f25312d;
            if (i3 > jArr.length) {
                this.f25312d = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(yVar.f25312d, 0, this.f25312d, this.f25313e, yVar.f25313e);
            this.f25313e = i3;
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
        if (!(obj instanceof C4778y)) {
            return super.equals(obj);
        }
        C4778y yVar = (C4778y) obj;
        if (this.f25313e != yVar.f25313e) {
            return false;
        }
        long[] jArr = yVar.f25312d;
        for (int i = 0; i < this.f25313e; i++) {
            if (this.f25312d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25313e; i2++) {
            i = (i * 31) + C4758t.m38325f(this.f25312d[i2]);
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
            if (this.f25312d[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void add(int i, Long l) {
        mo36082n(i, l.longValue());
    }

    /* renamed from: k */
    public boolean add(Long l) {
        mo36083o(l.longValue());
        return true;
    }

    /* renamed from: n */
    public final void mo36082n(int i, long j) {
        int i2;
        mo35625e();
        if (i < 0 || i > (i2 = this.f25313e)) {
            throw new IndexOutOfBoundsException(mo36090t(i));
        }
        long[] jArr = this.f25312d;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f25312d, i, jArr2, i + 1, this.f25313e - i);
            this.f25312d = jArr2;
        }
        this.f25312d[i] = j;
        this.f25313e++;
        this.modCount++;
    }

    /* renamed from: o */
    public void mo36083o(long j) {
        mo35625e();
        int i = this.f25313e;
        long[] jArr = this.f25312d;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f25312d = jArr2;
        }
        long[] jArr3 = this.f25312d;
        int i2 = this.f25313e;
        this.f25313e = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: q */
    public final void mo36084q(int i) {
        if (i < 0 || i >= this.f25313e) {
            throw new IndexOutOfBoundsException(mo36090t(i));
        }
    }

    /* renamed from: r */
    public Long get(int i) {
        return Long.valueOf(mo36087s(i));
    }

    public void removeRange(int i, int i2) {
        mo35625e();
        if (i2 >= i) {
            long[] jArr = this.f25312d;
            System.arraycopy(jArr, i2, jArr, i, this.f25313e - i2);
            this.f25313e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public long mo36087s(int i) {
        mo36084q(i);
        return this.f25312d[i];
    }

    public int size() {
        return this.f25313e;
    }

    /* renamed from: t */
    public final String mo36090t(int i) {
        return "Index:" + i + ", Size:" + this.f25313e;
    }

    /* renamed from: u */
    public C4758t.C4766h mo35757a(int i) {
        if (i >= this.f25313e) {
            return new C4778y(Arrays.copyOf(this.f25312d, i), this.f25313e);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: w */
    public Long remove(int i) {
        mo35625e();
        mo36084q(i);
        long[] jArr = this.f25312d;
        long j = jArr[i];
        int i2 = this.f25313e;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f25313e--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public C4778y(long[] jArr, int i) {
        this.f25312d = jArr;
        this.f25313e = i;
    }
}
