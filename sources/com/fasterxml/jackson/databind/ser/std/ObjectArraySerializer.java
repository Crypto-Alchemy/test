package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.C2040a;
import java.io.IOException;
import java.util.Objects;

@zz2
public class ObjectArraySerializer extends ArraySerializerBase<Object[]> {
    public C2040a _dynamicSerializers;
    public y63<Object> _elementSerializer;
    public final JavaType _elementType;
    public final boolean _staticTyping;
    public final m17 _valueTypeSerializer;

    public ObjectArraySerializer(JavaType javaType, boolean z, m17 m17, y63<Object> y63) {
        super(Object[].class);
        this._elementType = javaType;
        this._staticTyping = z;
        this._valueTypeSerializer = m17;
        this._dynamicSerializers = C2040a.m14286c();
        this._elementSerializer = y63;
    }

    public final y63<Object> _findAndAddDynamic(C2040a aVar, Class<?> cls, zw5 zw5) throws JsonMappingException {
        C2040a.C2044d i = aVar.mo16643i(cls, zw5, this._property);
        C2040a aVar2 = i.f10110b;
        if (aVar != aVar2) {
            this._dynamicSerializers = aVar2;
        }
        return i.f10109a;
    }

    public y63<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new ObjectArraySerializer(this, beanProperty, this._valueTypeSerializer, this._elementSerializer, bool);
    }

    public ContainerSerializer<?> _withValueTypeSerializer(m17 m17) {
        return new ObjectArraySerializer(this._elementType, this._staticTyping, m17, this._elementSerializer);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        e43 m = t43.mo26059m(javaType);
        if (m != null) {
            JavaType javaType2 = this._elementType;
            y63<Object> y63 = this._elementSerializer;
            if (y63 == null) {
                y63 = t43.mo25637b().findContentValueSerializer(javaType2, this._property);
            }
            m.mo19120f(y63, javaType2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
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
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r7.getMember()
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r6.getAnnotationIntrospector()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r3 = r3.findContentSerializer(r2)
            if (r3 == 0) goto L_0x0020
            y63 r2 = r6.serializerInstance(r2, r3)
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
            com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer r6 = r5.withResolved(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.createContextual(zw5, com.fasterxml.jackson.databind.BeanProperty):y63");
    }

    public y63<?> getContentSerializer() {
        return this._elementSerializer;
    }

    public JavaType getContentType() {
        return this._elementType;
    }

    public void serializeContentsUsing(Object[] objArr, JsonGenerator jsonGenerator, zw5 zw5, y63<Object> y63) throws IOException {
        int length = objArr.length;
        m17 m17 = this._valueTypeSerializer;
        int i = 0;
        Object obj = null;
        while (i < length) {
            try {
                obj = objArr[i];
                if (obj == null) {
                    zw5.defaultSerializeNull(jsonGenerator);
                } else if (m17 == null) {
                    y63.serialize(obj, jsonGenerator, zw5);
                } else {
                    y63.serializeWithType(obj, jsonGenerator, zw5, m17);
                }
                i++;
            } catch (Exception e) {
                wrapAndThrow(zw5, (Throwable) e, obj, i);
                return;
            }
        }
    }

    public void serializeTypedContents(Object[] objArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        m17 m17 = this._valueTypeSerializer;
        try {
            C2040a aVar = this._dynamicSerializers;
            for (Object obj : objArr) {
                if (obj == null) {
                    zw5.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    y63<Object> k = aVar.mo16645k(cls);
                    if (k == null) {
                        k = _findAndAddDynamic(aVar, cls, zw5);
                    }
                    k.serializeWithType(obj, jsonGenerator, zw5, m17);
                }
            }
        } catch (Exception e) {
            wrapAndThrow(zw5, (Throwable) e, (Object) null, 0);
        }
    }

    public ObjectArraySerializer withResolved(BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        if (this._property == beanProperty && y63 == this._elementSerializer && this._valueTypeSerializer == m17 && Objects.equals(this._unwrapSingle, bool)) {
            return this;
        }
        return new ObjectArraySerializer(this, beanProperty, m17, y63, bool);
    }

    public boolean hasSingleElement(Object[] objArr) {
        return objArr.length == 1;
    }

    public boolean isEmpty(zw5 zw5, Object[] objArr) {
        return objArr.length == 0;
    }

    public final void serialize(Object[] objArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        int length = objArr.length;
        if (length != 1 || ((this._unwrapSingle != null || !zw5.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.mo13850P0(objArr, length);
            serializeContents(objArr, jsonGenerator, zw5);
            jsonGenerator.mo13853S();
            return;
        }
        serializeContents(objArr, jsonGenerator, zw5);
    }

    public void serializeContents(Object[] objArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (r0 != 0) {
            y63<Object> y63 = this._elementSerializer;
            if (y63 != null) {
                serializeContentsUsing(objArr, jsonGenerator, zw5, y63);
            } else if (this._valueTypeSerializer != null) {
                serializeTypedContents(objArr, jsonGenerator, zw5);
            } else {
                try {
                    C2040a aVar = this._dynamicSerializers;
                    for (Object obj : objArr) {
                        if (obj == null) {
                            zw5.defaultSerializeNull(jsonGenerator);
                        } else {
                            Class<?> cls = obj.getClass();
                            y63<Object> k = aVar.mo16645k(cls);
                            if (k == null) {
                                if (this._elementType.hasGenericTypes()) {
                                    k = _findAndAddDynamic(aVar, zw5.constructSpecializedType(this._elementType, cls), zw5);
                                } else {
                                    k = _findAndAddDynamic(aVar, cls, zw5);
                                }
                            }
                            k.serialize(obj, jsonGenerator, zw5);
                        }
                    }
                } catch (Exception e) {
                    wrapAndThrow(zw5, (Throwable) e, (Object) null, 0);
                }
            }
        }
    }

    public final y63<Object> _findAndAddDynamic(C2040a aVar, JavaType javaType, zw5 zw5) throws JsonMappingException {
        C2040a.C2044d h = aVar.mo16642h(javaType, zw5, this._property);
        C2040a aVar2 = h.f10110b;
        if (aVar != aVar2) {
            this._dynamicSerializers = aVar2;
        }
        return h.f10109a;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, m17 m17) {
        super((ArraySerializerBase<?>) objectArraySerializer);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = m17;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = objectArraySerializer._dynamicSerializers;
        this._elementSerializer = objectArraySerializer._elementSerializer;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, BeanProperty beanProperty, m17 m17, y63<?> y63, Boolean bool) {
        super(objectArraySerializer, beanProperty, bool);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = m17;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = C2040a.m14286c();
        this._elementSerializer = y63;
    }
}
