package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.p009io.CharacterEscapes;
import com.fasterxml.jackson.core.p009io.SerializedString;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public class ObjectWriter implements Serializable {
    public static final su4 NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();
    private static final long serialVersionUID = 1;
    public final SerializationConfig _config;
    public final JsonFactory _generatorFactory;
    public final GeneratorSettings _generatorSettings;
    public final Prefetch _prefetch;
    public final yw5 _serializerFactory;
    public final DefaultSerializerProvider _serializerProvider;

    public static final class Prefetch implements Serializable {
        public static final Prefetch empty = new Prefetch((JavaType) null, (y63<Object>) null, (m17) null);
        private static final long serialVersionUID = 1;
        private final JavaType rootType;
        private final m17 typeSerializer;
        private final y63<Object> valueSerializer;

        public Prefetch(JavaType javaType, y63<Object> y63, m17 m17) {
            this.rootType = javaType;
            this.valueSerializer = y63;
            this.typeSerializer = m17;
        }

        public Prefetch forRootType(ObjectWriter objectWriter, JavaType javaType) {
            if (javaType == null) {
                if (this.rootType == null || this.valueSerializer == null) {
                    return this;
                }
                return new Prefetch((JavaType) null, (y63<Object>) null, (m17) null);
            } else if (javaType.equals(this.rootType)) {
                return this;
            } else {
                if (javaType.isJavaLangObject()) {
                    try {
                        return new Prefetch((JavaType) null, (y63<Object>) null, objectWriter._serializerProvider().findTypeSerializer(javaType));
                    } catch (JsonMappingException e) {
                        throw new RuntimeJsonMappingException(e);
                    }
                } else {
                    if (objectWriter.isEnabled(SerializationFeature.EAGER_SERIALIZER_FETCH)) {
                        try {
                            y63<Object> findTypedValueSerializer = objectWriter._serializerProvider().findTypedValueSerializer(javaType, true, (BeanProperty) null);
                            if (findTypedValueSerializer instanceof d27) {
                                return new Prefetch(javaType, (y63<Object>) null, ((d27) findTypedValueSerializer).mo18413a());
                            }
                            return new Prefetch(javaType, findTypedValueSerializer, (m17) null);
                        } catch (DatabindException unused) {
                        }
                    }
                    return new Prefetch(javaType, (y63<Object>) null, this.typeSerializer);
                }
            }
        }

        public final m17 getTypeSerializer() {
            return this.typeSerializer;
        }

        public final y63<Object> getValueSerializer() {
            return this.valueSerializer;
        }

        public boolean hasSerializer() {
            if (this.valueSerializer == null && this.typeSerializer == null) {
                return false;
            }
            return true;
        }

        public void serialize(JsonGenerator jsonGenerator, Object obj, DefaultSerializerProvider defaultSerializerProvider) throws IOException {
            m17 m17 = this.typeSerializer;
            if (m17 != null) {
                defaultSerializerProvider.serializePolymorphic(jsonGenerator, obj, this.rootType, this.valueSerializer, m17);
                return;
            }
            y63<Object> y63 = this.valueSerializer;
            if (y63 != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, this.rootType, y63);
                return;
            }
            JavaType javaType = this.rootType;
            if (javaType != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, javaType);
            } else {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj);
            }
        }
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, JavaType javaType, su4 su4) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = su4 == null ? GeneratorSettings.empty : new GeneratorSettings(su4, (d82) null, (CharacterEscapes) null, (qw5) null);
        if (javaType == null) {
            this._prefetch = Prefetch.empty;
        } else if (javaType.hasRawClass(Object.class)) {
            this._prefetch = Prefetch.empty.forRootType(this, javaType);
        } else {
            this._prefetch = Prefetch.empty.forRootType(this, javaType.withStaticTyping());
        }
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", new Object[]{str}));
        }
    }

    public final JsonGenerator _configureGenerator(JsonGenerator jsonGenerator) {
        this._config.initialize(jsonGenerator);
        this._generatorSettings.initialize(jsonGenerator);
        return jsonGenerator;
    }

    public ObjectWriter _new(ObjectWriter objectWriter, JsonFactory jsonFactory) {
        return new ObjectWriter(objectWriter, jsonFactory);
    }

    public C1990b _newSequenceWriter(boolean z, JsonGenerator jsonGenerator, boolean z2) throws IOException {
        return new C1990b(_serializerProvider(), _configureGenerator(jsonGenerator), z2, this._prefetch).mo15049a(z);
    }

    public DefaultSerializerProvider _serializerProvider() {
        return this._serializerProvider.createInstance(this._config, this._serializerFactory);
    }

    public void _verifySchemaType(d82 d82) {
        if (d82 != null && !this._generatorFactory.canUseSchema(d82)) {
            throw new IllegalArgumentException("Cannot use FormatSchema of type " + d82.getClass().getName() + " for format " + this._generatorFactory.getFormatName());
        }
    }

    public final void _writeValueAndClose(JsonGenerator jsonGenerator, Object obj) throws IOException {
        if (!this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
                jsonGenerator.close();
            } catch (Exception e) {
                wf0.m29520k(jsonGenerator, e);
            }
        } else {
            mo14873a(jsonGenerator, obj);
        }
    }

    /* renamed from: a */
    public final void mo14873a(JsonGenerator jsonGenerator, Object obj) throws IOException {
        Closeable closeable;
        Exception e;
        Closeable closeable2 = (Closeable) obj;
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            closeable = null;
            try {
                closeable2.close();
                jsonGenerator.close();
            } catch (Exception e2) {
                e = e2;
                wf0.m29518j(jsonGenerator, closeable, e);
            }
        } catch (Exception e3) {
            Closeable closeable3 = closeable2;
            e = e3;
            closeable = closeable3;
            wf0.m29518j(jsonGenerator, closeable, e);
        }
    }

    public void acceptJsonFormatVisitor(JavaType javaType, t43 t43) throws JsonMappingException {
        _assertNotNull("type", javaType);
        _assertNotNull("visitor", t43);
        _serializerProvider().acceptJsonFormatVisitor(javaType, t43);
    }

    public boolean canSerialize(Class<?> cls) {
        _assertNotNull("type", cls);
        return _serializerProvider().hasSerializerFor(cls, (AtomicReference<Throwable>) null);
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        _assertNotNull("out", outputStream);
        return _configureGenerator(this._generatorFactory.createGenerator(outputStream, JsonEncoding.UTF8));
    }

    public ObjectWriter forType(JavaType javaType) {
        return _new(this._generatorSettings, this._prefetch.forRootType(this, javaType));
    }

    public ContextAttributes getAttributes() {
        return this._config.getAttributes();
    }

    public SerializationConfig getConfig() {
        return this._config;
    }

    public JsonFactory getFactory() {
        return this._generatorFactory;
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public boolean hasPrefetchedSerializer() {
        return this._prefetch.hasSerializer();
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public Version version() {
        return rk4.f17279a;
    }

    public ObjectWriter with(SerializationFeature serializationFeature) {
        return _new(this, this._config.with(serializationFeature));
    }

    public ObjectWriter withAttribute(Object obj, Object obj2) {
        return _new(this, (SerializationConfig) this._config.withAttribute(obj, obj2));
    }

    public ObjectWriter withAttributes(Map<?, ?> map) {
        return _new(this, (SerializationConfig) this._config.withAttributes(map));
    }

    public ObjectWriter withDefaultPrettyPrinter() {
        return with(this._config.getDefaultPrettyPrinter());
    }

    public ObjectWriter withFeatures(SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.withFeatures(serializationFeatureArr));
    }

    public ObjectWriter withRootName(String str) {
        return _new(this, (SerializationConfig) this._config.withRootName(str));
    }

    public ObjectWriter withRootValueSeparator(String str) {
        return _new(this._generatorSettings.withRootValueSeparator(str), this._prefetch);
    }

    @Deprecated
    public ObjectWriter withSchema(d82 d82) {
        return with(d82);
    }

    @Deprecated
    public ObjectWriter withType(JavaType javaType) {
        return forType(javaType);
    }

    public ObjectWriter withView(Class<?> cls) {
        return _new(this, this._config.withView(cls));
    }

    public ObjectWriter without(SerializationFeature serializationFeature) {
        return _new(this, this._config.without(serializationFeature));
    }

    public ObjectWriter withoutAttribute(Object obj) {
        return _new(this, (SerializationConfig) this._config.withoutAttribute(obj));
    }

    public ObjectWriter withoutFeatures(SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.withoutFeatures(serializationFeatureArr));
    }

    public ObjectWriter withoutRootName() {
        return _new(this, this._config.withRootName(PropertyName.NO_NAME));
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        _assertNotNull("g", jsonGenerator);
        _configureGenerator(jsonGenerator);
        if (!this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            if (this._config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            if (this._config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            wf0.m29518j((JsonGenerator) null, closeable, e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] writeValueAsBytes(java.lang.Object r3) throws com.fasterxml.jackson.core.JsonProcessingException {
        /*
            r2 = this;
            g60 r0 = new g60     // Catch:{ JsonProcessingException -> 0x0031, IOException -> 0x002b }
            com.fasterxml.jackson.core.JsonFactory r1 = r2._generatorFactory     // Catch:{ JsonProcessingException -> 0x0031, IOException -> 0x002b }
            r40 r1 = r1._getBufferRecycler()     // Catch:{ JsonProcessingException -> 0x0031, IOException -> 0x002b }
            r0.<init>((p000.r40) r1)     // Catch:{ JsonProcessingException -> 0x0031, IOException -> 0x002b }
            com.fasterxml.jackson.core.JsonEncoding r1 = com.fasterxml.jackson.core.JsonEncoding.UTF8     // Catch:{ all -> 0x001f }
            com.fasterxml.jackson.core.JsonGenerator r1 = r2.createGenerator((java.io.OutputStream) r0, (com.fasterxml.jackson.core.JsonEncoding) r1)     // Catch:{ all -> 0x001f }
            r2._writeValueAndClose(r1, r3)     // Catch:{ all -> 0x001f }
            byte[] r3 = r0.mo20400n()     // Catch:{ all -> 0x001f }
            r0.mo20396j()     // Catch:{ all -> 0x001f }
            r0.close()     // Catch:{ JsonProcessingException -> 0x0031, IOException -> 0x002b }
            return r3
        L_0x001f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ JsonProcessingException -> 0x0031, IOException -> 0x002b }
        L_0x002a:
            throw r1     // Catch:{ JsonProcessingException -> 0x0031, IOException -> 0x002b }
        L_0x002b:
            r3 = move-exception
            com.fasterxml.jackson.databind.JsonMappingException r3 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(r3)
            throw r3
        L_0x0031:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectWriter.writeValueAsBytes(java.lang.Object):byte[]");
    }

    public String writeValueAsString(Object obj) throws JsonProcessingException {
        ft5 ft5 = new ft5(this._generatorFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator((Writer) ft5), obj);
            return ft5.mo20168a();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public C1990b writeValues(File file) throws IOException {
        return _newSequenceWriter(false, createGenerator(file, JsonEncoding.UTF8), true);
    }

    public C1990b writeValuesAsArray(File file) throws IOException {
        return _newSequenceWriter(true, createGenerator(file, JsonEncoding.UTF8), true);
    }

    public static final class GeneratorSettings implements Serializable {
        public static final GeneratorSettings empty = new GeneratorSettings((su4) null, (d82) null, (CharacterEscapes) null, (qw5) null);
        private static final long serialVersionUID = 1;
        public final CharacterEscapes characterEscapes;
        public final su4 prettyPrinter;
        public final qw5 rootValueSeparator;
        public final d82 schema;

        public GeneratorSettings(su4 su4, d82 d82, CharacterEscapes characterEscapes2, qw5 qw5) {
            this.prettyPrinter = su4;
            this.schema = d82;
            this.characterEscapes = characterEscapes2;
            this.rootValueSeparator = qw5;
        }

        /* renamed from: a */
        public final String mo14954a() {
            qw5 qw5 = this.rootValueSeparator;
            if (qw5 == null) {
                return null;
            }
            return qw5.getValue();
        }

        public void initialize(JsonGenerator jsonGenerator) {
            su4 su4 = this.prettyPrinter;
            if (su4 != null) {
                if (su4 == ObjectWriter.NULL_PRETTY_PRINTER) {
                    jsonGenerator.mo13901y((su4) null);
                } else {
                    if (su4 instanceof ew2) {
                        su4 = (su4) ((ew2) su4).createInstance();
                    }
                    jsonGenerator.mo13901y(su4);
                }
            }
            CharacterEscapes characterEscapes2 = this.characterEscapes;
            if (characterEscapes2 != null) {
                jsonGenerator.mo13893q(characterEscapes2);
            }
            d82 d82 = this.schema;
            if (d82 != null) {
                jsonGenerator.mo13832A(d82);
            }
            qw5 qw5 = this.rootValueSeparator;
            if (qw5 != null) {
                jsonGenerator.mo13903z(qw5);
            }
        }

        public GeneratorSettings with(su4 su4) {
            if (su4 == null) {
                su4 = ObjectWriter.NULL_PRETTY_PRINTER;
            }
            return su4 == this.prettyPrinter ? this : new GeneratorSettings(su4, this.schema, this.characterEscapes, this.rootValueSeparator);
        }

        public GeneratorSettings withRootValueSeparator(String str) {
            if (str == null) {
                if (this.rootValueSeparator == null) {
                    return this;
                }
                return new GeneratorSettings(this.prettyPrinter, this.schema, this.characterEscapes, (qw5) null);
            } else if (str.equals(mo14954a())) {
                return this;
            } else {
                return new GeneratorSettings(this.prettyPrinter, this.schema, this.characterEscapes, new SerializedString(str));
            }
        }

        public GeneratorSettings with(d82 d82) {
            return this.schema == d82 ? this : new GeneratorSettings(this.prettyPrinter, d82, this.characterEscapes, this.rootValueSeparator);
        }

        public GeneratorSettings with(CharacterEscapes characterEscapes2) {
            return this.characterEscapes == characterEscapes2 ? this : new GeneratorSettings(this.prettyPrinter, this.schema, characterEscapes2, this.rootValueSeparator);
        }

        public GeneratorSettings withRootValueSeparator(qw5 qw5) {
            if (qw5 == null) {
                if (this.rootValueSeparator == null) {
                    return this;
                }
                return new GeneratorSettings(this.prettyPrinter, this.schema, this.characterEscapes, (qw5) null);
            } else if (qw5.equals(this.rootValueSeparator)) {
                return this;
            } else {
                return new GeneratorSettings(this.prettyPrinter, this.schema, this.characterEscapes, qw5);
            }
        }
    }

    public ObjectWriter _new(ObjectWriter objectWriter, SerializationConfig serializationConfig) {
        if (serializationConfig == this._config) {
            return this;
        }
        return new ObjectWriter(objectWriter, serializationConfig);
    }

    public ObjectWriter forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public ObjectWriter with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.with(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter withFeatures(JsonGenerator.Feature... featureArr) {
        return _new(this, this._config.withFeatures(featureArr));
    }

    public ObjectWriter withRootName(PropertyName propertyName) {
        return _new(this, this._config.withRootName(propertyName));
    }

    public ObjectWriter withRootValueSeparator(qw5 qw5) {
        return _new(this._generatorSettings.withRootValueSeparator(qw5), this._prefetch);
    }

    @Deprecated
    public ObjectWriter withType(Class<?> cls) {
        return forType(cls);
    }

    public ObjectWriter without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.without(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter withoutFeatures(JsonGenerator.Feature... featureArr) {
        return _new(this, this._config.withoutFeatures(featureArr));
    }

    public C1990b writeValues(JsonGenerator jsonGenerator) throws IOException {
        _assertNotNull("g", jsonGenerator);
        return _newSequenceWriter(false, _configureGenerator(jsonGenerator), false);
    }

    public C1990b writeValuesAsArray(JsonGenerator jsonGenerator) throws IOException {
        _assertNotNull("gen", jsonGenerator);
        return _newSequenceWriter(true, jsonGenerator, false);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        _assertNotNull("type", cls);
        return _serializerProvider().hasSerializerFor(cls, atomicReference);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("out", outputStream);
        return _configureGenerator(this._generatorFactory.createGenerator(outputStream, jsonEncoding));
    }

    public ObjectWriter forType(j17<?> j17) {
        return forType(this._config.getTypeFactory().constructType(j17.getType()));
    }

    @Deprecated
    public boolean isEnabled(JsonParser.Feature feature) {
        return this._generatorFactory.isEnabled(feature);
    }

    public ObjectWriter with(JsonGenerator.Feature feature) {
        return _new(this, this._config.with(feature));
    }

    public ObjectWriter withFeatures(b82... b82Arr) {
        return _new(this, this._config.withFeatures(b82Arr));
    }

    @Deprecated
    public ObjectWriter withType(j17<?> j17) {
        return forType(j17);
    }

    public ObjectWriter without(JsonGenerator.Feature feature) {
        return _new(this, this._config.without(feature));
    }

    public ObjectWriter withoutFeatures(b82... b82Arr) {
        return _new(this, this._config.withoutFeatures(b82Arr));
    }

    public ObjectWriter _new(GeneratorSettings generatorSettings, Prefetch prefetch) {
        if (this._generatorSettings == generatorSettings && this._prefetch == prefetch) {
            return this;
        }
        return new ObjectWriter(this, this._config, generatorSettings, prefetch);
    }

    public void acceptJsonFormatVisitor(Class<?> cls, t43 t43) throws JsonMappingException {
        _assertNotNull("type", cls);
        _assertNotNull("visitor", t43);
        acceptJsonFormatVisitor(this._config.constructType(cls), t43);
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._generatorFactory.isEnabled(feature);
    }

    public ObjectWriter with(StreamWriteFeature streamWriteFeature) {
        return _new(this, this._config.with(streamWriteFeature.mappedFeature()));
    }

    public ObjectWriter without(StreamWriteFeature streamWriteFeature) {
        return _new(this, this._config.without(streamWriteFeature.mappedFeature()));
    }

    public C1990b writeValues(Writer writer) throws IOException {
        return _newSequenceWriter(false, createGenerator(writer), true);
    }

    public C1990b writeValuesAsArray(Writer writer) throws IOException {
        return _newSequenceWriter(true, createGenerator(writer), true);
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        _assertNotNull("w", writer);
        return _configureGenerator(this._generatorFactory.createGenerator(writer));
    }

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return this._generatorFactory.isEnabled(streamWriteFeature);
    }

    public ObjectWriter with(b82 b82) {
        return _new(this, this._config.with(b82));
    }

    public ObjectWriter without(b82 b82) {
        return _new(this, this._config.without(b82));
    }

    public C1990b writeValues(OutputStream outputStream) throws IOException {
        return _newSequenceWriter(false, createGenerator(outputStream, JsonEncoding.UTF8), true);
    }

    public C1990b writeValuesAsArray(OutputStream outputStream) throws IOException {
        return _newSequenceWriter(true, createGenerator(outputStream, JsonEncoding.UTF8), true);
    }

    public ObjectWriter with(DateFormat dateFormat) {
        return _new(this, this._config.with(dateFormat));
    }

    public C1990b writeValues(DataOutput dataOutput) throws IOException {
        return _newSequenceWriter(false, createGenerator(dataOutput), true);
    }

    public C1990b writeValuesAsArray(DataOutput dataOutput) throws IOException {
        return _newSequenceWriter(true, createGenerator(dataOutput), true);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("outputFile", file);
        return _configureGenerator(this._generatorFactory.createGenerator(file, jsonEncoding));
    }

    public ObjectWriter with(p12 p12) {
        this._config.getFilterProvider();
        return this;
    }

    public ObjectWriter with(su4 su4) {
        return _new(this._generatorSettings.with(su4), this._prefetch);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        _assertNotNull("out", dataOutput);
        return _configureGenerator(this._generatorFactory.createGenerator(dataOutput));
    }

    public ObjectWriter with(d82 d82) {
        _verifySchemaType(d82);
        return _new(this._generatorSettings.with(d82), this._prefetch);
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = GeneratorSettings.empty;
        this._prefetch = Prefetch.empty;
    }

    public ObjectWriter with(Locale locale) {
        return _new(this, (SerializationConfig) this._config.with(locale));
    }

    public ObjectWriter with(TimeZone timeZone) {
        return _new(this, (SerializationConfig) this._config.with(timeZone));
    }

    public ObjectWriter with(Base64Variant base64Variant) {
        return _new(this, (SerializationConfig) this._config.with(base64Variant));
    }

    public void writeValue(File file, Object obj) throws IOException, StreamWriteException, DatabindException {
        _writeValueAndClose(createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter with(CharacterEscapes characterEscapes) {
        return _new(this._generatorSettings.with(characterEscapes), this._prefetch);
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException, StreamWriteException, DatabindException {
        _writeValueAndClose(createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter with(JsonFactory jsonFactory) {
        return jsonFactory == this._generatorFactory ? this : _new(this, jsonFactory);
    }

    public void writeValue(Writer writer, Object obj) throws IOException, StreamWriteException, DatabindException {
        _writeValueAndClose(createGenerator(writer), obj);
    }

    public ObjectWriter with(ContextAttributes contextAttributes) {
        return _new(this, this._config.with(contextAttributes));
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException, StreamWriteException, DatabindException {
        _writeValueAndClose(createGenerator(dataOutput), obj);
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, d82 d82) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = d82 == null ? GeneratorSettings.empty : new GeneratorSettings((su4) null, d82, (CharacterEscapes) null, (qw5) null);
        this._prefetch = Prefetch.empty;
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig, GeneratorSettings generatorSettings, Prefetch prefetch) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = objectWriter._generatorFactory;
        this._generatorSettings = generatorSettings;
        this._prefetch = prefetch;
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = objectWriter._generatorFactory;
        this._generatorSettings = objectWriter._generatorSettings;
        this._prefetch = objectWriter._prefetch;
    }

    public ObjectWriter(ObjectWriter objectWriter, JsonFactory jsonFactory) {
        this._config = (SerializationConfig) objectWriter._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonFactory.requiresPropertyOrdering());
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = jsonFactory;
        this._generatorSettings = objectWriter._generatorSettings;
        this._prefetch = objectWriter._prefetch;
    }
}
