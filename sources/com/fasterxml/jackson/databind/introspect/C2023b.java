package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.C2029f;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.fasterxml.jackson.databind.introspect.b */
/* compiled from: AnnotatedClassResolver */
public class C2023b {

    /* renamed from: i */
    public static final C2236em f10023i = AnnotationCollector.m14133d();

    /* renamed from: j */
    public static final Class<?> f10024j = Object.class;

    /* renamed from: k */
    public static final Class<?> f10025k = Enum.class;

    /* renamed from: l */
    public static final Class<?> f10026l = List.class;

    /* renamed from: m */
    public static final Class<?> f10027m = Map.class;

    /* renamed from: a */
    public final MapperConfig<?> f10028a;

    /* renamed from: b */
    public final AnnotationIntrospector f10029b;

    /* renamed from: c */
    public final C2029f.C2030a f10030c;

    /* renamed from: d */
    public final TypeBindings f10031d;

    /* renamed from: e */
    public final JavaType f10032e;

    /* renamed from: f */
    public final Class<?> f10033f;

    /* renamed from: g */
    public final Class<?> f10034g;

    /* renamed from: h */
    public final boolean f10035h;

    public C2023b(MapperConfig<?> mapperConfig, JavaType javaType, C2029f.C2030a aVar) {
        this.f10028a = mapperConfig;
        this.f10032e = javaType;
        Class<?> rawClass = javaType.getRawClass();
        this.f10033f = rawClass;
        this.f10030c = aVar;
        this.f10031d = javaType.getBindings();
        Class<?> cls = null;
        AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this.f10029b = annotationIntrospector;
        this.f10034g = aVar != null ? aVar.findMixInClassFor(rawClass) : cls;
        this.f10035h = annotationIntrospector != null && (!wf0.m29486M(rawClass) || !javaType.isContainerType());
    }

    /* renamed from: d */
    public static void m14184d(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> rawClass = javaType.getRawClass();
        if (z) {
            if (!m14186f(list, rawClass)) {
                list.add(javaType);
                if (rawClass == f10026l || rawClass == f10027m) {
                    return;
                }
            } else {
                return;
            }
        }
        for (JavaType d : javaType.getInterfaces()) {
            m14184d(d, list, true);
        }
    }

