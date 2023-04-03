package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: r39 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class r39 extends kw8<Long> implements j69, RandomAccess {

    /* renamed from: g */
    public static final r39 f33318g;

    /* renamed from: d */
    public long[] f33319d;

    /* renamed from: e */
    public int f33320e;

    static {
        r39 r39 = new r39(new long[0], 0);
        f33318g = r39;
        r39.zzb();
    }

    public r39() {
        this(new long[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo45307e();
        if (i < 0 || i > (i2 = this.f33320e)) {
            throw new IndexOutOfBoundsException(mo47336o(i));
        }
        long[] jArr = this.f33319d;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f33319d, i, jArr2, i + 1, this.f33320e - i);
            this.f33319d = jArr2;
        }
        this.f33319d[i] = longValue;
        this.f33320e++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo45307e();
        t19.m52047d(collection);
        if (!(collection instanceof r39)) {
            return super.addAll(collection);
        }
        r39 r39 = (r39) collection;
        int i = r39.f33320e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f33320e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f33319d;
            if (i3 > jArr.length) {
                this.f33319d = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(r39.f33319d, 0, this.f33319d, this.f33320e, r39.f33320e);
            this.f33320e = i3;
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
        if (i >= this.f33320e) {
            return new r39(Arrays.copyOf(this.f33319d, i), this.f33320e);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r39)) {
            return super.equals(obj);
        }
        r39 r39 = (r39) obj;
        if (this.f33320e != r39.f33320e) {
            return false;
        }
        long[] jArr = r39.f33319d;
        for (int i = 0; i < this.f33320e; i++) {
            if (this.f33319d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo47334k(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f33320e; i2++) {
            i = (i * 31) + t19.m52045b(this.f33319d[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f33319d[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo47333j(long j) {
        mo45307e();
        int i = this.f33320e;
        long[] jArr = this.f33319d;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f33319d = jArr2;
        }
        long[] jArr3 = this.f33319d;
        int i2 = this.f33320e;
        this.f33320e = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: k */
    public final long mo47334k(int i) {
        mo47335n(i);
        return this.f33319d[i];
    }

    /* renamed from: n */
    public final void mo47335n(int i) {
        if (i < 0 || i >= this.f33320e) {
            throw new IndexOutOfBoundsException(mo47336o(i));
        }
    }

    /* renamed from: o */
    public final String mo47336o(int i) {
        int i2 = this.f33320e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        mo45307e();
        mo47335n(i);
        long[] jArr = this.f33319d;
        long j = jArr[i];
        int i2 = this.f33320e;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f33320e--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo45307e();
        if (i2 >= i) {
            long[] jArr = this.f33319d;
            System.arraycopy(jArr, i2, jArr, i, this.f33320e - i2);
            this.f33320e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo45307e();
        mo47335n(i);
        long[] jArr = this.f33319d;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f33320e;
    }

    public r39(long[] jArr, int i) {
        this.f33319d = jArr;
        this.f33320e = i;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo47333j(((Long) obj).longValue());
        return true;
    }
}
