package p000;

/* renamed from: xw2 */
/* compiled from: IntTree */
public final class xw2<V> {

    /* renamed from: f */
    public static final xw2<Object> f46026f = new xw2<>();

    /* renamed from: a */
    public final long f46027a;

    /* renamed from: b */
    public final V f46028b;

    /* renamed from: c */
    public final xw2<V> f46029c;

    /* renamed from: d */
    public final xw2<V> f46030d;

    /* renamed from: e */
    public final int f46031e;

    public xw2() {
        this.f46031e = 0;
        this.f46027a = 0;
        this.f46028b = null;
        this.f46029c = null;
        this.f46030d = null;
    }

    /* renamed from: c */
    public static <V> xw2<V> m74106c(long j, V v, xw2<V> xw2, xw2<V> xw22) {
        xw2<V> xw23 = xw2;
        int i = xw23.f46031e;
        int i2 = xw22.f46031e;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                xw2<V> xw24 = xw23.f46029c;
                xw2<V> xw25 = xw23.f46030d;
                if (xw25.f46031e < xw24.f46031e * 2) {
                    long j2 = xw23.f46027a;
                    return new xw2(j2 + j, xw23.f46028b, xw24, new xw2(-j2, v, xw25.mo66949e(xw25.f46027a + j2), xw22));
                }
                xw2<V> xw26 = xw25.f46029c;
                xw2<V> xw27 = xw25.f46030d;
                long j3 = xw25.f46027a;
                long j4 = xw23.f46027a + j3 + j;
                V v2 = xw25.f46028b;
                V v3 = v2;
                xw2 xw28 = new xw2(-j3, xw23.f46028b, xw24, xw26.mo66949e(xw26.f46027a + j3));
                long j5 = xw23.f46027a;
                long j6 = xw25.f46027a;
                return new xw2(j4, v3, xw28, new xw2((-j5) - j6, v, xw27.mo66949e(xw27.f46027a + j6 + j5), xw22));
            }
            xw2<V> xw29 = xw22;
            if (i2 >= i * 5) {
                xw2<V> xw210 = xw29.f46029c;
                xw2<V> xw211 = xw29.f46030d;
                if (xw210.f46031e < xw211.f46031e * 2) {
                    long j7 = xw29.f46027a;
                    return new xw2(j7 + j, xw29.f46028b, new xw2(-j7, v, xw2, xw210.mo66949e(xw210.f46027a + j7)), xw211);
                }
                xw2<V> xw212 = xw210.f46029c;
                xw2<V> xw213 = xw210.f46030d;
                long j8 = xw210.f46027a;
                long j9 = xw29.f46027a;
                V v4 = xw210.f46028b;
                long j10 = j8 + j9 + j;
                xw2 xw214 = new xw2((-j9) - j8, v, xw2, xw212.mo66949e(xw212.f46027a + j8 + j9));
                long j11 = xw210.f46027a;
                return new xw2(j10, v4, xw214, new xw2(-j11, xw29.f46028b, xw213.mo66949e(xw213.f46027a + j11), xw211));
            }
        }
        return new xw2(j, v, xw2, xw22);
    }

    /* renamed from: a */
    public V mo66946a(long j) {
        if (this.f46031e == 0) {
            return null;
        }
        long j2 = this.f46027a;
        if (j < j2) {
            return this.f46029c.mo66946a(j - j2);
        }
        if (j > j2) {
            return this.f46030d.mo66946a(j - j2);
        }
        return this.f46028b;
    }

    /* renamed from: b */
    public xw2<V> mo66947b(long j, V v) {
        if (this.f46031e == 0) {
            return new xw2(j, v, this, this);
        }
        long j2 = this.f46027a;
        if (j < j2) {
            return mo66948d(this.f46029c.mo66947b(j - j2, v), this.f46030d);
        }
        if (j > j2) {
            return mo66948d(this.f46029c, this.f46030d.mo66947b(j - j2, v));
        }
        if (v == this.f46028b) {
            return this;
        }
        return new xw2(j, v, this.f46029c, this.f46030d);
    }

    /* renamed from: d */
    public final xw2<V> mo66948d(xw2<V> xw2, xw2<V> xw22) {
        if (xw2 == this.f46029c && xw22 == this.f46030d) {
            return this;
        }
        return m74106c(this.f46027a, this.f46028b, xw2, xw22);
    }

    /* renamed from: e */
    public final xw2<V> mo66949e(long j) {
        if (this.f46031e == 0 || j == this.f46027a) {
            return this;
        }
        return new xw2(j, this.f46028b, this.f46029c, this.f46030d);
    }

    public xw2(long j, V v, xw2<V> xw2, xw2<V> xw22) {
        this.f46027a = j;
        this.f46028b = v;
        this.f46029c = xw2;
        this.f46030d = xw22;
        this.f46031e = xw2.f46031e + 1 + xw22.f46031e;
    }
}
