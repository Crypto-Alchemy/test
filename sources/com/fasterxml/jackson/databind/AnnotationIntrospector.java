package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.C2021a;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000.k53;

public abstract class AnnotationIntrospector implements Serializable {

    public static class ReferenceProperty {

        /* renamed from: a */
        public final Type f9867a;

        /* renamed from: b */
        public final String f9868b;

        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public ReferenceProperty(Type type, String str) {
            this.f9867a = type;
            this.f9868b = str;
        }

        /* renamed from: a */
        public static ReferenceProperty m13976a(String str) {
            return new ReferenceProperty(Type.BACK_REFERENCE, str);
        }

        /* renamed from: e */
        public static ReferenceProperty m13977e(String str) {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, str);
        }

        /* renamed from: b */
        public String mo14221b() {
            return this.f9868b;
        }

        /* renamed from: c */
        public boolean mo14222c() {
            if (this.f9867a == Type.BACK_REFERENCE) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo14223d() {
            if (this.f9867a == Type.MANAGED_REFERENCE) {
                return true;
            }
            return false;
        }
    }

    public static AnnotationIntrospector nopInstance() {
        return NopAnnotationIntrospector.instance;
    }

    public static AnnotationIntrospector pair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    public <A extends Annotation> A _findAnnotation(C2911nl nlVar, Class<A> cls) {
        return nlVar.getAnnotation(cls);
    }

    public boolean _hasAnnotation(C2911nl nlVar, Class<? extends Annotation> cls) {
        return nlVar.hasAnnotation(cls);
    }

    public boolean _hasOneOf(C2911nl nlVar, Class<? extends Annotation>[] clsArr) {
        return nlVar.hasOneOf(clsArr);
    }

