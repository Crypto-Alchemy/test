package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ex8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class ex8 extends kw8<Boolean> implements j69, RandomAccess {

    /* renamed from: g */
    public static final ex8 f28694g;

    /* renamed from: d */
    public boolean[] f28695d;

    /* renamed from: e */
    public int f28696e;

    static {
        ex8 ex8 = new ex8(new boolean[0], 0);
        f28694g = ex8;
        ex8.zzb();
    }

    public ex8() {
        this(new boolean[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo45307e();
        if (i < 0 || i > (i2 = this.f28696e)) {
            throw new IndexOutOfBoundsException(mo42446n(i));
        }
        boolean[] zArr = this.f28695d;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f28695d, i, zArr2, i + 1, this.f28696e - i);
            this.f28695d = zArr2;
        }
        this.f28695d[i] = booleanValue;
        this.f28696e++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo45307e();
        t19.m52047d(collection);
        if (!(collection instanceof ex8)) {
            return super.addAll(collection);
        }
        ex8 ex8 = (ex8) collection;
        int i = ex8.f28696e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f28696e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f28695d;
            if (i3 > zArr.length) {
                this.f28695d = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(ex8.f28695d, 0, this.f28695d, this.f28696e, ex8.f28696e);
            this.f28696e = i3;
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
        if (i >= this.f28696e) {
            return new ex8(Arrays.copyOf(this.f28695d, i), this.f28696e);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex8)) {
            return super.equals(obj);
        }
        ex8 ex8 = (ex8) obj;
        if (this.f28696e != ex8.f28696e) {
            return false;
        }
        boolean[] zArr = ex8.f28695d;
        for (int i = 0; i < this.f28696e; i++) {
            if (this.f28695d[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo42445k(i);
        return Boolean.valueOf(this.f28695d[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f28696e; i2++) {
            i = (i * 31) + t19.m52046c(this.f28695d[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f28695d[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo42444j(boolean z) {
        mo45307e();
        int i = this.f28696e;
        boolean[] zArr = this.f28695d;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f28695d = zArr2;
        }
        boolean[] zArr3 = this.f28695d;
        int i2 = this.f28696e;
        this.f28696e = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: k */
    public final void mo42445k(int i) {
        if (i < 0 || i >= this.f28696e) {
            throw new IndexOutOfBoundsException(mo42446n(i));
        }
    }

    /* renamed from: n */
    public final String mo42446n(int i) {
        int i2 = this.f28696e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        mo45307e();
        mo42445k(i);
        boolean[] zArr = this.f28695d;
        boolean z = zArr[i];
        int i2 = this.f28696e;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f28696e--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo45307e();
        if (i2 >= i) {
            boolean[] zArr = this.f28695d;
            System.arraycopy(zArr, i2, zArr, i, this.f28696e - i2);
            this.f28696e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo45307e();
        mo42445k(i);
        boolean[] zArr = this.f28695d;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f28696e;
    }

    public ex8(boolean[] zArr, int i) {
        this.f28695d = zArr;
        this.f28696e = i;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo42444j(((Boolean) obj).booleanValue());
        return true;
    }
}
