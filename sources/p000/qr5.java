package p000;

import p000.nm1;

/* renamed from: qr5 */
public class qr5 extends nm1.C8993b {
    public qr5(ul1 ul1, zl1 zl1, zl1 zl12) {
        super(ul1, zl1, zl12);
    }

    public qr5(ul1 ul1, zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        super(ul1, zl1, zl12, zl1Arr);
    }

    /* renamed from: J */
    public nm1 mo50274J() {
        if (mo62751u()) {
            return this;
        }
        ul1 i = mo62740i();
        zl1 zl1 = this.f43511b;
        if (zl1.mo50983i()) {
            return i.mo50668u();
        }
        zl1 zl12 = this.f43512c;
        zl1 zl13 = this.f43513d[0];
        boolean h = zl13.mo50981h();
        zl1 o = h ? zl13 : zl13.mo50989o();
        zl1 a = h ? zl12.mo50989o().mo50975a(zl12) : zl12.mo50975a(zl13).mo50984j(zl12);
        if (a.mo50983i()) {
            return new qr5(i, a, i.mo66317o());
        }
        zl1 o2 = a.mo50989o();
        zl1 j = h ? a : a.mo50984j(o);
        zl1 o3 = zl12.mo50975a(zl1).mo50989o();
        if (!h) {
            zl13 = o.mo50989o();
        }
        return new qr5(i, o2, o3.mo50975a(a).mo50975a(o).mo50984j(o3).mo50975a(zl13).mo50975a(o2).mo50975a(j), new zl1[]{j});
    }

    /* renamed from: K */
    public nm1 mo50275K(nm1 nm1) {
        if (mo62751u()) {
            return nm1;
        }
        if (nm1.mo62751u()) {
            return mo50274J();
        }
        ul1 i = mo62740i();
        zl1 zl1 = this.f43511b;
        if (zl1.mo50983i()) {
            return nm1;
        }
        zl1 n = nm1.mo62744n();
        zl1 s = nm1.mo62748s(0);
        if (n.mo50983i() || !s.mo50981h()) {
            return mo50274J().mo50276a(nm1);
        }
        zl1 zl12 = this.f43512c;
        zl1 zl13 = this.f43513d[0];
        zl1 o = nm1.mo62745o();
        zl1 o2 = zl1.mo50989o();
        zl1 o3 = zl12.mo50989o();
        zl1 o4 = zl13.mo50989o();
        zl1 a = o3.mo50975a(zl12.mo50984j(zl13));
        zl1 b = o.mo50976b();
        zl1 l = b.mo50984j(o4).mo50975a(o3).mo50986l(a, o2, o4);
        zl1 j = n.mo50984j(o4);
        zl1 o5 = j.mo50975a(a).mo50989o();
        if (o5.mo50983i()) {
            return l.mo50983i() ? nm1.mo50274J() : i.mo50668u();
        }
        if (l.mo50983i()) {
            return new qr5(i, l, i.mo66317o());
        }
        zl1 j2 = l.mo50989o().mo50984j(j);
        zl1 j3 = l.mo50984j(o5).mo50984j(o4);
        return new qr5(i, j2, l.mo50975a(o5).mo50989o().mo50986l(a, b, j3), new zl1[]{j3});
    }

