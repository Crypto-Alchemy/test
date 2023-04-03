package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.impl.C2040a;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;

public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements ls0 {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    public transient C2040a _dynamicSerializers;
    public final BeanProperty _property;
    public final JavaType _referredType;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public final NameTransformer _unwrapper;
    public final y63<Object> _valueSerializer;
    public final m17 _valueTypeSerializer;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer$a */
    public static /* synthetic */ class C2052a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10122a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonInclude$Include[] r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10122a = r0
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10122a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10122a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10122a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10122a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10122a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.C2052a.<clinit>():void");
        }
    }

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z, m17 m17, y63<Object> y63) {
        super((JavaType) referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = m17;
        this._valueSerializer = y63;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._dynamicSerializers = C2040a.m14286c();
    }

    public abstract Object _getReferenced(T t);

    public abstract Object _getReferencedIfPresent(T t);

    public abstract boolean _isValuePresent(T t);

    public boolean _useStatic(zw5 zw5, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = zw5.getAnnotationIntrospector();
        if (!(annotationIntrospector == null || beanProperty == null || beanProperty.getMember() == null)) {
            JsonSerialize.Typing findSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (findSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (findSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return zw5.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    /* renamed from: a */
    public final y63<Object> mo16755a(zw5 zw5, Class<?> cls) throws JsonMappingException {
        y63<Object> y63;
        y63<Object> k = this._dynamicSerializers.mo16645k(cls);
        if (k != null) {
            return k;
        }
        if (this._referredType.hasGenericTypes()) {
            y63 = zw5.findPrimaryPropertySerializer(zw5.constructSpecializedType(this._referredType, cls), this._property);
        } else {
            y63 = zw5.findPrimaryPropertySerializer(cls, this._property);
        }
        NameTransformer nameTransformer = this._unwrapper;
        if (nameTransformer != null) {
            y63 = y63.unwrappingSerializer(nameTransformer);
        }
        y63<Object> y632 = y63;
        this._dynamicSerializers = this._dynamicSerializers.mo16644j(cls, y632);
        return y632;
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        y63<Object> y63 = this._valueSerializer;
        if (y63 == null) {
            y63 = mo16756b(t43.mo25637b(), this._referredType, this._property);
            NameTransformer nameTransformer = this._unwrapper;
            if (nameTransformer != null) {
                y63 = y63.unwrappingSerializer(nameTransformer);
            }
        }
        y63.acceptJsonFormatVisitor(t43, this._referredType);
    }

    /* renamed from: b */
    public final y63<Object> mo16756b(zw5 zw5, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return zw5.findPrimaryPropertySerializer(javaType, beanProperty);
    }

    public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        ReferenceTypeSerializer referenceTypeSerializer;
        JsonInclude.Value findPropertyInclusion;
        JsonInclude.Include contentInclusion;
        m17 m17 = this._valueTypeSerializer;
        if (m17 != null) {
            m17 = m17.mo11783a(beanProperty);
        }
        y63 findAnnotatedContentSerializer = findAnnotatedContentSerializer(zw5, beanProperty);
        if (findAnnotatedContentSerializer == null) {
            findAnnotatedContentSerializer = this._valueSerializer;
            if (findAnnotatedContentSerializer != null) {
                findAnnotatedContentSerializer = zw5.handlePrimaryContextualization(findAnnotatedContentSerializer, beanProperty);
            } else if (_useStatic(zw5, beanProperty, this._referredType)) {
                findAnnotatedContentSerializer = mo16756b(zw5, this._referredType, beanProperty);
            }
        }
        if (this._property == beanProperty && this._valueTypeSerializer == m17 && this._valueSerializer == findAnnotatedContentSerializer) {
            referenceTypeSerializer = this;
        } else {
            referenceTypeSerializer = withResolved(beanProperty, m17, findAnnotatedContentSerializer, this._unwrapper);
        }
        if (beanProperty == null || (findPropertyInclusion = beanProperty.findPropertyInclusion(zw5.getConfig(), handledType())) == null || (contentInclusion = findPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            return referenceTypeSerializer;
        }
        int i = C2052a.f10122a[contentInclusion.ordinal()];
        Object obj = null;
        boolean z = true;
        if (i == 1) {
            obj = t00.m27231b(this._referredType);
            if (obj != null && obj.getClass().isArray()) {
                obj = C2103cq.m14359b(obj);
            }
        } else if (i != 2) {
            if (i == 3) {
                obj = MARKER_FOR_EMPTY;
            } else if (i == 4) {
                obj = zw5.includeFilterInstance((q00) null, findPropertyInclusion.getContentFilter());
                if (obj != null) {
                    z = zw5.includeFilterSuppressNulls(obj);
                }
            } else if (i != 5) {
                z = false;
            }
        } else if (this._referredType.isReferenceType()) {
            obj = MARKER_FOR_EMPTY;
        }
        if (this._suppressableValue == obj && this._suppressNulls == z) {
            return referenceTypeSerializer;
        }
        return referenceTypeSerializer.withContentInclusion(obj, z);
    }

    public JavaType getReferredType() {
        return this._referredType;
    }

    public boolean isEmpty(zw5 zw5, T t) {
        if (!_isValuePresent(t)) {
            return true;
        }
        Object _getReferenced = _getReferenced(t);
        if (_getReferenced == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        y63<Object> y63 = this._valueSerializer;
        if (y63 == null) {
            try {
                y63 = mo16755a(zw5, _getReferenced.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        Object obj = this._suppressableValue;
        if (obj == MARKER_FOR_EMPTY) {
            return y63.isEmpty(zw5, _getReferenced);
        }
        return obj.equals(_getReferenced);
    }

    public boolean isUnwrappingSerializer() {
        if (this._unwrapper != null) {
            return true;
        }
        return false;
    }

    public void serialize(T t, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        Object _getReferencedIfPresent = _getReferencedIfPresent(t);
        if (_getReferencedIfPresent != null) {
            y63<Object> y63 = this._valueSerializer;
            if (y63 == null) {
                y63 = mo16755a(zw5, _getReferencedIfPresent.getClass());
            }
            m17 m17 = this._valueTypeSerializer;
            if (m17 != null) {
                y63.serializeWithType(_getReferencedIfPresent, jsonGenerator, zw5, m17);
            } else {
                y63.serialize(_getReferencedIfPresent, jsonGenerator, zw5);
            }
        } else if (this._unwrapper == null) {
            zw5.defaultSerializeNull(jsonGenerator);
        }
    }

    public void serializeWithType(T t, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        Object _getReferencedIfPresent = _getReferencedIfPresent(t);
        if (_getReferencedIfPresent != null) {
            y63<Object> y63 = this._valueSerializer;
            if (y63 == null) {
                y63 = mo16755a(zw5, _getReferencedIfPresent.getClass());
            }
            y63.serializeWithType(_getReferencedIfPresent, jsonGenerator, zw5, m17);
        } else if (this._unwrapper == null) {
            zw5.defaultSerializeNull(jsonGenerator);
        }
    }

    public y63<T> unwrappingSerializer(NameTransformer nameTransformer) {
        y63<Object> y63 = this._valueSerializer;
        if (y63 != null && (y63 = y63.unwrappingSerializer(nameTransformer)) == this._valueSerializer) {
            return this;
        }
        NameTransformer nameTransformer2 = this._unwrapper;
        if (nameTransformer2 != null) {
            nameTransformer = NameTransformer.chainedTransformer(nameTransformer, nameTransformer2);
        }
        if (this._valueSerializer == y63 && this._unwrapper == nameTransformer) {
            return this;
        }
        return withResolved(this._property, this._valueTypeSerializer, y63, nameTransformer);
    }

    public abstract ReferenceTypeSerializer<T> withContentInclusion(Object obj, boolean z);

    public abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, m17 m17, y63<?> y63, NameTransformer nameTransformer);

    public ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, m17 m17, y63<?> y63, NameTransformer nameTransformer, Object obj, boolean z) {
        super((StdSerializer<?>) referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = C2040a.m14286c();
        this._property = beanProperty;
        this._valueTypeSerializer = m17;
        this._valueSerializer = y63;
        this._unwrapper = nameTransformer;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }
}
