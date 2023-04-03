package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4758t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j */
/* compiled from: DoubleArrayList */
public final class C4730j extends C4704c<Double> implements C4758t.C4760b, RandomAccess, cv4 {

    /* renamed from: g */
    public static final C4730j f25237g;

    /* renamed from: d */
    public double[] f25238d;

    /* renamed from: e */
    public int f25239e;

    static {
        C4730j jVar = new C4730j(new double[0], 0);
        f25237g = jVar;
        jVar.mo35628p();
    }

    public C4730j() {
        this(new double[10], 0);
    }

    /* renamed from: A */
    public Double set(int i, Double d) {
        return Double.valueOf(mo35885B(i, d.doubleValue()));
    }

    /* renamed from: B */
    public double mo35885B(int i, double d) {
        mo35625e();
        mo35894q(i);
        double[] dArr = this.f25238d;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo35625e();
        C4758t.m38320a(collection);
        if (!(collection instanceof C4730j)) {
            return super.addAll(collection);
        }
        C4730j jVar = (C4730j) collection;
        int i = jVar.f25239e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25239e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f25238d;
            if (i3 > dArr.length) {
                this.f25238d = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(jVar.f25238d, 0, this.f25238d, this.f25239e, jVar.f25239e);
            this.f25239e = i3;
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
        if (!(obj instanceof C4730j)) {
            return super.equals(obj);
        }
        C4730j jVar = (C4730j) obj;
        if (this.f25239e != jVar.f25239e) {
            return false;
        }
        double[] dArr = jVar.f25238d;
        for (int i = 0; i < this.f25239e; i++) {
            if (Double.doubleToLongBits(this.f25238d[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25239e; i2++) {
            i = (i * 31) + C4758t.m38325f(Double.doubleToLongBits(this.f25238d[i2]));
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
            if (this.f25238d[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void add(int i, Double d) {
        mo35893o(i, d.doubleValue());
    }

    /* renamed from: k */
    public boolean add(Double d) {
        mo35892n(d.doubleValue());
        return true;
    }

    /* renamed from: n */
    public void mo35892n(double d) {
        mo35625e();
        int i = this.f25239e;
        double[] dArr = this.f25238d;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f25238d = dArr2;
        }
        double[] dArr3 = this.f25238d;
        int i2 = this.f25239e;
        this.f25239e = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: o */
    public final void mo35893o(int i, double d) {
        int i2;
        mo35625e();
        if (i < 0 || i > (i2 = this.f25239e)) {
            throw new IndexOutOfBoundsException(mo35900t(i));
        }
        double[] dArr = this.f25238d;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f25238d, i, dArr2, i + 1, this.f25239e - i);
            this.f25238d = dArr2;
        }
        this.f25238d[i] = d;
        this.f25239e++;
        this.modCount++;
    }

    /* renamed from: q */
    public final void mo35894q(int i) {
        if (i < 0 || i >= this.f25239e) {
            throw new IndexOutOfBoundsException(mo35900t(i));
        }
    }

    /* renamed from: r */
    public Double get(int i) {
        return Double.valueOf(mo35897s(i));
    }

    public void removeRange(int i, int i2) {
        mo35625e();
        if (i2 >= i) {
            double[] dArr = this.f25238d;
            System.arraycopy(dArr, i2, dArr, i, this.f25239e - i2);
            this.f25239e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public double mo35897s(int i) {
        mo35894q(i);
        return this.f25238d[i];
    }

    public int size() {
        return this.f25239e;
    }

    /* renamed from: t */
    public final String mo35900t(int i) {
        return "Index:" + i + ", Size:" + this.f25239e;
    }

    /* renamed from: u */
    public C4758t.C4760b mo35757a(int i) {
        if (i >= this.f25239e) {
            return new C4730j(Arrays.copyOf(this.f25238d, i), this.f25239e);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: w */
    public Double remove(int i) {
        mo35625e();
        mo35894q(i);
        double[] dArr = this.f25238d;
        double d = dArr[i];
        int i2 = this.f25239e;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f25239e--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public C4730j(double[] dArr, int i) {
        this.f25238d = dArr;
        this.f25239e = i;
    }
}
