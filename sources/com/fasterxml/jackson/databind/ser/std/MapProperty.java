package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class MapProperty extends PropertyWriter {

    /* renamed from: a */
    public static final BeanProperty f10118a = new BeanProperty.C1982a();
    private static final long serialVersionUID = 1;
    public Object _key;
    public y63<Object> _keySerializer;
    public final BeanProperty _property;
    public final m17 _typeSerializer;
    public Object _value;
    public y63<Object> _valueSerializer;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MapProperty(p000.m17 r2, com.fasterxml.jackson.databind.BeanProperty r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0005
            com.fasterxml.jackson.databind.PropertyMetadata r0 = com.fasterxml.jackson.databind.PropertyMetadata.STD_REQUIRED_OR_OPTIONAL
            goto L_0x0009
        L_0x0005:
            com.fasterxml.jackson.databind.PropertyMetadata r0 = r3.getMetadata()
        L_0x0009:
            r1.<init>((com.fasterxml.jackson.databind.PropertyMetadata) r0)
            r1._typeSerializer = r2
            if (r3 != 0) goto L_0x0012
            com.fasterxml.jackson.databind.BeanProperty r3 = f10118a
        L_0x0012:
            r1._property = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapProperty.<init>(m17, com.fasterxml.jackson.databind.BeanProperty):void");
    }

    @Deprecated
    public void depositSchemaProperty(ObjectNode objectNode, zw5 zw5) throws JsonMappingException {
    }

    public void depositSchemaProperty(j53 j53, zw5 zw5) throws JsonMappingException {
        this._property.depositSchemaProperty(j53, zw5);
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this._property.getAnnotation(cls);
    }

    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return this._property.getContextAnnotation(cls);
    }

    public PropertyName getFullName() {
        return new PropertyName(getName());
    }

    public AnnotatedMember getMember() {
        return this._property.getMember();
    }

    public String getName() {
        Object obj = this._key;
        if (obj instanceof String) {
            return (String) obj;
        }
        return String.valueOf(obj);
    }

    public JavaType getType() {
        return this._property.getType();
    }

    public Object getValue() {
        return this._value;
    }

    public PropertyName getWrapperName() {
        return this._property.getWrapperName();
    }

    public void reset(Object obj, Object obj2, y63<Object> y63, y63<Object> y632) {
        this._key = obj;
        this._value = obj2;
        this._keySerializer = y63;
        this._valueSerializer = y632;
    }

    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        m17 m17 = this._typeSerializer;
        if (m17 == null) {
            this._valueSerializer.serialize(this._value, jsonGenerator, zw5);
        } else {
            this._valueSerializer.serializeWithType(this._value, jsonGenerator, zw5, m17);
        }
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        this._keySerializer.serialize(this._key, jsonGenerator, zw5);
        m17 m17 = this._typeSerializer;
        if (m17 == null) {
            this._valueSerializer.serialize(this._value, jsonGenerator, zw5);
        } else {
            this._valueSerializer.serializeWithType(this._value, jsonGenerator, zw5, m17);
        }
    }

    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        if (!jsonGenerator.mo13871e()) {
            jsonGenerator.mo13900x0(getName());
        }
    }

    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        jsonGenerator.mo13866c0();
    }

    public void setValue(Object obj) {
        this._value = obj;
    }

    @Deprecated
    public void reset(Object obj, y63<Object> y63, y63<Object> y632) {
        reset(obj, this._value, y63, y632);
    }
}
