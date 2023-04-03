package p000;

import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* renamed from: z03 */
/* compiled from: AnnotationQualifiersFqNames.kt */
public final class z03 {

    /* renamed from: a */
    public final ec4 f46313a;

    /* renamed from: b */
    public final Collection<AnnotationQualifierApplicabilityType> f46314b;

    /* renamed from: c */
    public final boolean f46315c;

    public z03(ec4 ec4, Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z) {
        vx2.m53591g(ec4, "nullabilityQualifier");
        vx2.m53591g(collection, "qualifierApplicabilityTypes");
        this.f46313a = ec4;
        this.f46314b = collection;
        this.f46315c = z;
    }

    /* renamed from: b */
    public static /* synthetic */ z03 m74718b(z03 z03, ec4 ec4, Collection<AnnotationQualifierApplicabilityType> collection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ec4 = z03.f46313a;
        }
        if ((i & 2) != 0) {
            collection = z03.f46314b;
        }
        if ((i & 4) != 0) {
            z = z03.f46315c;
        }
        return z03.mo67200a(ec4, collection, z);
    }

    /* renamed from: a */
    public final z03 mo67200a(ec4 ec4, Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z) {
        vx2.m53591g(ec4, "nullabilityQualifier");
        vx2.m53591g(collection, "qualifierApplicabilityTypes");
        return new z03(ec4, collection, z);
    }

    /* renamed from: c */
    public final boolean mo67201c() {
        return this.f46315c;
    }

    /* renamed from: d */
    public final ec4 mo67202d() {
        return this.f46313a;
    }

    /* renamed from: e */
    public final Collection<AnnotationQualifierApplicabilityType> mo67203e() {
        return this.f46314b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z03)) {
            return false;
        }
        z03 z03 = (z03) obj;
        return vx2.m53586b(this.f46313a, z03.f46313a) && vx2.m53586b(this.f46314b, z03.f46314b) && this.f46315c == z03.f46315c;
    }

    public int hashCode() {
        int hashCode = ((this.f46313a.hashCode() * 31) + this.f46314b.hashCode()) * 31;
        boolean z = this.f46315c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f46313a + ", qualifierApplicabilityTypes=" + this.f46314b + ", definitelyNotNull=" + this.f46315c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z03(ec4 ec4, Collection collection, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ec4, collection, (i & 4) != 0 ? ec4.mo51441c() == NullabilityQualifier.NOT_NULL : z);
    }
}
