package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.Closeable;

public class InvalidDefinitionException extends JsonMappingException {
    public transient n00 _beanDesc;
    public transient q00 _property;
    public final JavaType _type;

    public InvalidDefinitionException(JsonParser jsonParser, String str, JavaType javaType) {
        super((Closeable) jsonParser, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, n00 n00, q00 q00) {
        return new InvalidDefinitionException(jsonParser, str, n00, q00);
    }

    public n00 getBeanDescription() {
        return this._beanDesc;
    }

    public q00 getProperty() {
        return this._property;
    }

    public JavaType getType() {
        return this._type;
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonParser, str, javaType);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, n00 n00, q00 q00) {
        return new InvalidDefinitionException(jsonGenerator, str, n00, q00);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonGenerator, str, javaType);
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        super((Closeable) jsonGenerator, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    public InvalidDefinitionException(JsonParser jsonParser, String str, n00 n00, q00 q00) {
        super((Closeable) jsonParser, str);
        JavaType javaType;
        if (n00 == null) {
            javaType = null;
        } else {
            javaType = n00.mo23439A();
        }
        this._type = javaType;
        this._beanDesc = n00;
        this._property = q00;
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, n00 n00, q00 q00) {
        super((Closeable) jsonGenerator, str);
        JavaType javaType;
        if (n00 == null) {
            javaType = null;
        } else {
            javaType = n00.mo23439A();
        }
        this._type = javaType;
        this._beanDesc = n00;
        this._property = q00;
    }
}
