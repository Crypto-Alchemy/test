package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: w98 */
public final class w98 extends k98<Boolean> implements RandomAccess {

    /* renamed from: g */
    public static final w98 f35267g;

    /* renamed from: d */
    public boolean[] f35268d;

    /* renamed from: e */
    public int f35269e;

    static {
        w98 w98 = new w98();
        f35267g = w98;
        w98.mo43294z();
    }

    public w98() {
        this(new boolean[10], 0);
    }

    public w98(boolean[] zArr, int i) {
        this.f35268d = zArr;
        this.f35269e = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo48921k(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo44712e();
        vf8.m53375a(collection);
        if (!(collection instanceof w98)) {
            return super.addAll(collection);
        }
        w98 w98 = (w98) collection;
        int i = w98.f35269e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f35269e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f35268d;
            if (i3 > zArr.length) {
                this.f35268d = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(w98.f35268d, 0, this.f35268d, this.f35269e, w98.f35269e);
            this.f35269e = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w98)) {
            return super.equals(obj);
        }
        w98 w98 = (w98) obj;
        if (this.f35269e != w98.f35269e) {
            return false;
        }
        boolean[] zArr = w98.f35268d;
        for (int i = 0; i < this.f35269e; i++) {
            if (this.f35268d[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo48922n(i);
        return Boolean.valueOf(this.f35268d[i]);
    }

    /* renamed from: h0 */
    public final /* synthetic */ hg8 mo43292h0(int i) {
        if (i >= this.f35269e) {
            return new w98(Arrays.copyOf(this.f35268d, i), this.f35269e);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35269e; i2++) {
            i = (i * 31) + vf8.m53380f(this.f35268d[i2]);
        }
        return i;
    }

    /* renamed from: j */
    public final void mo48920j(boolean z) {
        mo48921k(this.f35269e, z);
    }

    /* renamed from: k */
    public final void mo48921k(int i, boolean z) {
        int i2;
        mo44712e();
        if (i < 0 || i > (i2 = this.f35269e)) {
            throw new IndexOutOfBoundsException(mo48923o(i));
        }
        boolean[] zArr = this.f35268d;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f35268d, i, zArr2, i + 1, this.f35269e - i);
            this.f35268d = zArr2;
        }
        this.f35268d[i] = z;
        this.f35269e++;
        this.modCount++;
    }

    /* renamed from: n */
    public final void mo48922n(int i) {
        if (i < 0 || i >= this.f35269e) {
            throw new IndexOutOfBoundsException(mo48923o(i));
        }
    }

    /* renamed from: o */
    public final String mo48923o(int i) {
        int i2 = this.f35269e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        mo44712e();
        mo48922n(i);
        boolean[] zArr = this.f35268d;
        boolean z = zArr[i];
        int i2 = this.f35269e;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, i2 - i);
        }
        this.f35269e--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo44712e();
        for (int i = 0; i < this.f35269e; i++) {
            if (obj.equals(Boolean.valueOf(this.f35268d[i]))) {
                boolean[] zArr = this.f35268d;
                System.arraycopy(zArr, i + 1, zArr, i, this.f35269e - i);
                this.f35269e--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo44712e();
        if (i2 >= i) {
            boolean[] zArr = this.f35268d;
            System.arraycopy(zArr, i2, zArr, i, this.f35269e - i2);
            this.f35269e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo44712e();
        mo48922n(i);
        boolean[] zArr = this.f35268d;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f35269e;
    }
}
