package p000;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: j89 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class j89<E> extends vz8<E> implements RandomAccess {

    /* renamed from: g */
    public static final j89<Object> f30246g;

    /* renamed from: d */
    public E[] f30247d;

    /* renamed from: e */
    public int f30248e;

    static {
        j89<Object> j89 = new j89<>(new Object[0], 0);
        f30246g = j89;
        j89.zzb();
    }

    public j89(E[] eArr, int i) {
        this.f30247d = eArr;
        this.f30248e = i;
    }

    /* renamed from: j */
    public static <E> j89<E> m46175j() {
        return f30246g;
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ m59 mo43048I(int i) {
        if (i >= this.f30248e) {
            return new j89(Arrays.copyOf(this.f30247d, i), this.f30248e);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        int i2;
        mo48873e();
        if (i < 0 || i > (i2 = this.f30248e)) {
            throw new IndexOutOfBoundsException(mo44068n(i));
        }
        E[] eArr = this.f30247d;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f30247d, i, eArr2, i + 1, this.f30248e - i);
            this.f30247d = eArr2;
        }
        this.f30247d[i] = e;
        this.f30248e++;
        this.modCount++;
    }

    public final E get(int i) {
        mo44067k(i);
        return this.f30247d[i];
    }

    /* renamed from: k */
    public final void mo44067k(int i) {
        if (i < 0 || i >= this.f30248e) {
            throw new IndexOutOfBoundsException(mo44068n(i));
        }
    }

    /* renamed from: n */
    public final String mo44068n(int i) {
        int i2 = this.f30248e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final E remove(int i) {
        mo48873e();
        mo44067k(i);
        E[] eArr = this.f30247d;
        E e = eArr[i];
        int i2 = this.f30248e;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f30248e--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo48873e();
        mo44067k(i);
        E[] eArr = this.f30247d;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f30248e;
    }

    public final boolean add(E e) {
        mo48873e();
        int i = this.f30248e;
        E[] eArr = this.f30247d;
        if (i == eArr.length) {
            this.f30247d = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f30247d;
        int i2 = this.f30248e;
        this.f30248e = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
