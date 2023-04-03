package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: p19 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class p19 extends kw8<Integer> implements j69, RandomAccess {

    /* renamed from: g */
    public static final p19 f32537g;

    /* renamed from: d */
    public int[] f32538d;

    /* renamed from: e */
    public int f32539e;

    static {
        p19 p19 = new p19(new int[0], 0);
        f32537g = p19;
        p19.zzb();
    }

    public p19() {
        this(new int[10], 0);
    }

    /* renamed from: n */
    public static p19 m49668n() {
        return f32537g;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo45307e();
        if (i < 0 || i > (i2 = this.f32539e)) {
            throw new IndexOutOfBoundsException(mo46616q(i));
        }
        int[] iArr = this.f32538d;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f32538d, i, iArr2, i + 1, this.f32539e - i);
            this.f32538d = iArr2;
        }
        this.f32538d[i] = intValue;
        this.f32539e++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo45307e();
        t19.m52047d(collection);
        if (!(collection instanceof p19)) {
            return super.addAll(collection);
        }
        p19 p19 = (p19) collection;
        int i = p19.f32539e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f32539e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f32538d;
            if (i3 > iArr.length) {
                this.f32538d = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(p19.f32538d, 0, this.f32538d, this.f32539e, p19.f32539e);
            this.f32539e = i3;
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
        if (i >= this.f32539e) {
            return new p19(Arrays.copyOf(this.f32538d, i), this.f32539e);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p19)) {
            return super.equals(obj);
        }
        p19 p19 = (p19) obj;
        if (this.f32539e != p19.f32539e) {
            return false;
        }
        int[] iArr = p19.f32538d;
        for (int i = 0; i < this.f32539e; i++) {
            if (this.f32538d[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo46613j(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32539e; i2++) {
            i = (i * 31) + this.f32538d[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f32538d[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final int mo46613j(int i) {
        mo46615o(i);
        return this.f32538d[i];
    }

    /* renamed from: k */
    public final void mo46614k(int i) {
        mo45307e();
        int i2 = this.f32539e;
        int[] iArr = this.f32538d;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f32538d = iArr2;
        }
        int[] iArr3 = this.f32538d;
        int i3 = this.f32539e;
        this.f32539e = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: o */
    public final void mo46615o(int i) {
        if (i < 0 || i >= this.f32539e) {
            throw new IndexOutOfBoundsException(mo46616q(i));
        }
    }

    /* renamed from: q */
    public final String mo46616q(int i) {
        int i2 = this.f32539e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        mo45307e();
        mo46615o(i);
        int[] iArr = this.f32538d;
        int i2 = iArr[i];
        int i3 = this.f32539e;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f32539e--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo45307e();
        if (i2 >= i) {
            int[] iArr = this.f32538d;
            System.arraycopy(iArr, i2, iArr, i, this.f32539e - i2);
            this.f32539e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo45307e();
        mo46615o(i);
        int[] iArr = this.f32538d;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f32539e;
    }

    public p19(int[] iArr, int i) {
        this.f32538d = iArr;
        this.f32539e = i;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo46614k(((Integer) obj).intValue());
        return true;
    }
}
