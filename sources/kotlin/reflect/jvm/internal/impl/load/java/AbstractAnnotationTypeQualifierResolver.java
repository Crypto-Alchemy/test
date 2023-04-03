package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {

    /* renamed from: c */
    public static final C7440a f39388c = new C7440a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: d */
    public static final Map<String, AnnotationQualifierApplicabilityType> f39389d;

    /* renamed from: a */
    public final JavaTypeEnhancementState f39390a;

    /* renamed from: b */
    public final ConcurrentHashMap<Object, TAnnotation> f39391b = new ConcurrentHashMap<>();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver$a */
    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    public static final class C7440a {
        public C7440a() {
        }

        public /* synthetic */ C7440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f39389d = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(JavaTypeEnhancementState javaTypeEnhancementState) {
        vx2.m53591g(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f39390a = javaTypeEnhancementState;
    }

    /* renamed from: a */
    public final Set<AnnotationQualifierApplicabilityType> mo53409a(Set<? extends AnnotationQualifierApplicabilityType> set) {
        if (set.contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
            return oy5.m49611k(oy5.m49610j(ArraysKt___ArraysKt.m47250D0(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), set);
        }
        return set;
    }

    /* renamed from: b */
    public abstract Iterable<String> mo50644b(TAnnotation tannotation, boolean z);

    /* renamed from: c */
    public final k23 mo53410c(k23 k23, Iterable<? extends TAnnotation> iterable) {
        EnumMap enumMap;
        EnumMap<AnnotationQualifierApplicabilityType, z03> b;
        vx2.m53591g(iterable, "annotations");
        if (this.f39390a.mo53439b()) {
            return k23;
        }
        ArrayList<z03> arrayList = new ArrayList<>();
        for (Object d : iterable) {
            z03 d2 = mo53411d(d);
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        if (arrayList.isEmpty()) {
            return k23;
        }
        if (k23 == null || (b = k23.mo52851b()) == null) {
            enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
        } else {
            enumMap = new EnumMap(b);
        }
        boolean z = false;
        for (z03 z03 : arrayList) {
            for (AnnotationQualifierApplicabilityType put : z03.mo67203e()) {
                enumMap.put(put, z03);
                z = true;
            }
        }
        if (!z) {
            return k23;
        }
        return new k23(enumMap);
    }

    /* renamed from: d */
    public final z03 mo53411d(TAnnotation tannotation) {
        ec4 g;
        z03 r = mo53422r(tannotation);
        if (r != null) {
            return r;
        }
        Pair t = mo53424t(tannotation);
        if (t == null) {
            return null;
        }
        Object component1 = t.component1();
        Set set = (Set) t.component2();
        ReportLevel q = mo53421q(tannotation);
        if (q == null) {
            q = mo53420p(component1);
        }
        if (!q.isIgnore() && (g = mo53414g(component1, C7441xba7ba3d0.INSTANCE)) != null) {
            return new z03(ec4.m57269b(g, (NullabilityQualifier) null, q.isWarning(), 1, (Object) null), set, false, 4, (DefaultConstructorMarker) null);
        }
        return null;
    }

    /* renamed from: e */
    public final MutabilityQualifier mo53412e(Iterable<? extends TAnnotation> iterable) {
        MutabilityQualifier mutabilityQualifier;
        vx2.m53591g(iterable, "annotations");
        MutabilityQualifier mutabilityQualifier2 = null;
        for (Object i : iterable) {
            u82 i2 = mo50645i(i);
            if (u73.m72633m().contains(i2)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (u73.m72630j().contains(i2)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    /* renamed from: f */
    public final ec4 mo53413f(Iterable<? extends TAnnotation> iterable, rc2<? super TAnnotation, Boolean> rc2) {
        vx2.m53591g(iterable, "annotations");
        vx2.m53591g(rc2, "forceWarning");
        ec4 ec4 = null;
        for (Object g : iterable) {
            ec4 g2 = mo53414g(g, rc2);
            if (ec4 != null) {
                if (g2 != null && !vx2.m53586b(g2, ec4)) {
                    if (!g2.mo51442d() || ec4.mo51442d()) {
                        if (g2.mo51442d() || !ec4.mo51442d()) {
                            return null;
                        }
                    }
                }
            }
            ec4 = g2;
        }
        return ec4;
    }

    /* renamed from: g */
    public final ec4 mo53414g(TAnnotation tannotation, rc2<? super TAnnotation, Boolean> rc2) {
        ec4 n;
        ec4 n2 = mo53418n(tannotation, rc2.invoke(tannotation).booleanValue());
        if (n2 != null) {
            return n2;
        }
        Object s = mo53423s(tannotation);
        if (s == null) {
            return null;
        }
        ReportLevel p = mo53420p(tannotation);
        if (!p.isIgnore() && (n = mo53418n(s, rc2.invoke(s).booleanValue())) != null) {
            return ec4.m57269b(n, (NullabilityQualifier) null, p.isWarning(), 1, (Object) null);
        }
        return null;
    }

    /* renamed from: h */
    public final TAnnotation mo53415h(TAnnotation tannotation, u82 u82) {
        for (TAnnotation next : mo50647k(tannotation)) {
            if (vx2.m53586b(mo50645i(next), u82)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public abstract u82 mo50645i(TAnnotation tannotation);

    /* renamed from: j */
    public abstract Object mo50646j(TAnnotation tannotation);

    /* renamed from: k */
    public abstract Iterable<TAnnotation> mo50647k(TAnnotation tannotation);

    /* renamed from: l */
    public final boolean mo53416l(TAnnotation tannotation, u82 u82) {
        Iterable<Object> k = mo50647k(tannotation);
        if ((k instanceof Collection) && ((Collection) k).isEmpty()) {
            return false;
        }
        for (Object i : k) {
            if (vx2.m53586b(mo50645i(i), u82)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo53417m(TAnnotation tannotation) {
        vx2.m53591g(tannotation, "annotation");
        Object h = mo53415h(tannotation, C7395c.C7396a.f39134H);
        if (h == null) {
            return false;
        }
        Iterable<String> b = mo50644b(h, false);
        if ((b instanceof Collection) && ((Collection) b).isEmpty()) {
            return false;
        }
        for (String b2 : b) {
            if (vx2.m53586b(b2, KotlinTarget.TYPE.name())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (r6.equals("ALWAYS") != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r6.equals("NEVER") == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (r6.equals("MAYBE") == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        return null;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.ec4 mo53418n(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            u82 r0 = r5.mo50645i(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r2 = r5.f39390a
            rc2 r2 = r2.mo53440c()
            java.lang.Object r2 = r2.invoke(r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r2
            boolean r3 = r2.isIgnore()
            if (r3 == 0) goto L_0x001b
            return r1
        L_0x001b:
            java.util.List r3 = p000.u73.m72632l()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L_0x002a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L_0x00d3
        L_0x002a:
            java.util.List r3 = p000.u73.m72631k()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x0038
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            goto L_0x00d3
        L_0x0038:
            u82 r3 = p000.u73.m72627g()
            boolean r3 = p000.vx2.m53586b(r0, r3)
            if (r3 == 0) goto L_0x0046
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L_0x00d3
        L_0x0046:
            u82 r3 = p000.u73.m72628h()
            boolean r3 = p000.vx2.m53586b(r0, r3)
            if (r3 == 0) goto L_0x0054
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            goto L_0x00d3
        L_0x0054:
            u82 r3 = p000.u73.m72626f()
            boolean r3 = p000.vx2.m53586b(r0, r3)
            if (r3 == 0) goto L_0x00a0
            java.lang.Iterable r6 = r5.mo50644b(r6, r4)
            java.lang.Object r6 = kotlin.collections.CollectionsKt___CollectionsKt.m47330a0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x009d
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L_0x0090;
                case 74175084: goto L_0x0087;
                case 433141802: goto L_0x007b;
                case 1933739535: goto L_0x0072;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x009c
        L_0x0072:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x009c
            goto L_0x009d
        L_0x007b:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0084
            goto L_0x009c
        L_0x0084:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            goto L_0x00d3
        L_0x0087:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0099
            goto L_0x009c
        L_0x0090:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0099
            goto L_0x009c
        L_0x0099:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L_0x00d3
        L_0x009c:
            return r1
        L_0x009d:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            goto L_0x00d3
        L_0x00a0:
            u82 r6 = p000.u73.m72624d()
            boolean r6 = p000.vx2.m53586b(r0, r6)
            if (r6 == 0) goto L_0x00ad
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L_0x00d3
        L_0x00ad:
            u82 r6 = p000.u73.m72623c()
            boolean r6 = p000.vx2.m53586b(r0, r6)
            if (r6 == 0) goto L_0x00ba
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            goto L_0x00d3
        L_0x00ba:
            u82 r6 = p000.u73.m72621a()
            boolean r6 = p000.vx2.m53586b(r0, r6)
            if (r6 == 0) goto L_0x00c7
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            goto L_0x00d3
        L_0x00c7:
            u82 r6 = p000.u73.m72622b()
            boolean r6 = p000.vx2.m53586b(r0, r6)
            if (r6 == 0) goto L_0x00e2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
        L_0x00d3:
            ec4 r0 = new ec4
            boolean r1 = r2.isWarning()
            if (r1 != 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00de
        L_0x00dd:
            r4 = 1
        L_0x00de:
            r0.<init>(r6, r4)
            return r0
        L_0x00e2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.mo53418n(java.lang.Object, boolean):ec4");
    }

    /* renamed from: o */
    public final ReportLevel mo53419o(TAnnotation tannotation) {
        u82 i = mo50645i(tannotation);
        if (i == null || !C6830am.m55581c().containsKey(i)) {
            return mo53420p(tannotation);
        }
        return this.f39390a.mo53440c().invoke(i);
    }

    /* renamed from: p */
    public final ReportLevel mo53420p(TAnnotation tannotation) {
        ReportLevel q = mo53421q(tannotation);
        if (q != null) {
            return q;
        }
        return this.f39390a.mo53441d().mo53445a();
    }

    /* renamed from: q */
    public final ReportLevel mo53421q(TAnnotation tannotation) {
        Iterable b;
        String str;
        ReportLevel reportLevel = this.f39390a.mo53441d().mo53447c().get(mo50645i(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        Object h = mo53415h(tannotation, C6830am.m55582d());
        if (h == null || (b = mo50644b(h, false)) == null || (str = (String) CollectionsKt___CollectionsKt.m47330a0(b)) == null) {
            return null;
        }
        ReportLevel b2 = this.f39390a.mo53441d().mo53446b();
        if (b2 != null) {
            return b2;
        }
        int hashCode = str.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && str.equals("WARN")) {
                    return ReportLevel.WARN;
                }
                return null;
            } else if (!str.equals("STRICT")) {
                return null;
            } else {
                return ReportLevel.STRICT;
            }
        } else if (!str.equals("IGNORE")) {
            return null;
        } else {
            return ReportLevel.IGNORE;
        }
    }

    /* renamed from: r */
    public final z03 mo53422r(TAnnotation tannotation) {
        z03 z03;
        boolean z;
        if (this.f39390a.mo53439b() || (z03 = C6830am.m55579a().get(mo50645i(tannotation))) == null) {
            return null;
        }
        ReportLevel o = mo53419o(tannotation);
        if (o != ReportLevel.IGNORE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            o = null;
        }
        if (o == null) {
            return null;
        }
        return z03.m74718b(z03, ec4.m57269b(z03.mo67202d(), (NullabilityQualifier) null, o.isWarning(), 1, (Object) null), (Collection) null, false, 6, (Object) null);
    }

    /* renamed from: s */
    public final TAnnotation mo53423s(TAnnotation tannotation) {
        TAnnotation tannotation2;
        vx2.m53591g(tannotation, "annotation");
        if (this.f39390a.mo53441d().mo53448d()) {
            return null;
        }
        if (CollectionsKt___CollectionsKt.m47320R(C6830am.m55580b(), mo50645i(tannotation)) || mo53416l(tannotation, C6830am.m55584f())) {
            return tannotation;
        }
        if (!mo53416l(tannotation, C6830am.m55585g())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f39391b;
        Object j = mo50646j(tannotation);
        TAnnotation tannotation3 = concurrentHashMap.get(j);
        if (tannotation3 != null) {
            return tannotation3;
        }
        Iterator it = mo50647k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = mo53423s(it.next());
            if (tannotation2 != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(j, tannotation2);
        if (putIfAbsent == null) {
            return tannotation2;
        }
        return putIfAbsent;
    }

    /* renamed from: t */
    public final Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> mo53424t(TAnnotation tannotation) {
        Object h;
        Object obj;
        boolean z;
        if (this.f39390a.mo53441d().mo53448d() || (h = mo53415h(tannotation, C6830am.m55583e())) == null) {
            return null;
        }
        Iterator it = mo50647k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (mo53423s(obj) != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        Iterable<String> b = mo50644b(h, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : b) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = f39389d.get(str);
            if (annotationQualifierApplicabilityType != null) {
                linkedHashSet.add(annotationQualifierApplicabilityType);
            }
        }
        return new Pair<>(obj, mo53409a(linkedHashSet));
    }
}
