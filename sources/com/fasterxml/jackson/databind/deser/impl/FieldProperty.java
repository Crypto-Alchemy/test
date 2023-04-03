package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public final class FieldProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final AnnotatedField _annotated;
    public final transient Field _field;
    public final boolean _skipNulls;

    public FieldProperty(q00 q00, JavaType javaType, j07 j07, C2236em emVar, AnnotatedField annotatedField) {
        super(q00, javaType, j07, emVar);
        this._annotated = annotatedField;
        this._field = annotatedField.getAnnotated();
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
            this._field.set(obj, obj2);
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
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, obj2);
        }
        return obj;
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        wf0.m29512g(this._field, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedField annotatedField = this._annotated;
        if (annotatedField == null) {
            return null;
        }
        return annotatedField.getAnnotation(cls);
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public Object readResolve() {
        return new FieldProperty(this);
    }

    public void set(Object obj, Object obj2) throws IOException {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }

    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
        return obj;
    }

    public SettableBeanProperty withName(PropertyName propertyName) {
        return new FieldProperty(this, propertyName);
    }

    public SettableBeanProperty withNullProvider(bc4 bc4) {
        return new FieldProperty(this, this._valueDeserializer, bc4);
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
        return new FieldProperty(this, o43, bc4);
    }

    public FieldProperty(FieldProperty fieldProperty, o43<?> o43, bc4 bc4) {
        super(fieldProperty, o43, bc4);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = NullsConstantProvider.isSkipper(bc4);
    }

    public FieldProperty(FieldProperty fieldProperty, PropertyName propertyName) {
        super(fieldProperty, propertyName);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = fieldProperty._skipNulls;
    }

    public FieldProperty(FieldProperty fieldProperty) {
        super(fieldProperty);
        AnnotatedField annotatedField = fieldProperty._annotated;
        this._annotated = annotatedField;
        Field annotated = annotatedField.getAnnotated();
        if (annotated != null) {
            this._field = annotated;
            this._skipNulls = fieldProperty._skipNulls;
            return;
        }
        throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
    }
}
