package p000;

import java.math.BigInteger;
import java.util.Hashtable;
import p000.ul1;
import p000.zl1;

/* renamed from: nm1 */
public abstract class nm1 {

    /* renamed from: f */
    public static final zl1[] f43509f = new zl1[0];

    /* renamed from: a */
    public ul1 f43510a;

    /* renamed from: b */
    public zl1 f43511b;

    /* renamed from: c */
    public zl1 f43512c;

    /* renamed from: d */
    public zl1[] f43513d;

    /* renamed from: e */
    public Hashtable f43514e;

    /* renamed from: nm1$a */
    public class C8992a implements ut4 {

        /* renamed from: a */
        public final /* synthetic */ boolean f43515a;

        /* renamed from: b */
        public final /* synthetic */ boolean f43516b;

        public C8992a(boolean z, boolean z2) {
            this.f43515a = z;
            this.f43516b = z2;
        }

        /* renamed from: a */
        public vt4 mo56012a(vt4 vt4) {
            b87 b87 = vt4 instanceof b87 ? (b87) vt4 : null;
            if (b87 == null) {
                b87 = new b87();
            }
            if (b87.mo50543b()) {
                return b87;
            }
            if (!b87.mo50542a()) {
                if (this.f43515a || nm1.this.mo62727C()) {
                    b87.mo50545d();
                } else {
                    b87.mo50546e();
                    return b87;
                }
            }
            if (this.f43516b && !b87.mo50544c()) {
                if (!nm1.this.mo62728D()) {
                    b87.mo50546e();
                    return b87;
                }
                b87.mo50547f();
            }
            return b87;
        }
    }

    /* renamed from: nm1$b */
    public static abstract class C8993b extends nm1 {
        public C8993b(ul1 ul1, zl1 zl1, zl1 zl12) {
            super(ul1, zl1, zl12);
        }

        public C8993b(ul1 ul1, zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
            super(ul1, zl1, zl12, zl1Arr);
        }

