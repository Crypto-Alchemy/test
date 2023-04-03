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

public final class MethodProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final AnnotatedMethod _annotated;
    public final transient Method _setter;
    public final boolean _skipNulls;

    public MethodProperty(q00 q00, JavaType javaType, j07 j07, C2236em emVar, AnnotatedMethod annotatedMethod) {
        super(q00, javaType, j07, emVar);
        this._annotated = annotatedMethod;
        this._setter = annotatedMethod.getAnnotated();
        this._skipNulls = NullsConstantProvider.isSkipper(this._nullProvider);
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        if (!jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
            j07 j07 = this._valueTypeDeserializer;
            if (j07 == null) {
                Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (deserialize != null) {
                    obj2 = deserialize;
                } else if (!this._skipNulls) {
                    obj2 = this._nullProvider.getNullValue(deserializationContext);
                } else {
                    return;
                }
            } else {
                obj2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, j07);
            }
        } else if (!this._skipNulls) {
            obj2 = this._nullProvider.getNullValue(deserializationContext);
        } else {
            return;
        }
        try {
            this._setter.invoke(obj, new Object[]{obj2});
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, obj2);
        }
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        if (!jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
            j07 j07 = this._valueTypeDeserializer;
            if (j07 == null) {
                Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (deserialize != null) {
                    obj2 = deserialize;
                } else if (this._skipNulls) {
                    return obj;
                } else {
                    obj2 = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                obj2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, j07);
            }
        } else if (this._skipNulls) {
            return obj;
        } else {
            obj2 = this._nullProvider.getNullValue(deserializationContext);
        }
        try {
            Object invoke = this._setter.invoke(obj, new Object[]{obj2});
            if (invoke == null) {
                return obj;
            }
            return invoke;
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, obj2);
            return null;
        }
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._annotated.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedMethod annotatedMethod = this._annotated;
        if (annotatedMethod == null) {
            return null;
        }
        return annotatedMethod.getAnnotation(cls);
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public Object readResolve() {
        return new MethodProperty(this, this._annotated.getAnnotated());
    }

    public final void set(Object obj, Object obj2) throws IOException {
        try {
            this._setter.invoke(obj, new Object[]{obj2});
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }

    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        try {
            Object invoke = this._setter.invoke(obj, new Object[]{obj2});
            if (invoke == null) {
                return obj;
            }
            return invoke;
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
            return null;
        }
    }

    public SettableBeanProperty withName(PropertyName propertyName) {
        return new MethodProperty(this, propertyName);
    }

    public SettableBeanProperty withNullProvider(bc4 bc4) {
        return new MethodProperty(this, this._valueDeserializer, bc4);
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
        return new MethodProperty(this, o43, bc4);
    }

    public MethodProperty(MethodProperty methodProperty, o43<?> o43, bc4 bc4) {
        super(methodProperty, o43, bc4);
        this._annotated = methodProperty._annotated;
        this._setter = methodProperty._setter;
        this._skipNulls = NullsConstantProvider.isSkipper(bc4);
    }

    public MethodProperty(MethodProperty methodProperty, PropertyName propertyName) {
        super(methodProperty, propertyName);
        this._annotated = methodProperty._annotated;
        this._setter = methodProperty._setter;
        this._skipNulls = methodProperty._skipNulls;
    }

    public MethodProperty(MethodProperty methodProperty, Method method) {
        super(methodProperty);
        this._annotated = methodProperty._annotated;
        this._setter = method;
        this._skipNulls = methodProperty._skipNulls;
    }
}
