package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;

/* compiled from: KotlinTypePreparator.kt */
public abstract class KotlinTypePreparator extends C7339k7 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator$a */
    /* compiled from: KotlinTypePreparator.kt */
    public static final class C7727a extends KotlinTypePreparator {

        /* renamed from: a */
        public static final C7727a f40292a = new C7727a();
    }

    /* renamed from: b */
    public w47 mo52872a(ad3 ad3) {
        w47 w47;
        vx2.m53591g(ad3, "type");
        if (ad3 instanceof xc3) {
            w47 K0 = ((xc3) ad3).mo64506K0();
            if (K0 instanceof d36) {
                w47 = mo55350c((d36) K0);
            } else if (K0 instanceof i42) {
                i42 i42 = (i42) K0;
                d36 c = mo55350c(i42.mo52399P0());
                d36 c2 = mo55350c(i42.mo52400Q0());
                if (c == i42.mo52399P0() && c2 == i42.mo52400Q0()) {
                    w47 = K0;
                } else {
                    w47 = KotlinTypeFactory.m62849d(c, c2);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return c27.m56295c(w47, K0, new KotlinTypePreparator$prepareType$1(this));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: w47} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: xc3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: xc3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: w47} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: xc3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: xc3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: w47} */
    /* JADX WARNING: type inference failed for: r5v3, types: [kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.d36 mo55350c(p000.d36 r17) {
        /*
            r16 = this;
            yz6 r0 = r17.mo51134H0()
            boolean r1 = r0 instanceof p000.lb0
            r2 = 1
            r3 = 0
            r4 = 10
            r5 = 0
            if (r1 == 0) goto L_0x0085
            lb0 r0 = (p000.lb0) r0
            f17 r1 = r0.mo52887c()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r1.mo51409c()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r6 != r7) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = r3
        L_0x001d:
            if (r2 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = r5
        L_0x0021:
            if (r1 == 0) goto L_0x002d
            xc3 r1 = r1.getType()
            if (r1 == 0) goto L_0x002d
            w47 r5 = r1.mo64506K0()
        L_0x002d:
            r9 = r5
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r1 = r0.mo55852h()
            if (r1 != 0) goto L_0x0069
            f17 r11 = r0.mo52887c()
            java.util.Collection r1 = r0.mo51811g()
            java.util.ArrayList r12 = new java.util.ArrayList
            int r2 = p000.dk0.m43495u(r1, r4)
            r12.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0049:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r1.next()
            xc3 r2 = (p000.xc3) r2
            w47 r2 = r2.mo64506K0()
            r12.add(r2)
            goto L_0x0049
        L_0x005d:
            r13 = 0
            r14 = 4
            r15 = 0
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r1 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            r0.mo55854j(r1)
        L_0x0069:
            d64 r1 = new d64
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r7 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r8 = r0.mo55852h()
            p000.vx2.m53588d(r8)
            rz6 r10 = r17.mo51133G0()
            boolean r11 = r17.mo51135I0()
            r12 = 0
            r13 = 32
            r14 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x0085:
            boolean r1 = r0 instanceof p000.fx2
            if (r1 == 0) goto L_0x00cf
            fx2 r0 = (p000.fx2) r0
            java.util.Collection r0 = r0.mo51811g()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = p000.dk0.m43495u(r0, r4)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x009c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b9
            java.lang.Object r2 = r0.next()
            xc3 r2 = (p000.xc3) r2
            boolean r4 = r17.mo51135I0()
            xc3 r2 = p000.x17.m73832p(r2, r4)
            java.lang.String r4 = "makeNullableAsSpecified(it, type.isMarkedNullable)"
            p000.vx2.m53590f(r2, r4)
            r1.add(r2)
            goto L_0x009c
        L_0x00b9:
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r0 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            r0.<init>(r1)
            rz6 r1 = r17.mo51133G0()
            java.util.List r2 = p000.ck0.m33062j()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r4 = r17.mo51146m()
            d36 r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m62854j(r1, r0, r2, r3, r4)
            return r0
        L_0x00cf:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r1 == 0) goto L_0x0120
            boolean r1 = r17.mo51135I0()
            if (r1 == 0) goto L_0x0120
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r0 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r0
            java.util.Collection r1 = r0.mo51811g()
            java.util.ArrayList r6 = new java.util.ArrayList
            int r4 = p000.dk0.m43495u(r1, r4)
            r6.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x00ec:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0101
            java.lang.Object r3 = r1.next()
            xc3 r3 = (p000.xc3) r3
            xc3 r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m62964t(r3)
            r6.add(r3)
            r3 = r2
            goto L_0x00ec
        L_0x0101:
            if (r3 != 0) goto L_0x0104
            goto L_0x0117
        L_0x0104:
            xc3 r1 = r0.mo55299i()
            if (r1 == 0) goto L_0x010e
            xc3 r5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m62964t(r1)
        L_0x010e:
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r1 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            r1.<init>(r6)
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r5 = r1.mo55302n(r5)
        L_0x0117:
            if (r5 != 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r0 = r5
        L_0x011b:
            d36 r0 = r0.mo55297h()
            return r0
        L_0x0120:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.mo55350c(d36):d36");
    }
}
