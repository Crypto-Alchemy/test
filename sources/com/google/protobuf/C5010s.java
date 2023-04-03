package com.google.protobuf;

import com.google.protobuf.C5011t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.s */
/* compiled from: IntArrayList */
public final class C5010s extends C4955c<Integer> implements C5011t.C5018g, RandomAccess, bv4 {

    /* renamed from: g */
    public static final C5010s f25744g;

    /* renamed from: d */
    public int[] f25745d;

    /* renamed from: e */
    public int f25746e;

    static {
        C5010s sVar = new C5010s(new int[0], 0);
        f25744g = sVar;
        sVar.mo37085p();
    }

    public C5010s() {
        this(new int[10], 0);
    }

    /* renamed from: q */
    public static C5010s m39913q() {
        return f25744g;
    }

    /* renamed from: A */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo37507B(i, num.intValue()));
    }

    /* renamed from: B */
    public int mo37507B(int i, int i2) {
        mo37082e();
        mo37516r(i);
        int[] iArr = this.f25745d;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo37082e();
        C5011t.m39927a(collection);
        if (!(collection instanceof C5010s)) {
            return super.addAll(collection);
        }
        C5010s sVar = (C5010s) collection;
        int i = sVar.f25746e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25746e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f25745d;
            if (i3 > iArr.length) {
                this.f25745d = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(sVar.f25745d, 0, this.f25745d, this.f25746e, sVar.f25746e);
            this.f25746e = i3;
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
        if (!(obj instanceof C5010s)) {
            return super.equals(obj);
        }
        C5010s sVar = (C5010s) obj;
        if (this.f25746e != sVar.f25746e) {
            return false;
        }
        int[] iArr = sVar.f25745d;
        for (int i = 0; i < this.f25746e; i++) {
            if (this.f25745d[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25746e; i2++) {
            i = (i * 31) + this.f25745d[i2];
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
            if (this.f25745d[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void add(int i, Integer num) {
        mo37515o(i, num.intValue());
    }

    /* renamed from: k */
    public boolean add(Integer num) {
        mo37514n(num.intValue());
        return true;
    }

    /* renamed from: n */
    public void mo37514n(int i) {
        mo37082e();
        int i2 = this.f25746e;
        int[] iArr = this.f25745d;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f25745d = iArr2;
        }
        int[] iArr3 = this.f25745d;
        int i3 = this.f25746e;
        this.f25746e = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: o */
    public final void mo37515o(int i, int i2) {
        int i3;
        mo37082e();
        if (i < 0 || i > (i3 = this.f25746e)) {
            throw new IndexOutOfBoundsException(mo37522u(i));
        }
        int[] iArr = this.f25745d;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f25745d, i, iArr2, i + 1, this.f25746e - i);
            this.f25745d = iArr2;
        }
        this.f25745d[i] = i2;
        this.f25746e++;
        this.modCount++;
    }

    /* renamed from: r */
    public final void mo37516r(int i) {
        if (i < 0 || i >= this.f25746e) {
            throw new IndexOutOfBoundsException(mo37522u(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo37082e();
        if (i2 >= i) {
            int[] iArr = this.f25745d;
            System.arraycopy(iArr, i2, iArr, i, this.f25746e - i2);
            this.f25746e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Integer get(int i) {
        return Integer.valueOf(mo37521t(i));
    }

    public int size() {
        return this.f25746e;
    }

    /* renamed from: t */
    public int mo37521t(int i) {
        mo37516r(i);
        return this.f25745d[i];
    }

    /* renamed from: u */
    public final String mo37522u(int i) {
        return "Index:" + i + ", Size:" + this.f25746e;
    }

    /* renamed from: w */
    public Integer remove(int i) {
        mo37082e();
        mo37516r(i);
        int[] iArr = this.f25745d;
        int i2 = iArr[i];
        int i3 = this.f25746e;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f25746e--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public C5010s(int[] iArr, int i) {
        this.f25745d = iArr;
        this.f25746e = i;
    }

    /* renamed from: a */
    public C5011t.C5018g m39917a(int i) {
        if (i >= this.f25746e) {
            return new C5010s(Arrays.copyOf(this.f25745d, i), this.f25746e);
        }
        throw new IllegalArgumentException();
    }
}
