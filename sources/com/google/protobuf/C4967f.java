package com.google.protobuf;

import com.google.protobuf.C5011t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.f */
/* compiled from: BooleanArrayList */
public final class C4967f extends C4955c<Boolean> implements C5011t.C5012a, RandomAccess, bv4 {

    /* renamed from: g */
    public static final C4967f f25627g;

    /* renamed from: d */
    public boolean[] f25628d;

    /* renamed from: e */
    public int f25629e;

    static {
        C4967f fVar = new C4967f(new boolean[0], 0);
        f25627g = fVar;
        fVar.mo37085p();
    }

    public C4967f() {
        this(new boolean[10], 0);
    }

    /* renamed from: q */
    public static C4967f m39313q() {
        return f25627g;
    }

    /* renamed from: A */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo37215B(i, bool.booleanValue()));
    }

    /* renamed from: B */
    public boolean mo37215B(int i, boolean z) {
        mo37082e();
        mo37225r(i);
        boolean[] zArr = this.f25628d;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo37082e();
        C5011t.m39927a(collection);
        if (!(collection instanceof C4967f)) {
            return super.addAll(collection);
        }
        C4967f fVar = (C4967f) collection;
        int i = fVar.f25629e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25629e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f25628d;
            if (i3 > zArr.length) {
                this.f25628d = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(fVar.f25628d, 0, this.f25628d, this.f25629e, fVar.f25629e);
            this.f25629e = i3;
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
        if (!(obj instanceof C4967f)) {
            return super.equals(obj);
        }
        C4967f fVar = (C4967f) obj;
        if (this.f25629e != fVar.f25629e) {
            return false;
        }
        boolean[] zArr = fVar.f25628d;
        for (int i = 0; i < this.f25629e; i++) {
            if (this.f25628d[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25629e; i2++) {
            i = (i * 31) + C5011t.m39929c(this.f25628d[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f25628d[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void add(int i, Boolean bool) {
        mo37223n(i, bool.booleanValue());
    }

    /* renamed from: k */
    public boolean add(Boolean bool) {
        mo37224o(bool.booleanValue());
        return true;
    }

    /* renamed from: n */
    public final void mo37223n(int i, boolean z) {
        int i2;
        mo37082e();
        if (i < 0 || i > (i2 = this.f25629e)) {
            throw new IndexOutOfBoundsException(mo37231u(i));
        }
        boolean[] zArr = this.f25628d;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f25628d, i, zArr2, i + 1, this.f25629e - i);
            this.f25628d = zArr2;
        }
        this.f25628d[i] = z;
        this.f25629e++;
        this.modCount++;
    }

    /* renamed from: o */
    public void mo37224o(boolean z) {
        mo37082e();
        int i = this.f25629e;
        boolean[] zArr = this.f25628d;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f25628d = zArr2;
        }
        boolean[] zArr3 = this.f25628d;
        int i2 = this.f25629e;
        this.f25629e = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: r */
    public final void mo37225r(int i) {
        if (i < 0 || i >= this.f25629e) {
            throw new IndexOutOfBoundsException(mo37231u(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo37082e();
        if (i2 >= i) {
            boolean[] zArr = this.f25628d;
            System.arraycopy(zArr, i2, zArr, i, this.f25629e - i2);
            this.f25629e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Boolean get(int i) {
        return Boolean.valueOf(mo37230t(i));
    }

    public int size() {
        return this.f25629e;
    }

    /* renamed from: t */
    public boolean mo37230t(int i) {
        mo37225r(i);
        return this.f25628d[i];
    }

    /* renamed from: u */
    public final String mo37231u(int i) {
        return "Index:" + i + ", Size:" + this.f25629e;
    }

    /* renamed from: w */
    public Boolean remove(int i) {
        mo37082e();
        mo37225r(i);
        boolean[] zArr = this.f25628d;
        boolean z = zArr[i];
        int i2 = this.f25629e;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f25629e--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public C4967f(boolean[] zArr, int i) {
        this.f25628d = zArr;
        this.f25629e = i;
    }

    /* renamed from: a */
    public C5011t.C5012a m39317a(int i) {
        if (i >= this.f25629e) {
            return new C4967f(Arrays.copyOf(this.f25628d, i), this.f25629e);
        }
        throw new IllegalArgumentException();
    }
}
