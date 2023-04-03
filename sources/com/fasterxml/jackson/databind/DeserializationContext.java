package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.C1974a;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.C1999a;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.C2001a;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class DeserializationContext extends k21 implements Serializable {
    private static final long serialVersionUID = 1;
    public transient C2103cq _arrayBuilders;
    public transient ContextAttributes _attributes;
    public final DeserializerCache _cache;
    public final DeserializationConfig _config;
    public th3<JavaType> _currentType;
    public transient DateFormat _dateFormat;
    public final C1999a _factory;
    public final int _featureFlags;
    public final iu2 _injectableValues;
    public transient we4 _objectBuffer;
    public transient JsonParser _parser;
    public final yz2<StreamReadCapability> _readCapabilities;
    public final Class<?> _view;

    /* renamed from: com.fasterxml.jackson.databind.DeserializationContext$a */
    public static /* synthetic */ class C1983a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9873a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.core.JsonToken[] r0 = com.fasterxml.jackson.core.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9873a = r0
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f9873a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.DeserializationContext.C1983a.<clinit>():void");
        }
    }

    public DeserializationContext(C1999a aVar) {
        this(aVar, (DeserializerCache) null);
    }

    public DateFormat _getDateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    public boolean _isCompatible(Class<?> cls, Object obj) {
        if (obj == null || cls.isInstance(obj)) {
            return true;
        }
        if (!cls.isPrimitive() || !wf0.m29529o0(cls).isInstance(obj)) {
            return false;
        }
        return true;
    }

    public String _shapeForToken(JsonToken jsonToken) {
        if (jsonToken == null) {
            return "<end of input>";
        }
        switch (C1983a.f9873a[jsonToken.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "Object value";
            case 4:
            case 5:
                return "Array value";
            case 6:
            case 7:
                return "Boolean value";
            case 8:
                return "Embedded Object";
            case 9:
                return "Floating-point value";
            case 10:
                return "Integer value";
            case 11:
                return "String value";
            case 12:
                return "Null value";
            default:
                return "[Unavailable value]";
        }
    }

    /* renamed from: b */
    public final tx6 mo14291b(g53 g53) throws IOException {
        xe4 xe4;
        JsonParser jsonParser = this._parser;
        if (jsonParser == null) {
            xe4 = null;
        } else {
            xe4 = jsonParser.mo13980p();
        }
        tx6 tx6 = new tx6(g53, xe4);
        tx6.mo13938N0();
        return tx6;
    }

    public fr6 bufferAsCopyOfValue(JsonParser jsonParser) throws IOException {
        fr6 bufferForInputBuffering = bufferForInputBuffering(jsonParser);
        bufferForInputBuffering.mo20074B1(jsonParser);
        return bufferForInputBuffering;
    }

    public fr6 bufferForInputBuffering(JsonParser jsonParser) {
        return new fr6(jsonParser, this);
    }

    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public abstract void checkUnresolvedObjectId() throws UnresolvedForwardReference;

    public Calendar constructCalendar(Date date) {
        Calendar instance = Calendar.getInstance(getTimeZone());
        instance.setTime(date);
        return instance;
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        if (javaType.hasRawClass(cls)) {
            return javaType;
        }
        return getConfig().getTypeFactory().constructSpecializedType(javaType, cls, false);
    }

    public final JavaType constructType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this._config.constructType(cls);
    }

    public abstract o43<Object> deserializerInstance(C2911nl nlVar, Object obj) throws JsonMappingException;

    @Deprecated
    public JsonMappingException endOfInputException(Class<?> cls) {
        JsonParser jsonParser = this._parser;
        return MismatchedInputException.from(jsonParser, cls, "Unexpected end-of-input when trying to deserialize a " + cls.getName());
    }

    public String extractScalarFromObject(JsonParser jsonParser, o43<?> o43, Class<?> cls) throws IOException {
        return (String) handleUnexpectedToken(cls, jsonParser);
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        return getTypeFactory().findClass(str);
    }

    public CoercionAction findCoercionAction(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this._config.findCoercionAction(logicalType, cls, coercionInputShape);
    }

    public CoercionAction findCoercionFromBlankString(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this._config.findCoercionFromBlankString(logicalType, cls, coercionAction);
    }

    public final o43<Object> findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        o43<Object> findValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        if (findValueDeserializer != null) {
            return handleSecondaryContextualization(findValueDeserializer, beanProperty, javaType);
        }
        return findValueDeserializer;
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) throws JsonMappingException {
        return reportBadDefinition(wf0.m29516i(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", new Object[]{obj}));
    }

    public final ha3 findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        ha3 ha3;
        try {
            ha3 = this._cache.findKeyDeserializer(this, this._factory, javaType);
        } catch (IllegalArgumentException e) {
            reportBadDefinition(javaType, wf0.m29528o(e));
            ha3 = null;
        }
        if (ha3 instanceof ks0) {
            return ((ks0) ha3).createContextual(this, beanProperty);
        }
        return ha3;
    }

    public final o43<Object> findNonContextualValueDeserializer(JavaType javaType) throws JsonMappingException {
        return this._cache.findValueDeserializer(this, this._factory, javaType);
    }

    public abstract C2001a findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, C1974a aVar);

    public final o43<Object> findRootValueDeserializer(JavaType javaType) throws JsonMappingException {
        o43<Object> findValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        if (findValueDeserializer == null) {
            return null;
        }
        o43<?> handleSecondaryContextualization = handleSecondaryContextualization(findValueDeserializer, (BeanProperty) null, javaType);
        j07 findTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        if (findTypeDeserializer != null) {
            return new TypeWrappedDeserializer(findTypeDeserializer.forProperty((BeanProperty) null), handleSecondaryContextualization);
        }
        return handleSecondaryContextualization;
    }

    public final Class<?> getActiveView() {
        return this._view;
    }

    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public final C2103cq getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new C2103cq();
        }
        return this._arrayBuilders;
    }

    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    public JavaType getContextualType() {
        th3<JavaType> th3 = this._currentType;
        if (th3 == null) {
            return null;
        }
        return th3.mo26449d();
    }

    @Deprecated
    public DateFormat getDateFormat() {
        return _getDateFormat();
    }

    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final int getDeserializationFeatures() {
        return this._featureFlags;
    }

    public C1999a getFactory() {
        return this._factory;
    }

    public Locale getLocale() {
        return this._config.getLocale();
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._config.getNodeFactory();
    }

    public final JsonParser getParser() {
        return this._parser;
    }

    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public void handleBadMerge(o43<?> o43) throws JsonMappingException {
        if (!isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            JavaType constructType = constructType(o43.handledType());
            throw InvalidDefinitionException.from(getParser(), String.format("Invalid configuration: values of type %s cannot be merged", new Object[]{wf0.m29480G(constructType)}), constructType);
        }
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th) throws IOException {
        for (th3<nd1> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.mo26448c()) {
            Object a = problemHandlers.mo26449d().mo23648a(this, cls, obj, th);
            if (a != nd1.f15523a) {
                if (_isCompatible(cls, a)) {
                    return a;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", new Object[]{wf0.m29539y(cls), wf0.m29514h(a)}));
            }
        }
        wf0.m29517i0(th);
        if (!isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            wf0.m29519j0(th);
        }
        throw instantiationException(cls, th);
    }

    public Object handleMissingInstantiator(Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        if (jsonParser == null) {
            jsonParser = getParser();
        }
        String _format = _format(str, objArr);
        for (th3<nd1> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.mo26448c()) {
            Object c = problemHandlers.mo26449d().mo23650c(this, cls, valueInstantiator, jsonParser, _format);
            if (c != nd1.f15523a) {
                if (_isCompatible(cls, c)) {
                    return c;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", new Object[]{wf0.m29539y(cls), wf0.m29539y(c)}));
            }
        }
        if (valueInstantiator == null) {
            return reportBadDefinition(cls, String.format("Cannot construct instance of %s: %s", new Object[]{wf0.m29497X(cls), _format}));
        } else if (!valueInstantiator.canInstantiate()) {
            return reportBadDefinition(cls, String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", new Object[]{wf0.m29497X(cls), _format}));
        } else {
            return reportInputMismatch(cls, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", new Object[]{wf0.m29497X(cls), _format}), new Object[0]);
        }
    }

    public JavaType handleMissingTypeId(JavaType javaType, r07 r07, String str) throws IOException {
        th3<nd1> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            JavaType d = problemHandlers.mo26449d().mo23651d(this, javaType, r07, str);
            if (d == null) {
                problemHandlers = problemHandlers.mo26448c();
            } else if (d.hasRawClass(Void.class)) {
                return null;
            } else {
                if (d.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return d;
                }
                throw invalidTypeIdException(javaType, (String) null, "problem handler tried to resolve into non-subtype: " + wf0.m29480G(d));
            }
        }
        throw missingTypeIdException(javaType, str);
    }

    public o43<?> handlePrimaryContextualization(o43<?> o43, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (o43 instanceof js0) {
            this._currentType = new th3<>(javaType, this._currentType);
            try {
                o43 = ((js0) o43).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.mo26448c();
            }
        }
        return o43;
    }

    public o43<?> handleSecondaryContextualization(o43<?> o43, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (o43 instanceof js0) {
            this._currentType = new th3<>(javaType, this._currentType);
            try {
                o43 = ((js0) o43).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.mo26448c();
            }
        }
        return o43;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonParser.mo13965g(), jsonParser, (String) null, new Object[0]);
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, o43<?> o43, Object obj, String str) throws IOException {
        Collection<Object> collection;
        for (th3<nd1> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.mo26448c()) {
            if (problemHandlers.mo26449d().mo23654g(this, jsonParser, o43, obj, str)) {
                return true;
            }
        }
        if (!isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            jsonParser.mo13959c1();
            return true;
        }
        if (o43 == null) {
            collection = null;
        } else {
            collection = o43.getKnownPropertyNames();
        }
        throw UnrecognizedPropertyException.from(this._parser, obj, str, collection);
    }

    public JavaType handleUnknownTypeId(JavaType javaType, String str, r07 r07, String str2) throws IOException {
        th3<nd1> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            JavaType h = problemHandlers.mo26449d().mo23655h(this, javaType, str, r07, str2);
            if (h == null) {
                problemHandlers = problemHandlers.mo26448c();
            } else if (h.hasRawClass(Void.class)) {
                return null;
            } else {
                if (h.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return h;
                }
                throw invalidTypeIdException(javaType, str, "problem handler tried to resolve into non-subtype: " + wf0.m29480G(h));
            }
        }
        if (!isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            return null;
        }
        throw invalidTypeIdException(javaType, str, str2);
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String _format = _format(str2, objArr);
        th3<nd1> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object i = problemHandlers.mo26449d().mo23656i(this, cls, str, _format);
            if (i == nd1.f15523a) {
                problemHandlers = problemHandlers.mo26448c();
            } else if (i == null || cls.isInstance(i)) {
                return i;
            } else {
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", new Object[]{wf0.m29539y(cls), wf0.m29539y(i)}));
            }
        }
        throw weirdKeyException(cls, str, _format);
    }

    public Object handleWeirdNativeValue(JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        th3<nd1> problemHandlers = this._config.getProblemHandlers();
        Class<?> rawClass = javaType.getRawClass();
        while (problemHandlers != null) {
            Object j = problemHandlers.mo26449d().mo23657j(this, javaType, obj, jsonParser);
            if (j == nd1.f15523a) {
                problemHandlers = problemHandlers.mo26448c();
            } else if (j == null || rawClass.isInstance(j)) {
                return j;
            } else {
                throw JsonMappingException.from(jsonParser, _format("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", wf0.m29539y(javaType), wf0.m29539y(j)));
            }
        }
        throw weirdNativeValueException(obj, rawClass);
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String _format = _format(str, objArr);
        th3<nd1> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object k = problemHandlers.mo26449d().mo23658k(this, cls, number, _format);
            if (k == nd1.f15523a) {
                problemHandlers = problemHandlers.mo26448c();
            } else if (_isCompatible(cls, k)) {
                return k;
            } else {
                throw weirdNumberException(number, cls, _format("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", wf0.m29539y(cls), wf0.m29539y(k)));
            }
        }
        throw weirdNumberException(number, cls, _format);
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String _format = _format(str2, objArr);
        th3<nd1> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object l = problemHandlers.mo26449d().mo23659l(this, cls, str, _format);
            if (l == nd1.f15523a) {
                problemHandlers = problemHandlers.mo26448c();
            } else if (_isCompatible(cls, l)) {
                return l;
            } else {
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", new Object[]{wf0.m29539y(cls), wf0.m29539y(l)}));
            }
        }
        throw weirdStringException(str, cls, _format);
    }

    public final boolean hasDeserializationFeatures(int i) {
        if ((this._featureFlags & i) == i) {
            return true;
        }
        return false;
    }

    public final boolean hasSomeOfFeatures(int i) {
        if ((i & this._featureFlags) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasValueDeserializerFor(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        try {
            return this._cache.hasValueDeserializerFor(this, this._factory, javaType);
        } catch (DatabindException e) {
            if (atomicReference == null) {
                return false;
            }
            atomicReference.set(e);
            return false;
        } catch (RuntimeException e2) {
            if (atomicReference != null) {
                atomicReference.set(e2);
                return false;
            }
            throw e2;
        }
    }

    public JsonMappingException instantiationException(Class<?> cls, Throwable th) {
        String str;
        if (th == null) {
            str = xg5.MISSING_REASON;
        } else {
            str = wf0.m29528o(th);
            if (str == null) {
                str = wf0.m29497X(th.getClass());
            }
        }
        return ValueInstantiationException.from(this._parser, String.format("Cannot construct instance of %s, problem: %s", new Object[]{wf0.m29497X(cls), str}), constructType(cls), th);
    }

    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, wf0.m29480G(javaType)}), str2), javaType, str);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public abstract ha3 keyDeserializerInstance(C2911nl nlVar, Object obj) throws JsonMappingException;

    public final we4 leaseObjectBuffer() {
        we4 we4 = this._objectBuffer;
        if (we4 == null) {
            return new we4();
        }
        this._objectBuffer = null;
        return we4;
    }

    @Deprecated
    public JsonMappingException mappingException(String str) {
        return JsonMappingException.from(getParser(), str);
    }

    public JsonMappingException missingTypeIdException(JavaType javaType, String str) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve subtype of %s", new Object[]{javaType}), str), javaType, (String) null);
    }

    public Date parseDate(String str) throws IllegalArgumentException {
        try {
            return _getDateFormat().parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", new Object[]{str, wf0.m29528o(e)}));
        }
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, Class<T> cls) throws IOException {
        return readPropertyValue(jsonParser, beanProperty, getTypeFactory().constructType((Type) cls));
    }

    public g53 readTree(JsonParser jsonParser) throws IOException {
        JsonToken g = jsonParser.mo13965g();
        if (g == null && (g = jsonParser.mo13938N0()) == null) {
            return getNodeFactory().missingNode();
        }
        if (g == JsonToken.VALUE_NULL) {
            return getNodeFactory().nullNode();
        }
        return (g53) findRootValueDeserializer(this._config.constructType((Class<?>) g53.class)).deserialize(jsonParser, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (r2 != null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        r3.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T readTreeAsValue(p000.g53 r2, java.lang.Class<T> r3) throws java.io.IOException {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0004
            r2 = 0
            return r2
        L_0x0004:
            tx6 r2 = r1.mo14291b(r2)
            java.lang.Object r3 = r1.readValue((com.fasterxml.jackson.core.JsonParser) r2, r3)     // Catch:{ all -> 0x0012 }
            if (r2 == 0) goto L_0x0011
            r2.close()
        L_0x0011:
            return r3
        L_0x0012:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            if (r2 == 0) goto L_0x001f
            r2.close()     // Catch:{ all -> 0x001b }
            goto L_0x001f
        L_0x001b:
            r2 = move-exception
            r3.addSuppressed(r2)
        L_0x001f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.DeserializationContext.readTreeAsValue(g53, java.lang.Class):java.lang.Object");
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        return readValue(jsonParser, getTypeFactory().constructType((Type) cls));
    }

    public <T> T reportBadCoercion(o43<?> o43, Class<?> cls, Object obj, String str, Object... objArr) throws JsonMappingException {
        throw InvalidFormatException.from(getParser(), _format(str, objArr), obj, cls);
    }

    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, str, javaType);
    }

    @Deprecated
    public <T> T reportBadMerge(o43<?> o43) throws JsonMappingException {
        handleBadMerge(o43);
        return null;
    }

    public <T> T reportBadPropertyDefinition(n00 n00, q00 q00, String str, Object... objArr) throws JsonMappingException {
        String _format = _format(str, objArr);
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid definition for property %s (of type %s): %s", new Object[]{wf0.m29496W(q00), wf0.m29497X(n00.mo23460r()), _format}), n00, q00);
    }

    public <T> T reportBadTypeDefinition(n00 n00, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid type definition for type %s: %s", new Object[]{wf0.m29497X(n00.mo23460r()), _format(str, objArr)}), n00, (q00) null);
    }

    public <T> T reportInputMismatch(o43<?> o43, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), o43.handledType(), _format(str, objArr));
    }

    @Deprecated
    public void reportMappingException(String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getParser(), _format(str, objArr));
    }

    @Deprecated
    public void reportMissingContent(String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), (JavaType) null, "No content to map due to end-of-input");
    }

    public <T> T reportPropertyInputMismatch(Class<?> cls, String str, String str2, Object... objArr) throws JsonMappingException {
        MismatchedInputException from = MismatchedInputException.from(getParser(), cls, _format(str2, objArr));
        if (str != null) {
            from.prependPath((Object) cls, str);
        }
        throw from;
    }

    public <T> T reportTrailingTokens(Class<?> cls, JsonParser jsonParser, JsonToken jsonToken) throws JsonMappingException {
        throw MismatchedInputException.from(jsonParser, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", new Object[]{jsonToken, wf0.m29497X(cls)}));
    }

    @Deprecated
    public void reportUnknownProperty(Object obj, String str, o43<?> o43) throws JsonMappingException {
        Collection<Object> collection;
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            if (o43 == null) {
                collection = null;
            } else {
                collection = o43.getKnownPropertyNames();
            }
            throw UnrecognizedPropertyException.from(this._parser, obj, str, collection);
        }
    }

    public <T> T reportUnresolvedObjectId(ObjectIdReader objectIdReader, Object obj) throws JsonMappingException {
        return reportInputMismatch((BeanProperty) objectIdReader.idProperty, String.format("No Object Id found for an instance of %s, to assign to property '%s'", new Object[]{wf0.m29514h(obj), objectIdReader.propertyName}), new Object[0]);
    }

    public void reportWrongTokenException(o43<?> o43, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), o43.handledType(), jsonToken, _format(str, objArr));
    }

    public final void returnObjectBuffer(we4 we4) {
        if (this._objectBuffer == null || we4.mo27497h() >= this._objectBuffer.mo27497h()) {
            this._objectBuffer = we4;
        }
    }

    @Deprecated
    public JsonMappingException unknownTypeException(JavaType javaType, String str, String str2) {
        return MismatchedInputException.from(this._parser, javaType, _colonConcat(String.format("Could not resolve type id '%s' into a subtype of %s", new Object[]{str, wf0.m29480G(javaType)}), str2));
    }

    public JsonMappingException weirdKeyException(Class<?> cls, String str, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize Map key of type %s from String %s: %s", new Object[]{wf0.m29497X(cls), _quotedString(str), str2}), str, cls);
    }

    public JsonMappingException weirdNativeValueException(Object obj, Class<?> cls) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", new Object[]{wf0.m29497X(cls), wf0.m29514h(obj)}), obj, cls);
    }

    public JsonMappingException weirdNumberException(Number number, Class<?> cls, String str) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from number %s: %s", new Object[]{wf0.m29497X(cls), String.valueOf(number), str}), number, cls);
    }

    public JsonMappingException weirdStringException(String str, Class<?> cls, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from String %s: %s", new Object[]{wf0.m29497X(cls), _quotedString(str), str2}), str, cls);
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, JavaType javaType, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, javaType, _colonConcat(String.format("Unexpected token (%s), expected %s", new Object[]{jsonParser.mo13965g(), jsonToken}), str));
    }

    public DeserializationContext(C1999a aVar, DeserializerCache deserializerCache) {
        if (aVar != null) {
            this._factory = aVar;
            this._cache = deserializerCache == null ? new DeserializerCache() : deserializerCache;
            this._featureFlags = 0;
            this._readCapabilities = null;
            this._config = null;
            this._view = null;
            this._attributes = null;
            return;
        }
        throw new NullPointerException("Cannot pass null DeserializerFactory");
    }

    public final fr6 bufferForInputBuffering() {
        return bufferForInputBuffering(getParser());
    }

    public DeserializationConfig getConfig() {
        return this._config;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonToken, jsonParser, str, objArr);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._featureFlags) != 0;
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getParser(), _format(str, objArr));
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, JavaType javaType) throws IOException {
        o43<Object> findContextualValueDeserializer = findContextualValueDeserializer(javaType, beanProperty);
        if (findContextualValueDeserializer != null) {
            return findContextualValueDeserializer.deserialize(jsonParser, this);
        }
        return reportBadDefinition(javaType, String.format("Could not find JsonDeserializer for type %s (via property %s)", new Object[]{wf0.m29480G(javaType), wf0.m29496W(beanProperty)}));
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        o43<Object> findRootValueDeserializer = findRootValueDeserializer(javaType);
        if (findRootValueDeserializer != null) {
            return findRootValueDeserializer.deserialize(jsonParser, this);
        }
        return reportBadDefinition(javaType, "Could not find JsonDeserializer for type " + wf0.m29480G(javaType));
    }

    public DeserializationContext setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(javaType, jsonParser.mo13965g(), jsonParser, (String) null, new Object[0]);
    }

    public final boolean isEnabled(StreamReadCapability streamReadCapability) {
        return this._readCapabilities.mo28276b(streamReadCapability);
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls) {
        return mappingException(cls, this._parser.mo13965g());
    }

    public <T> T reportInputMismatch(Class<?> cls, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), cls, _format(str, objArr));
    }

    public void reportWrongTokenException(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), javaType, jsonToken, _format(str, objArr));
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        String _format = _format(str, objArr);
        for (th3<nd1> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.mo26448c()) {
            Object e = problemHandlers.mo26449d().mo23652e(this, javaType, jsonToken, jsonParser, _format);
            if (e != nd1.f15523a) {
                if (_isCompatible(javaType.getRawClass(), e)) {
                    return e;
                }
                reportBadDefinition(javaType, String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", new Object[]{wf0.m29480G(javaType), wf0.m29514h(e)}));
            }
        }
        if (_format == null) {
            String G = wf0.m29480G(javaType);
            if (jsonToken == null) {
                _format = String.format("Unexpected end-of-input when trying read value of type %s", new Object[]{G});
            } else {
                _format = String.format("Cannot deserialize value of type %s from %s (token `JsonToken.%s`)", new Object[]{G, _shapeForToken(jsonToken), jsonToken});
            }
        }
        if (jsonToken != null && jsonToken.isScalarValue()) {
            jsonParser.mo13947W();
        }
        reportInputMismatch(javaType, _format, new Object[0]);
        return null;
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls, JsonToken jsonToken) {
        return JsonMappingException.from(this._parser, String.format("Cannot deserialize instance of %s out of %s token", new Object[]{wf0.m29497X(cls), jsonToken}));
    }

    public <T> T reportInputMismatch(JavaType javaType, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), javaType, _format(str, objArr));
    }

    public <T> T reportPropertyInputMismatch(JavaType javaType, String str, String str2, Object... objArr) throws JsonMappingException {
        return reportPropertyInputMismatch(javaType.getRawClass(), str, str2, objArr);
    }

    public void reportWrongTokenException(Class<?> cls, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), cls, jsonToken, _format(str, objArr));
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, cls, _colonConcat(String.format("Unexpected token (%s), expected %s", new Object[]{jsonParser.mo13965g(), jsonToken}), str));
    }

    public JsonMappingException instantiationException(Class<?> cls, String str) {
        return ValueInstantiationException.from(this._parser, String.format("Cannot construct instance of %s: %s", new Object[]{wf0.m29497X(cls), str}), constructType(cls));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (r2 != null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        r3.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T readTreeAsValue(p000.g53 r2, com.fasterxml.jackson.databind.JavaType r3) throws java.io.IOException {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0004
            r2 = 0
            return r2
        L_0x0004:
            tx6 r2 = r1.mo14291b(r2)
            java.lang.Object r3 = r1.readValue((com.fasterxml.jackson.core.JsonParser) r2, (com.fasterxml.jackson.databind.JavaType) r3)     // Catch:{ all -> 0x0012 }
            if (r2 == 0) goto L_0x0011
            r2.close()
        L_0x0011:
            return r3
        L_0x0012:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            if (r2 == 0) goto L_0x001f
            r2.close()     // Catch:{ all -> 0x001b }
            goto L_0x001f
        L_0x001b:
            r2 = move-exception
            r3.addSuppressed(r2)
        L_0x001f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.DeserializationContext.readTreeAsValue(g53, com.fasterxml.jackson.databind.JavaType):java.lang.Object");
    }

    public <T> T reportInputMismatch(BeanProperty beanProperty, String str, Object... objArr) throws JsonMappingException {
        JavaType javaType;
        AnnotatedMember member;
        String _format = _format(str, objArr);
        if (beanProperty == null) {
            javaType = null;
        } else {
            javaType = beanProperty.getType();
        }
        MismatchedInputException from = MismatchedInputException.from(getParser(), javaType, _format);
        if (!(beanProperty == null || (member = beanProperty.getMember()) == null)) {
            from.prependPath((Object) member.getDeclaringClass(), beanProperty.getName());
        }
        throw from;
    }

    @Deprecated
    public void reportWrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(jsonParser, jsonToken, _format(str, objArr));
    }

    @Deprecated
    public JsonMappingException wrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        return wrongTokenException(jsonParser, (JavaType) null, jsonToken, str);
    }

    public DeserializationContext(DeserializationContext deserializationContext, C1999a aVar) {
        this._cache = deserializationContext._cache;
        this._factory = aVar;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._readCapabilities = deserializationContext._readCapabilities;
        this._view = deserializationContext._view;
        this._parser = deserializationContext._parser;
        this._attributes = deserializationContext._attributes;
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, iu2 iu2) {
        yz2<StreamReadCapability> yz2;
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        if (jsonParser == null) {
            yz2 = null;
        } else {
            yz2 = jsonParser.mo13943Q();
        }
        this._readCapabilities = yz2;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = deserializationConfig.getActiveView();
        this._parser = jsonParser;
        this._attributes = deserializationConfig.getAttributes();
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._readCapabilities = null;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = null;
        this._parser = null;
        this._attributes = null;
    }

    public DeserializationContext(DeserializationContext deserializationContext) {
        this._cache = new DeserializerCache();
        this._factory = deserializationContext._factory;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._readCapabilities = deserializationContext._readCapabilities;
        this._view = deserializationContext._view;
    }
}
