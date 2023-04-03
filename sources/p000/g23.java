package p000;

import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition;

/* renamed from: g23 */
/* compiled from: typeEnhancement.kt */
public final class g23 {

    /* renamed from: a */
    public final z13 f37945a;

    /* renamed from: g23$a */
    /* compiled from: typeEnhancement.kt */
    public static final class C7114a {

        /* renamed from: a */
        public final xc3 f37946a;

        /* renamed from: b */
        public final int f37947b;

        public C7114a(xc3 xc3, int i) {
            this.f37946a = xc3;
            this.f37947b = i;
        }

        /* renamed from: a */
        public final int mo51851a() {
            return this.f37947b;
        }

        /* renamed from: b */
        public final xc3 mo51852b() {
            return this.f37946a;
        }
    }

    /* renamed from: g23$b */
    /* compiled from: typeEnhancement.kt */
    public static final class C7115b {

        /* renamed from: a */
        public final d36 f37948a;

        /* renamed from: b */
        public final int f37949b;

        /* renamed from: c */
        public final boolean f37950c;

        public C7115b(d36 d36, int i, boolean z) {
            this.f37948a = d36;
            this.f37949b = i;
            this.f37950c = z;
        }

        /* renamed from: a */
        public final boolean mo51853a() {
            return this.f37950c;
        }

        /* renamed from: b */
        public final int mo51854b() {
            return this.f37949b;
        }

        /* renamed from: c */
        public final d36 mo51855c() {
            return this.f37948a;
        }
    }

    public g23(z13 z13) {
        vx2.m53591g(z13, "javaResolverSettings");
        this.f37945a = z13;
    }

