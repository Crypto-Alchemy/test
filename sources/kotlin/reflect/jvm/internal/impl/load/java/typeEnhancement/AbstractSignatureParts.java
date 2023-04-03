package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;

/* compiled from: AbstractSignatureParts.kt */
public abstract class AbstractSignatureParts<TAnnotation> {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a */
    /* compiled from: AbstractSignatureParts.kt */
    public static final class C7471a {

        /* renamed from: a */
        public final ad3 f39574a;

        /* renamed from: b */
        public final k23 f39575b;

        /* renamed from: c */
        public final c17 f39576c;

        public C7471a(ad3 ad3, k23 k23, c17 c17) {
            this.f39574a = ad3;
            this.f39575b = k23;
            this.f39576c = c17;
        }

        /* renamed from: a */
        public final k23 mo53710a() {
            return this.f39575b;
        }

        /* renamed from: b */
        public final ad3 mo53711b() {
            return this.f39574a;
        }

        /* renamed from: c */
        public final c17 mo53712c() {
            return this.f39576c;
        }
    }

    /* renamed from: A */
    public abstract boolean mo53682A(ad3 ad3);

    /* renamed from: B */
    public final ec4 mo53683B(ec4 ec4, ec4 ec42) {
        if (ec4 == null) {
            return ec42;
        }
        if (ec42 == null) {
            return ec4;
        }
        if (ec4.mo51442d() && !ec42.mo51442d()) {
            return ec42;
        }
        if (!ec4.mo51442d() && ec42.mo51442d()) {
            return ec4;
        }
        if (ec4.mo51441c().compareTo(ec42.mo51441c()) >= 0 && ec4.mo51441c().compareTo(ec42.mo51441c()) > 0) {
            return ec4;
        }
        return ec42;
    }

