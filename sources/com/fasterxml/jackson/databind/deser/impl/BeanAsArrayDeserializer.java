package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    public final BeanDeserializerBase _delegate;
    public final SettableBeanProperty[] _orderedProperties;

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, SettableBeanProperty[] settableBeanPropertyArr) {
        super(beanDeserializerBase);
        this._delegate = beanDeserializerBase;
        this._orderedProperties = settableBeanPropertyArr;
    }

    public Object _deserializeFromNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser.mo13965g(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", wf0.m29480G(this._beanType), jsonParser.mo13965g());
    }

    public Object _deserializeNonVanilla(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> cls;
        if (this._nonStandardCreation) {
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.mo13951Y0(createUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDefault);
        }
        if (this._needViewProcesing) {
            cls = deserializationContext.getActiveView();
        } else {
            cls = null;
        }
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (true) {
            JsonToken N0 = jsonParser.mo13938N0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (N0 == jsonToken) {
                return createUsingDefault;
            }
            if (i == length) {
                if (!this._ignoreAllUnknown) {
                    deserializationContext.reportWrongTokenException((o43<?>) this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.mo13959c1();
                } while (jsonParser.mo13938N0() != JsonToken.END_ARRAY);
                return createUsingDefault;
            }
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            i++;
            if (settableBeanProperty == null || (cls != null && !settableBeanProperty.visibleInView(cls))) {
                jsonParser.mo13959c1();
            } else {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                } catch (Exception e) {
                    wrapAndThrow(e, createUsingDefault, settableBeanProperty.getName(), deserializationContext);
                }
            }
        }
    }

    public final Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> cls;
        SettableBeanProperty settableBeanProperty;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        ox4 g = propertyBasedCreator.mo15602g(jsonParser, deserializationContext, this._objectIdReader);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        if (this._needViewProcesing) {
            cls = deserializationContext.getActiveView();
        } else {
            cls = null;
        }
        Object obj = null;
        int i = 0;
        while (jsonParser.mo13938N0() != JsonToken.END_ARRAY) {
            if (i < length) {
                settableBeanProperty = settableBeanPropertyArr[i];
            } else {
                settableBeanProperty = null;
            }
            if (settableBeanProperty == null) {
                jsonParser.mo13959c1();
            } else if (cls != null && !settableBeanProperty.visibleInView(cls)) {
                jsonParser.mo13959c1();
            } else if (obj != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                String name = settableBeanProperty.getName();
                SettableBeanProperty e2 = propertyBasedCreator.mo15600e(name);
                if (!g.mo24278i(name) || e2 != null) {
                    if (e2 == null) {
                        g.mo24274e(settableBeanProperty, settableBeanProperty.deserialize(jsonParser, deserializationContext));
                    } else if (g.mo24271b(e2, e2.deserialize(jsonParser, deserializationContext))) {
                        try {
                            obj = propertyBasedCreator.mo15598a(deserializationContext, g);
                            jsonParser.mo13951Y0(obj);
                            if (obj.getClass() != this._beanType.getRawClass()) {
                                JavaType javaType = this._beanType;
                                deserializationContext.reportBadDefinition(javaType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", new Object[]{wf0.m29480G(javaType), wf0.m29539y(obj)}));
                            }
                        } catch (Exception e3) {
                            wrapAndThrow(e3, this._beanType.getRawClass(), name, deserializationContext);
                        }
                    }
                }
            }
            i++;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return propertyBasedCreator.mo15598a(deserializationContext, g);
        } catch (Exception e4) {
            return wrapInstantiationProblem(e4, deserializationContext);
        }
    }

    public BeanDeserializerBase asArrayDeserializer() {
        return this;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.mo13926B0()) {
            return _deserializeFromNonArray(jsonParser, deserializationContext);
        }
        if (!this._vanillaProcessing) {
            return _deserializeNonVanilla(jsonParser, deserializationContext);
        }
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.mo13951Y0(createUsingDefault);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (true) {
            JsonToken N0 = jsonParser.mo13938N0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (N0 == jsonToken) {
                return createUsingDefault;
            }
            if (i == length) {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportWrongTokenException((o43<?>) this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.mo13959c1();
                } while (jsonParser.mo13938N0() != JsonToken.END_ARRAY);
                return createUsingDefault;
            }
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            if (settableBeanProperty != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                } catch (Exception e) {
                    wrapAndThrow(e, createUsingDefault, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                jsonParser.mo13959c1();
            }
            i++;
        }
    }

    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeFromNonArray(jsonParser, deserializationContext);
    }

    public o43<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this._delegate.unwrappingDeserializer(nameTransformer);
    }

    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayDeserializer(this._delegate.withBeanProperties(beanPropertyMap), this._orderedProperties);
    }

    public BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanAsArrayDeserializer(this._delegate.withByNameInclusion(set, set2), this._orderedProperties);
    }

    public BeanDeserializerBase withIgnoreAllUnknown(boolean z) {
        return new BeanAsArrayDeserializer(this._delegate.withIgnoreAllUnknown(z), this._orderedProperties);
    }

    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanAsArrayDeserializer(this._delegate.withObjectIdReader(objectIdReader), this._orderedProperties);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        jsonParser.mo13951Y0(obj);
        if (!jsonParser.mo13926B0()) {
            return _deserializeFromNonArray(jsonParser, deserializationContext);
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (true) {
            JsonToken N0 = jsonParser.mo13938N0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (N0 == jsonToken) {
                return obj;
            }
            if (i == length) {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportWrongTokenException((o43<?>) this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.mo13959c1();
                } while (jsonParser.mo13938N0() != JsonToken.END_ARRAY);
                return obj;
            }
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            if (settableBeanProperty != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                jsonParser.mo13959c1();
            }
            i++;
        }
    }
}
