package p000;

/* renamed from: qy1 */
/* compiled from: FP */
public final class qy1 {

    /* renamed from: a */
    public final C9316sw f44264a;

    /* renamed from: b */
    public int f44265b;

    public qy1(int i) {
        if (i < 0) {
            C9316sw swVar = new C9316sw(m65.f40779a);
            swVar.mo65933l(i);
            swVar.mo65940v();
            this.f44264a = new C9316sw(swVar);
        } else {
            this.f44264a = new C9316sw(i);
        }
        mo65560n();
    }

    /* renamed from: i */
    public static int m71388i(int i) {
        int i2 = i | (i >>> 1);
        int i3 = i2 | (i2 >>> 2);
        int i4 = i3 | (i3 >>> 4);
        int i5 = i4 | (i4 >>> 8);
        int i6 = i5 | (i5 >>> 16);
        int i7 = i6 - ((i6 >>> 1) & 1431655765);
        int i8 = (i7 & 858993459) + ((i7 >>> 2) & 858993459);
        return ((252645135 & (i8 + (i8 >>> 4))) * 16843009) >>> 24;
    }

    /* renamed from: j */
    public static C9316sw m71389j(hz0 hz0) {
        return C9316sw.m72077q(new C9316sw(m65.f40779a), 15772622380152113L, hz0);
    }

    /* renamed from: s */
    public static int m71390s(C9316sw swVar, C9316sw swVar2) {
        return (int) (swVar.f44615a[4] / (swVar2.f44615a[4] + 1));
    }

    /* renamed from: A */
    public void mo65548A() {
        this.f44264a.mo65925J();
        this.f44265b = 1;
    }

    /* renamed from: a */
    public void mo65549a(qy1 qy1) {
        this.f44264a.mo65926a(qy1.f44264a);
        int i = this.f44265b + qy1.f44265b;
        this.f44265b = i;
        if (i > 16777215) {
            mo65567u();
        }
    }

    /* renamed from: b */
    public void mo65550b(qy1 qy1, int i) {
        this.f44264a.mo65927c(qy1.f44264a, i);
        int i2 = this.f44265b;
        this.f44265b = ((qy1.f44265b ^ i2) & (-i)) ^ i2;
    }

    /* renamed from: c */
    public void mo65551c(qy1 qy1) {
        this.f44264a.mo65928e(qy1.f44264a);
        this.f44265b = qy1.f44265b;
    }

