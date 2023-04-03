package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.p009io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.C2021a;
import com.fasterxml.jackson.databind.introspect.C2029f;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.DefaultBaseTypeLimitingValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public abstract class MapperConfig<T extends MapperConfig<T>> implements C2029f.C2030a, Serializable {
    public static final JsonFormat.Value EMPTY_FORMAT = JsonFormat.Value.empty();
    public static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();
    private static final long serialVersionUID = 2;
    public final BaseSettings _base;
    public final long _mapperFeatures;

    public MapperConfig(BaseSettings baseSettings, long j) {
        this._base = baseSettings;
        this._mapperFeatures = j;
    }

    public static <F extends Enum<F> & no0> int collectFeatureDefaults(Class<F> cls) {
        int i = 0;
        for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
            no0 no0 = (no0) enumR;
            if (no0.enabledByDefault()) {
                i |= no0.getMask();
            }
        }
        return i;
    }

    public final boolean canOverrideAccessModifiers() {
        return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public qw5 compileString(String str) {
        return new SerializedString(str);
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        return getTypeFactory().constructSpecializedType(javaType, cls, true);
    }

    public final JavaType constructType(Class<?> cls) {
        return getTypeFactory().constructType((Type) cls);
    }

    public abstract /* synthetic */ C2029f.C2030a copy();

    public abstract oo0 findConfigOverride(Class<?> cls);

    public abstract /* synthetic */ Class<?> findMixInClassFor(Class<?> cls);

    public abstract PropertyName findRootName(JavaType javaType);

    public abstract PropertyName findRootName(Class<?> cls);

    public final AccessorNamingStrategy.Provider getAccessorNaming() {
        return this._base.getAccessorNaming();
    }

    public abstract Class<?> getActiveView();

    public AnnotationIntrospector getAnnotationIntrospector() {
        if (isEnabled(MapperFeature.USE_ANNOTATIONS)) {
            return this._base.getAnnotationIntrospector();
        }
        return NopAnnotationIntrospector.instance;
    }

    public abstract ContextAttributes getAttributes();

    public Base64Variant getBase64Variant() {
        return this._base.getBase64Variant();
    }

    public C2029f getClassIntrospector() {
        return this._base.getClassIntrospector();
    }

    public abstract oo0 getConfigOverride(Class<?> cls);

    public final DateFormat getDateFormat() {
        return this._base.getDateFormat();
    }

    public abstract JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2);

    public JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2, JsonInclude.Value value) {
        return JsonInclude.Value.mergeAll(value, getConfigOverride(cls).getInclude(), getConfigOverride(cls2).getIncludeAsProperty());
    }

    public abstract Boolean getDefaultMergeable();

    public abstract Boolean getDefaultMergeable(Class<?> cls);

    public abstract JsonFormat.Value getDefaultPropertyFormat(Class<?> cls);

    public abstract JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls);

    public abstract JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls, C2021a aVar);

    public abstract JsonInclude.Value getDefaultPropertyInclusion();

    public abstract JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls);

    public JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls, JsonInclude.Value value) {
        JsonInclude.Value include = getConfigOverride(cls).getInclude();
        if (include != null) {
            return include;
        }
        return value;
    }

    public abstract JsonIncludeProperties.Value getDefaultPropertyInclusions(Class<?> cls, C2021a aVar);

    public abstract JsonSetter.Value getDefaultSetterInfo();

    public final l17<?> getDefaultTyper(JavaType javaType) {
        return this._base.getTypeResolverBuilder();
    }

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker();

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker(Class<?> cls, C2021a aVar);

    public final wk2 getHandlerInstantiator() {
        this._base.getHandlerInstantiator();
        return null;
    }

    public final Locale getLocale() {
        return this._base.getLocale();
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        PolymorphicTypeValidator polymorphicTypeValidator = this._base.getPolymorphicTypeValidator();
        if (polymorphicTypeValidator != LaissezFaireSubTypeValidator.instance || !isEnabled(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) {
            return polymorphicTypeValidator;
        }
        return new DefaultBaseTypeLimitingValidator();
    }

    public final PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._base.getPropertyNamingStrategy();
    }

    public abstract jd6 getSubtypeResolver();

    public final TimeZone getTimeZone() {
        return this._base.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._base.getTypeFactory();
    }

    public boolean hasExplicitTimeZone() {
        return this._base.hasExplicitTimeZone();
    }

    @Deprecated
    public final boolean hasMapperFeatures(int i) {
        long j = (long) i;
        if ((this._mapperFeatures & j) == j) {
            return true;
        }
        return false;
    }

    public n00 introspectClassAnnotations(Class<?> cls) {
        return introspectClassAnnotations(constructType(cls));
    }

    public n00 introspectDirectClassAnnotations(Class<?> cls) {
        return introspectDirectClassAnnotations(constructType(cls));
    }

    public final boolean isAnnotationProcessingEnabled() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return mapperFeature.enabledIn(this._mapperFeatures);
    }

    public final boolean shouldSortPropertiesAlphabetically() {
        return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public r07 typeIdResolverInstance(C2911nl nlVar, Class<? extends r07> cls) {
        getHandlerInstantiator();
        return (r07) wf0.m29522l(cls, canOverrideAccessModifiers());
    }

    public l17<?> typeResolverBuilderInstance(C2911nl nlVar, Class<? extends l17<?>> cls) {
        getHandlerInstantiator();
        return (l17) wf0.m29522l(cls, canOverrideAccessModifiers());
    }

    public abstract boolean useRootWrapping();

    public abstract T with(MapperFeature mapperFeature, boolean z);

    public abstract T with(MapperFeature... mapperFeatureArr);

    public abstract T without(MapperFeature... mapperFeatureArr);

    public final JavaType constructType(j17<?> j17) {
        return getTypeFactory().constructType(j17.getType());
    }

    public n00 introspectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forClassAnnotations(this, javaType, this);
    }

    public final n00 introspectDirectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forDirectClassAnnotations(this, javaType, this);
    }

    public MapperConfig(MapperConfig<T> mapperConfig, long j) {
        this._base = mapperConfig._base;
        this._mapperFeatures = j;
    }

    public MapperConfig(MapperConfig<T> mapperConfig, BaseSettings baseSettings) {
        this._base = baseSettings;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    public MapperConfig(MapperConfig<T> mapperConfig) {
        this._base = mapperConfig._base;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }
}
