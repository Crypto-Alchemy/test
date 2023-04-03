package p000;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* renamed from: am */
/* compiled from: AnnotationQualifiersFqNames.kt */
public final class C6830am {

    /* renamed from: a */
    public static final u82 f36497a = new u82("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    public static final u82 f36498b = new u82("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    public static final u82 f36499c = new u82("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    public static final u82 f36500d = new u82("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    public static final List<AnnotationQualifierApplicabilityType> f36501e;

    /* renamed from: f */
    public static final Map<u82, z03> f36502f;

    /* renamed from: g */
    public static final Map<u82, z03> f36503g;

    /* renamed from: h */
    public static final Set<u82> f36504h = ny5.m49098h(u73.m72626f(), u73.m72625e());

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> m = ck0.m33065m(AnnotationQualifierApplicabilityType.FIELD, AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, annotationQualifierApplicabilityType, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f36501e = m;
        u82 i = u73.m72629i();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<u82, z03> f = ao3.m31894f(wy6.m54142a(i, new z03(new ec4(nullabilityQualifier, false, 2, (DefaultConstructorMarker) null), m, false)));
        f36502f = f;
        f36503g = C6177b.m47366n(C6177b.m47364l(wy6.m54142a(new u82("javax.annotation.ParametersAreNullableByDefault"), new z03(new ec4(NullabilityQualifier.NULLABLE, false, 2, (DefaultConstructorMarker) null), bk0.m32598e(annotationQualifierApplicabilityType), false, 4, (DefaultConstructorMarker) null)), wy6.m54142a(new u82("javax.annotation.ParametersAreNonnullByDefault"), new z03(new ec4(nullabilityQualifier, false, 2, (DefaultConstructorMarker) null), bk0.m32598e(annotationQualifierApplicabilityType), false, 4, (DefaultConstructorMarker) null))), f);
    }

    /* renamed from: a */
    public static final Map<u82, z03> m55579a() {
        return f36503g;
    }

    /* renamed from: b */
    public static final Set<u82> m55580b() {
        return f36504h;
    }

    /* renamed from: c */
    public static final Map<u82, z03> m55581c() {
        return f36502f;
    }

    /* renamed from: d */
    public static final u82 m55582d() {
        return f36500d;
    }

    /* renamed from: e */
    public static final u82 m55583e() {
        return f36499c;
    }

    /* renamed from: f */
    public static final u82 m55584f() {
        return f36498b;
    }

    /* renamed from: g */
    public static final u82 m55585g() {
        return f36497a;
    }
}
