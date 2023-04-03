package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.C2001a;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class SettableAnyProperty implements Serializable {
    private static final long serialVersionUID = 1;
    public final ha3 _keyDeserializer;
    public final BeanProperty _property;
    public final AnnotatedMember _setter;
    public final boolean _setterIsField;
    public final JavaType _type;
    public o43<Object> _valueDeserializer;
    public final j07 _valueTypeDeserializer;

    /* renamed from: com.fasterxml.jackson.databind.deser.SettableAnyProperty$a */
    public static class C1998a extends C2001a.C2002a {

        /* renamed from: c */
        public final SettableAnyProperty f9934c;

        /* renamed from: d */
        public final Object f9935d;

        /* renamed from: e */
        public final String f9936e;

        public C1998a(SettableAnyProperty settableAnyProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj, String str) {
            super(unresolvedForwardReference, cls);
            this.f9934c = settableAnyProperty;
            this.f9935d = obj;
            this.f9936e = str;
        }

        /* renamed from: c */
        public void mo15344c(Object obj, Object obj2) throws IOException {
            if (mo15620d(obj)) {
                this.f9934c.set(this.f9935d, this.f9936e, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
        }
    }

    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, ha3 ha3, o43<Object> o43, j07 j07) {
        this._property = beanProperty;
        this._setter = annotatedMember;
        this._type = javaType;
        this._valueDeserializer = o43;
        this._valueTypeDeserializer = j07;
        this._keyDeserializer = ha3;
        this._setterIsField = annotatedMember instanceof AnnotatedField;
    }

    public void _throwAsIOE(Exception exc, Object obj, Object obj2) throws IOException {
        if (exc instanceof IllegalArgumentException) {
            String h = wf0.m29514h(obj2);
            StringBuilder sb = new StringBuilder("Problem deserializing \"any\" property '");
            sb.append(obj);
            sb.append("' of class " + mo15476a() + " (expected type: ");
            sb.append(this._type);
            sb.append("; actual type: ");
            sb.append(h);
            sb.append(")");
            String o = wf0.m29528o(exc);
            if (o != null) {
                sb.append(", problem: ");
                sb.append(o);
            } else {
                sb.append(" (no error message provided)");
            }
            throw new JsonMappingException((Closeable) null, sb.toString(), (Throwable) exc);
        }
        wf0.m29517i0(exc);
        wf0.m29519j0(exc);
        Throwable F = wf0.m29479F(exc);
        throw new JsonMappingException((Closeable) null, wf0.m29528o(F), F);
    }

    /* renamed from: a */
    public final String mo15476a() {
        return this._setter.getDeclaringClass().getName();
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
            return this._valueDeserializer.getNullValue(deserializationContext);
        }
        j07 j07 = this._valueTypeDeserializer;
        if (j07 != null) {
            return this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, j07);
        }
        return this._valueDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        Object obj2;
        try {
            ha3 ha3 = this._keyDeserializer;
            if (ha3 == null) {
                obj2 = str;
            } else {
                obj2 = ha3.deserializeKey(str, deserializationContext);
            }
            set(obj, obj2, deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if (this._valueDeserializer.getObjectIdReader() != null) {
                e.getRoid().mo15609a(new C1998a(this, e, this._type.getRawClass(), obj, str));
                return;
            }
            throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info.", (Throwable) e);
        }
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._setter.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public BeanProperty getProperty() {
        return this._property;
    }

    public JavaType getType() {
        return this._type;
    }

    public boolean hasValueDeserializer() {
        if (this._valueDeserializer != null) {
            return true;
        }
        return false;
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this._setter;
        if (annotatedMember != null && annotatedMember.getAnnotated() != null) {
            return this;
        }
        throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
    }

    public void set(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            if (this._setterIsField) {
                Map map = (Map) ((AnnotatedField) this._setter).getValue(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                    return;
                }
                return;
            }
            ((AnnotatedMethod) this._setter).callOnWith(obj, obj2, obj3);
        } catch (Exception e) {
            _throwAsIOE(e, obj2, obj3);
        }
    }

    public String toString() {
        return "[any property on class " + mo15476a() + "]";
    }

    public SettableAnyProperty withValueDeserializer(o43<Object> o43) {
        return new SettableAnyProperty(this._property, this._setter, this._type, this._keyDeserializer, o43, this._valueTypeDeserializer);
    }

    @Deprecated
    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, o43<Object> o43, j07 j07) {
        this(beanProperty, annotatedMember, javaType, (ha3) null, o43, j07);
    }
}
