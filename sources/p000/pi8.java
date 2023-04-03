package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: pi8 */
public final class pi8 extends k98<Long> implements RandomAccess {

    /* renamed from: g */
    public static final pi8 f32714g;

    /* renamed from: d */
    public long[] f32715d;

    /* renamed from: e */
    public int f32716e;

    static {
        pi8 pi8 = new pi8();
        f32714g = pi8;
        pi8.mo43294z();
    }

    public pi8() {
        this(new long[10], 0);
    }

    public pi8(long[] jArr, int i) {
        this.f32715d = jArr;
        this.f32716e = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo46753o(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo44712e();
        vf8.m53375a(collection);
        if (!(collection instanceof pi8)) {
            return super.addAll(collection);
        }
        pi8 pi8 = (pi8) collection;
        int i = pi8.f32716e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f32716e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f32715d;
            if (i3 > jArr.length) {
                this.f32715d = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(pi8.f32715d, 0, this.f32715d, this.f32716e, pi8.f32716e);
            this.f32716e = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi8)) {
            return super.equals(obj);
        }
        pi8 pi8 = (pi8) obj;
        if (this.f32716e != pi8.f32716e) {
            return false;
        }
        long[] jArr = pi8.f32715d;
        for (int i = 0; i < this.f32716e; i++) {
            if (this.f32715d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo46750j(i));
    }

    /* renamed from: h0 */
    public final /* synthetic */ hg8 mo43292h0(int i) {
        if (i >= this.f32716e) {
            return new pi8(Arrays.copyOf(this.f32715d, i), this.f32716e);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32716e; i2++) {
            i = (i * 31) + vf8.m53384j(this.f32715d[i2]);
        }
        return i;
    }

    /* renamed from: j */
    public final long mo46750j(int i) {
        mo46751k(i);
        return this.f32715d[i];
    }

    /* renamed from: k */
    public final void mo46751k(int i) {
        if (i < 0 || i >= this.f32716e) {
            throw new IndexOutOfBoundsException(mo46752n(i));
        }
    }

    /* renamed from: n */
    public final String mo46752n(int i) {
        int i2 = this.f32716e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: o */
    public final void mo46753o(int i, long j) {
        int i2;
        mo44712e();
        if (i < 0 || i > (i2 = this.f32716e)) {
            throw new IndexOutOfBoundsException(mo46752n(i));
        }
        long[] jArr = this.f32715d;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f32715d, i, jArr2, i + 1, this.f32716e - i);
            this.f32715d = jArr2;
        }
        this.f32715d[i] = j;
        this.f32716e++;
        this.modCount++;
    }

    /* renamed from: q */
    public final void mo46754q(long j) {
        mo46753o(this.f32716e, j);
    }

    public final /* synthetic */ Object remove(int i) {
        mo44712e();
        mo46751k(i);
        long[] jArr = this.f32715d;
        long j = jArr[i];
        int i2 = this.f32716e;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.f32716e--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo44712e();
        for (int i = 0; i < this.f32716e; i++) {
            if (obj.equals(Long.valueOf(this.f32715d[i]))) {
                long[] jArr = this.f32715d;
                System.arraycopy(jArr, i + 1, jArr, i, this.f32716e - i);
                this.f32716e--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo44712e();
        if (i2 >= i) {
            long[] jArr = this.f32715d;
            System.arraycopy(jArr, i2, jArr, i, this.f32716e - i2);
            this.f32716e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo44712e();
        mo46751k(i);
        long[] jArr = this.f32715d;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f32716e;
    }
}
