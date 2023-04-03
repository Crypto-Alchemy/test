package p000;

import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* renamed from: q07 */
/* compiled from: typeEnhancementUtils.kt */
public final class q07 {
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        if (r6 == false) goto L_0x00d6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p000.j23 m71152a(p000.j23 r6, java.util.Collection<p000.j23> r7, boolean r8, boolean r9, boolean r10) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r6, r0)
            java.lang.String r0 = "superQualifiers"
            p000.vx2.m53591g(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L_0x0013:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0029
            java.lang.Object r2 = r1.next()
            j23 r2 = (p000.j23) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = m71153b(r2)
            if (r2 == 0) goto L_0x0013
            r0.add(r2)
            goto L_0x0013
        L_0x0029:
            java.util.Set r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47315O0(r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = m71153b(r6)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = m71156e(r0, r1, r8)
            if (r0 != 0) goto L_0x0063
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x0040:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r2.next()
            j23 r3 = (p000.j23) r3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = r3.mo52602d()
            if (r3 == 0) goto L_0x0040
            r1.add(r3)
            goto L_0x0040
        L_0x0056:
            java.util.Set r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47315O0(r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = r6.mo52602d()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = m71156e(r1, r2, r8)
            goto L_0x0064
        L_0x0063:
            r1 = r0
        L_0x0064:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L_0x006d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r3.next()
            j23 r4 = (p000.j23) r4
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r4 = r4.mo52601c()
            if (r4 == 0) goto L_0x006d
            r2.add(r4)
            goto L_0x006d
        L_0x0083:
            java.util.Set r2 = kotlin.collections.CollectionsKt___CollectionsKt.m47315O0(r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r5 = r6.mo52601c()
            java.lang.Object r8 = m71155d(r2, r3, r4, r5, r8)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x00a9
            if (r10 != 0) goto L_0x00a5
            if (r9 == 0) goto L_0x00a3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            if (r1 != r9) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r9 = r4
            goto L_0x00a6
        L_0x00a5:
            r9 = r3
        L_0x00a6:
            if (r9 != 0) goto L_0x00a9
            r2 = r1
        L_0x00a9:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            if (r2 != r9) goto L_0x00d6
            boolean r6 = r6.mo52600b()
            if (r6 != 0) goto L_0x00d4
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x00bb
        L_0x00b9:
            r6 = r4
            goto L_0x00d2
        L_0x00bb:
            java.util.Iterator r6 = r7.iterator()
        L_0x00bf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b9
            java.lang.Object r7 = r6.next()
            j23 r7 = (p000.j23) r7
            boolean r7 = r7.mo52600b()
            if (r7 == 0) goto L_0x00bf
            r6 = r3
        L_0x00d2:
            if (r6 == 0) goto L_0x00d6
        L_0x00d4:
            r6 = r3
            goto L_0x00d7
        L_0x00d6:
            r6 = r4
        L_0x00d7:
            if (r2 == 0) goto L_0x00dc
            if (r0 == r1) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r3 = r4
        L_0x00dd:
            j23 r7 = new j23
            r7.<init>(r2, r8, r6, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q07.m71152a(j23, java.util.Collection, boolean, boolean, boolean):j23");
    }

    /* renamed from: b */
    public static final NullabilityQualifier m71153b(j23 j23) {
        if (j23.mo52603e()) {
            return null;
        }
        return j23.mo52602d();
    }

    /* renamed from: c */
    public static final boolean m71154c(r17 r17, ad3 ad3) {
        vx2.m53591g(r17, "<this>");
        vx2.m53591g(ad3, "type");
        u82 u82 = t73.f44673u;
        vx2.m53590f(u82, "ENHANCED_NULLABILITY_ANNOTATION");
        return r17.mo51063Q(ad3, u82);
    }

    /* renamed from: d */
    public static final <T> T m71155d(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set<T> O0;
        T t4;
        if (z) {
            if (set.contains(t)) {
                t4 = t;
            } else if (set.contains(t2)) {
                t4 = t2;
            } else {
                t4 = null;
            }
            if (vx2.m53586b(t4, t) && vx2.m53586b(t3, t2)) {
                return null;
            }
            if (t3 == null) {
                return t4;
            }
            return t3;
        }
        if (!(t3 == null || (O0 = CollectionsKt___CollectionsKt.m47315O0(oy5.m49612l(set, t3))) == null)) {
            set = O0;
        }
        return CollectionsKt___CollectionsKt.m47301A0(set);
    }

    /* renamed from: e */
    public static final NullabilityQualifier m71156e(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        if (nullabilityQualifier == nullabilityQualifier2) {
            return nullabilityQualifier2;
        }
        return (NullabilityQualifier) m71155d(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
    }
}
