package p000;

import p000.nm1;

/* renamed from: qp5 */
public class qp5 extends nm1.C8994c {
    public qp5(ul1 ul1, zl1 zl1, zl1 zl12) {
        super(ul1, zl1, zl12);
    }

    public qp5(ul1 ul1, zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
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
        pp5 pp5 = (pp5) this.f43512c;
        if (pp5.mo50983i()) {
            return i.mo50668u();
        }
        pp5 pp52 = (pp5) this.f43511b;
        pp5 pp53 = (pp5) this.f43513d[0];
        int[] j = p34.m70886j(17);
        int[] j2 = p34.m70886j(17);
        int[] j3 = p34.m70886j(17);
        op5.m70447n(pp5.f44087g, j3);
        int[] j4 = p34.m70886j(17);
        op5.m70447n(j3, j4);
        boolean h = pp53.mo50981h();
        int[] iArr = pp53.f44087g;
        if (!h) {
            op5.m70447n(iArr, j2);
            iArr = j2;
        }
        op5.m70449p(pp52.f44087g, iArr, j);
        op5.m70434a(pp52.f44087g, iArr, j2);
        op5.m70441h(j2, j, j2);
        p34.m70879c(17, j2, j2, j2);
        op5.m70446m(j2);
        op5.m70441h(j3, pp52.f44087g, j3);
        p34.m70865I(17, j3, 2, 0);
        op5.m70446m(j3);
        p34.m70866J(17, j4, 3, 0, j);
        op5.m70446m(j);
        pp5 pp54 = new pp5(j4);
        op5.m70447n(j2, pp54.f44087g);
        int[] iArr2 = pp54.f44087g;
        op5.m70449p(iArr2, j3, iArr2);
        int[] iArr3 = pp54.f44087g;
        op5.m70449p(iArr3, j3, iArr3);
        pp5 pp55 = new pp5(j3);
        op5.m70449p(j3, pp54.f44087g, pp55.f44087g);
        int[] iArr4 = pp55.f44087g;
        op5.m70441h(iArr4, j2, iArr4);
        int[] iArr5 = pp55.f44087g;
        op5.m70449p(iArr5, j, iArr5);
        pp5 pp56 = new pp5(j2);
        op5.m70450q(pp5.f44087g, pp56.f44087g);
        if (!h) {
            int[] iArr6 = pp56.f44087g;
            op5.m70441h(iArr6, pp53.f44087g, iArr6);
        }
        return new qp5(i, pp54, pp55, new zl1[]{pp56});
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
            pp5 r3 = (p000.pp5) r3
            zl1 r4 = r0.f43512c
            pp5 r4 = (p000.pp5) r4
            zl1 r5 = r17.mo62747q()
            pp5 r5 = (p000.pp5) r5
            zl1 r6 = r17.mo50310r()
            pp5 r6 = (p000.pp5) r6
            zl1[] r7 = r0.f43513d
            r8 = 0
            r7 = r7[r8]
            pp5 r7 = (p000.pp5) r7
            zl1 r1 = r1.mo62748s(r8)
            pp5 r1 = (p000.pp5) r1
            r9 = 17
            int[] r10 = p000.p34.m70886j(r9)
            int[] r11 = p000.p34.m70886j(r9)
            int[] r12 = p000.p34.m70886j(r9)
            int[] r13 = p000.p34.m70886j(r9)
            boolean r14 = r7.mo50981h()
            if (r14 == 0) goto L_0x005b
            int[] r5 = r5.f44087g
            int[] r6 = r6.f44087g
            goto L_0x0071
        L_0x005b:
            int[] r15 = r7.f44087g
            p000.op5.m70447n(r15, r12)
            int[] r5 = r5.f44087g
            p000.op5.m70441h(r12, r5, r11)
            int[] r5 = r7.f44087g
            p000.op5.m70441h(r12, r5, r12)
            int[] r5 = r6.f44087g
            p000.op5.m70441h(r12, r5, r12)
            r5 = r11
            r6 = r12
        L_0x0071:
            boolean r15 = r1.mo50981h()
            if (r15 == 0) goto L_0x007c
            int[] r3 = r3.f44087g
            int[] r4 = r4.f44087g
            goto L_0x0092
        L_0x007c:
            int[] r8 = r1.f44087g
            p000.op5.m70447n(r8, r13)
            int[] r3 = r3.f44087g
            p000.op5.m70441h(r13, r3, r10)
            int[] r3 = r1.f44087g
            p000.op5.m70441h(r13, r3, r13)
            int[] r3 = r4.f44087g
            p000.op5.m70441h(r13, r3, r13)
            r3 = r10
            r4 = r13
        L_0x0092:
            int[] r8 = p000.p34.m70886j(r9)
            p000.op5.m70449p(r3, r5, r8)
            p000.op5.m70449p(r4, r6, r11)
            boolean r5 = p000.p34.m70902z(r9, r8)
            if (r5 == 0) goto L_0x00b2
            boolean r1 = p000.p34.m70902z(r9, r11)
            if (r1 == 0) goto L_0x00ad
            nm1 r1 = r16.mo50274J()
            return r1
        L_0x00ad:
            nm1 r1 = r2.mo50668u()
            return r1
        L_0x00b2:
            p000.op5.m70447n(r8, r12)
            int[] r5 = p000.p34.m70886j(r9)
            p000.op5.m70441h(r12, r8, r5)
            p000.op5.m70441h(r12, r3, r12)
            p000.op5.m70441h(r4, r5, r10)
            pp5 r3 = new pp5
            r3.<init>((int[]) r13)
            int[] r4 = r3.f44087g
            p000.op5.m70447n(r11, r4)
            int[] r4 = r3.f44087g
            p000.op5.m70434a(r4, r5, r4)
            int[] r4 = r3.f44087g
            p000.op5.m70449p(r4, r12, r4)
            int[] r4 = r3.f44087g
            p000.op5.m70449p(r4, r12, r4)
            pp5 r4 = new pp5
            r4.<init>((int[]) r5)
            int[] r5 = r3.f44087g
            int[] r6 = r4.f44087g
            p000.op5.m70449p(r12, r5, r6)
            int[] r5 = r4.f44087g
            p000.op5.m70441h(r5, r11, r11)
            int[] r5 = r4.f44087g
            p000.op5.m70449p(r11, r10, r5)
            pp5 r5 = new pp5
            r5.<init>((int[]) r8)
            if (r14 != 0) goto L_0x00ff
            int[] r6 = r5.f44087g
            int[] r7 = r7.f44087g
            p000.op5.m70441h(r6, r7, r6)
        L_0x00ff:
            if (r15 != 0) goto L_0x0108
            int[] r6 = r5.f44087g
            int[] r1 = r1.f44087g
            p000.op5.m70441h(r6, r1, r6)
        L_0x0108:
            r1 = 1
            zl1[] r1 = new p000.zl1[r1]
            r6 = 0
            r1[r6] = r5
            qp5 r5 = new qp5
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qp5.mo50276a(nm1):nm1");
    }

    /* renamed from: d */
    public nm1 mo50277d() {
        return new qp5((ul1) null, mo62737f(), mo62738g());
    }

    /* renamed from: z */
    public nm1 mo50278z() {
        return mo62751u() ? this : new qp5(this.f43510a, this.f43511b, this.f43512c.mo50987m(), this.f43513d);
    }
}
