package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class BuilderBasedDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    public final AnnotatedMethod _buildMethod;
    public final JavaType _targetType;

    /* renamed from: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer$a */
    public static /* synthetic */ class C1997a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9933a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.databind.cfg.CoercionAction[] r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9933a = r0
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9933a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9933a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.TryConvert     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.C1997a.<clinit>():void");
        }
    }

    public BuilderBasedDeserializer(o00 o00, n00 n00, JavaType javaType, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        this(o00, n00, javaType, beanPropertyMap, map, set, z, (Set<String>) null, z2);
    }

    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> activeView;
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            if (jsonParser.mo13984s0(JsonToken.START_OBJECT)) {
                jsonParser.mo13938N0();
            }
            fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            bufferForInputBuffering.mo13852Q0();
            return deserializeWithUnwrapped(jsonParser, deserializationContext, obj, bufferForInputBuffering);
        } else if (this._externalTypeIdHandler != null) {
            return deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
        } else {
            if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
                return deserializeWithView(jsonParser, deserializationContext, obj, activeView);
            }
            JsonToken g = jsonParser.mo13965g();
            if (g == JsonToken.START_OBJECT) {
                g = jsonParser.mo13938N0();
            }
            while (g == JsonToken.FIELD_NAME) {
                String f = jsonParser.mo13964f();
                jsonParser.mo13938N0();
                SettableBeanProperty find = this._beanProperties.find(f);
                if (find != null) {
                    try {
                        obj = find.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, f, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, f);
                }
                g = jsonParser.mo13938N0();
            }
            return obj;
        }
    }

    public Object _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        o43<Object> o43 = this._arrayDelegateDeserializer;
        if (o43 == null && (o43 = this._delegateDeserializer) == null) {
            CoercionAction _findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
            boolean isEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
            if (isEnabled || _findCoercionFromEmptyArray != CoercionAction.Fail) {
                JsonToken N0 = jsonParser.mo13938N0();
                JsonToken jsonToken = JsonToken.END_ARRAY;
                if (N0 == jsonToken) {
                    int i = C1997a.f9933a[_findCoercionFromEmptyArray.ordinal()];
                    if (i == 1) {
                        return getEmptyValue(deserializationContext);
                    }
                    if (i == 2 || i == 3) {
                        return getNullValue(deserializationContext);
                    }
                    return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
                } else if (isEnabled) {
                    Object deserialize = deserialize(jsonParser, deserializationContext);
                    if (jsonParser.mo13938N0() != jsonToken) {
                        handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                    }
                    return deserialize;
                }
            }
            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
        Object createUsingArrayDelegate = this._valueInstantiator.createUsingArrayDelegate(deserializationContext, o43.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingArrayDelegate);
        }
        return finishBuild(deserializationContext, createUsingArrayDelegate);
    }

    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> cls;
        Object obj;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        ox4 g = propertyBasedCreator.mo15602g(jsonParser, deserializationContext, this._objectIdReader);
        if (this._needViewProcesing) {
            cls = deserializationContext.getActiveView();
        } else {
            cls = null;
        }
        JsonToken g2 = jsonParser.mo13965g();
        fr6 fr6 = null;
        while (g2 == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            jsonParser.mo13938N0();
            SettableBeanProperty e = propertyBasedCreator.mo15600e(f);
            if (!g.mo24278i(f) || e != null) {
                if (e == null) {
                    SettableBeanProperty find = this._beanProperties.find(f);
                    if (find != null) {
                        g.mo24274e(find, find.deserialize(jsonParser, deserializationContext));
                    } else if (IgnorePropertiesUtil.m14343c(f, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), f);
                    } else {
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            g.mo24272c(settableAnyProperty, f, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                        } else {
                            if (fr6 == null) {
                                fr6 = deserializationContext.bufferForInputBuffering(jsonParser);
                            }
                            fr6.mo13864b0(f);
                            fr6.mo20074B1(jsonParser);
                        }
                    }
                } else if (cls != null && !e.visibleInView(cls)) {
                    jsonParser.mo13959c1();
                } else if (g.mo24271b(e, e.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.mo13938N0();
                    try {
                        Object a = propertyBasedCreator.mo15598a(deserializationContext, g);
                        if (a.getClass() != this._beanType.getRawClass()) {
                            return handlePolymorphic(jsonParser, deserializationContext, a, fr6);
                        }
                        if (fr6 != null) {
                            a = handleUnknownProperties(deserializationContext, a, fr6);
                        }
                        return _deserialize(jsonParser, deserializationContext, a);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, this._beanType.getRawClass(), f, deserializationContext);
                    }
                } else {
                    continue;
                }
            }
            g2 = jsonParser.mo13938N0();
        }
        try {
            obj = propertyBasedCreator.mo15598a(deserializationContext, g);
        } catch (Exception e3) {
            obj = wrapInstantiationProblem(e3, deserializationContext);
        }
        if (fr6 == null) {
            return obj;
        }
        if (obj.getClass() != this._beanType.getRawClass()) {
            return handlePolymorphic((JsonParser) null, deserializationContext, obj, fr6);
        }
        return handleUnknownProperties(deserializationContext, obj, fr6);
    }

    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayBuilderDeserializer(this, this._targetType, this._beanProperties.getPropertiesInInsertionOrder(), this._buildMethod);
    }

    /* renamed from: c */
    public final Object mo15420c(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        while (jsonParser.mo13965g() == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            jsonParser.mo13938N0();
            SettableBeanProperty find = this._beanProperties.find(f);
            if (find != null) {
                try {
                    createUsingDefault = find.deserializeSetAndReturn(jsonParser, deserializationContext, createUsingDefault);
                } catch (Exception e) {
                    wrapAndThrow(e, createUsingDefault, f, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, f);
            }
            jsonParser.mo13938N0();
        }
        return createUsingDefault;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo13928C0()) {
            JsonToken N0 = jsonParser.mo13938N0();
            if (this._vanillaProcessing) {
                return finishBuild(deserializationContext, mo15420c(jsonParser, deserializationContext, N0));
            }
            return finishBuild(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
        }
        switch (jsonParser.mo13967h()) {
            case 2:
            case 5:
                return finishBuild(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
            case 3:
                return _deserializeFromArray(jsonParser, deserializationContext);
            case 6:
                return finishBuild(deserializationContext, deserializeFromString(jsonParser, deserializationContext));
            case 7:
                return finishBuild(deserializationContext, deserializeFromNumber(jsonParser, deserializationContext));
            case 8:
                return finishBuild(deserializationContext, deserializeFromDouble(jsonParser, deserializationContext));
            case 9:
            case 10:
                return finishBuild(deserializationContext, deserializeFromBoolean(jsonParser, deserializationContext));
            case 12:
                return jsonParser.mo13924A();
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
    }

    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> activeView;
        if (!this._nonStandardCreation) {
            Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDefault);
            }
            if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
                return deserializeWithView(jsonParser, deserializationContext, createUsingDefault, activeView);
            }
            while (jsonParser.mo13965g() == JsonToken.FIELD_NAME) {
                String f = jsonParser.mo13964f();
                jsonParser.mo13938N0();
                SettableBeanProperty find = this._beanProperties.find(f);
                if (find != null) {
                    try {
                        createUsingDefault = find.deserializeSetAndReturn(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, createUsingDefault, f, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, f);
                }
                jsonParser.mo13938N0();
            }
            return createUsingDefault;
        } else if (this._unwrappedPropertyHandler != null) {
            return deserializeWithUnwrapped(jsonParser, deserializationContext);
        } else {
            if (this._externalTypeIdHandler != null) {
                return deserializeWithExternalTypeId(jsonParser, deserializationContext);
            }
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
    }

    public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JavaType javaType = this._targetType;
        return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", new Object[]{javaType}));
    }

    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        ox4 g = propertyBasedCreator.mo15602g(jsonParser, deserializationContext, this._objectIdReader);
        fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        bufferForInputBuffering.mo13852Q0();
        JsonToken g2 = jsonParser.mo13965g();
        while (g2 == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            jsonParser.mo13938N0();
            SettableBeanProperty e = propertyBasedCreator.mo15600e(f);
            if (!g.mo24278i(f) || e != null) {
                if (e == null) {
                    SettableBeanProperty find = this._beanProperties.find(f);
                    if (find != null) {
                        g.mo24274e(find, find.deserialize(jsonParser, deserializationContext));
                    } else if (IgnorePropertiesUtil.m14343c(f, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), f);
                    } else {
                        bufferForInputBuffering.mo13864b0(f);
                        bufferForInputBuffering.mo20074B1(jsonParser);
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            g.mo24272c(settableAnyProperty, f, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                        }
                    }
                } else if (g.mo24271b(e, e.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.mo13938N0();
                    try {
                        Object a = propertyBasedCreator.mo15598a(deserializationContext, g);
                        if (a.getClass() != this._beanType.getRawClass()) {
                            return handlePolymorphic(jsonParser, deserializationContext, a, bufferForInputBuffering);
                        }
                        return deserializeWithUnwrapped(jsonParser, deserializationContext, a, bufferForInputBuffering);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, this._beanType.getRawClass(), f, deserializationContext);
                    }
                } else {
                    continue;
                }
            }
            g2 = jsonParser.mo13938N0();
        }
        bufferForInputBuffering.mo13855W();
        try {
            return this._unwrappedPropertyHandler.mo27060b(jsonParser, deserializationContext, propertyBasedCreator.mo15598a(deserializationContext, g), bufferForInputBuffering);
        } catch (Exception e3) {
            return wrapInstantiationProblem(e3, deserializationContext);
        }
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext);
        }
        return deserializeWithExternalTypeId(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        o43<Object> o43 = this._delegateDeserializer;
        if (o43 != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, o43.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonParser, deserializationContext);
        }
        fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        bufferForInputBuffering.mo13852Q0();
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (jsonParser.mo13965g() == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            jsonParser.mo13938N0();
            SettableBeanProperty find = this._beanProperties.find(f);
            if (find != null) {
                if (activeView == null || find.visibleInView(activeView)) {
                    try {
                        createUsingDefault = find.deserializeSetAndReturn(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, createUsingDefault, f, deserializationContext);
                    }
                } else {
                    jsonParser.mo13959c1();
                }
            } else if (IgnorePropertiesUtil.m14343c(f, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, createUsingDefault, f);
            } else {
                bufferForInputBuffering.mo13864b0(f);
                bufferForInputBuffering.mo20074B1(jsonParser);
                SettableAnyProperty settableAnyProperty = this._anySetter;
                if (settableAnyProperty != null) {
                    try {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault, f);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, createUsingDefault, f, deserializationContext);
                    }
                }
            }
            jsonParser.mo13938N0();
        }
        bufferForInputBuffering.mo13855W();
        return this._unwrappedPropertyHandler.mo27060b(jsonParser, deserializationContext, createUsingDefault, bufferForInputBuffering);
    }

    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        JsonToken g = jsonParser.mo13965g();
        while (g == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            jsonParser.mo13938N0();
            SettableBeanProperty find = this._beanProperties.find(f);
            if (find == null) {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, f);
            } else if (!find.visibleInView(cls)) {
                jsonParser.mo13959c1();
            } else {
                try {
                    obj = find.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, f, deserializationContext);
                }
            }
            g = jsonParser.mo13938N0();
        }
        return obj;
    }

    public Object finishBuild(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedMethod annotatedMethod = this._buildMethod;
        if (annotatedMethod == null) {
            return obj;
        }
        try {
            return annotatedMethod.getMember().invoke(obj, (Object[]) null);
        } catch (Exception e) {
            return wrapInstantiationProblem(e, deserializationContext);
        }
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public o43<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return new BuilderBasedDeserializer(this, nameTransformer);
    }

    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BuilderBasedDeserializer(this, beanPropertyMap);
    }

    public BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BuilderBasedDeserializer(this, set, set2);
    }

    public BeanDeserializerBase withIgnoreAllUnknown(boolean z) {
        return new BuilderBasedDeserializer(this, z);
    }

    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BuilderBasedDeserializer(this, objectIdReader);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuilderBasedDeserializer(o00 o00, n00 n00, JavaType javaType, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, Set<String> set2, boolean z2) {
        super(o00, n00, beanPropertyMap, map, set, z, set2, z2);
        this._targetType = javaType;
        this._buildMethod = o00.mo23866r();
        if (this._objectIdReader != null) {
            throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + n00.mo23439A() + ")");
        }
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        ey1 i = this._externalTypeIdHandler.mo19543i();
        JsonToken g = jsonParser.mo13965g();
        while (g == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            JsonToken N0 = jsonParser.mo13938N0();
            SettableBeanProperty find = this._beanProperties.find(f);
            if (find != null) {
                if (N0.isScalarValue()) {
                    i.mo19542h(jsonParser, deserializationContext, f, obj);
                }
                if (activeView == null || find.visibleInView(activeView)) {
                    try {
                        obj = find.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, f, deserializationContext);
                    }
                } else {
                    jsonParser.mo13959c1();
                }
            } else if (IgnorePropertiesUtil.m14343c(f, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, f);
            } else if (!i.mo19541g(jsonParser, deserializationContext, f, obj)) {
                SettableAnyProperty settableAnyProperty = this._anySetter;
                if (settableAnyProperty != null) {
                    try {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, f);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, obj, f, deserializationContext);
                    }
                } else {
                    handleUnknownProperty(jsonParser, deserializationContext, obj, f);
                }
            }
            g = jsonParser.mo13938N0();
        }
        return i.mo19540f(jsonParser, deserializationContext, obj);
    }

    @Deprecated
    public BuilderBasedDeserializer(o00 o00, n00 n00, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        this(o00, n00, n00.mo23439A(), beanPropertyMap, map, set, z, z2);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer) {
        this(builderBasedDeserializer, builderBasedDeserializer._ignoreAllUnknown);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, boolean z) {
        super((BeanDeserializerBase) builderBasedDeserializer, z);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, NameTransformer nameTransformer) {
        super((BeanDeserializerBase) builderBasedDeserializer, nameTransformer);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JavaType javaType = this._targetType;
        Class<?> handledType = handledType();
        Class<?> cls = obj.getClass();
        if (handledType.isAssignableFrom(cls)) {
            return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", new Object[]{javaType, handledType.getName()}));
        }
        return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing instance (of %s) not supported", new Object[]{javaType, cls.getName()}));
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, ObjectIdReader objectIdReader) {
        super((BeanDeserializerBase) builderBasedDeserializer, objectIdReader);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set<String> set) {
        this(builderBasedDeserializer, set, builderBasedDeserializer._includableProps);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set<String> set, Set<String> set2) {
        super(builderBasedDeserializer, set, set2);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, BeanPropertyMap beanPropertyMap) {
        super((BeanDeserializerBase) builderBasedDeserializer, beanPropertyMap);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, fr6 fr6) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken g = jsonParser.mo13965g();
        while (g == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            SettableBeanProperty find = this._beanProperties.find(f);
            jsonParser.mo13938N0();
            if (find != null) {
                if (activeView == null || find.visibleInView(activeView)) {
                    try {
                        obj = find.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, f, deserializationContext);
                    }
                } else {
                    jsonParser.mo13959c1();
                }
            } else if (IgnorePropertiesUtil.m14343c(f, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, f);
            } else {
                fr6.mo13864b0(f);
                fr6.mo20074B1(jsonParser);
                SettableAnyProperty settableAnyProperty = this._anySetter;
                if (settableAnyProperty != null) {
                    settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, f);
                }
            }
            g = jsonParser.mo13938N0();
        }
        fr6.mo13855W();
        return this._unwrappedPropertyHandler.mo27060b(jsonParser, deserializationContext, obj, fr6);
    }
}
