package p000;

import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

/* renamed from: vc1 */
/* compiled from: descriptorBasedTypeSignatureMapping.kt */
public final class vc1 {
    /* renamed from: a */
    public static final String m73180a(if0 if0, v07<?> v07) {
        if0 if02;
        vx2.m53591g(if0, "klass");
        vx2.m53591g(v07, "typeMappingConfiguration");
        String b = v07.mo66385b(if0);
        if (b != null) {
            return b;
        }
        d31 b2 = if0.mo51119b();
        vx2.m53590f(b2, "klass.containingDeclaration");
        String f = n66.m64528b(if0.getName()).mo65597f();
        vx2.m53590f(f, "safeIdentifier(klass.name).identifier");
        if (b2 instanceof fk4) {
            u82 e = ((fk4) b2).mo51711e();
            if (e.mo66197d()) {
                return f;
            }
            StringBuilder sb = new StringBuilder();
            String b3 = e.mo66195b();
            vx2.m53590f(b3, "fqName.asString()");
            sb.append(yb6.m74331H(b3, '.', '/', false, 4, (Object) null));
            sb.append('/');
            sb.append(f);
            return sb.toString();
        }
        if (b2 instanceof if0) {
            if02 = (if0) b2;
        } else {
            if02 = null;
        }
        if (if02 != null) {
            String d = v07.mo66387d(if02);
            if (d == null) {
                d = m73180a(if02, v07);
            }
            return d + DecodedChar.FNC1 + f;
        }
        throw new IllegalArgumentException("Unexpected container: " + b2 + " for " + if0);
    }

    /* renamed from: b */
    public static /* synthetic */ String m73181b(if0 if0, v07 v07, int i, Object obj) {
        if ((i & 2) != 0) {
            v07 = w07.f45412a;
        }
        return m73180a(if0, v07);
    }

