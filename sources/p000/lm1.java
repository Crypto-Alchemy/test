package p000;

/* renamed from: lm1 */
/* compiled from: ECP */
public final class lm1 {

    /* renamed from: a */
    public qy1 f40643a;

    /* renamed from: b */
    public qy1 f40644b;

    /* renamed from: c */
    public qy1 f40645c;

    public lm1() {
        this.f40643a = new qy1();
        this.f40644b = new qy1(1);
        this.f40645c = new qy1();
    }

    /* renamed from: a */
    public static qy1 m63866a(qy1 qy1) {
        qy1 qy12 = new qy1(qy1);
        qy12.mo65570x();
        qy1 qy13 = new qy1(new C9316sw(m65.f40784f));
        qy12.mo65557k(qy1);
        qy12.mo65549a(qy13);
        qy12.mo65567u();
        return qy12;
    }

    /* renamed from: h */
    public static lm1 m63867h() {
        return new lm1(new C9316sw(m65.f40786h), new C9316sw(m65.f40787i));
    }

    /* renamed from: p */
    public static int m63868p(int i, int i2) {
        return (((i ^ i2) - 1) >> 31) & 1;
    }

    /* renamed from: b */
    public void mo55926b(lm1 lm1) {
        qy1 qy1 = new qy1(this.f40643a);
        qy1.mo65557k(lm1.f40643a);
        qy1 qy12 = new qy1(this.f40644b);
        qy12.mo65557k(lm1.f40644b);
        qy1 qy13 = new qy1(this.f40645c);
        qy13.mo65557k(lm1.f40645c);
        qy1 qy14 = new qy1(this.f40643a);
        qy14.mo65549a(this.f40644b);
        qy14.mo65559m();
        qy1 qy15 = new qy1(lm1.f40643a);
        qy15.mo65549a(lm1.f40644b);
        qy15.mo65559m();
        qy14.mo65557k(qy15);
        qy15.mo65551c(qy1);
        qy15.mo65549a(qy12);
        qy14.mo65572z(qy15);
        qy14.mo65559m();
        qy15.mo65551c(this.f40644b);
        qy15.mo65549a(this.f40645c);
        qy15.mo65559m();
        qy1 qy16 = new qy1(lm1.f40644b);
        qy16.mo65549a(lm1.f40645c);
        qy16.mo65559m();
        qy15.mo65557k(qy16);
        qy16.mo65551c(qy12);
        qy16.mo65549a(qy13);
        qy15.mo65572z(qy16);
        qy15.mo65559m();
        qy16.mo65551c(this.f40643a);
        qy16.mo65549a(this.f40645c);
        qy16.mo65559m();
        qy1 qy17 = new qy1(lm1.f40643a);
        qy17.mo65549a(lm1.f40645c);
        qy17.mo65559m();
        qy16.mo65557k(qy17);
        qy17.mo65551c(qy1);
        qy17.mo65549a(qy13);
        qy17.mo65568v(qy16);
        qy17.mo65559m();
        qy16.mo65551c(qy1);
        qy16.mo65549a(qy1);
        qy1.mo65549a(qy16);
        qy1.mo65559m();
        qy13.mo65553e(21);
        qy1 qy18 = new qy1(qy12);
        qy18.mo65549a(qy13);
        qy18.mo65559m();
        qy12.mo65572z(qy13);
        qy12.mo65559m();
        qy17.mo65553e(21);
        qy16.mo65551c(qy17);
        qy16.mo65557k(qy15);
        qy13.mo65551c(qy14);
        qy13.mo65557k(qy12);
        qy16.mo65568v(qy13);
        qy17.mo65557k(qy1);
        qy12.mo65557k(qy18);
        qy17.mo65549a(qy12);
        qy1.mo65557k(qy14);
        qy18.mo65557k(qy15);
        qy18.mo65549a(qy1);
        this.f40643a.mo65551c(qy16);
        this.f40643a.mo65559m();
        this.f40644b.mo65551c(qy17);
        this.f40644b.mo65559m();
        this.f40645c.mo65551c(qy18);
        this.f40645c.mo65559m();
    }

