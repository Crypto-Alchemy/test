package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

public class StdKeyDeserializers implements ia3, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public static ha3 m14111b(DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof AnnotatedConstructor) {
            Constructor annotated = ((AnnotatedConstructor) annotatedMember).getAnnotated();
            if (deserializationConfig.canOverrideAccessModifiers()) {
                wf0.m29512g(annotated, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new StdKeyDeserializer.StringCtorKeyDeserializer(annotated);
        }
        Method annotated2 = ((AnnotatedMethod) annotatedMember).getAnnotated();
        if (deserializationConfig.canOverrideAccessModifiers()) {
            wf0.m29512g(annotated2, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new StdKeyDeserializer.StringFactoryKeyDeserializer(annotated2);
    }

    /* renamed from: c */
    public static AnnotatedMethod m14112c(List<C2968ol<AnnotatedMethod, JsonCreator.Mode>> list) throws JsonMappingException {
        AnnotatedMethod annotatedMethod = null;
        for (C2968ol next : list) {
            if (next.f15939b != null) {
                if (annotatedMethod == null) {
                    annotatedMethod = (AnnotatedMethod) next.f15938a;
                } else {
                    Class<?> declaringClass = ((AnnotatedMethod) next.f15938a).getDeclaringClass();
                    throw new IllegalArgumentException("Multiple suitable annotated Creator factory methods to be used as the Key deserializer for type " + wf0.m29497X(declaringClass));
                }
            }
        }
        return annotatedMethod;
    }

    public static ha3 constructDelegatingKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, o43<?> o43) {
        return new StdKeyDeserializer.DelegatingKD(javaType.getRawClass(), o43);
    }

    public static ha3 constructEnumKeyDeserializer(EnumResolver enumResolver) {
        return new StdKeyDeserializer.EnumKD(enumResolver, (AnnotatedMethod) null);
    }

    /* renamed from: d */
    public static C2968ol<AnnotatedConstructor, JsonCreator.Mode> m14113d(n00 n00) {
        for (C2968ol<AnnotatedConstructor, JsonCreator.Mode> next : n00.mo23464v()) {
            AnnotatedConstructor annotatedConstructor = (AnnotatedConstructor) next.f15938a;
            if (annotatedConstructor.getParameterCount() == 1 && String.class == annotatedConstructor.getRawParameterType(0)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m14114e(C2968ol olVar) {
        if (((AnnotatedMethod) olVar.f15938a).getParameterCount() == 1 && ((AnnotatedMethod) olVar.f15938a).getRawParameterType(0) == String.class && olVar.f15939b != JsonCreator.Mode.PROPERTIES) {
            return false;
        }
        return true;
    }

    public static ha3 findStringBasedKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        n00 introspectForCreation = deserializationConfig.introspectForCreation(javaType);
        C2968ol<AnnotatedConstructor, JsonCreator.Mode> d = m14113d(introspectForCreation);
        if (d != null && d.f15939b != null) {
            return m14111b(deserializationConfig, (AnnotatedMember) d.f15938a);
        }
        List<C2968ol<AnnotatedMethod, JsonCreator.Mode>> x = introspectForCreation.mo23466x();
        boolean unused = x.removeIf(new t96());
        AnnotatedMethod c = m14112c(x);
        if (c != null) {
            return m14111b(deserializationConfig, c);
        }
        if (d != null) {
            return m14111b(deserializationConfig, (AnnotatedMember) d.f15938a);
        }
        if (!x.isEmpty()) {
            return m14111b(deserializationConfig, (AnnotatedMember) x.get(0).f15938a);
        }
        return null;
    }

    public ha3 findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            rawClass = wf0.m29529o0(rawClass);
        }
        return StdKeyDeserializer.forType(rawClass);
    }

    public static ha3 constructEnumKeyDeserializer(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
        return new StdKeyDeserializer.EnumKD(enumResolver, annotatedMethod);
    }
}
