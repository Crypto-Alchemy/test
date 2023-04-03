package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import java.io.IOException;

public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer {
    private static final long serialVersionUID = 1;
    public final JsonTypeInfo.C1971As _inclusion;
    public final String _msgForMissingId;

    public AsPropertyTypeDeserializer(JavaType javaType, r07 r07, String str, boolean z, JavaType javaType2) {
        this(javaType, r07, str, z, javaType2, JsonTypeInfo.C1971As.PROPERTY);
    }

    public Object _deserializeTypedForId(JsonParser jsonParser, DeserializationContext deserializationContext, fr6 fr6, String str) throws IOException {
        o43<Object> _findDeserializer = _findDeserializer(deserializationContext, str);
        if (this._typeIdVisible) {
            if (fr6 == null) {
                fr6 = deserializationContext.bufferForInputBuffering(jsonParser);
            }
            fr6.mo13864b0(jsonParser.mo13964f());
            fr6.mo13860Z0(str);
        }
        if (fr6 != null) {
            jsonParser.mo13962e();
            jsonParser = m53.m22020f1(false, fr6.mo20094z1(jsonParser), jsonParser);
        }
        if (jsonParser.mo13965g() != JsonToken.END_OBJECT) {
            jsonParser.mo13938N0();
        }
        return _findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    @Deprecated
    public Object _deserializeTypedUsingDefaultImpl(JsonParser jsonParser, DeserializationContext deserializationContext, fr6 fr6) throws IOException {
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, fr6, (String) null);
    }

    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo13984s0(JsonToken.START_ARRAY)) {
            return super.deserializeTypedFromArray(jsonParser, deserializationContext);
        }
        return deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String k0;
        Object e0;
        if (jsonParser.mo13961d() && (e0 = jsonParser.mo13963e0()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, e0);
        }
        JsonToken g = jsonParser.mo13965g();
        fr6 fr6 = null;
        if (g == JsonToken.START_OBJECT) {
            g = jsonParser.mo13938N0();
        } else if (g != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, (fr6) null, this._msgForMissingId);
        }
        boolean isEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (g == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            jsonParser.mo13938N0();
            if ((f.equals(this._typePropertyName) || (isEnabled && f.equalsIgnoreCase(this._typePropertyName))) && (k0 = jsonParser.mo13974k0()) != null) {
                return _deserializeTypedForId(jsonParser, deserializationContext, fr6, k0);
            }
            if (fr6 == null) {
                fr6 = deserializationContext.bufferForInputBuffering(jsonParser);
            }
            fr6.mo13864b0(f);
            fr6.mo20074B1(jsonParser);
            g = jsonParser.mo13938N0();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, fr6, this._msgForMissingId);
    }

    public j07 forProperty(BeanProperty beanProperty) {
        if (beanProperty == this._property) {
            return this;
        }
        return new AsPropertyTypeDeserializer(this, beanProperty);
    }

    public JsonTypeInfo.C1971As getTypeInclusion() {
        return this._inclusion;
    }

    public AsPropertyTypeDeserializer(JavaType javaType, r07 r07, String str, boolean z, JavaType javaType2, JsonTypeInfo.C1971As as) {
        super(javaType, r07, str, z, javaType2);
        String str2;
        BeanProperty beanProperty = this._property;
        if (beanProperty == null) {
            str2 = String.format("missing type id property '%s'", new Object[]{this._typePropertyName});
        } else {
            str2 = String.format("missing type id property '%s' (for POJO property '%s')", new Object[]{this._typePropertyName, beanProperty.getName()});
        }
        this._msgForMissingId = str2;
        this._inclusion = as;
    }

    public Object _deserializeTypedUsingDefaultImpl(JsonParser jsonParser, DeserializationContext deserializationContext, fr6 fr6, String str) throws IOException {
        if (!hasDefaultImpl()) {
            Object deserializeIfNatural = j07.deserializeIfNatural(jsonParser, deserializationContext, this._baseType);
            if (deserializeIfNatural != null) {
                return deserializeIfNatural;
            }
            if (jsonParser.mo13926B0()) {
                return super.deserializeTypedFromAny(jsonParser, deserializationContext);
            }
            if (jsonParser.mo13984s0(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.mo13947W().trim().isEmpty()) {
                return null;
            }
        }
        o43<Object> _findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
        if (_findDefaultImplDeserializer == null) {
            JavaType _handleMissingTypeId = _handleMissingTypeId(deserializationContext, str);
            if (_handleMissingTypeId == null) {
                return null;
            }
            _findDefaultImplDeserializer = deserializationContext.findContextualValueDeserializer(_handleMissingTypeId, this._property);
        }
        if (fr6 != null) {
            fr6.mo13855W();
            jsonParser = fr6.mo20094z1(jsonParser);
            jsonParser.mo13938N0();
        }
        return _findDefaultImplDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, BeanProperty beanProperty) {
        super(asPropertyTypeDeserializer, beanProperty);
        String str;
        BeanProperty beanProperty2 = this._property;
        if (beanProperty2 == null) {
            str = String.format("missing type id property '%s'", new Object[]{this._typePropertyName});
        } else {
            str = String.format("missing type id property '%s' (for POJO property '%s')", new Object[]{this._typePropertyName, beanProperty2.getName()});
        }
        this._msgForMissingId = str;
        this._inclusion = asPropertyTypeDeserializer._inclusion;
    }
}
