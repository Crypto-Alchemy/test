package p000;

import p000.nm1;

/* renamed from: gq5 */
public class gq5 extends nm1.C8993b {
    public gq5(ul1 ul1, zl1 zl1, zl1 zl12) {
        super(ul1, zl1, zl12);
    }

    public gq5(ul1 ul1, zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
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
        zl1 j = h ? zl12 : zl12.mo50984j(zl13);
        if (!h) {
            zl13 = zl13.mo50989o();
        }
        zl1 a = zl12.mo50989o().mo50975a(j).mo50975a(zl13);
        if (a.mo50983i()) {
            return new gq5(i, a, i.mo66317o());
        }
        zl1 o = a.mo50989o();
        zl1 j2 = h ? a : a.mo50984j(zl13);
        zl1 o2 = zl12.mo50975a(zl1).mo50989o();
        return new gq5(i, o, o2.mo50975a(a).mo50975a(zl13).mo50984j(o2).mo50975a(o), new zl1[]{j2});
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
        zl1 a = o4.mo50975a(o3).mo50975a(zl12.mo50984j(zl13));
        zl1 l = o.mo50984j(o4).mo50975a(o3).mo50986l(a, o2, o4);
        zl1 j = n.mo50984j(o4);
        zl1 o5 = j.mo50975a(a).mo50989o();
        if (o5.mo50983i()) {
            return l.mo50983i() ? nm1.mo50274J() : i.mo50668u();
        }
        if (l.mo50983i()) {
            return new gq5(i, l, i.mo66317o());
        }
        zl1 j2 = l.mo50989o().mo50984j(j);
        zl1 j3 = l.mo50984j(o5).mo50984j(o4);
        return new gq5(i, j2, l.mo50975a(o5).mo50989o().mo50986l(a, o.mo50976b(), j3), new zl1[]{j3});
    }

    /* renamed from: a */
    public nm1 mo50276a(nm1 nm1) {
        zl1 zl1;
        zl1 zl12;
        zl1 zl13;
        zl1 zl14;
        zl1 zl15;
        zl1 zl16;
        if (mo62751u()) {
            return nm1;
        }
        if (nm1.mo62751u()) {
            return this;
        }
        ul1 i = mo62740i();
        zl1 zl17 = this.f43511b;
        zl1 n = nm1.mo62744n();
        if (zl17.mo50983i()) {
            return n.mo50983i() ? i.mo50668u() : nm1.mo50276a(this);
        }
        zl1 zl18 = this.f43512c;
        zl1 zl19 = this.f43513d[0];
        zl1 o = nm1.mo62745o();
        zl1 s = nm1.mo62748s(0);
        boolean h = zl19.mo50981h();
        if (!h) {
            zl12 = n.mo50984j(zl19);
            zl1 = o.mo50984j(zl19);
        } else {
            zl12 = n;
            zl1 = o;
        }
        boolean h2 = s.mo50981h();
        if (!h2) {
            zl17 = zl17.mo50984j(s);
            zl13 = zl18.mo50984j(s);
        } else {
            zl13 = zl18;
        }
        zl1 a = zl13.mo50975a(zl1);
        zl1 a2 = zl17.mo50975a(zl12);
        if (a2.mo50983i()) {
            return a.mo50983i() ? mo50274J() : i.mo50668u();
        }
        if (n.mo50983i()) {
            nm1 A = mo62725A();
            zl1 q = A.mo62747q();
            zl1 r = A.mo50310r();
            zl1 d = r.mo50975a(o).mo50977d(q);
            zl15 = d.mo50989o().mo50975a(d).mo50975a(q).mo50976b();
            if (zl15.mo50983i()) {
                return new gq5(i, zl15, i.mo66317o());
            }
            zl14 = d.mo50984j(q.mo50975a(zl15)).mo50975a(zl15).mo50975a(r).mo50977d(zl15).mo50975a(zl15);
            zl16 = i.mo50666m(tl1.f44772b);
        } else {
            zl1 o2 = a2.mo50989o();
            zl1 j = a.mo50984j(zl17);
            zl1 j2 = a.mo50984j(zl12);
            zl1 j3 = j.mo50984j(j2);
            if (j3.mo50983i()) {
                return new gq5(i, j3, i.mo66317o());
            }
            zl1 j4 = a.mo50984j(o2);
            zl1 j5 = !h2 ? j4.mo50984j(s) : j4;
            zl1 p = j2.mo50975a(o2).mo50990p(j5, zl18.mo50975a(zl19));
            if (!h) {
                j5 = j5.mo50984j(zl19);
            }
            zl15 = j3;
            zl16 = j5;
            zl14 = p;
        }
        return new gq5(i, zl15, zl14, new zl1[]{zl16});
    }

    /* renamed from: d */
    public nm1 mo50277d() {
        return new gq5((ul1) null, mo62737f(), mo62738g());
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
        return new gq5(this.f43510a, zl1, zl12.mo50975a(zl13), new zl1[]{zl13});
    }
}
