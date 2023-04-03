package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: h09 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class h09 extends vz8<Boolean> implements RandomAccess, f89 {

    /* renamed from: g */
    public static final h09 f29410g;

    /* renamed from: d */
    public boolean[] f29411d;

    /* renamed from: e */
    public int f29412e;

    static {
        h09 h09 = new h09(new boolean[0], 0);
        f29410g = h09;
        h09.zzb();
    }

    public h09() {
        this(new boolean[10], 0);
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ m59 mo43048I(int i) {
        if (i >= this.f29412e) {
            return new h09(Arrays.copyOf(this.f29411d, i), this.f29412e);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo48873e();
        if (i < 0 || i > (i2 = this.f29412e)) {
            throw new IndexOutOfBoundsException(mo43059n(i));
        }
        boolean[] zArr = this.f29411d;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f29411d, i, zArr2, i + 1, this.f29412e - i);
            this.f29411d = zArr2;
        }
        this.f29411d[i] = booleanValue;
        this.f29412e++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo48873e();
        p59.m49796a(collection);
        if (!(collection instanceof h09)) {
            return super.addAll(collection);
        }
        h09 h09 = (h09) collection;
        int i = h09.f29412e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f29412e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f29411d;
            if (i3 > zArr.length) {
                this.f29411d = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(h09.f29411d, 0, this.f29411d, this.f29412e, h09.f29412e);
            this.f29412e = i3;
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
        if (!(obj instanceof h09)) {
            return super.equals(obj);
        }
        h09 h09 = (h09) obj;
        if (this.f29412e != h09.f29412e) {
            return false;
        }
        boolean[] zArr = h09.f29411d;
        for (int i = 0; i < this.f29412e; i++) {
            if (this.f29411d[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo43058k(i);
        return Boolean.valueOf(this.f29411d[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f29412e; i2++) {
            i = (i * 31) + p59.m49801f(this.f29411d[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f29412e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f29411d[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo43057j(boolean z) {
        mo48873e();
        int i = this.f29412e;
        boolean[] zArr = this.f29411d;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f29411d = zArr2;
        }
        boolean[] zArr3 = this.f29411d;
        int i2 = this.f29412e;
        this.f29412e = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: k */
    public final void mo43058k(int i) {
        if (i < 0 || i >= this.f29412e) {
            throw new IndexOutOfBoundsException(mo43059n(i));
        }
    }

    /* renamed from: n */
    public final String mo43059n(int i) {
        int i2 = this.f29412e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48873e();
        mo43058k(i);
        boolean[] zArr = this.f29411d;
        boolean z = zArr[i];
        int i2 = this.f29412e;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f29412e--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo48873e();
        if (i2 >= i) {
            boolean[] zArr = this.f29411d;
            System.arraycopy(zArr, i2, zArr, i, this.f29412e - i2);
            this.f29412e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo48873e();
        mo43058k(i);
        boolean[] zArr = this.f29411d;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f29412e;
    }

    public h09(boolean[] zArr, int i) {
        this.f29411d = zArr;
        this.f29412e = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo43057j(((Boolean) obj).booleanValue());
        return true;
    }
}
