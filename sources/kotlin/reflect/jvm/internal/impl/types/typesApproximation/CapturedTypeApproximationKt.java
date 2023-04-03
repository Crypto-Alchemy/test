package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: CapturedTypeApproximation.kt */
public final class CapturedTypeApproximationKt {

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$a */
    /* compiled from: CapturedTypeApproximation.kt */
    public /* synthetic */ class C7732a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40306a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            f40306a = iArr;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$b */
    /* compiled from: CapturedTypeApproximation.kt */
    public static final class C7733b extends a07 {
        /* renamed from: k */
        public f17 mo50025k(yz6 yz6) {
            kb0 kb0;
            vx2.m53591g(yz6, "key");
            if (yz6 instanceof kb0) {
                kb0 = (kb0) yz6;
            } else {
                kb0 = null;
            }
            if (kb0 == null) {
                return null;
            }
            if (kb0.mo52887c().mo51408b()) {
                return new h17(Variance.OUT_VARIANCE, kb0.mo52887c().getType());
            }
            return kb0.mo52887c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0181  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p000.C9466vp<p000.xc3> m62969a(p000.xc3 r7) {
        /*
            java.lang.String r0 = "type"
            p000.vx2.m53591g(r7, r0)
            boolean r0 = p000.n42.m64516b(r7)
            if (r0 == 0) goto L_0x0059
            d36 r0 = p000.n42.m64517c(r7)
            vp r0 = m62969a(r0)
            d36 r1 = p000.n42.m64518d(r7)
            vp r1 = m62969a(r1)
            vp r2 = new vp
            java.lang.Object r3 = r0.mo66564c()
            xc3 r3 = (p000.xc3) r3
            d36 r3 = p000.n42.m64517c(r3)
            java.lang.Object r4 = r1.mo66564c()
            xc3 r4 = (p000.xc3) r4
            d36 r4 = p000.n42.m64518d(r4)
            w47 r3 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m62849d(r3, r4)
            w47 r3 = p000.c27.m56294b(r3, r7)
            java.lang.Object r0 = r0.mo66565d()
            xc3 r0 = (p000.xc3) r0
            d36 r0 = p000.n42.m64517c(r0)
            java.lang.Object r1 = r1.mo66565d()
            xc3 r1 = (p000.xc3) r1
            d36 r1 = p000.n42.m64518d(r1)
            w47 r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m62849d(r0, r1)
            w47 r7 = p000.c27.m56294b(r0, r7)
            r2.<init>(r3, r7)
            return r2
        L_0x0059:
            yz6 r0 = r7.mo51134H0()
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.m62412d(r7)
            java.lang.String r2 = "type.builtIns.nothingType"
            if (r1 == 0) goto L_0x00ce
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor"
            p000.vx2.m53589e(r0, r1)
            kb0 r0 = (p000.kb0) r0
            f17 r0 = r0.mo52887c()
            xc3 r1 = r0.getType()
            java.lang.String r3 = "typeProjection.type"
            p000.vx2.m53590f(r1, r3)
            xc3 r1 = m62970b(r1, r7)
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r0.mo51409c()
            int[] r4 = kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.C7732a.f40306a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 2
            if (r3 == r4) goto L_0x00bb
            r4 = 3
            if (r3 != r4) goto L_0x00a4
            vp r0 = new vp
            kotlin.reflect.jvm.internal.impl.builtins.b r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m62952h(r7)
            d36 r3 = r3.mo53150H()
            p000.vx2.m53590f(r3, r2)
            xc3 r7 = m62970b(r3, r7)
            r0.<init>(r7, r1)
            goto L_0x00cd
        L_0x00a4:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Only nontrivial projections should have been captured, not: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L_0x00bb:
            vp r0 = new vp
            kotlin.reflect.jvm.internal.impl.builtins.b r7 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m62952h(r7)
            d36 r7 = r7.mo53151I()
            java.lang.String r2 = "type.builtIns.nullableAnyType"
            p000.vx2.m53590f(r7, r2)
            r0.<init>(r1, r7)
        L_0x00cd:
            return r0
        L_0x00ce:
            java.util.List r1 = r7.mo51132F0()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x018d
            java.util.List r1 = r7.mo51132F0()
            int r1 = r1.size()
            java.util.List r3 = r0.getParameters()
            int r3 = r3.size()
            if (r1 == r3) goto L_0x00ec
            goto L_0x018d
        L_0x00ec:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r4 = r7.mo51132F0()
            java.util.List r0 = r0.getParameters()
            java.lang.String r5 = "typeConstructor.parameters"
            p000.vx2.m53590f(r0, r5)
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47321R0(r4, r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x010b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0150
            java.lang.Object r4 = r0.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            f17 r5 = (p000.f17) r5
            java.lang.Object r4 = r4.component2()
            a17 r4 = (p000.a17) r4
            java.lang.String r6 = "typeParameter"
            p000.vx2.m53590f(r4, r6)
            lz6 r4 = m62975g(r5, r4)
            boolean r5 = r5.mo51408b()
            if (r5 == 0) goto L_0x0139
            r1.add(r4)
            r3.add(r4)
            goto L_0x010b
        L_0x0139:
            vp r4 = m62972d(r4)
            java.lang.Object r5 = r4.mo66562a()
            lz6 r5 = (p000.lz6) r5
            java.lang.Object r4 = r4.mo66563b()
            lz6 r4 = (p000.lz6) r4
            r1.add(r5)
            r3.add(r4)
            goto L_0x010b
        L_0x0150:
            boolean r0 = r1.isEmpty()
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x015a
        L_0x0158:
            r4 = r5
            goto L_0x0171
        L_0x015a:
            java.util.Iterator r0 = r1.iterator()
        L_0x015e:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0158
            java.lang.Object r6 = r0.next()
            lz6 r6 = (p000.lz6) r6
            boolean r6 = r6.mo55996d()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x015e
        L_0x0171:
            vp r0 = new vp
            if (r4 == 0) goto L_0x0181
            kotlin.reflect.jvm.internal.impl.builtins.b r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m62952h(r7)
            d36 r1 = r1.mo53150H()
            p000.vx2.m53590f(r1, r2)
            goto L_0x0185
        L_0x0181:
            xc3 r1 = m62973e(r7, r1)
        L_0x0185:
            xc3 r7 = m62973e(r7, r3)
            r0.<init>(r1, r7)
            return r0
        L_0x018d:
            vp r0 = new vp
            r0.<init>(r7, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.m62969a(xc3):vp");
    }

    /* renamed from: b */
    public static final xc3 m62970b(xc3 xc3, xc3 xc32) {
        xc3 q = x17.m73833q(xc3, xc32.mo51135I0());
        vx2.m53590f(q, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return q;
    }

    /* renamed from: c */
    public static final f17 m62971c(f17 f17, boolean z) {
        if (f17 == null) {
            return null;
        }
        if (f17.mo51408b()) {
            return f17;
        }
        xc3 type = f17.getType();
        vx2.m53590f(type, "typeProjection.type");
        if (!x17.m73819c(type, C7734x21acc51c.INSTANCE)) {
            return f17;
        }
        Variance c = f17.mo51409c();
        vx2.m53590f(c, "typeProjection.projectionKind");
        if (c == Variance.OUT_VARIANCE) {
            return new h17(c, m62969a(type).mo66565d());
        }
        if (z) {
            return new h17(c, m62969a(type).mo66564c());
        }
        return m62974f(f17);
    }

    /* renamed from: d */
    public static final C9466vp<lz6> m62972d(lz6 lz6) {
        C9466vp<xc3> a = m62969a(lz6.mo55993a());
        C9466vp<xc3> a2 = m62969a(lz6.mo55994b());
        return new C9466vp<>(new lz6(lz6.mo55995c(), a.mo66563b(), a2.mo66562a()), new lz6(lz6.mo55995c(), a.mo66562a(), a2.mo66563b()));
    }

    /* renamed from: e */
    public static final xc3 m62973e(xc3 xc3, List<lz6> list) {
        xc3.mo51132F0().size();
        list.size();
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (lz6 h : list) {
            arrayList.add(m62976h(h));
        }
        return q17.m71169e(xc3, arrayList, (C6983dm) null, (List) null, 6, (Object) null);
    }

    /* renamed from: f */
    public static final f17 m62974f(f17 f17) {
        TypeSubstitutor g = TypeSubstitutor.m62902g(new C7733b());
        vx2.m53590f(g, "create(object : TypeCons…ojection\n        }\n    })");
        return g.mo55343t(f17);
    }

    /* renamed from: g */
    public static final lz6 m62975g(f17 f17, a17 a17) {
        int i = C7732a.f40306a[TypeSubstitutor.m62898c(a17.mo50049j(), f17).ordinal()];
        if (i == 1) {
            xc3 type = f17.getType();
            vx2.m53590f(type, "type");
            xc3 type2 = f17.getType();
            vx2.m53590f(type2, "type");
            return new lz6(a17, type, type2);
        } else if (i == 2) {
            xc3 type3 = f17.getType();
            vx2.m53590f(type3, "type");
            d36 I = DescriptorUtilsKt.m62445f(a17).mo53151I();
            vx2.m53590f(I, "typeParameter.builtIns.nullableAnyType");
            return new lz6(a17, type3, I);
        } else if (i == 3) {
            d36 H = DescriptorUtilsKt.m62445f(a17).mo53150H();
            vx2.m53590f(H, "typeParameter.builtIns.nothingType");
            xc3 type4 = f17.getType();
            vx2.m53590f(type4, "type");
            return new lz6(a17, H, type4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: h */
    public static final f17 m62976h(lz6 lz6) {
        Variance variance;
        lz6.mo55996d();
        if (vx2.m53586b(lz6.mo55993a(), lz6.mo55994b()) || lz6.mo55995c().mo50049j() == (variance = Variance.IN_VARIANCE)) {
            return new h17(lz6.mo55993a());
        }
        if (C7389b.m60137m0(lz6.mo55993a()) && lz6.mo55995c().mo50049j() != variance) {
            return new h17(m62977i(lz6, Variance.OUT_VARIANCE), lz6.mo55994b());
        }
        if (C7389b.m60139o0(lz6.mo55994b())) {
            return new h17(m62977i(lz6, variance), lz6.mo55993a());
        }
        return new h17(m62977i(lz6, Variance.OUT_VARIANCE), lz6.mo55994b());
    }

    /* renamed from: i */
    public static final Variance m62977i(lz6 lz6, Variance variance) {
        if (variance == lz6.mo55995c().mo50049j()) {
            return Variance.INVARIANT;
        }
        return variance;
    }
}