    public Collection<AnnotationIntrospector> allIntrospectors() {
        return Collections.singletonList(this);
    }

    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, C2021a aVar, List<BeanPropertyWriter> list) {
    }

    public VisibilityChecker<?> findAutoDetectVisibility(C2021a aVar, VisibilityChecker<?> visibilityChecker) {
        return visibilityChecker;
    }

    public String findClassDescription(C2021a aVar) {
        return null;
    }

    public Object findContentDeserializer(C2911nl nlVar) {
        return null;
    }

    public Object findContentSerializer(C2911nl nlVar) {
        return null;
    }

    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        if (!hasCreatorAnnotation(nlVar)) {
            return null;
        }
        JsonCreator.Mode findCreatorBinding = findCreatorBinding(nlVar);
        if (findCreatorBinding == null) {
            return JsonCreator.Mode.DEFAULT;
        }
        return findCreatorBinding;
    }

    @Deprecated
    public JsonCreator.Mode findCreatorBinding(C2911nl nlVar) {
        return null;
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return null;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationContentType(C2911nl nlVar, JavaType javaType) {
        return null;
    }

    public Object findDeserializationConverter(C2911nl nlVar) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(C2911nl nlVar, JavaType javaType) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationType(C2911nl nlVar, JavaType javaType) {
        return null;
    }

    public Object findDeserializer(C2911nl nlVar) {
        return null;
    }

    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
    }

    @Deprecated
    public String findEnumValue(Enum<?> enumR) {
        return enumR.name();
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    public Object findFilterId(C2911nl nlVar) {
        return null;
    }

    public JsonFormat.Value findFormat(C2911nl nlVar) {
        return JsonFormat.Value.empty();
    }

    @Deprecated
    public Boolean findIgnoreUnknownProperties(C2021a aVar) {
        return null;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        return null;
    }

    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        Object findInjectableValueId = findInjectableValueId(annotatedMember);
        if (findInjectableValueId != null) {
            return JacksonInject.Value.forId(findInjectableValueId);
        }
        return null;
    }

    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findKeyDeserializer(C2911nl nlVar) {
        return null;
    }

    public Object findKeySerializer(C2911nl nlVar) {
        return null;
    }

    public Boolean findMergeInfo(C2911nl nlVar) {
        return null;
    }

    public PropertyName findNameForDeserialization(C2911nl nlVar) {
        return null;
    }

    public PropertyName findNameForSerialization(C2911nl nlVar) {
        return null;
    }

    public Object findNamingStrategy(C2021a aVar) {
        return null;
    }

    public Object findNullSerializer(C2911nl nlVar) {
        return null;
    }

    public bf4 findObjectIdInfo(C2911nl nlVar) {
        return null;
    }

    public bf4 findObjectReferenceInfo(C2911nl nlVar, bf4 bf4) {
        return bf4;
    }

    public Class<?> findPOJOBuilder(C2021a aVar) {
        return null;
    }

    public k53.C2643a findPOJOBuilderConfig(C2021a aVar) {
        return null;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(C2911nl nlVar, boolean z) {
        return null;
    }

    public JsonProperty.Access findPropertyAccess(C2911nl nlVar) {
        return null;
    }

    public List<PropertyName> findPropertyAliases(C2911nl nlVar) {
        return null;
    }

    public l17<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public String findPropertyDefaultValue(C2911nl nlVar) {
        return null;
    }

    public String findPropertyDescription(C2911nl nlVar) {
        return null;
    }

    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        return findPropertyIgnorals(nlVar);
    }

    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(C2911nl nlVar) {
        return JsonIgnoreProperties.Value.empty();
    }

    public JsonInclude.Value findPropertyInclusion(C2911nl nlVar) {
        return JsonInclude.Value.empty();
    }

    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        return JsonIncludeProperties.Value.all();
    }

    public Integer findPropertyIndex(C2911nl nlVar) {
        return null;
    }

    public l17<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        return null;
    }

    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    public PropertyName findRootName(C2021a aVar) {
        return null;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationContentType(C2911nl nlVar, JavaType javaType) {
        return null;
    }

    public Object findSerializationConverter(C2911nl nlVar) {
        return null;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusion(C2911nl nlVar, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(C2911nl nlVar, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public Class<?> findSerializationKeyType(C2911nl nlVar, JavaType javaType) {
        return null;
    }

    public String[] findSerializationPropertyOrder(C2021a aVar) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(C2911nl nlVar) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationType(C2911nl nlVar) {
        return null;
    }

    public JsonSerialize.Typing findSerializationTyping(C2911nl nlVar) {
        return null;
    }

    public Object findSerializer(C2911nl nlVar) {
        return null;
    }

    public JsonSetter.Value findSetterInfo(C2911nl nlVar) {
        return JsonSetter.Value.empty();
    }

    public List<NamedType> findSubtypes(C2911nl nlVar) {
        return null;
    }

    public String findTypeName(C2021a aVar) {
        return null;
    }

    public l17<?> findTypeResolver(MapperConfig<?> mapperConfig, C2021a aVar, JavaType javaType) {
        return null;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findValueInstantiator(C2021a aVar) {
        return null;
    }

    public Class<?>[] findViews(C2911nl nlVar) {
        return null;
    }

    public PropertyName findWrapperName(C2911nl nlVar) {
        return null;
    }

    public Boolean hasAnyGetter(C2911nl nlVar) {
        if (!(nlVar instanceof AnnotatedMethod) || !hasAnyGetterAnnotation((AnnotatedMethod) nlVar)) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Boolean hasAnySetter(C2911nl nlVar) {
        return null;
    }

    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Boolean hasAsKey(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        return null;
    }

    public Boolean hasAsValue(C2911nl nlVar) {
        if (!(nlVar instanceof AnnotatedMethod) || !hasAsValueAnnotation((AnnotatedMethod) nlVar)) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    @Deprecated
    public boolean hasCreatorAnnotation(C2911nl nlVar) {
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return false;
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return false;
    }

    public Boolean isIgnorableType(C2021a aVar) {
        return null;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return null;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, C2911nl nlVar, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, C2911nl nlVar, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        return null;
    }

    public abstract Version version();

    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        collection.add(this);
        return collection;
    }
}
