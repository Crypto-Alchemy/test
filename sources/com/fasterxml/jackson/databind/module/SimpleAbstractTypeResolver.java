package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class SimpleAbstractTypeResolver extends C2805m7 implements Serializable {
    private static final long serialVersionUID = 1;
    public final HashMap<ClassKey, Class<?>> _mappings = new HashMap<>();

    public <T> SimpleAbstractTypeResolver addMapping(Class<T> cls, Class<? extends T> cls2) {
        if (cls == cls2) {
            throw new IllegalArgumentException("Cannot add mapping from class to itself");
        } else if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException("Cannot add mapping from class " + cls.getName() + " to " + cls2.getName() + ", as latter is not a subtype of former");
        } else if (Modifier.isAbstract(cls.getModifiers())) {
            this._mappings.put(new ClassKey(cls), cls2);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot add mapping from class " + cls.getName() + " since it is not abstract");
        }
    }

    public JavaType findTypeMapping(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class cls = this._mappings.get(new ClassKey(javaType.getRawClass()));
        if (cls == null) {
            return null;
        }
        return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, cls);
    }

    @Deprecated
    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        return null;
    }

    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, n00 n00) {
        return null;
    }
}
