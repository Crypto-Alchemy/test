package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

public class StdDelegatingDeserializer<T> extends StdDeserializer<T> implements js0, xe5 {
    private static final long serialVersionUID = 1;
    public final ot0<Object, T> _converter;
    public final o43<Object> _delegateDeserializer;
    public final JavaType _delegateType;

    public StdDelegatingDeserializer(ot0<?, T> ot0) {
        super((Class<?>) Object.class);
        this._converter = ot0;
        this._delegateType = null;
        this._delegateDeserializer = null;
    }

    public Object _handleIncompatibleUpdateValue(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)" + obj.getClass().getName(), new Object[]{this._delegateType}));
    }

    public T convertValue(Object obj) {
        return this._converter.mo23476a(obj);
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        o43<Object> o43 = this._delegateDeserializer;
        if (o43 != null) {
            o43<?> handleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(o43, beanProperty, this._delegateType);
            if (handleSecondaryContextualization != this._delegateDeserializer) {
                return withDelegate(this._converter, this._delegateType, handleSecondaryContextualization);
            }
            return this;
        }
        JavaType b = this._converter.mo23477b(deserializationContext.getTypeFactory());
        return withDelegate(this._converter, b, deserializationContext.findContextualValueDeserializer(b, beanProperty));
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object deserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (deserialize == null) {
            return null;
        }
        return convertValue(deserialize);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        Object deserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (deserialize == null) {
            return null;
        }
        return convertValue(deserialize);
    }

    public o43<?> getDelegatee() {
        return this._delegateDeserializer;
    }

    public Class<?> handledType() {
        return this._delegateDeserializer.handledType();
    }

    public LogicalType logicalType() {
        return this._delegateDeserializer.logicalType();
    }

    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        o43<Object> o43 = this._delegateDeserializer;
        if (o43 != null && (o43 instanceof xe5)) {
            ((xe5) o43).resolve(deserializationContext);
        }
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._delegateDeserializer.supportsUpdate(deserializationConfig);
    }

    public StdDelegatingDeserializer<T> withDelegate(ot0<Object, T> ot0, JavaType javaType, o43<?> o43) {
        wf0.m29527n0(StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer<>(ot0, javaType, o43);
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this._delegateType.getRawClass().isAssignableFrom(obj.getClass())) {
            return this._delegateDeserializer.deserialize(jsonParser, deserializationContext, obj);
        }
        return _handleIncompatibleUpdateValue(jsonParser, deserializationContext, obj);
    }

    public StdDelegatingDeserializer(ot0<Object, T> ot0, JavaType javaType, o43<?> o43) {
        super(javaType);
        this._converter = ot0;
        this._delegateType = javaType;
        this._delegateDeserializer = o43;
    }

    public StdDelegatingDeserializer(StdDelegatingDeserializer<T> stdDelegatingDeserializer) {
        super((StdDeserializer<?>) stdDelegatingDeserializer);
        this._converter = stdDelegatingDeserializer._converter;
        this._delegateType = stdDelegatingDeserializer._delegateType;
        this._delegateDeserializer = stdDelegatingDeserializer._delegateDeserializer;
    }
}
