package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: xc8 */
public final class xc8 extends k98<Double> implements RandomAccess {

    /* renamed from: g */
    public static final xc8 f35600g;

    /* renamed from: d */
    public double[] f35601d;

    /* renamed from: e */
    public int f35602e;

    static {
        xc8 xc8 = new xc8();
        f35600g = xc8;
        xc8.mo43294z();
    }

    public xc8() {
        this(new double[10], 0);
    }

    public xc8(double[] dArr, int i) {
        this.f35601d = dArr;
        this.f35602e = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo49456k(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo44712e();
        vf8.m53375a(collection);
        if (!(collection instanceof xc8)) {
            return super.addAll(collection);
        }
        xc8 xc8 = (xc8) collection;
        int i = xc8.f35602e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f35602e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f35601d;
            if (i3 > dArr.length) {
                this.f35601d = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(xc8.f35601d, 0, this.f35601d, this.f35602e, xc8.f35602e);
            this.f35602e = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc8)) {
            return super.equals(obj);
        }
        xc8 xc8 = (xc8) obj;
        if (this.f35602e != xc8.f35602e) {
            return false;
        }
        double[] dArr = xc8.f35601d;
        for (int i = 0; i < this.f35602e; i++) {
            if (this.f35601d[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo49457n(i);
        return Double.valueOf(this.f35601d[i]);
    }

    /* renamed from: h0 */
    public final /* synthetic */ hg8 mo43292h0(int i) {
        if (i >= this.f35602e) {
            return new xc8(Arrays.copyOf(this.f35601d, i), this.f35602e);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35602e; i2++) {
            i = (i * 31) + vf8.m53384j(Double.doubleToLongBits(this.f35601d[i2]));
        }
        return i;
    }

    /* renamed from: j */
    public final void mo49455j(double d) {
        mo49456k(this.f35602e, d);
    }

    /* renamed from: k */
    public final void mo49456k(int i, double d) {
        int i2;
        mo44712e();
        if (i < 0 || i > (i2 = this.f35602e)) {
            throw new IndexOutOfBoundsException(mo49458o(i));
        }
        double[] dArr = this.f35601d;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f35601d, i, dArr2, i + 1, this.f35602e - i);
            this.f35601d = dArr2;
        }
        this.f35601d[i] = d;
        this.f35602e++;
        this.modCount++;
    }

    /* renamed from: n */
    public final void mo49457n(int i) {
        if (i < 0 || i >= this.f35602e) {
            throw new IndexOutOfBoundsException(mo49458o(i));
        }
    }

    /* renamed from: o */
    public final String mo49458o(int i) {
        int i2 = this.f35602e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        mo44712e();
        mo49457n(i);
        double[] dArr = this.f35601d;
        double d = dArr[i];
        int i2 = this.f35602e;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, i2 - i);
        }
        this.f35602e--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo44712e();
        for (int i = 0; i < this.f35602e; i++) {
            if (obj.equals(Double.valueOf(this.f35601d[i]))) {
                double[] dArr = this.f35601d;
                System.arraycopy(dArr, i + 1, dArr, i, this.f35602e - i);
                this.f35602e--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo44712e();
        if (i2 >= i) {
            double[] dArr = this.f35601d;
            System.arraycopy(dArr, i2, dArr, i, this.f35602e - i2);
            this.f35602e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo44712e();
        mo49457n(i);
        double[] dArr = this.f35601d;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f35602e;
    }
}
