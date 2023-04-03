package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

class FactoryBasedEnumDeserializer extends StdDeserializer<Object> implements js0 {
    private static final long serialVersionUID = 1;
    public final SettableBeanProperty[] _creatorProps;
    public final o43<?> _deser;
    public final AnnotatedMethod _factory;
    public final boolean _hasArgs;
    public final JavaType _inputType;
    public final ValueInstantiator _valueInstantiator;

    /* renamed from: a */
    public transient PropertyBasedCreator f9962a;

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod, JavaType javaType, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        super(cls);
        this._factory = annotatedMethod;
        this._hasArgs = true;
        this._inputType = (javaType.hasRawClass(String.class) || javaType.hasRawClass(CharSequence.class)) ? null : javaType;
        this._deser = null;
        this._valueInstantiator = valueInstantiator;
        this._creatorProps = settableBeanPropertyArr;
    }

    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e) {
            return wrapAndThrow(e, handledType(), settableBeanProperty.getName(), deserializationContext);
        }
    }

    /* renamed from: a */
    public final Throwable mo15675a(Throwable th, DeserializationContext deserializationContext) throws IOException {
        boolean z;
        Throwable F = wf0.m29479F(th);
        wf0.m29515h0(F);
        if (deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            z = true;
        } else {
            z = false;
        }
        if (F instanceof IOException) {
            if (!z || !(F instanceof JacksonException)) {
                throw ((IOException) F);
            }
        } else if (!z) {
            wf0.m29519j0(F);
        }
        return F;
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JavaType javaType;
        if (this._deser == null && (javaType = this._inputType) != null && this._creatorProps == null) {
            return new FactoryBasedEnumDeserializer(this, (o43<?>) deserializationContext.findContextualValueDeserializer(javaType, beanProperty));
        }
        return this;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        o43<?> o43 = this._deser;
        if (o43 != null) {
            obj = o43.deserialize(jsonParser, deserializationContext);
        } else if (!this._hasArgs) {
            jsonParser.mo13959c1();
            try {
                return this._factory.call();
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._valueClass, (Object) null, wf0.m29521k0(e));
            }
        } else if (this._creatorProps != null) {
            if (!jsonParser.mo13928C0()) {
                JavaType valueType = getValueType(deserializationContext);
                deserializationContext.reportInputMismatch(valueType, "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects JSON Object (JsonToken.START_OBJECT), got JsonToken.%s", wf0.m29480G(valueType), this._factory, jsonParser.mo13965g());
            }
            if (this.f9962a == null) {
                this.f9962a = PropertyBasedCreator.m14069c(deserializationContext, this._valueInstantiator, this._creatorProps, deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
            }
            jsonParser.mo13938N0();
            return deserializeEnumUsingPropertyBased(jsonParser, deserializationContext, this.f9962a);
        } else {
            JsonToken g = jsonParser.mo13965g();
            if (g == null || g.isScalarValue()) {
                obj = jsonParser.mo13974k0();
            } else {
                jsonParser.mo13959c1();
                obj = "";
            }
        }
        try {
            return this._factory.callOnWith(this._valueClass, obj);
        } catch (Exception e2) {
            Throwable k0 = wf0.m29521k0(e2);
            if (!(k0 instanceof IllegalArgumentException) || !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return deserializationContext.handleInstantiationProblem(this._valueClass, obj, k0);
            }
            return null;
        }
    }

    public Object deserializeEnumUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyBasedCreator propertyBasedCreator) throws IOException {
        ox4 g = propertyBasedCreator.mo15602g(jsonParser, deserializationContext, (ObjectIdReader) null);
        JsonToken g2 = jsonParser.mo13965g();
        while (g2 == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            jsonParser.mo13938N0();
            SettableBeanProperty e = propertyBasedCreator.mo15600e(f);
            if (!g.mo24278i(f) || e != null) {
                if (e != null) {
                    g.mo24271b(e, _deserializeWithErrorWrapping(jsonParser, deserializationContext, e));
                } else {
                    jsonParser.mo13959c1();
                }
            }
            g2 = jsonParser.mo13938N0();
        }
        return propertyBasedCreator.mo15598a(deserializationContext, g);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        if (this._deser == null) {
            return deserialize(jsonParser, deserializationContext);
        }
        return j07.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public boolean isCachable() {
        return true;
    }

    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public Object wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw JsonMappingException.wrapWithPath(mo15675a(th, deserializationContext), obj, str);
    }

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod) {
        super(cls);
        this._factory = annotatedMethod;
        this._hasArgs = false;
        this._inputType = null;
        this._deser = null;
        this._valueInstantiator = null;
        this._creatorProps = null;
    }

    public FactoryBasedEnumDeserializer(FactoryBasedEnumDeserializer factoryBasedEnumDeserializer, o43<?> o43) {
        super(factoryBasedEnumDeserializer._valueClass);
        this._inputType = factoryBasedEnumDeserializer._inputType;
        this._factory = factoryBasedEnumDeserializer._factory;
        this._hasArgs = factoryBasedEnumDeserializer._hasArgs;
        this._valueInstantiator = factoryBasedEnumDeserializer._valueInstantiator;
        this._creatorProps = factoryBasedEnumDeserializer._creatorProps;
        this._deser = o43;
    }
}
