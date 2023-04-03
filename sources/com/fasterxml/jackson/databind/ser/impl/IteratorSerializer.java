package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.io.IOException;
import java.util.Iterator;

@zz2
public class IteratorSerializer extends AsArraySerializerBase<Iterator<?>> {
    public IteratorSerializer(JavaType javaType, boolean z, m17 m17) {
        super((Class<?>) Iterator.class, javaType, z, m17, (y63<Object>) null);
    }

    public void _serializeDynamicContents(Iterator<?> it, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        y63<Object> y63;
        m17 m17 = this._valueTypeSerializer;
        C2040a aVar = this._dynamicSerializers;
        do {
            Object next = it.next();
            if (next == null) {
                zw5.defaultSerializeNull(jsonGenerator);
            } else {
                Class<?> cls = next.getClass();
                y63<Object> k = aVar.mo16645k(cls);
                if (k == null) {
                    if (this._elementType.hasGenericTypes()) {
                        y63 = _findAndAddDynamic(aVar, zw5.constructSpecializedType(this._elementType, cls), zw5);
                    } else {
                        y63 = _findAndAddDynamic(aVar, cls, zw5);
                    }
                    k = y63;
                    aVar = this._dynamicSerializers;
                }
                if (m17 == null) {
                    k.serialize(next, jsonGenerator, zw5);
                } else {
                    k.serializeWithType(next, jsonGenerator, zw5, m17);
                }
            }
        } while (it.hasNext());
    }

    public ContainerSerializer<?> _withValueTypeSerializer(m17 m17) {
        return new IteratorSerializer(this, this._property, m17, this._elementSerializer, this._unwrapSingle);
    }

    public boolean hasSingleElement(Iterator<?> it) {
        return false;
    }

    public IteratorSerializer(IteratorSerializer iteratorSerializer, BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        super((AsArraySerializerBase<?>) iteratorSerializer, beanProperty, m17, y63, bool);
    }

    public boolean isEmpty(zw5 zw5, Iterator<?> it) {
        return !it.hasNext();
    }

    public final void serialize(Iterator<?> it, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13848O0(it);
        serializeContents(it, jsonGenerator, zw5);
        jsonGenerator.mo13853S();
    }

    public void serializeContents(Iterator<?> it, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (it.hasNext()) {
            y63<Object> y63 = this._elementSerializer;
            if (y63 == null) {
                _serializeDynamicContents(it, jsonGenerator, zw5);
                return;
            }
            m17 m17 = this._valueTypeSerializer;
            do {
                Object next = it.next();
                if (next == null) {
                    zw5.defaultSerializeNull(jsonGenerator);
                } else if (m17 == null) {
                    y63.serialize(next, jsonGenerator, zw5);
                } else {
                    y63.serializeWithType(next, jsonGenerator, zw5, m17);
                }
            } while (it.hasNext());
        }
    }

    public IteratorSerializer withResolved(BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        return new IteratorSerializer(this, beanProperty, m17, y63, bool);
    }
}