    /* renamed from: c */
    public static final boolean m73182c(C7420a aVar) {
        vx2.m53591g(aVar, "descriptor");
        if (aVar instanceof C7424b) {
            return true;
        }
        xc3 returnType = aVar.getReturnType();
        vx2.m53588d(returnType);
        if (C7389b.m60115B0(returnType)) {
            xc3 returnType2 = aVar.getReturnType();
            vx2.m53588d(returnType2);
            if (x17.m73828l(returnType2) || (aVar instanceof ix4)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r12v9, types: [d31, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m73183d(p000.xc3 r8, p000.k83<T> r9, p000.x07 r10, p000.v07<? extends T> r11, p000.z73<T> r12, p000.id2<? super p000.xc3, ? super T, ? super p000.x07, p000.r37> r13) {
        /*
            java.lang.String r0 = "kotlinType"
            p000.vx2.m53591g(r8, r0)
            java.lang.String r0 = "factory"
            p000.vx2.m53591g(r9, r0)
            java.lang.String r0 = "mode"
            p000.vx2.m53591g(r10, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            p000.vx2.m53591g(r11, r0)
            java.lang.String r0 = "writeGenericType"
            p000.vx2.m53591g(r13, r0)
            xc3 r1 = r11.mo66386c(r8)
            if (r1 == 0) goto L_0x0029
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r8 = m73183d(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x0029:
            boolean r0 = p000.ce2.m56411q(r8)
            if (r0 == 0) goto L_0x003d
            d36 r1 = p000.me6.m64317a(r8)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r8 = m73183d(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x003d:
            d26 r0 = p000.d26.f37237a
            java.lang.Object r1 = p000.o17.m70122b(r0, r8, r9, r10)
            if (r1 == 0) goto L_0x0051
            boolean r11 = r10.mo66809d()
            java.lang.Object r9 = p000.o17.m70121a(r9, r1, r11)
            r13.invoke(r8, r9, r10)
            return r9
        L_0x0051:
            yz6 r1 = r8.mo51134H0()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r2 == 0) goto L_0x0077
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r1 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r1
            xc3 r8 = r1.mo55299i()
            if (r8 != 0) goto L_0x0069
            java.util.Collection r8 = r1.mo51811g()
            xc3 r8 = r11.mo66389f(r8)
        L_0x0069:
            xc3 r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m62967w(r8)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r8 = m73183d(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x0077:
            eg0 r1 = r1.mo51180d()
            if (r1 == 0) goto L_0x01c5
            boolean r2 = p000.nr1.m70034m(r1)
            if (r2 == 0) goto L_0x008f
            java.lang.String r10 = "error/NonExistentClass"
            java.lang.Object r9 = r9.mo52879e(r10)
            if0 r1 = (p000.if0) r1
            r11.mo66384a(r8, r1)
            return r9
        L_0x008f:
            boolean r2 = r1 instanceof p000.if0
            if (r2 == 0) goto L_0x00fe
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.C7389b.m60125c0(r8)
            if (r3 == 0) goto L_0x00fe
            java.util.List r0 = r8.mo51132F0()
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x00f6
            java.util.List r8 = r8.mo51132F0()
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            f17 r8 = (p000.f17) r8
            xc3 r2 = r8.getType()
            java.lang.String r0 = "memberProjection.type"
            p000.vx2.m53590f(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r8.mo51409c()
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r0 != r3) goto L_0x00c7
            java.lang.String r8 = "java/lang/Object"
            java.lang.Object r8 = r9.mo52879e(r8)
            goto L_0x00dc
        L_0x00c7:
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = r8.mo51409c()
            java.lang.String r0 = "memberProjection.projectionKind"
            p000.vx2.m53590f(r8, r0)
            x07 r4 = r10.mo66811f(r8, r1)
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = m73183d(r2, r3, r4, r5, r6, r7)
        L_0x00dc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = 91
            r10.append(r11)
            java.lang.String r8 = r9.mo52878d(r8)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.Object r8 = r9.mo52875a(r8)
            return r8
        L_0x00f6:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "arrays must have one type argument"
            r8.<init>(r9)
            throw r8
        L_0x00fe:
            if (r2 == 0) goto L_0x0172
            boolean r2 = p000.nu2.m70090b(r1)
            if (r2 == 0) goto L_0x0122
            boolean r2 = r10.mo66808c()
            if (r2 != 0) goto L_0x0122
            ad3 r0 = p000.hx1.m58723a(r0, r8)
            r2 = r0
            xc3 r2 = (p000.xc3) r2
            if (r2 == 0) goto L_0x0122
            x07 r4 = r10.mo66812g()
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = m73183d(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x0122:
            boolean r12 = r10.mo66810e()
            if (r12 == 0) goto L_0x0136
            r12 = r1
            if0 r12 = (p000.if0) r12
            boolean r12 = kotlin.reflect.jvm.internal.impl.builtins.C7389b.m60135k0(r12)
            if (r12 == 0) goto L_0x0136
            java.lang.Object r9 = r9.mo52880f()
            goto L_0x016e
        L_0x0136:
            if0 r1 = (p000.if0) r1
            if0 r12 = r1.mo50045a()
            java.lang.String r0 = "descriptor.original"
            p000.vx2.m53590f(r12, r0)
            java.lang.Object r12 = r11.mo66388e(r12)
            if (r12 != 0) goto L_0x016d
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r12 = r1.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
            if (r12 != r0) goto L_0x015b
            d31 r12 = r1.mo51119b()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            p000.vx2.m53589e(r12, r0)
            r1 = r12
            if0 r1 = (p000.if0) r1
        L_0x015b:
            if0 r12 = r1.mo50045a()
            java.lang.String r0 = "enumClassIfEnumEntry.original"
            p000.vx2.m53590f(r12, r0)
            java.lang.String r11 = m73180a(r12, r11)
            java.lang.Object r9 = r9.mo52879e(r11)
            goto L_0x016e
        L_0x016d:
            r9 = r12
        L_0x016e:
            r13.invoke(r8, r9, r10)
            return r9
        L_0x0172:
            boolean r0 = r1 instanceof p000.a17
            if (r0 == 0) goto L_0x0194
            a17 r1 = (p000.a17) r1
            xc3 r12 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m62953i(r1)
            boolean r8 = r8.mo51135I0()
            if (r8 == 0) goto L_0x0186
            xc3 r12 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m62964t(r12)
        L_0x0186:
            r0 = r12
            id2 r5 = kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.m62993b()
            r4 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.Object r8 = m73183d(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x0194:
            boolean r0 = r1 instanceof p000.hz6
            if (r0 == 0) goto L_0x01ae
            boolean r0 = r10.mo66807b()
            if (r0 == 0) goto L_0x01ae
            hz6 r1 = (p000.hz6) r1
            d36 r2 = r1.mo52331C()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = m73183d(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01dc }
            return r8
        L_0x01ae:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unknown type "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x01c5:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "no descriptor for type constructor of "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x01dc:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vc1.m73183d(xc3, k83, x07, v07, z73, id2):java.lang.Object");
    }

    /* renamed from: e */
    public static /* synthetic */ Object m73184e(xc3 xc3, k83 k83, x07 x07, v07 v07, z73 z73, id2<Object, Object, Object, r37> id2, int i, Object obj) {
        if ((i & 32) != 0) {
            id2 = FunctionsKt.m62993b();
        }
        return m73183d(xc3, k83, x07, v07, z73, id2);
    }
}