        /* renamed from: C */
        public boolean mo62727C() {
            zl1 zl1;
            zl1 zl12;
            ul1 i = mo62740i();
            zl1 zl13 = this.f43511b;
            zl1 n = i.mo66316n();
            zl1 o = i.mo66317o();
            int q = i.mo66319q();
            if (q == 6) {
                zl1 zl14 = this.f43513d[0];
                boolean h = zl14.mo50981h();
                if (zl13.mo50983i()) {
                    zl1 o2 = this.f43512c.mo50989o();
                    if (!h) {
                        o = o.mo50984j(zl14.mo50989o());
                    }
                    return o2.equals(o);
                }
                zl1 zl15 = this.f43512c;
                zl1 o3 = zl13.mo50989o();
                if (h) {
                    zl12 = zl15.mo50989o().mo50975a(zl15).mo50975a(n);
                    zl1 = o3.mo50989o().mo50975a(o);
                } else {
                    zl1 o4 = zl14.mo50989o();
                    zl1 o5 = o4.mo50989o();
                    zl12 = zl15.mo50975a(zl14).mo50986l(zl15, n, o4);
                    zl1 = o3.mo50990p(o, o5);
                }
                return zl12.mo50984j(o3).equals(zl1);
            }
            zl1 zl16 = this.f43512c;
            zl1 j = zl16.mo50975a(zl13).mo50984j(zl16);
            if (q != 0) {
                if (q == 1) {
                    zl1 zl17 = this.f43513d[0];
                    if (!zl17.mo50981h()) {
                        zl1 j2 = zl17.mo50984j(zl17.mo50989o());
                        j = j.mo50984j(zl17);
                        n = n.mo50984j(zl17);
                        o = o.mo50984j(j2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return j.equals(zl13.mo50975a(n).mo50984j(zl13.mo50989o()).mo50975a(o));
        }

        /* renamed from: D */
        public boolean mo62728D() {
            BigInteger p = this.f43510a.mo66318p();
            if (tl1.f44773c.equals(p)) {
                return ((zl1.C9679a) mo62725A().mo62737f()).mo50997w() != 0;
            }
            if (!tl1.f44775e.equals(p)) {
                return nm1.super.mo62728D();
            }
            nm1 A = mo62725A();
            zl1 f = A.mo62737f();
            ul1 ul1 = this.f43510a;
            zl1 I = ((ul1.C9406b) ul1).mo66329I(f.mo50975a(ul1.mo66316n()));
            if (I == null) {
                return false;
            }
            return ((zl1.C9679a) f.mo50984j(I).mo50975a(A.mo62738g())).mo50997w() == 0;
        }

        /* renamed from: E */
        public nm1 mo62729E(zl1 zl1) {
            if (mo62751u()) {
                return this;
            }
            int j = mo62741j();
            if (j == 5) {
                zl1 n = mo62744n();
                zl1 o = mo62745o();
                return mo62740i().mo50665i(n, o.mo50975a(n).mo50977d(zl1).mo50975a(n.mo50984j(zl1)), mo62746p());
            } else if (j != 6) {
                return nm1.super.mo62729E(zl1);
            } else {
                zl1 n2 = mo62744n();
                zl1 o2 = mo62745o();
                zl1 zl12 = mo62746p()[0];
                zl1 j2 = n2.mo50984j(zl1.mo50989o());
                zl1 a = o2.mo50975a(n2).mo50975a(j2);
                zl1 j3 = zl12.mo50984j(zl1);
                return mo62740i().mo50665i(j2, a, new zl1[]{j3});
            }
        }

        /* renamed from: F */
        public nm1 mo62730F(zl1 zl1) {
            if (mo62751u()) {
                return this;
            }
            int j = mo62741j();
            if (j != 5 && j != 6) {
                return nm1.super.mo62730F(zl1);
            }
            zl1 n = mo62744n();
            return mo62740i().mo50665i(n, mo62745o().mo50975a(n).mo50984j(zl1).mo50975a(n), mo62746p());
        }

        /* renamed from: G */
        public nm1 mo62731G(nm1 nm1) {
            return nm1.mo62751u() ? this : mo50276a(nm1.mo50278z());
        }

        /* renamed from: L */
        public C8993b mo62756L(int i) {
            nm1 h;
            if (mo62751u()) {
                return this;
            }
            ul1 i2 = mo62740i();
            int q = i2.mo66319q();
            zl1 zl1 = this.f43511b;
            if (q != 0) {
                if (q != 1) {
                    if (q != 5) {
                        if (q != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                zl1 zl12 = this.f43512c;
                zl1 zl13 = this.f43513d[0];
                h = i2.mo50665i(zl1.mo50991q(i), zl12.mo50991q(i), new zl1[]{zl13.mo50991q(i)});
                return (C8993b) h;
            }
            h = i2.mo50664h(zl1.mo50991q(i), this.f43512c.mo50991q(i));
            return (C8993b) h;
        }
    }

    /* renamed from: nm1$c */
    public static abstract class C8994c extends nm1 {
        public C8994c(ul1 ul1, zl1 zl1, zl1 zl12) {
            super(ul1, zl1, zl12);
        }

        public C8994c(ul1 ul1, zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
            super(ul1, zl1, zl12, zl1Arr);
        }

        /* renamed from: C */
        public boolean mo62727C() {
            zl1 zl1 = this.f43511b;
            zl1 zl12 = this.f43512c;
            zl1 n = this.f43510a.mo66316n();
            zl1 o = this.f43510a.mo66317o();
            zl1 o2 = zl12.mo50989o();
            int j = mo62741j();
            if (j != 0) {
                if (j == 1) {
                    zl1 zl13 = this.f43513d[0];
                    if (!zl13.mo50981h()) {
                        zl1 o3 = zl13.mo50989o();
                        zl1 j2 = zl13.mo50984j(o3);
                        o2 = o2.mo50984j(zl13);
                        n = n.mo50984j(o3);
                        o = o.mo50984j(j2);
                    }
                } else if (j == 2 || j == 3 || j == 4) {
                    zl1 zl14 = this.f43513d[0];
                    if (!zl14.mo50981h()) {
                        zl1 o4 = zl14.mo50989o();
                        zl1 o5 = o4.mo50989o();
                        zl1 j3 = o4.mo50984j(o5);
                        n = n.mo50984j(o5);
                        o = o.mo50984j(j3);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return o2.equals(zl1.mo50989o().mo50975a(n).mo50984j(zl1).mo50975a(o));
        }

        /* renamed from: G */
        public nm1 mo62731G(nm1 nm1) {
            return nm1.mo62751u() ? this : mo50276a(nm1.mo50278z());
        }

        /* renamed from: h */
        public boolean mo50309h() {
            return mo62738g().mo50993s();
        }
    }

    /* renamed from: nm1$d */
    public static class C8995d extends C8993b {
        public C8995d(ul1 ul1, zl1 zl1, zl1 zl12) {
            super(ul1, zl1, zl12);
        }

        public C8995d(ul1 ul1, zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
            super(ul1, zl1, zl12, zl1Arr);
        }

        /* renamed from: J */
        public nm1 mo50274J() {
            zl1 zl1;
            if (mo62751u()) {
                return this;
            }
            ul1 i = mo62740i();
            zl1 zl12 = this.f43511b;
            if (zl12.mo50983i()) {
                return i.mo50668u();
            }
            int q = i.mo66319q();
            if (q == 0) {
                zl1 a = this.f43512c.mo50977d(zl12).mo50975a(zl12);
                zl1 a2 = a.mo50989o().mo50975a(a).mo50975a(i.mo66316n());
                return new C8995d(i, a2, zl12.mo50990p(a2, a.mo50976b()));
            } else if (q == 1) {
                zl1 zl13 = this.f43512c;
                zl1 zl14 = this.f43513d[0];
                boolean h = zl14.mo50981h();
                zl1 j = h ? zl12 : zl12.mo50984j(zl14);
                if (!h) {
                    zl13 = zl13.mo50984j(zl14);
                }
                zl1 o = zl12.mo50989o();
                zl1 a3 = o.mo50975a(zl13);
                zl1 o2 = j.mo50989o();
                zl1 a4 = a3.mo50975a(j);
                zl1 l = a4.mo50986l(a3, o2, i.mo66316n());
                return new C8995d(i, j.mo50984j(l), o.mo50989o().mo50986l(j, l, a4), new zl1[]{j.mo50984j(o2)});
            } else if (q == 6) {
                zl1 zl15 = this.f43512c;
                zl1 zl16 = this.f43513d[0];
                boolean h2 = zl16.mo50981h();
                zl1 j2 = h2 ? zl15 : zl15.mo50984j(zl16);
                zl1 o3 = h2 ? zl16 : zl16.mo50989o();
                zl1 n = i.mo66316n();
                zl1 j3 = h2 ? n : n.mo50984j(o3);
                zl1 a5 = zl15.mo50989o().mo50975a(j2).mo50975a(j3);
                if (a5.mo50983i()) {
                    return new C8995d(i, a5, i.mo66317o().mo50988n());
                }
                zl1 o4 = a5.mo50989o();
                zl1 j4 = h2 ? a5 : a5.mo50984j(o3);
                zl1 o5 = i.mo66317o();
                if (o5.mo67330c() < (i.mo50667t() >> 1)) {
                    zl1 o6 = zl15.mo50975a(zl12).mo50989o();
                    zl1 = o6.mo50975a(a5).mo50975a(o3).mo50984j(o6).mo50975a(o5.mo50981h() ? j3.mo50975a(o3).mo50989o() : j3.mo50990p(o5, o3.mo50989o())).mo50975a(o4);
                    if (!n.mo50983i()) {
                        if (!n.mo50981h()) {
                            zl1 = zl1.mo50975a(n.mo50976b().mo50984j(j4));
                        }
                        return new C8995d(i, o4, zl1, new zl1[]{j4});
                    }
                } else {
                    if (!h2) {
                        zl12 = zl12.mo50984j(zl16);
                    }
                    zl1 = zl12.mo50990p(a5, j2).mo50975a(o4);
                }
                zl1 = zl1.mo50975a(j4);
                return new C8995d(i, o4, zl1, new zl1[]{j4});
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
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
            if (i.mo66319q() != 6) {
                return mo50274J().mo50276a(nm1);
            }
            zl1 zl12 = nm1.f43511b;
            zl1 zl13 = nm1.f43513d[0];
            if (zl12.mo50983i() || !zl13.mo50981h()) {
                return mo50274J().mo50276a(nm1);
            }
            zl1 zl14 = this.f43512c;
            zl1 zl15 = this.f43513d[0];
            zl1 zl16 = nm1.f43512c;
            zl1 o = zl1.mo50989o();
            zl1 o2 = zl14.mo50989o();
            zl1 o3 = zl15.mo50989o();
            zl1 a = i.mo66316n().mo50984j(o3).mo50975a(o2).mo50975a(zl14.mo50984j(zl15));
            zl1 b = zl16.mo50976b();
            zl1 l = i.mo66316n().mo50975a(b).mo50984j(o3).mo50975a(o2).mo50986l(a, o, o3);
            zl1 j = zl12.mo50984j(o3);
            zl1 o4 = j.mo50975a(a).mo50989o();
            if (o4.mo50983i()) {
                return l.mo50983i() ? nm1.mo50274J() : i.mo50668u();
            }
            if (l.mo50983i()) {
                return new C8995d(i, l, i.mo66317o().mo50988n());
            }
            zl1 j2 = l.mo50989o().mo50984j(j);
            zl1 j3 = l.mo50984j(o4).mo50984j(o3);
            return new C8995d(i, j2, l.mo50975a(o4).mo50989o().mo50986l(a, b, j3), new zl1[]{j3});
        }

        /* renamed from: a */
        public nm1 mo50276a(nm1 nm1) {
            zl1 zl1;
            zl1 zl12;
            zl1 zl13;
            zl1 zl14;
            zl1 zl15;
            zl1 zl16;
            nm1 nm12 = nm1;
            if (mo62751u()) {
                return nm12;
            }
            if (nm1.mo62751u()) {
                return this;
            }
            ul1 i = mo62740i();
            int q = i.mo66319q();
            zl1 zl17 = this.f43511b;
            zl1 zl18 = nm12.f43511b;
            if (q == 0) {
                zl1 zl19 = this.f43512c;
                zl1 zl110 = nm12.f43512c;
                zl1 a = zl17.mo50975a(zl18);
                zl1 a2 = zl19.mo50975a(zl110);
                if (a.mo50983i()) {
                    return a2.mo50983i() ? mo50274J() : i.mo50668u();
                }
                zl1 d = a2.mo50977d(a);
                zl1 a3 = d.mo50989o().mo50975a(d).mo50975a(a).mo50975a(i.mo66316n());
                return new C8995d(i, a3, d.mo50984j(zl17.mo50975a(a3)).mo50975a(a3).mo50975a(zl19));
            } else if (q == 1) {
                zl1 zl111 = this.f43512c;
                zl1 zl112 = this.f43513d[0];
                zl1 zl113 = nm12.f43512c;
                zl1 zl114 = nm12.f43513d[0];
                boolean h = zl114.mo50981h();
                zl1 a4 = zl112.mo50984j(zl113).mo50975a(h ? zl111 : zl111.mo50984j(zl114));
                zl1 a5 = zl112.mo50984j(zl18).mo50975a(h ? zl17 : zl17.mo50984j(zl114));
                if (a5.mo50983i()) {
                    return a4.mo50983i() ? mo50274J() : i.mo50668u();
                }
                zl1 o = a5.mo50989o();
                zl1 j = o.mo50984j(a5);
                if (!h) {
                    zl112 = zl112.mo50984j(zl114);
                }
                zl1 a6 = a4.mo50975a(a5);
                zl1 a7 = a6.mo50986l(a4, o, i.mo66316n()).mo50984j(zl112).mo50975a(j);
                zl1 j2 = a5.mo50984j(a7);
                if (!h) {
                    o = o.mo50984j(zl114);
                }
                return new C8995d(i, j2, a4.mo50986l(zl17, a5, zl111).mo50986l(o, a6, a7), new zl1[]{j.mo50984j(zl112)});
            } else if (q != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            } else if (zl17.mo50983i()) {
                return zl18.mo50983i() ? i.mo50668u() : nm12.mo50276a(this);
            } else {
                zl1 zl115 = this.f43512c;
                zl1 zl116 = this.f43513d[0];
                zl1 zl117 = nm12.f43512c;
                zl1 zl118 = nm12.f43513d[0];
                boolean h2 = zl116.mo50981h();
                if (!h2) {
                    zl12 = zl18.mo50984j(zl116);
                    zl1 = zl117.mo50984j(zl116);
                } else {
                    zl12 = zl18;
                    zl1 = zl117;
                }
                boolean h3 = zl118.mo50981h();
                if (!h3) {
                    zl17 = zl17.mo50984j(zl118);
                    zl13 = zl115.mo50984j(zl118);
                } else {
                    zl13 = zl115;
                }
                zl1 a8 = zl13.mo50975a(zl1);
                zl1 a9 = zl17.mo50975a(zl12);
                if (a9.mo50983i()) {
                    return a8.mo50983i() ? mo50274J() : i.mo50668u();
                }
                if (zl18.mo50983i()) {
                    nm1 A = mo62725A();
                    zl1 q2 = A.mo62747q();
                    zl1 r = A.mo50310r();
                    zl1 d2 = r.mo50975a(zl117).mo50977d(q2);
                    zl14 = d2.mo50989o().mo50975a(d2).mo50975a(q2).mo50975a(i.mo66316n());
                    if (zl14.mo50983i()) {
                        return new C8995d(i, zl14, i.mo66317o().mo50988n());
                    }
                    zl16 = d2.mo50984j(q2.mo50975a(zl14)).mo50975a(zl14).mo50975a(r).mo50977d(zl14).mo50975a(zl14);
                    zl15 = i.mo50666m(tl1.f44772b);
                } else {
                    zl1 o2 = a9.mo50989o();
                    zl1 j3 = a8.mo50984j(zl17);
                    zl1 j4 = a8.mo50984j(zl12);
                    zl1 j5 = j3.mo50984j(j4);
                    if (j5.mo50983i()) {
                        return new C8995d(i, j5, i.mo66317o().mo50988n());
                    }
                    zl1 j6 = a8.mo50984j(o2);
                    zl1 j7 = !h3 ? j6.mo50984j(zl118) : j6;
                    zl1 p = j4.mo50975a(o2).mo50990p(j7, zl115.mo50975a(zl116));
                    if (!h2) {
                        j7 = j7.mo50984j(zl116);
                    }
                    zl14 = j5;
                    zl1 zl119 = p;
                    zl15 = j7;
                    zl16 = zl119;
                }
                return new C8995d(i, zl14, zl16, new zl1[]{zl15});
            }
        }

        /* renamed from: d */
        public nm1 mo50277d() {
            return new C8995d((ul1) null, mo62737f(), mo62738g());
        }

        /* renamed from: h */
        public boolean mo50309h() {
            zl1 n = mo62744n();
            if (n.mo50983i()) {
                return false;
            }
            zl1 o = mo62745o();
            int j = mo62741j();
            return (j == 5 || j == 6) ? o.mo50993s() != n.mo50993s() : o.mo50977d(n).mo50993s();
        }

        /* renamed from: r */
        public zl1 mo50310r() {
            int j = mo62741j();
            if (j != 5 && j != 6) {
                return this.f43512c;
            }
            zl1 zl1 = this.f43511b;
            zl1 zl12 = this.f43512c;
            if (mo62751u() || zl1.mo50983i()) {
                return zl12;
            }
            zl1 j2 = zl12.mo50975a(zl1).mo50984j(zl1);
            if (6 != j) {
                return j2;
            }
            zl1 zl13 = this.f43513d[0];
            return !zl13.mo50981h() ? j2.mo50977d(zl13) : j2;
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
            int j = mo62741j();
            if (j == 0) {
                return new C8995d(this.f43510a, zl1, this.f43512c.mo50975a(zl1));
            } else if (j == 1) {
                zl1 zl12 = this.f43512c;
                zl1 zl13 = this.f43513d[0];
                return new C8995d(this.f43510a, zl1, zl12.mo50975a(zl1), new zl1[]{zl13});
            } else if (j == 5) {
                return new C8995d(this.f43510a, zl1, this.f43512c.mo50976b());
            } else if (j == 6) {
                zl1 zl14 = this.f43512c;
                zl1 zl15 = this.f43513d[0];
                return new C8995d(this.f43510a, zl1, zl14.mo50975a(zl15), new zl1[]{zl15});
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }
    }

    /* renamed from: nm1$e */
    public static class C8996e extends C8994c {
        public C8996e(ul1 ul1, zl1 zl1, zl1 zl12) {
            super(ul1, zl1, zl12);
        }

        public C8996e(ul1 ul1, zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
            super(ul1, zl1, zl12, zl1Arr);
        }

        /* renamed from: H */
        public nm1 mo50273H() {
            if (mo62751u()) {
                return this;
            }
            zl1 zl1 = this.f43512c;
            if (zl1.mo50983i()) {
                return this;
            }
            ul1 i = mo62740i();
            int q = i.mo66319q();
            if (q != 0) {
                return q != 4 ? mo50274J().mo50276a(this) : mo62762Q(false).mo50276a(this);
            }
            zl1 zl12 = this.f43511b;
            zl1 R = mo62763R(zl1);
            zl1 o = R.mo50989o();
            zl1 a = mo62761P(zl12.mo50989o()).mo50975a(mo62740i().mo66316n());
            zl1 r = mo62761P(zl12).mo50984j(o).mo50992r(a.mo50989o());
            if (r.mo50983i()) {
                return mo62740i().mo50668u();
            }
            zl1 g = r.mo50984j(R).mo50980g();
            zl1 j = r.mo50984j(g).mo50984j(a);
            zl1 r2 = o.mo50989o().mo50984j(g).mo50992r(j);
            zl1 a2 = r2.mo50992r(j).mo50984j(j.mo50975a(r2)).mo50975a(zl12);
            return new C8996e(i, a2, zl12.mo50992r(a2).mo50984j(r2).mo50992r(zl1));
        }

        /* renamed from: I */
        public nm1 mo62732I(int i) {
            zl1 zl1;
            int i2 = i;
            if (i2 < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            } else if (i2 == 0 || mo62751u()) {
                return this;
            } else {
                if (i2 == 1) {
                    return mo50274J();
                }
                ul1 i3 = mo62740i();
                zl1 zl12 = this.f43512c;
                if (zl12.mo50983i()) {
                    return i3.mo50668u();
                }
                int q = i3.mo66319q();
                zl1 n = i3.mo66316n();
                zl1 zl13 = this.f43511b;
                zl1[] zl1Arr = this.f43513d;
                zl1 m = zl1Arr.length < 1 ? i3.mo50666m(tl1.f44772b) : zl1Arr[0];
                if (!m.mo50981h() && q != 0) {
                    if (q == 1) {
                        zl1 = m.mo50989o();
                        zl13 = zl13.mo50984j(m);
                        zl12 = zl12.mo50984j(zl1);
                    } else if (q == 2) {
                        zl1 = null;
                    } else if (q == 4) {
                        n = mo62760O();
                    } else {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    n = mo62757L(m, zl1);
                }
                int i4 = 0;
                while (i4 < i2) {
                    if (zl12.mo50983i()) {
                        return i3.mo50668u();
                    }
                    zl1 P = mo62761P(zl13.mo50989o());
                    zl1 R = mo62763R(zl12);
                    zl1 j = R.mo50984j(zl12);
                    zl1 R2 = mo62763R(zl13.mo50984j(j));
                    zl1 R3 = mo62763R(j.mo50989o());
                    if (!n.mo50983i()) {
                        P = P.mo50975a(n);
                        n = mo62763R(R3.mo50984j(n));
                    }
                    zl1 r = P.mo50989o().mo50992r(mo62763R(R2));
                    zl12 = P.mo50984j(R2.mo50992r(r)).mo50992r(R3);
                    m = m.mo50981h() ? R : R.mo50984j(m);
                    i4++;
                    zl13 = r;
                }
                if (q == 0) {
                    zl1 g = m.mo50980g();
                    zl1 o = g.mo50989o();
                    return new C8996e(i3, zl13.mo50984j(o), zl12.mo50984j(o.mo50984j(g)));
                } else if (q == 1) {
                    return new C8996e(i3, zl13.mo50984j(m), zl12, new zl1[]{m.mo50984j(m.mo50989o())});
                } else if (q == 2) {
                    return new C8996e(i3, zl13, zl12, new zl1[]{m});
                } else if (q == 4) {
                    return new C8996e(i3, zl13, zl12, new zl1[]{m, n});
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
        }

        /* renamed from: J */
        public nm1 mo50274J() {
            zl1 zl1;
            zl1 zl12;
            if (mo62751u()) {
                return this;
            }
            ul1 i = mo62740i();
            zl1 zl13 = this.f43512c;
            if (zl13.mo50983i()) {
                return i.mo50668u();
            }
            int q = i.mo66319q();
            zl1 zl14 = this.f43511b;
            if (q == 0) {
                zl1 d = mo62761P(zl14.mo50989o()).mo50975a(mo62740i().mo66316n()).mo50977d(mo62763R(zl13));
                zl1 r = d.mo50989o().mo50992r(mo62763R(zl14));
                return new C8996e(i, r, d.mo50984j(zl14.mo50992r(r)).mo50992r(zl13));
            } else if (q == 1) {
                zl1 zl15 = this.f43513d[0];
                boolean h = zl15.mo50981h();
                zl1 n = i.mo66316n();
                if (!n.mo50983i() && !h) {
                    n = n.mo50984j(zl15.mo50989o());
                }
                zl1 a = n.mo50975a(mo62761P(zl14.mo50989o()));
                zl1 j = h ? zl13 : zl13.mo50984j(zl15);
                zl1 o = h ? zl13.mo50989o() : j.mo50984j(zl13);
                zl1 N = mo62759N(zl14.mo50984j(o));
                zl1 r2 = a.mo50989o().mo50992r(mo62763R(N));
                zl1 R = mo62763R(j);
                zl1 j2 = r2.mo50984j(R);
                zl1 R2 = mo62763R(o);
                return new C8996e(i, j2, N.mo50992r(r2).mo50984j(a).mo50992r(mo62763R(R2.mo50989o())), new zl1[]{mo62763R(h ? mo62763R(R2) : R.mo50989o()).mo50984j(j)});
            } else if (q == 2) {
                zl1 zl16 = this.f43513d[0];
                boolean h2 = zl16.mo50981h();
                zl1 o2 = zl13.mo50989o();
                zl1 o3 = o2.mo50989o();
                zl1 n2 = i.mo66316n();
                zl1 m = n2.mo50987m();
                if (m.mo50994t().equals(BigInteger.valueOf(3))) {
                    zl1 o4 = h2 ? zl16 : zl16.mo50989o();
                    zl1 = mo62761P(zl14.mo50975a(o4).mo50984j(zl14.mo50992r(o4)));
                    zl12 = o2.mo50984j(zl14);
                } else {
                    zl1 P = mo62761P(zl14.mo50989o());
                    if (!h2) {
                        if (!n2.mo50983i()) {
                            zl1 o5 = zl16.mo50989o().mo50989o();
                            if (m.mo67330c() < n2.mo67330c()) {
                                zl1 = P.mo50992r(o5.mo50984j(m));
                            } else {
                                n2 = o5.mo50984j(n2);
                            }
                        } else {
                            zl1 = P;
                        }
                        zl12 = zl14.mo50984j(o2);
                    }
                    zl1 = P.mo50975a(n2);
                    zl12 = zl14.mo50984j(o2);
                }
                zl1 N2 = mo62759N(zl12);
                zl1 r3 = zl1.mo50989o().mo50992r(mo62763R(N2));
                zl1 r4 = N2.mo50992r(r3).mo50984j(zl1).mo50992r(mo62758M(o3));
                zl1 R3 = mo62763R(zl13);
                if (!h2) {
                    R3 = R3.mo50984j(zl16);
                }
                return new C8996e(i, r3, r4, new zl1[]{R3});
            } else if (q == 4) {
                return mo62762Q(true);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        /* renamed from: K */
        public nm1 mo50275K(nm1 nm1) {
            if (this == nm1) {
                return mo50273H();
            }
            if (mo62751u()) {
                return nm1;
            }
            if (nm1.mo62751u()) {
                return mo50274J();
            }
            zl1 zl1 = this.f43512c;
            if (zl1.mo50983i()) {
                return nm1;
            }
            ul1 i = mo62740i();
            int q = i.mo66319q();
            if (q != 0) {
                return q != 4 ? mo50274J().mo50276a(nm1) : mo62762Q(false).mo50276a(nm1);
            }
            zl1 zl12 = this.f43511b;
            zl1 zl13 = nm1.f43511b;
            zl1 zl14 = nm1.f43512c;
            zl1 r = zl13.mo50992r(zl12);
            zl1 r2 = zl14.mo50992r(zl1);
            if (r.mo50983i()) {
                return r2.mo50983i() ? mo50273H() : this;
            }
            zl1 o = r.mo50989o();
            zl1 r3 = o.mo50984j(mo62763R(zl12).mo50975a(zl13)).mo50992r(r2.mo50989o());
            if (r3.mo50983i()) {
                return i.mo50668u();
            }
            zl1 g = r3.mo50984j(r).mo50980g();
            zl1 j = r3.mo50984j(g).mo50984j(r2);
            zl1 r4 = mo62763R(zl1).mo50984j(o).mo50984j(r).mo50984j(g).mo50992r(j);
            zl1 a = r4.mo50992r(j).mo50984j(j.mo50975a(r4)).mo50975a(zl13);
            return new C8996e(i, a, zl12.mo50992r(a).mo50984j(r4).mo50992r(zl1));
        }

        /* renamed from: L */
        public zl1 mo62757L(zl1 zl1, zl1 zl12) {
            zl1 n = mo62740i().mo66316n();
            if (n.mo50983i() || zl1.mo50981h()) {
                return n;
            }
            if (zl12 == null) {
                zl12 = zl1.mo50989o();
            }
            zl1 o = zl12.mo50989o();
            zl1 m = n.mo50987m();
            return m.mo67330c() < n.mo67330c() ? o.mo50984j(m).mo50987m() : o.mo50984j(n);
        }

        /* renamed from: M */
        public zl1 mo62758M(zl1 zl1) {
            return mo62759N(mo62763R(zl1));
        }

        /* renamed from: N */
        public zl1 mo62759N(zl1 zl1) {
            return mo62763R(mo62763R(zl1));
        }

        /* renamed from: O */
        public zl1 mo62760O() {
            zl1[] zl1Arr = this.f43513d;
            zl1 zl1 = zl1Arr[1];
            if (zl1 != null) {
                return zl1;
            }
            zl1 L = mo62757L(zl1Arr[0], (zl1) null);
            zl1Arr[1] = L;
            return L;
        }

        /* renamed from: P */
        public zl1 mo62761P(zl1 zl1) {
            return mo62763R(zl1).mo50975a(zl1);
        }

        /* renamed from: Q */
        public C8996e mo62762Q(boolean z) {
            zl1 zl1 = this.f43511b;
            zl1 zl12 = this.f43512c;
            zl1 zl13 = this.f43513d[0];
            zl1 O = mo62760O();
            zl1 a = mo62761P(zl1.mo50989o()).mo50975a(O);
            zl1 R = mo62763R(zl12);
            zl1 j = R.mo50984j(zl12);
            zl1 R2 = mo62763R(zl1.mo50984j(j));
            zl1 r = a.mo50989o().mo50992r(mo62763R(R2));
            zl1 R3 = mo62763R(j.mo50989o());
            zl1 r2 = a.mo50984j(R2.mo50992r(r)).mo50992r(R3);
            zl1 R4 = z ? mo62763R(R3.mo50984j(O)) : null;
            if (!zl13.mo50981h()) {
                R = R.mo50984j(zl13);
            }
            return new C8996e(mo62740i(), r, r2, new zl1[]{R, R4});
        }

        /* renamed from: R */
        public zl1 mo62763R(zl1 zl1) {
            return zl1.mo50975a(zl1);
        }

        /* JADX WARNING: type inference failed for: r17v0, types: [nm1] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0128  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0136  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p000.nm1 mo50276a(p000.nm1 r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                boolean r2 = r16.mo62751u()
                if (r2 == 0) goto L_0x000b
                return r1
            L_0x000b:
                boolean r2 = r17.mo62751u()
                if (r2 == 0) goto L_0x0012
                return r0
            L_0x0012:
                if (r0 != r1) goto L_0x0019
                nm1 r1 = r16.mo50274J()
                return r1
            L_0x0019:
                ul1 r2 = r16.mo62740i()
                int r3 = r2.mo66319q()
                zl1 r4 = r0.f43511b
                zl1 r5 = r0.f43512c
                zl1 r6 = r1.f43511b
                zl1 r7 = r1.f43512c
                if (r3 == 0) goto L_0x01d4
                r8 = 1
                r9 = 0
                if (r3 == r8) goto L_0x0142
                r10 = 4
                r11 = 2
                if (r3 == r11) goto L_0x003e
                if (r3 != r10) goto L_0x0036
                goto L_0x003e
            L_0x0036:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "unsupported coordinate system"
                r1.<init>(r2)
                throw r1
            L_0x003e:
                zl1[] r12 = r0.f43513d
                r12 = r12[r9]
                zl1[] r1 = r1.f43513d
                r1 = r1[r9]
                boolean r13 = r12.mo50981h()
                if (r13 != 0) goto L_0x00a3
                boolean r15 = r12.equals(r1)
                if (r15 == 0) goto L_0x00a3
                zl1 r1 = r4.mo50992r(r6)
                zl1 r7 = r5.mo50992r(r7)
                boolean r13 = r1.mo50983i()
                if (r13 == 0) goto L_0x0070
                boolean r1 = r7.mo50983i()
                if (r1 == 0) goto L_0x006b
                nm1 r1 = r16.mo50274J()
                return r1
            L_0x006b:
                nm1 r1 = r2.mo50668u()
                return r1
            L_0x0070:
                zl1 r13 = r1.mo50989o()
                zl1 r4 = r4.mo50984j(r13)
                zl1 r6 = r6.mo50984j(r13)
                zl1 r13 = r4.mo50992r(r6)
                zl1 r5 = r13.mo50984j(r5)
                zl1 r13 = r7.mo50989o()
                zl1 r13 = r13.mo50992r(r4)
                zl1 r6 = r13.mo50992r(r6)
                zl1 r4 = r4.mo50992r(r6)
                zl1 r4 = r4.mo50984j(r7)
                zl1 r4 = r4.mo50992r(r5)
                zl1 r1 = r1.mo50984j(r12)
            L_0x00a0:
                r14 = 0
                goto L_0x0126
            L_0x00a3:
                if (r13 == 0) goto L_0x00a6
                goto L_0x00b6
            L_0x00a6:
                zl1 r15 = r12.mo50989o()
                zl1 r6 = r15.mo50984j(r6)
                zl1 r15 = r15.mo50984j(r12)
                zl1 r7 = r15.mo50984j(r7)
            L_0x00b6:
                boolean r15 = r1.mo50981h()
                if (r15 == 0) goto L_0x00bd
                goto L_0x00cd
            L_0x00bd:
                zl1 r14 = r1.mo50989o()
                zl1 r4 = r14.mo50984j(r4)
                zl1 r14 = r14.mo50984j(r1)
                zl1 r5 = r14.mo50984j(r5)
            L_0x00cd:
                zl1 r6 = r4.mo50992r(r6)
                zl1 r7 = r5.mo50992r(r7)
                boolean r14 = r6.mo50983i()
                if (r14 == 0) goto L_0x00eb
                boolean r1 = r7.mo50983i()
                if (r1 == 0) goto L_0x00e6
                nm1 r1 = r16.mo50274J()
                return r1
            L_0x00e6:
                nm1 r1 = r2.mo50668u()
                return r1
            L_0x00eb:
                zl1 r14 = r6.mo50989o()
                zl1 r8 = r14.mo50984j(r6)
                zl1 r4 = r14.mo50984j(r4)
                zl1 r9 = r7.mo50989o()
                zl1 r9 = r9.mo50975a(r8)
                zl1 r11 = r0.mo62763R(r4)
                zl1 r9 = r9.mo50992r(r11)
                zl1 r4 = r4.mo50992r(r9)
                zl1 r4 = r4.mo50985k(r7, r8, r5)
                if (r13 != 0) goto L_0x0116
                zl1 r5 = r6.mo50984j(r12)
                goto L_0x0117
            L_0x0116:
                r5 = r6
            L_0x0117:
                if (r15 != 0) goto L_0x011e
                zl1 r1 = r5.mo50984j(r1)
                goto L_0x011f
            L_0x011e:
                r1 = r5
            L_0x011f:
                if (r1 != r6) goto L_0x0123
                r6 = r9
                goto L_0x0126
            L_0x0123:
                r6 = r9
                goto L_0x00a0
            L_0x0126:
                if (r3 != r10) goto L_0x0136
                zl1 r3 = r0.mo62757L(r1, r14)
                r5 = 2
                zl1[] r5 = new p000.zl1[r5]
                r8 = 0
                r5[r8] = r1
                r7 = 1
                r5[r7] = r3
                goto L_0x013c
            L_0x0136:
                r7 = 1
                r8 = 0
                zl1[] r5 = new p000.zl1[r7]
                r5[r8] = r1
            L_0x013c:
                nm1$e r1 = new nm1$e
                r1.<init>(r2, r6, r4, r5)
                return r1
            L_0x0142:
                r8 = r9
                zl1[] r3 = r0.f43513d
                r3 = r3[r8]
                zl1[] r1 = r1.f43513d
                r1 = r1[r8]
                boolean r8 = r3.mo50981h()
                boolean r9 = r1.mo50981h()
                if (r8 == 0) goto L_0x0156
                goto L_0x015a
            L_0x0156:
                zl1 r7 = r7.mo50984j(r3)
            L_0x015a:
                if (r9 == 0) goto L_0x015d
                goto L_0x0161
            L_0x015d:
                zl1 r5 = r5.mo50984j(r1)
            L_0x0161:
                zl1 r7 = r7.mo50992r(r5)
                if (r8 == 0) goto L_0x0168
                goto L_0x016c
            L_0x0168:
                zl1 r6 = r6.mo50984j(r3)
            L_0x016c:
                if (r9 == 0) goto L_0x016f
                goto L_0x0173
            L_0x016f:
                zl1 r4 = r4.mo50984j(r1)
            L_0x0173:
                zl1 r6 = r6.mo50992r(r4)
                boolean r10 = r6.mo50983i()
                if (r10 == 0) goto L_0x018d
                boolean r1 = r7.mo50983i()
                if (r1 == 0) goto L_0x0188
                nm1 r1 = r16.mo50274J()
                return r1
            L_0x0188:
                nm1 r1 = r2.mo50668u()
                return r1
            L_0x018d:
                if (r8 == 0) goto L_0x0191
                r3 = r1
                goto L_0x0198
            L_0x0191:
                if (r9 == 0) goto L_0x0194
                goto L_0x0198
            L_0x0194:
                zl1 r3 = r3.mo50984j(r1)
            L_0x0198:
                zl1 r1 = r6.mo50989o()
                zl1 r8 = r1.mo50984j(r6)
                zl1 r1 = r1.mo50984j(r4)
                zl1 r4 = r7.mo50989o()
                zl1 r4 = r4.mo50984j(r3)
                zl1 r4 = r4.mo50992r(r8)
                zl1 r9 = r0.mo62763R(r1)
                zl1 r4 = r4.mo50992r(r9)
                zl1 r6 = r6.mo50984j(r4)
                zl1 r1 = r1.mo50992r(r4)
                zl1 r1 = r1.mo50985k(r7, r5, r8)
                zl1 r3 = r8.mo50984j(r3)
                nm1$e r4 = new nm1$e
                r5 = 1
                zl1[] r5 = new p000.zl1[r5]
                r7 = 0
                r5[r7] = r3
                r4.<init>(r2, r6, r1, r5)
                return r4
            L_0x01d4:
                zl1 r1 = r6.mo50992r(r4)
                zl1 r3 = r7.mo50992r(r5)
                boolean r7 = r1.mo50983i()
                if (r7 == 0) goto L_0x01f2
                boolean r1 = r3.mo50983i()
                if (r1 == 0) goto L_0x01ed
                nm1 r1 = r16.mo50274J()
                return r1
            L_0x01ed:
                nm1 r1 = r2.mo50668u()
                return r1
            L_0x01f2:
                zl1 r1 = r3.mo50977d(r1)
                zl1 r3 = r1.mo50989o()
                zl1 r3 = r3.mo50992r(r4)
                zl1 r3 = r3.mo50992r(r6)
                zl1 r4 = r4.mo50992r(r3)
                zl1 r1 = r1.mo50984j(r4)
                zl1 r1 = r1.mo50992r(r5)
                nm1$e r4 = new nm1$e
                r4.<init>(r2, r3, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.nm1.C8996e.mo50276a(nm1):nm1");
        }

        /* renamed from: d */
        public nm1 mo50277d() {
            return new C8996e((ul1) null, mo62737f(), mo62738g());
        }

        /* renamed from: s */
        public zl1 mo62748s(int i) {
            return (i == 1 && 4 == mo62741j()) ? mo62760O() : nm1.super.mo62748s(i);
        }

        /* renamed from: z */
        public nm1 mo50278z() {
            if (mo62751u()) {
                return this;
            }
            ul1 i = mo62740i();
            return i.mo66319q() != 0 ? new C8996e(i, this.f43511b, this.f43512c.mo50987m(), this.f43513d) : new C8996e(i, this.f43511b, this.f43512c.mo50987m());
        }
    }

    public nm1(ul1 ul1, zl1 zl1, zl1 zl12) {
        this(ul1, zl1, zl12, m69813m(ul1));
    }

    public nm1(ul1 ul1, zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        this.f43514e = null;
        this.f43510a = ul1;
        this.f43511b = zl1;
        this.f43512c = zl12;
        this.f43513d = zl1Arr;
    }

    /* renamed from: m */
    public static zl1[] m69813m(ul1 ul1) {
        int q = ul1 == null ? 0 : ul1.mo66319q();
        if (q == 0 || q == 5) {
            return f43509f;
        }
        zl1 m = ul1.mo50666m(tl1.f44772b);
        if (!(q == 1 || q == 2)) {
            if (q == 3) {
                return new zl1[]{m, m, m};
            } else if (q == 4) {
                return new zl1[]{m, ul1.mo66316n()};
            } else if (q != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new zl1[]{m};
    }

    /* renamed from: A */
    public nm1 mo62725A() {
        int j;
        if (mo62751u() || (j = mo62741j()) == 0 || j == 5) {
            return this;
        }
        zl1 s = mo62748s(0);
        if (s.mo50981h()) {
            return this;
        }
        if (this.f43510a != null) {
            zl1 B = this.f43510a.mo50660B(bx0.m56184b());
            return mo62726B(s.mo50984j(B).mo50980g().mo50984j(B));
        }
        throw new IllegalStateException("Detached points must be in affine coordinates");
    }

    /* renamed from: B */
    public nm1 mo62726B(zl1 zl1) {
        int j = mo62741j();
        if (j != 1) {
            if (j == 2 || j == 3 || j == 4) {
                zl1 o = zl1.mo50989o();
                return mo62734c(o, o.mo50984j(zl1));
            } else if (j != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return mo62734c(zl1, zl1);
    }

    /* renamed from: C */
    public abstract boolean mo62727C();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r0 = r2.f43510a.mo66323w();
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo62728D() {
        /*
            r2 = this;
            java.math.BigInteger r0 = p000.tl1.f44772b
            ul1 r1 = r2.f43510a
            java.math.BigInteger r1 = r1.mo66318p()
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            ul1 r0 = r2.f43510a
            java.math.BigInteger r0 = r0.mo66323w()
            if (r0 == 0) goto L_0x0024
            nm1 r0 = p000.sl1.m71977p(r2, r0)
            boolean r0 = r0.mo62751u()
            if (r0 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nm1.mo62728D():boolean");
    }

    /* renamed from: E */
    public nm1 mo62729E(zl1 zl1) {
        return mo62751u() ? this : mo62740i().mo50665i(mo62744n().mo50984j(zl1), mo62745o(), mo62746p());
    }

    /* renamed from: F */
    public nm1 mo62730F(zl1 zl1) {
        return mo62751u() ? this : mo62740i().mo50665i(mo62744n(), mo62745o().mo50984j(zl1), mo62746p());
    }

    /* renamed from: G */
    public abstract nm1 mo62731G(nm1 nm1);

    /* renamed from: H */
    public nm1 mo50273H() {
        return mo50275K(this);
    }

    /* renamed from: I */
    public nm1 mo62732I(int i) {
        if (i >= 0) {
            nm1 nm1 = this;
            while (true) {
                i--;
                if (i < 0) {
                    return nm1;
                }
                nm1 = nm1.mo50274J();
            }
        } else {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
    }

    /* renamed from: J */
    public abstract nm1 mo50274J();

    /* renamed from: K */
    public nm1 mo50275K(nm1 nm1) {
        return mo50274J().mo50276a(nm1);
    }

    /* renamed from: a */
    public abstract nm1 mo50276a(nm1 nm1);

    /* renamed from: b */
    public void mo62733b() {
        if (!mo62752v()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    /* renamed from: c */
    public nm1 mo62734c(zl1 zl1, zl1 zl12) {
        return mo62740i().mo50664h(mo62744n().mo50984j(zl1), mo62745o().mo50984j(zl12));
    }

    /* renamed from: d */
    public abstract nm1 mo50277d();

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo62735e(p000.nm1 r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            ul1 r1 = r8.mo62740i()
            ul1 r2 = r9.mo62740i()
            r3 = 1
            if (r1 != 0) goto L_0x0011
            r4 = r3
            goto L_0x0012
        L_0x0011:
            r4 = r0
        L_0x0012:
            if (r2 != 0) goto L_0x0016
            r5 = r3
            goto L_0x0017
        L_0x0016:
            r5 = r0
        L_0x0017:
            boolean r6 = r8.mo62751u()
            boolean r7 = r9.mo62751u()
            if (r6 != 0) goto L_0x006f
            if (r7 == 0) goto L_0x0024
            goto L_0x006f
        L_0x0024:
            if (r4 == 0) goto L_0x0029
            if (r5 == 0) goto L_0x0029
            goto L_0x002f
        L_0x0029:
            if (r4 == 0) goto L_0x0031
            nm1 r9 = r9.mo62725A()
        L_0x002f:
            r1 = r8
            goto L_0x0051
        L_0x0031:
            if (r5 == 0) goto L_0x0038
            nm1 r1 = r8.mo62725A()
            goto L_0x0051
        L_0x0038:
            boolean r2 = r1.mo66315l(r2)
            if (r2 != 0) goto L_0x003f
            return r0
        L_0x003f:
            r2 = 2
            nm1[] r2 = new p000.nm1[r2]
            r2[r0] = r8
            nm1 r9 = r1.mo66324x(r9)
            r2[r3] = r9
            r1.mo66325y(r2)
            r1 = r2[r0]
            r9 = r2[r3]
        L_0x0051:
            zl1 r2 = r1.mo62747q()
            zl1 r4 = r9.mo62747q()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x006e
            zl1 r1 = r1.mo50310r()
            zl1 r9 = r9.mo50310r()
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L_0x006e
            r0 = r3
        L_0x006e:
            return r0
        L_0x006f:
            if (r6 == 0) goto L_0x007e
            if (r7 == 0) goto L_0x007e
            if (r4 != 0) goto L_0x007d
            if (r5 != 0) goto L_0x007d
            boolean r9 = r1.mo66315l(r2)
            if (r9 == 0) goto L_0x007e
        L_0x007d:
            r0 = r3
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nm1.mo62735e(nm1):boolean");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nm1)) {
            return false;
        }
        return mo62735e((nm1) obj);
    }

    /* renamed from: f */
    public zl1 mo62737f() {
        mo62733b();
        return mo62747q();
    }

    /* renamed from: g */
    public zl1 mo62738g() {
        mo62733b();
        return mo50310r();
    }

    /* renamed from: h */
    public abstract boolean mo50309h();

    public int hashCode() {
        ul1 i = mo62740i();
        int i2 = i == null ? 0 : ~i.hashCode();
        if (mo62751u()) {
            return i2;
        }
        nm1 A = mo62725A();
        return (i2 ^ (A.mo62747q().hashCode() * 17)) ^ (A.mo50310r().hashCode() * 257);
    }

    /* renamed from: i */
    public ul1 mo62740i() {
        return this.f43510a;
    }

    /* renamed from: j */
    public int mo62741j() {
        ul1 ul1 = this.f43510a;
        if (ul1 == null) {
            return 0;
        }
        return ul1.mo66319q();
    }

    /* renamed from: k */
    public final nm1 mo62742k() {
        return mo62725A().mo50277d();
    }

    /* renamed from: l */
    public byte[] mo62743l(boolean z) {
        if (mo62751u()) {
            return new byte[1];
        }
        nm1 A = mo62725A();
        byte[] e = A.mo62747q().mo67331e();
        if (z) {
            byte[] bArr = new byte[(e.length + 1)];
            bArr[0] = (byte) (A.mo50309h() ? 3 : 2);
            System.arraycopy(e, 0, bArr, 1, e.length);
            return bArr;
        }
        byte[] e2 = A.mo50310r().mo67331e();
        byte[] bArr2 = new byte[(e.length + e2.length + 1)];
        bArr2[0] = 4;
        System.arraycopy(e, 0, bArr2, 1, e.length);
        System.arraycopy(e2, 0, bArr2, e.length + 1, e2.length);
        return bArr2;
    }

    /* renamed from: n */
    public final zl1 mo62744n() {
        return this.f43511b;
    }

    /* renamed from: o */
    public final zl1 mo62745o() {
        return this.f43512c;
    }

    /* renamed from: p */
    public final zl1[] mo62746p() {
        return this.f43513d;
    }

    /* renamed from: q */
    public zl1 mo62747q() {
        return this.f43511b;
    }

    /* renamed from: r */
    public zl1 mo50310r() {
        return this.f43512c;
    }

    /* renamed from: s */
    public zl1 mo62748s(int i) {
        if (i >= 0) {
            zl1[] zl1Arr = this.f43513d;
            if (i < zl1Arr.length) {
                return zl1Arr[i];
            }
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo62749t(boolean z, boolean z2) {
        if (mo62751u()) {
            return true;
        }
        return !((b87) mo62740i().mo66305A(this, "bc_validity", new C8992a(z, z2))).mo50543b();
    }

    public String toString() {
        if (mo62751u()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(mo62744n());
        stringBuffer.append(',');
        stringBuffer.append(mo62745o());
        for (zl1 append : this.f43513d) {
            stringBuffer.append(',');
            stringBuffer.append(append);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public boolean mo62751u() {
        if (!(this.f43511b == null || this.f43512c == null)) {
            zl1[] zl1Arr = this.f43513d;
            if (zl1Arr.length <= 0 || !zl1Arr[0].mo50983i()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public boolean mo62752v() {
        int j = mo62741j();
        return j == 0 || j == 5 || mo62751u() || this.f43513d[0].mo50981h();
    }

    /* renamed from: w */
    public boolean mo62753w() {
        return mo62749t(false, true);
    }

    /* renamed from: x */
    public boolean mo62754x() {
        return mo62749t(false, false);
    }

    /* renamed from: y */
    public nm1 mo62755y(BigInteger bigInteger) {
        return mo62740i().mo66322v().mo51129a(this, bigInteger);
    }

    /* renamed from: z */
    public abstract nm1 mo50278z();
}