    /* renamed from: C */
    public final List<C7471a> mo53684C(ad3 ad3) {
        return mo53689f(new C7471a(ad3, mo53686c(ad3, mo53696m()), (c17) null), new AbstractSignatureParts$toIndexed$1$1(this, mo53705v()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r10 != false) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.rc2<java.lang.Integer, p000.j23> mo53685b(p000.ad3 r10, java.lang.Iterable<? extends p000.ad3> r11, p000.o07 r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r10, r0)
            java.lang.String r0 = "overrides"
            p000.vx2.m53591g(r11, r0)
            java.util.List r0 = r9.mo53684C(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.dk0.m43495u(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()
            ad3 r3 = (p000.ad3) r3
            java.util.List r3 = r9.mo53684C(r3)
            r1.add(r3)
            goto L_0x001d
        L_0x0031:
            boolean r2 = r9.mo53700q()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x006b
            boolean r2 = r9.mo53707x()
            if (r2 == 0) goto L_0x0069
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L_0x004e
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x004e
        L_0x004c:
            r10 = r3
            goto L_0x0066
        L_0x004e:
            java.util.Iterator r11 = r11.iterator()
        L_0x0052:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r11.next()
            ad3 r2 = (p000.ad3) r2
            boolean r2 = r9.mo53708y(r10, r2)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0052
            r10 = r4
        L_0x0066:
            if (r10 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r10 = r3
            goto L_0x006c
        L_0x006b:
            r10 = r4
        L_0x006c:
            if (r10 == 0) goto L_0x0070
            r10 = r4
            goto L_0x0074
        L_0x0070:
            int r10 = r0.size()
        L_0x0074:
            j23[] r11 = new p000.j23[r10]
            r2 = r3
        L_0x0077:
            if (r2 >= r10) goto L_0x00d1
            java.lang.Object r5 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.C7471a) r5
            j23 r5 = r9.mo53688e(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x008c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.CollectionsKt___CollectionsKt.m47332c0(r8, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.C7471a) r8
            if (r8 == 0) goto L_0x00ab
            ad3 r8 = r8.mo53711b()
            if (r8 == 0) goto L_0x00ab
            j23 r8 = r9.mo53687d(r8)
            goto L_0x00ac
        L_0x00ab:
            r8 = 0
        L_0x00ac:
            if (r8 == 0) goto L_0x008c
            r6.add(r8)
            goto L_0x008c
        L_0x00b2:
            if (r2 != 0) goto L_0x00bc
            boolean r7 = r9.mo53707x()
            if (r7 == 0) goto L_0x00bc
            r7 = r4
            goto L_0x00bd
        L_0x00bc:
            r7 = r3
        L_0x00bd:
            if (r2 != 0) goto L_0x00c7
            boolean r8 = r9.mo53697n()
            if (r8 == 0) goto L_0x00c7
            r8 = r4
            goto L_0x00c8
        L_0x00c7:
            r8 = r3
        L_0x00c8:
            j23 r5 = p000.q07.m71152a(r5, r6, r7, r8, r13)
            r11[r2] = r5
            int r2 = r2 + 1
            goto L_0x0077
        L_0x00d1:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$computeIndexedQualifiers$1 r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$computeIndexedQualifiers$1
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.mo53685b(ad3, java.lang.Iterable, o07, boolean):rc2");
    }

    /* renamed from: c */
    public final k23 mo53686c(ad3 ad3, k23 k23) {
        return mo53691h().mo53410c(k23, mo53692i(ad3));
    }

    /* renamed from: d */
    public final j23 mo53687d(ad3 ad3) {
        NullabilityQualifier nullabilityQualifier;
        boolean z;
        NullabilityQualifier t = mo53703t(ad3);
        MutabilityQualifier mutabilityQualifier = null;
        if (t == null) {
            ad3 p = mo53699p(ad3);
            if (p != null) {
                nullabilityQualifier = mo53703t(p);
            } else {
                nullabilityQualifier = null;
            }
        } else {
            nullabilityQualifier = t;
        }
        s17 v = mo53705v();
        c23 c23 = c23.f37039a;
        if (c23.mo50791l(mo53702s(v.mo51078f0(ad3)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (c23.mo50790k(mo53702s(v.mo51049E(ad3)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        boolean z2 = false;
        if (mo53705v().mo51108v(ad3) || mo53682A(ad3)) {
            z = true;
        } else {
            z = false;
        }
        if (nullabilityQualifier != t) {
            z2 = true;
        }
        return new j23(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012a, code lost:
        if (r0 != false) goto L_0x012f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0154  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.j23 mo53688e(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.C7471a r12) {
        /*
            r11 = this;
            ad3 r0 = r12.mo53711b()
            r1 = 0
            if (r0 != 0) goto L_0x0022
            s17 r0 = r11.mo53705v()
            c17 r2 = r12.mo53712c()
            if (r2 == 0) goto L_0x0016
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r0 = r0.mo51098q(r2)
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r2 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.IN
            if (r0 != r2) goto L_0x0022
            j23$a r12 = p000.j23.f38572e
            j23 r12 = r12.mo52604a()
            return r12
        L_0x0022:
            c17 r0 = r12.mo53712c()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x002c
            r0 = r2
            goto L_0x002d
        L_0x002c:
            r0 = r3
        L_0x002d:
            ad3 r4 = r12.mo53711b()
            if (r4 == 0) goto L_0x0039
            java.lang.Iterable r4 = r11.mo53692i(r4)
            if (r4 != 0) goto L_0x003d
        L_0x0039:
            java.util.List r4 = p000.ck0.m33062j()
        L_0x003d:
            s17 r5 = r11.mo53705v()
            ad3 r6 = r12.mo53711b()
            if (r6 == 0) goto L_0x0052
            zz6 r6 = r5.mo51107u0(r6)
            if (r6 == 0) goto L_0x0052
            c17 r5 = r5.mo51114y(r6)
            goto L_0x0053
        L_0x0052:
            r5 = r1
        L_0x0053:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r6 = r11.mo53695l()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r7 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS
            if (r6 != r7) goto L_0x005d
            r6 = r2
            goto L_0x005e
        L_0x005d:
            r6 = r3
        L_0x005e:
            if (r0 != 0) goto L_0x0061
            goto L_0x00ad
        L_0x0061:
            if (r6 != 0) goto L_0x00a5
            boolean r7 = r11.mo53698o()
            if (r7 == 0) goto L_0x00a5
            ad3 r7 = r12.mo53711b()
            if (r7 == 0) goto L_0x0077
            boolean r7 = r11.mo53706w(r7)
            if (r7 != r2) goto L_0x0077
            r7 = r2
            goto L_0x0078
        L_0x0077:
            r7 = r3
        L_0x0078:
            if (r7 == 0) goto L_0x00a5
            java.lang.Iterable r7 = r11.mo53694k()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0087:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00a0
            java.lang.Object r9 = r7.next()
            kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver r10 = r11.mo53691h()
            boolean r10 = r10.mo53417m(r9)
            r10 = r10 ^ r2
            if (r10 == 0) goto L_0x0087
            r8.add(r9)
            goto L_0x0087
        L_0x00a0:
            java.util.List r4 = kotlin.collections.CollectionsKt___CollectionsKt.m47350u0(r8, r4)
            goto L_0x00ad
        L_0x00a5:
            java.lang.Iterable r7 = r11.mo53694k()
            java.util.List r4 = kotlin.collections.CollectionsKt___CollectionsKt.m47348s0(r7, r4)
        L_0x00ad:
            kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver r7 = r11.mo53691h()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r7 = r7.mo53412e(r4)
            kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver r8 = r11.mo53691h()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1 r9 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1
            r9.<init>(r11)
            ec4 r4 = r8.mo53413f(r4, r9)
            if (r4 == 0) goto L_0x00de
            j23 r12 = new j23
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = r4.mo51441c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r4.mo51441c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            if (r1 != r6) goto L_0x00d5
            if (r5 == 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00d5:
            r2 = r3
        L_0x00d6:
            boolean r1 = r4.mo51442d()
            r12.<init>(r0, r7, r2, r1)
            return r12
        L_0x00de:
            if (r0 != 0) goto L_0x00e6
            if (r6 == 0) goto L_0x00e3
            goto L_0x00e6
        L_0x00e3:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE
            goto L_0x00ea
        L_0x00e6:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = r11.mo53695l()
        L_0x00ea:
            k23 r4 = r12.mo53710a()
            if (r4 == 0) goto L_0x00f5
            z03 r0 = r4.mo52850a(r0)
            goto L_0x00f6
        L_0x00f5:
            r0 = r1
        L_0x00f6:
            if (r5 == 0) goto L_0x00fd
            ec4 r4 = r11.mo53693j(r5)
            goto L_0x00fe
        L_0x00fd:
            r4 = r1
        L_0x00fe:
            r6 = 2
            if (r4 == 0) goto L_0x0109
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            ec4 r8 = p000.ec4.m57269b(r4, r8, r3, r6, r1)
            if (r8 != 0) goto L_0x0111
        L_0x0109:
            if (r0 == 0) goto L_0x0110
            ec4 r8 = r0.mo67202d()
            goto L_0x0111
        L_0x0110:
            r8 = r1
        L_0x0111:
            if (r4 == 0) goto L_0x0118
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r4.mo51441c()
            goto L_0x0119
        L_0x0118:
            r4 = r1
        L_0x0119:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            if (r4 == r9) goto L_0x012f
            if (r5 == 0) goto L_0x012d
            if (r0 == 0) goto L_0x0129
            boolean r0 = r0.mo67201c()
            if (r0 != r2) goto L_0x0129
            r0 = r2
            goto L_0x012a
        L_0x0129:
            r0 = r3
        L_0x012a:
            if (r0 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r0 = r3
            goto L_0x0130
        L_0x012f:
            r0 = r2
        L_0x0130:
            c17 r12 = r12.mo53712c()
            if (r12 == 0) goto L_0x014b
            ec4 r12 = r11.mo53693j(r12)
            if (r12 == 0) goto L_0x014b
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r12.mo51441c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            if (r4 != r5) goto L_0x014c
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            ec4 r12 = p000.ec4.m57269b(r12, r4, r3, r6, r1)
            goto L_0x014c
        L_0x014b:
            r12 = r1
        L_0x014c:
            ec4 r12 = r11.mo53683B(r12, r8)
            j23 r4 = new j23
            if (r12 == 0) goto L_0x0158
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r12.mo51441c()
        L_0x0158:
            if (r12 == 0) goto L_0x0161
            boolean r12 = r12.mo51442d()
            if (r12 != r2) goto L_0x0161
            goto L_0x0162
        L_0x0161:
            r2 = r3
        L_0x0162:
            r4.<init>(r1, r7, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.mo53688e(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a):j23");
    }

    /* renamed from: f */
    public final <T> List<T> mo53689f(T t, rc2<? super T, ? extends Iterable<? extends T>> rc2) {
        ArrayList arrayList = new ArrayList(1);
        mo53690g(t, arrayList, rc2);
        return arrayList;
    }

    /* renamed from: g */
    public final <T> void mo53690g(T t, List<T> list, rc2<? super T, ? extends Iterable<? extends T>> rc2) {
        list.add(t);
        Iterable<Object> iterable = (Iterable) rc2.invoke(t);
        if (iterable != null) {
            for (Object g : iterable) {
                mo53690g(g, list, rc2);
            }
        }
    }

    /* renamed from: h */
    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> mo53691h();

    /* renamed from: i */
    public abstract Iterable<TAnnotation> mo53692i(ad3 ad3);

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00b3 A[EDGE_INSN: B:85:0x00b3->B:55:0x00b3 ?: BREAK  , SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.ec4 mo53693j(p000.c17 r8) {
        /*
            r7 = this;
            s17 r0 = r7.mo53705v()
            boolean r1 = r7.mo53709z(r8)
            r2 = 0
            if (r1 != 0) goto L_0x000c
            return r2
        L_0x000c:
            java.util.List r8 = r0.mo51084j(r8)
            boolean r1 = r8 instanceof java.util.Collection
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001e
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x001e
        L_0x001c:
            r5 = r4
            goto L_0x0035
        L_0x001e:
            java.util.Iterator r5 = r8.iterator()
        L_0x0022:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x001c
            java.lang.Object r6 = r5.next()
            ad3 r6 = (p000.ad3) r6
            boolean r6 = r0.mo51068V(r6)
            if (r6 != 0) goto L_0x0022
            r5 = r3
        L_0x0035:
            if (r5 == 0) goto L_0x0038
            return r2
        L_0x0038:
            if (r1 == 0) goto L_0x0042
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x0042
        L_0x0040:
            r5 = r3
            goto L_0x005e
        L_0x0042:
            java.util.Iterator r5 = r8.iterator()
        L_0x0046:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0040
            java.lang.Object r6 = r5.next()
            ad3 r6 = (p000.ad3) r6
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = r7.mo53703t(r6)
            if (r6 == 0) goto L_0x005a
            r6 = r4
            goto L_0x005b
        L_0x005a:
            r6 = r3
        L_0x005b:
            if (r6 == 0) goto L_0x0046
            r5 = r4
        L_0x005e:
            if (r5 == 0) goto L_0x0062
            r1 = r8
            goto L_0x00a9
        L_0x0062:
            if (r1 == 0) goto L_0x006c
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x006c
        L_0x006a:
            r1 = r3
            goto L_0x0088
        L_0x006c:
            java.util.Iterator r1 = r8.iterator()
        L_0x0070:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x006a
            java.lang.Object r5 = r1.next()
            ad3 r5 = (p000.ad3) r5
            ad3 r5 = r7.mo53699p(r5)
            if (r5 == 0) goto L_0x0084
            r5 = r4
            goto L_0x0085
        L_0x0084:
            r5 = r3
        L_0x0085:
            if (r5 == 0) goto L_0x0070
            r1 = r4
        L_0x0088:
            if (r1 == 0) goto L_0x00db
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r8.iterator()
        L_0x0093:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00a9
            java.lang.Object r5 = r2.next()
            ad3 r5 = (p000.ad3) r5
            ad3 r5 = r7.mo53699p(r5)
            if (r5 == 0) goto L_0x0093
            r1.add(r5)
            goto L_0x0093
        L_0x00a9:
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x00b5
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00b5
        L_0x00b3:
            r0 = r4
            goto L_0x00cc
        L_0x00b5:
            java.util.Iterator r2 = r1.iterator()
        L_0x00b9:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = r2.next()
            ad3 r5 = (p000.ad3) r5
            boolean r5 = r0.mo51066T(r5)
            if (r5 != 0) goto L_0x00b9
            r0 = r3
        L_0x00cc:
            if (r0 == 0) goto L_0x00d1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L_0x00d3
        L_0x00d1:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
        L_0x00d3:
            ec4 r2 = new ec4
            if (r1 == r8) goto L_0x00d8
            r3 = r4
        L_0x00d8:
            r2.<init>(r0, r3)
        L_0x00db:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.mo53693j(c17):ec4");
    }

    /* renamed from: k */
    public abstract Iterable<TAnnotation> mo53694k();

    /* renamed from: l */
    public abstract AnnotationQualifierApplicabilityType mo53695l();

    /* renamed from: m */
    public abstract k23 mo53696m();

    /* renamed from: n */
    public abstract boolean mo53697n();

    /* renamed from: o */
    public abstract boolean mo53698o();

    /* renamed from: p */
    public abstract ad3 mo53699p(ad3 ad3);

    /* renamed from: q */
    public boolean mo53700q() {
        return false;
    }

    /* renamed from: r */
    public abstract boolean mo53701r(TAnnotation tannotation);

    /* renamed from: s */
    public abstract v82 mo53702s(ad3 ad3);

    /* renamed from: t */
    public final NullabilityQualifier mo53703t(ad3 ad3) {
        s17 v = mo53705v();
        if (v.mo51060N(v.mo51078f0(ad3))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (!v.mo51060N(v.mo51049E(ad3))) {
            return NullabilityQualifier.NOT_NULL;
        }
        return null;
    }

    /* renamed from: u */
    public abstract boolean mo53704u();

    /* renamed from: v */
    public abstract s17 mo53705v();

    /* renamed from: w */
    public abstract boolean mo53706w(ad3 ad3);

    /* renamed from: x */
    public abstract boolean mo53707x();

    /* renamed from: y */
    public abstract boolean mo53708y(ad3 ad3, ad3 ad32);

    /* renamed from: z */
    public abstract boolean mo53709z(c17 c17);
}
