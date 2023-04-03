package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.C2029f;
import com.fasterxml.jackson.databind.introspect.C2033i;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fasterxml.jackson.databind.introspect.e */
/* compiled from: AnnotatedMethodCollector */
public class C2027e extends kk0 {

    /* renamed from: d */
    public final C2029f.C2030a f10045d;

    /* renamed from: e */
    public final boolean f10046e;

    /* renamed from: com.fasterxml.jackson.databind.introspect.e$a */
    /* compiled from: AnnotatedMethodCollector */
    public static final class C2028a {

        /* renamed from: a */
        public C2033i f10047a;

        /* renamed from: b */
        public Method f10048b;

        /* renamed from: c */
        public AnnotationCollector f10049c;

        public C2028a(C2033i iVar, Method method, AnnotationCollector annotationCollector) {
            this.f10047a = iVar;
            this.f10048b = method;
            this.f10049c = annotationCollector;
        }

        /* renamed from: a */
        public AnnotatedMethod mo16075a() {
            Method method = this.f10048b;
            if (method == null) {
                return null;
            }
            return new AnnotatedMethod(this.f10047a, method, this.f10049c.mo15948b(), (C3742zl[]) null);
        }
    }

    public C2027e(AnnotationIntrospector annotationIntrospector, C2029f.C2030a aVar, boolean z) {
        super(annotationIntrospector);
        this.f10045d = annotationIntrospector == null ? null : aVar;
        this.f10046e = z;
    }

    /* renamed from: k */
    public static boolean m14218k(Method method) {
        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static C3153ql m14219m(AnnotationIntrospector annotationIntrospector, C2033i iVar, C2029f.C2030a aVar, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls, boolean z) {
        return new C2027e(annotationIntrospector, aVar, z).mo16074l(typeFactory, iVar, javaType, list, cls);
    }

    /* renamed from: i */
    public final void mo16072i(C2033i iVar, Class<?> cls, Map<os3, C2028a> map, Class<?> cls2) {
        AnnotationCollector annotationCollector;
        if (cls2 != null) {
            mo16073j(iVar, cls, map, cls2);
        }
        if (cls != null) {
            for (Method method : wf0.m29540z(cls)) {
                if (m14218k(method)) {
                    os3 os3 = new os3(method);
                    C2028a aVar = map.get(os3);
                    if (aVar == null) {
                        if (this.f14136a == null) {
                            annotationCollector = AnnotationCollector.m14134e();
                        } else {
                            annotationCollector = mo22338e(method.getDeclaredAnnotations());
                        }
                        map.put(os3, new C2028a(iVar, method, annotationCollector));
                    } else {
                        if (this.f10046e) {
                            aVar.f10049c = mo22339f(aVar.f10049c, method.getDeclaredAnnotations());
                        }
                        Method method2 = aVar.f10048b;
                        if (method2 == null) {
                            aVar.f10048b = method;
                        } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            aVar.f10048b = method;
                            aVar.f10047a = iVar;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public void mo16073j(C2033i iVar, Class<?> cls, Map<os3, C2028a> map, Class<?> cls2) {
        if (this.f14136a != null) {
            for (Class<?> declaredMethods : wf0.m29537w(cls2, cls, true)) {
                for (Method method : declaredMethods.getDeclaredMethods()) {
                    if (m14218k(method)) {
                        os3 os3 = new os3(method);
                        C2028a aVar = map.get(os3);
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        if (aVar == null) {
                            map.put(os3, new C2028a(iVar, (Method) null, mo22338e(declaredAnnotations)));
                        } else {
                            aVar.f10049c = mo22339f(aVar.f10049c, declaredAnnotations);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public C3153ql mo16074l(TypeFactory typeFactory, C2033i iVar, JavaType javaType, List<JavaType> list, Class<?> cls) {
        boolean z;
        Class<?> findMixInClassFor;
        Class<?> cls2;
        Class<Object> cls3 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mo16072i(iVar, javaType.getRawClass(), linkedHashMap, cls);
        for (JavaType next : list) {
            C2029f.C2030a aVar = this.f10045d;
            if (aVar == null) {
                cls2 = null;
            } else {
                cls2 = aVar.findMixInClassFor(next.getRawClass());
            }
            mo16072i(new C2033i.C2034a(typeFactory, next.getBindings()), next.getRawClass(), linkedHashMap, cls2);
        }
        C2029f.C2030a aVar2 = this.f10045d;
        if (aVar2 == null || (findMixInClassFor = aVar2.findMixInClassFor(cls3)) == null) {
            z = false;
        } else {
            mo16073j(iVar, javaType.getRawClass(), linkedHashMap, findMixInClassFor);
            z = true;
        }
        if (z && this.f14136a != null && !linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                os3 os3 = (os3) entry.getKey();
                if ("hashCode".equals(os3.mo24097b()) && os3.mo24096a() == 0) {
                    try {
                        Method declaredMethod = cls3.getDeclaredMethod(os3.mo24097b(), new Class[0]);
                        if (declaredMethod != null) {
                            C2028a aVar3 = (C2028a) entry.getValue();
                            aVar3.f10049c = mo22339f(aVar3.f10049c, declaredMethod.getDeclaredAnnotations());
                            aVar3.f10048b = declaredMethod;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new C3153ql();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            AnnotatedMethod a = ((C2028a) entry2.getValue()).mo16075a();
            if (a != null) {
                linkedHashMap2.put(entry2.getKey(), a);
            }
        }
        return new C3153ql(linkedHashMap2);
    }
}
