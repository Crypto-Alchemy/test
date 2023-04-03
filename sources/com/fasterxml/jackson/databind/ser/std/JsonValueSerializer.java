package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.impl.C2040a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;

@zz2
public class JsonValueSerializer extends StdSerializer<Object> implements ls0 {
    public final AnnotatedMember _accessor;
    public transient C2040a _dynamicSerializers;
    public final boolean _forceTypeInformation;
    public final BeanProperty _property;
    public final y63<Object> _valueSerializer;
    public final JavaType _valueType;
    public final m17 _valueTypeSerializer;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer$a */
    public static class C2048a extends m17 {

        /* renamed from: a */
        public final m17 f10116a;

        /* renamed from: b */
        public final Object f10117b;

        public C2048a(m17 m17, Object obj) {
            this.f10116a = m17;
            this.f10117b = obj;
        }

        /* renamed from: a */
        public m17 mo11783a(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String mo16711b() {
            return this.f10116a.mo16711b();
        }

        /* renamed from: c */
        public JsonTypeInfo.C1971As mo11784c() {
            return this.f10116a.mo11784c();
        }

        /* renamed from: g */
        public WritableTypeId mo16712g(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            writableTypeId.f9859a = this.f10117b;
            return this.f10116a.mo16712g(jsonGenerator, writableTypeId);
        }

        /* renamed from: h */
        public WritableTypeId mo16713h(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            return this.f10116a.mo16713h(jsonGenerator, writableTypeId);
        }
    }

    public JsonValueSerializer(AnnotatedMember annotatedMember, m17 m17, y63<?> y63) {
        super(annotatedMember.getType());
        this._accessor = annotatedMember;
        this._valueType = annotatedMember.getType();
        this._valueTypeSerializer = m17;
        this._valueSerializer = y63;
        this._property = null;
        this._forceTypeInformation = true;
        this._dynamicSerializers = C2040a.m14286c();
    }

    /* renamed from: a */
    public static final Class<Object> m14306a(Class<?> cls) {
        if (cls == null) {
            return Object.class;
        }
        return cls;
    }

    public boolean _acceptJsonFormatVisitorForEnum(t43 t43, JavaType javaType, Class<?> cls) throws JsonMappingException {
        b73 i = t43.mo26056i(javaType);
        if (i == null) {
            return true;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = enumConstants[i2];
            try {
                linkedHashSet.add(String.valueOf(this._accessor.getValue(obj)));
                i2++;
            } catch (Exception e) {
                e = e;
                while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                    e = e.getCause();
                }
                wf0.m29515h0(e);
                throw JsonMappingException.wrapWithPath(e, obj, this._accessor.getName() + "()");
            }
        }
        i.mo22677b(linkedHashSet);
        return true;
    }

    public y63<Object> _findDynamicSerializer(zw5 zw5, Class<?> cls) throws JsonMappingException {
        y63<Object> k = this._dynamicSerializers.mo16645k(cls);
        if (k != null) {
            return k;
        }
        if (this._valueType.hasGenericTypes()) {
            JavaType constructSpecializedType = zw5.constructSpecializedType(this._valueType, cls);
            y63<Object> findPrimaryPropertySerializer = zw5.findPrimaryPropertySerializer(constructSpecializedType, this._property);
            this._dynamicSerializers = this._dynamicSerializers.mo16637a(constructSpecializedType, findPrimaryPropertySerializer).f10110b;
            return findPrimaryPropertySerializer;
        }
        y63<Object> findPrimaryPropertySerializer2 = zw5.findPrimaryPropertySerializer(cls, this._property);
        this._dynamicSerializers = this._dynamicSerializers.mo16638b(cls, findPrimaryPropertySerializer2).f10110b;
        return findPrimaryPropertySerializer2;
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        Class<?> declaringClass = this._accessor.getDeclaringClass();
        if (declaringClass == null || !wf0.m29485L(declaringClass) || !_acceptJsonFormatVisitorForEnum(t43, javaType, declaringClass)) {
            y63<Object> y63 = this._valueSerializer;
            if (y63 == null && (y63 = t43.mo25637b().findTypedValueSerializer(this._valueType, false, this._property)) == null) {
                t43.mo26057j(javaType);
            } else {
                y63.acceptJsonFormatVisitor(t43, this._valueType);
            }
        }
    }

