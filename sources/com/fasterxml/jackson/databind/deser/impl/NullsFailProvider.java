package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

public class NullsFailProvider implements bc4, Serializable {
    private static final long serialVersionUID = 1;
    public final PropertyName _name;
    public final JavaType _type;

    public NullsFailProvider(PropertyName propertyName, JavaType javaType) {
        this._name = propertyName;
        this._type = javaType;
    }

    public static NullsFailProvider constructForProperty(BeanProperty beanProperty) {
        return constructForProperty(beanProperty, beanProperty.getType());
    }

    public static NullsFailProvider constructForRootValue(JavaType javaType) {
        return new NullsFailProvider((PropertyName) null, javaType);
    }

    public /* bridge */ /* synthetic */ Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return ac4.m182a(this, deserializationContext);
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        throw InvalidNullException.from(deserializationContext, this._name, this._type);
    }

    public static NullsFailProvider constructForProperty(BeanProperty beanProperty, JavaType javaType) {
        return new NullsFailProvider(beanProperty.getFullName(), javaType);
    }
}
