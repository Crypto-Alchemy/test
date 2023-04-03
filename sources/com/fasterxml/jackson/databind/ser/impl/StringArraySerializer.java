package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import org.web3j.abi.datatypes.Utf8String;

@zz2
public class StringArraySerializer extends ArraySerializerBase<String[]> {

    /* renamed from: d */
    public static final JavaType f10098d = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
    public static final StringArraySerializer instance = new StringArraySerializer();
    public final y63<Object> _elementSerializer;

    public StringArraySerializer() {
        super(String[].class);
        this._elementSerializer = null;
    }

    public y63<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new StringArraySerializer(this, beanProperty, this._elementSerializer, bool);
    }

    public ContainerSerializer<?> _withValueTypeSerializer(m17 m17) {
        return this;
    }

    /* renamed from: a */
    public final void mo16623a(String[] strArr, JsonGenerator jsonGenerator, zw5 zw5, y63<Object> y63) throws IOException {
        for (String str : strArr) {
            if (str == null) {
                zw5.defaultSerializeNull(jsonGenerator);
            } else {
                y63.serialize(str, jsonGenerator, zw5);
            }
        }
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        visitArrayFormat(t43, javaType, JsonFormatTypes.STRING);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<?> createContextual(p000.zw5 r5, com.fasterxml.jackson.databind.BeanProperty r6) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0018
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r5.getAnnotationIntrospector()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r6.getMember()
            if (r2 == 0) goto L_0x0018
            java.lang.Object r1 = r1.findContentSerializer(r2)
            if (r1 == 0) goto L_0x0018
            y63 r1 = r5.serializerInstance(r2, r1)
            goto L_0x0019
        L_0x0018:
            r1 = r0
        L_0x0019:
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r3 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r4.findFormatFeature(r5, r6, r2, r3)
            if (r1 != 0) goto L_0x0025
            y63<java.lang.Object> r1 = r4._elementSerializer
        L_0x0025:
            y63 r1 = r4.findContextualConvertingSerializer(r5, r6, r1)
            if (r1 != 0) goto L_0x0031
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            y63 r1 = r5.findContentValueSerializer((java.lang.Class<?>) r1, (com.fasterxml.jackson.databind.BeanProperty) r6)
        L_0x0031:
            boolean r5 = r4.isDefaultSerializer(r1)
            if (r5 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            y63<java.lang.Object> r5 = r4._elementSerializer
            if (r0 != r5) goto L_0x0046
            java.lang.Boolean r5 = r4._unwrapSingle
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L_0x0046
            return r4
        L_0x0046:
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r5 = new com.fasterxml.jackson.databind.ser.impl.StringArraySerializer
            r5.<init>(r4, r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.createContextual(zw5, com.fasterxml.jackson.databind.BeanProperty):y63");
    }

    public y63<?> getContentSerializer() {
        return this._elementSerializer;
    }

    public JavaType getContentType() {
        return f10098d;
    }

    public g53 getSchema(zw5 zw5, Type type) {
        return createSchemaNode("array", true).set("items", createSchemaNode(Utf8String.TYPE_NAME));
    }

    public boolean hasSingleElement(String[] strArr) {
        return strArr.length == 1;
    }

    public boolean isEmpty(zw5 zw5, String[] strArr) {
        return strArr.length == 0;
    }

    public final void serialize(String[] strArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        int length = strArr.length;
        if (length != 1 || ((this._unwrapSingle != null || !zw5.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.mo13850P0(strArr, length);
            serializeContents(strArr, jsonGenerator, zw5);
            jsonGenerator.mo13853S();
            return;
        }
        serializeContents(strArr, jsonGenerator, zw5);
    }

    public void serializeContents(String[] strArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (r0 != 0) {
            y63<Object> y63 = this._elementSerializer;
            if (y63 != null) {
                mo16623a(strArr, jsonGenerator, zw5, y63);
                return;
            }
            for (String str : strArr) {
                if (str == null) {
                    jsonGenerator.mo13866c0();
                } else {
                    jsonGenerator.mo13860Z0(str);
                }
            }
        }
    }

    public StringArraySerializer(StringArraySerializer stringArraySerializer, BeanProperty beanProperty, y63<?> y63, Boolean bool) {
        super(stringArraySerializer, beanProperty, bool);
        this._elementSerializer = y63;
    }
}