    public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        m17 m17 = this._valueTypeSerializer;
        if (m17 != null) {
            m17 = m17.mo11783a(beanProperty);
        }
        y63<Object> y63 = this._valueSerializer;
        if (y63 != null) {
            return withResolved(beanProperty, m17, zw5.handlePrimaryContextualization(y63, beanProperty), this._forceTypeInformation);
        }
        if (zw5.isEnabled(MapperFeature.USE_STATIC_TYPING) || this._valueType.isFinal()) {
            y63<Object> findPrimaryPropertySerializer = zw5.findPrimaryPropertySerializer(this._valueType, beanProperty);
            return withResolved(beanProperty, m17, findPrimaryPropertySerializer, isNaturalTypeWithStdHandling(this._valueType.getRawClass(), findPrimaryPropertySerializer));
        } else if (beanProperty != this._property) {
            return withResolved(beanProperty, m17, y63, this._forceTypeInformation);
        } else {
            return this;
        }
    }

    public g53 getSchema(zw5 zw5, Type type) throws JsonMappingException {
        y63<Object> y63 = this._valueSerializer;
        if (y63 instanceof ym5) {
            return ((ym5) y63).getSchema(zw5, (Type) null);
        }
        return u63.m28093a();
    }

    public boolean isEmpty(zw5 zw5, Object obj) {
        Object value = this._accessor.getValue(obj);
        if (value == null) {
            return true;
        }
        y63<Object> y63 = this._valueSerializer;
        if (y63 == null) {
            try {
                y63 = _findDynamicSerializer(zw5, value.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        return y63.isEmpty(zw5, value);
    }

    public boolean isNaturalTypeWithStdHandling(Class<?> cls, y63<?> y63) {
        if (cls.isPrimitive()) {
            if (!(cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE)) {
                return false;
            }
        } else if (!(cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class)) {
            return false;
        }
        return isDefaultSerializer(y63);
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        Object obj2;
        try {
            obj2 = this._accessor.getValue(obj);
        } catch (Exception e) {
            wrapAndThrow(zw5, (Throwable) e, obj, this._accessor.getName() + "()");
            obj2 = null;
        }
        if (obj2 == null) {
            zw5.defaultSerializeNull(jsonGenerator);
            return;
        }
        y63<Object> y63 = this._valueSerializer;
        if (y63 == null) {
            y63 = _findDynamicSerializer(zw5, obj2.getClass());
        }
        m17 m17 = this._valueTypeSerializer;
        if (m17 != null) {
            y63.serializeWithType(obj2, jsonGenerator, zw5, m17);
        } else {
            y63.serialize(obj2, jsonGenerator, zw5);
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        Object obj2;
        try {
            obj2 = this._accessor.getValue(obj);
        } catch (Exception e) {
            wrapAndThrow(zw5, (Throwable) e, obj, this._accessor.getName() + "()");
            obj2 = null;
        }
        if (obj2 == null) {
            zw5.defaultSerializeNull(jsonGenerator);
            return;
        }
        y63<Object> y63 = this._valueSerializer;
        if (y63 == null) {
            y63 = _findDynamicSerializer(zw5, obj2.getClass());
        } else if (this._forceTypeInformation) {
            WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(obj, JsonToken.VALUE_STRING));
            y63.serialize(obj2, jsonGenerator, zw5);
            m17.mo16713h(jsonGenerator, g);
            return;
        }
        y63.serializeWithType(obj2, jsonGenerator, zw5, new C2048a(m17, obj));
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this._accessor.getDeclaringClass() + "#" + this._accessor.getName() + ")";
    }

    public JsonValueSerializer withResolved(BeanProperty beanProperty, m17 m17, y63<?> y63, boolean z) {
        if (this._property == beanProperty && this._valueTypeSerializer == m17 && this._valueSerializer == y63 && z == this._forceTypeInformation) {
            return this;
        }
        return new JsonValueSerializer(this, beanProperty, m17, y63, z);
    }

    @Deprecated
    public JsonValueSerializer(AnnotatedMember annotatedMember, y63<?> y63) {
        this(annotatedMember, (m17) null, y63);
    }

    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, m17 m17, y63<?> y63, boolean z) {
        super(m14306a(jsonValueSerializer.handledType()));
        this._accessor = jsonValueSerializer._accessor;
        this._valueType = jsonValueSerializer._valueType;
        this._valueTypeSerializer = m17;
        this._valueSerializer = y63;
        this._property = beanProperty;
        this._forceTypeInformation = z;
        this._dynamicSerializers = C2040a.m14286c();
    }
}
