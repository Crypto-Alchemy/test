package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: sf8 */
public final class sf8 extends k98<Integer> implements RandomAccess {

    /* renamed from: g */
    public static final sf8 f33870g;

    /* renamed from: d */
    public int[] f33871d;

    /* renamed from: e */
    public int f33872e;

    static {
        sf8 sf8 = new sf8();
        f33870g = sf8;
        sf8.mo43294z();
    }

    public sf8() {
        this(new int[10], 0);
    }

    public sf8(int[] iArr, int i) {
        this.f33871d = iArr;
        this.f33872e = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo47767q(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo44712e();
        vf8.m53375a(collection);
        if (!(collection instanceof sf8)) {
            return super.addAll(collection);
        }
        sf8 sf8 = (sf8) collection;
        int i = sf8.f33872e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f33872e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f33871d;
            if (i3 > iArr.length) {
                this.f33871d = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(sf8.f33871d, 0, this.f33871d, this.f33872e, sf8.f33872e);
            this.f33872e = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf8)) {
            return super.equals(obj);
        }
        sf8 sf8 = (sf8) obj;
        if (this.f33872e != sf8.f33872e) {
            return false;
        }
        int[] iArr = sf8.f33871d;
        for (int i = 0; i < this.f33872e; i++) {
            if (this.f33871d[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo47763j(i));
    }

    /* renamed from: h0 */
    public final /* synthetic */ hg8 mo43292h0(int i) {
        if (i >= this.f33872e) {
            return new sf8(Arrays.copyOf(this.f33871d, i), this.f33872e);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f33872e; i2++) {
            i = (i * 31) + this.f33871d[i2];
        }
        return i;
    }

    /* renamed from: j */
    public final int mo47763j(int i) {
        mo47765n(i);
        return this.f33871d[i];
    }

    /* renamed from: k */
    public final void mo47764k(int i) {
        mo47767q(this.f33872e, i);
    }

    /* renamed from: n */
    public final void mo47765n(int i) {
        if (i < 0 || i >= this.f33872e) {
            throw new IndexOutOfBoundsException(mo47766o(i));
        }
    }

    /* renamed from: o */
    public final String mo47766o(int i) {
        int i2 = this.f33872e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: q */
    public final void mo47767q(int i, int i2) {
        int i3;
        mo44712e();
        if (i < 0 || i > (i3 = this.f33872e)) {
            throw new IndexOutOfBoundsException(mo47766o(i));
        }
        int[] iArr = this.f33871d;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f33871d, i, iArr2, i + 1, this.f33872e - i);
            this.f33871d = iArr2;
        }
        this.f33871d[i] = i2;
        this.f33872e++;
        this.modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        mo44712e();
        mo47765n(i);
        int[] iArr = this.f33871d;
        int i2 = iArr[i];
        int i3 = this.f33872e;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.f33872e--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo44712e();
        for (int i = 0; i < this.f33872e; i++) {
            if (obj.equals(Integer.valueOf(this.f33871d[i]))) {
                int[] iArr = this.f33871d;
                System.arraycopy(iArr, i + 1, iArr, i, this.f33872e - i);
                this.f33872e--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo44712e();
        if (i2 >= i) {
            int[] iArr = this.f33871d;
            System.arraycopy(iArr, i2, iArr, i, this.f33872e - i2);
            this.f33872e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo44712e();
        mo47765n(i);
        int[] iArr = this.f33871d;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f33872e;
    }
}