    /* renamed from: e */
    public static void m14185e(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass != f10024j && rawClass != f10025k) {
            if (z) {
                if (!m14186f(list, rawClass)) {
                    list.add(javaType);
                } else {
                    return;
                }
            }
            for (JavaType d : javaType.getInterfaces()) {
                m14184d(d, list, true);
            }
            JavaType superClass = javaType.getSuperClass();
            if (superClass != null) {
                m14185e(superClass, list, true);
            }
        }
    }

    /* renamed from: f */
    public static boolean m14186f(List<JavaType> list, Class<?> cls) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getRawClass() == cls) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static C2021a m14187g(MapperConfig<?> mapperConfig, Class<?> cls) {
        return new C2021a(cls);
    }

    /* renamed from: h */
    public static C2021a m14188h(Class<?> cls) {
        return new C2021a(cls);
    }

    /* renamed from: i */
    public static C2021a m14189i(MapperConfig<?> mapperConfig, JavaType javaType, C2029f.C2030a aVar) {
        if (!javaType.isArrayType() || !m14193p(mapperConfig, javaType.getRawClass())) {
            return new C2023b(mapperConfig, javaType, aVar).mo16056k();
        }
        return m14187g(mapperConfig, javaType.getRawClass());
    }

    /* renamed from: m */
    public static C2021a m14190m(MapperConfig<?> mapperConfig, JavaType javaType, C2029f.C2030a aVar) {
        if (!javaType.isArrayType() || !m14193p(mapperConfig, javaType.getRawClass())) {
            return new C2023b(mapperConfig, javaType, aVar).mo16057l();
        }
        return m14187g(mapperConfig, javaType.getRawClass());
    }

    /* renamed from: n */
    public static C2021a m14191n(MapperConfig<?> mapperConfig, Class<?> cls) {
        return m14192o(mapperConfig, cls, mapperConfig);
    }

    /* renamed from: o */
    public static C2021a m14192o(MapperConfig<?> mapperConfig, Class<?> cls, C2029f.C2030a aVar) {
        if (!cls.isArray() || !m14193p(mapperConfig, cls)) {
            return new C2023b(mapperConfig, cls, aVar).mo16057l();
        }
        return m14187g(mapperConfig, cls);
    }

    /* renamed from: p */
    public static boolean m14193p(MapperConfig<?> mapperConfig, Class<?> cls) {
        if (mapperConfig == null || mapperConfig.findMixInClassFor(cls) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final AnnotationCollector mo16052a(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.mo15950f(annotation)) {
                    annotationCollector = annotationCollector.mo15947a(annotation);
                    if (this.f10029b.isAnnotationBundle(annotation)) {
                        annotationCollector = mo16054c(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    /* renamed from: b */
    public final AnnotationCollector mo16053b(AnnotationCollector annotationCollector, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            annotationCollector = mo16052a(annotationCollector, wf0.m29530p(cls2));
            for (Class<?> p : wf0.m29538x(cls2, cls, false)) {
                annotationCollector = mo16052a(annotationCollector, wf0.m29530p(p));
            }
        }
        return annotationCollector;
    }

    /* renamed from: c */
    public final AnnotationCollector mo16054c(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : wf0.m29530p(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.mo15950f(annotation2)) {
                annotationCollector = annotationCollector.mo15947a(annotation2);
                if (this.f10029b.isAnnotationBundle(annotation2)) {
                    annotationCollector = mo16054c(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    /* renamed from: j */
    public final C2236em mo16055j(List<JavaType> list) {
        boolean z;
        Class<Object> cls = Object.class;
        if (this.f10029b == null) {
            return f10023i;
        }
        C2029f.C2030a aVar = this.f10030c;
        if (aVar == null || ((aVar instanceof SimpleMixInResolver) && !((SimpleMixInResolver) aVar).hasMixIns())) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !this.f10035h) {
            return f10023i;
        }
        AnnotationCollector e = AnnotationCollector.m14134e();
        Class<?> cls2 = this.f10034g;
        if (cls2 != null) {
            e = mo16053b(e, this.f10033f, cls2);
        }
        if (this.f10035h) {
            e = mo16052a(e, wf0.m29530p(this.f10033f));
        }
        for (JavaType next : list) {
            if (z) {
                Class<?> rawClass = next.getRawClass();
                e = mo16053b(e, rawClass, this.f10030c.findMixInClassFor(rawClass));
            }
            if (this.f10035h) {
                e = mo16052a(e, wf0.m29530p(next.getRawClass()));
            }
        }
        if (z) {
            e = mo16053b(e, cls, this.f10030c.findMixInClassFor(cls));
        }
        return e.mo15949c();
    }

    /* renamed from: k */
    public C2021a mo16056k() {
        ArrayList arrayList = new ArrayList(8);
        if (!this.f10032e.hasRawClass(Object.class)) {
            if (this.f10032e.isInterface()) {
                m14184d(this.f10032e, arrayList, false);
            } else {
                m14185e(this.f10032e, arrayList, false);
            }
        }
        return new C2021a(this.f10032e, this.f10033f, arrayList, this.f10034g, mo16055j(arrayList), this.f10031d, this.f10029b, this.f10030c, this.f10028a.getTypeFactory(), this.f10035h);
    }

    /* renamed from: l */
    public C2021a mo16057l() {
        List emptyList = Collections.emptyList();
        return new C2021a((JavaType) null, this.f10033f, emptyList, this.f10034g, mo16055j(emptyList), this.f10031d, this.f10029b, this.f10030c, this.f10028a.getTypeFactory(), this.f10035h);
    }

    public C2023b(MapperConfig<?> mapperConfig, Class<?> cls, C2029f.C2030a aVar) {
        this.f10028a = mapperConfig;
        Class<?> cls2 = null;
        this.f10032e = null;
        this.f10033f = cls;
        this.f10030c = aVar;
        this.f10031d = TypeBindings.emptyBindings();
        if (mapperConfig == null) {
            this.f10029b = null;
            this.f10034g = null;
        } else {
            this.f10029b = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            this.f10034g = aVar != null ? aVar.findMixInClassFor(cls) : cls2;
        }
        this.f10035h = this.f10029b != null;
    }
}
