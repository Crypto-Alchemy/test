package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.C2021a;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;

public class AttributePropertyWriter extends VirtualBeanPropertyWriter {
    private static final long serialVersionUID = 1;
    public final String _attrName;

    public AttributePropertyWriter(String str, q00 q00, C2236em emVar, JavaType javaType) {
        this(str, q00, emVar, javaType, q00.mo24879e());
    }

    public static AttributePropertyWriter construct(String str, q00 q00, C2236em emVar, JavaType javaType) {
        return new AttributePropertyWriter(str, q00, emVar, javaType);
    }

    public Object value(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        return zw5.getAttribute(this._attrName);
    }

    public VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, C2021a aVar, q00 q00, JavaType javaType) {
        throw new IllegalStateException("Should not be called on this type");
    }

    public AttributePropertyWriter(String str, q00 q00, C2236em emVar, JavaType javaType, JsonInclude.Value value) {
        super(q00, emVar, javaType, (y63<?>) null, (m17) null, (JavaType) null, value, (Class<?>[]) null);
        this._attrName = str;
    }

    public AttributePropertyWriter(AttributePropertyWriter attributePropertyWriter) {
        super(attributePropertyWriter);
        this._attrName = attributePropertyWriter._attrName;
    }
}
