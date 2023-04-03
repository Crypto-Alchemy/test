package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.C2033i;
import java.io.IOException;
import java.lang.reflect.Constructor;

public final class InnerClassProperty extends SettableBeanProperty.Delegating {
    private static final long serialVersionUID = 1;
    public AnnotatedConstructor _annotated;
    public final transient Constructor<?> _creator;

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, Constructor<?> constructor) {
        super(settableBeanProperty);
        this._creator = constructor;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        Object obj3;
        if (jsonParser.mo13965g() == JsonToken.VALUE_NULL) {
            obj2 = this._valueDeserializer.getNullValue(deserializationContext);
        } else {
            j07 j07 = this._valueTypeDeserializer;
            if (j07 != null) {
                obj2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, j07);
            } else {
                try {
                    obj3 = this._creator.newInstance(new Object[]{obj});
                } catch (Exception e) {
                    wf0.m29525m0(e, String.format("Failed to instantiate class %s, problem: %s", new Object[]{this._creator.getDeclaringClass().getName(), e.getMessage()}));
                    obj3 = null;
                }
                this._valueDeserializer.deserialize(jsonParser, deserializationContext, obj3);
                obj2 = obj3;
            }
        }
        set(obj, obj2);
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    public Object readResolve() {
        return new InnerClassProperty((SettableBeanProperty) this, this._annotated);
    }

    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        if (settableBeanProperty == this.delegate) {
            return this;
        }
        return new InnerClassProperty(settableBeanProperty, this._creator);
    }

    public Object writeReplace() {
        if (this._annotated == null) {
            return new InnerClassProperty((SettableBeanProperty) this, new AnnotatedConstructor((C2033i) null, this._creator, (C3742zl) null, (C3742zl[]) null));
        }
        return this;
    }

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, AnnotatedConstructor annotatedConstructor) {
        super(settableBeanProperty);
        Constructor<?> constructor;
        this._annotated = annotatedConstructor;
        if (annotatedConstructor == null) {
            constructor = null;
        } else {
            constructor = annotatedConstructor.getAnnotated();
        }
        this._creator = constructor;
        if (constructor == null) {
            throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
        }
    }
}
