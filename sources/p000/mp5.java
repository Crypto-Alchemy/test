package p000;

import p000.nm1;

/* renamed from: mp5 */
public class mp5 extends nm1.C8994c {
    public mp5(ul1 ul1, zl1 zl1, zl1 zl12) {
        super(ul1, zl1, zl12);
    }

    public mp5(ul1 ul1, zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        super(ul1, zl1, zl12, zl1Arr);
    }

    /* renamed from: H */
    public nm1 mo50273H() {
        return (mo62751u() || this.f43512c.mo50983i()) ? this : mo50274J().mo50276a(this);
    }

    /* renamed from: J */
    public nm1 mo50274J() {
        if (mo62751u()) {
            return this;
        }
        ul1 i = mo62740i();
        lp5 lp5 = (lp5) this.f43512c;
        if (lp5.mo50983i()) {
            return i.mo50668u();
        }
        lp5 lp52 = (lp5) this.f43511b;
        lp5 lp53 = (lp5) this.f43513d[0];
        int[] j = p34.m70886j(12);
        int[] j2 = p34.m70886j(12);
        int[] j3 = p34.m70886j(12);
        kp5.m63575n(lp5.f40676g, j3);
        int[] j4 = p34.m70886j(12);
        kp5.m63575n(j3, j4);
        boolean h = lp53.mo50981h();
        int[] iArr = lp53.f40676g;
        if (!h) {
            kp5.m63575n(iArr, j2);
            iArr = j2;
        }
        kp5.m63578q(lp52.f40676g, iArr, j);
        kp5.m63562a(lp52.f40676g, iArr, j2);
        kp5.m63569h(j2, j, j2);
        kp5.m63574m(p34.m70879c(12, j2, j2, j2), j2);
        kp5.m63569h(j3, lp52.f40676g, j3);
        kp5.m63574m(p34.m70865I(12, j3, 2, 0), j3);
        kp5.m63574m(p34.m70866J(12, j4, 3, 0, j), j);
        lp5 lp54 = new lp5(j4);
        kp5.m63575n(j2, lp54.f40676g);
        int[] iArr2 = lp54.f40676g;
        kp5.m63578q(iArr2, j3, iArr2);
        int[] iArr3 = lp54.f40676g;
        kp5.m63578q(iArr3, j3, iArr3);
        lp5 lp55 = new lp5(j3);
        kp5.m63578q(j3, lp54.f40676g, lp55.f40676g);
        int[] iArr4 = lp55.f40676g;
        kp5.m63569h(iArr4, j2, iArr4);
        int[] iArr5 = lp55.f40676g;
        kp5.m63578q(iArr5, j, iArr5);
        lp5 lp56 = new lp5(j2);
        kp5.m63579r(lp5.f40676g, lp56.f40676g);
        if (!h) {
            int[] iArr6 = lp56.f40676g;
            kp5.m63569h(iArr6, lp53.f40676g, iArr6);
        }
        return new mp5(i, lp54, lp55, new zl1[]{lp56});
    }

