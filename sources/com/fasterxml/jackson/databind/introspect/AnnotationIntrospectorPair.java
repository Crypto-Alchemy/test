package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.ha3;
import p000.k53;
import p000.o43;
import p000.y63;

public class AnnotationIntrospectorPair extends AnnotationIntrospector {
    private static final long serialVersionUID = 1;
    public final AnnotationIntrospector _primary;
    public final AnnotationIntrospector _secondary;

    public AnnotationIntrospectorPair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._primary = annotationIntrospector;
        this._secondary = annotationIntrospector2;
    }

    public static AnnotationIntrospector create(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        if (annotationIntrospector == null) {
            return annotationIntrospector2;
        }
        if (annotationIntrospector2 == null) {
            return annotationIntrospector;
        }
        return new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    public Object _explicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return null;
        }
        if (!(obj instanceof Class) || !wf0.m29483J((Class) obj)) {
            return obj;
        }
        return null;
    }

    public boolean _isExplicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return false;
        }
        if (obj instanceof Class) {
            return !wf0.m29483J((Class) obj);
        }
        return true;
    }

    public Collection<AnnotationIntrospector> allIntrospectors() {
        return allIntrospectors(new ArrayList());
    }

    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, C2021a aVar, List<BeanPropertyWriter> list) {
        this._primary.findAndAddVirtualProperties(mapperConfig, aVar, list);
        this._secondary.findAndAddVirtualProperties(mapperConfig, aVar, list);
    }

    public VisibilityChecker<?> findAutoDetectVisibility(C2021a aVar, VisibilityChecker<?> visibilityChecker) {
        return this._primary.findAutoDetectVisibility(aVar, this._secondary.findAutoDetectVisibility(aVar, visibilityChecker));
    }

    public String findClassDescription(C2021a aVar) {
        String findClassDescription = this._primary.findClassDescription(aVar);
        if (findClassDescription == null || findClassDescription.isEmpty()) {
            return this._secondary.findClassDescription(aVar);
        }
        return findClassDescription;
    }

    public Object findContentDeserializer(C2911nl nlVar) {
        Class<o43.C2939a> cls = o43.C2939a.class;
        Object findContentDeserializer = this._primary.findContentDeserializer(nlVar);
        if (_isExplicitClassOrOb(findContentDeserializer, cls)) {
            return findContentDeserializer;
        }
        return _explicitClassOrOb(this._secondary.findContentDeserializer(nlVar), cls);
    }

    public Object findContentSerializer(C2911nl nlVar) {
        Class<y63.C3656a> cls = y63.C3656a.class;
        Object findContentSerializer = this._primary.findContentSerializer(nlVar);
        if (_isExplicitClassOrOb(findContentSerializer, cls)) {
            return findContentSerializer;
        }
        return _explicitClassOrOb(this._secondary.findContentSerializer(nlVar), cls);
    }

    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        JsonCreator.Mode findCreatorAnnotation = this._primary.findCreatorAnnotation(mapperConfig, nlVar);
        if (findCreatorAnnotation == null) {
            return this._secondary.findCreatorAnnotation(mapperConfig, nlVar);
        }
        return findCreatorAnnotation;
    }

    @Deprecated
    public JsonCreator.Mode findCreatorBinding(C2911nl nlVar) {
        JsonCreator.Mode findCreatorBinding = this._primary.findCreatorBinding(nlVar);
        if (findCreatorBinding != null) {
            return findCreatorBinding;
        }
        return this._secondary.findCreatorBinding(nlVar);
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        Enum<?> findDefaultEnumValue = this._primary.findDefaultEnumValue(cls);
        if (findDefaultEnumValue == null) {
            return this._secondary.findDefaultEnumValue(cls);
        }
        return findDefaultEnumValue;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        Object findDeserializationContentConverter = this._primary.findDeserializationContentConverter(annotatedMember);
        if (findDeserializationContentConverter == null) {
            return this._secondary.findDeserializationContentConverter(annotatedMember);
        }
        return findDeserializationContentConverter;
    }

    @Deprecated
    public Class<?> findDeserializationContentType(C2911nl nlVar, JavaType javaType) {
        Class<?> findDeserializationContentType = this._primary.findDeserializationContentType(nlVar, javaType);
        if (findDeserializationContentType == null) {
            return this._secondary.findDeserializationContentType(nlVar, javaType);
        }
        return findDeserializationContentType;
    }

    public Object findDeserializationConverter(C2911nl nlVar) {
        Object findDeserializationConverter = this._primary.findDeserializationConverter(nlVar);
        if (findDeserializationConverter == null) {
            return this._secondary.findDeserializationConverter(nlVar);
        }
        return findDeserializationConverter;
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(C2911nl nlVar, JavaType javaType) {
        Class<?> findDeserializationKeyType = this._primary.findDeserializationKeyType(nlVar, javaType);
        if (findDeserializationKeyType == null) {
            return this._secondary.findDeserializationKeyType(nlVar, javaType);
        }
        return findDeserializationKeyType;
    }

    @Deprecated
    public Class<?> findDeserializationType(C2911nl nlVar, JavaType javaType) {
        Class<?> findDeserializationType = this._primary.findDeserializationType(nlVar, javaType);
        if (findDeserializationType != null) {
            return findDeserializationType;
        }
        return this._secondary.findDeserializationType(nlVar, javaType);
    }

    public Object findDeserializer(C2911nl nlVar) {
        Class<o43.C2939a> cls = o43.C2939a.class;
        Object findDeserializer = this._primary.findDeserializer(nlVar);
        if (_isExplicitClassOrOb(findDeserializer, cls)) {
            return findDeserializer;
        }
        return _explicitClassOrOb(this._secondary.findDeserializer(nlVar), cls);
    }

    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        this._secondary.findEnumAliases(cls, enumArr, strArr);
        this._primary.findEnumAliases(cls, enumArr, strArr);
    }

    @Deprecated
    public String findEnumValue(Enum<?> enumR) {
        String findEnumValue = this._primary.findEnumValue(enumR);
        if (findEnumValue == null) {
            return this._secondary.findEnumValue(enumR);
        }
        return findEnumValue;
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return this._primary.findEnumValues(cls, enumArr, this._secondary.findEnumValues(cls, enumArr, strArr));
    }

    public Object findFilterId(C2911nl nlVar) {
        Object findFilterId = this._primary.findFilterId(nlVar);
        if (findFilterId == null) {
            return this._secondary.findFilterId(nlVar);
        }
        return findFilterId;
    }

    public JsonFormat.Value findFormat(C2911nl nlVar) {
        JsonFormat.Value findFormat = this._primary.findFormat(nlVar);
        JsonFormat.Value findFormat2 = this._secondary.findFormat(nlVar);
        if (findFormat2 == null) {
            return findFormat;
        }
        return findFormat2.withOverrides(findFormat);
    }

    @Deprecated
    public Boolean findIgnoreUnknownProperties(C2021a aVar) {
        Boolean findIgnoreUnknownProperties = this._primary.findIgnoreUnknownProperties(aVar);
        if (findIgnoreUnknownProperties == null) {
            return this._secondary.findIgnoreUnknownProperties(aVar);
        }
        return findIgnoreUnknownProperties;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        String findImplicitPropertyName = this._primary.findImplicitPropertyName(annotatedMember);
        if (findImplicitPropertyName == null) {
            return this._secondary.findImplicitPropertyName(annotatedMember);
        }
        return findImplicitPropertyName;
    }

    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        JacksonInject.Value findInjectableValue;
        JacksonInject.Value findInjectableValue2 = this._primary.findInjectableValue(annotatedMember);
        if ((findInjectableValue2 != null && findInjectableValue2.getUseInput() != null) || (findInjectableValue = this._secondary.findInjectableValue(annotatedMember)) == null) {
            return findInjectableValue2;
        }
        if (findInjectableValue2 != null) {
            findInjectableValue = findInjectableValue2.withUseInput(findInjectableValue.getUseInput());
        }
        return findInjectableValue;
    }

    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        Object findInjectableValueId = this._primary.findInjectableValueId(annotatedMember);
        if (findInjectableValueId == null) {
            return this._secondary.findInjectableValueId(annotatedMember);
        }
        return findInjectableValueId;
    }

    public Object findKeyDeserializer(C2911nl nlVar) {
        Class<ha3.C2459a> cls = ha3.C2459a.class;
        Object findKeyDeserializer = this._primary.findKeyDeserializer(nlVar);
        if (_isExplicitClassOrOb(findKeyDeserializer, cls)) {
            return findKeyDeserializer;
        }
        return _explicitClassOrOb(this._secondary.findKeyDeserializer(nlVar), cls);
    }

    public Object findKeySerializer(C2911nl nlVar) {
        Class<y63.C3656a> cls = y63.C3656a.class;
        Object findKeySerializer = this._primary.findKeySerializer(nlVar);
        if (_isExplicitClassOrOb(findKeySerializer, cls)) {
            return findKeySerializer;
        }
        return _explicitClassOrOb(this._secondary.findKeySerializer(nlVar), cls);
    }

    public Boolean findMergeInfo(C2911nl nlVar) {
        Boolean findMergeInfo = this._primary.findMergeInfo(nlVar);
        if (findMergeInfo == null) {
            return this._secondary.findMergeInfo(nlVar);
        }
        return findMergeInfo;
    }

    public PropertyName findNameForDeserialization(C2911nl nlVar) {
        PropertyName findNameForDeserialization;
        PropertyName findNameForDeserialization2 = this._primary.findNameForDeserialization(nlVar);
        if (findNameForDeserialization2 == null) {
            return this._secondary.findNameForDeserialization(nlVar);
        }
        if (findNameForDeserialization2 != PropertyName.USE_DEFAULT || (findNameForDeserialization = this._secondary.findNameForDeserialization(nlVar)) == null) {
            return findNameForDeserialization2;
        }
        return findNameForDeserialization;
    }

    public PropertyName findNameForSerialization(C2911nl nlVar) {
        PropertyName findNameForSerialization;
        PropertyName findNameForSerialization2 = this._primary.findNameForSerialization(nlVar);
        if (findNameForSerialization2 == null) {
            return this._secondary.findNameForSerialization(nlVar);
        }
        if (findNameForSerialization2 != PropertyName.USE_DEFAULT || (findNameForSerialization = this._secondary.findNameForSerialization(nlVar)) == null) {
            return findNameForSerialization2;
        }
        return findNameForSerialization;
    }

    public Object findNamingStrategy(C2021a aVar) {
        Object findNamingStrategy = this._primary.findNamingStrategy(aVar);
        if (findNamingStrategy == null) {
            return this._secondary.findNamingStrategy(aVar);
        }
        return findNamingStrategy;
    }

    public Object findNullSerializer(C2911nl nlVar) {
        Class<y63.C3656a> cls = y63.C3656a.class;
        Object findNullSerializer = this._primary.findNullSerializer(nlVar);
        if (_isExplicitClassOrOb(findNullSerializer, cls)) {
            return findNullSerializer;
        }
        return _explicitClassOrOb(this._secondary.findNullSerializer(nlVar), cls);
    }

    public bf4 findObjectIdInfo(C2911nl nlVar) {
        bf4 findObjectIdInfo = this._primary.findObjectIdInfo(nlVar);
        if (findObjectIdInfo == null) {
            return this._secondary.findObjectIdInfo(nlVar);
        }
        return findObjectIdInfo;
    }

    public bf4 findObjectReferenceInfo(C2911nl nlVar, bf4 bf4) {
        return this._primary.findObjectReferenceInfo(nlVar, this._secondary.findObjectReferenceInfo(nlVar, bf4));
    }

    public Class<?> findPOJOBuilder(C2021a aVar) {
        Class<?> findPOJOBuilder = this._primary.findPOJOBuilder(aVar);
        if (findPOJOBuilder == null) {
            return this._secondary.findPOJOBuilder(aVar);
        }
        return findPOJOBuilder;
    }

    public k53.C2643a findPOJOBuilderConfig(C2021a aVar) {
        k53.C2643a findPOJOBuilderConfig = this._primary.findPOJOBuilderConfig(aVar);
        if (findPOJOBuilderConfig == null) {
            return this._secondary.findPOJOBuilderConfig(aVar);
        }
        return findPOJOBuilderConfig;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(C2911nl nlVar, boolean z) {
        String[] findPropertiesToIgnore = this._primary.findPropertiesToIgnore(nlVar, z);
        if (findPropertiesToIgnore == null) {
            return this._secondary.findPropertiesToIgnore(nlVar, z);
        }
        return findPropertiesToIgnore;
    }

    public JsonProperty.Access findPropertyAccess(C2911nl nlVar) {
        JsonProperty.Access findPropertyAccess = this._primary.findPropertyAccess(nlVar);
        if (findPropertyAccess != null && findPropertyAccess != JsonProperty.Access.AUTO) {
            return findPropertyAccess;
        }
        JsonProperty.Access findPropertyAccess2 = this._secondary.findPropertyAccess(nlVar);
        if (findPropertyAccess2 != null) {
            return findPropertyAccess2;
        }
        return JsonProperty.Access.AUTO;
    }

    public List<PropertyName> findPropertyAliases(C2911nl nlVar) {
        List<PropertyName> findPropertyAliases = this._primary.findPropertyAliases(nlVar);
        if (findPropertyAliases == null) {
            return this._secondary.findPropertyAliases(nlVar);
        }
        return findPropertyAliases;
    }

    public l17<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        l17<?> findPropertyContentTypeResolver = this._primary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType);
        if (findPropertyContentTypeResolver == null) {
            return this._secondary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        return findPropertyContentTypeResolver;
    }

    public String findPropertyDefaultValue(C2911nl nlVar) {
        String findPropertyDefaultValue = this._primary.findPropertyDefaultValue(nlVar);
        if (findPropertyDefaultValue == null || findPropertyDefaultValue.isEmpty()) {
            return this._secondary.findPropertyDefaultValue(nlVar);
        }
        return findPropertyDefaultValue;
    }

    public String findPropertyDescription(C2911nl nlVar) {
        String findPropertyDescription = this._primary.findPropertyDescription(nlVar);
        if (findPropertyDescription == null) {
            return this._secondary.findPropertyDescription(nlVar);
        }
        return findPropertyDescription;
    }

    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        JsonIgnoreProperties.Value findPropertyIgnoralByName = this._secondary.findPropertyIgnoralByName(mapperConfig, nlVar);
        JsonIgnoreProperties.Value findPropertyIgnoralByName2 = this._primary.findPropertyIgnoralByName(mapperConfig, nlVar);
        if (findPropertyIgnoralByName == null) {
            return findPropertyIgnoralByName2;
        }
        return findPropertyIgnoralByName.withOverrides(findPropertyIgnoralByName2);
    }

    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(C2911nl nlVar) {
        JsonIgnoreProperties.Value findPropertyIgnorals = this._secondary.findPropertyIgnorals(nlVar);
        JsonIgnoreProperties.Value findPropertyIgnorals2 = this._primary.findPropertyIgnorals(nlVar);
        if (findPropertyIgnorals == null) {
            return findPropertyIgnorals2;
        }
        return findPropertyIgnorals.withOverrides(findPropertyIgnorals2);
    }

    public JsonInclude.Value findPropertyInclusion(C2911nl nlVar) {
        JsonInclude.Value findPropertyInclusion = this._secondary.findPropertyInclusion(nlVar);
        JsonInclude.Value findPropertyInclusion2 = this._primary.findPropertyInclusion(nlVar);
        if (findPropertyInclusion == null) {
            return findPropertyInclusion2;
        }
        return findPropertyInclusion.withOverrides(findPropertyInclusion2);
    }

    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        JsonIncludeProperties.Value findPropertyInclusionByName = this._secondary.findPropertyInclusionByName(mapperConfig, nlVar);
        JsonIncludeProperties.Value findPropertyInclusionByName2 = this._primary.findPropertyInclusionByName(mapperConfig, nlVar);
        if (findPropertyInclusionByName == null) {
            return findPropertyInclusionByName2;
        }
        return findPropertyInclusionByName.withOverrides(findPropertyInclusionByName2);
    }

    public Integer findPropertyIndex(C2911nl nlVar) {
        Integer findPropertyIndex = this._primary.findPropertyIndex(nlVar);
        if (findPropertyIndex == null) {
            return this._secondary.findPropertyIndex(nlVar);
        }
        return findPropertyIndex;
    }

    public l17<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        l17<?> findPropertyTypeResolver = this._primary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return this._secondary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        return findPropertyTypeResolver;
    }

    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        AnnotationIntrospector.ReferenceProperty findReferenceType = this._primary.findReferenceType(annotatedMember);
        if (findReferenceType == null) {
            return this._secondary.findReferenceType(annotatedMember);
        }
        return findReferenceType;
    }

    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        PropertyName findRenameByField = this._secondary.findRenameByField(mapperConfig, annotatedField, propertyName);
        if (findRenameByField == null) {
            return this._primary.findRenameByField(mapperConfig, annotatedField, propertyName);
        }
        return findRenameByField;
    }

    public PropertyName findRootName(C2021a aVar) {
        PropertyName findRootName;
        PropertyName findRootName2 = this._primary.findRootName(aVar);
        if (findRootName2 == null) {
            return this._secondary.findRootName(aVar);
        }
        if (!findRootName2.hasSimpleName() && (findRootName = this._secondary.findRootName(aVar)) != null) {
            return findRootName;
        }
        return findRootName2;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        Object findSerializationContentConverter = this._primary.findSerializationContentConverter(annotatedMember);
        if (findSerializationContentConverter == null) {
            return this._secondary.findSerializationContentConverter(annotatedMember);
        }
        return findSerializationContentConverter;
    }

    @Deprecated
    public Class<?> findSerializationContentType(C2911nl nlVar, JavaType javaType) {
        Class<?> findSerializationContentType = this._primary.findSerializationContentType(nlVar, javaType);
        if (findSerializationContentType == null) {
            return this._secondary.findSerializationContentType(nlVar, javaType);
        }
        return findSerializationContentType;
    }

    public Object findSerializationConverter(C2911nl nlVar) {
        Object findSerializationConverter = this._primary.findSerializationConverter(nlVar);
        if (findSerializationConverter == null) {
            return this._secondary.findSerializationConverter(nlVar);
        }
        return findSerializationConverter;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusion(C2911nl nlVar, JsonInclude.Include include) {
        return this._primary.findSerializationInclusion(nlVar, this._secondary.findSerializationInclusion(nlVar, include));
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(C2911nl nlVar, JsonInclude.Include include) {
        return this._primary.findSerializationInclusionForContent(nlVar, this._secondary.findSerializationInclusionForContent(nlVar, include));
    }

    @Deprecated
    public Class<?> findSerializationKeyType(C2911nl nlVar, JavaType javaType) {
        Class<?> findSerializationKeyType = this._primary.findSerializationKeyType(nlVar, javaType);
        if (findSerializationKeyType == null) {
            return this._secondary.findSerializationKeyType(nlVar, javaType);
        }
        return findSerializationKeyType;
    }

    public String[] findSerializationPropertyOrder(C2021a aVar) {
        String[] findSerializationPropertyOrder = this._primary.findSerializationPropertyOrder(aVar);
        if (findSerializationPropertyOrder == null) {
            return this._secondary.findSerializationPropertyOrder(aVar);
        }
        return findSerializationPropertyOrder;
    }

    public Boolean findSerializationSortAlphabetically(C2911nl nlVar) {
        Boolean findSerializationSortAlphabetically = this._primary.findSerializationSortAlphabetically(nlVar);
        if (findSerializationSortAlphabetically == null) {
            return this._secondary.findSerializationSortAlphabetically(nlVar);
        }
        return findSerializationSortAlphabetically;
    }

    @Deprecated
    public Class<?> findSerializationType(C2911nl nlVar) {
        Class<?> findSerializationType = this._primary.findSerializationType(nlVar);
        if (findSerializationType == null) {
            return this._secondary.findSerializationType(nlVar);
        }
        return findSerializationType;
    }

    public JsonSerialize.Typing findSerializationTyping(C2911nl nlVar) {
        JsonSerialize.Typing findSerializationTyping = this._primary.findSerializationTyping(nlVar);
        if (findSerializationTyping == null) {
            return this._secondary.findSerializationTyping(nlVar);
        }
        return findSerializationTyping;
    }

    public Object findSerializer(C2911nl nlVar) {
        Class<y63.C3656a> cls = y63.C3656a.class;
        Object findSerializer = this._primary.findSerializer(nlVar);
        if (_isExplicitClassOrOb(findSerializer, cls)) {
            return findSerializer;
        }
        return _explicitClassOrOb(this._secondary.findSerializer(nlVar), cls);
    }

    public JsonSetter.Value findSetterInfo(C2911nl nlVar) {
        JsonSetter.Value findSetterInfo = this._secondary.findSetterInfo(nlVar);
        JsonSetter.Value findSetterInfo2 = this._primary.findSetterInfo(nlVar);
        if (findSetterInfo == null) {
            return findSetterInfo2;
        }
        return findSetterInfo.withOverrides(findSetterInfo2);
    }

    public List<NamedType> findSubtypes(C2911nl nlVar) {
        List<NamedType> findSubtypes = this._primary.findSubtypes(nlVar);
        List<NamedType> findSubtypes2 = this._secondary.findSubtypes(nlVar);
        if (findSubtypes == null || findSubtypes.isEmpty()) {
            return findSubtypes2;
        }
        if (findSubtypes2 == null || findSubtypes2.isEmpty()) {
            return findSubtypes;
        }
        ArrayList arrayList = new ArrayList(findSubtypes.size() + findSubtypes2.size());
        arrayList.addAll(findSubtypes);
        arrayList.addAll(findSubtypes2);
        return arrayList;
    }

    public String findTypeName(C2021a aVar) {
        String findTypeName = this._primary.findTypeName(aVar);
        if (findTypeName == null || findTypeName.isEmpty()) {
            return this._secondary.findTypeName(aVar);
        }
        return findTypeName;
    }

    public l17<?> findTypeResolver(MapperConfig<?> mapperConfig, C2021a aVar, JavaType javaType) {
        l17<?> findTypeResolver = this._primary.findTypeResolver(mapperConfig, aVar, javaType);
        if (findTypeResolver == null) {
            return this._secondary.findTypeResolver(mapperConfig, aVar, javaType);
        }
        return findTypeResolver;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        NameTransformer findUnwrappingNameTransformer = this._primary.findUnwrappingNameTransformer(annotatedMember);
        if (findUnwrappingNameTransformer == null) {
            return this._secondary.findUnwrappingNameTransformer(annotatedMember);
        }
        return findUnwrappingNameTransformer;
    }

    public Object findValueInstantiator(C2021a aVar) {
        Object findValueInstantiator = this._primary.findValueInstantiator(aVar);
        if (findValueInstantiator == null) {
            return this._secondary.findValueInstantiator(aVar);
        }
        return findValueInstantiator;
    }

    public Class<?>[] findViews(C2911nl nlVar) {
        Class<?>[] findViews = this._primary.findViews(nlVar);
        if (findViews == null) {
            return this._secondary.findViews(nlVar);
        }
        return findViews;
    }

    public PropertyName findWrapperName(C2911nl nlVar) {
        PropertyName findWrapperName;
        PropertyName findWrapperName2 = this._primary.findWrapperName(nlVar);
        if (findWrapperName2 == null) {
            return this._secondary.findWrapperName(nlVar);
        }
        if (findWrapperName2 != PropertyName.USE_DEFAULT || (findWrapperName = this._secondary.findWrapperName(nlVar)) == null) {
            return findWrapperName2;
        }
        return findWrapperName;
    }

    public Boolean hasAnyGetter(C2911nl nlVar) {
        Boolean hasAnyGetter = this._primary.hasAnyGetter(nlVar);
        if (hasAnyGetter == null) {
            return this._secondary.hasAnyGetter(nlVar);
        }
        return hasAnyGetter;
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        if (this._primary.hasAnyGetterAnnotation(annotatedMethod) || this._secondary.hasAnyGetterAnnotation(annotatedMethod)) {
            return true;
        }
        return false;
    }

    public Boolean hasAnySetter(C2911nl nlVar) {
        Boolean hasAnySetter = this._primary.hasAnySetter(nlVar);
        if (hasAnySetter == null) {
            return this._secondary.hasAnySetter(nlVar);
        }
        return hasAnySetter;
    }

    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        if (this._primary.hasAnySetterAnnotation(annotatedMethod) || this._secondary.hasAnySetterAnnotation(annotatedMethod)) {
            return true;
        }
        return false;
    }

    public Boolean hasAsKey(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        Boolean hasAsKey = this._primary.hasAsKey(mapperConfig, nlVar);
        if (hasAsKey == null) {
            return this._secondary.hasAsKey(mapperConfig, nlVar);
        }
        return hasAsKey;
    }

    public Boolean hasAsValue(C2911nl nlVar) {
        Boolean hasAsValue = this._primary.hasAsValue(nlVar);
        if (hasAsValue == null) {
            return this._secondary.hasAsValue(nlVar);
        }
        return hasAsValue;
    }

    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        if (this._primary.hasAsValueAnnotation(annotatedMethod) || this._secondary.hasAsValueAnnotation(annotatedMethod)) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean hasCreatorAnnotation(C2911nl nlVar) {
        if (this._primary.hasCreatorAnnotation(nlVar) || this._secondary.hasCreatorAnnotation(nlVar)) {
            return true;
        }
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        if (this._primary.hasIgnoreMarker(annotatedMember) || this._secondary.hasIgnoreMarker(annotatedMember)) {
            return true;
        }
        return false;
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        Boolean hasRequiredMarker = this._primary.hasRequiredMarker(annotatedMember);
        if (hasRequiredMarker == null) {
            return this._secondary.hasRequiredMarker(annotatedMember);
        }
        return hasRequiredMarker;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        if (this._primary.isAnnotationBundle(annotation) || this._secondary.isAnnotationBundle(annotation)) {
            return true;
        }
        return false;
    }

    public Boolean isIgnorableType(C2021a aVar) {
        Boolean isIgnorableType = this._primary.isIgnorableType(aVar);
        if (isIgnorableType == null) {
            return this._secondary.isIgnorableType(aVar);
        }
        return isIgnorableType;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        Boolean isTypeId = this._primary.isTypeId(annotatedMember);
        if (isTypeId == null) {
            return this._secondary.isTypeId(annotatedMember);
        }
        return isTypeId;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, C2911nl nlVar, JavaType javaType) throws JsonMappingException {
        return this._primary.refineDeserializationType(mapperConfig, nlVar, this._secondary.refineDeserializationType(mapperConfig, nlVar, javaType));
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, C2911nl nlVar, JavaType javaType) throws JsonMappingException {
        return this._primary.refineSerializationType(mapperConfig, nlVar, this._secondary.refineSerializationType(mapperConfig, nlVar, javaType));
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        AnnotatedMethod resolveSetterConflict = this._primary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2);
        if (resolveSetterConflict == null) {
            return this._secondary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2);
        }
        return resolveSetterConflict;
    }

    public Version version() {
        return this._primary.version();
    }

    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        this._primary.allIntrospectors(collection);
        this._secondary.allIntrospectors(collection);
        return collection;
    }
}
