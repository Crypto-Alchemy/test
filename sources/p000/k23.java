package p000;

import java.util.EnumMap;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;

/* renamed from: k23 */
/* compiled from: JavaTypeQualifiersByElementType.kt */
public final class k23 {

    /* renamed from: a */
    public final EnumMap<AnnotationQualifierApplicabilityType, z03> f38843a;

    public k23(EnumMap<AnnotationQualifierApplicabilityType, z03> enumMap) {
        vx2.m53591g(enumMap, "defaultQualifiers");
        this.f38843a = enumMap;
    }

    /* renamed from: a */
    public final z03 mo52850a(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.f38843a.get(annotationQualifierApplicabilityType);
    }

    /* renamed from: b */
    public final EnumMap<AnnotationQualifierApplicabilityType, z03> mo52851b() {
        return this.f38843a;
    }
}
