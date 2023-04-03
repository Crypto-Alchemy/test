package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.util.Objects;

public abstract class ArraySerializerBase<T> extends ContainerSerializer<T> implements ls0 {
    public final BeanProperty _property;
    public final Boolean _unwrapSingle;

    public ArraySerializerBase(Class<T> cls) {
        super(cls);
        this._property = null;
        this._unwrapSingle = null;
    }

    public final boolean _shouldUnwrapSingle(zw5 zw5) {
        Boolean bool = this._unwrapSingle;
        if (bool == null) {
            return zw5.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
        }
        return bool.booleanValue();
    }

    public abstract y63<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value findFormatOverrides;
        if (!(beanProperty == null || (findFormatOverrides = findFormatOverrides(zw5, beanProperty, handledType())) == null)) {
            Boolean feature = findFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
            if (!Objects.equals(feature, this._unwrapSingle)) {
                return _withResolved(beanProperty, feature);
            }
        }
        return this;
    }

    public void serialize(T t, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (!_shouldUnwrapSingle(zw5) || !hasSingleElement(t)) {
            jsonGenerator.mo13848O0(t);
            serializeContents(t, jsonGenerator, zw5);
            jsonGenerator.mo13853S();
            return;
        }
        serializeContents(t, jsonGenerator, zw5);
    }

    public abstract void serializeContents(T t, JsonGenerator jsonGenerator, zw5 zw5) throws IOException;

    public final void serializeWithType(T t, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(t, JsonToken.START_ARRAY));
        jsonGenerator.mo13895s(t);
        serializeContents(t, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }

    @Deprecated
    public ArraySerializerBase(Class<T> cls, BeanProperty beanProperty) {
        super(cls);
        this._property = beanProperty;
        this._unwrapSingle = null;
    }

    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase) {
        super(arraySerializerBase._handledType, false);
        this._property = arraySerializerBase._property;
        this._unwrapSingle = arraySerializerBase._unwrapSingle;
    }

    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty, Boolean bool) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
        this._unwrapSingle = bool;
    }

    @Deprecated
    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
        this._unwrapSingle = arraySerializerBase._unwrapSingle;
    }
}
