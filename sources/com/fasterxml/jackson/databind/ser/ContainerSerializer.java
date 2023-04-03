package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public abstract class ContainerSerializer<T> extends StdSerializer<T> {
    public ContainerSerializer(Class<T> cls) {
        super(cls);
    }

    public abstract ContainerSerializer<?> _withValueTypeSerializer(m17 m17);

    public abstract y63<?> getContentSerializer();

    public abstract JavaType getContentType();

    @Deprecated
    public boolean hasContentTypeAnnotation(zw5 zw5, BeanProperty beanProperty) {
        return false;
    }

    public abstract boolean hasSingleElement(T t);

    public ContainerSerializer<?> withValueTypeSerializer(m17 m17) {
        if (m17 == null) {
            return this;
        }
        return _withValueTypeSerializer(m17);
    }

    public ContainerSerializer(JavaType javaType) {
        super(javaType);
    }

    public ContainerSerializer(Class<?> cls, boolean z) {
        super(cls, z);
    }

    public ContainerSerializer(ContainerSerializer<?> containerSerializer) {
        super(containerSerializer._handledType, false);
    }
}
