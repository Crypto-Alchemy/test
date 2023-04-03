package p000;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: e79 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class e79<E> extends kw8<E> implements RandomAccess {

    /* renamed from: g */
    public static final e79<Object> f28415g;

    /* renamed from: d */
    public E[] f28416d;

    /* renamed from: e */
    public int f28417e;

    static {
        e79<Object> e79 = new e79<>(new Object[0], 0);
        f28415g = e79;
        e79.zzb();
    }

    public e79(E[] eArr, int i) {
        this.f28416d = eArr;
        this.f28417e = i;
    }

    /* renamed from: n */
    public static <E> e79<E> m43815n() {
        return f28415g;
    }

    public final boolean add(E e) {
        mo45307e();
        int i = this.f28417e;
        E[] eArr = this.f28416d;
        if (i == eArr.length) {
            this.f28416d = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f28416d;
        int i2 = this.f28417e;
        this.f28417e = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: d */
    public final /* synthetic */ h29 mo28813d(int i) {
        if (i >= this.f28417e) {
            return new e79(Arrays.copyOf(this.f28416d, i), this.f28417e);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        mo42147j(i);
        return this.f28416d[i];
    }

    /* renamed from: j */
    public final void mo42147j(int i) {
        if (i < 0 || i >= this.f28417e) {
            throw new IndexOutOfBoundsException(mo42148k(i));
        }
    }

    /* renamed from: k */
    public final String mo42148k(int i) {
        int i2 = this.f28417e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final E remove(int i) {
        mo45307e();
        mo42147j(i);
        E[] eArr = this.f28416d;
        E e = eArr[i];
        int i2 = this.f28417e;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f28417e--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo45307e();
        mo42147j(i);
        E[] eArr = this.f28416d;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f28417e;
    }

    public final void add(int i, E e) {
        int i2;
        mo45307e();
        if (i < 0 || i > (i2 = this.f28417e)) {
            throw new IndexOutOfBoundsException(mo42148k(i));
        }
        E[] eArr = this.f28416d;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f28416d, i, eArr2, i + 1, this.f28417e - i);
            this.f28416d = eArr2;
        }
        this.f28416d[i] = e;
        this.f28417e++;
        this.modCount++;
    }
}
