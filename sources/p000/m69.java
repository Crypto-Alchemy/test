package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: m69 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class m69 extends vz8<Long> implements RandomAccess, j59, f89 {

    /* renamed from: g */
    public static final m69 f31524g;

    /* renamed from: d */
    public long[] f31525d;

    /* renamed from: e */
    public int f31526e;

    static {
        m69 m69 = new m69(new long[0], 0);
        f31524g = m69;
        m69.zzb();
    }

    public m69() {
        this(new long[10], 0);
    }

    /* renamed from: j */
    public static m69 m48099j() {
        return f31524g;
    }

    /* renamed from: C */
    public final j59 mo43048I(int i) {
        if (i >= this.f31526e) {
            return new m69(Arrays.copyOf(this.f31525d, i), this.f31526e);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Y */
    public final long mo44057Y(int i) {
        mo45649n(i);
        return this.f31525d[i];
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo48873e();
        if (i < 0 || i > (i2 = this.f31526e)) {
            throw new IndexOutOfBoundsException(mo45650o(i));
        }
        long[] jArr = this.f31525d;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f31525d, i, jArr2, i + 1, this.f31526e - i);
            this.f31525d = jArr2;
        }
        this.f31525d[i] = longValue;
        this.f31526e++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo48873e();
        p59.m49796a(collection);
        if (!(collection instanceof m69)) {
            return super.addAll(collection);
        }
        m69 m69 = (m69) collection;
        int i = m69.f31526e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f31526e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f31525d;
            if (i3 > jArr.length) {
                this.f31525d = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(m69.f31525d, 0, this.f31525d, this.f31526e, m69.f31526e);
            this.f31526e = i3;
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
        if (!(obj instanceof m69)) {
            return super.equals(obj);
        }
        m69 m69 = (m69) obj;
        if (this.f31526e != m69.f31526e) {
            return false;
        }
        long[] jArr = m69.f31525d;
        for (int i = 0; i < this.f31526e; i++) {
            if (this.f31525d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo45649n(i);
        return Long.valueOf(this.f31525d[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f31526e; i2++) {
            i = (i * 31) + p59.m49800e(this.f31525d[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f31526e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f31525d[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo45648k(long j) {
        mo48873e();
        int i = this.f31526e;
        long[] jArr = this.f31525d;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f31525d = jArr2;
        }
        long[] jArr3 = this.f31525d;
        int i2 = this.f31526e;
        this.f31526e = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: n */
    public final void mo45649n(int i) {
        if (i < 0 || i >= this.f31526e) {
            throw new IndexOutOfBoundsException(mo45650o(i));
        }
    }

    /* renamed from: o */
    public final String mo45650o(int i) {
        int i2 = this.f31526e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48873e();
        mo45649n(i);
        long[] jArr = this.f31525d;
        long j = jArr[i];
        int i2 = this.f31526e;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f31526e--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo48873e();
        if (i2 >= i) {
            long[] jArr = this.f31525d;
            System.arraycopy(jArr, i2, jArr, i, this.f31526e - i2);
            this.f31526e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo48873e();
        mo45649n(i);
        long[] jArr = this.f31525d;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f31526e;
    }

    public m69(long[] jArr, int i) {
        this.f31525d = jArr;
        this.f31526e = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo45648k(((Long) obj).longValue());
        return true;
    }
}
