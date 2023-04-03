package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    private static final long serialVersionUID = 1;
    public transient List<PropertyName> _aliases;
    public final PropertyMetadata _metadata;

    public ConcreteBeanPropertyBase(PropertyMetadata propertyMetadata) {
        this._metadata = propertyMetadata == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : propertyMetadata;
    }

    public abstract /* synthetic */ void depositSchemaProperty(j53 j53, zw5 zw5) throws JsonMappingException;

    public List<PropertyName> findAliases(MapperConfig<?> mapperConfig) {
        AnnotatedMember member;
        List<PropertyName> list = this._aliases;
        if (list == null) {
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (!(annotationIntrospector == null || (member = getMember()) == null)) {
                list = annotationIntrospector.findPropertyAliases(member);
            }
            if (list == null) {
                list = Collections.emptyList();
            }
            this._aliases = list;
        }
        return list;
    }

    @Deprecated
    public final JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationIntrospector) {
        JsonFormat.Value value;
        AnnotatedMember member;
        if (annotationIntrospector == null || (member = getMember()) == null) {
            value = null;
        } else {
            value = annotationIntrospector.findFormat(member);
        }
        if (value == null) {
            return BeanProperty.f9870d1;
        }
        return value;
    }

    public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
        JsonFormat.Value value;
        AnnotatedMember member;
        JsonFormat.Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        if (annotationIntrospector == null || (member = getMember()) == null) {
            value = null;
        } else {
            value = annotationIntrospector.findFormat(member);
        }
        if (defaultPropertyFormat == null) {
            if (value == null) {
                return BeanProperty.f9870d1;
            }
            return value;
        } else if (value == null) {
            return defaultPropertyFormat;
        } else {
            return defaultPropertyFormat.withOverrides(value);
        }
    }

    public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        AnnotatedMember member = getMember();
        if (member == null) {
            return mapperConfig.getDefaultPropertyInclusion(cls);
        }
        JsonInclude.Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, member.getRawType());
        if (annotationIntrospector == null) {
            return defaultInclusion;
        }
        JsonInclude.Value findPropertyInclusion = annotationIntrospector.findPropertyInclusion(member);
        if (defaultInclusion == null) {
            return findPropertyInclusion;
        }
        return defaultInclusion.withOverrides(findPropertyInclusion);
    }

    public abstract /* synthetic */ <A extends Annotation> A getAnnotation(Class<A> cls);

    public abstract /* synthetic */ <A extends Annotation> A getContextAnnotation(Class<A> cls);

    public abstract /* synthetic */ PropertyName getFullName();

    public abstract /* synthetic */ AnnotatedMember getMember();

    public PropertyMetadata getMetadata() {
        return this._metadata;
    }

    public abstract /* synthetic */ String getName();

    public abstract /* synthetic */ JavaType getType();

    public abstract /* synthetic */ PropertyName getWrapperName();

    public boolean isRequired() {
        return this._metadata.isRequired();
    }

    public boolean isVirtual() {
        return false;
    }

    public ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this._metadata = concreteBeanPropertyBase._metadata;
    }
}
