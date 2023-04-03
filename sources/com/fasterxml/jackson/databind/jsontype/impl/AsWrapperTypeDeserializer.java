package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;

public class AsWrapperTypeDeserializer extends TypeDeserializerBase {
    private static final long serialVersionUID = 1;

    public AsWrapperTypeDeserializer(JavaType javaType, r07 r07, String str, boolean z, JavaType javaType2) {
        super(javaType, r07, str, z, javaType2);
    }

    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object e0;
        if (jsonParser.mo13961d() && (e0 = jsonParser.mo13963e0()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, e0);
        }
        JsonToken g = jsonParser.mo13965g();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (g == jsonToken) {
            JsonToken N0 = jsonParser.mo13938N0();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (N0 != jsonToken2) {
                JavaType baseType = baseType();
                deserializationContext.reportWrongTokenException(baseType, jsonToken2, "need JSON String that contains type id (for subtype of " + baseTypeName() + ")", new Object[0]);
            }
        } else if (g != JsonToken.FIELD_NAME) {
            JavaType baseType2 = baseType();
            deserializationContext.reportWrongTokenException(baseType2, jsonToken, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + baseTypeName(), new Object[0]);
        }
        String W = jsonParser.mo13947W();
        o43<Object> _findDeserializer = _findDeserializer(deserializationContext, W);
        jsonParser.mo13938N0();
        if (this._typeIdVisible && jsonParser.mo13984s0(jsonToken)) {
            fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            bufferForInputBuffering.mo13852Q0();
            bufferForInputBuffering.mo13864b0(this._typePropertyName);
            bufferForInputBuffering.mo13860Z0(W);
            jsonParser.mo13962e();
            jsonParser = m53.m22020f1(false, bufferForInputBuffering.mo20094z1(jsonParser), jsonParser);
            jsonParser.mo13938N0();
        }
        Object deserialize = _findDeserializer.deserialize(jsonParser, deserializationContext);
        JsonToken N02 = jsonParser.mo13938N0();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (N02 != jsonToken3) {
            deserializationContext.reportWrongTokenException(baseType(), jsonToken3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return deserialize;
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
        return new AsWrapperTypeDeserializer(this, beanProperty);
    }

    public JsonTypeInfo.C1971As getTypeInclusion() {
        return JsonTypeInfo.C1971As.WRAPPER_OBJECT;
    }

    public AsWrapperTypeDeserializer(AsWrapperTypeDeserializer asWrapperTypeDeserializer, BeanProperty beanProperty) {
        super(asWrapperTypeDeserializer, beanProperty);
    }
}
