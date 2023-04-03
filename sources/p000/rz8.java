package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: rz8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class rz8 extends kw8<Double> implements j69, RandomAccess {

    /* renamed from: g */
    public static final rz8 f33702g;

    /* renamed from: d */
    public double[] f33703d;

    /* renamed from: e */
    public int f33704e;

    static {
        rz8 rz8 = new rz8(new double[0], 0);
        f33702g = rz8;
        rz8.zzb();
    }

    public rz8() {
        this(new double[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo45307e();
        if (i < 0 || i > (i2 = this.f33704e)) {
            throw new IndexOutOfBoundsException(mo47620n(i));
        }
        double[] dArr = this.f33703d;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f33703d, i, dArr2, i + 1, this.f33704e - i);
            this.f33703d = dArr2;
        }
        this.f33703d[i] = doubleValue;
        this.f33704e++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo45307e();
        t19.m52047d(collection);
        if (!(collection instanceof rz8)) {
            return super.addAll(collection);
        }
        rz8 rz8 = (rz8) collection;
        int i = rz8.f33704e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f33704e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f33703d;
            if (i3 > dArr.length) {
                this.f33703d = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(rz8.f33703d, 0, this.f33703d, this.f33704e, rz8.f33704e);
            this.f33704e = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final /* synthetic */ h29 mo28813d(int i) {
        if (i >= this.f33704e) {
            return new rz8(Arrays.copyOf(this.f33703d, i), this.f33704e);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz8)) {
            return super.equals(obj);
        }
        rz8 rz8 = (rz8) obj;
        if (this.f33704e != rz8.f33704e) {
            return false;
        }
        double[] dArr = rz8.f33703d;
        for (int i = 0; i < this.f33704e; i++) {
            if (Double.doubleToLongBits(this.f33703d[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo47619k(i);
        return Double.valueOf(this.f33703d[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f33704e; i2++) {
            i = (i * 31) + t19.m52045b(Double.doubleToLongBits(this.f33703d[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f33703d[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo47618j(double d) {
        mo45307e();
        int i = this.f33704e;
        double[] dArr = this.f33703d;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f33703d = dArr2;
        }
        double[] dArr3 = this.f33703d;
        int i2 = this.f33704e;
        this.f33704e = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: k */
    public final void mo47619k(int i) {
        if (i < 0 || i >= this.f33704e) {
            throw new IndexOutOfBoundsException(mo47620n(i));
        }
    }

    /* renamed from: n */
    public final String mo47620n(int i) {
        int i2 = this.f33704e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        mo45307e();
        mo47619k(i);
        double[] dArr = this.f33703d;
        double d = dArr[i];
        int i2 = this.f33704e;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f33704e--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo45307e();
        if (i2 >= i) {
            double[] dArr = this.f33703d;
            System.arraycopy(dArr, i2, dArr, i, this.f33704e - i2);
            this.f33704e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo45307e();
        mo47619k(i);
        double[] dArr = this.f33703d;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f33704e;
    }

    public rz8(double[] dArr, int i) {
        this.f33703d = dArr;
        this.f33704e = i;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo47618j(((Double) obj).doubleValue());
        return true;
    }
}
