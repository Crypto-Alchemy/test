package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Random;
import p000.nm1;
import p000.zl1;

/* renamed from: ul1 */
public abstract class ul1 {

    /* renamed from: a */
    public c22 f45109a;

    /* renamed from: b */
    public zl1 f45110b;

    /* renamed from: c */
    public zl1 f45111c;

    /* renamed from: d */
    public BigInteger f45112d;

    /* renamed from: e */
    public BigInteger f45113e;

    /* renamed from: f */
    public int f45114f = 0;

    /* renamed from: g */
    public yl1 f45115g = null;

    /* renamed from: h */
    public gm1 f45116h = null;

    /* renamed from: ul1$a */
    public class C9405a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f45117a;

        /* renamed from: b */
        public final /* synthetic */ int f45118b;

        /* renamed from: c */
        public final /* synthetic */ byte[] f45119c;

        public C9405a(int i, int i2, byte[] bArr) {
            this.f45117a = i;
            this.f45118b = i2;
            this.f45119c = bArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int i2;
            int i3 = this.f45118b;
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < this.f45117a; i5++) {
                int i6 = ((i5 ^ i) - 1) >> 31;
                int i7 = 0;
                while (true) {
                    i2 = this.f45118b;
                    if (i7 >= i2) {
                        break;
                    }
                    byte b = bArr[i7];
                    byte[] bArr3 = this.f45119c;
                    bArr[i7] = (byte) (b ^ (bArr3[i4 + i7] & i6));
                    bArr2[i7] = (byte) ((bArr3[(i2 + i4) + i7] & i6) ^ bArr2[i7]);
                    i7++;
                }
                i4 += i2 * 2;
            }
            return mo66327c(bArr, bArr2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int i2 = this.f45118b;
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[i2];
            int i3 = i * i2 * 2;
            int i4 = 0;
            while (true) {
                int i5 = this.f45118b;
                if (i4 >= i5) {
                    return mo66327c(bArr, bArr2);
                }
                byte[] bArr3 = this.f45119c;
                bArr[i4] = bArr3[i3 + i4];
                bArr2[i4] = bArr3[i5 + i3 + i4];
                i4++;
            }
        }

        /* renamed from: c */
        public final nm1 mo66327c(byte[] bArr, byte[] bArr2) {
            ul1 ul1 = ul1.this;
            return ul1.mo50664h(ul1.mo50666m(new BigInteger(1, bArr)), ul1.this.mo50666m(new BigInteger(1, bArr2)));
        }

