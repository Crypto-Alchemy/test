package p000;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* renamed from: kk0 */
/* compiled from: CollectorBase */
public class kk0 {

    /* renamed from: b */
    public static final C3742zl[] f14134b = new C3742zl[0];

    /* renamed from: c */
    public static final Annotation[] f14135c = new Annotation[0];

    /* renamed from: a */
    public final AnnotationIntrospector f14136a;

    public kk0(AnnotationIntrospector annotationIntrospector) {
        this.f14136a = annotationIntrospector;
    }

    /* renamed from: a */
    public static C3742zl m20793a() {
        return new C3742zl();
    }

    /* renamed from: b */
    public static C3742zl[] m20794b(int i) {
        if (i == 0) {
            return f14134b;
        }
        C3742zl[] zlVarArr = new C3742zl[i];
        for (int i2 = 0; i2 < i; i2++) {
            zlVarArr[i2] = m20793a();
        }
        return zlVarArr;
    }

    /* renamed from: c */
    public static final boolean m20795c(Annotation annotation) {
        if ((annotation instanceof Target) || (annotation instanceof Retention)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final AnnotationCollector mo22337d(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.mo15947a(annotation);
            if (this.f14136a.isAnnotationBundle(annotation)) {
                annotationCollector = mo22341h(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }

    /* renamed from: e */
    public final AnnotationCollector mo22338e(Annotation[] annotationArr) {
        AnnotationCollector e = AnnotationCollector.m14134e();
        for (Annotation annotation : annotationArr) {
            e = e.mo15947a(annotation);
            if (this.f14136a.isAnnotationBundle(annotation)) {
                e = mo22341h(e, annotation);
            }
        }
        return e;
    }

    /* renamed from: f */
    public final AnnotationCollector mo22339f(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!annotationCollector.mo15950f(annotation)) {
                annotationCollector = annotationCollector.mo15947a(annotation);
                if (this.f14136a.isAnnotationBundle(annotation)) {
                    annotationCollector = mo22340g(annotationCollector, annotation);
                }
            }
        }
        return annotationCollector;
    }

    /* renamed from: g */
    public final AnnotationCollector mo22340g(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : wf0.m29530p(annotation.annotationType())) {
            if (!m20795c(annotation2) && !annotationCollector.mo15950f(annotation2)) {
                annotationCollector = annotationCollector.mo15947a(annotation2);
                if (this.f14136a.isAnnotationBundle(annotation2)) {
                    annotationCollector = mo22341h(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    /* renamed from: h */
    public final AnnotationCollector mo22341h(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : wf0.m29530p(annotation.annotationType())) {
            if (!m20795c(annotation2)) {
                if (!this.f14136a.isAnnotationBundle(annotation2)) {
                    annotationCollector = annotationCollector.mo15947a(annotation2);
                } else if (!annotationCollector.mo15950f(annotation2)) {
                    annotationCollector = mo22341h(annotationCollector.mo15947a(annotation2), annotation2);
                }
            }
        }
        return annotationCollector;
    }
}
