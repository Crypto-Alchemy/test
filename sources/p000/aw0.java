package p000;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

/* renamed from: aw0 */
/* compiled from: CreatorCandidate */
public final class aw0 {

    /* renamed from: a */
    public final AnnotationIntrospector f7784a;

    /* renamed from: b */
    public final AnnotatedWithParams f7785b;

    /* renamed from: c */
    public final int f7786c;

    /* renamed from: d */
    public final C1587a[] f7787d;

    /* renamed from: aw0$a */
    /* compiled from: CreatorCandidate */
    public static final class C1587a {

        /* renamed from: a */
        public final AnnotatedParameter f7788a;

        /* renamed from: b */
        public final q00 f7789b;

        /* renamed from: c */
        public final JacksonInject.Value f7790c;

        public C1587a(AnnotatedParameter annotatedParameter, q00 q00, JacksonInject.Value value) {
            this.f7788a = annotatedParameter;
            this.f7789b = q00;
            this.f7790c = value;
        }
    }

    public aw0(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, C1587a[] aVarArr, int i) {
        this.f7784a = annotationIntrospector;
        this.f7785b = annotatedWithParams;
        this.f7787d = aVarArr;
        this.f7786c = i;
    }

    /* renamed from: a */
    public static aw0 m10833a(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, q00[] q00Arr) {
        q00 q00;
        int parameterCount = annotatedWithParams.getParameterCount();
        C1587a[] aVarArr = new C1587a[parameterCount];
        for (int i = 0; i < parameterCount; i++) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i);
            JacksonInject.Value findInjectableValue = annotationIntrospector.findInjectableValue(parameter);
            if (q00Arr == null) {
                q00 = null;
            } else {
                q00 = q00Arr[i];
            }
            aVarArr[i] = new C1587a(parameter, q00, findInjectableValue);
        }
        return new aw0(annotationIntrospector, annotatedWithParams, aVarArr, parameterCount);
    }

    /* renamed from: b */
    public AnnotatedWithParams mo11160b() {
        return this.f7785b;
    }

    /* renamed from: c */
    public PropertyName mo11161c(int i) {
        q00 q00 = this.f7787d[i].f7789b;
        if (q00 == null || !q00.mo24875F()) {
            return null;
        }
        return q00.getFullName();
    }

    /* renamed from: d */
    public PropertyName mo11162d(int i) {
        String findImplicitPropertyName = this.f7784a.findImplicitPropertyName(this.f7787d[i].f7788a);
        if (findImplicitPropertyName == null || findImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(findImplicitPropertyName);
    }

    /* renamed from: e */
    public int mo11163e() {
        int i = -1;
        for (int i2 = 0; i2 < this.f7786c; i2++) {
            if (this.f7787d[i2].f7790c == null) {
                if (i >= 0) {
                    return -1;
                }
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: f */
    public JacksonInject.Value mo11164f(int i) {
        return this.f7787d[i].f7790c;
    }

    /* renamed from: g */
    public int mo11165g() {
        return this.f7786c;
    }

    /* renamed from: h */
    public PropertyName mo11166h(int i) {
        q00 q00 = this.f7787d[i].f7789b;
        if (q00 != null) {
            return q00.getFullName();
        }
        return null;
    }

    /* renamed from: i */
    public AnnotatedParameter mo11167i(int i) {
        return this.f7787d[i].f7788a;
    }

    /* renamed from: j */
    public q00 mo11168j(int i) {
        return this.f7787d[i].f7789b;
    }

    public String toString() {
        return this.f7785b.toString();
    }
}
