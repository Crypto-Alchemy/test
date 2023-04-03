package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.io.IOException;
import java.util.List;

@zz2
public final class IndexedListSerializer extends AsArraySerializerBase<List<?>> {
    private static final long serialVersionUID = 1;

    public IndexedListSerializer(JavaType javaType, boolean z, m17 m17, y63<Object> y63) {
        super((Class<?>) List.class, javaType, z, m17, y63);
    }

    public ContainerSerializer<?> _withValueTypeSerializer(m17 m17) {
        return new IndexedListSerializer(this, this._property, m17, this._elementSerializer, this._unwrapSingle);
    }

    public void serializeContentsUsing(List<?> list, JsonGenerator jsonGenerator, zw5 zw5, y63<Object> y63) throws IOException {
        int size = list.size();
        if (size != 0) {
            m17 m17 = this._valueTypeSerializer;
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj == null) {
                    try {
                        zw5.defaultSerializeNull(jsonGenerator);
                    } catch (Exception e) {
                        wrapAndThrow(zw5, (Throwable) e, (Object) list, i);
                    }
                } else if (m17 == null) {
                    y63.serialize(obj, jsonGenerator, zw5);
                } else {
                    y63.serializeWithType(obj, jsonGenerator, zw5, m17);
                }
            }
        }
    }

    public void serializeTypedContents(List<?> list, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        y63<Object> y63;
        int size = list.size();
        if (size != 0) {
            try {
                m17 m17 = this._valueTypeSerializer;
                C2040a aVar = this._dynamicSerializers;
                for (int i = 0; i < size; i++) {
                    Object obj = list.get(i);
                    if (obj == null) {
                        zw5.defaultSerializeNull(jsonGenerator);
                    } else {
                        Class<?> cls = obj.getClass();
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
                        k.serializeWithType(obj, jsonGenerator, zw5, m17);
                    }
                }
            } catch (Exception e) {
                wrapAndThrow(zw5, (Throwable) e, (Object) list, 0);
            }
        }
    }

    public IndexedListSerializer(IndexedListSerializer indexedListSerializer, BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        super((AsArraySerializerBase<?>) indexedListSerializer, beanProperty, m17, y63, bool);
    }

    public boolean hasSingleElement(List<?> list) {
        return list.size() == 1;
    }

    public boolean isEmpty(zw5 zw5, List<?> list) {
        return list.isEmpty();
    }

    public final void serialize(List<?> list, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        int size = list.size();
        if (size != 1 || ((this._unwrapSingle != null || !zw5.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.mo13850P0(list, size);
            serializeContents(list, jsonGenerator, zw5);
            jsonGenerator.mo13853S();
            return;
        }
        serializeContents(list, jsonGenerator, zw5);
    }

    public void serializeContents(List<?> list, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        y63<Object> y63;
        y63<Object> y632 = this._elementSerializer;
        if (y632 != null) {
            serializeContentsUsing(list, jsonGenerator, zw5, y632);
        } else if (this._valueTypeSerializer != null) {
            serializeTypedContents(list, jsonGenerator, zw5);
        } else {
            int size = list.size();
            if (size != 0) {
                try {
                    C2040a aVar = this._dynamicSerializers;
                    for (int i = 0; i < size; i++) {
                        Object obj = list.get(i);
                        if (obj == null) {
                            zw5.defaultSerializeNull(jsonGenerator);
                        } else {
                            Class<?> cls = obj.getClass();
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
                            k.serialize(obj, jsonGenerator, zw5);
                        }
                    }
                } catch (Exception e) {
                    wrapAndThrow(zw5, (Throwable) e, (Object) list, 0);
                }
            }
        }
    }

    public IndexedListSerializer withResolved(BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        return new IndexedListSerializer(this, beanProperty, m17, y63, bool);
    }
}