    /* renamed from: c */
    public static /* synthetic */ C7115b m57981c(g23 g23, d36 d36, rc2 rc2, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2, int i2, Object obj) {
        boolean z3;
        boolean z4;
        if ((i2 & 8) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        return g23.mo51848b(d36, rc2, i, typeComponentPosition, z3, z4);
    }

    /* renamed from: a */
    public final xc3 mo51847a(xc3 xc3, rc2<? super Integer, j23> rc2, boolean z) {
        vx2.m53591g(xc3, "<this>");
        vx2.m53591g(rc2, "qualifiers");
        return mo51849d(xc3.mo64506K0(), rc2, 0, z).mo51852b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0174  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.g23.C7115b mo51848b(p000.d36 r19, p000.rc2<? super java.lang.Integer, p000.j23> r20, int r21, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r22
            r3 = r24
            boolean r4 = p000.xz6.m74181a(r22)
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0015
            if (r23 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r7 = r5
            goto L_0x0016
        L_0x0015:
            r7 = r6
        L_0x0016:
            r8 = 0
            if (r4 != 0) goto L_0x0029
            java.util.List r4 = r19.mo51132F0()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0029
            g23$b r1 = new g23$b
            r1.<init>(r8, r6, r5)
            return r1
        L_0x0029:
            yz6 r4 = r19.mo51134H0()
            eg0 r4 = r4.mo51180d()
            if (r4 != 0) goto L_0x0039
            g23$b r1 = new g23$b
            r1.<init>(r8, r6, r5)
            return r1
        L_0x0039:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
            java.lang.Object r9 = r1.invoke(r9)
            j23 r9 = (p000.j23) r9
            eg0 r4 = p000.p07.m70836g(r4, r9, r2)
            java.lang.Boolean r2 = p000.p07.m70837h(r9, r2)
            if (r4 == 0) goto L_0x0053
            yz6 r10 = r4.mo50046g()
            if (r10 != 0) goto L_0x0057
        L_0x0053:
            yz6 r10 = r19.mo51134H0()
        L_0x0057:
            r12 = r10
            java.lang.String r10 = "enhancedClassifier?.typeConstructor ?: constructor"
            p000.vx2.m53590f(r12, r10)
            int r10 = r21 + 1
            java.util.List r11 = r19.mo51132F0()
            java.util.List r13 = r12.getParameters()
            java.lang.String r14 = "typeConstructor.parameters"
            p000.vx2.m53590f(r13, r14)
            java.util.Iterator r14 = r11.iterator()
            java.util.Iterator r15 = r13.iterator()
            java.util.ArrayList r6 = new java.util.ArrayList
            r5 = 10
            int r11 = p000.dk0.m43495u(r11, r5)
            int r13 = p000.dk0.m43495u(r13, r5)
            int r11 = java.lang.Math.min(r11, r13)
            r6.<init>(r11)
        L_0x0087:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x014c
            boolean r11 = r15.hasNext()
            if (r11 == 0) goto L_0x014c
            java.lang.Object r11 = r14.next()
            java.lang.Object r13 = r15.next()
            a17 r13 = (p000.a17) r13
            f17 r11 = (p000.f17) r11
            if (r7 != 0) goto L_0x00aa
            g23$a r5 = new g23$a
            r23 = r7
            r7 = 0
            r5.<init>(r8, r7)
            goto L_0x00fe
        L_0x00aa:
            r23 = r7
            boolean r5 = r11.mo51408b()
            if (r5 != 0) goto L_0x00bf
            xc3 r5 = r11.getType()
            w47 r5 = r5.mo64506K0()
            g23$a r5 = r0.mo51849d(r5, r1, r10, r3)
            goto L_0x00fe
        L_0x00bf:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r1.invoke(r5)
            j23 r5 = (p000.j23) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = r5.mo52602d()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            if (r5 != r7) goto L_0x00f6
            xc3 r5 = r11.getType()
            w47 r5 = r5.mo64506K0()
            g23$a r7 = new g23$a
            d36 r8 = p000.n42.m64517c(r5)
            r1 = 0
            d36 r8 = r8.mo51121O0(r1)
            d36 r1 = p000.n42.m64518d(r5)
            r5 = 1
            d36 r1 = r1.mo51121O0(r5)
            w47 r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m62849d(r8, r1)
            r7.<init>(r1, r5)
            r5 = r7
            goto L_0x00fe
        L_0x00f6:
            r5 = 1
            g23$a r1 = new g23$a
            r7 = 0
            r1.<init>(r7, r5)
            r5 = r1
        L_0x00fe:
            int r1 = r5.mo51851a()
            int r10 = r10 + r1
            xc3 r1 = r5.mo51852b()
            java.lang.String r7 = "arg.projectionKind"
            if (r1 == 0) goto L_0x011b
            xc3 r1 = r5.mo51852b()
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r11.mo51409c()
            p000.vx2.m53590f(r5, r7)
            f17 r7 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m62949e(r1, r5, r13)
            goto L_0x0140
        L_0x011b:
            if (r4 == 0) goto L_0x0138
            boolean r1 = r11.mo51408b()
            if (r1 != 0) goto L_0x0138
            xc3 r1 = r11.getType()
            java.lang.String r5 = "arg.type"
            p000.vx2.m53590f(r1, r5)
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r11.mo51409c()
            p000.vx2.m53590f(r5, r7)
            f17 r7 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m62949e(r1, r5, r13)
            goto L_0x0140
        L_0x0138:
            if (r4 == 0) goto L_0x013f
            f17 r7 = p000.x17.m73835s(r13)
            goto L_0x0140
        L_0x013f:
            r7 = 0
        L_0x0140:
            r6.add(r7)
            r1 = r20
            r7 = r23
            r5 = 10
            r8 = 0
            goto L_0x0087
        L_0x014c:
            int r10 = r10 - r21
            if (r4 != 0) goto L_0x017c
            if (r2 != 0) goto L_0x017c
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x015a
        L_0x0158:
            r7 = 1
            goto L_0x0172
        L_0x015a:
            java.util.Iterator r1 = r6.iterator()
        L_0x015e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0158
            java.lang.Object r3 = r1.next()
            f17 r3 = (p000.f17) r3
            if (r3 != 0) goto L_0x016e
            r7 = 1
            goto L_0x016f
        L_0x016e:
            r7 = 0
        L_0x016f:
            if (r7 != 0) goto L_0x015e
            r7 = 0
        L_0x0172:
            if (r7 == 0) goto L_0x017c
            g23$b r1 = new g23$b
            r3 = 0
            r7 = 0
            r1.<init>(r7, r10, r3)
            return r1
        L_0x017c:
            r3 = 0
            r7 = 0
            r1 = 3
            dm[] r1 = new p000.C6983dm[r1]
            dm r5 = r19.getAnnotations()
            r1[r3] = r5
            nq1 r5 = p000.p07.f43969b
            if (r4 == 0) goto L_0x018f
            r4 = 1
            goto L_0x0190
        L_0x018f:
            r4 = r3
        L_0x0190:
            if (r4 == 0) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r5 = r7
        L_0x0194:
            r4 = 1
            r1[r4] = r5
            r5 = 2
            nq1 r8 = p000.p07.f43968a
            if (r2 == 0) goto L_0x01a0
            r11 = r4
            goto L_0x01a1
        L_0x01a0:
            r11 = r3
        L_0x01a1:
            if (r11 == 0) goto L_0x01a4
            goto L_0x01a5
        L_0x01a4:
            r8 = r7
        L_0x01a5:
            r1[r5] = r8
            java.util.List r1 = p000.ck0.m33067o(r1)
            dm r1 = p000.p07.m70835f(r1)
            rz6 r11 = p000.sz6.m72128b(r1)
            java.util.List r1 = r19.mo51132F0()
            java.util.Iterator r5 = r6.iterator()
            java.util.Iterator r7 = r1.iterator()
            java.util.ArrayList r13 = new java.util.ArrayList
            r8 = 10
            int r6 = p000.dk0.m43495u(r6, r8)
            int r1 = p000.dk0.m43495u(r1, r8)
            int r1 = java.lang.Math.min(r6, r1)
            r13.<init>(r1)
        L_0x01d2:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x01f2
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x01f2
            java.lang.Object r1 = r5.next()
            java.lang.Object r6 = r7.next()
            f17 r6 = (p000.f17) r6
            f17 r1 = (p000.f17) r1
            if (r1 != 0) goto L_0x01ed
            goto L_0x01ee
        L_0x01ed:
            r6 = r1
        L_0x01ee:
            r13.add(r6)
            goto L_0x01d2
        L_0x01f2:
            if (r2 == 0) goto L_0x01f9
            boolean r1 = r2.booleanValue()
            goto L_0x01fd
        L_0x01f9:
            boolean r1 = r19.mo51135I0()
        L_0x01fd:
            r14 = r1
            r15 = 0
            r16 = 16
            r17 = 0
            d36 r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m62853i(r11, r12, r13, r14, r15, r16, r17)
            boolean r5 = r9.mo52600b()
            if (r5 == 0) goto L_0x0211
            d36 r1 = r0.mo51850e(r1)
        L_0x0211:
            if (r2 == 0) goto L_0x021b
            boolean r2 = r9.mo52603e()
            if (r2 == 0) goto L_0x021b
            r5 = r4
            goto L_0x021c
        L_0x021b:
            r5 = r3
        L_0x021c:
            g23$b r2 = new g23$b
            r2.<init>(r1, r10, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g23.mo51848b(d36, rc2, int, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition, boolean, boolean):g23$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        if (r13 == null) goto L_0x0098;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.g23.C7114a mo51849d(p000.w47 r12, p000.rc2<? super java.lang.Integer, p000.j23> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = p000.zc3.m74855a(r12)
            r1 = 0
            if (r0 == 0) goto L_0x000e
            g23$a r12 = new g23$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        L_0x000e:
            boolean r0 = r12 instanceof p000.i42
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r12 instanceof p000.j75
            r9 = r12
            i42 r9 = (p000.i42) r9
            d36 r3 = r9.mo52399P0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            g23$b r10 = r2.mo51848b(r3, r4, r5, r6, r7, r8)
            d36 r3 = r9.mo52400Q0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER
            g23$b r13 = r2.mo51848b(r3, r4, r5, r6, r7, r8)
            r10.mo51854b()
            r13.mo51854b()
            d36 r14 = r10.mo51855c()
            if (r14 != 0) goto L_0x0043
            d36 r14 = r13.mo51855c()
            if (r14 != 0) goto L_0x0043
            goto L_0x00a3
        L_0x0043:
            boolean r14 = r10.mo51853a()
            if (r14 != 0) goto L_0x0085
            boolean r14 = r13.mo51853a()
            if (r14 == 0) goto L_0x0050
            goto L_0x0085
        L_0x0050:
            if (r0 == 0) goto L_0x006c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl
            d36 r12 = r10.mo51855c()
            if (r12 != 0) goto L_0x005e
            d36 r12 = r9.mo52399P0()
        L_0x005e:
            d36 r13 = r13.mo51855c()
            if (r13 != 0) goto L_0x0068
            d36 r13 = r9.mo52400Q0()
        L_0x0068:
            r1.<init>(r12, r13)
            goto L_0x00a3
        L_0x006c:
            d36 r12 = r10.mo51855c()
            if (r12 != 0) goto L_0x0076
            d36 r12 = r9.mo52399P0()
        L_0x0076:
            d36 r13 = r13.mo51855c()
            if (r13 != 0) goto L_0x0080
            d36 r13 = r9.mo52400Q0()
        L_0x0080:
            w47 r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m62849d(r12, r13)
            goto L_0x00a3
        L_0x0085:
            d36 r13 = r13.mo51855c()
            if (r13 == 0) goto L_0x0098
            d36 r14 = r10.mo51855c()
            if (r14 != 0) goto L_0x0092
            r14 = r13
        L_0x0092:
            w47 r13 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m62849d(r14, r13)
            if (r13 != 0) goto L_0x009f
        L_0x0098:
            d36 r13 = r10.mo51855c()
            p000.vx2.m53588d(r13)
        L_0x009f:
            w47 r1 = p000.c27.m56296d(r12, r13)
        L_0x00a3:
            g23$a r12 = new g23$a
            int r13 = r10.mo51854b()
            r12.<init>(r1, r13)
            goto L_0x00df
        L_0x00ad:
            boolean r0 = r12 instanceof p000.d36
            if (r0 == 0) goto L_0x00e0
            r2 = r12
            d36 r2 = (p000.d36) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE
            r6 = 0
            r8 = 8
            r9 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            g23$b r13 = m57981c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            g23$a r14 = new g23$a
            boolean r15 = r13.mo51853a()
            if (r15 == 0) goto L_0x00d3
            d36 r15 = r13.mo51855c()
            w47 r12 = p000.c27.m56296d(r12, r15)
            goto L_0x00d7
        L_0x00d3:
            d36 r12 = r13.mo51855c()
        L_0x00d7:
            int r13 = r13.mo51854b()
            r14.<init>(r12, r13)
            r12 = r14
        L_0x00df:
            return r12
        L_0x00e0:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g23.mo51849d(w47, rc2, int, boolean):g23$a");
    }

    /* renamed from: e */
    public final d36 mo51850e(d36 d36) {
        if (this.f37945a.mo67208a()) {
            return o66.m70168h(d36, true);
        }
        return new t84(d36);
    }
}
