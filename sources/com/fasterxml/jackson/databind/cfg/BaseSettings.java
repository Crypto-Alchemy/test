package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.C2029f;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public final class BaseSettings implements Serializable {

    /* renamed from: a */
    public static final TimeZone f9898a = TimeZone.getTimeZone("UTC");
    private static final long serialVersionUID = 1;
    public final AccessorNamingStrategy.Provider _accessorNaming;
    public final AnnotationIntrospector _annotationIntrospector;
    public final C2029f _classIntrospector;
    public final DateFormat _dateFormat;
    public final Base64Variant _defaultBase64;
    public final wk2 _handlerInstantiator;
    public final Locale _locale;
    public final PropertyNamingStrategy _propertyNamingStrategy;
    public final TimeZone _timeZone;
    public final TypeFactory _typeFactory;
    public final l17<?> _typeResolverBuilder;
    public final PolymorphicTypeValidator _typeValidator;

    public BaseSettings(C2029f fVar, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, l17<?> l17, DateFormat dateFormat, wk2 wk2, Locale locale, TimeZone timeZone, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator, AccessorNamingStrategy.Provider provider) {
        this._classIntrospector = fVar;
        this._annotationIntrospector = annotationIntrospector;
        this._propertyNamingStrategy = propertyNamingStrategy;
        this._typeFactory = typeFactory;
        this._typeResolverBuilder = l17;
        this._dateFormat = dateFormat;
        this._locale = locale;
        this._timeZone = timeZone;
        this._defaultBase64 = base64Variant;
        this._typeValidator = polymorphicTypeValidator;
        this._accessorNaming = provider;
    }

    /* renamed from: a */
    public final DateFormat mo15052a(DateFormat dateFormat, TimeZone timeZone) {
        if (dateFormat instanceof StdDateFormat) {
            return ((StdDateFormat) dateFormat).withTimeZone(timeZone);
        }
        DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(timeZone);
        return dateFormat2;
    }

    public BaseSettings copy() {
        return new BaseSettings(this._classIntrospector.copy(), this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, (wk2) null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public AccessorNamingStrategy.Provider getAccessorNaming() {
        return this._accessorNaming;
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    public Base64Variant getBase64Variant() {
        return this._defaultBase64;
    }

    public C2029f getClassIntrospector() {
        return this._classIntrospector;
    }

    public DateFormat getDateFormat() {
        return this._dateFormat;
    }

    public wk2 getHandlerInstantiator() {
        return null;
    }

    public Locale getLocale() {
        return this._locale;
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        return this._typeValidator;
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._propertyNamingStrategy;
    }

    public TimeZone getTimeZone() {
        TimeZone timeZone = this._timeZone;
        if (timeZone == null) {
            return f9898a;
        }
        return timeZone;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public l17<?> getTypeResolverBuilder() {
        return this._typeResolverBuilder;
    }

    public boolean hasExplicitTimeZone() {
        if (this._timeZone != null) {
            return true;
        }
        return false;
    }

    public BaseSettings with(Locale locale) {
        if (this._locale == locale) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, (wk2) null, locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withAccessorNaming(AccessorNamingStrategy.Provider provider) {
        if (this._accessorNaming == provider) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, (wk2) null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, provider);
    }

    public BaseSettings withAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        if (this._annotationIntrospector == annotationIntrospector) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, (wk2) null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return withAnnotationIntrospector(AnnotationIntrospectorPair.create(this._annotationIntrospector, annotationIntrospector));
    }

    public BaseSettings withClassIntrospector(C2029f fVar) {
        if (this._classIntrospector == fVar) {
            return this;
        }
        return new BaseSettings(fVar, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, (wk2) null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withDateFormat(DateFormat dateFormat) {
        if (this._dateFormat == dateFormat) {
            return this;
        }
        if (dateFormat != null && hasExplicitTimeZone()) {
            dateFormat = mo15052a(dateFormat, this._timeZone);
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, dateFormat, (wk2) null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withHandlerInstantiator(wk2 wk2) {
        return this;
    }

    public BaseSettings withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return withAnnotationIntrospector(AnnotationIntrospectorPair.create(annotationIntrospector, this._annotationIntrospector));
    }

    public BaseSettings withPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        if (this._propertyNamingStrategy == propertyNamingStrategy) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, (wk2) null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withTypeFactory(TypeFactory typeFactory) {
        if (this._typeFactory == typeFactory) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, typeFactory, this._typeResolverBuilder, this._dateFormat, (wk2) null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withTypeResolverBuilder(l17<?> l17) {
        if (this._typeResolverBuilder == l17) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, l17, this._dateFormat, (wk2) null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings with(TimeZone timeZone) {
        TimeZone timeZone2 = timeZone;
        if (timeZone2 == this._timeZone) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, mo15052a(this._dateFormat, timeZone2 == null ? f9898a : timeZone2), (wk2) null, this._locale, timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings with(Base64Variant base64Variant) {
        if (base64Variant == this._defaultBase64) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, (wk2) null, this._locale, this._timeZone, base64Variant, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings with(PolymorphicTypeValidator polymorphicTypeValidator) {
        if (polymorphicTypeValidator == this._typeValidator) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, (wk2) null, this._locale, this._timeZone, this._defaultBase64, polymorphicTypeValidator, this._accessorNaming);
    }

    @Deprecated
    public BaseSettings(C2029f fVar, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, l17<?> l17, DateFormat dateFormat, wk2 wk2, Locale locale, TimeZone timeZone, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator) {
        this(fVar, annotationIntrospector, propertyNamingStrategy, typeFactory, l17, dateFormat, wk2, locale, timeZone, base64Variant, polymorphicTypeValidator, new DefaultAccessorNamingStrategy.Provider());
    }
}