    /* renamed from: d */
    public boolean mo65552d(qy1 qy1) {
        qy1 qy12 = new qy1(this);
        qy1 qy13 = new qy1(qy1);
        qy12.mo65567u();
        qy13.mo65567u();
        if (C9316sw.m72074d(qy12.f44264a, qy13.f44264a) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo65553e(int i) {
        boolean z;
        if (i < 0) {
            i = -i;
            z = true;
        } else {
            z = false;
        }
        if (this.f44265b * i <= 16777215) {
            this.f44264a.mo65918A(i);
            this.f44265b *= i;
        } else {
            mo65557k(new qy1(i));
        }
        if (z) {
            mo65558l();
            mo65559m();
        }
    }

    /* renamed from: f */
    public void mo65554f(qy1 qy1) {
        mo65559m();
        qy1 qy12 = new qy1(this);
        if (qy1 == null) {
            mo65563q();
        } else {
            mo65551c(qy1);
        }
        for (int i = 0; i <= 1; i++) {
            mo65570x();
        }
        mo65557k(qy12);
        mo65567u();
    }

    /* renamed from: g */
    public boolean mo65555g() {
        qy1 qy1 = new qy1(this);
        qy1.mo65567u();
        return qy1.mo65565t().mo65934m();
    }

    /* renamed from: h */
    public boolean mo65556h() {
        qy1 qy1 = new qy1(this);
        qy1.mo65567u();
        return qy1.f44264a.mo65935n();
    }

    /* renamed from: k */
    public void mo65557k(qy1 qy1) {
        if (((long) this.f44265b) * ((long) qy1.f44265b) > 16777215) {
            mo65567u();
        }
        this.f44264a.mo65928e(m71389j(C9316sw.m72078r(this.f44264a, qy1.f44264a)));
        this.f44265b = 2;
    }

    /* renamed from: l */
    public void mo65558l() {
        C9316sw swVar = new C9316sw(m65.f40779a);
        int i = m71388i(this.f44265b - 1);
        swVar.mo65931j(i);
        this.f44264a.mo65919B(swVar);
        int i2 = (1 << i) + 1;
        this.f44265b = i2;
        if (i2 > 16777215) {
            mo65567u();
        }
    }

    /* renamed from: m */
    public void mo65559m() {
        this.f44264a.mo65940v();
    }

    /* renamed from: n */
    public void mo65560n() {
        this.f44264a.mo65928e(m71389j(C9316sw.m72078r(this.f44264a, new C9316sw(m65.f40781c))));
        this.f44265b = 2;
    }

    /* renamed from: o */
    public void mo65561o() {
        this.f44264a.mo65941w();
        mo65560n();
    }

    /* renamed from: p */
    public final qy1 mo65562p(C9316sw swVar) {
        byte[] bArr = new byte[71];
        qy1[] qy1Arr = new qy1[16];
        mo65559m();
        C9316sw swVar2 = new C9316sw(swVar);
        swVar2.mo65940v();
        int u = ((swVar2.mo65939u() + 3) / 4) + 1;
        for (int i = 0; i < u; i++) {
            int o = swVar2.mo65936o(4);
            swVar2.mo65930g(o);
            swVar2.mo65940v();
            bArr[i] = (byte) o;
            swVar2.mo65932k(4);
        }
        qy1Arr[0] = new qy1(1);
        qy1Arr[1] = new qy1(this);
        for (int i2 = 2; i2 < 16; i2++) {
            qy1 qy1 = new qy1(qy1Arr[i2 - 1]);
            qy1Arr[i2] = qy1;
            qy1.mo65557k(this);
        }
        qy1 qy12 = new qy1(qy1Arr[bArr[u - 1]]);
        for (int i3 = u - 2; i3 >= 0; i3--) {
            qy12.mo65570x();
            qy12.mo65570x();
            qy12.mo65570x();
            qy12.mo65570x();
            qy12.mo65557k(qy1Arr[bArr[i3]]);
        }
        qy12.mo65567u();
        return qy12;
    }

    /* renamed from: q */
    public final void mo65563q() {
        C9316sw swVar = new C9316sw(m65.f40779a);
        swVar.mo65930g(1);
        swVar.mo65921D(1);
        swVar.mo65930g(1);
        swVar.mo65932k(1);
        mo65551c(mo65562p(swVar));
    }

    /* renamed from: r */
    public int mo65564r(qy1 qy1) {
        qy1 qy12 = new qy1(this);
        qy12.mo65563q();
        if (qy1 != null) {
            qy1.mo65551c(qy12);
        }
        qy12.mo65570x();
        qy12.mo65557k(this);
        return qy12.mo65555g() ? 1 : 0;
    }

    /* renamed from: t */
    public C9316sw mo65565t() {
        return m71389j(new hz0(this.f44264a));
    }

    public String toString() {
        return mo65565t().toString();
    }

    /* renamed from: u */
    public void mo65567u() {
        int i;
        long[] jArr = m65.f40779a;
        C9316sw swVar = new C9316sw(jArr);
        C9316sw swVar2 = new C9316sw(jArr);
        this.f44264a.mo65940v();
        int i2 = this.f44265b;
        if (i2 > 16) {
            long A = swVar2.mo65918A(m71390s(this.f44264a, swVar));
            long[] jArr2 = swVar2.f44615a;
            jArr2[4] = jArr2[4] + (A << 56);
            this.f44264a.mo65922G(swVar2);
            this.f44264a.mo65940v();
            i = 2;
        } else {
            i = m71388i(i2 - 1);
        }
        swVar.mo65931j(i);
        while (i > 0) {
            this.f44264a.mo65927c(swVar2, 1 - C9316sw.m72072F(swVar2, this.f44264a, swVar));
            i--;
        }
        this.f44265b = 1;
    }

    /* renamed from: v */
    public void mo65568v(qy1 qy1) {
        qy1 qy12 = new qy1(this);
        qy12.mo65558l();
        mo65551c(qy1);
        mo65549a(qy12);
    }

    /* renamed from: w */
    public int mo65569w() {
        qy1 qy1 = new qy1(this);
        qy1.mo65567u();
        return qy1.mo65565t().mo65943y();
    }

    /* renamed from: x */
    public void mo65570x() {
        int i = this.f44265b;
        if (((long) i) * ((long) i) > 16777215) {
            mo65567u();
        }
        this.f44264a.mo65928e(m71389j(C9316sw.m72071E(this.f44264a)));
        this.f44265b = 2;
    }

    /* renamed from: y */
    public qy1 mo65571y(qy1 qy1) {
        qy1 qy12 = new qy1(this);
        if (qy1 == null) {
            qy12.mo65563q();
        } else {
            qy12.mo65551c(qy1);
        }
        new qy1(new C9316sw(m65.f40780b));
        qy1 qy13 = new qy1(qy12);
        qy13.mo65570x();
        qy13.mo65557k(this);
        qy1 qy14 = new qy1(this);
        qy14.mo65557k(qy12);
        new qy1(qy13);
        int w = qy14.mo65569w();
        qy1 qy15 = new qy1(qy14);
        qy15.mo65558l();
        qy15.mo65559m();
        qy14.mo65550b(qy15, w);
        return qy14;
    }

    /* renamed from: z */
    public void mo65572z(qy1 qy1) {
        qy1 qy12 = new qy1(qy1);
        qy12.mo65558l();
        mo65549a(qy12);
    }

    public qy1() {
        this.f44264a = new C9316sw(0);
        this.f44265b = 1;
    }

    public qy1(C9316sw swVar) {
        this.f44264a = new C9316sw(swVar);
        mo65560n();
    }

    public qy1(qy1 qy1) {
        this.f44264a = new C9316sw(qy1.f44264a);
        this.f44265b = qy1.f44265b;
    }
}
