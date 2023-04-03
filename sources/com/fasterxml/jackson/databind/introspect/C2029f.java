package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;

/* renamed from: com.fasterxml.jackson.databind.introspect.f */
/* compiled from: ClassIntrospector */
public abstract class C2029f {

    /* renamed from: com.fasterxml.jackson.databind.introspect.f$a */
    /* compiled from: ClassIntrospector */
    public interface C2030a {
        C2030a copy();

        Class<?> findMixInClassFor(Class<?> cls);
    }

    public abstract C2029f copy();

    public abstract n00 forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, C2030a aVar);

    public abstract n00 forCreation(DeserializationConfig deserializationConfig, JavaType javaType, C2030a aVar);

    public abstract n00 forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, C2030a aVar);

    @Deprecated
    public abstract n00 forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, C2030a aVar);

    public abstract n00 forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, C2030a aVar, n00 n00);

    public abstract n00 forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, C2030a aVar);

    public abstract n00 forSerialization(SerializationConfig serializationConfig, JavaType javaType, C2030a aVar);
}
