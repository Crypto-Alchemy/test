package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.util.Iterator;

@zz2
public class IterableSerializer extends AsArraySerializerBase<Iterable<?>> {
    public IterableSerializer(JavaType javaType, boolean z, m17 m17) {
        super((Class<?>) Iterable.class, javaType, z, m17, (y63<Object>) null);
    }

    public ContainerSerializer<?> _withValueTypeSerializer(m17 m17) {
        return new IterableSerializer(this, this._property, m17, this._elementSerializer, this._unwrapSingle);
    }

    public IterableSerializer(IterableSerializer iterableSerializer, BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        super((AsArraySerializerBase<?>) iterableSerializer, beanProperty, m17, y63, bool);
    }

    public boolean hasSingleElement(Iterable<?> iterable) {
        if (iterable == null) {
            return false;
        }
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        return !it.hasNext();
    }

    public boolean isEmpty(zw5 zw5, Iterable<?> iterable) {
        return !iterable.iterator().hasNext();
    }

    public final void serialize(Iterable<?> iterable, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (((this._unwrapSingle != null || !zw5.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE) || !hasSingleElement(iterable)) {
            jsonGenerator.mo13848O0(iterable);
            serializeContents(iterable, jsonGenerator, zw5);
            jsonGenerator.mo13853S();
            return;
        }
        serializeContents(iterable, jsonGenerator, zw5);
    }

    public void serializeContents(Iterable<?> iterable, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        y63<Object> y63;
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            m17 m17 = this._valueTypeSerializer;
            Class<?> cls = null;
            y63<Object> y632 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    zw5.defaultSerializeNull(jsonGenerator);
                } else {
                    y63<Object> y633 = this._elementSerializer;
                    if (y633 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            y632 = zw5.findValueSerializer(cls2, this._property);
                            cls = cls2;
                        }
                        y63 = y632;
                    } else {
                        y63<Object> y634 = y633;
                        y63 = y632;
                        y632 = y634;
                    }
                    if (m17 == null) {
                        y632.serialize(next, jsonGenerator, zw5);
                    } else {
                        y632.serializeWithType(next, jsonGenerator, zw5, m17);
                    }
                    y632 = y63;
                }
            } while (it.hasNext());
        }
    }

    public IterableSerializer withResolved(BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        return new IterableSerializer(this, beanProperty, m17, y63, bool);
    }
}
