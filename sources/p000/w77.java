package p000;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;

/* renamed from: w77 */
/* compiled from: utils.kt */
public final class w77 {
    /* renamed from: a */
    public static final xc3 m73511a(xc3 xc3) {
        return CapturedTypeApproximationKt.m62969a(xc3).mo66565d();
    }

    /* renamed from: b */
    public static final String m73512b(yz6 yz6) {
        StringBuilder sb = new StringBuilder();
        m73513c("type: " + yz6, sb);
        m73513c("hashCode: " + yz6.hashCode(), sb);
        m73513c("javaClass: " + yz6.getClass().getCanonicalName(), sb);
        for (d31 d = yz6.mo51180d(); d != null; d = d.mo51119b()) {
            m73513c("fqName: " + DescriptorRenderer.f39992g.mo54810q(d), sb);
            m73513c("javaClass: " + d.getClass().getCanonicalName(), sb);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    public static final StringBuilder m73513c(String str, StringBuilder sb) {
        vx2.m53591g(str, "<this>");
        sb.append(str);
        vx2.m53590f(sb, "append(value)");
        sb.append(10);
        vx2.m53590f(sb, "append('\\n')");
        return sb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p000.xc3 m73514d(p000.xc3 r9, p000.xc3 r10, p000.wz6 r11) {
        /*
            java.lang.String r0 = "subtype"
            p000.vx2.m53591g(r9, r0)
            java.lang.String r0 = "supertype"
            p000.vx2.m53591g(r10, r0)
            java.lang.String r0 = "typeCheckingProcedureCallbacks"
            p000.vx2.m53591g(r11, r0)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            id6 r1 = new id6
            r2 = 0
            r1.<init>(r9, r2)
            r0.add(r1)
            yz6 r9 = r10.mo51134H0()
        L_0x0021:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L_0x0123
            java.lang.Object r10 = r0.poll()
            id6 r10 = (p000.id6) r10
            xc3 r1 = r10.mo52457b()
            yz6 r3 = r1.mo51134H0()
            boolean r4 = r11.mo66379a(r3, r9)
            if (r4 == 0) goto L_0x0101
            boolean r0 = r1.mo51135I0()
            id6 r10 = r10.mo52456a()
        L_0x0043:
            if (r10 == 0) goto L_0x00bf
            xc3 r3 = r10.mo52457b()
            java.util.List r4 = r3.mo51132F0()
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x005b
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x005b
        L_0x0059:
            r4 = r7
            goto L_0x0079
        L_0x005b:
            java.util.Iterator r4 = r4.iterator()
        L_0x005f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0059
            java.lang.Object r5 = r4.next()
            f17 r5 = (p000.f17) r5
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r5.mo51409c()
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r5 == r8) goto L_0x0075
            r5 = r6
            goto L_0x0076
        L_0x0075:
            r5 = r7
        L_0x0076:
            if (r5 == 0) goto L_0x005f
            r4 = r6
        L_0x0079:
            if (r4 == 0) goto L_0x0099
            a07$a r4 = p000.a07.f36338c
            p17 r4 = r4.mo50026a(r3)
            p17 r4 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.m62414f(r4, r7, r6, r2)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r4 = r4.mo65206c()
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            xc3 r1 = r4.mo55338n(r1, r5)
            java.lang.String r4 = "TypeConstructorSubstitut…uted, Variance.INVARIANT)"
            p000.vx2.m53590f(r1, r4)
            xc3 r1 = m73511a(r1)
            goto L_0x00ae
        L_0x0099:
            a07$a r4 = p000.a07.f36338c
            p17 r4 = r4.mo50026a(r3)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r4 = r4.mo65206c()
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            xc3 r1 = r4.mo55338n(r1, r5)
            java.lang.String r4 = "{\n                    Ty…ARIANT)\n                }"
            p000.vx2.m53590f(r1, r4)
        L_0x00ae:
            if (r0 != 0) goto L_0x00b9
            boolean r0 = r3.mo51135I0()
            if (r0 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r0 = r7
            goto L_0x00ba
        L_0x00b9:
            r0 = r6
        L_0x00ba:
            id6 r10 = r10.mo52456a()
            goto L_0x0043
        L_0x00bf:
            yz6 r10 = r1.mo51134H0()
            boolean r2 = r11.mo66379a(r10, r9)
            if (r2 == 0) goto L_0x00ce
            xc3 r9 = p000.x17.m73832p(r1, r0)
            return r9
        L_0x00ce:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type constructors should be equals!\nsubstitutedSuperType: "
            r1.append(r2)
            java.lang.String r2 = m73512b(r10)
            r1.append(r2)
            java.lang.String r2 = ", \n\nsupertype: "
            r1.append(r2)
            java.lang.String r2 = m73512b(r9)
            r1.append(r2)
            java.lang.String r2 = " \n"
            r1.append(r2)
            boolean r9 = r11.mo66379a(r10, r9)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x0101:
            java.util.Collection r1 = r3.mo51811g()
            java.util.Iterator r1 = r1.iterator()
        L_0x0109:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r1.next()
            xc3 r3 = (p000.xc3) r3
            id6 r4 = new id6
            java.lang.String r5 = "immediateSupertype"
            p000.vx2.m53590f(r3, r5)
            r4.<init>(r3, r10)
            r0.add(r4)
            goto L_0x0109
        L_0x0123:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w77.m73514d(xc3, xc3, wz6):xc3");
    }
}
