package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetSerializer extends AsArraySerializerBase<EnumSet<? extends Enum<?>>> {
    public EnumSetSerializer(JavaType javaType) {
        super((Class<?>) EnumSet.class, javaType, true, (m17) null, (y63<Object>) null);
    }

    public EnumSetSerializer _withValueTypeSerializer(m17 m17) {
        return this;
    }

    public EnumSetSerializer(EnumSetSerializer enumSetSerializer, BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        super((AsArraySerializerBase<?>) enumSetSerializer, beanProperty, m17, y63, bool);
    }

    public boolean hasSingleElement(EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.size() == 1;
    }

    public boolean isEmpty(zw5 zw5, EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.isEmpty();
    }

    public final void serialize(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        int size = enumSet.size();
        if (size != 1 || ((this._unwrapSingle != null || !zw5.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.mo13850P0(enumSet, size);
            serializeContents(enumSet, jsonGenerator, zw5);
            jsonGenerator.mo13853S();
            return;
        }
        serializeContents(enumSet, jsonGenerator, zw5);
    }

    public void serializeContents(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        y63<Object> y63 = this._elementSerializer;
        Iterator<? extends Enum<?>> it = enumSet.iterator();
        while (it.hasNext()) {
            Enum enumR = (Enum) it.next();
            if (y63 == null) {
                y63 = zw5.findContentValueSerializer((Class<?>) enumR.getDeclaringClass(), this._property);
            }
            y63.serialize(enumR, jsonGenerator, zw5);
        }
    }

    public EnumSetSerializer withResolved(BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        return new EnumSetSerializer(this, beanProperty, m17, y63, bool);
    }
}
