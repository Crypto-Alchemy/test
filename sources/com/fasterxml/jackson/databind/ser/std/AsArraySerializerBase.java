package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.C2040a;
import java.io.IOException;
import java.lang.reflect.Type;

public abstract class AsArraySerializerBase<T> extends ContainerSerializer<T> implements ls0 {
    public C2040a _dynamicSerializers;
    public final y63<Object> _elementSerializer;
    public final JavaType _elementType;
    public final BeanProperty _property;
    public final boolean _staticTyping;
    public final Boolean _unwrapSingle;
    public final m17 _valueTypeSerializer;

    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z, m17 m17, y63<Object> y63) {
        this(cls, javaType, z, m17, (BeanProperty) null, y63, (Boolean) null);
    }

    public final y63<Object> _findAndAddDynamic(C2040a aVar, Class<?> cls, zw5 zw5) throws JsonMappingException {
        C2040a.C2044d i = aVar.mo16643i(cls, zw5, this._property);
        C2040a aVar2 = i.f10110b;
        if (aVar != aVar2) {
            this._dynamicSerializers = aVar2;
        }
        return i.f10109a;
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        y63<Object> y63 = this._elementSerializer;
        if (y63 == null && this._elementType != null) {
            y63 = t43.mo25637b().findContentValueSerializer(this._elementType, this._property);
        }
        visitArrayFormat(t43, javaType, y63, this._elementType);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<?> createContextual(p000.zw5 r6, com.fasterxml.jackson.databind.BeanProperty r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            m17 r0 = r5._valueTypeSerializer
            if (r0 == 0) goto L_0x0008
            m17 r0 = r0.mo11783a(r7)
        L_0x0008:
            r1 = 0
            if (r7 == 0) goto L_0x0020
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r6.getAnnotationIntrospector()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r3 = r7.getMember()
            if (r3 == 0) goto L_0x0020
            java.lang.Object r2 = r2.findContentSerializer(r3)
            if (r2 == 0) goto L_0x0020
            y63 r2 = r6.serializerInstance(r3, r2)
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            java.lang.Class r3 = r5.handledType()
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r5.findFormatOverrides(r6, r7, r3)
            if (r3 == 0) goto L_0x0031
            com.fasterxml.jackson.annotation.JsonFormat$Feature r1 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r3.getFeature(r1)
        L_0x0031:
            if (r2 != 0) goto L_0x0035
            y63<java.lang.Object> r2 = r5._elementSerializer
        L_0x0035:
            y63 r2 = r5.findContextualConvertingSerializer(r6, r7, r2)
            if (r2 != 0) goto L_0x004f
            com.fasterxml.jackson.databind.JavaType r3 = r5._elementType
            if (r3 == 0) goto L_0x004f
            boolean r4 = r5._staticTyping
            if (r4 == 0) goto L_0x004f
            boolean r3 = r3.isJavaLangObject()
            if (r3 != 0) goto L_0x004f
            com.fasterxml.jackson.databind.JavaType r2 = r5._elementType
            y63 r2 = r6.findContentValueSerializer((com.fasterxml.jackson.databind.JavaType) r2, (com.fasterxml.jackson.databind.BeanProperty) r7)
        L_0x004f:
            y63<java.lang.Object> r6 = r5._elementSerializer
            if (r2 != r6) goto L_0x0065
            com.fasterxml.jackson.databind.BeanProperty r6 = r5._property
            if (r7 != r6) goto L_0x0065
            m17 r6 = r5._valueTypeSerializer
            if (r6 != r0) goto L_0x0065
            java.lang.Boolean r6 = r5._unwrapSingle
            boolean r6 = java.util.Objects.equals(r6, r1)
            if (r6 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            return r5
        L_0x0065:
            com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase r6 = r5.withResolved(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase.createContextual(zw5, com.fasterxml.jackson.databind.BeanProperty):y63");
    }

    public y63<?> getContentSerializer() {
        return this._elementSerializer;
    }

    public JavaType getContentType() {
        return this._elementType;
    }

    public g53 getSchema(zw5 zw5, Type type) throws JsonMappingException {
        ObjectNode createSchemaNode = createSchemaNode("array", true);
        y63<Object> y63 = this._elementSerializer;
        if (y63 != null) {
            g53 g53 = null;
            if (y63 instanceof ym5) {
                g53 = ((ym5) y63).getSchema(zw5, (Type) null);
            }
            if (g53 == null) {
                g53 = u63.m28093a();
            }
            createSchemaNode.set("items", g53);
        }
        return createSchemaNode;
    }

    public void serialize(T t, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (!zw5.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || !hasSingleElement(t)) {
            jsonGenerator.mo13848O0(t);
            serializeContents(t, jsonGenerator, zw5);
            jsonGenerator.mo13853S();
            return;
        }
        serializeContents(t, jsonGenerator, zw5);
    }

    public abstract void serializeContents(T t, JsonGenerator jsonGenerator, zw5 zw5) throws IOException;

    public void serializeWithType(T t, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(t, JsonToken.START_ARRAY));
        jsonGenerator.mo13895s(t);
        serializeContents(t, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }

    @Deprecated
    public final AsArraySerializerBase<T> withResolved(BeanProperty beanProperty, m17 m17, y63<?> y63) {
        return withResolved(beanProperty, m17, y63, this._unwrapSingle);
    }

    public abstract AsArraySerializerBase<T> withResolved(BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool);

    @Deprecated
    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z, m17 m17, BeanProperty beanProperty, y63<Object> y63) {
        this(cls, javaType, z, m17, beanProperty, y63, (Boolean) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z, m17 m17, BeanProperty beanProperty, y63<?> y63, Boolean bool) {
        super(cls, false);
        boolean z2 = false;
        this._elementType = javaType;
        if (z || (javaType != null && javaType.isFinal())) {
            z2 = true;
        }
        this._staticTyping = z2;
        this._valueTypeSerializer = m17;
        this._property = beanProperty;
        this._elementSerializer = y63;
        this._dynamicSerializers = C2040a.m14286c();
        this._unwrapSingle = bool;
    }

    public final y63<Object> _findAndAddDynamic(C2040a aVar, JavaType javaType, zw5 zw5) throws JsonMappingException {
        C2040a.C2044d h = aVar.mo16642h(javaType, zw5, this._property);
        C2040a aVar2 = h.f10110b;
        if (aVar != aVar2) {
            this._dynamicSerializers = aVar2;
        }
        return h.f10109a;
    }

    public AsArraySerializerBase(AsArraySerializerBase<?> asArraySerializerBase, BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        super((ContainerSerializer<?>) asArraySerializerBase);
        this._elementType = asArraySerializerBase._elementType;
        this._staticTyping = asArraySerializerBase._staticTyping;
        this._valueTypeSerializer = m17;
        this._property = beanProperty;
        this._elementSerializer = y63;
        this._dynamicSerializers = C2040a.m14286c();
        this._unwrapSingle = bool;
    }

    @Deprecated
    public AsArraySerializerBase(AsArraySerializerBase<?> asArraySerializerBase, BeanProperty beanProperty, m17 m17, y63<?> y63) {
        this(asArraySerializerBase, beanProperty, m17, y63, asArraySerializerBase._unwrapSingle);
    }
}