    /* renamed from: a */
    public nm1 mo50276a(nm1 nm1) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        or5 or5;
        or5 or52;
        or5 or53;
        nm1 nm12 = nm1;
        if (mo62751u()) {
            return nm12;
        }
        if (nm1.mo62751u()) {
            return this;
        }
        ul1 i = mo62740i();
        or5 or54 = (or5) this.f43511b;
        or5 or55 = (or5) nm1.mo62744n();
        if (or54.mo50983i()) {
            return or55.mo50983i() ? i.mo50668u() : nm12.mo50276a(this);
        }
        or5 or56 = (or5) this.f43512c;
        or5 or57 = (or5) this.f43513d[0];
        or5 or58 = (or5) nm1.mo62745o();
        or5 or59 = (or5) nm12.mo62748s(0);
        long[] c = o34.m70127c();
        long[] c2 = o34.m70127c();
        long[] c3 = o34.m70127c();
        long[] c4 = o34.m70127c();
        long[] s = or57.mo50981h() ? null : nr5.m70064s(or57.f43756g);
        if (s == null) {
            jArr = or55.f43756g;
            jArr2 = or58.f43756g;
        } else {
            nr5.m70062q(or55.f43756g, s, c2);
            nr5.m70062q(or58.f43756g, s, c4);
            jArr = c2;
            jArr2 = c4;
        }
        long[] s2 = or59.mo50981h() ? null : nr5.m70064s(or59.f43756g);
        long[] jArr4 = or54.f43756g;
        if (s2 == null) {
            jArr3 = or56.f43756g;
        } else {
            nr5.m70062q(jArr4, s2, c);
            nr5.m70062q(or56.f43756g, s2, c3);
            jArr4 = c;
            jArr3 = c3;
        }
        nr5.m70047b(jArr3, jArr2, c3);
        nr5.m70047b(jArr4, jArr, c4);
        if (o34.m70131g(c4)) {
            return o34.m70131g(c3) ? mo50274J() : i.mo50668u();
        }
        if (or55.mo50983i()) {
            nm1 A = mo62725A();
            or5 or510 = (or5) A.mo62747q();
            zl1 r = A.mo50310r();
            zl1 d = r.mo50975a(or58).mo50977d(or510);
            or5 = (or5) d.mo50989o().mo50975a(d).mo50975a(or510);
            if (or5.mo50983i()) {
                return new qr5(i, or5, i.mo66317o());
            }
            or53 = (or5) d.mo50984j(or510.mo50975a(or5)).mo50975a(or5).mo50975a(r).mo50977d(or5).mo50975a(or5);
            or52 = (or5) i.mo50666m(tl1.f44772b);
        } else {
            nr5.m70068w(c4, c4);
            long[] s3 = nr5.m70064s(c3);
            nr5.m70062q(jArr4, s3, c);
            nr5.m70062q(jArr, s3, c2);
            or5 or511 = new or5(c);
            nr5.m70060o(c, c2, or511.f43756g);
            if (or511.mo50983i()) {
                return new qr5(i, or511, i.mo66317o());
            }
            or5 or512 = new or5(c3);
            nr5.m70062q(c4, s3, or512.f43756g);
            if (s2 != null) {
                long[] jArr5 = or512.f43756g;
                nr5.m70062q(jArr5, s2, jArr5);
            }
            long[] d2 = o34.m70128d();
            nr5.m70047b(c2, c4, c4);
            nr5.m70069x(c4, d2);
            nr5.m70047b(or56.f43756g, or57.f43756g, c4);
            nr5.m70061p(c4, or512.f43756g, d2);
            or5 or513 = new or5(c4);
            nr5.m70065t(d2, or513.f43756g);
            if (s != null) {
                long[] jArr6 = or512.f43756g;
                nr5.m70062q(jArr6, s, jArr6);
            }
            or5 = or511;
            or53 = or513;
            or52 = or512;
        }
        return new qr5(i, or5, or53, new zl1[]{or52});
    }

    /* renamed from: d */
    public nm1 mo50277d() {
        return new qr5((ul1) null, mo62737f(), mo62738g());
    }

    /* renamed from: h */
    public boolean mo50309h() {
        zl1 n = mo62744n();
        return !n.mo50983i() && mo62745o().mo50993s() != n.mo50993s();
    }

    /* renamed from: r */
    public zl1 mo50310r() {
        zl1 zl1 = this.f43511b;
        zl1 zl12 = this.f43512c;
        if (mo62751u() || zl1.mo50983i()) {
            return zl12;
        }
        zl1 j = zl12.mo50975a(zl1).mo50984j(zl1);
        zl1 zl13 = this.f43513d[0];
        return !zl13.mo50981h() ? j.mo50977d(zl13) : j;
    }

    /* renamed from: z */
    public nm1 mo50278z() {
        if (mo62751u()) {
            return this;
        }
        zl1 zl1 = this.f43511b;
        if (zl1.mo50983i()) {
            return this;
        }
        zl1 zl12 = this.f43512c;
        zl1 zl13 = this.f43513d[0];
        return new qr5(this.f43510a, zl1, zl12.mo50975a(zl13), new zl1[]{zl13});
    }
}
