package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;

public class AsExternalTypeDeserializer extends AsArrayTypeDeserializer {
    private static final long serialVersionUID = 1;

    public AsExternalTypeDeserializer(JavaType javaType, r07 r07, String str, boolean z, JavaType javaType2) {
        super(javaType, r07, str, z, javaType2);
    }

    public boolean _usesExternalId() {
        return true;
    }

    public j07 forProperty(BeanProperty beanProperty) {
        if (beanProperty == this._property) {
            return this;
        }
        return new AsExternalTypeDeserializer(this, beanProperty);
    }

    public JsonTypeInfo.C1971As getTypeInclusion() {
        return JsonTypeInfo.C1971As.EXTERNAL_PROPERTY;
    }

    public AsExternalTypeDeserializer(AsExternalTypeDeserializer asExternalTypeDeserializer, BeanProperty beanProperty) {
        super(asExternalTypeDeserializer, beanProperty);
    }
}
