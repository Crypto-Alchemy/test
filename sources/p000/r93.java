package p000;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\"\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, mo44877d2 = {"Lm93;", "Lq83;", "b", "(Lm93;)Lq83;", "getJvmErasure$annotations", "(Lm93;)V", "jvmErasure", "Lx83;", "a", "(Lx83;)Lq83;", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: r93 */
/* compiled from: KTypesJvm.kt */
public final class r93 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: m93} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p000.q83<?> m26136a(p000.x83 r5) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r5, r0)
            boolean r0 = r5 instanceof p000.q83
            if (r0 == 0) goto L_0x000c
            q83 r5 = (p000.q83) r5
            goto L_0x0073
        L_0x000c:
            boolean r0 = r5 instanceof p000.o93
            if (r0 == 0) goto L_0x0074
            o93 r5 = (p000.o93) r5
            java.util.List r5 = r5.getUpperBounds()
            java.util.Iterator r0 = r5.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            r3 = r1
            m93 r3 = (p000.m93) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"
            p000.vx2.m53589e(r3, r4)
            kotlin.reflect.jvm.internal.KTypeImpl r3 = (kotlin.reflect.jvm.internal.KTypeImpl) r3
            xc3 r3 = r3.mo53096n()
            yz6 r3 = r3.mo51134H0()
            eg0 r3 = r3.mo51180d()
            boolean r4 = r3 instanceof p000.if0
            if (r4 == 0) goto L_0x0042
            r2 = r3
            if0 r2 = (p000.if0) r2
        L_0x0042:
            if (r2 == 0) goto L_0x0056
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = r2.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r3 == r4) goto L_0x0056
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r2.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            if (r2 == r3) goto L_0x0056
            r2 = 1
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            if (r2 == 0) goto L_0x001a
            r2 = r1
        L_0x005a:
            m93 r2 = (p000.m93) r2
            if (r2 != 0) goto L_0x0065
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r5)
            r2 = r5
            m93 r2 = (p000.m93) r2
        L_0x0065:
            if (r2 == 0) goto L_0x006d
            q83 r5 = m26137b(r2)
            if (r5 != 0) goto L_0x0073
        L_0x006d:
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            q83 r5 = p000.ua5.m52727b(r5)
        L_0x0073:
            return r5
        L_0x0074:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot calculate JVM erasure for type: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.r93.m26136a(x83):q83");
    }

    /* renamed from: b */
    public static final q83<?> m26137b(m93 m93) {
        q83<?> a;
        vx2.m53591g(m93, "<this>");
        x83 d = m93.mo45705d();
        if (d != null && (a = m26136a(d)) != null) {
            return a;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + m93);
    }
}
