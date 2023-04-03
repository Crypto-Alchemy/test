package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.C1979c;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.filter.C1980a;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.s11;

public class ObjectReader extends xe4 implements Serializable {
    private static final long serialVersionUID = 2;
    public final DeserializationConfig _config;
    public final DefaultDeserializationContext _context;
    public final s11 _dataFormatReaders;
    private final TokenFilter _filter;
    public final iu2 _injectableValues;
    public transient JavaType _jsonNodeType;
    public final JsonFactory _parserFactory;
    public final o43<Object> _rootDeserializer;
    public final ConcurrentHashMap<JavaType, o43<Object>> _rootDeserializers;
    public final d82 _schema;
    public final boolean _unwrapRoot;
    public final Object _valueToUpdate;
    public final JavaType _valueType;

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig) {
        this(objectMapper, deserializationConfig, (JavaType) null, (Object) null, (d82) null, (iu2) null);
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", new Object[]{str}));
        }
    }

    public Object _bind(JsonParser jsonParser, Object obj) throws IOException {
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        JsonToken _initForReading = _initForReading(createDeserializationContext, jsonParser);
        if (_initForReading == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = _findRootDeserializer(createDeserializationContext).getNullValue(createDeserializationContext);
            }
        } else if (!(_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT)) {
            obj = createDeserializationContext.readRootValue(jsonParser, this._valueType, _findRootDeserializer(createDeserializationContext), this._valueToUpdate);
        }
        jsonParser.mo13962e();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createDeserializationContext, this._valueType);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        if (r5 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r0.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _bindAndClose(com.fasterxml.jackson.core.JsonParser r5) throws java.io.IOException {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r0 = r4.createDeserializationContext(r5)     // Catch:{ all -> 0x0046 }
            com.fasterxml.jackson.core.JsonToken r1 = r4._initForReading(r0, r5)     // Catch:{ all -> 0x0046 }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x0046 }
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0031
            o43 r1 = r4._findRootDeserializer(r0)     // Catch:{ all -> 0x0046 }
            java.lang.Object r1 = r1.getNullValue(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x0031
        L_0x0019:
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ all -> 0x0046 }
            if (r1 == r2) goto L_0x002f
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ all -> 0x0046 }
            if (r1 != r2) goto L_0x0022
            goto L_0x002f
        L_0x0022:
            com.fasterxml.jackson.databind.JavaType r1 = r4._valueType     // Catch:{ all -> 0x0046 }
            o43 r2 = r4._findRootDeserializer(r0)     // Catch:{ all -> 0x0046 }
            java.lang.Object r3 = r4._valueToUpdate     // Catch:{ all -> 0x0046 }
            java.lang.Object r1 = r0.readRootValue(r5, r1, r2, r3)     // Catch:{ all -> 0x0046 }
            goto L_0x0031
        L_0x002f:
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x0046 }
        L_0x0031:
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r4._config     // Catch:{ all -> 0x0046 }
            com.fasterxml.jackson.databind.DeserializationFeature r3 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0046 }
            boolean r2 = r2.isEnabled(r3)     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0040
            com.fasterxml.jackson.databind.JavaType r2 = r4._valueType     // Catch:{ all -> 0x0046 }
            r4._verifyNoTrailingTokens(r5, r0, r2)     // Catch:{ all -> 0x0046 }
        L_0x0040:
            if (r5 == 0) goto L_0x0045
            r5.close()
        L_0x0045:
            return r1
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r1 = move-exception
            if (r5 == 0) goto L_0x0053
            r5.close()     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r5 = move-exception
            r0.addSuppressed(r5)
        L_0x0053:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectReader._bindAndClose(com.fasterxml.jackson.core.JsonParser):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        r0.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        if (r3 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.g53 _bindAndCloseAsTree(com.fasterxml.jackson.core.JsonParser r3) throws java.io.IOException {
        /*
            r2 = this;
            g53 r0 = r2._bindAsTree(r3)     // Catch:{ all -> 0x000a }
            if (r3 == 0) goto L_0x0009
            r3.close()
        L_0x0009:
            return r0
        L_0x000a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000c }
        L_0x000c:
            r1 = move-exception
            if (r3 == 0) goto L_0x0017
            r3.close()     // Catch:{ all -> 0x0013 }
            goto L_0x0017
        L_0x0013:
            r3 = move-exception
            r0.addSuppressed(r3)
        L_0x0017:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectReader._bindAndCloseAsTree(com.fasterxml.jackson.core.JsonParser):g53");
    }

    public <T> wn3<T> _bindAndReadValues(JsonParser jsonParser) throws IOException {
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        _initForMultiRead(createDeserializationContext, jsonParser);
        jsonParser.mo13938N0();
        return _newIterator(jsonParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext), true);
    }

    public final g53 _bindAsTree(JsonParser jsonParser) throws IOException {
        g53 g53;
        Object obj = this._valueToUpdate;
        if (obj != null) {
            return (g53) _bind(jsonParser, obj);
        }
        this._config.initialize(jsonParser);
        d82 d82 = this._schema;
        if (d82 != null) {
            jsonParser.mo13954a1(d82);
        }
        JsonToken g = jsonParser.mo13965g();
        if (g == null && (g = jsonParser.mo13938N0()) == null) {
            return this._config.getNodeFactory().missingNode();
        }
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        if (g == JsonToken.VALUE_NULL) {
            g53 = this._config.getNodeFactory().nullNode();
        } else {
            g53 = (g53) createDeserializationContext.readRootValue(jsonParser, _jsonNodeType(), _findTreeDeserializer(createDeserializationContext), (Object) null);
        }
        jsonParser.mo13962e();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createDeserializationContext, _jsonNodeType());
        }
        return g53;
    }

    public final g53 _bindAsTreeOrNull(JsonParser jsonParser) throws IOException {
        g53 g53;
        Object obj = this._valueToUpdate;
        if (obj != null) {
            return (g53) _bind(jsonParser, obj);
        }
        this._config.initialize(jsonParser);
        d82 d82 = this._schema;
        if (d82 != null) {
            jsonParser.mo13954a1(d82);
        }
        JsonToken g = jsonParser.mo13965g();
        if (g == null && (g = jsonParser.mo13938N0()) == null) {
            return null;
        }
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        if (g == JsonToken.VALUE_NULL) {
            g53 = this._config.getNodeFactory().nullNode();
        } else {
            g53 = (g53) createDeserializationContext.readRootValue(jsonParser, _jsonNodeType(), _findTreeDeserializer(createDeserializationContext), (Object) null);
        }
        jsonParser.mo13962e();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createDeserializationContext, _jsonNodeType());
        }
        return g53;
    }

    public JsonParser _considerFilter(JsonParser jsonParser, boolean z) {
        if (this._filter == null || C1980a.class.isInstance(jsonParser)) {
            return jsonParser;
        }
        return new C1980a(jsonParser, this._filter, TokenFilter.Inclusion.ONLY_INCLUDE_ALL, z);
    }

    public Object _detectBindAndClose(byte[] bArr, int i, int i2) throws IOException {
        s11.C3241b c = this._dataFormatReaders.mo25605c(bArr, i, i2);
        if (!c.mo25613d()) {
            _reportUnkownFormat(this._dataFormatReaders, c);
        }
        return c.mo25612c()._bindAndClose(c.mo25610a());
    }

    public g53 _detectBindAndCloseAsTree(InputStream inputStream) throws IOException {
        s11.C3241b b = this._dataFormatReaders.mo25604b(inputStream);
        if (!b.mo25613d()) {
            _reportUnkownFormat(this._dataFormatReaders, b);
        }
        JsonParser a = b.mo25610a();
        a.mo13969i(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        return b.mo25612c()._bindAndCloseAsTree(a);
    }

    public <T> wn3<T> _detectBindAndReadValues(s11.C3241b bVar, boolean z) throws IOException {
        if (!bVar.mo25613d()) {
            _reportUnkownFormat(this._dataFormatReaders, bVar);
        }
        JsonParser a = bVar.mo25610a();
        if (z) {
            a.mo13969i(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return bVar.mo25612c()._bindAndReadValues(a);
    }

    public o43<Object> _findRootDeserializer(DeserializationContext deserializationContext) throws DatabindException {
        o43<Object> o43 = this._rootDeserializer;
        if (o43 != null) {
            return o43;
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        }
        o43<Object> o432 = this._rootDeserializers.get(javaType);
        if (o432 != null) {
            return o432;
        }
        o43<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (findRootValueDeserializer == null) {
            deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, findRootValueDeserializer);
        return findRootValueDeserializer;
    }

    public o43<Object> _findTreeDeserializer(DeserializationContext deserializationContext) throws DatabindException {
        JavaType _jsonNodeType2 = _jsonNodeType();
        o43<Object> o43 = this._rootDeserializers.get(_jsonNodeType2);
        if (o43 == null) {
            o43 = deserializationContext.findRootValueDeserializer(_jsonNodeType2);
            if (o43 == null) {
                deserializationContext.reportBadDefinition(_jsonNodeType2, "Cannot find a deserializer for type " + _jsonNodeType2);
            }
            this._rootDeserializers.put(_jsonNodeType2, o43);
        }
        return o43;
    }

    public void _initForMultiRead(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this._config.initialize(jsonParser, this._schema);
    }

    public JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this._config.initialize(jsonParser, this._schema);
        JsonToken g = jsonParser.mo13965g();
        if (g == null && (g = jsonParser.mo13938N0()) == null) {
            deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
        }
        return g;
    }

    public InputStream _inputStream(URL url) throws IOException {
        return url.openStream();
    }

    public final JavaType _jsonNodeType() {
        JavaType javaType = this._jsonNodeType;
        if (javaType != null) {
            return javaType;
        }
        JavaType constructType = getTypeFactory().constructType((Type) g53.class);
        this._jsonNodeType = constructType;
        return constructType;
    }

    public ObjectReader _new(ObjectReader objectReader, JsonFactory jsonFactory) {
        return new ObjectReader(objectReader, jsonFactory);
    }

    public <T> wn3<T> _newIterator(JsonParser jsonParser, DeserializationContext deserializationContext, o43<?> o43, boolean z) {
        return new wn3(this._valueType, jsonParser, deserializationContext, o43, z, this._valueToUpdate);
    }

    public o43<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        o43<Object> o43 = this._rootDeserializers.get(javaType);
        if (o43 == null) {
            try {
                o43 = createDummyDeserializationContext().findRootValueDeserializer(javaType);
                if (o43 != null) {
                    this._rootDeserializers.put(javaType, o43);
                }
            } catch (JacksonException unused) {
            }
        }
        return o43;
    }

    public void _reportUndetectableSource(Object obj) throws StreamReadException {
        throw new JsonParseException((JsonParser) null, "Cannot use source of type " + obj.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    public void _reportUnkownFormat(s11 s11, s11.C3241b bVar) throws IOException {
        throw new JsonParseException((JsonParser) null, "Cannot detect format from input, does not look like any of detectable formats " + s11.toString());
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        Object obj;
        JsonToken N0 = jsonParser.mo13938N0();
        if (N0 != null) {
            Class<?> d0 = wf0.m29507d0(javaType);
            if (d0 == null && (obj = this._valueToUpdate) != null) {
                d0 = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(d0, jsonParser, N0);
        }
    }

    public void _verifySchemaType(d82 d82) {
        if (d82 != null && !this._parserFactory.canUseSchema(d82)) {
            throw new IllegalArgumentException("Cannot use FormatSchema of type " + d82.getClass().getName() + " for format " + this._parserFactory.getFormatName());
        }
    }

    public ObjectReader _with(DeserializationConfig deserializationConfig) {
        if (deserializationConfig == this._config) {
            return this;
        }
        ObjectReader _new = _new(this, deserializationConfig);
        s11 s11 = this._dataFormatReaders;
        if (s11 != null) {
            return _new.withFormatDetection(s11.mo25606d(deserializationConfig));
        }
        return _new;
    }

    /* renamed from: at */
    public ObjectReader mo14760at(String str) {
        _assertNotNull("pointerExpr", str);
        return new ObjectReader(this, (TokenFilter) new o53(str));
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, (iu2) null);
    }

    public DefaultDeserializationContext createDummyDeserializationContext() {
        return this._context.createDummyInstance(this._config);
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        return this._config.initialize(this._parserFactory.createNonBlockingByteArrayParser(), this._schema);
    }

    public JsonParser createParser(File file) throws IOException {
        _assertNotNull("src", file);
        return this._config.initialize(this._parserFactory.createParser(file), this._schema);
    }

    public ObjectReader forType(JavaType javaType) {
        if (javaType != null && javaType.equals(this._valueType)) {
            return this;
        }
        o43<Object> _prefetchRootDeserializer = _prefetchRootDeserializer(javaType);
        s11 s11 = this._dataFormatReaders;
        if (s11 != null) {
            s11 = s11.mo25607e(javaType);
        }
        return _new(this, this._config, javaType, _prefetchRootDeserializer, this._valueToUpdate, this._schema, (iu2) null, s11);
    }

    public ContextAttributes getAttributes() {
        return this._config.getAttributes();
    }

    public DeserializationConfig getConfig() {
        return this._config;
    }

    public JsonFactory getFactory() {
        return this._parserFactory;
    }

    public iu2 getInjectableValues() {
        return null;
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public JavaType getValueType() {
        return this._valueType;
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._config.isEnabled(deserializationFeature);
    }

    public <T extends C1979c> T readTree(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        return _bindAsTreeOrNull(jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        return _bind(jsonParser, this._valueToUpdate);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType((Class<?>) cls).readValues(jsonParser);
    }

    public JsonParser treeAsTokens(C1979c cVar) {
        _assertNotNull("n", cVar);
        return new tx6((g53) cVar, withValueToUpdate((Object) null));
    }

    public <T> T treeToValue(C1979c cVar, Class<T> cls) throws JsonProcessingException {
        _assertNotNull("n", cVar);
        try {
            return readValue(treeAsTokens(cVar), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public Version version() {
        return rk4.f17279a;
    }

    public ObjectReader with(DeserializationFeature deserializationFeature) {
        return _with(this._config.with(deserializationFeature));
    }

    public ObjectReader with(iu2 iu2) {
        return this;
    }

    public ObjectReader withAttribute(Object obj, Object obj2) {
        return _with((DeserializationConfig) this._config.withAttribute(obj, obj2));
    }

    public ObjectReader withAttributes(Map<?, ?> map) {
        return _with((DeserializationConfig) this._config.withAttributes(map));
    }

    public ObjectReader withFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withFeatures(deserializationFeatureArr));
    }

    public ObjectReader withFormatDetection(ObjectReader... objectReaderArr) {
        return withFormatDetection(new s11(objectReaderArr));
    }

    public ObjectReader withHandler(nd1 nd1) {
        return _with(this._config.withHandler(nd1));
    }

    public ObjectReader withRootName(String str) {
        return _with((DeserializationConfig) this._config.withRootName(str));
    }

    @Deprecated
    public ObjectReader withType(JavaType javaType) {
        return forType(javaType);
    }

    public ObjectReader withValueToUpdate(Object obj) {
        if (obj == this._valueToUpdate) {
            return this;
        }
        if (obj == null) {
            return _new(this, this._config, this._valueType, this._rootDeserializer, (Object) null, this._schema, (iu2) null, this._dataFormatReaders);
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            javaType = this._config.constructType(obj.getClass());
        }
        return _new(this, this._config, javaType, this._rootDeserializer, obj, this._schema, (iu2) null, this._dataFormatReaders);
    }

    public ObjectReader withView(Class<?> cls) {
        return _with(this._config.withView(cls));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature) {
        return _with(this._config.without(deserializationFeature));
    }

    public ObjectReader withoutAttribute(Object obj) {
        return _with((DeserializationConfig) this._config.withoutAttribute(obj));
    }

    public ObjectReader withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withoutFeatures(deserializationFeatureArr));
    }

    public ObjectReader withoutRootName() {
        return _with(this._config.withRootName(PropertyName.NO_NAME));
    }

    public void writeTree(JsonGenerator jsonGenerator, C1979c cVar) {
        throw new UnsupportedOperationException();
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, d82 d82, iu2 iu2) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._schema = d82;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
        this._dataFormatReaders = null;
        this._filter = null;
    }

    public InputStream _inputStream(File file) throws IOException {
        return new FileInputStream(file);
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        return new ObjectReader(objectReader, deserializationConfig);
    }

    public g53 createArrayNode() {
        return this._config.getNodeFactory().arrayNode();
    }

    public g53 createObjectNode() {
        return this._config.getNodeFactory().objectNode();
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public g53 missingNode() {
        return this._config.getNodeFactory().missingNode();
    }

    public g53 nullNode() {
        return this._config.getNodeFactory().nullNode();
    }

    public ObjectReader with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withFeatures(featureArr));
    }

    public ObjectReader withFormatDetection(s11 s11) {
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, (iu2) null, s11);
    }

    public ObjectReader withRootName(PropertyName propertyName) {
        return _with(this._config.withRootName(propertyName));
    }

    @Deprecated
    public ObjectReader withType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.without(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withoutFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withoutFeatures(featureArr));
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, o43<Object> o43, Object obj, d82 d82, iu2 iu2, s11 s11) {
        return new ObjectReader(objectReader, deserializationConfig, javaType, o43, obj, d82, iu2, s11);
    }

    /* renamed from: at */
    public ObjectReader mo14761at(n53 n53) {
        _assertNotNull("pointer", n53);
        return new ObjectReader(this, (TokenFilter) new o53(n53));
    }

    public JsonParser createParser(URL url) throws IOException {
        _assertNotNull("src", url);
        return this._config.initialize(this._parserFactory.createParser(url), this._schema);
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._config.isEnabled(feature, this._parserFactory);
    }

    public g53 readTree(InputStream inputStream) throws IOException {
        if (this._dataFormatReaders != null) {
            return _detectBindAndCloseAsTree(inputStream);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(inputStream), false));
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType((Class<?>) cls).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, j17<T> j17) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType((j17<?>) j17).readValues(jsonParser);
    }

    public ObjectReader with(JsonParser.Feature feature) {
        return _with(this._config.with(feature));
    }

    public ObjectReader withFeatures(b82... b82Arr) {
        return _with(this._config.withFeatures(b82Arr));
    }

    @Deprecated
    public ObjectReader withType(Type type) {
        return forType(this._config.getTypeFactory().constructType(type));
    }

    public ObjectReader without(JsonParser.Feature feature) {
        return _with(this._config.without(feature));
    }

    public ObjectReader withoutFeatures(b82... b82Arr) {
        return _with(this._config.withoutFeatures(b82Arr));
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return this._config.isEnabled(streamReadFeature.mappedFeature(), this._parserFactory);
    }

    public ObjectReader with(StreamReadFeature streamReadFeature) {
        return _with(this._config.with(streamReadFeature.mappedFeature()));
    }

    @Deprecated
    public ObjectReader withType(j17<?> j17) {
        return forType(this._config.getTypeFactory().constructType(j17.getType()));
    }

    public ObjectReader without(StreamReadFeature streamReadFeature) {
        return _with(this._config.without(streamReadFeature.mappedFeature()));
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return this._config.initialize(this._parserFactory.createParser(inputStream), this._schema);
    }

    public <T> T readValue(JsonParser jsonParser, j17<T> j17) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType((j17<?>) j17).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, af5 af5) throws IOException {
        _assertNotNull("p", jsonParser);
        return readValues(jsonParser, (JavaType) af5);
    }

    public <T> T treeToValue(C1979c cVar, JavaType javaType) throws JsonProcessingException {
        _assertNotNull("n", cVar);
        try {
            return readValue(treeAsTokens(cVar), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectReader with(b82 b82) {
        return _with(this._config.with(b82));
    }

    public ObjectReader without(b82 b82) {
        return _with(this._config.without(b82));
    }

    public Object _detectBindAndClose(s11.C3241b bVar, boolean z) throws IOException {
        if (!bVar.mo25613d()) {
            _reportUnkownFormat(this._dataFormatReaders, bVar);
        }
        JsonParser a = bVar.mo25610a();
        if (z) {
            a.mo13969i(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return bVar.mo25612c()._bindAndClose(a);
    }

    public ObjectReader forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public g53 readTree(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(reader), false));
    }

    public ObjectReader with(DeserializationConfig deserializationConfig) {
        return _with(deserializationConfig);
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return this._config.initialize(this._parserFactory.createParser(reader), this._schema);
    }

    public ObjectReader forType(j17<?> j17) {
        return forType(this._config.getTypeFactory().constructType(j17.getType()));
    }

    public <T> T readValue(JsonParser jsonParser, af5 af5) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType((JavaType) af5).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType(javaType).readValues(jsonParser);
    }

    public ObjectReader with(JsonNodeFactory jsonNodeFactory) {
        return _with(this._config.with(jsonNodeFactory));
    }

    public ObjectReader with(JsonFactory jsonFactory) {
        if (jsonFactory == this._parserFactory) {
            return this;
        }
        ObjectReader _new = _new(this, jsonFactory);
        if (jsonFactory.getCodec() == null) {
            jsonFactory.setCodec(_new);
        }
        return _new;
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, bArr);
        return this._config.initialize(this._parserFactory.createParser(bArr), this._schema);
    }

    public g53 readTree(String str) throws JsonProcessingException, JsonMappingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return _bindAndCloseAsTree(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType(javaType).readValue(jsonParser);
    }

    public <T> wn3<T> readValues(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        return _newIterator(jsonParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext), false);
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, bArr);
        return this._config.initialize(this._parserFactory.createParser(bArr, i, i2), this._schema);
    }

    public <T> T readValue(InputStream inputStream) throws IOException {
        s11 s11 = this._dataFormatReaders;
        if (s11 != null) {
            return _detectBindAndClose(s11.mo25604b(inputStream), false);
        }
        return _bindAndClose(_considerFilter(createParser(inputStream), false));
    }

    public <T> wn3<T> readValues(InputStream inputStream) throws IOException {
        s11 s11 = this._dataFormatReaders;
        if (s11 != null) {
            return _detectBindAndReadValues(s11.mo25604b(inputStream), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(inputStream), true));
    }

    public ObjectReader with(d82 d82) {
        if (this._schema == d82) {
            return this;
        }
        _verifySchemaType(d82);
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, d82, (iu2) null, this._dataFormatReaders);
    }

    public JsonParser createParser(String str) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, str);
        return this._config.initialize(this._parserFactory.createParser(str), this._schema);
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, o43<Object> o43, Object obj, d82 d82, iu2 iu2, s11 s11) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = javaType;
        this._rootDeserializer = o43;
        this._valueToUpdate = obj;
        this._schema = d82;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = s11;
        this._filter = objectReader._filter;
    }

    public g53 readTree(byte[] bArr) throws IOException {
        _assertNotNull("json", bArr);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr), false));
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(inputStream);
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, cArr);
        return this._config.initialize(this._parserFactory.createParser(cArr), this._schema);
    }

    public <T> T readValue(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndClose(_considerFilter(createParser(reader), false));
    }

    public <T> wn3<T> readValues(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        JsonParser _considerFilter = _considerFilter(createParser(reader), true);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(_considerFilter);
        _initForMultiRead(createDeserializationContext, _considerFilter);
        _considerFilter.mo13938N0();
        return _newIterator(_considerFilter, createDeserializationContext, _findRootDeserializer(createDeserializationContext), true);
    }

    public ObjectReader with(Locale locale) {
        return _with((DeserializationConfig) this._config.with(locale));
    }

    public ObjectReader with(TimeZone timeZone) {
        return _with((DeserializationConfig) this._config.with(timeZone));
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, cArr);
        return this._config.initialize(this._parserFactory.createParser(cArr, i, i2), this._schema);
    }

    public ObjectReader with(Base64Variant base64Variant) {
        return _with((DeserializationConfig) this._config.with(base64Variant));
    }

    public g53 readTree(byte[] bArr, int i, int i2) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr, i, i2), false));
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(reader);
    }

    public ObjectReader with(ContextAttributes contextAttributes) {
        return _with(this._config.with(contextAttributes));
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, dataInput);
        return this._config.initialize(this._parserFactory.createParser(dataInput), this._schema);
    }

    public <T> T readValue(String str) throws JsonProcessingException, JsonMappingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return _bindAndClose(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public g53 readTree(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(dataInput), false));
    }

    public <T> wn3<T> readValues(String str) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        JsonParser _considerFilter = _considerFilter(createParser(str), true);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(_considerFilter);
        _initForMultiRead(createDeserializationContext, _considerFilter);
        _considerFilter.mo13938N0();
        return _newIterator(_considerFilter, createDeserializationContext, _findRootDeserializer(createDeserializationContext), true);
    }

    public <T> T readValue(String str, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(str);
    }

    public <T> T readValue(byte[] bArr) throws IOException {
        if (this._dataFormatReaders != null) {
            return _detectBindAndClose(bArr, 0, bArr.length);
        }
        return _bindAndClose(_considerFilter(createParser(bArr), false));
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(bArr);
    }

    public <T> T readValue(byte[] bArr, int i, int i2) throws IOException {
        if (this._dataFormatReaders != null) {
            return _detectBindAndClose(bArr, i, i2);
        }
        return _bindAndClose(_considerFilter(createParser(bArr, i, i2), false));
    }

    public <T> wn3<T> readValues(byte[] bArr, int i, int i2) throws IOException {
        s11 s11 = this._dataFormatReaders;
        if (s11 != null) {
            return _detectBindAndReadValues(s11.mo25605c(bArr, i, i2), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(bArr, i, i2), true));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(bArr, i, i2);
    }

    public final <T> wn3<T> readValues(byte[] bArr) throws IOException {
        _assertNotNull("src", bArr);
        return readValues(bArr, 0, bArr.length);
    }

    public <T> T readValue(File file) throws IOException {
        s11 s11 = this._dataFormatReaders;
        if (s11 != null) {
            return _detectBindAndClose(s11.mo25604b(_inputStream(file)), true);
        }
        return _bindAndClose(_considerFilter(createParser(file), false));
    }

    public <T> wn3<T> readValues(File file) throws IOException {
        s11 s11 = this._dataFormatReaders;
        if (s11 != null) {
            return _detectBindAndReadValues(s11.mo25604b(_inputStream(file)), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(file), true));
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(file);
    }

    public <T> T readValue(URL url) throws IOException {
        s11 s11 = this._dataFormatReaders;
        if (s11 != null) {
            return _detectBindAndClose(s11.mo25604b(_inputStream(url)), true);
        }
        return _bindAndClose(_considerFilter(createParser(url), false));
    }

    public ObjectReader(ObjectReader objectReader, JsonFactory jsonFactory) {
        this._config = (DeserializationConfig) objectReader._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonFactory.requiresPropertyOrdering());
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = jsonFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public <T> wn3<T> readValues(URL url) throws IOException {
        s11 s11 = this._dataFormatReaders;
        if (s11 != null) {
            return _detectBindAndReadValues(s11.mo25604b(_inputStream(url)), true);
        }
        return _bindAndReadValues(_considerFilter(createParser(url), true));
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(url);
    }

    public <T> T readValue(g53 g53) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, g53);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(g53);
        }
        return _bindAndClose(_considerFilter(treeAsTokens(g53), false));
    }

    public <T> wn3<T> readValues(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndReadValues(_considerFilter(createParser(dataInput), true));
    }

    public <T> T readValue(g53 g53, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(g53);
    }

    public <T> T readValue(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndClose(_considerFilter(createParser(dataInput), false));
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValue(dataInput);
    }

    public ObjectReader(ObjectReader objectReader, TokenFilter tokenFilter) {
        this._config = objectReader._config;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = tokenFilter;
    }
}
