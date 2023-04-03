package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4758t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f */
/* compiled from: BooleanArrayList */
public final class C4715f extends C4704c<Boolean> implements C4758t.C4759a, RandomAccess, cv4 {

    /* renamed from: g */
    public static final C4715f f25172g;

    /* renamed from: d */
    public boolean[] f25173d;

    /* renamed from: e */
    public int f25174e;

    static {
        C4715f fVar = new C4715f(new boolean[0], 0);
        f25172g = fVar;
        fVar.mo35628p();
    }

    public C4715f() {
        this(new boolean[10], 0);
    }

    /* renamed from: A */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo35756B(i, bool.booleanValue()));
    }

    /* renamed from: B */
    public boolean mo35756B(int i, boolean z) {
        mo35625e();
        mo35766q(i);
        boolean[] zArr = this.f25173d;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo35625e();
        C4758t.m38320a(collection);
        if (!(collection instanceof C4715f)) {
            return super.addAll(collection);
        }
        C4715f fVar = (C4715f) collection;
        int i = fVar.f25174e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25174e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f25173d;
            if (i3 > zArr.length) {
                this.f25173d = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(fVar.f25173d, 0, this.f25173d, this.f25174e, fVar.f25174e);
            this.f25174e = i3;
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
        if (!(obj instanceof C4715f)) {
            return super.equals(obj);
        }
        C4715f fVar = (C4715f) obj;
        if (this.f25174e != fVar.f25174e) {
            return false;
        }
        boolean[] zArr = fVar.f25173d;
        for (int i = 0; i < this.f25174e; i++) {
            if (this.f25173d[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25174e; i2++) {
            i = (i * 31) + C4758t.m38322c(this.f25173d[i2]);
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
            if (this.f25173d[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void add(int i, Boolean bool) {
        mo35764n(i, bool.booleanValue());
    }

    /* renamed from: k */
    public boolean add(Boolean bool) {
        mo35765o(bool.booleanValue());
        return true;
    }

    /* renamed from: n */
    public final void mo35764n(int i, boolean z) {
        int i2;
        mo35625e();
        if (i < 0 || i > (i2 = this.f25174e)) {
            throw new IndexOutOfBoundsException(mo35772t(i));
        }
        boolean[] zArr = this.f25173d;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f25173d, i, zArr2, i + 1, this.f25174e - i);
            this.f25173d = zArr2;
        }
        this.f25173d[i] = z;
        this.f25174e++;
        this.modCount++;
    }

    /* renamed from: o */
    public void mo35765o(boolean z) {
        mo35625e();
        int i = this.f25174e;
        boolean[] zArr = this.f25173d;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f25173d = zArr2;
        }
        boolean[] zArr3 = this.f25173d;
        int i2 = this.f25174e;
        this.f25174e = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: q */
    public final void mo35766q(int i) {
        if (i < 0 || i >= this.f25174e) {
            throw new IndexOutOfBoundsException(mo35772t(i));
        }
    }

    /* renamed from: r */
    public Boolean get(int i) {
        return Boolean.valueOf(mo35769s(i));
    }

    public void removeRange(int i, int i2) {
        mo35625e();
        if (i2 >= i) {
            boolean[] zArr = this.f25173d;
            System.arraycopy(zArr, i2, zArr, i, this.f25174e - i2);
            this.f25174e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public boolean mo35769s(int i) {
        mo35766q(i);
        return this.f25173d[i];
    }

    public int size() {
        return this.f25174e;
    }

    /* renamed from: t */
    public final String mo35772t(int i) {
        return "Index:" + i + ", Size:" + this.f25174e;
    }

    /* renamed from: u */
    public C4758t.C4759a mo35757a(int i) {
        if (i >= this.f25174e) {
            return new C4715f(Arrays.copyOf(this.f25173d, i), this.f25174e);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: w */
    public Boolean remove(int i) {
        mo35625e();
        mo35766q(i);
        boolean[] zArr = this.f25173d;
        boolean z = zArr[i];
        int i2 = this.f25174e;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f25174e--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public C4715f(boolean[] zArr, int i) {
        this.f25173d = zArr;
        this.f25174e = i;
    }
}
