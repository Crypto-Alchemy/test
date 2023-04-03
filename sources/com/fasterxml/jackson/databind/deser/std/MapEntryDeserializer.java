package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

@zz2
public class MapEntryDeserializer extends ContainerDeserializerBase<Map.Entry<Object, Object>> implements js0 {
    private static final long serialVersionUID = 1;
    public final ha3 _keyDeserializer;
    public final o43<Object> _valueDeserializer;
    public final j07 _valueTypeDeserializer;

    public MapEntryDeserializer(JavaType javaType, ha3 ha3, o43<Object> o43, j07 j07) {
        super(javaType);
        if (javaType.containedTypeCount() == 2) {
            this._keyDeserializer = ha3;
            this._valueDeserializer = o43;
            this._valueTypeDeserializer = j07;
            return;
        }
        throw new IllegalArgumentException("Missing generic type information for " + javaType);
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        o43 o43;
        ha3 ha3 = this._keyDeserializer;
        if (ha3 == null) {
            ha3 = deserializationContext.findKeyDeserializer(this._containerType.containedType(0), beanProperty);
        } else if (ha3 instanceof ks0) {
            ha3 = ((ks0) ha3).createContextual(deserializationContext, beanProperty);
        }
        o43 findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        JavaType containedType = this._containerType.containedType(1);
        if (findConvertingContentDeserializer == null) {
            o43 = deserializationContext.findContextualValueDeserializer(containedType, beanProperty);
        } else {
            o43 = deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, containedType);
        }
        j07 j07 = this._valueTypeDeserializer;
        if (j07 != null) {
            j07 = j07.forProperty(beanProperty);
        }
        return withResolved(ha3, j07, o43);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return j07.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public o43<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public JavaType getContentType() {
        return this._containerType.containedType(1);
    }

    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    public MapEntryDeserializer withResolved(ha3 ha3, j07 j07, o43<?> o43) {
        if (this._keyDeserializer == ha3 && this._valueDeserializer == o43 && this._valueTypeDeserializer == j07) {
            return this;
        }
        return new MapEntryDeserializer(this, ha3, (o43<Object>) o43, j07);
    }

    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        JsonToken g = jsonParser.mo13965g();
        if (g == JsonToken.START_OBJECT) {
            g = jsonParser.mo13938N0();
        } else if (!(g == JsonToken.FIELD_NAME || g == JsonToken.END_OBJECT)) {
            if (g == JsonToken.START_ARRAY) {
                return (Map.Entry) _deserializeFromArray(jsonParser, deserializationContext);
            }
            return (Map.Entry) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
        if (g == JsonToken.FIELD_NAME) {
            ha3 ha3 = this._keyDeserializer;
            o43<Object> o43 = this._valueDeserializer;
            j07 j07 = this._valueTypeDeserializer;
            String f = jsonParser.mo13964f();
            Object deserializeKey = ha3.deserializeKey(f, deserializationContext);
            try {
                if (jsonParser.mo13938N0() == JsonToken.VALUE_NULL) {
                    obj = o43.getNullValue(deserializationContext);
                } else if (j07 == null) {
                    obj = o43.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = o43.deserializeWithType(jsonParser, deserializationContext, j07);
                }
            } catch (Exception e) {
                wrapAndThrow(deserializationContext, e, Map.Entry.class, f);
                obj = null;
            }
            JsonToken N0 = jsonParser.mo13938N0();
            if (N0 == JsonToken.END_OBJECT) {
                return new AbstractMap.SimpleEntry(deserializeKey, obj);
            }
            if (N0 == JsonToken.FIELD_NAME) {
                deserializationContext.reportInputMismatch((o43<?>) this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", jsonParser.mo13964f());
            } else {
                deserializationContext.reportInputMismatch((o43<?>) this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + N0, new Object[0]);
            }
            return null;
        } else if (g == JsonToken.END_OBJECT) {
            return (Map.Entry) deserializationContext.reportInputMismatch((o43<?>) this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
        } else {
            return (Map.Entry) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
    }

    public MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer) {
        super((ContainerDeserializerBase<?>) mapEntryDeserializer);
        this._keyDeserializer = mapEntryDeserializer._keyDeserializer;
        this._valueDeserializer = mapEntryDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapEntryDeserializer._valueTypeDeserializer;
    }

    public MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer, ha3 ha3, o43<Object> o43, j07 j07) {
        super((ContainerDeserializerBase<?>) mapEntryDeserializer);
        this._keyDeserializer = ha3;
        this._valueDeserializer = o43;
        this._valueTypeDeserializer = j07;
    }

    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map.Entry<Object, Object> entry) throws IOException {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }
}
