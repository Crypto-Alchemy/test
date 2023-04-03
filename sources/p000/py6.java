package p000;

import android.text.Layout;

/* renamed from: py6 */
/* compiled from: TtmlStyle */
public final class py6 {

    /* renamed from: a */
    public String f16688a;

    /* renamed from: b */
    public int f16689b;

    /* renamed from: c */
    public boolean f16690c;

    /* renamed from: d */
    public int f16691d;

    /* renamed from: e */
    public boolean f16692e;

    /* renamed from: f */
    public int f16693f = -1;

    /* renamed from: g */
    public int f16694g = -1;

    /* renamed from: h */
    public int f16695h = -1;

    /* renamed from: i */
    public int f16696i = -1;

    /* renamed from: j */
    public int f16697j = -1;

    /* renamed from: k */
    public float f16698k;

    /* renamed from: l */
    public String f16699l;

    /* renamed from: m */
    public int f16700m = -1;

    /* renamed from: n */
    public int f16701n = -1;

    /* renamed from: o */
    public Layout.Alignment f16702o;

    /* renamed from: p */
    public Layout.Alignment f16703p;

    /* renamed from: q */
    public int f16704q = -1;

    /* renamed from: r */
    public kn6 f16705r;

    /* renamed from: s */
    public float f16706s = Float.MAX_VALUE;

    /* renamed from: A */
    public py6 mo24829A(String str) {
        this.f16699l = str;
        return this;
    }

    /* renamed from: B */
    public py6 mo24830B(boolean z) {
        this.f16696i = z ? 1 : 0;
        return this;
    }

    /* renamed from: C */
    public py6 mo24831C(boolean z) {
        this.f16693f = z ? 1 : 0;
        return this;
    }

    /* renamed from: D */
    public py6 mo24832D(Layout.Alignment alignment) {
        this.f16703p = alignment;
        return this;
    }

    /* renamed from: E */
    public py6 mo24833E(int i) {
        this.f16701n = i;
        return this;
    }

    /* renamed from: F */
    public py6 mo24834F(int i) {
        this.f16700m = i;
        return this;
    }

    /* renamed from: G */
    public py6 mo24835G(float f) {
        this.f16706s = f;
        return this;
    }

    /* renamed from: H */
    public py6 mo24836H(Layout.Alignment alignment) {
        this.f16702o = alignment;
        return this;
    }

    /* renamed from: I */
    public py6 mo24837I(boolean z) {
        this.f16704q = z ? 1 : 0;
        return this;
    }

    /* renamed from: J */
    public py6 mo24838J(kn6 kn6) {
        this.f16705r = kn6;
        return this;
    }

    /* renamed from: K */
    public py6 mo24839K(boolean z) {
        this.f16694g = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public py6 mo24840a(py6 py6) {
        return mo24857r(py6, true);
    }

    /* renamed from: b */
    public int mo24841b() {
        if (this.f16692e) {
            return this.f16691d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int mo24842c() {
        if (this.f16690c) {
            return this.f16689b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String mo24843d() {
        return this.f16688a;
    }

    /* renamed from: e */
    public float mo24844e() {
        return this.f16698k;
    }

    /* renamed from: f */
    public int mo24845f() {
        return this.f16697j;
    }

    /* renamed from: g */
    public String mo24846g() {
        return this.f16699l;
    }

    /* renamed from: h */
    public Layout.Alignment mo24847h() {
        return this.f16703p;
    }

    /* renamed from: i */
    public int mo24848i() {
        return this.f16701n;
    }

    /* renamed from: j */
    public int mo24849j() {
        return this.f16700m;
    }

    /* renamed from: k */
    public float mo24850k() {
        return this.f16706s;
    }

    /* renamed from: l */
    public int mo24851l() {
        int i;
        int i2 = this.f16695h;
        if (i2 == -1 && this.f16696i == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f16696i == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    /* renamed from: m */
    public Layout.Alignment mo24852m() {
        return this.f16702o;
    }

    /* renamed from: n */
    public boolean mo24853n() {
        if (this.f16704q == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public kn6 mo24854o() {
        return this.f16705r;
    }

    /* renamed from: p */
    public boolean mo24855p() {
        return this.f16692e;
    }

    /* renamed from: q */
    public boolean mo24856q() {
        return this.f16690c;
    }

    /* renamed from: r */
    public final py6 mo24857r(py6 py6, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (py6 != null) {
            if (!this.f16690c && py6.f16690c) {
                mo24862w(py6.f16689b);
            }
            if (this.f16695h == -1) {
                this.f16695h = py6.f16695h;
            }
            if (this.f16696i == -1) {
                this.f16696i = py6.f16696i;
            }
            if (this.f16688a == null && (str = py6.f16688a) != null) {
                this.f16688a = str;
            }
            if (this.f16693f == -1) {
                this.f16693f = py6.f16693f;
            }
            if (this.f16694g == -1) {
                this.f16694g = py6.f16694g;
            }
            if (this.f16701n == -1) {
                this.f16701n = py6.f16701n;
            }
            if (this.f16702o == null && (alignment2 = py6.f16702o) != null) {
                this.f16702o = alignment2;
            }
            if (this.f16703p == null && (alignment = py6.f16703p) != null) {
                this.f16703p = alignment;
            }
            if (this.f16704q == -1) {
                this.f16704q = py6.f16704q;
            }
            if (this.f16697j == -1) {
                this.f16697j = py6.f16697j;
                this.f16698k = py6.f16698k;
            }
            if (this.f16705r == null) {
                this.f16705r = py6.f16705r;
            }
            if (this.f16706s == Float.MAX_VALUE) {
                this.f16706s = py6.f16706s;
            }
            if (z && !this.f16692e && py6.f16692e) {
                mo24860u(py6.f16691d);
            }
            if (z && this.f16700m == -1 && (i = py6.f16700m) != -1) {
                this.f16700m = i;
            }
        }
        return this;
    }

    /* renamed from: s */
    public boolean mo24858s() {
        if (this.f16693f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo24859t() {
        if (this.f16694g == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public py6 mo24860u(int i) {
        this.f16691d = i;
        this.f16692e = true;
        return this;
    }

    /* renamed from: v */
    public py6 mo24861v(boolean z) {
        this.f16695h = z ? 1 : 0;
        return this;
    }

    /* renamed from: w */
    public py6 mo24862w(int i) {
        this.f16689b = i;
        this.f16690c = true;
        return this;
    }

    /* renamed from: x */
    public py6 mo24863x(String str) {
        this.f16688a = str;
        return this;
    }

    /* renamed from: y */
    public py6 mo24864y(float f) {
        this.f16698k = f;
        return this;
    }

    /* renamed from: z */
    public py6 mo24865z(int i) {
        this.f16697j = i;
        return this;
    }
}
