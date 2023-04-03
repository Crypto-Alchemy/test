package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

public class BeanSerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 29;

    public BeanSerializer(JavaType javaType, r00 r00, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType, r00, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    @Deprecated
    public static BeanSerializer createDummy(JavaType javaType) {
        return new BeanSerializer(javaType, (r00) null, BeanSerializerBase.NO_PROPS, (BeanPropertyWriter[]) null);
    }

    public BeanSerializerBase asArraySerializer() {
        if (this._objectIdWriter == null && this._anyGetterWriter == null && this._propertyFilterId == null) {
            return new BeanAsArraySerializer(this);
        }
        return this;
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (this._objectIdWriter != null) {
            jsonGenerator.mo13895s(obj);
            _serializeWithObjectId(obj, jsonGenerator, zw5, true);
            return;
        }
        jsonGenerator.mo13854S0(obj);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, zw5);
        } else {
            serializeFields(obj, jsonGenerator, zw5);
        }
        jsonGenerator.mo13855W();
    }

    public String toString() {
        return "BeanSerializer for " + handledType().getName();
    }

    public y63<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer((BeanSerializerBase) this, nameTransformer);
    }

    public BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanSerializer((BeanSerializerBase) this, set, set2);
    }

    public BeanSerializerBase withObjectIdWriter(cf4 cf4) {
        return new BeanSerializer((BeanSerializerBase) this, cf4, this._propertyFilterId);
    }

    public BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return new BeanSerializer((BeanSerializerBase) this, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase);
    }

    public static BeanSerializer createDummy(JavaType javaType, r00 r00) {
        return new BeanSerializer(javaType, r00, BeanSerializerBase.NO_PROPS, (BeanPropertyWriter[]) null);
    }

    public BeanSerializerBase withFilterId(Object obj) {
        return new BeanSerializer((BeanSerializerBase) this, this._objectIdWriter, obj);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, cf4 cf4) {
        super(beanSerializerBase, cf4);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, cf4 cf4, Object obj) {
        super(beanSerializerBase, cf4, obj);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase, set, set2);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase, beanPropertyWriterArr, beanPropertyWriterArr2);
    }
}
