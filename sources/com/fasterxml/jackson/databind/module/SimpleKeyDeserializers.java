package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;

public class SimpleKeyDeserializers implements ia3, Serializable {
    private static final long serialVersionUID = 1;
    public HashMap<ClassKey, ha3> _classMappings = null;

    public SimpleKeyDeserializers addDeserializer(Class<?> cls, ha3 ha3) {
        if (this._classMappings == null) {
            this._classMappings = new HashMap<>();
        }
        this._classMappings.put(new ClassKey(cls), ha3);
        return this;
    }

    public ha3 findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, n00 n00) {
        HashMap<ClassKey, ha3> hashMap = this._classMappings;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(new ClassKey(javaType.getRawClass()));
    }
}
