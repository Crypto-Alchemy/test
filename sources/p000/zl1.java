package p000;

import java.math.BigInteger;
import java.util.Random;

/* renamed from: zl1 */
public abstract class zl1 implements tl1 {

    /* renamed from: zl1$a */
    public static abstract class C9679a extends zl1 {
        /* renamed from: u */
        public zl1 mo50995u() {
            int f = mo50979f();
            if ((f & 1) != 0) {
                int i = (f + 1) >>> 1;
                int a = 31 - gx2.m58281a(i);
                zl1 zl1 = this;
                int i2 = 1;
                while (a > 0) {
                    zl1 = zl1.mo50991q(i2 << 1).mo50975a(zl1);
                    a--;
                    i2 = i >>> a;
                    if ((i2 & 1) != 0) {
                        zl1 = zl1.mo50991q(2).mo50975a(this);
                    }
                }
                return zl1;
            }
            throw new IllegalStateException("Half-trace only defined for odd m");
        }

        /* renamed from: v */
        public boolean mo50996v() {
            return false;
        }

        /* renamed from: w */
        public int mo50997w() {
            int f = mo50979f();
            int a = 31 - gx2.m58281a(f);
            zl1 zl1 = this;
            int i = 1;
            while (a > 0) {
                zl1 = zl1.mo50991q(i).mo50975a(zl1);
                a--;
                i = f >>> a;
                if ((i & 1) != 0) {
                    zl1 = zl1.mo50989o().mo50975a(this);
                }
            }
            if (zl1.mo50983i()) {
                return 0;
            }
            if (zl1.mo50981h()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    /* renamed from: zl1$b */
    public static abstract class C9680b extends zl1 {
    }

    /* renamed from: zl1$c */
    public static class C9681c extends C9679a {

        /* renamed from: g */
        public int f46407g;

        /* renamed from: h */
        public int f46408h;

        /* renamed from: i */
        public int[] f46409i;

        /* renamed from: j */
        public bl3 f46410j;

        public C9681c(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.f46407g = 2;
                this.f46409i = new int[]{i2};
            } else if (i3 >= i4) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            } else if (i3 > 0) {
                this.f46407g = 3;
                this.f46409i = new int[]{i2, i3, i4};
            } else {
                throw new IllegalArgumentException("k2 must be larger than 0");
            }
            this.f46408h = i;
            this.f46410j = new bl3(bigInteger);
        }

        public C9681c(int i, int[] iArr, bl3 bl3) {
            this.f46408h = i;
            this.f46407g = iArr.length == 1 ? 2 : 3;
            this.f46409i = iArr;
            this.f46410j = bl3;
        }

        /* renamed from: a */
        public zl1 mo50975a(zl1 zl1) {
            bl3 bl3 = (bl3) this.f46410j.clone();
            bl3.mo50634h(((C9681c) zl1).f46410j, 0);
            return new C9681c(this.f46408h, this.f46409i, bl3);
        }

        /* renamed from: b */
        public zl1 mo50976b() {
            return new C9681c(this.f46408h, this.f46409i, this.f46410j.mo50632f());
        }

        /* renamed from: c */
        public int mo67330c() {
            return this.f46410j.mo50637o();
        }

        /* renamed from: d */
        public zl1 mo50977d(zl1 zl1) {
            return mo50984j(zl1.mo50980g());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9681c)) {
                return false;
            }
            C9681c cVar = (C9681c) obj;
            return this.f46408h == cVar.f46408h && this.f46407g == cVar.f46407g && C9367tq.m72419c(this.f46409i, cVar.f46409i) && this.f46410j.equals(cVar.f46410j);
        }

        /* renamed from: f */
        public int mo50979f() {
            return this.f46408h;
        }

        /* renamed from: g */
        public zl1 mo50980g() {
            int i = this.f46408h;
            int[] iArr = this.f46409i;
            return new C9681c(i, iArr, this.f46410j.mo50620B(i, iArr));
        }

        /* renamed from: h */
        public boolean mo50981h() {
            return this.f46410j.mo50642y();
        }

        public int hashCode() {
            return (this.f46410j.hashCode() ^ this.f46408h) ^ C9367tq.m72440x(this.f46409i);
        }

