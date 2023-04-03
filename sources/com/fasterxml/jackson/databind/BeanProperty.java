package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

public interface BeanProperty extends y24 {

    /* renamed from: d1 */
    public static final JsonFormat.Value f9870d1 = new JsonFormat.Value();

    /* renamed from: f1 */
    public static final JsonInclude.Value f9871f1 = JsonInclude.Value.empty();

    /* renamed from: com.fasterxml.jackson.databind.BeanProperty$a */
    public static class C1982a implements BeanProperty {
        public void depositSchemaProperty(j53 j53, zw5 zw5) throws JsonMappingException {
        }

        public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            return JsonFormat.Value.empty();
        }

        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            return null;
        }

        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return null;
        }

        public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
            return null;
        }

        public PropertyName getFullName() {
            return PropertyName.NO_NAME;
        }

        public AnnotatedMember getMember() {
            return null;
        }

        public PropertyMetadata getMetadata() {
            return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        }

        public String getName() {
            return "";
        }

        public JavaType getType() {
            return TypeFactory.unknownType();
        }

        public PropertyName getWrapperName() {
            return null;
        }
    }

    void depositSchemaProperty(j53 j53, zw5 zw5) throws JsonMappingException;

    JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls);

    JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls);

    <A extends Annotation> A getAnnotation(Class<A> cls);

    <A extends Annotation> A getContextAnnotation(Class<A> cls);

    PropertyName getFullName();

    AnnotatedMember getMember();

    PropertyMetadata getMetadata();

    String getName();

    JavaType getType();

    PropertyName getWrapperName();

    public static class Std implements BeanProperty, Serializable {
        private static final long serialVersionUID = 1;
        public final AnnotatedMember _member;
        public final PropertyMetadata _metadata;
        public final PropertyName _name;
        public final JavaType _type;
        public final PropertyName _wrapperName;

        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this._name = propertyName;
            this._type = javaType;
            this._wrapperName = propertyName2;
            this._metadata = propertyMetadata;
            this._member = annotatedMember;
        }

        public void depositSchemaProperty(j53 j53, zw5 zw5) {
            throw new UnsupportedOperationException("Instances of " + getClass().getName() + " should not get visited");
        }

        public List<PropertyName> findAliases(MapperConfig<?> mapperConfig) {
            return Collections.emptyList();
        }

        @Deprecated
        public JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationIntrospector) {
            JsonFormat.Value findFormat;
            AnnotatedMember annotatedMember = this._member;
            if (annotatedMember == null || annotationIntrospector == null || (findFormat = annotationIntrospector.findFormat(annotatedMember)) == null) {
                return BeanProperty.f9870d1;
            }
            return findFormat;
        }

        public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonFormat.Value findFormat;
            JsonFormat.Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector == null || (annotatedMember = this._member) == null || (findFormat = annotationIntrospector.findFormat(annotatedMember)) == null) {
                return defaultPropertyFormat;
            }
            return defaultPropertyFormat.withOverrides(findFormat);
        }

        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonInclude.Value findPropertyInclusion;
            JsonInclude.Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, this._type.getRawClass());
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector == null || (annotatedMember = this._member) == null || (findPropertyInclusion = annotationIntrospector.findPropertyInclusion(annotatedMember)) == null) {
                return defaultInclusion;
            }
            return defaultInclusion.withOverrides(findPropertyInclusion);
        }

        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            AnnotatedMember annotatedMember = this._member;
            if (annotatedMember == null) {
                return null;
            }
            return annotatedMember.getAnnotation(cls);
        }

        public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
            return null;
        }

        public PropertyName getFullName() {
            return this._name;
        }

        public AnnotatedMember getMember() {
            return this._member;
        }

        public PropertyMetadata getMetadata() {
            return this._metadata;
        }

        public String getName() {
            return this._name.getSimpleName();
        }

        public JavaType getType() {
            return this._type;
        }

        public PropertyName getWrapperName() {
            return this._wrapperName;
        }

        public boolean isRequired() {
            return this._metadata.isRequired();
        }

        public boolean isVirtual() {
            return false;
        }

        public Std withType(JavaType javaType) {
            return new Std(this, javaType);
        }

        @Deprecated
        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, C2236em emVar, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this(propertyName, javaType, propertyName2, annotatedMember, propertyMetadata);
        }

        public Std(Std std, JavaType javaType) {
            this(std._name, javaType, std._wrapperName, std._member, std._metadata);
        }
    }
}
