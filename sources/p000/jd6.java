package p000;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.C2021a;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.Collection;

/* renamed from: jd6 */
/* compiled from: SubtypeResolver */
public abstract class jd6 {
    @Deprecated
    public Collection<NamedType> collectAndResolveSubtypes(AnnotatedMember annotatedMember, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, JavaType javaType) {
        return collectAndResolveSubtypesByClass(mapperConfig, annotatedMember, javaType);
    }

    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return collectAndResolveSubtypes(annotatedMember, mapperConfig, mapperConfig.getAnnotationIntrospector(), javaType);
    }

    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return collectAndResolveSubtypes(annotatedMember, mapperConfig, mapperConfig.getAnnotationIntrospector(), javaType);
    }

    public jd6 copy() {
        return this;
    }

    public abstract void registerSubtypes(Collection<Class<?>> collection);

    public abstract void registerSubtypes(NamedType... namedTypeArr);

    public abstract void registerSubtypes(Class<?>... clsArr);

    @Deprecated
    public Collection<NamedType> collectAndResolveSubtypes(C2021a aVar, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector) {
        return collectAndResolveSubtypesByClass(mapperConfig, aVar);
    }

    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, C2021a aVar) {
        return collectAndResolveSubtypes(aVar, mapperConfig, mapperConfig.getAnnotationIntrospector());
    }

    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, C2021a aVar) {
        return collectAndResolveSubtypes(aVar, mapperConfig, mapperConfig.getAnnotationIntrospector());
    }
}
