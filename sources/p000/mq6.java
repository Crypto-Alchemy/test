package p000;

import java.util.Arrays;

/* renamed from: mq6 */
/* compiled from: TimedValueQueue */
public final class mq6<V> {

    /* renamed from: a */
    public long[] f15148a;

    /* renamed from: b */
    public V[] f15149b;

    /* renamed from: c */
    public int f15150c;

    /* renamed from: d */
    public int f15151d;

    public mq6() {
        this(10);
    }

    /* renamed from: f */
    public static <V> V[] m22500f(int i) {
        return new Object[i];
    }

    /* renamed from: a */
    public synchronized void mo23304a(long j, V v) {
        mo23307d(j);
        mo23308e();
        mo23305b(j, v);
    }

    /* renamed from: b */
    public final void mo23305b(long j, V v) {
        int i = this.f15150c;
        int i2 = this.f15151d;
        V[] vArr = this.f15149b;
        int length = (i + i2) % vArr.length;
        this.f15148a[length] = j;
        vArr[length] = v;
        this.f15151d = i2 + 1;
    }

    /* renamed from: c */
    public synchronized void mo23306c() {
        this.f15150c = 0;
        this.f15151d = 0;
        Arrays.fill(this.f15149b, (Object) null);
    }

    /* renamed from: d */
    public final void mo23307d(long j) {
        int i = this.f15151d;
        if (i > 0) {
            if (j <= this.f15148a[((this.f15150c + i) - 1) % this.f15149b.length]) {
                mo23306c();
            }
        }
    }

    /* renamed from: e */
    public final void mo23308e() {
        int length = this.f15149b.length;
        if (this.f15151d >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] f = m22500f(i);
            int i2 = this.f15150c;
            int i3 = length - i2;
            System.arraycopy(this.f15148a, i2, jArr, 0, i3);
            System.arraycopy(this.f15149b, this.f15150c, f, 0, i3);
            int i4 = this.f15150c;
            if (i4 > 0) {
                System.arraycopy(this.f15148a, 0, jArr, i3, i4);
                System.arraycopy(this.f15149b, 0, f, i3, this.f15150c);
            }
            this.f15148a = jArr;
            this.f15149b = f;
            this.f15150c = 0;
        }
    }

    /* renamed from: g */
    public synchronized V mo23309g(long j) {
        return mo23310h(j, false);
    }

    /* renamed from: h */
    public final V mo23310h(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.f15151d > 0) {
            long j3 = j - this.f15148a[this.f15150c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = mo23313k();
            j2 = j3;
        }
        return v;
    }

    /* renamed from: i */
    public synchronized V mo23311i() {
        V v;
        if (this.f15151d == 0) {
            v = null;
        } else {
            v = mo23313k();
        }
        return v;
    }

    /* renamed from: j */
    public synchronized V mo23312j(long j) {
        return mo23310h(j, true);
    }

    /* renamed from: k */
    public final V mo23313k() {
        boolean z;
        if (this.f15151d > 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        V[] vArr = this.f15149b;
        int i = this.f15150c;
        V v = vArr[i];
        vArr[i] = null;
        this.f15150c = (i + 1) % vArr.length;
        this.f15151d--;
        return v;
    }

    /* renamed from: l */
    public synchronized int mo23314l() {
        return this.f15151d;
    }

    public mq6(int i) {
        this.f15148a = new long[i];
        this.f15149b = m22500f(i);
    }
}
