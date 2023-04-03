package com.google.protobuf;

import com.google.protobuf.C5011t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.j */
/* compiled from: DoubleArrayList */
public final class C4983j extends C4955c<Double> implements C5011t.C5013b, RandomAccess, bv4 {

    /* renamed from: g */
    public static final C4983j f25693g;

    /* renamed from: d */
    public double[] f25694d;

    /* renamed from: e */
    public int f25695e;

    static {
        C4983j jVar = new C4983j(new double[0], 0);
        f25693g = jVar;
        jVar.mo37085p();
    }

    public C4983j() {
        this(new double[10], 0);
    }

    /* renamed from: q */
    public static C4983j m39689q() {
        return f25693g;
    }

    /* renamed from: A */
    public Double set(int i, Double d) {
        return Double.valueOf(mo37348B(i, d.doubleValue()));
    }

    /* renamed from: B */
    public double mo37348B(int i, double d) {
        mo37082e();
        mo37357r(i);
        double[] dArr = this.f25694d;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo37082e();
        C5011t.m39927a(collection);
        if (!(collection instanceof C4983j)) {
            return super.addAll(collection);
        }
        C4983j jVar = (C4983j) collection;
        int i = jVar.f25695e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25695e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f25694d;
            if (i3 > dArr.length) {
                this.f25694d = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(jVar.f25694d, 0, this.f25694d, this.f25695e, jVar.f25695e);
            this.f25695e = i3;
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
        if (!(obj instanceof C4983j)) {
            return super.equals(obj);
        }
        C4983j jVar = (C4983j) obj;
        if (this.f25695e != jVar.f25695e) {
            return false;
        }
        double[] dArr = jVar.f25694d;
        for (int i = 0; i < this.f25695e; i++) {
            if (Double.doubleToLongBits(this.f25694d[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25695e; i2++) {
            i = (i * 31) + C5011t.m39932f(Double.doubleToLongBits(this.f25694d[i2]));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f25694d[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void add(int i, Double d) {
        mo37356o(i, d.doubleValue());
    }

    /* renamed from: k */
    public boolean add(Double d) {
        mo37355n(d.doubleValue());
        return true;
    }

    /* renamed from: n */
    public void mo37355n(double d) {
        mo37082e();
        int i = this.f25695e;
        double[] dArr = this.f25694d;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f25694d = dArr2;
        }
        double[] dArr3 = this.f25694d;
        int i2 = this.f25695e;
        this.f25695e = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: o */
    public final void mo37356o(int i, double d) {
        int i2;
        mo37082e();
        if (i < 0 || i > (i2 = this.f25695e)) {
            throw new IndexOutOfBoundsException(mo37363u(i));
        }
        double[] dArr = this.f25694d;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f25694d, i, dArr2, i + 1, this.f25695e - i);
            this.f25694d = dArr2;
        }
        this.f25694d[i] = d;
        this.f25695e++;
        this.modCount++;
    }

    /* renamed from: r */
    public final void mo37357r(int i) {
        if (i < 0 || i >= this.f25695e) {
            throw new IndexOutOfBoundsException(mo37363u(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo37082e();
        if (i2 >= i) {
            double[] dArr = this.f25694d;
            System.arraycopy(dArr, i2, dArr, i, this.f25695e - i2);
            this.f25695e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Double get(int i) {
        return Double.valueOf(mo37362t(i));
    }

    public int size() {
        return this.f25695e;
    }

    /* renamed from: t */
    public double mo37362t(int i) {
        mo37357r(i);
        return this.f25694d[i];
    }

    /* renamed from: u */
    public final String mo37363u(int i) {
        return "Index:" + i + ", Size:" + this.f25695e;
    }

    /* renamed from: w */
    public Double remove(int i) {
        mo37082e();
        mo37357r(i);
        double[] dArr = this.f25694d;
        double d = dArr[i];
        int i2 = this.f25695e;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f25695e--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public C4983j(double[] dArr, int i) {
        this.f25694d = dArr;
        this.f25695e = i;
    }

    /* renamed from: a */
    public C5011t.C5013b m39693a(int i) {
        if (i >= this.f25695e) {
            return new C4983j(Arrays.copyOf(this.f25694d, i), this.f25695e);
        }
        throw new IllegalArgumentException();
    }
}
