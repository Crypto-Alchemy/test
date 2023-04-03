package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

public class UnwrappingBeanSerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 1;
    public final NameTransformer _nameTransformer;

    public UnwrappingBeanSerializer(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        super(beanSerializerBase, nameTransformer);
        this._nameTransformer = nameTransformer;
    }

    public BeanSerializerBase asArraySerializer() {
        return this;
    }

    public boolean isUnwrappingSerializer() {
        return true;
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13895s(obj);
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, zw5, false);
        } else if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, zw5);
        } else {
            serializeFields(obj, jsonGenerator, zw5);
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        if (zw5.isEnabled(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            zw5.reportBadDefinition((Class<?>) handledType(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        jsonGenerator.mo13895s(obj);
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, zw5, m17);
        } else if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, zw5);
        } else {
            serializeFields(obj, jsonGenerator, zw5);
        }
    }

    public String toString() {
        return "UnwrappingBeanSerializer for " + handledType().getName();
    }

    public y63<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer((BeanSerializerBase) this, nameTransformer);
    }

    public BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new UnwrappingBeanSerializer(this, set, set2);
    }

    public BeanSerializerBase withObjectIdWriter(cf4 cf4) {
        return new UnwrappingBeanSerializer(this, cf4);
    }

    public BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return new UnwrappingBeanSerializer(this, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public BeanSerializerBase withFilterId(Object obj) {
        return new UnwrappingBeanSerializer(this, this._objectIdWriter, obj);
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, cf4 cf4) {
        super((BeanSerializerBase) unwrappingBeanSerializer, cf4);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, cf4 cf4, Object obj) {
        super((BeanSerializerBase) unwrappingBeanSerializer, cf4, obj);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set<String> set) {
        this(unwrappingBeanSerializer, set, (Set<String>) null);
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set<String> set, Set<String> set2) {
        super((BeanSerializerBase) unwrappingBeanSerializer, set, set2);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super((BeanSerializerBase) unwrappingBeanSerializer, beanPropertyWriterArr, beanPropertyWriterArr2);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }
}
