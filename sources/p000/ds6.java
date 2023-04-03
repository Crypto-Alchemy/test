package p000;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: ds6 */
/* compiled from: TopKSelector */
public final class ds6<T> {

    /* renamed from: a */
    public final int f28285a;

    /* renamed from: b */
    public final Comparator<? super T> f28286b;

    /* renamed from: c */
    public final T[] f28287c;

    /* renamed from: d */
    public int f28288d;

    /* renamed from: e */
    public T f28289e;

    public ds6(Comparator<? super T> comparator, int i) {
        boolean z;
        this.f28286b = (Comparator) du4.m43692l(comparator, "comparator");
        this.f28285a = i;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        du4.m43686f(z, "k (%s) must be >= 0", i);
        du4.m43686f(i > 1073741823 ? false : z2, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.f28287c = new Object[mw2.m48516a(i, 2)];
        this.f28288d = 0;
        this.f28289e = null;
    }

    /* renamed from: a */
    public static <T> ds6<T> m43631a(int i, Comparator<? super T> comparator) {
        return new ds6<>(comparator, i);
    }

    /* renamed from: b */
    public void mo42036b(T t) {
        int i = this.f28285a;
        if (i != 0) {
            int i2 = this.f28288d;
            if (i2 == 0) {
                this.f28287c[0] = t;
                this.f28289e = t;
                this.f28288d = 1;
            } else if (i2 < i) {
                T[] tArr = this.f28287c;
                this.f28288d = i2 + 1;
                tArr[i2] = t;
                if (this.f28286b.compare(t, ic4.m45613a(this.f28289e)) > 0) {
                    this.f28289e = t;
                }
            } else if (this.f28286b.compare(t, ic4.m45613a(this.f28289e)) < 0) {
                T[] tArr2 = this.f28287c;
                int i3 = this.f28288d;
                int i4 = i3 + 1;
                this.f28288d = i4;
                tArr2[i3] = t;
                if (i4 == this.f28285a * 2) {
                    mo42041g();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo42037c(Iterator<? extends T> it) {
        while (it.hasNext()) {
            mo42036b(it.next());
        }
    }

    /* renamed from: d */
    public final int mo42038d(int i, int i2, int i3) {
        T a = ic4.m45613a(this.f28287c[i3]);
        T[] tArr = this.f28287c;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.f28286b.compare(ic4.m45613a(this.f28287c[i]), a) < 0) {
                mo42039e(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.f28287c;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = a;
        return i4;
    }

    /* renamed from: e */
    public final void mo42039e(int i, int i2) {
        T[] tArr = this.f28287c;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    /* renamed from: f */
    public List<T> mo42040f() {
        Arrays.sort(this.f28287c, 0, this.f28288d, this.f28286b);
        int i = this.f28288d;
        int i2 = this.f28285a;
        if (i > i2) {
            T[] tArr = this.f28287c;
            Arrays.fill(tArr, i2, tArr.length, (Object) null);
            int i3 = this.f28285a;
            this.f28288d = i3;
            this.f28289e = this.f28287c[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.f28287c, this.f28288d)));
    }

    /* renamed from: g */
    public final void mo42041g() {
        int i = (this.f28285a * 2) - 1;
        int d = mw2.m48519d(i + 0, RoundingMode.CEILING) * 3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < i) {
                int d2 = mo42038d(i2, i, ((i2 + i) + 1) >>> 1);
                int i5 = this.f28285a;
                if (d2 <= i5) {
                    if (d2 >= i5) {
                        break;
                    }
                    i2 = Math.max(d2, i2 + 1);
                    i4 = d2;
                } else {
                    i = d2 - 1;
                }
                i3++;
                if (i3 >= d) {
                    Arrays.sort(this.f28287c, i2, i + 1, this.f28286b);
                    break;
                }
            } else {
                break;
            }
        }
        this.f28288d = this.f28285a;
        this.f28289e = ic4.m45613a(this.f28287c[i4]);
        while (true) {
            i4++;
            if (i4 >= this.f28285a) {
                return;
            }
            if (this.f28286b.compare(ic4.m45613a(this.f28287c[i4]), ic4.m45613a(this.f28289e)) > 0) {
                this.f28289e = this.f28287c[i4];
            }
        }
    }
}
