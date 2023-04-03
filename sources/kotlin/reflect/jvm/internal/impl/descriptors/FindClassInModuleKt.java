package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* compiled from: findClassInModule.kt */
public final class FindClassInModuleKt {
    /* renamed from: a */
    public static final if0 m60278a(mx3 mx3, nf0 nf0) {
        vx2.m53591g(mx3, "<this>");
        vx2.m53591g(nf0, "classId");
        eg0 b = m60279b(mx3, nf0);
        if (b instanceof if0) {
            return (if0) b;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p000.eg0 m60279b(p000.mx3 r10, p000.nf0 r11) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r10, r0)
            java.lang.String r0 = "classId"
            p000.vx2.m53591g(r11, r0)
            mx3 r0 = p000.ve5.m73204a(r10)
            java.lang.String r1 = "name"
            r2 = 1
            java.lang.String r3 = "segments.first()"
            java.lang.String r4 = "classId.relativeClassName.pathSegments()"
            java.lang.String r5 = "classId.packageFqName"
            r6 = 0
            if (r0 != 0) goto L_0x0082
            u82 r0 = r11.mo62678h()
            p000.vx2.m53590f(r0, r5)
            tk4 r10 = r10.mo51532N(r0)
            u82 r11 = r11.mo62680i()
            java.util.List r11 = r11.mo66200f()
            p000.vx2.m53590f(r11, r4)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = r10.mo53288m()
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47329Z(r11)
            p000.vx2.m53590f(r0, r3)
            r24 r0 = (p000.r24) r0
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r3 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            eg0 r10 = r10.mo50864e(r0, r3)
            if (r10 != 0) goto L_0x0047
            goto L_0x014c
        L_0x0047:
            int r0 = r11.size()
            java.util.List r11 = r11.subList(r2, r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x0053:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r11.next()
            r24 r0 = (p000.r24) r0
            boolean r2 = r10 instanceof p000.if0
            if (r2 != 0) goto L_0x0065
            goto L_0x014c
        L_0x0065:
            if0 r10 = (p000.if0) r10
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = r10.mo52461O()
            p000.vx2.m53590f(r0, r1)
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r2 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            eg0 r10 = r10.mo50864e(r0, r2)
            boolean r0 = r10 instanceof p000.if0
            if (r0 == 0) goto L_0x007b
            if0 r10 = (p000.if0) r10
            goto L_0x007c
        L_0x007b:
            r10 = r6
        L_0x007c:
            if (r10 == 0) goto L_0x014c
            goto L_0x0053
        L_0x007f:
            r6 = r10
            goto L_0x014c
        L_0x0082:
            u82 r7 = r11.mo62678h()
            p000.vx2.m53590f(r7, r5)
            tk4 r0 = r0.mo51532N(r7)
            u82 r7 = r11.mo62680i()
            java.util.List r7 = r7.mo66200f()
            p000.vx2.m53590f(r7, r4)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = r0.mo53288m()
            java.lang.Object r8 = kotlin.collections.CollectionsKt___CollectionsKt.m47329Z(r7)
            p000.vx2.m53590f(r8, r3)
            r24 r8 = (p000.r24) r8
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r9 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            eg0 r0 = r0.mo50864e(r8, r9)
            if (r0 != 0) goto L_0x00af
        L_0x00ad:
            r0 = r6
            goto L_0x00e6
        L_0x00af:
            int r8 = r7.size()
            java.util.List r7 = r7.subList(r2, r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x00bb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e6
            java.lang.Object r8 = r7.next()
            r24 r8 = (p000.r24) r8
            boolean r9 = r0 instanceof p000.if0
            if (r9 != 0) goto L_0x00cc
            goto L_0x00ad
        L_0x00cc:
            if0 r0 = (p000.if0) r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = r0.mo52461O()
            p000.vx2.m53590f(r8, r1)
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r9 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            eg0 r0 = r0.mo50864e(r8, r9)
            boolean r8 = r0 instanceof p000.if0
            if (r8 == 0) goto L_0x00e2
            if0 r0 = (p000.if0) r0
            goto L_0x00e3
        L_0x00e2:
            r0 = r6
        L_0x00e3:
            if (r0 == 0) goto L_0x00ad
            goto L_0x00bb
        L_0x00e6:
            if (r0 != 0) goto L_0x014b
            u82 r0 = r11.mo62678h()
            p000.vx2.m53590f(r0, r5)
            tk4 r10 = r10.mo51532N(r0)
            u82 r11 = r11.mo62680i()
            java.util.List r11 = r11.mo66200f()
            p000.vx2.m53590f(r11, r4)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = r10.mo53288m()
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47329Z(r11)
            p000.vx2.m53590f(r0, r3)
            r24 r0 = (p000.r24) r0
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r3 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            eg0 r10 = r10.mo50864e(r0, r3)
            if (r10 != 0) goto L_0x0114
            goto L_0x014c
        L_0x0114:
            int r0 = r11.size()
            java.util.List r11 = r11.subList(r2, r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x0120:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r11.next()
            r24 r0 = (p000.r24) r0
            boolean r2 = r10 instanceof p000.if0
            if (r2 != 0) goto L_0x0131
            goto L_0x014c
        L_0x0131:
            if0 r10 = (p000.if0) r10
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = r10.mo52461O()
            p000.vx2.m53590f(r0, r1)
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r2 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            eg0 r10 = r10.mo50864e(r0, r2)
            boolean r0 = r10 instanceof p000.if0
            if (r0 == 0) goto L_0x0147
            if0 r10 = (p000.if0) r10
            goto L_0x0148
        L_0x0147:
            r10 = r6
        L_0x0148:
            if (r10 == 0) goto L_0x014c
            goto L_0x0120
        L_0x014b:
            r6 = r0
        L_0x014c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.m60279b(mx3, nf0):eg0");
    }

    /* renamed from: c */
    public static final if0 m60280c(mx3 mx3, nf0 nf0, NotFoundClasses notFoundClasses) {
        vx2.m53591g(mx3, "<this>");
        vx2.m53591g(nf0, "classId");
        vx2.m53591g(notFoundClasses, "notFoundClasses");
        if0 a = m60278a(mx3, nf0);
        if (a != null) {
            return a;
        }
        return notFoundClasses.mo53241d(nf0, SequencesKt___SequencesKt.m63020D(SequencesKt___SequencesKt.m63034x(SequencesKt__SequencesKt.m63015j(nf0, C7411x24bfe126.INSTANCE), C7412x24bfe127.INSTANCE)));
    }

    /* renamed from: d */
    public static final hz6 m60281d(mx3 mx3, nf0 nf0) {
        vx2.m53591g(mx3, "<this>");
        vx2.m53591g(nf0, "classId");
        eg0 b = m60279b(mx3, nf0);
        if (b instanceof hz6) {
            return (hz6) b;
        }
        return null;
    }
}