        /* renamed from: i */
        public boolean mo50983i() {
            return this.f46410j.mo50643z();
        }

        /* renamed from: j */
        public zl1 mo50984j(zl1 zl1) {
            int i = this.f46408h;
            int[] iArr = this.f46409i;
            return new C9681c(i, iArr, this.f46410j.mo50621C(((C9681c) zl1).f46410j, i, iArr));
        }

        /* renamed from: k */
        public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
            return mo50986l(zl1, zl12, zl13);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: bl3} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p000.zl1 mo50986l(p000.zl1 r5, p000.zl1 r6, p000.zl1 r7) {
            /*
                r4 = this;
                bl3 r0 = r4.f46410j
                zl1$c r5 = (p000.zl1.C9681c) r5
                bl3 r5 = r5.f46410j
                zl1$c r6 = (p000.zl1.C9681c) r6
                bl3 r6 = r6.f46410j
                zl1$c r7 = (p000.zl1.C9681c) r7
                bl3 r7 = r7.f46410j
                int r1 = r4.f46408h
                int[] r2 = r4.f46409i
                bl3 r1 = r0.mo50624F(r5, r1, r2)
                int r2 = r4.f46408h
                int[] r3 = r4.f46409i
                bl3 r6 = r6.mo50624F(r7, r2, r3)
                if (r1 == r0) goto L_0x0022
                if (r1 != r5) goto L_0x0029
            L_0x0022:
                java.lang.Object r5 = r1.clone()
                r1 = r5
                bl3 r1 = (p000.bl3) r1
            L_0x0029:
                r5 = 0
                r1.mo50634h(r6, r5)
                int r5 = r4.f46408h
                int[] r6 = r4.f46409i
                r1.mo50625H(r5, r6)
                zl1$c r5 = new zl1$c
                int r6 = r4.f46408h
                int[] r7 = r4.f46409i
                r5.<init>(r6, r7, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.zl1.C9681c.mo50986l(zl1, zl1, zl1):zl1");
        }

        /* renamed from: m */
        public zl1 mo50987m() {
            return this;
        }

        /* renamed from: n */
        public zl1 mo50988n() {
            return (this.f46410j.mo50643z() || this.f46410j.mo50642y()) ? this : mo50991q(this.f46408h - 1);
        }

        /* renamed from: o */
        public zl1 mo50989o() {
            int i = this.f46408h;
            int[] iArr = this.f46409i;
            return new C9681c(i, iArr, this.f46410j.mo50622D(i, iArr));
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: bl3} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p000.zl1 mo50990p(p000.zl1 r5, p000.zl1 r6) {
            /*
                r4 = this;
                bl3 r0 = r4.f46410j
                zl1$c r5 = (p000.zl1.C9681c) r5
                bl3 r5 = r5.f46410j
                zl1$c r6 = (p000.zl1.C9681c) r6
                bl3 r6 = r6.f46410j
                int r1 = r4.f46408h
                int[] r2 = r4.f46409i
                bl3 r1 = r0.mo50627S(r1, r2)
                int r2 = r4.f46408h
                int[] r3 = r4.f46409i
                bl3 r5 = r5.mo50624F(r6, r2, r3)
                if (r1 != r0) goto L_0x0023
                java.lang.Object r6 = r1.clone()
                r1 = r6
                bl3 r1 = (p000.bl3) r1
            L_0x0023:
                r6 = 0
                r1.mo50634h(r5, r6)
                int r5 = r4.f46408h
                int[] r6 = r4.f46409i
                r1.mo50625H(r5, r6)
                zl1$c r5 = new zl1$c
                int r6 = r4.f46408h
                int[] r0 = r4.f46409i
                r5.<init>(r6, r0, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.zl1.C9681c.mo50990p(zl1, zl1):zl1");
        }

        /* renamed from: q */
        public zl1 mo50991q(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.f46408h;
            int[] iArr = this.f46409i;
            return new C9681c(i2, iArr, this.f46410j.mo50623E(i, i2, iArr));
        }

        /* renamed from: r */
        public zl1 mo50992r(zl1 zl1) {
            return mo50975a(zl1);
        }

        /* renamed from: s */
        public boolean mo50993s() {
            return this.f46410j.mo50628V();
        }

        /* renamed from: t */
        public BigInteger mo50994t() {
            return this.f46410j.mo50629Y();
        }
    }

    /* renamed from: zl1$d */
    public static class C9682d extends C9680b {

        /* renamed from: g */
        public BigInteger f46411g;

        /* renamed from: h */
        public BigInteger f46412h;

        /* renamed from: i */
        public BigInteger f46413i;

        public C9682d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f46411g = bigInteger;
            this.f46412h = bigInteger2;
            this.f46413i = bigInteger3;
        }

        /* renamed from: u */
        public static BigInteger m75059u(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return tl1.f44772b.shiftLeft(bitLength).subtract(bigInteger);
        }

        /* renamed from: A */
        public BigInteger mo67335A(BigInteger bigInteger) {
            return i10.m58767g(this.f46411g, bigInteger);
        }

        /* renamed from: B */
        public BigInteger mo67336B(BigInteger bigInteger, BigInteger bigInteger2) {
            return mo67337C(bigInteger.multiply(bigInteger2));
        }

        /* renamed from: C */
        public BigInteger mo67337C(BigInteger bigInteger) {
            if (this.f46412h == null) {
                return bigInteger.mod(this.f46411g);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = this.f46411g.bitLength();
            boolean equals = this.f46412h.equals(tl1.f44772b);
            while (bigInteger.bitLength() > bitLength + 1) {
                BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(this.f46412h);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(this.f46411g) >= 0) {
                bigInteger = bigInteger.subtract(this.f46411g);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.f46411g.subtract(bigInteger);
        }

        /* renamed from: D */
        public BigInteger mo67338D(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.f46411g) : subtract;
        }

        /* renamed from: a */
        public zl1 mo50975a(zl1 zl1) {
            return new C9682d(this.f46411g, this.f46412h, mo67343x(this.f46413i, zl1.mo50994t()));
        }

        /* renamed from: b */
        public zl1 mo50976b() {
            BigInteger add = this.f46413i.add(tl1.f44772b);
            if (add.compareTo(this.f46411g) == 0) {
                add = tl1.f44771a;
            }
            return new C9682d(this.f46411g, this.f46412h, add);
        }

        /* renamed from: d */
        public zl1 mo50977d(zl1 zl1) {
            return new C9682d(this.f46411g, this.f46412h, mo67336B(this.f46413i, mo67335A(zl1.mo50994t())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9682d)) {
                return false;
            }
            C9682d dVar = (C9682d) obj;
            return this.f46411g.equals(dVar.f46411g) && this.f46413i.equals(dVar.f46413i);
        }

        /* renamed from: f */
        public int mo50979f() {
            return this.f46411g.bitLength();
        }

        /* renamed from: g */
        public zl1 mo50980g() {
            return new C9682d(this.f46411g, this.f46412h, mo67335A(this.f46413i));
        }

        public int hashCode() {
            return this.f46411g.hashCode() ^ this.f46413i.hashCode();
        }

        /* renamed from: j */
        public zl1 mo50984j(zl1 zl1) {
            return new C9682d(this.f46411g, this.f46412h, mo67336B(this.f46413i, zl1.mo50994t()));
        }

        /* renamed from: k */
        public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
            BigInteger bigInteger = this.f46413i;
            BigInteger t = zl1.mo50994t();
            BigInteger t2 = zl12.mo50994t();
            BigInteger t3 = zl13.mo50994t();
            return new C9682d(this.f46411g, this.f46412h, mo67337C(bigInteger.multiply(t).subtract(t2.multiply(t3))));
        }

        /* renamed from: l */
        public zl1 mo50986l(zl1 zl1, zl1 zl12, zl1 zl13) {
            BigInteger bigInteger = this.f46413i;
            BigInteger t = zl1.mo50994t();
            BigInteger t2 = zl12.mo50994t();
            BigInteger t3 = zl13.mo50994t();
            return new C9682d(this.f46411g, this.f46412h, mo67337C(bigInteger.multiply(t).add(t2.multiply(t3))));
        }

        /* renamed from: m */
        public zl1 mo50987m() {
            if (this.f46413i.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f46411g;
            return new C9682d(bigInteger, this.f46412h, bigInteger.subtract(this.f46413i));
        }

        /* renamed from: n */
        public zl1 mo50988n() {
            if (mo50983i() || mo50981h()) {
                return this;
            }
            if (!this.f46411g.testBit(0)) {
                throw new RuntimeException("not done yet");
            } else if (this.f46411g.testBit(1)) {
                BigInteger add = this.f46411g.shiftRight(2).add(tl1.f44772b);
                BigInteger bigInteger = this.f46411g;
                return mo67341v(new C9682d(bigInteger, this.f46412h, this.f46413i.modPow(add, bigInteger)));
            } else if (this.f46411g.testBit(2)) {
                BigInteger modPow = this.f46413i.modPow(this.f46411g.shiftRight(3), this.f46411g);
                BigInteger B = mo67336B(modPow, this.f46413i);
                if (mo67336B(B, modPow).equals(tl1.f44772b)) {
                    return mo67341v(new C9682d(this.f46411g, this.f46412h, B));
                }
                return mo67341v(new C9682d(this.f46411g, this.f46412h, mo67336B(B, tl1.f44773c.modPow(this.f46411g.shiftRight(2), this.f46411g))));
            } else {
                BigInteger shiftRight = this.f46411g.shiftRight(1);
                BigInteger modPow2 = this.f46413i.modPow(shiftRight, this.f46411g);
                BigInteger bigInteger2 = tl1.f44772b;
                if (!modPow2.equals(bigInteger2)) {
                    return null;
                }
                BigInteger bigInteger3 = this.f46413i;
                BigInteger y = mo67344y(mo67344y(bigInteger3));
                BigInteger add2 = shiftRight.add(bigInteger2);
                BigInteger subtract = this.f46411g.subtract(bigInteger2);
                Random random = new Random();
                while (true) {
                    BigInteger bigInteger4 = new BigInteger(this.f46411g.bitLength(), random);
                    if (bigInteger4.compareTo(this.f46411g) < 0 && mo67337C(bigInteger4.multiply(bigInteger4).subtract(y)).modPow(shiftRight, this.f46411g).equals(subtract)) {
                        BigInteger[] w = mo67342w(bigInteger4, bigInteger3, add2);
                        BigInteger bigInteger5 = w[0];
                        BigInteger bigInteger6 = w[1];
                        if (mo67336B(bigInteger6, bigInteger6).equals(y)) {
                            return new C9682d(this.f46411g, this.f46412h, mo67345z(bigInteger6));
                        }
                        if (!bigInteger5.equals(tl1.f44772b) && !bigInteger5.equals(subtract)) {
                            return null;
                        }
                    }
                }
            }
        }

        /* renamed from: o */
        public zl1 mo50989o() {
            BigInteger bigInteger = this.f46411g;
            BigInteger bigInteger2 = this.f46412h;
            BigInteger bigInteger3 = this.f46413i;
            return new C9682d(bigInteger, bigInteger2, mo67336B(bigInteger3, bigInteger3));
        }

        /* renamed from: p */
        public zl1 mo50990p(zl1 zl1, zl1 zl12) {
            BigInteger bigInteger = this.f46413i;
            BigInteger t = zl1.mo50994t();
            BigInteger t2 = zl12.mo50994t();
            return new C9682d(this.f46411g, this.f46412h, mo67337C(bigInteger.multiply(bigInteger).add(t.multiply(t2))));
        }

        /* renamed from: r */
        public zl1 mo50992r(zl1 zl1) {
            return new C9682d(this.f46411g, this.f46412h, mo67338D(this.f46413i, zl1.mo50994t()));
        }

        /* renamed from: t */
        public BigInteger mo50994t() {
            return this.f46413i;
        }

        /* renamed from: v */
        public final zl1 mo67341v(zl1 zl1) {
            if (zl1.mo50989o().equals(this)) {
                return zl1;
            }
            return null;
        }

        /* renamed from: w */
        public final BigInteger[] mo67342w(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = tl1.f44772b;
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger4;
            BigInteger bigInteger7 = tl1.f44773c;
            BigInteger bigInteger8 = bigInteger6;
            for (int i = bitLength - 1; i >= lowestSetBit + 1; i--) {
                bigInteger4 = mo67336B(bigInteger4, bigInteger8);
                if (bigInteger3.testBit(i)) {
                    bigInteger8 = mo67336B(bigInteger4, bigInteger2);
                    bigInteger6 = mo67336B(bigInteger6, bigInteger5);
                    bigInteger7 = mo67337C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger5 = mo67337C(bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1)));
                } else {
                    BigInteger C = mo67337C(bigInteger6.multiply(bigInteger7).subtract(bigInteger4));
                    BigInteger C2 = mo67337C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger7 = mo67337C(bigInteger7.multiply(bigInteger7).subtract(bigInteger4.shiftLeft(1)));
                    bigInteger5 = C2;
                    bigInteger6 = C;
                    bigInteger8 = bigInteger4;
                }
            }
            BigInteger B = mo67336B(bigInteger4, bigInteger8);
            BigInteger B2 = mo67336B(B, bigInteger2);
            BigInteger C3 = mo67337C(bigInteger6.multiply(bigInteger7).subtract(B));
            BigInteger C4 = mo67337C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(B)));
            BigInteger B3 = mo67336B(B, B2);
            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                C3 = mo67336B(C3, C4);
                C4 = mo67337C(C4.multiply(C4).subtract(B3.shiftLeft(1)));
                B3 = mo67336B(B3, B3);
            }
            return new BigInteger[]{C3, C4};
        }

        /* renamed from: x */
        public BigInteger mo67343x(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.f46411g) >= 0 ? add.subtract(this.f46411g) : add;
        }

        /* renamed from: y */
        public BigInteger mo67344y(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.f46411g) >= 0 ? shiftLeft.subtract(this.f46411g) : shiftLeft;
        }

        /* renamed from: z */
        public BigInteger mo67345z(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f46411g.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }
    }

    /* renamed from: a */
    public abstract zl1 mo50975a(zl1 zl1);

    /* renamed from: b */
    public abstract zl1 mo50976b();

    /* renamed from: c */
    public int mo67330c() {
        return mo50994t().bitLength();
    }

    /* renamed from: d */
    public abstract zl1 mo50977d(zl1 zl1);

    /* renamed from: e */
    public byte[] mo67331e() {
        return i10.m58761a((mo50979f() + 7) / 8, mo50994t());
    }

    /* renamed from: f */
    public abstract int mo50979f();

    /* renamed from: g */
    public abstract zl1 mo50980g();

    /* renamed from: h */
    public boolean mo50981h() {
        return mo67330c() == 1;
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return mo50994t().signum() == 0;
    }

    /* renamed from: j */
    public abstract zl1 mo50984j(zl1 zl1);

    /* renamed from: k */
    public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
        return mo50984j(zl1).mo50992r(zl12.mo50984j(zl13));
    }

    /* renamed from: l */
    public zl1 mo50986l(zl1 zl1, zl1 zl12, zl1 zl13) {
        return mo50984j(zl1).mo50975a(zl12.mo50984j(zl13));
    }

    /* renamed from: m */
    public abstract zl1 mo50987m();

    /* renamed from: n */
    public abstract zl1 mo50988n();

    /* renamed from: o */
    public abstract zl1 mo50989o();

    /* renamed from: p */
    public zl1 mo50990p(zl1 zl1, zl1 zl12) {
        return mo50989o().mo50975a(zl1.mo50984j(zl12));
    }

    /* renamed from: q */
    public zl1 mo50991q(int i) {
        zl1 zl1 = this;
        for (int i2 = 0; i2 < i; i2++) {
            zl1 = zl1.mo50989o();
        }
        return zl1;
    }

    /* renamed from: r */
    public abstract zl1 mo50992r(zl1 zl1);

    /* renamed from: s */
    public boolean mo50993s() {
        return mo50994t().testBit(0);
    }

    /* renamed from: t */
    public abstract BigInteger mo50994t();

    public String toString() {
        return mo50994t().toString(16);
    }
}
