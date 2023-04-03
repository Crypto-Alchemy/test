package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

public class BeanAsArraySerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 1;
    public final BeanSerializerBase _defaultSerializer;

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase, (cf4) null);
        this._defaultSerializer = beanSerializerBase;
    }

    public BeanSerializerBase asArraySerializer() {
        return this;
    }

    /* renamed from: b */
    public final boolean mo16586b(zw5 zw5) {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this._filteredProps == null || zw5.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        if (beanPropertyWriterArr.length == 1) {
            return true;
        }
        return false;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (!zw5.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || !mo16586b(zw5)) {
            jsonGenerator.mo13848O0(obj);
            serializeAsArray(obj, jsonGenerator, zw5);
            jsonGenerator.mo13853S();
            return;
        }
        serializeAsArray(obj, jsonGenerator, zw5);
    }

    public final void serializeAsArray(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this._filteredProps == null || zw5.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        try {
            for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                if (beanPropertyWriter == null) {
                    jsonGenerator.mo13866c0();
                } else {
                    beanPropertyWriter.serializeAsElement(obj, jsonGenerator, zw5);
                }
            }
        } catch (Exception e) {
            wrapAndThrow(zw5, (Throwable) e, obj, beanPropertyWriterArr[0].getName());
        } catch (StackOverflowError e2) {
            JsonMappingException from = JsonMappingException.from(jsonGenerator, "Infinite recursion (StackOverflowError)", (Throwable) e2);
            from.prependPath(obj, beanPropertyWriterArr[0].getName());
            throw from;
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, zw5, m17);
            return;
        }
        WritableTypeId _typeIdDef = _typeIdDef(m17, obj, JsonToken.START_ARRAY);
        m17.mo16712g(jsonGenerator, _typeIdDef);
        jsonGenerator.mo13895s(obj);
        serializeAsArray(obj, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, _typeIdDef);
    }

    public String toString() {
        return "BeanAsArraySerializer for " + handledType().getName();
    }

    public y63<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return this._defaultSerializer.unwrappingSerializer(nameTransformer);
    }

    public BeanSerializerBase withObjectIdWriter(cf4 cf4) {
        return this._defaultSerializer.withObjectIdWriter(cf4);
    }

    public BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return this;
    }

    public BeanAsArraySerializer withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanAsArraySerializer((BeanSerializerBase) this, set, set2);
    }

    public BeanSerializerBase withFilterId(Object obj) {
        return new BeanAsArraySerializer((BeanSerializerBase) this, this._objectIdWriter, obj);
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set<String> set) {
        this(beanSerializerBase, set, (Set<String>) null);
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase, set, set2);
        this._defaultSerializer = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, cf4 cf4, Object obj) {
        super(beanSerializerBase, cf4, obj);
        this._defaultSerializer = beanSerializerBase;
    }
}