    /* renamed from: K */
    public nm1 mo50275K(nm1 nm1) {
        return this == nm1 ? mo50273H() : mo62751u() ? nm1 : nm1.mo62751u() ? mo50274J() : this.f43512c.mo50983i() ? nm1 : mo50274J().mo50276a(nm1);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [nm1] */
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
            zl1 r3 = r0.f43511b
            lp5 r3 = (p000.lp5) r3
            zl1 r4 = r0.f43512c
            lp5 r4 = (p000.lp5) r4
            zl1 r5 = r17.mo62747q()
            lp5 r5 = (p000.lp5) r5
            zl1 r6 = r17.mo50310r()
            lp5 r6 = (p000.lp5) r6
            zl1[] r7 = r0.f43513d
            r8 = 0
            r7 = r7[r8]
            lp5 r7 = (p000.lp5) r7
            zl1 r1 = r1.mo62748s(r8)
            lp5 r1 = (p000.lp5) r1
            r9 = 24
            int[] r10 = p000.p34.m70886j(r9)
            int[] r9 = p000.p34.m70886j(r9)
            r11 = 12
            int[] r12 = p000.p34.m70886j(r11)
            int[] r13 = p000.p34.m70886j(r11)
            boolean r14 = r7.mo50981h()
            if (r14 == 0) goto L_0x005d
            int[] r5 = r5.f40676g
            int[] r6 = r6.f40676g
            goto L_0x0073
        L_0x005d:
            int[] r15 = r7.f40676g
            p000.kp5.m63575n(r15, r12)
            int[] r5 = r5.f40676g
            p000.kp5.m63569h(r12, r5, r9)
            int[] r5 = r7.f40676g
            p000.kp5.m63569h(r12, r5, r12)
            int[] r5 = r6.f40676g
            p000.kp5.m63569h(r12, r5, r12)
            r5 = r9
            r6 = r12
        L_0x0073:
            boolean r15 = r1.mo50981h()
            if (r15 == 0) goto L_0x007e
            int[] r3 = r3.f40676g
            int[] r4 = r4.f40676g
            goto L_0x0094
        L_0x007e:
            int[] r8 = r1.f40676g
            p000.kp5.m63575n(r8, r13)
            int[] r3 = r3.f40676g
            p000.kp5.m63569h(r13, r3, r10)
            int[] r3 = r1.f40676g
            p000.kp5.m63569h(r13, r3, r13)
            int[] r3 = r4.f40676g
            p000.kp5.m63569h(r13, r3, r13)
            r3 = r10
            r4 = r13
        L_0x0094:
            int[] r8 = p000.p34.m70886j(r11)
            p000.kp5.m63578q(r3, r5, r8)
            int[] r5 = p000.p34.m70886j(r11)
            p000.kp5.m63578q(r4, r6, r5)
            boolean r6 = p000.p34.m70902z(r11, r8)
            if (r6 == 0) goto L_0x00b8
            boolean r1 = p000.p34.m70902z(r11, r5)
            if (r1 == 0) goto L_0x00b3
            nm1 r1 = r16.mo50274J()
            return r1
        L_0x00b3:
            nm1 r1 = r2.mo50668u()
            return r1
        L_0x00b8:
            p000.kp5.m63575n(r8, r12)
            int[] r6 = p000.p34.m70886j(r11)
            p000.kp5.m63569h(r12, r8, r6)
            p000.kp5.m63569h(r12, r3, r12)
            p000.kp5.m63570i(r6, r6)
            p000.l34.m63687a(r4, r6, r10)
            int r3 = p000.p34.m70879c(r11, r12, r12, r6)
            p000.kp5.m63574m(r3, r6)
            lp5 r3 = new lp5
            r3.<init>((int[]) r13)
            int[] r4 = r3.f40676g
            p000.kp5.m63575n(r5, r4)
            int[] r4 = r3.f40676g
            p000.kp5.m63578q(r4, r6, r4)
            lp5 r4 = new lp5
            r4.<init>((int[]) r6)
            int[] r6 = r3.f40676g
            int[] r11 = r4.f40676g
            p000.kp5.m63578q(r12, r6, r11)
            int[] r6 = r4.f40676g
            p000.l34.m63687a(r6, r5, r9)
            p000.kp5.m63563b(r10, r9, r10)
            int[] r5 = r4.f40676g
            p000.kp5.m63573l(r10, r5)
            lp5 r5 = new lp5
            r5.<init>((int[]) r8)
            if (r14 != 0) goto L_0x0108
            int[] r6 = r5.f40676g
            int[] r7 = r7.f40676g
            p000.kp5.m63569h(r6, r7, r6)
        L_0x0108:
            if (r15 != 0) goto L_0x0111
            int[] r6 = r5.f40676g
            int[] r1 = r1.f40676g
            p000.kp5.m63569h(r6, r1, r6)
        L_0x0111:
            r1 = 1
            zl1[] r1 = new p000.zl1[r1]
            r6 = 0
            r1[r6] = r5
            mp5 r5 = new mp5
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mp5.mo50276a(nm1):nm1");
    }

    /* renamed from: d */
    public nm1 mo50277d() {
        return new mp5((ul1) null, mo62737f(), mo62738g());
    }

    /* renamed from: z */
    public nm1 mo50278z() {
        return mo62751u() ? this : new mp5(this.f43510a, this.f43511b, this.f43512c.mo50987m(), this.f43513d);
    }
}