    /* renamed from: c */
    public void mo55927c() {
        if (!mo55935l()) {
            qy1 qy1 = new qy1(1);
            if (!this.f40645c.mo65552d(qy1)) {
                this.f40645c.mo65554f((qy1) null);
                this.f40643a.mo65557k(this.f40645c);
                this.f40643a.mo65567u();
                this.f40644b.mo65557k(this.f40645c);
                this.f40644b.mo65567u();
                this.f40645c.mo65551c(qy1);
            }
        }
    }

    /* renamed from: d */
    public lm1 mo55928d(C9316sw swVar, C9316sw swVar2) {
        if (swVar.mo65935n() || mo55935l()) {
            return new lm1();
        }
        lm1 lm1 = new lm1();
        C9316sw swVar3 = new C9316sw(swVar);
        swVar3.mo65942x(swVar2);
        int u = swVar3.mo65939u();
        C9316sw swVar4 = new C9316sw();
        C9316sw swVar5 = new C9316sw();
        lm1 lm12 = new lm1();
        lm1 lm13 = new lm1();
        lm1[] lm1Arr = new lm1[8];
        byte[] bArr = new byte[71];
        lm12.mo55930f(this);
        lm12.mo55931g();
        lm1 lm14 = new lm1();
        lm1Arr[0] = lm14;
        lm14.mo55930f(this);
        for (int i = 1; i < 8; i++) {
            lm1 lm15 = new lm1();
            lm1Arr[i] = lm15;
            lm15.mo55930f(lm1Arr[i - 1]);
            lm1Arr[i].mo55926b(lm12);
        }
        swVar5.mo65928e(swVar);
        int y = swVar5.mo65943y();
        swVar5.mo65933l(1);
        swVar5.mo65940v();
        int y2 = swVar5.mo65943y();
        swVar4.mo65928e(swVar5);
        swVar4.mo65933l(1);
        swVar4.mo65940v();
        swVar5.mo65927c(swVar4, y);
        lm12.mo55929e(this, y2);
        lm13.mo55930f(lm12);
        int i2 = ((u + 3) / 4) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            byte o = (byte) (swVar5.mo65936o(5) - 16);
            bArr[i3] = o;
            swVar5.mo65930g(o);
            swVar5.mo65940v();
            swVar5.mo65932k(4);
        }
        byte o2 = (byte) swVar5.mo65936o(5);
        bArr[i2] = o2;
        lm1.mo55937n(lm1Arr, o2);
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            lm12.mo55937n(lm1Arr, bArr[i4]);
            lm1.mo55931g();
            lm1.mo55931g();
            lm1.mo55931g();
            lm1.mo55931g();
            lm1.mo55926b(lm12);
        }
        lm1.mo55938o(lm13);
        return lm1;
    }

    /* renamed from: e */
    public final void mo55929e(lm1 lm1, int i) {
        this.f40643a.mo65550b(lm1.f40643a, i);
        this.f40644b.mo65550b(lm1.f40644b, i);
        this.f40645c.mo65550b(lm1.f40645c, i);
    }

    /* renamed from: f */
    public void mo55930f(lm1 lm1) {
        this.f40643a.mo65551c(lm1.f40643a);
        this.f40644b.mo65551c(lm1.f40644b);
        this.f40645c.mo65551c(lm1.f40645c);
    }

    /* renamed from: g */
    public void mo55931g() {
        qy1 qy1 = new qy1(this.f40644b);
        qy1.mo65570x();
        qy1 qy12 = new qy1(this.f40644b);
        qy12.mo65557k(this.f40645c);
        qy1 qy13 = new qy1(this.f40645c);
        qy13.mo65570x();
        this.f40645c.mo65551c(qy1);
        this.f40645c.mo65549a(qy1);
        this.f40645c.mo65559m();
        qy1 qy14 = this.f40645c;
        qy14.mo65549a(qy14);
        qy1 qy15 = this.f40645c;
        qy15.mo65549a(qy15);
        this.f40645c.mo65559m();
        qy13.mo65553e(21);
        qy1 qy16 = new qy1(qy13);
        qy16.mo65557k(this.f40645c);
        qy1 qy17 = new qy1(qy1);
        qy17.mo65549a(qy13);
        qy17.mo65559m();
        this.f40645c.mo65557k(qy12);
        qy12.mo65551c(qy13);
        qy12.mo65549a(qy13);
        qy13.mo65549a(qy12);
        qy1.mo65572z(qy13);
        qy1.mo65559m();
        qy17.mo65557k(qy1);
        qy17.mo65549a(qy16);
        qy12.mo65551c(this.f40643a);
        qy12.mo65557k(this.f40644b);
        this.f40643a.mo65551c(qy1);
        this.f40643a.mo65559m();
        this.f40643a.mo65557k(qy12);
        qy1 qy18 = this.f40643a;
        qy18.mo65549a(qy18);
        this.f40643a.mo65559m();
        this.f40644b.mo65551c(qy17);
        this.f40644b.mo65559m();
    }

    /* renamed from: i */
    public C9316sw mo55932i() {
        lm1 lm1 = new lm1(this);
        lm1.mo55927c();
        return lm1.f40643a.mo65565t();
    }

    /* renamed from: j */
    public C9316sw mo55933j() {
        lm1 lm1 = new lm1(this);
        lm1.mo55927c();
        return lm1.f40644b.mo65565t();
    }

    /* renamed from: k */
    public void mo55934k() {
        this.f40643a.mo65548A();
        this.f40644b.mo65561o();
        this.f40645c.mo65548A();
    }

    /* renamed from: l */
    public boolean mo55935l() {
        if (!this.f40643a.mo65556h() || !this.f40645c.mo65556h()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public void mo55936m() {
        this.f40644b.mo65558l();
        this.f40644b.mo65559m();
    }

    /* renamed from: n */
    public final void mo55937n(lm1[] lm1Arr, int i) {
        lm1 lm1 = new lm1();
        int i2 = i >> 31;
        int i3 = (((i ^ i2) - i2) - 1) / 2;
        mo55929e(lm1Arr[0], m63868p(i3, 0));
        mo55929e(lm1Arr[1], m63868p(i3, 1));
        mo55929e(lm1Arr[2], m63868p(i3, 2));
        mo55929e(lm1Arr[3], m63868p(i3, 3));
        mo55929e(lm1Arr[4], m63868p(i3, 4));
        mo55929e(lm1Arr[5], m63868p(i3, 5));
        mo55929e(lm1Arr[6], m63868p(i3, 6));
        mo55929e(lm1Arr[7], m63868p(i3, 7));
        lm1.mo55930f(this);
        lm1.mo55936m();
        mo55929e(lm1, i2 & 1);
    }

    /* renamed from: o */
    public void mo55938o(lm1 lm1) {
        lm1 lm12 = new lm1(lm1);
        lm12.mo55936m();
        mo55926b(lm12);
    }

    public String toString() {
        lm1 lm1 = new lm1(this);
        lm1.mo55927c();
        if (lm1.mo55935l()) {
            return "infinity";
        }
        return "(" + lm1.f40643a.mo65565t().toString() + "," + lm1.f40644b.mo65565t().toString() + ")";
    }

    public lm1(lm1 lm1) {
        this.f40643a = new qy1(lm1.f40643a);
        this.f40644b = new qy1(lm1.f40644b);
        this.f40645c = new qy1(lm1.f40645c);
    }

    public lm1(C9316sw swVar, C9316sw swVar2) {
        this.f40643a = new qy1(swVar);
        this.f40644b = new qy1(swVar2);
        this.f40645c = new qy1(1);
        this.f40643a.mo65559m();
        qy1 a = m63866a(this.f40643a);
        qy1 qy1 = new qy1(this.f40644b);
        qy1.mo65570x();
        if (!qy1.mo65552d(a)) {
            mo55934k();
        }
    }

    public lm1(C9316sw swVar) {
        qy1 qy1 = new qy1(swVar);
        this.f40643a = qy1;
        qy1.mo65559m();
        qy1 a = m63866a(this.f40643a);
        qy1 qy12 = new qy1();
        this.f40644b = new qy1();
        this.f40645c = new qy1(1);
        if (a.mo65564r(qy12) == 1) {
            this.f40644b.mo65551c(a.mo65571y(qy12));
        } else {
            mo55934k();
        }
    }
}
