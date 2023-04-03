package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.C2029f;
import com.fasterxml.jackson.databind.introspect.C2033i;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fasterxml.jackson.databind.introspect.d */
/* compiled from: AnnotatedFieldCollector */
public class C2025d extends kk0 {

    /* renamed from: d */
    public final TypeFactory f10039d;

    /* renamed from: e */
    public final C2029f.C2030a f10040e;

    /* renamed from: f */
    public final boolean f10041f;

    /* renamed from: com.fasterxml.jackson.databind.introspect.d$a */
    /* compiled from: AnnotatedFieldCollector */
    public static final class C2026a {

        /* renamed from: a */
        public final C2033i f10042a;

        /* renamed from: b */
        public final Field f10043b;

        /* renamed from: c */
        public AnnotationCollector f10044c = AnnotationCollector.m14134e();

        public C2026a(C2033i iVar, Field field) {
            this.f10042a = iVar;
            this.f10043b = field;
        }

        /* renamed from: a */
        public AnnotatedField mo16071a() {
            return new AnnotatedField(this.f10042a, this.f10043b, this.f10044c.mo15948b());
        }
    }

    public C2025d(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, C2029f.C2030a aVar, boolean z) {
        super(annotationIntrospector);
        this.f10039d = typeFactory;
        this.f10040e = annotationIntrospector == null ? null : aVar;
        this.f10041f = z;
    }

    /* renamed from: m */
    public static List<AnnotatedField> m14212m(AnnotationIntrospector annotationIntrospector, C2033i iVar, C2029f.C2030a aVar, TypeFactory typeFactory, JavaType javaType, boolean z) {
        return new C2025d(annotationIntrospector, typeFactory, aVar, z).mo16070l(iVar, javaType);
    }

    /* renamed from: i */
    public final void mo16067i(Class<?> cls, Class<?> cls2, Map<String, C2026a> map) {
        C2026a aVar;
        for (Class<?> declaredFields : wf0.m29538x(cls, cls2, true)) {
            for (Field field : declaredFields.getDeclaredFields()) {
                if (mo16069k(field) && (aVar = map.get(field.getName())) != null) {
                    aVar.f10044c = mo22337d(aVar.f10044c, field.getDeclaredAnnotations());
                }
            }
        }
    }

    /* renamed from: j */
    public final Map<String, C2026a> mo16068j(C2033i iVar, JavaType javaType, Map<String, C2026a> map) {
        C2029f.C2030a aVar;
        Class<?> findMixInClassFor;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return map;
        }
        Class<?> rawClass = javaType.getRawClass();
        Map<String, C2026a> j = mo16068j(new C2033i.C2034a(this.f10039d, superClass.getBindings()), superClass, map);
        for (Field field : rawClass.getDeclaredFields()) {
            if (mo16069k(field)) {
                if (j == null) {
                    j = new LinkedHashMap<>();
                }
                C2026a aVar2 = new C2026a(iVar, field);
                if (this.f10041f) {
                    aVar2.f10044c = mo22337d(aVar2.f10044c, field.getDeclaredAnnotations());
                }
                j.put(field.getName(), aVar2);
            }
        }
        if (!(j == null || (aVar = this.f10040e) == null || (findMixInClassFor = aVar.findMixInClassFor(rawClass)) == null)) {
            mo16067i(findMixInClassFor, rawClass, j);
        }
        return j;
    }

    /* renamed from: k */
    public final boolean mo16069k(Field field) {
        if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public List<AnnotatedField> mo16070l(C2033i iVar, JavaType javaType) {
        Map<String, C2026a> j = mo16068j(iVar, javaType, (Map<String, C2026a>) null);
        if (j == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(j.size());
        for (C2026a a : j.values()) {
            arrayList.add(a.mo16071a());
        }
        return arrayList;
    }
}
