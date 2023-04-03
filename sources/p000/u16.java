package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;

/* renamed from: u16 */
/* compiled from: signatureEnhancement.kt */
public final class u16 extends AbstractSignatureParts<C9460vl> {

    /* renamed from: a */
    public final C7903ml f44850a;

    /* renamed from: b */
    public final boolean f44851b;

    /* renamed from: c */
    public final pf3 f44852c;

    /* renamed from: d */
    public final AnnotationQualifierApplicabilityType f44853d;

    /* renamed from: e */
    public final boolean f44854e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u16(C7903ml mlVar, boolean z, pf3 pf3, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mlVar, z, pf3, annotationQualifierApplicabilityType, (i & 16) != 0 ? false : z2);
    }

    /* renamed from: A */
    public boolean mo53682A(ad3 ad3) {
        vx2.m53591g(ad3, "<this>");
        return ((xc3) ad3).mo64506K0() instanceof t84;
    }

    /* renamed from: D */
    public C6868bm mo53691h() {
        return this.f44852c.mo65296a().mo66998a();
    }

    /* renamed from: E */
    public xc3 mo53699p(ad3 ad3) {
        vx2.m53591g(ad3, "<this>");
        return c27.m56293a((xc3) ad3);
    }

    /* renamed from: F */
    public boolean mo53701r(C9460vl vlVar) {
        vx2.m53591g(vlVar, "<this>");
        if ((!(vlVar instanceof ot4) || !((ot4) vlVar).mo53479j()) && (!(vlVar instanceof LazyJavaAnnotationDescriptor) || mo53698o() || (!((LazyJavaAnnotationDescriptor) vlVar).mo53508k() && mo53695l() != AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS))) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public u17 mo53705v() {
        return d26.f37237a;
    }

    /* renamed from: i */
    public Iterable<C9460vl> mo53692i(ad3 ad3) {
        vx2.m53591g(ad3, "<this>");
        return ((xc3) ad3).getAnnotations();
    }

    /* renamed from: k */
    public Iterable<C9460vl> mo53694k() {
        C6983dm annotations;
        C7903ml mlVar = this.f44850a;
        if (mlVar == null || (annotations = mlVar.getAnnotations()) == null) {
            return ck0.m33062j();
        }
        return annotations;
    }

    /* renamed from: l */
    public AnnotationQualifierApplicabilityType mo53695l() {
        return this.f44853d;
    }

    /* renamed from: m */
    public k23 mo53696m() {
        return this.f44852c.mo65297b();
    }

    /* renamed from: n */
    public boolean mo53697n() {
        C7903ml mlVar = this.f44850a;
        if (!(mlVar instanceof n87) || ((n87) mlVar).mo53317q0() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public boolean mo53698o() {
        return this.f44852c.mo65296a().mo67014q().mo67210c();
    }

    /* renamed from: s */
    public v82 mo53702s(ad3 ad3) {
        vx2.m53591g(ad3, "<this>");
        if0 f = x17.m73822f((xc3) ad3);
        if (f != null) {
            return dd1.m56821m(f);
        }
        return null;
    }

    /* renamed from: u */
    public boolean mo53704u() {
        return this.f44854e;
    }

    /* renamed from: w */
    public boolean mo53706w(ad3 ad3) {
        vx2.m53591g(ad3, "<this>");
        return C7389b.m60129e0((xc3) ad3);
    }

    /* renamed from: x */
    public boolean mo53707x() {
        return this.f44851b;
    }

    /* renamed from: y */
    public boolean mo53708y(ad3 ad3, ad3 ad32) {
        vx2.m53591g(ad3, "<this>");
        vx2.m53591g(ad32, "other");
        return this.f44852c.mo65296a().mo67008k().mo55822b((xc3) ad3, (xc3) ad32);
    }

    /* renamed from: z */
    public boolean mo53709z(c17 c17) {
        vx2.m53591g(c17, "<this>");
        return c17 instanceof rf3;
    }

    public u16(C7903ml mlVar, boolean z, pf3 pf3, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
        vx2.m53591g(pf3, "containerContext");
        vx2.m53591g(annotationQualifierApplicabilityType, "containerApplicabilityType");
        this.f44850a = mlVar;
        this.f44851b = z;
        this.f44852c = pf3;
        this.f44853d = annotationQualifierApplicabilityType;
        this.f44854e = z2;
    }
}
