package p000;

/* renamed from: mj9 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class mj9 extends tj9 {

    /* renamed from: g */
    public final rm8 f31718g;

    /* renamed from: h */
    public final /* synthetic */ kk9 f31719h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mj9(kk9 kk9, String str, int i, rm8 rm8) {
        super(str, i);
        this.f31719h = kk9;
        this.f31718g = rm8;
    }

    /* renamed from: a */
    public final int mo30028a() {
        return this.f31718g.mo47445y();
    }

    /* renamed from: b */
    public final boolean mo30029b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo30030c() {
        return this.f31718g.mo47438E();
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v16, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03fa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03fb  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45804k(java.lang.Long r16, java.lang.Long r17, p000.wq8 r18, long r19, p000.m88 r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            p000.nd9.m48739a()
            kk9 r1 = r0.f31719h
            kr8 r1 = r1.f34342a
            n68 r1 = r1.mo45274y()
            java.lang.String r2 = r0.f34290a
            uk8<java.lang.Boolean> r3 = p000.rl8.f33487b0
            boolean r1 = r1.mo45997v(r2, r3)
            rm8 r2 = r0.f31718g
            boolean r2 = r2.mo47443J()
            if (r2 == 0) goto L_0x0021
            r2 = r21
            long r2 = r2.f31542e
            goto L_0x0023
        L_0x0021:
            r2 = r19
        L_0x0023:
            kk9 r4 = r0.f31719h
            kr8 r4 = r4.f34342a
            bn8 r4 = r4.mo45237A()
            java.lang.String r4 = r4.mo29680y()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x0093
            kk9 r4 = r0.f31719h
            kr8 r4 = r4.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29678v()
            int r6 = r0.f34291b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            rm8 r7 = r0.f31718g
            boolean r7 = r7.mo47444x()
            if (r7 == 0) goto L_0x005c
            rm8 r7 = r0.f31718g
            int r7 = r7.mo47445y()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            kk9 r8 = r0.f31719h
            kr8 r8 = r8.f34342a
            mm8 r8 = r8.mo45244H()
            rm8 r9 = r0.f31718g
            java.lang.String r9 = r9.mo47446z()
            java.lang.String r8 = r8.mo45821m(r9)
            java.lang.String r9 = "Evaluating filter. audience, filter, event"
            r4.mo48772d(r9, r6, r7, r8)
            kk9 r4 = r0.f31719h
            kr8 r4 = r4.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29678v()
            kk9 r6 = r0.f31719h
            s59 r6 = r6.f33321b
            w59 r6 = r6.mo47655Z()
            rm8 r7 = r0.f31718g
            java.lang.String r6 = r6.mo48908y(r7)
            java.lang.String r7 = "Filter definition"
            r4.mo48770b(r7, r6)
        L_0x0093:
            rm8 r4 = r0.f31718g
            boolean r4 = r4.mo47444x()
            r6 = 0
            if (r4 == 0) goto L_0x043f
            rm8 r4 = r0.f31718g
            int r4 = r4.mo47445y()
            r7 = 256(0x100, float:3.59E-43)
            if (r4 <= r7) goto L_0x00a8
            goto L_0x043f
        L_0x00a8:
            rm8 r4 = r0.f31718g
            boolean r4 = r4.mo47440G()
            rm8 r7 = r0.f31718g
            boolean r7 = r7.mo47441H()
            rm8 r8 = r0.f31718g
            boolean r8 = r8.mo47443J()
            r9 = 1
            if (r4 != 0) goto L_0x00c4
            if (r7 != 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r4 = r6
            goto L_0x00c5
        L_0x00c4:
            r4 = r9
        L_0x00c5:
            if (r22 == 0) goto L_0x00f3
            if (r4 != 0) goto L_0x00f3
            kk9 r1 = r0.f31719h
            kr8 r1 = r1.f34342a
            bn8 r1 = r1.mo45237A()
            vm8 r1 = r1.mo29678v()
            int r2 = r0.f34291b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            rm8 r3 = r0.f31718g
            boolean r3 = r3.mo47444x()
            if (r3 == 0) goto L_0x00ed
            rm8 r3 = r0.f31718g
            int r3 = r3.mo47445y()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x00ed:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo48771c(r3, r2, r5)
            return r9
        L_0x00f3:
            rm8 r7 = r0.f31718g
            java.lang.String r8 = r18.mo49247B()
            boolean r10 = r7.mo47438E()
            if (r10 == 0) goto L_0x0115
            ln8 r10 = r7.mo47439F()
            java.lang.Boolean r2 = p000.tj9.m52335g(r2, r10)
            if (r2 != 0) goto L_0x010b
            goto L_0x03e1
        L_0x010b:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0115
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0115:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r3 = r7.mo47435B()
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x015f
            java.lang.Object r10 = r3.next()
            xm8 r10 = (p000.xm8) r10
            java.lang.String r11 = r10.mo49517F()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0157
            kk9 r2 = r0.f31719h
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29673o()
            kk9 r3 = r0.f31719h
            kr8 r3 = r3.f34342a
            mm8 r3 = r3.mo45244H()
            java.lang.String r3 = r3.mo45821m(r8)
            java.lang.String r7 = "null or empty param name in filter. event"
            r2.mo48770b(r7, r3)
            goto L_0x03e1
        L_0x0157:
            java.lang.String r10 = r10.mo49517F()
            r2.add(r10)
            goto L_0x0122
        L_0x015f:
            lq r3 = new lq
            r3.<init>()
            java.util.List r10 = r18.mo49255x()
            java.util.Iterator r10 = r10.iterator()
        L_0x016c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01ff
            java.lang.Object r11 = r10.next()
            er8 r11 = (p000.er8) r11
            java.lang.String r12 = r11.mo42393y()
            boolean r12 = r2.contains(r12)
            if (r12 == 0) goto L_0x016c
            boolean r12 = r11.mo42383C()
            if (r12 == 0) goto L_0x01a0
            java.lang.String r12 = r11.mo42393y()
            boolean r13 = r11.mo42383C()
            if (r13 == 0) goto L_0x019b
            long r13 = r11.mo42384D()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x019c
        L_0x019b:
            r11 = r5
        L_0x019c:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01a0:
            boolean r12 = r11.mo42387G()
            if (r12 == 0) goto L_0x01be
            java.lang.String r12 = r11.mo42393y()
            boolean r13 = r11.mo42387G()
            if (r13 == 0) goto L_0x01b9
            double r13 = r11.mo42388H()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ba
        L_0x01b9:
            r11 = r5
        L_0x01ba:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01be:
            boolean r12 = r11.mo42394z()
            if (r12 == 0) goto L_0x01d0
            java.lang.String r12 = r11.mo42393y()
            java.lang.String r11 = r11.mo42382B()
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01d0:
            kk9 r2 = r0.f31719h
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29673o()
            kk9 r3 = r0.f31719h
            kr8 r3 = r3.f34342a
            mm8 r3 = r3.mo45244H()
            java.lang.String r3 = r3.mo45821m(r8)
            kk9 r7 = r0.f31719h
            kr8 r7 = r7.f34342a
            mm8 r7 = r7.mo45244H()
            java.lang.String r8 = r11.mo42393y()
            java.lang.String r7 = r7.mo45822n(r8)
            java.lang.String r8 = "Unknown value for param. event, param"
            r2.mo48771c(r8, r3, r7)
            goto L_0x03e1
        L_0x01ff:
            java.util.List r2 = r7.mo47435B()
            java.util.Iterator r2 = r2.iterator()
        L_0x0207:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x03df
            java.lang.Object r7 = r2.next()
            xm8 r7 = (p000.xm8) r7
            boolean r10 = r7.mo49514C()
            if (r10 == 0) goto L_0x0221
            boolean r10 = r7.mo49515D()
            if (r10 == 0) goto L_0x0221
            r10 = r9
            goto L_0x0222
        L_0x0221:
            r10 = r6
        L_0x0222:
            java.lang.String r11 = r7.mo49517F()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x024b
            kk9 r2 = r0.f31719h
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29673o()
            kk9 r3 = r0.f31719h
            kr8 r3 = r3.f34342a
            mm8 r3 = r3.mo45244H()
            java.lang.String r3 = r3.mo45821m(r8)
            java.lang.String r7 = "Event has empty param name. event"
            r2.mo48770b(r7, r3)
            goto L_0x03e1
        L_0x024b:
            java.lang.Object r12 = r3.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x02a0
            boolean r13 = r7.mo49520z()
            if (r13 != 0) goto L_0x0284
            kk9 r2 = r0.f31719h
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29673o()
            kk9 r3 = r0.f31719h
            kr8 r3 = r3.f34342a
            mm8 r3 = r3.mo45244H()
            java.lang.String r3 = r3.mo45821m(r8)
            kk9 r7 = r0.f31719h
            kr8 r7 = r7.f34342a
            mm8 r7 = r7.mo45244H()
            java.lang.String r7 = r7.mo45822n(r11)
            java.lang.String r8 = "No number filter for long param. event, param"
            r2.mo48771c(r8, r3, r7)
            goto L_0x03e1
        L_0x0284:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            ln8 r7 = r7.mo49513B()
            java.lang.Boolean r7 = p000.tj9.m52335g(r11, r7)
            if (r7 != 0) goto L_0x0296
            goto L_0x03e1
        L_0x0296:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02a0:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02f1
            boolean r13 = r7.mo49520z()
            if (r13 != 0) goto L_0x02d5
            kk9 r2 = r0.f31719h
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29673o()
            kk9 r3 = r0.f31719h
            kr8 r3 = r3.f34342a
            mm8 r3 = r3.mo45244H()
            java.lang.String r3 = r3.mo45821m(r8)
            kk9 r7 = r0.f31719h
            kr8 r7 = r7.f34342a
            mm8 r7 = r7.mo45244H()
            java.lang.String r7 = r7.mo45822n(r11)
            java.lang.String r8 = "No number filter for double param. event, param"
            r2.mo48771c(r8, r3, r7)
            goto L_0x03e1
        L_0x02d5:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            ln8 r7 = r7.mo49513B()
            java.lang.Boolean r7 = p000.tj9.m52336h(r11, r7)
            if (r7 != 0) goto L_0x02e7
            goto L_0x03e1
        L_0x02e7:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02f1:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0387
            boolean r13 = r7.mo49518x()
            if (r13 == 0) goto L_0x030e
            java.lang.String r12 = (java.lang.String) r12
            eo8 r7 = r7.mo49519y()
            kk9 r11 = r0.f31719h
            kr8 r11 = r11.f34342a
            bn8 r11 = r11.mo45237A()
            java.lang.Boolean r7 = p000.tj9.m52334f(r12, r7, r11)
            goto L_0x0324
        L_0x030e:
            boolean r13 = r7.mo49520z()
            if (r13 == 0) goto L_0x035d
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = p000.w59.m53709C(r12)
            if (r13 == 0) goto L_0x0332
            ln8 r7 = r7.mo49513B()
            java.lang.Boolean r7 = p000.tj9.m52337i(r12, r7)
        L_0x0324:
            if (r7 != 0) goto L_0x0328
            goto L_0x03e1
        L_0x0328:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0332:
            kk9 r2 = r0.f31719h
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29673o()
            kk9 r3 = r0.f31719h
            kr8 r3 = r3.f34342a
            mm8 r3 = r3.mo45244H()
            java.lang.String r3 = r3.mo45821m(r8)
            kk9 r7 = r0.f31719h
            kr8 r7 = r7.f34342a
            mm8 r7 = r7.mo45244H()
            java.lang.String r7 = r7.mo45822n(r11)
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            r2.mo48771c(r8, r3, r7)
            goto L_0x03e1
        L_0x035d:
            kk9 r2 = r0.f31719h
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29673o()
            kk9 r3 = r0.f31719h
            kr8 r3 = r3.f34342a
            mm8 r3 = r3.mo45244H()
            java.lang.String r3 = r3.mo45821m(r8)
            kk9 r7 = r0.f31719h
            kr8 r7 = r7.f34342a
            mm8 r7 = r7.mo45244H()
            java.lang.String r7 = r7.mo45822n(r11)
            java.lang.String r8 = "No filter for String param. event, param"
            r2.mo48771c(r8, r3, r7)
            goto L_0x03e1
        L_0x0387:
            if (r12 != 0) goto L_0x03b5
            kk9 r2 = r0.f31719h
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29678v()
            kk9 r3 = r0.f31719h
            kr8 r3 = r3.f34342a
            mm8 r3 = r3.mo45244H()
            java.lang.String r3 = r3.mo45821m(r8)
            kk9 r5 = r0.f31719h
            kr8 r5 = r5.f34342a
            mm8 r5 = r5.mo45244H()
            java.lang.String r5 = r5.mo45822n(r11)
            java.lang.String r7 = "Missing param for filter. event, param"
            r2.mo48771c(r7, r3, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x03b5:
            kk9 r2 = r0.f31719h
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29673o()
            kk9 r3 = r0.f31719h
            kr8 r3 = r3.f34342a
            mm8 r3 = r3.mo45244H()
            java.lang.String r3 = r3.mo45821m(r8)
            kk9 r7 = r0.f31719h
            kr8 r7 = r7.f34342a
            mm8 r7 = r7.mo45244H()
            java.lang.String r7 = r7.mo45822n(r11)
            java.lang.String r8 = "Unknown param type. event, param"
            r2.mo48771c(r8, r3, r7)
            goto L_0x03e1
        L_0x03df:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L_0x03e1:
            kk9 r2 = r0.f31719h
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29678v()
            if (r5 != 0) goto L_0x03f2
            java.lang.String r3 = "null"
            goto L_0x03f3
        L_0x03f2:
            r3 = r5
        L_0x03f3:
            java.lang.String r7 = "Event filter result"
            r2.mo48770b(r7, r3)
            if (r5 != 0) goto L_0x03fb
            return r6
        L_0x03fb:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f34292c = r2
            boolean r3 = r5.booleanValue()
            if (r3 != 0) goto L_0x0406
            return r9
        L_0x0406:
            r0.f34293d = r2
            if (r4 == 0) goto L_0x043e
            boolean r2 = r18.mo49248C()
            if (r2 == 0) goto L_0x043e
            long r2 = r18.mo49249D()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            rm8 r3 = r0.f31718g
            boolean r3 = r3.mo47441H()
            if (r3 == 0) goto L_0x0430
            if (r1 == 0) goto L_0x042d
            rm8 r1 = r0.f31718g
            boolean r1 = r1.mo47438E()
            if (r1 != 0) goto L_0x042b
            goto L_0x042d
        L_0x042b:
            r2 = r16
        L_0x042d:
            r0.f34295f = r2
            goto L_0x043e
        L_0x0430:
            if (r1 == 0) goto L_0x043c
            rm8 r1 = r0.f31718g
            boolean r1 = r1.mo47438E()
            if (r1 == 0) goto L_0x043c
            r2 = r17
        L_0x043c:
            r0.f34294e = r2
        L_0x043e:
            return r9
        L_0x043f:
            kk9 r1 = r0.f31719h
            kr8 r1 = r1.f34342a
            bn8 r1 = r1.mo45237A()
            vm8 r1 = r1.mo29673o()
            java.lang.String r2 = r0.f34290a
            java.lang.Object r2 = p000.bn8.m32664w(r2)
            rm8 r3 = r0.f31718g
            boolean r3 = r3.mo47444x()
            if (r3 == 0) goto L_0x0463
            rm8 r3 = r0.f31718g
            int r3 = r3.mo47445y()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x0463:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.mo48771c(r4, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mj9.mo45804k(java.lang.Long, java.lang.Long, wq8, long, m88, boolean):boolean");
    }
}
