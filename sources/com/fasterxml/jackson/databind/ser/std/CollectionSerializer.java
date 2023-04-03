package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.C2040a;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class CollectionSerializer extends AsArraySerializerBase<Collection<?>> {
    private static final long serialVersionUID = 1;

    public CollectionSerializer(JavaType javaType, boolean z, m17 m17, y63<Object> y63) {
        super((Class<?>) Collection.class, javaType, z, m17, y63);
    }

    public ContainerSerializer<?> _withValueTypeSerializer(m17 m17) {
        return new CollectionSerializer(this, this._property, m17, (y63<?>) this._elementSerializer, this._unwrapSingle);
    }

    public void serializeContentsUsing(Collection<?> collection, JsonGenerator jsonGenerator, zw5 zw5, y63<Object> y63) throws IOException {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            m17 m17 = this._valueTypeSerializer;
            int i = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        zw5.defaultSerializeNull(jsonGenerator);
                    } catch (Exception e) {
                        wrapAndThrow(zw5, (Throwable) e, (Object) collection, i);
                    }
                } else if (m17 == null) {
                    y63.serialize(next, jsonGenerator, zw5);
                } else {
                    y63.serializeWithType(next, jsonGenerator, zw5, m17);
                }
                i++;
            } while (it.hasNext());
        }
    }

    @Deprecated
    public CollectionSerializer(JavaType javaType, boolean z, m17 m17, BeanProperty beanProperty, y63<Object> y63) {
        this(javaType, z, m17, y63);
    }

    public boolean hasSingleElement(Collection<?> collection) {
        return collection.size() == 1;
    }

    public boolean isEmpty(zw5 zw5, Collection<?> collection) {
        return collection.isEmpty();
    }

    public final void serialize(Collection<?> collection, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        int size = collection.size();
        if (size != 1 || ((this._unwrapSingle != null || !zw5.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.mo13850P0(collection, size);
            serializeContents(collection, jsonGenerator, zw5);
            jsonGenerator.mo13853S();
            return;
        }
        serializeContents(collection, jsonGenerator, zw5);
    }

    public void serializeContents(Collection<?> collection, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        y63<Object> y63;
        jsonGenerator.mo13895s(collection);
        y63<Object> y632 = this._elementSerializer;
        if (y632 != null) {
            serializeContentsUsing(collection, jsonGenerator, zw5, y632);
            return;
        }
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            C2040a aVar = this._dynamicSerializers;
            m17 m17 = this._valueTypeSerializer;
            int i = 0;
            do {
                try {
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
                    i++;
                } catch (Exception e) {
                    wrapAndThrow(zw5, (Throwable) e, (Object) collection, i);
                    return;
                }
            } while (it.hasNext());
        }
    }

    public CollectionSerializer withResolved(BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        return new CollectionSerializer(this, beanProperty, m17, y63, bool);
    }

    public CollectionSerializer(CollectionSerializer collectionSerializer, BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        super((AsArraySerializerBase<?>) collectionSerializer, beanProperty, m17, y63, bool);
    }
}
