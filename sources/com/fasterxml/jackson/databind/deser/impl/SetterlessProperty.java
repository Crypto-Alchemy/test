package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public final class SetterlessProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final AnnotatedMethod _annotated;
    public final Method _getter;

    public SetterlessProperty(q00 q00, JavaType javaType, j07 j07, C2236em emVar, AnnotatedMethod annotatedMethod) {
        super(q00, javaType, j07, emVar);
        this._annotated = annotatedMethod;
        this._getter = annotatedMethod.getAnnotated();
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (!jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
            if (this._valueTypeDeserializer != null) {
                deserializationContext.reportBadDefinition(getType(), String.format("Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet", new Object[]{getName()}));
            }
            try {
                Object invoke = this._getter.invoke(obj, (Object[]) null);
                if (invoke == null) {
                    deserializationContext.reportBadDefinition(getType(), String.format("Problem deserializing 'setterless' property '%s': get method returned null", new Object[]{getName()}));
                }
                this._valueDeserializer.deserialize(jsonParser, deserializationContext, invoke);
            } catch (Exception e) {
                _throwAsIOE(jsonParser, e);
            }
        }
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        deserializeAndSet(jsonParser, deserializationContext, obj);
        return obj;
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._annotated.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this._annotated.getAnnotation(cls);
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public final void set(Object obj, Object obj2) throws IOException {
        throw new UnsupportedOperationException("Should never call `set()` on setterless property ('" + getName() + "')");
    }

    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        set(obj, obj2);
        return obj;
    }

    public SettableBeanProperty withName(PropertyName propertyName) {
        return new SetterlessProperty(this, propertyName);
    }

    public SettableBeanProperty withNullProvider(bc4 bc4) {
        return new SetterlessProperty(this, this._valueDeserializer, bc4);
    }

    public SettableBeanProperty withValueDeserializer(o43<?> o43) {
        o43<Object> o432 = this._valueDeserializer;
        if (o432 == o43) {
            return this;
        }
        bc4 bc4 = this._nullProvider;
        if (o432 == bc4) {
            bc4 = o43;
        }
        return new SetterlessProperty(this, o43, bc4);
    }

    public SetterlessProperty(SetterlessProperty setterlessProperty, o43<?> o43, bc4 bc4) {
        super(setterlessProperty, o43, bc4);
        this._annotated = setterlessProperty._annotated;
        this._getter = setterlessProperty._getter;
    }

    public SetterlessProperty(SetterlessProperty setterlessProperty, PropertyName propertyName) {
        super(setterlessProperty, propertyName);
        this._annotated = setterlessProperty._annotated;
        this._getter = setterlessProperty._getter;
    }
}
