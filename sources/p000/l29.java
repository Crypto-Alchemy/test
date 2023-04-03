package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: l29 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class l29 extends vz8<Double> implements RandomAccess, f89 {

    /* renamed from: g */
    public static final l29 f31166g;

    /* renamed from: d */
    public double[] f31167d;

    /* renamed from: e */
    public int f31168e;

    static {
        l29 l29 = new l29(new double[0], 0);
        f31166g = l29;
        l29.zzb();
    }

    public l29() {
        this(new double[10], 0);
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ m59 mo43048I(int i) {
        if (i >= this.f31168e) {
            return new l29(Arrays.copyOf(this.f31167d, i), this.f31168e);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo48873e();
        if (i < 0 || i > (i2 = this.f31168e)) {
            throw new IndexOutOfBoundsException(mo45340n(i));
        }
        double[] dArr = this.f31167d;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f31167d, i, dArr2, i + 1, this.f31168e - i);
            this.f31167d = dArr2;
        }
        this.f31167d[i] = doubleValue;
        this.f31168e++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo48873e();
        p59.m49796a(collection);
        if (!(collection instanceof l29)) {
            return super.addAll(collection);
        }
        l29 l29 = (l29) collection;
        int i = l29.f31168e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f31168e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f31167d;
            if (i3 > dArr.length) {
                this.f31167d = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(l29.f31167d, 0, this.f31167d, this.f31168e, l29.f31168e);
            this.f31168e = i3;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l29)) {
            return super.equals(obj);
        }
        l29 l29 = (l29) obj;
        if (this.f31168e != l29.f31168e) {
            return false;
        }
        double[] dArr = l29.f31167d;
        for (int i = 0; i < this.f31168e; i++) {
            if (Double.doubleToLongBits(this.f31167d[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo45339k(i);
        return Double.valueOf(this.f31167d[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f31168e; i2++) {
            i = (i * 31) + p59.m49800e(Double.doubleToLongBits(this.f31167d[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f31168e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f31167d[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo45338j(double d) {
        mo48873e();
        int i = this.f31168e;
        double[] dArr = this.f31167d;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f31167d = dArr2;
        }
        double[] dArr3 = this.f31167d;
        int i2 = this.f31168e;
        this.f31168e = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: k */
    public final void mo45339k(int i) {
        if (i < 0 || i >= this.f31168e) {
            throw new IndexOutOfBoundsException(mo45340n(i));
        }
    }

    /* renamed from: n */
    public final String mo45340n(int i) {
        int i2 = this.f31168e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48873e();
        mo45339k(i);
        double[] dArr = this.f31167d;
        double d = dArr[i];
        int i2 = this.f31168e;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f31168e--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo48873e();
        if (i2 >= i) {
            double[] dArr = this.f31167d;
            System.arraycopy(dArr, i2, dArr, i, this.f31168e - i2);
            this.f31168e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo48873e();
        mo45339k(i);
        double[] dArr = this.f31167d;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f31168e;
    }

    public l29(double[] dArr, int i) {
        this.f31167d = dArr;
        this.f31168e = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo45338j(((Double) obj).doubleValue());
        return true;
    }
}
