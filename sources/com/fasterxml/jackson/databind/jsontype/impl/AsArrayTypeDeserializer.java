package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;

public class AsArrayTypeDeserializer extends TypeDeserializerBase {
    private static final long serialVersionUID = 1;

    public AsArrayTypeDeserializer(JavaType javaType, r07 r07, String str, boolean z, JavaType javaType2) {
        super(javaType, r07, str, z, javaType2);
    }

    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonToken;
        Object e0;
        if (jsonParser.mo13961d() && (e0 = jsonParser.mo13963e0()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, e0);
        }
        boolean B0 = jsonParser.mo13926B0();
        String _locateTypeId = _locateTypeId(jsonParser, deserializationContext);
        o43<Object> _findDeserializer = _findDeserializer(deserializationContext, _locateTypeId);
        if (this._typeIdVisible && !_usesExternalId() && jsonParser.mo13984s0(JsonToken.START_OBJECT)) {
            fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            bufferForInputBuffering.mo13852Q0();
            bufferForInputBuffering.mo13864b0(this._typePropertyName);
            bufferForInputBuffering.mo13860Z0(_locateTypeId);
            jsonParser.mo13962e();
            jsonParser = m53.m22020f1(false, bufferForInputBuffering.mo20094z1(jsonParser), jsonParser);
            jsonParser.mo13938N0();
        }
        if (B0 && jsonParser.mo13965g() == JsonToken.END_ARRAY) {
            return _findDeserializer.getNullValue(deserializationContext);
        }
        Object deserialize = _findDeserializer.deserialize(jsonParser, deserializationContext);
        if (B0 && jsonParser.mo13938N0() != (jsonToken = JsonToken.END_ARRAY)) {
            deserializationContext.reportWrongTokenException(baseType(), jsonToken, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
        }
        return deserialize;
    }

    public String _locateTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo13926B0()) {
            JsonToken N0 = jsonParser.mo13938N0();
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            if (N0 == jsonToken) {
                String W = jsonParser.mo13947W();
                jsonParser.mo13938N0();
                return W;
            }
            deserializationContext.reportWrongTokenException(baseType(), jsonToken, "need JSON String that contains type id (for subtype of %s)", baseTypeName());
            return null;
        } else if (this._defaultImpl != null) {
            return this._idResolver.mo25315f();
        } else {
            JavaType baseType = baseType();
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            deserializationContext.reportWrongTokenException(baseType, jsonToken2, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + baseTypeName(), new Object[0]);
            return null;
        }
    }

    public boolean _usesExternalId() {
        return false;
    }

    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public j07 forProperty(BeanProperty beanProperty) {
        if (beanProperty == this._property) {
            return this;
        }
        return new AsArrayTypeDeserializer(this, beanProperty);
    }

    public JsonTypeInfo.C1971As getTypeInclusion() {
        return JsonTypeInfo.C1971As.WRAPPER_ARRAY;
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asArrayTypeDeserializer, BeanProperty beanProperty) {
        super(asArrayTypeDeserializer, beanProperty);
    }
}
