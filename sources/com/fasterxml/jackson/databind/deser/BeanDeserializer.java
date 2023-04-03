package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.C2001a;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BeanDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    public transient Exception _nullFromCreator;

    /* renamed from: a */
    public volatile transient NameTransformer f9926a;

    /* renamed from: com.fasterxml.jackson.databind.deser.BeanDeserializer$a */
    public static /* synthetic */ class C1995a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9927a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f9928b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0091 */
        static {
            /*
                com.fasterxml.jackson.databind.cfg.CoercionAction[] r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9928b = r0
                r1 = 1
                com.fasterxml.jackson.databind.cfg.CoercionAction r2 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9928b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.cfg.CoercionAction r3 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9928b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.cfg.CoercionAction r4 = com.fasterxml.jackson.databind.cfg.CoercionAction.TryConvert     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.fasterxml.jackson.core.JsonToken[] r3 = com.fasterxml.jackson.core.JsonToken.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f9927a = r3
                com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f9927a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f9927a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f9927a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f9927a     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f9927a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f9927a     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f9927a     // Catch:{ NoSuchFieldError -> 0x0085 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = f9927a     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                int[] r0 = f9927a     // Catch:{ NoSuchFieldError -> 0x009d }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x009d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializer.C1995a.<clinit>():void");
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.BeanDeserializer$b */
    public static class C1996b extends C2001a.C2002a {

        /* renamed from: c */
        public final DeserializationContext f9929c;

        /* renamed from: d */
        public final SettableBeanProperty f9930d;

        /* renamed from: e */
        public Object f9931e;

        public C1996b(DeserializationContext deserializationContext, UnresolvedForwardReference unresolvedForwardReference, JavaType javaType, ox4 ox4, SettableBeanProperty settableBeanProperty) {
            super(unresolvedForwardReference, javaType);
            this.f9929c = deserializationContext;
            this.f9930d = settableBeanProperty;
        }

        /* renamed from: c */
        public void mo15344c(Object obj, Object obj2) throws IOException {
            if (this.f9931e == null) {
                DeserializationContext deserializationContext = this.f9929c;
                SettableBeanProperty settableBeanProperty = this.f9930d;
                deserializationContext.reportInputMismatch((BeanProperty) settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.getName(), this.f9930d.getDeclaringClass().getName());
            }
            this.f9930d.set(this.f9931e, obj2);
        }

        /* renamed from: e */
        public void mo15345e(Object obj) {
            this.f9931e = obj;
        }
    }

    @Deprecated
    public BeanDeserializer(o00 o00, n00 n00, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z, boolean z2) {
        super(o00, n00, beanPropertyMap, map, hashSet, z, (Set<String>) null, z2);
    }

    public Exception _creatorReturnedNullException() {
        if (this._nullFromCreator == null) {
            this._nullFromCreator = new NullPointerException("JSON Creator returned null");
        }
        return this._nullFromCreator;
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
                    int i = C1995a.f9928b[_findCoercionFromEmptyArray.ordinal()];
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
        return createUsingArrayDelegate;
    }

    public final Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        if (jsonToken != null) {
            switch (C1995a.f9927a[jsonToken.ordinal()]) {
                case 1:
                    return deserializeFromString(jsonParser, deserializationContext);
                case 2:
                    return deserializeFromNumber(jsonParser, deserializationContext);
                case 3:
                    return deserializeFromDouble(jsonParser, deserializationContext);
                case 4:
                    return deserializeFromEmbedded(jsonParser, deserializationContext);
                case 5:
                case 6:
                    return deserializeFromBoolean(jsonParser, deserializationContext);
                case 7:
                    return deserializeFromNull(jsonParser, deserializationContext);
                case 8:
                    return _deserializeFromArray(jsonParser, deserializationContext);
                case 9:
                case 10:
                    if (this._vanillaProcessing) {
                        return mo15328d(jsonParser, deserializationContext, jsonToken);
                    }
                    if (this._objectIdReader != null) {
                        return deserializeWithObjectId(jsonParser, deserializationContext);
                    }
                    return deserializeFromObject(jsonParser, deserializationContext);
            }
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> cls;
        Object obj;
        Object obj2;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        ox4 g = propertyBasedCreator.mo15602g(jsonParser, deserializationContext, this._objectIdReader);
        if (this._needViewProcesing) {
            cls = deserializationContext.getActiveView();
        } else {
            cls = null;
        }
        JsonToken g2 = jsonParser.mo13965g();
        ArrayList<C1996b> arrayList = null;
        fr6 fr6 = null;
        while (g2 == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            jsonParser.mo13938N0();
            SettableBeanProperty e = propertyBasedCreator.mo15600e(f);
            if (!g.mo24278i(f) || e != null) {
                if (e == null) {
                    SettableBeanProperty find = this._beanProperties.find(f);
                    if (find != null) {
                        try {
                            g.mo24274e(find, _deserializeWithErrorWrapping(jsonParser, deserializationContext, find));
                        } catch (UnresolvedForwardReference e2) {
                            C1996b c = mo15327c(deserializationContext, find, g, e2);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            arrayList.add(c);
                        }
                    } else if (IgnorePropertiesUtil.m14343c(f, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), f);
                    } else {
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            try {
                                g.mo24272c(settableAnyProperty, f, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                            } catch (Exception e3) {
                                wrapAndThrow(e3, this._beanType.getRawClass(), f, deserializationContext);
                            }
                        } else if (this._ignoreAllUnknown) {
                            jsonParser.mo13959c1();
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
                } else if (g.mo24271b(e, _deserializeWithErrorWrapping(jsonParser, deserializationContext, e))) {
                    jsonParser.mo13938N0();
                    try {
                        obj2 = propertyBasedCreator.mo15598a(deserializationContext, g);
                    } catch (Exception e4) {
                        obj2 = wrapInstantiationProblem(e4, deserializationContext);
                    }
                    if (obj2 == null) {
                        return deserializationContext.handleInstantiationProblem(handledType(), (Object) null, _creatorReturnedNullException());
                    }
                    jsonParser.mo13951Y0(obj2);
                    if (obj2.getClass() != this._beanType.getRawClass()) {
                        return handlePolymorphic(jsonParser, deserializationContext, obj2, fr6);
                    }
                    if (fr6 != null) {
                        obj2 = handleUnknownProperties(deserializationContext, obj2, fr6);
                    }
                    return deserialize(jsonParser, deserializationContext, obj2);
                }
            }
            g2 = jsonParser.mo13938N0();
        }
        try {
            obj = propertyBasedCreator.mo15598a(deserializationContext, g);
        } catch (Exception e5) {
            wrapInstantiationProblem(e5, deserializationContext);
            obj = null;
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (arrayList != null) {
            for (C1996b e6 : arrayList) {
                e6.mo15345e(obj);
            }
        }
        if (fr6 == null) {
            return obj;
        }
        if (obj.getClass() != this._beanType.getRawClass()) {
            return handlePolymorphic((JsonParser) null, deserializationContext, obj, fr6);
        }
        return handleUnknownProperties(deserializationContext, obj, fr6);
    }

    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e) {
            wrapAndThrow(e, this._beanType.getRawClass(), settableBeanProperty.getName(), deserializationContext);
            return null;
        }
    }

    public Object _deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, ey1 ey1) throws IOException {
        Class<?> cls;
        if (this._needViewProcesing) {
            cls = deserializationContext.getActiveView();
        } else {
            cls = null;
        }
        JsonToken g = jsonParser.mo13965g();
        while (g == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            JsonToken N0 = jsonParser.mo13938N0();
            SettableBeanProperty find = this._beanProperties.find(f);
            if (find != null) {
                if (N0.isScalarValue()) {
                    ey1.mo19542h(jsonParser, deserializationContext, f, obj);
                }
                if (cls == null || find.visibleInView(cls)) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, f, deserializationContext);
                    }
                } else {
                    jsonParser.mo13959c1();
                }
            } else if (IgnorePropertiesUtil.m14343c(f, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, f);
            } else if (!ey1.mo19541g(jsonParser, deserializationContext, f, obj)) {
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
        return ey1.mo19540f(jsonParser, deserializationContext, obj);
    }

    @Deprecated
    public Object _missingToken(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw deserializationContext.endOfInputException(handledType());
    }

    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder());
    }

    /* renamed from: c */
    public final C1996b mo15327c(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, ox4 ox4, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        C1996b bVar = new C1996b(deserializationContext, unresolvedForwardReference, settableBeanProperty.getType(), ox4, settableBeanProperty);
        unresolvedForwardReference.getRoid().mo15609a(bVar);
        return bVar;
    }

    /* renamed from: d */
    public final Object mo15328d(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.mo13951Y0(createUsingDefault);
        if (jsonParser.mo13987x0(5)) {
            String f = jsonParser.mo13964f();
            do {
                jsonParser.mo13938N0();
                SettableBeanProperty find = this._beanProperties.find(f);
                if (find != null) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, createUsingDefault, f, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, f);
                }
                f = jsonParser.mo13930E0();
            } while (f != null);
        }
        return createUsingDefault;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.mo13928C0()) {
            return _deserializeOther(jsonParser, deserializationContext, jsonParser.mo13965g());
        }
        if (this._vanillaProcessing) {
            return mo15328d(jsonParser, deserializationContext, jsonParser.mo13938N0());
        }
        jsonParser.mo13938N0();
        if (this._objectIdReader != null) {
            return deserializeWithObjectId(jsonParser, deserializationContext);
        }
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    public Object deserializeFromNull(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        if (!jsonParser.mo13948W0()) {
            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
        fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        bufferForInputBuffering.mo13855W();
        JsonParser z1 = bufferForInputBuffering.mo20094z1(jsonParser);
        z1.mo13938N0();
        if (this._vanillaProcessing) {
            obj = mo15328d(z1, deserializationContext, JsonToken.END_OBJECT);
        } else {
            obj = deserializeFromObject(z1, deserializationContext);
        }
        z1.close();
        return obj;
    }

    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> activeView;
        Object O;
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader != null && objectIdReader.maySerializeAsObject() && jsonParser.mo13987x0(5) && this._objectIdReader.isValidReferencePropertyName(jsonParser.mo13964f(), jsonParser)) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        if (!this._nonStandardCreation) {
            Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
            jsonParser.mo13951Y0(createUsingDefault);
            if (jsonParser.mo13957c() && (O = jsonParser.mo13939O()) != null) {
                _handleTypedObjectId(jsonParser, deserializationContext, createUsingDefault, O);
            }
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDefault);
            }
            if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
                return deserializeWithView(jsonParser, deserializationContext, createUsingDefault, activeView);
            }
            if (jsonParser.mo13987x0(5)) {
                String f = jsonParser.mo13964f();
                do {
                    jsonParser.mo13938N0();
                    SettableBeanProperty find = this._beanProperties.find(f);
                    if (find != null) {
                        try {
                            find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                        } catch (Exception e) {
                            wrapAndThrow(e, createUsingDefault, f, deserializationContext);
                        }
                    } else {
                        handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, f);
                    }
                    f = jsonParser.mo13930E0();
                } while (f != null);
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
        Class<?> cls;
        ey1 i = this._externalTypeIdHandler.mo19543i();
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        ox4 g = propertyBasedCreator.mo15602g(jsonParser, deserializationContext, this._objectIdReader);
        if (this._needViewProcesing) {
            cls = deserializationContext.getActiveView();
        } else {
            cls = null;
        }
        JsonToken g2 = jsonParser.mo13965g();
        while (g2 == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            JsonToken N0 = jsonParser.mo13938N0();
            SettableBeanProperty e = propertyBasedCreator.mo15600e(f);
            if (!g.mo24278i(f) || e != null) {
                if (e == null) {
                    SettableBeanProperty find = this._beanProperties.find(f);
                    if (find != null) {
                        if (N0.isScalarValue()) {
                            i.mo19542h(jsonParser, deserializationContext, f, (Object) null);
                        }
                        if (cls == null || find.visibleInView(cls)) {
                            g.mo24274e(find, find.deserialize(jsonParser, deserializationContext));
                        } else {
                            jsonParser.mo13959c1();
                        }
                    } else if (!i.mo19541g(jsonParser, deserializationContext, f, (Object) null)) {
                        if (IgnorePropertiesUtil.m14343c(f, this._ignorableProps, this._includableProps)) {
                            handleIgnoredProperty(jsonParser, deserializationContext, handledType(), f);
                        } else {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            if (settableAnyProperty != null) {
                                g.mo24272c(settableAnyProperty, f, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                            } else {
                                handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, f);
                            }
                        }
                    }
                } else if (!i.mo19541g(jsonParser, deserializationContext, f, (Object) null) && g.mo24271b(e, _deserializeWithErrorWrapping(jsonParser, deserializationContext, e))) {
                    jsonParser.mo13938N0();
                    try {
                        Object a = propertyBasedCreator.mo15598a(deserializationContext, g);
                        if (a.getClass() == this._beanType.getRawClass()) {
                            return _deserializeWithExternalTypeId(jsonParser, deserializationContext, a, i);
                        }
                        JavaType javaType = this._beanType;
                        return deserializationContext.reportBadDefinition(javaType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", new Object[]{javaType, a.getClass()}));
                    } catch (Exception e2) {
                        wrapAndThrow(e2, this._beanType.getRawClass(), f, deserializationContext);
                    }
                }
            }
            g2 = jsonParser.mo13938N0();
        }
        try {
            return i.mo19539e(jsonParser, deserializationContext, g, propertyBasedCreator);
        } catch (Exception e3) {
            return wrapInstantiationProblem(e3, deserializationContext);
        }
    }

    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
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
                        g.mo24274e(find, _deserializeWithErrorWrapping(jsonParser, deserializationContext, find));
                    } else if (IgnorePropertiesUtil.m14343c(f, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), f);
                    } else if (this._anySetter == null) {
                        bufferForInputBuffering.mo13864b0(f);
                        bufferForInputBuffering.mo20074B1(jsonParser);
                    } else {
                        fr6 bufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                        bufferForInputBuffering.mo13864b0(f);
                        bufferForInputBuffering.mo20091w1(bufferAsCopyOfValue);
                        try {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            g.mo24272c(settableAnyProperty, f, settableAnyProperty.deserialize(bufferAsCopyOfValue.mo20073A1(), deserializationContext));
                        } catch (Exception e2) {
                            wrapAndThrow(e2, this._beanType.getRawClass(), f, deserializationContext);
                        }
                    }
                } else if (g.mo24271b(e, _deserializeWithErrorWrapping(jsonParser, deserializationContext, e))) {
                    JsonToken N0 = jsonParser.mo13938N0();
                    try {
                        obj = propertyBasedCreator.mo15598a(deserializationContext, g);
                    } catch (Exception e3) {
                        obj = wrapInstantiationProblem(e3, deserializationContext);
                    }
                    jsonParser.mo13951Y0(obj);
                    while (N0 == JsonToken.FIELD_NAME) {
                        bufferForInputBuffering.mo20074B1(jsonParser);
                        N0 = jsonParser.mo13938N0();
                    }
                    JsonToken jsonToken = JsonToken.END_OBJECT;
                    if (N0 != jsonToken) {
                        deserializationContext.reportWrongTokenException((o43<?>) this, jsonToken, "Attempted to unwrap '%s' value", handledType().getName());
                    }
                    bufferForInputBuffering.mo13855W();
                    if (obj.getClass() == this._beanType.getRawClass()) {
                        return this._unwrappedPropertyHandler.mo27060b(jsonParser, deserializationContext, obj, bufferForInputBuffering);
                    }
                    deserializationContext.reportInputMismatch((BeanProperty) e, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                    return null;
                }
            }
            g2 = jsonParser.mo13938N0();
        }
        try {
            return this._unwrappedPropertyHandler.mo27060b(jsonParser, deserializationContext, propertyBasedCreator.mo15598a(deserializationContext, g), bufferForInputBuffering);
        } catch (Exception e4) {
            wrapInstantiationProblem(e4, deserializationContext);
            return null;
        }
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext);
        }
        o43<Object> o43 = this._delegateDeserializer;
        if (o43 != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, o43.deserialize(jsonParser, deserializationContext));
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
        jsonParser.mo13951Y0(createUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDefault);
        }
        String str = null;
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        if (jsonParser.mo13987x0(5)) {
            str = jsonParser.mo13964f();
        }
        while (str != null) {
            jsonParser.mo13938N0();
            SettableBeanProperty find = this._beanProperties.find(str);
            if (find != null) {
                if (activeView == null || find.visibleInView(activeView)) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, createUsingDefault, str, deserializationContext);
                    }
                } else {
                    jsonParser.mo13959c1();
                }
            } else if (IgnorePropertiesUtil.m14343c(str, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, createUsingDefault, str);
            } else if (this._anySetter == null) {
                bufferForInputBuffering.mo13864b0(str);
                bufferForInputBuffering.mo20074B1(jsonParser);
            } else {
                fr6 bufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                bufferForInputBuffering.mo13864b0(str);
                bufferForInputBuffering.mo20091w1(bufferAsCopyOfValue);
                try {
                    this._anySetter.deserializeAndSet(bufferAsCopyOfValue.mo20073A1(), deserializationContext, createUsingDefault, str);
                } catch (Exception e2) {
                    wrapAndThrow(e2, createUsingDefault, str, deserializationContext);
                }
            }
            str = jsonParser.mo13930E0();
        }
        bufferForInputBuffering.mo13855W();
        this._unwrappedPropertyHandler.mo27060b(jsonParser, deserializationContext, createUsingDefault, bufferForInputBuffering);
        return createUsingDefault;
    }

    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        if (jsonParser.mo13987x0(5)) {
            String f = jsonParser.mo13964f();
            do {
                jsonParser.mo13938N0();
                SettableBeanProperty find = this._beanProperties.find(f);
                if (find == null) {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, f);
                } else if (!find.visibleInView(cls)) {
                    jsonParser.mo13959c1();
                } else {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, f, deserializationContext);
                    }
                }
                f = jsonParser.mo13930E0();
            } while (f != null);
        }
        return obj;
    }

    public o43<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != BeanDeserializer.class || this.f9926a == nameTransformer) {
            return this;
        }
        this.f9926a = nameTransformer;
        try {
            return new BeanDeserializer((BeanDeserializerBase) this, nameTransformer);
        } finally {
            this.f9926a = null;
        }
    }

    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanDeserializer((BeanDeserializerBase) this, beanPropertyMap);
    }

    public BeanDeserializerBase withIgnoreAllUnknown(boolean z) {
        return new BeanDeserializer((BeanDeserializerBase) this, z);
    }

    public BeanDeserializer(o00 o00, n00 n00, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z, Set<String> set, boolean z2) {
        super(o00, n00, beanPropertyMap, map, hashSet, z, set, z2);
    }

    public BeanDeserializer withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanDeserializer(this, set, set2);
    }

    public BeanDeserializer withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanDeserializer((BeanDeserializerBase) this, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase, z);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase, objectIdReader);
    }

    @Deprecated
    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase, set);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        super(beanDeserializerBase, set, set2);
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return _deserializeWithExternalTypeId(jsonParser, deserializationContext, obj, this._externalTypeIdHandler.mo19543i());
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase, beanPropertyMap);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String str;
        Class<?> activeView;
        jsonParser.mo13951Y0(obj);
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            return deserializeWithUnwrapped(jsonParser, deserializationContext, obj);
        }
        if (this._externalTypeIdHandler != null) {
            return deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
        }
        if (jsonParser.mo13928C0()) {
            str = jsonParser.mo13930E0();
            if (str == null) {
                return obj;
            }
        } else if (!jsonParser.mo13987x0(5)) {
            return obj;
        } else {
            str = jsonParser.mo13964f();
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, obj, activeView);
        }
        do {
            jsonParser.mo13938N0();
            SettableBeanProperty find = this._beanProperties.find(str);
            if (find != null) {
                try {
                    find.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, str, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, str);
            }
            str = jsonParser.mo13930E0();
        } while (str != null);
        return obj;
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JsonToken g = jsonParser.mo13965g();
        if (g == JsonToken.START_OBJECT) {
            g = jsonParser.mo13938N0();
        }
        fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        bufferForInputBuffering.mo13852Q0();
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (g == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            SettableBeanProperty find = this._beanProperties.find(f);
            jsonParser.mo13938N0();
            if (find != null) {
                if (activeView == null || find.visibleInView(activeView)) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, f, deserializationContext);
                    }
                } else {
                    jsonParser.mo13959c1();
                }
            } else if (IgnorePropertiesUtil.m14343c(f, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, f);
            } else if (this._anySetter == null) {
                bufferForInputBuffering.mo13864b0(f);
                bufferForInputBuffering.mo20074B1(jsonParser);
            } else {
                fr6 bufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                bufferForInputBuffering.mo13864b0(f);
                bufferForInputBuffering.mo20091w1(bufferAsCopyOfValue);
                try {
                    this._anySetter.deserializeAndSet(bufferAsCopyOfValue.mo20073A1(), deserializationContext, obj, f);
                } catch (Exception e2) {
                    wrapAndThrow(e2, obj, f, deserializationContext);
                }
            }
            g = jsonParser.mo13938N0();
        }
        bufferForInputBuffering.mo13855W();
        this._unwrappedPropertyHandler.mo27060b(jsonParser, deserializationContext, obj, bufferForInputBuffering);
        return obj;
    }
}
