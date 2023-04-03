package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class TypeDeserializerBase extends j07 implements Serializable {
    private static final long serialVersionUID = 1;
    public final JavaType _baseType;
    public final JavaType _defaultImpl;
    public o43<Object> _defaultImplDeserializer;
    public final Map<String, o43<Object>> _deserializers;
    public final r07 _idResolver;
    public final BeanProperty _property;
    public final boolean _typeIdVisible;
    public final String _typePropertyName;

    public TypeDeserializerBase(JavaType javaType, r07 r07, String str, boolean z, JavaType javaType2) {
        this._baseType = javaType;
        this._idResolver = r07;
        this._typePropertyName = wf0.m29499Z(str);
        this._typeIdVisible = z;
        this._deserializers = new ConcurrentHashMap(16, 0.75f, 2);
        this._defaultImpl = javaType2;
        this._property = null;
    }

    @Deprecated
    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeWithNativeTypeId(jsonParser, deserializationContext, jsonParser.mo13963e0());
    }

    public final o43<Object> _findDefaultImplDeserializer(DeserializationContext deserializationContext) throws IOException {
        o43<Object> o43;
        JavaType javaType = this._defaultImpl;
        if (javaType == null) {
            if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return NullifyingDeserializer.instance;
            }
            return null;
        } else if (wf0.m29483J(javaType.getRawClass())) {
            return NullifyingDeserializer.instance;
        } else {
            synchronized (this._defaultImpl) {
                if (this._defaultImplDeserializer == null) {
                    this._defaultImplDeserializer = deserializationContext.findContextualValueDeserializer(this._defaultImpl, this._property);
                }
                o43 = this._defaultImplDeserializer;
            }
            return o43;
        }
    }

    public final o43<Object> _findDeserializer(DeserializationContext deserializationContext, String str) throws IOException {
        o43<Object> o43;
        o43<Object> o432 = this._deserializers.get(str);
        if (o432 == null) {
            JavaType d = this._idResolver.mo25086d(deserializationContext, str);
            if (d == null) {
                o432 = _findDefaultImplDeserializer(deserializationContext);
                if (o432 == null) {
                    JavaType _handleUnknownTypeId = _handleUnknownTypeId(deserializationContext, str);
                    if (_handleUnknownTypeId == null) {
                        return NullifyingDeserializer.instance;
                    }
                    o43 = deserializationContext.findContextualValueDeserializer(_handleUnknownTypeId, this._property);
                }
                this._deserializers.put(str, o432);
            } else {
                JavaType javaType = this._baseType;
                if (javaType != null && javaType.getClass() == d.getClass() && !d.hasGenericTypes()) {
                    try {
                        d = deserializationContext.constructSpecializedType(this._baseType, d.getRawClass());
                    } catch (IllegalArgumentException e) {
                        throw deserializationContext.invalidTypeIdException(this._baseType, str, e.getMessage());
                    }
                }
                o43 = deserializationContext.findContextualValueDeserializer(d, this._property);
            }
            o432 = o43;
            this._deserializers.put(str, o432);
        }
        return o432;
    }

    public JavaType _handleMissingTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        return deserializationContext.handleMissingTypeId(this._baseType, this._idResolver, str);
    }

    public JavaType _handleUnknownTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        String str2;
        String b = this._idResolver.mo25085b();
        if (b == null) {
            str2 = "type ids are not statically known";
        } else {
            str2 = "known type ids = " + b;
        }
        BeanProperty beanProperty = this._property;
        if (beanProperty != null) {
            str2 = String.format("%s (for POJO property '%s')", new Object[]{str2, beanProperty.getName()});
        }
        return deserializationContext.handleUnknownTypeId(this._baseType, str, this._idResolver, str2);
    }

    public JavaType baseType() {
        return this._baseType;
    }

    public String baseTypeName() {
        return this._baseType.getRawClass().getName();
    }

    public abstract j07 forProperty(BeanProperty beanProperty);

    public Class<?> getDefaultImpl() {
        return wf0.m29507d0(this._defaultImpl);
    }

    public final String getPropertyName() {
        return this._typePropertyName;
    }

    public r07 getTypeIdResolver() {
        return this._idResolver;
    }

    public abstract JsonTypeInfo.C1971As getTypeInclusion();

    public boolean hasDefaultImpl() {
        if (this._defaultImpl != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return '[' + getClass().getName() + "; base-type:" + this._baseType + "; id-resolver: " + this._idResolver + ']';
    }

    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        o43<Object> o43;
        if (obj == null) {
            o43 = _findDefaultImplDeserializer(deserializationContext);
            if (o43 == null) {
                return deserializationContext.reportInputMismatch(baseType(), "No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
            }
        } else {
            o43 = _findDeserializer(deserializationContext, obj instanceof String ? (String) obj : String.valueOf(obj));
        }
        return o43.deserialize(jsonParser, deserializationContext);
    }

    public TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this._baseType = typeDeserializerBase._baseType;
        this._idResolver = typeDeserializerBase._idResolver;
        this._typePropertyName = typeDeserializerBase._typePropertyName;
        this._typeIdVisible = typeDeserializerBase._typeIdVisible;
        this._deserializers = typeDeserializerBase._deserializers;
        this._defaultImpl = typeDeserializerBase._defaultImpl;
        this._defaultImplDeserializer = typeDeserializerBase._defaultImplDeserializer;
        this._property = beanProperty;
    }
}
