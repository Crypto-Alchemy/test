package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4758t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.s */
/* compiled from: IntArrayList */
public final class C4757s extends C4704c<Integer> implements C4758t.C4765g, RandomAccess, cv4 {

    /* renamed from: g */
    public static final C4757s f25288g;

    /* renamed from: d */
    public int[] f25289d;

    /* renamed from: e */
    public int f25290e;

    static {
        C4757s sVar = new C4757s(new int[0], 0);
        f25288g = sVar;
        sVar.mo35628p();
    }

    public C4757s() {
        this(new int[10], 0);
    }

    /* renamed from: A */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo36023B(i, num.intValue()));
    }

    /* renamed from: B */
    public int mo36023B(int i, int i2) {
        mo35625e();
        mo36032q(i);
        int[] iArr = this.f25289d;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo35625e();
        C4758t.m38320a(collection);
        if (!(collection instanceof C4757s)) {
            return super.addAll(collection);
        }
        C4757s sVar = (C4757s) collection;
        int i = sVar.f25290e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25290e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f25289d;
            if (i3 > iArr.length) {
                this.f25289d = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(sVar.f25289d, 0, this.f25289d, this.f25290e, sVar.f25290e);
            this.f25290e = i3;
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
        if (!(obj instanceof C4757s)) {
            return super.equals(obj);
        }
        C4757s sVar = (C4757s) obj;
        if (this.f25290e != sVar.f25290e) {
            return false;
        }
        int[] iArr = sVar.f25289d;
        for (int i = 0; i < this.f25290e; i++) {
            if (this.f25289d[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25290e; i2++) {
            i = (i * 31) + this.f25289d[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f25289d[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void add(int i, Integer num) {
        mo36031o(i, num.intValue());
    }

    /* renamed from: k */
    public boolean add(Integer num) {
        mo36030n(num.intValue());
        return true;
    }

    /* renamed from: n */
    public void mo36030n(int i) {
        mo35625e();
        int i2 = this.f25290e;
        int[] iArr = this.f25289d;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f25289d = iArr2;
        }
        int[] iArr3 = this.f25289d;
        int i3 = this.f25290e;
        this.f25290e = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: o */
    public final void mo36031o(int i, int i2) {
        int i3;
        mo35625e();
        if (i < 0 || i > (i3 = this.f25290e)) {
            throw new IndexOutOfBoundsException(mo36038t(i));
        }
        int[] iArr = this.f25289d;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f25289d, i, iArr2, i + 1, this.f25290e - i);
            this.f25289d = iArr2;
        }
        this.f25289d[i] = i2;
        this.f25290e++;
        this.modCount++;
    }

    /* renamed from: q */
    public final void mo36032q(int i) {
        if (i < 0 || i >= this.f25290e) {
            throw new IndexOutOfBoundsException(mo36038t(i));
        }
    }

    /* renamed from: r */
    public Integer get(int i) {
        return Integer.valueOf(mo36035s(i));
    }

    public void removeRange(int i, int i2) {
        mo35625e();
        if (i2 >= i) {
            int[] iArr = this.f25289d;
            System.arraycopy(iArr, i2, iArr, i, this.f25290e - i2);
            this.f25290e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public int mo36035s(int i) {
        mo36032q(i);
        return this.f25289d[i];
    }

    public int size() {
        return this.f25290e;
    }

    /* renamed from: t */
    public final String mo36038t(int i) {
        return "Index:" + i + ", Size:" + this.f25290e;
    }

    /* renamed from: u */
    public C4758t.C4765g mo35757a(int i) {
        if (i >= this.f25290e) {
            return new C4757s(Arrays.copyOf(this.f25289d, i), this.f25290e);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: w */
    public Integer remove(int i) {
        mo35625e();
        mo36032q(i);
        int[] iArr = this.f25289d;
        int i2 = iArr[i];
        int i3 = this.f25290e;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f25290e--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public C4757s(int[] iArr, int i) {
        this.f25289d = iArr;
        this.f25290e = i;
    }
}