        public int getSize() {
            return this.f45117a;
        }
    }

    /* renamed from: ul1$b */
    public static abstract class C9406b extends ul1 {

        /* renamed from: i */
        public BigInteger[] f45121i = null;

        public C9406b(int i, int i2, int i3, int i4) {
            super(m72873E(i, i2, i3, i4));
        }

        /* renamed from: E */
        public static c22 m72873E(int i, int i2, int i3, int i4) {
            if (i2 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            } else if (i3 == 0) {
                if (i4 == 0) {
                    return d22.m56620a(new int[]{0, i2, i});
                }
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            } else if (i3 <= i2) {
                throw new IllegalArgumentException("k2 must be > k1");
            } else if (i4 > i3) {
                return d22.m56620a(new int[]{0, i2, i3, i4, i});
            } else {
                throw new IllegalArgumentException("k3 must be > k2");
            }
        }

        /* renamed from: G */
        public static BigInteger m72874G(SecureRandom secureRandom, int i) {
            BigInteger d;
            do {
                d = i10.m58764d(i, secureRandom);
            } while (d.signum() <= 0);
            return d;
        }

        /* renamed from: B */
        public zl1 mo50660B(SecureRandom secureRandom) {
            int t = mo50667t();
            return mo50666m(m72874G(secureRandom, t)).mo50984j(mo50666m(m72874G(secureRandom, t)));
        }

        /* renamed from: F */
        public synchronized BigInteger[] mo66328F() {
            if (this.f45121i == null) {
                this.f45121i = ar6.m55660f(this);
            }
            return this.f45121i;
        }

        /* renamed from: H */
        public boolean mo50699H() {
            return this.f45112d != null && this.f45113e != null && this.f45111c.mo50981h() && (this.f45110b.mo50983i() || this.f45110b.mo50981h());
        }

        /* renamed from: I */
        public zl1 mo66329I(zl1 zl1) {
            zl1 zl12;
            zl1.C9679a aVar = (zl1.C9679a) zl1;
            boolean v = aVar.mo50996v();
            if (v && aVar.mo50997w() != 0) {
                return null;
            }
            int t = mo50667t();
            if ((t & 1) != 0) {
                zl1 u = aVar.mo50995u();
                if (v || u.mo50989o().mo50975a(u).mo50975a(zl1).mo50983i()) {
                    return u;
                }
                return null;
            } else if (zl1.mo50983i()) {
                return zl1;
            } else {
                zl1 m = mo50666m(tl1.f44771a);
                Random random = new Random();
                do {
                    zl1 m2 = mo50666m(new BigInteger(t, random));
                    zl1 zl13 = zl1;
                    zl12 = m;
                    for (int i = 1; i < t; i++) {
                        zl1 o = zl13.mo50989o();
                        zl12 = zl12.mo50989o().mo50975a(o.mo50984j(m2));
                        zl13 = o.mo50975a(zl1);
                    }
                    if (!zl13.mo50983i()) {
                        return null;
                    }
                } while (zl12.mo50989o().mo50975a(zl12).mo50983i());
                return zl12;
            }
        }

        /* renamed from: g */
        public nm1 mo66311g(BigInteger bigInteger, BigInteger bigInteger2) {
            zl1 m = mo50666m(bigInteger);
            zl1 m2 = mo50666m(bigInteger2);
            int q = mo66319q();
            if (q == 5 || q == 6) {
                if (!m.mo50983i()) {
                    m2 = m2.mo50977d(m).mo50975a(m);
                } else if (!m2.mo50989o().equals(mo66317o())) {
                    throw new IllegalArgumentException();
                }
            }
            return mo50664h(m, m2);
        }

        /* renamed from: k */
        public nm1 mo66314k(int i, BigInteger bigInteger) {
            zl1 zl1;
            zl1 m = mo50666m(bigInteger);
            if (m.mo50983i()) {
                zl1 = mo66317o().mo50988n();
            } else {
                zl1 I = mo66329I(m.mo50989o().mo50980g().mo50984j(mo66317o()).mo50975a(mo66316n()).mo50975a(m));
                if (I != null) {
                    boolean s = I.mo50993s();
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    if (s != z) {
                        I = I.mo50976b();
                    }
                    int q = mo66319q();
                    zl1 = (q == 5 || q == 6) ? I.mo50975a(m) : I.mo50984j(m);
                } else {
                    zl1 = null;
                }
            }
            if (zl1 != null) {
                return mo50664h(m, zl1);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }
    }

    /* renamed from: ul1$c */
    public static abstract class C9407c extends ul1 {
        public C9407c(BigInteger bigInteger) {
            super(d22.m56621b(bigInteger));
        }

        /* renamed from: E */
        public static BigInteger m72881E(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger d = i10.m58764d(bigInteger.bitLength(), secureRandom);
                if (d.signum() > 0 && d.compareTo(bigInteger) < 0) {
                    return d;
                }
            }
        }

        /* renamed from: B */
        public zl1 mo50660B(SecureRandom secureRandom) {
            BigInteger b = mo66321s().mo50779b();
            return mo50666m(m72881E(secureRandom, b)).mo50984j(mo50666m(m72881E(secureRandom, b)));
        }

        /* renamed from: k */
        public nm1 mo66314k(int i, BigInteger bigInteger) {
            zl1 m = mo50666m(bigInteger);
            zl1 n = m.mo50989o().mo50975a(this.f45110b).mo50984j(m).mo50975a(this.f45111c).mo50988n();
            if (n != null) {
                boolean s = n.mo50993s();
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                if (s != z) {
                    n = n.mo50987m();
                }
                return mo50664h(m, n);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }
    }

    /* renamed from: ul1$d */
    public class C9408d {

        /* renamed from: a */
        public int f45122a;

        /* renamed from: b */
        public yl1 f45123b;

        /* renamed from: c */
        public gm1 f45124c;

        public C9408d(int i, yl1 yl1, gm1 gm1) {
            this.f45122a = i;
            this.f45123b = yl1;
            this.f45124c = gm1;
        }

        /* renamed from: a */
        public ul1 mo66330a() {
            if (ul1.this.mo50661C(this.f45122a)) {
                ul1 c = ul1.this.mo50662c();
                if (c != ul1.this) {
                    synchronized (c) {
                        c.f45114f = this.f45122a;
                        c.f45115g = this.f45123b;
                        c.f45116h = this.f45124c;
                    }
                    return c;
                }
                throw new IllegalStateException("implementation returned current curve");
            }
            throw new IllegalStateException("unsupported coordinate system");
        }

        /* renamed from: b */
        public C9408d mo66331b(yl1 yl1) {
            this.f45123b = yl1;
            return this;
        }
    }

    /* renamed from: ul1$e */
    public static class C9409e extends C9406b {

        /* renamed from: j */
        public int f45126j;

        /* renamed from: k */
        public int f45127k;

        /* renamed from: l */
        public int f45128l;

        /* renamed from: m */
        public int f45129m;

        /* renamed from: n */
        public nm1.C8995d f45130n;

        /* renamed from: ul1$e$a */
        public class C9410a extends C6925c6 {

            /* renamed from: a */
            public final /* synthetic */ int f45131a;

            /* renamed from: b */
            public final /* synthetic */ int f45132b;

            /* renamed from: c */
            public final /* synthetic */ long[] f45133c;

            /* renamed from: d */
            public final /* synthetic */ int[] f45134d;

            public C9410a(int i, int i2, long[] jArr, int[] iArr) {
                this.f45131a = i;
                this.f45132b = i2;
                this.f45133c = jArr;
                this.f45134d = iArr;
            }

            /* renamed from: a */
            public nm1 mo50669a(int i) {
                int i2;
                long[] k = p34.m70887k(this.f45132b);
                long[] k2 = p34.m70887k(this.f45132b);
                int i3 = 0;
                for (int i4 = 0; i4 < this.f45131a; i4++) {
                    long j = (long) (((i4 ^ i) - 1) >> 31);
                    int i5 = 0;
                    while (true) {
                        i2 = this.f45132b;
                        if (i5 >= i2) {
                            break;
                        }
                        long j2 = k[i5];
                        long[] jArr = this.f45133c;
                        k[i5] = j2 ^ (jArr[i3 + i5] & j);
                        k2[i5] = k2[i5] ^ (jArr[(i2 + i3) + i5] & j);
                        i5++;
                    }
                    i3 += i2 * 2;
                }
                return mo66333c(k, k2);
            }

            /* renamed from: b */
            public nm1 mo50670b(int i) {
                long[] k = p34.m70887k(this.f45132b);
                long[] k2 = p34.m70887k(this.f45132b);
                int i2 = i * this.f45132b * 2;
                int i3 = 0;
                while (true) {
                    int i4 = this.f45132b;
                    if (i3 >= i4) {
                        return mo66333c(k, k2);
                    }
                    long[] jArr = this.f45133c;
                    k[i3] = jArr[i2 + i3];
                    k2[i3] = jArr[i4 + i2 + i3];
                    i3++;
                }
            }

            /* renamed from: c */
            public final nm1 mo66333c(long[] jArr, long[] jArr2) {
                return C9409e.this.mo50664h(new zl1.C9681c(C9409e.this.f45126j, this.f45134d, new bl3(jArr)), new zl1.C9681c(C9409e.this.f45126j, this.f45134d, new bl3(jArr2)));
            }

            public int getSize() {
                return this.f45131a;
            }
        }

        public C9409e(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public C9409e(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.f45126j = i;
            this.f45127k = i2;
            this.f45128l = i3;
            this.f45129m = i4;
            this.f45112d = bigInteger3;
            this.f45113e = bigInteger4;
            this.f45130n = new nm1.C8995d(this, (zl1) null, (zl1) null);
            this.f45110b = mo50666m(bigInteger);
            this.f45111c = mo50666m(bigInteger2);
            this.f45114f = 6;
        }

        public C9409e(int i, int i2, int i3, int i4, zl1 zl1, zl1 zl12, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.f45126j = i;
            this.f45127k = i2;
            this.f45128l = i3;
            this.f45129m = i4;
            this.f45112d = bigInteger;
            this.f45113e = bigInteger2;
            this.f45130n = new nm1.C8995d(this, (zl1) null, (zl1) null);
            this.f45110b = zl1;
            this.f45111c = zl12;
            this.f45114f = 6;
        }

        public C9409e(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        /* renamed from: C */
        public boolean mo50661C(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        /* renamed from: K */
        public boolean mo66332K() {
            return this.f45128l == 0 && this.f45129m == 0;
        }

        /* renamed from: c */
        public ul1 mo50662c() {
            return new C9409e(this.f45126j, this.f45127k, this.f45128l, this.f45129m, this.f45110b, this.f45111c, this.f45112d, this.f45113e);
        }

        /* renamed from: e */
        public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
            int i3 = (this.f45126j + 63) >>> 6;
            int[] iArr = mo66332K() ? new int[]{this.f45127k} : new int[]{this.f45127k, this.f45128l, this.f45129m};
            long[] jArr = new long[(i2 * i3 * 2)];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                nm1 nm1 = nm1Arr[i + i5];
                ((zl1.C9681c) nm1.mo62744n()).f46410j.mo50636m(jArr, i4);
                int i6 = i4 + i3;
                ((zl1.C9681c) nm1.mo62745o()).f46410j.mo50636m(jArr, i6);
                i4 = i6 + i3;
            }
            return new C9410a(i2, i3, jArr, iArr);
        }

        /* renamed from: f */
        public gm1 mo51274f() {
            return mo50699H() ? new zf7() : ul1.super.mo51274f();
        }

        /* renamed from: h */
        public nm1 mo50664h(zl1 zl1, zl1 zl12) {
            return new nm1.C8995d(this, zl1, zl12);
        }

        /* renamed from: i */
        public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
            return new nm1.C8995d(this, zl1, zl12, zl1Arr);
        }

        /* renamed from: m */
        public zl1 mo50666m(BigInteger bigInteger) {
            return new zl1.C9681c(this.f45126j, this.f45127k, this.f45128l, this.f45129m, bigInteger);
        }

        /* renamed from: t */
        public int mo50667t() {
            return this.f45126j;
        }

        /* renamed from: u */
        public nm1 mo50668u() {
            return this.f45130n;
        }
    }

    /* renamed from: ul1$f */
    public static class C9411f extends C9407c {

        /* renamed from: i */
        public BigInteger f45136i;

        /* renamed from: j */
        public BigInteger f45137j;

        /* renamed from: k */
        public nm1.C8996e f45138k;

        public C9411f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, (BigInteger) null, (BigInteger) null);
        }

        public C9411f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f45136i = bigInteger;
            this.f45137j = zl1.C9682d.m75059u(bigInteger);
            this.f45138k = new nm1.C8996e(this, (zl1) null, (zl1) null);
            this.f45110b = mo50666m(bigInteger2);
            this.f45111c = mo50666m(bigInteger3);
            this.f45112d = bigInteger4;
            this.f45113e = bigInteger5;
            this.f45114f = 4;
        }

        public C9411f(BigInteger bigInteger, BigInteger bigInteger2, zl1 zl1, zl1 zl12, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f45136i = bigInteger;
            this.f45137j = bigInteger2;
            this.f45138k = new nm1.C8996e(this, (zl1) null, (zl1) null);
            this.f45110b = zl1;
            this.f45111c = zl12;
            this.f45112d = bigInteger3;
            this.f45113e = bigInteger4;
            this.f45114f = 4;
        }

        /* renamed from: C */
        public boolean mo50661C(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        /* renamed from: c */
        public ul1 mo50662c() {
            return new C9411f(this.f45136i, this.f45137j, this.f45110b, this.f45111c, this.f45112d, this.f45113e);
        }

        /* renamed from: h */
        public nm1 mo50664h(zl1 zl1, zl1 zl12) {
            return new nm1.C8996e(this, zl1, zl12);
        }

        /* renamed from: i */
        public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
            return new nm1.C8996e(this, zl1, zl12, zl1Arr);
        }

        /* renamed from: m */
        public zl1 mo50666m(BigInteger bigInteger) {
            return new zl1.C9682d(this.f45136i, this.f45137j, bigInteger);
        }

        /* renamed from: t */
        public int mo50667t() {
            return this.f45136i.bitLength();
        }

        /* renamed from: u */
        public nm1 mo50668u() {
            return this.f45138k;
        }

        /* renamed from: x */
        public nm1 mo66324x(nm1 nm1) {
            int q;
            if (this == nm1.mo62740i() || mo66319q() != 2 || nm1.mo62751u() || ((q = nm1.mo62740i().mo66319q()) != 2 && q != 3 && q != 4)) {
                return ul1.super.mo66324x(nm1);
            }
            return new nm1.C8996e(this, mo50666m(nm1.f43511b.mo50994t()), mo50666m(nm1.f43512c.mo50994t()), new zl1[]{mo50666m(nm1.f43513d[0].mo50994t())});
        }
    }

    public ul1(c22 c22) {
        this.f45109a = c22;
    }

    /* renamed from: A */
    public vt4 mo66305A(nm1 nm1, String str, ut4 ut4) {
        Hashtable hashtable;
        vt4 a;
        mo66307a(nm1);
        synchronized (nm1) {
            hashtable = nm1.f43514e;
            if (hashtable == null) {
                hashtable = new Hashtable(4);
                nm1.f43514e = hashtable;
            }
        }
        synchronized (hashtable) {
            vt4 vt4 = (vt4) hashtable.get(str);
            a = ut4.mo56012a(vt4);
            if (a != vt4) {
                hashtable.put(str, a);
            }
        }
        return a;
    }

    /* renamed from: B */
    public abstract zl1 mo50660B(SecureRandom secureRandom);

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 0;
    }

    /* renamed from: D */
    public nm1 mo66306D(BigInteger bigInteger, BigInteger bigInteger2) {
        nm1 g = mo66311g(bigInteger, bigInteger2);
        if (g.mo62753w()) {
            return g;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    /* renamed from: a */
    public void mo66307a(nm1 nm1) {
        if (nm1 == null || this != nm1.mo62740i()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    /* renamed from: b */
    public void mo66308b(nm1[] nm1Arr, int i, int i2) {
        if (nm1Arr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        } else if (i < 0 || i2 < 0 || i > nm1Arr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        } else {
            int i3 = 0;
            while (i3 < i2) {
                nm1 nm1 = nm1Arr[i + i3];
                if (nm1 == null || this == nm1.mo62740i()) {
                    i3++;
                } else {
                    throw new IllegalArgumentException("'points' entries must be null or on this curve");
                }
            }
        }
    }

    /* renamed from: c */
    public abstract ul1 mo50662c();

    /* renamed from: d */
    public synchronized C9408d mo66309d() {
        return new C9408d(this.f45114f, this.f45115g, this.f45116h);
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int t = (mo50667t() + 7) >>> 3;
        byte[] bArr = new byte[(i2 * t * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            byte[] byteArray = nm1.mo62744n().mo50994t().toByteArray();
            byte[] byteArray2 = nm1.mo62745o().mo50994t().toByteArray();
            int i5 = 1;
            int i6 = byteArray.length > t ? 1 : 0;
            int length = byteArray.length - i6;
            if (byteArray2.length <= t) {
                i5 = 0;
            }
            int length2 = byteArray2.length - i5;
            int i7 = i3 + t;
            System.arraycopy(byteArray, i6, bArr, i7 - length, length);
            i3 = i7 + t;
            System.arraycopy(byteArray2, i5, bArr, i3 - length2, length2);
        }
        return new C9405a(i2, t, bArr);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ul1) && mo66315l((ul1) obj));
    }

    /* renamed from: f */
    public gm1 mo51274f() {
        yl1 yl1 = this.f45115g;
        return yl1 instanceof pe2 ? new qe2(this, (pe2) yl1) : new tf7();
    }

    /* renamed from: g */
    public nm1 mo66311g(BigInteger bigInteger, BigInteger bigInteger2) {
        return mo50664h(mo50666m(bigInteger), mo50666m(bigInteger2));
    }

    /* renamed from: h */
    public abstract nm1 mo50664h(zl1 zl1, zl1 zl12);

    public int hashCode() {
        return (mo66321s().hashCode() ^ gx2.m58283c(mo66316n().mo50994t().hashCode(), 8)) ^ gx2.m58283c(mo66317o().mo50994t().hashCode(), 16);
    }

    /* renamed from: i */
    public abstract nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr);

    /* renamed from: j */
    public nm1 mo66313j(byte[] bArr) {
        nm1 nm1;
        int t = (mo50667t() + 7) / 8;
        boolean z = false;
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length == t + 1) {
                    nm1 = mo66314k(b & 1, i10.m58765e(bArr, 1, t));
                    if (!nm1.mo62749t(true, true)) {
                        throw new IllegalArgumentException("Invalid point");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b, 16));
                } else if (bArr.length == (t * 2) + 1) {
                    BigInteger e = i10.m58765e(bArr, 1, t);
                    BigInteger e2 = i10.m58765e(bArr, t + 1, t);
                    boolean testBit = e2.testBit(0);
                    if (b == 7) {
                        z = true;
                    }
                    if (testBit == z) {
                        nm1 = mo66306D(e, e2);
                    } else {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
            } else if (bArr.length == (t * 2) + 1) {
                nm1 = mo66306D(i10.m58765e(bArr, 1, t), i10.m58765e(bArr, t + 1, t));
            } else {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            }
        } else if (bArr.length == 1) {
            nm1 = mo50668u();
        } else {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        }
        if (b == 0 || !nm1.mo62751u()) {
            return nm1;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    /* renamed from: k */
    public abstract nm1 mo66314k(int i, BigInteger bigInteger);

    /* renamed from: l */
    public boolean mo66315l(ul1 ul1) {
        return this == ul1 || (ul1 != null && mo66321s().equals(ul1.mo66321s()) && mo66316n().mo50994t().equals(ul1.mo66316n().mo50994t()) && mo66317o().mo50994t().equals(ul1.mo66317o().mo50994t()));
    }

    /* renamed from: m */
    public abstract zl1 mo50666m(BigInteger bigInteger);

    /* renamed from: n */
    public zl1 mo66316n() {
        return this.f45110b;
    }

    /* renamed from: o */
    public zl1 mo66317o() {
        return this.f45111c;
    }

    /* renamed from: p */
    public BigInteger mo66318p() {
        return this.f45113e;
    }

    /* renamed from: q */
    public int mo66319q() {
        return this.f45114f;
    }

    /* renamed from: r */
    public yl1 mo66320r() {
        return this.f45115g;
    }

    /* renamed from: s */
    public c22 mo66321s() {
        return this.f45109a;
    }

    /* renamed from: t */
    public abstract int mo50667t();

    /* renamed from: u */
    public abstract nm1 mo50668u();

    /* renamed from: v */
    public gm1 mo66322v() {
        if (this.f45116h == null) {
            this.f45116h = mo51274f();
        }
        return this.f45116h;
    }

    /* renamed from: w */
    public BigInteger mo66323w() {
        return this.f45112d;
    }

    /* renamed from: x */
    public nm1 mo66324x(nm1 nm1) {
        if (this == nm1.mo62740i()) {
            return nm1;
        }
        if (nm1.mo62751u()) {
            return mo50668u();
        }
        nm1 A = nm1.mo62725A();
        return mo66311g(A.mo62747q().mo50994t(), A.mo50310r().mo50994t());
    }

    /* renamed from: y */
    public void mo66325y(nm1[] nm1Arr) {
        mo66326z(nm1Arr, 0, nm1Arr.length, (zl1) null);
    }

    /* renamed from: z */
    public void mo66326z(nm1[] nm1Arr, int i, int i2, zl1 zl1) {
        mo66308b(nm1Arr, i, i2);
        int q = mo66319q();
        if (q != 0 && q != 5) {
            zl1[] zl1Arr = new zl1[i2];
            int[] iArr = new int[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i + i4;
                nm1 nm1 = nm1Arr[i5];
                if (nm1 != null && (zl1 != null || !nm1.mo62752v())) {
                    zl1Arr[i3] = nm1.mo62748s(0);
                    iArr[i3] = i5;
                    i3++;
                }
            }
            if (i3 != 0) {
                sl1.m71976o(zl1Arr, 0, i3, zl1);
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = iArr[i6];
                    nm1Arr[i7] = nm1Arr[i7].mo62726B(zl1Arr[i6]);
                }
            }
        } else if (zl1 != null) {
            throw new IllegalArgumentException("'iso' not valid for affine coordinates");
        }
    }
}
