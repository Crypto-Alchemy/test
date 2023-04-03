package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.Type;

public class StdDelegatingSerializer extends StdSerializer<Object> implements ls0, ye5 {
    public final ot0<Object, ?> _converter;
    public final y63<Object> _delegateSerializer;
    public final JavaType _delegateType;

    public StdDelegatingSerializer(ot0<?, ?> ot0) {
        super(Object.class);
        this._converter = ot0;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    public y63<Object> _findSerializer(Object obj, zw5 zw5) throws JsonMappingException {
        return zw5.findValueSerializer(obj.getClass());
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        y63<Object> y63 = this._delegateSerializer;
        if (y63 != null) {
            y63.acceptJsonFormatVisitor(t43, javaType);
        }
    }

    public Object convertValue(Object obj) {
        return this._converter.mo23476a(obj);
    }

    public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        y63 y63 = this._delegateSerializer;
        JavaType javaType = this._delegateType;
        if (y63 == null) {
            if (javaType == null) {
                javaType = this._converter.mo23478c(zw5.getTypeFactory());
            }
            if (!javaType.isJavaLangObject()) {
                y63 = zw5.findValueSerializer(javaType);
            }
        }
        if (y63 instanceof ls0) {
            y63 = zw5.handleSecondaryContextualization(y63, beanProperty);
        }
        if (y63 == this._delegateSerializer && javaType == this._delegateType) {
            return this;
        }
        return withDelegate(this._converter, javaType, y63);
    }

    public ot0<Object, ?> getConverter() {
        return this._converter;
    }

    public y63<?> getDelegatee() {
        return this._delegateSerializer;
    }

    public g53 getSchema(zw5 zw5, Type type) throws JsonMappingException {
        y63<Object> y63 = this._delegateSerializer;
        if (y63 instanceof ym5) {
            return ((ym5) y63).getSchema(zw5, type);
        }
        return super.getSchema(zw5, type);
    }

    public boolean isEmpty(zw5 zw5, Object obj) {
        Object convertValue = convertValue(obj);
        if (convertValue == null) {
            return true;
        }
        y63<Object> y63 = this._delegateSerializer;
        if (y63 != null) {
            return y63.isEmpty(zw5, convertValue);
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    public void resolve(zw5 zw5) throws JsonMappingException {
        y63<Object> y63 = this._delegateSerializer;
        if (y63 != null && (y63 instanceof ye5)) {
            ((ye5) y63).resolve(zw5);
        }
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        Object convertValue = convertValue(obj);
        if (convertValue == null) {
            zw5.defaultSerializeNull(jsonGenerator);
            return;
        }
        y63<Object> y63 = this._delegateSerializer;
        if (y63 == null) {
            y63 = _findSerializer(convertValue, zw5);
        }
        y63.serialize(convertValue, jsonGenerator, zw5);
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        Object convertValue = convertValue(obj);
        y63<Object> y63 = this._delegateSerializer;
        if (y63 == null) {
            y63 = _findSerializer(obj, zw5);
        }
        y63.serializeWithType(convertValue, jsonGenerator, zw5, m17);
    }

    public StdDelegatingSerializer withDelegate(ot0<Object, ?> ot0, JavaType javaType, y63<?> y63) {
        wf0.m29527n0(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(ot0, javaType, y63);
    }

    public g53 getSchema(zw5 zw5, Type type, boolean z) throws JsonMappingException {
        y63<Object> y63 = this._delegateSerializer;
        if (y63 instanceof ym5) {
            return ((ym5) y63).getSchema(zw5, type, z);
        }
        return super.getSchema(zw5, type);
    }

    public <T> StdDelegatingSerializer(Class<T> cls, ot0<T, ?> ot0) {
        super(cls, false);
        this._converter = ot0;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    public StdDelegatingSerializer(ot0<Object, ?> ot0, JavaType javaType, y63<?> y63) {
        super(javaType);
        this._converter = ot0;
        this._delegateType = javaType;
        this._delegateSerializer = y63;
    }
}
