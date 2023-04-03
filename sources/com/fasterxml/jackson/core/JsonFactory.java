package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p009io.CharacterEscapes;
import com.fasterxml.jackson.core.p009io.ContentReference;
import com.fasterxml.jackson.core.p009io.InputDecorator;
import com.fasterxml.jackson.core.p009io.OutputDecorator;
import com.fasterxml.jackson.core.p009io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;

public class JsonFactory extends TokenStreamFactory {
    public static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    public static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    public static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    public static final char DEFAULT_QUOTE_CHAR = '\"';
    public static final qw5 DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    public static final String FORMAT_NAME_JSON = "JSON";
    private static final long serialVersionUID = 2;
    public final transient y60 _byteSymbolCanonicalizer;
    public CharacterEscapes _characterEscapes;
    public int _factoryFeatures;
    public int _generatorFeatures;
    public InputDecorator _inputDecorator;
    public int _maximumNonEscapedChar;
    public xe4 _objectCodec;
    public OutputDecorator _outputDecorator;
    public int _parserFeatures;
    public final char _quoteChar;
    public final transient yd0 _rootCharSymbols;
    public qw5 _rootValueSeparator;

    public enum Feature implements xz2 {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        
        private final boolean _defaultState;

        /* access modifiers changed from: public */
        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            if ((i & getMask()) != 0) {
                return true;
            }
            return false;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this((xe4) null);
    }

    public static C1978b<?, ?> builder() {
        return new C1977a();
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() != cls) {
            throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
        }
    }

    public ContentReference _createContentReference(Object obj) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj);
    }

    public po2 _createContext(ContentReference contentReference, boolean z) {
        if (contentReference == null) {
            contentReference = ContentReference.unknown();
        }
        return new po2(_getBufferRecycler(), contentReference, z);
    }

    public JsonGenerator _createGenerator(Writer writer, po2 po2) throws IOException {
        vn7 vn7 = new vn7(po2, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            vn7.mo13899x(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            vn7.mo13893q(characterEscapes);
        }
        qw5 qw5 = this._rootValueSeparator;
        if (qw5 != DEFAULT_ROOT_VALUE_SEPARATOR) {
            vn7.mo13903z(qw5);
        }
        return vn7;
    }

    public po2 _createNonBlockingContext(Object obj) {
        return new po2(_getBufferRecycler(), _createContentReference(obj), false);
    }

    public JsonParser _createParser(InputStream inputStream, po2 po2) throws IOException {
        return new z60(po2, inputStream).mo28319c(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    public JsonGenerator _createUTF8Generator(OutputStream outputStream, po2 po2) throws IOException {
        e37 e37 = new e37(po2, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            e37.mo13899x(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            e37.mo13893q(characterEscapes);
        }
        qw5 qw5 = this._rootValueSeparator;
        if (qw5 != DEFAULT_ROOT_VALUE_SEPARATOR) {
            e37.mo13903z(qw5);
        }
        return e37;
    }

    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, po2 po2) throws IOException {
        if (jsonEncoding == JsonEncoding.UTF8) {
            return new g37(po2, outputStream);
        }
        return new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream _decorate(java.io.InputStream r2, p000.po2 r3) throws java.io.IOException {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.InputDecorator r0 = r1._inputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.InputStream r3 = r0.decorate((p000.po2) r3, (java.io.InputStream) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.InputStream, po2):java.io.InputStream");
    }

    public r40 _getBufferRecycler() {
        if (Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures)) {
            return s40.m26586a();
        }
        return new r40();
    }

    /* renamed from: a */
    public final boolean mo13757a() {
        if (getFormatName() == FORMAT_NAME_JSON) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo13758b(String str) {
        if (!mo13757a()) {
            throw new UnsupportedOperationException(String.format(str, new Object[]{getFormatName()}));
        }
    }

    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean canParseAsync() {
        return mo13757a();
    }

    public boolean canUseCharArrays() {
        return true;
    }

    public boolean canUseSchema(d82 d82) {
        String formatName;
        if (d82 == null || (formatName = getFormatName()) == null || !formatName.equals(d82.mo18570a())) {
            return false;
        }
        return true;
    }

    @Deprecated
    public final JsonFactory configure(Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, (xe4) null);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        po2 _createContext = _createContext(_createContentReference(outputStream), false);
        _createContext.mo24751u(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(outputStream, _createContext), _createContext);
        }
        return _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(outputStream, jsonEncoding);
    }

    @Deprecated
    public JsonParser createJsonParser(File file) throws IOException, JsonParseException {
        return createParser(file);
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        mo13758b("Non-blocking source not (yet?) supported for this format (%s)");
        return new h84(_createNonBlockingContext((Object) null), this._parserFeatures, this._byteSymbolCanonicalizer.mo27933A(this._factoryFeatures));
    }

    public JsonParser createParser(File file) throws IOException, JsonParseException {
        po2 _createContext = _createContext(_createContentReference(file), true);
        return _createParser(_decorate((InputStream) new FileInputStream(file), _createContext), _createContext);
    }

    @Deprecated
    public JsonFactory disable(Feature feature) {
        this._factoryFeatures = (~feature.getMask()) & this._factoryFeatures;
        return this;
    }

    @Deprecated
    public JsonFactory enable(Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return this;
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public xe4 getCodec() {
        return this._objectCodec;
    }

    public int getFormatGeneratorFeatures() {
        return 0;
    }

    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return FORMAT_NAME_JSON;
        }
        return null;
    }

    public int getFormatParserFeatures() {
        return 0;
    }

    public Class<? extends b82> getFormatReadFeatureType() {
        return null;
    }

    public Class<? extends b82> getFormatWriteFeatureType() {
        return null;
    }

    public final int getGeneratorFeatures() {
        return this._generatorFeatures;
    }

    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    public final int getParserFeatures() {
        return this._parserFeatures;
    }

    public String getRootValueSeparator() {
        qw5 qw5 = this._rootValueSeparator;
        if (qw5 == null) {
            return null;
        }
        return qw5.getValue();
    }

    public MatchStrength hasFormat(su2 su2) throws IOException {
        if (getClass() == JsonFactory.class) {
            return hasJSONFormat(su2);
        }
        return null;
    }

    public MatchStrength hasJSONFormat(su2 su2) throws IOException {
        return z60.m30974h(su2);
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._factoryFeatures) != 0;
    }

    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public C1978b<?, ?> rebuild() {
        mo13758b("Factory implementation for format (%s) MUST override `rebuild()` method");
        return new C1977a(this);
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    public JsonFactory setCodec(xe4 xe4) {
        this._objectCodec = xe4;
        return this;
    }

    @Deprecated
    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    @Deprecated
    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    public JsonFactory setRootValueSeparator(String str) {
        SerializedString serializedString;
        if (str == null) {
            serializedString = null;
        } else {
            serializedString = new SerializedString(str);
        }
        this._rootValueSeparator = serializedString;
        return this;
    }

    public Version version() {
        return sk4.f17697a;
    }

    public JsonFactory(xe4 xe4) {
        this._rootCharSymbols = yd0.m30513j();
        this._byteSymbolCanonicalizer = y60.m30387u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = xe4;
        this._quoteChar = DEFAULT_QUOTE_CHAR;
    }

    public ContentReference _createContentReference(Object obj, int i, int i2) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj, i, i2);
    }

    public JsonParser _createParser(Reader reader, po2 po2) throws IOException {
        return new q75(po2, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.mo28025n(this._factoryFeatures));
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(Writer writer) throws IOException {
        return createGenerator(writer);
    }

    @Deprecated
    public JsonParser createJsonParser(URL url) throws IOException, JsonParseException {
        return createParser(url);
    }

    public JsonFactory disable(JsonParser.Feature feature) {
        this._parserFeatures = (~feature.getMask()) & this._parserFeatures;
        return this;
    }

    public JsonFactory enable(JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public final boolean isEnabled(JsonParser.Feature feature) {
        return (feature.getMask() & this._parserFeatures) != 0;
    }

    @Deprecated
    public po2 _createContext(Object obj, boolean z) {
        return new po2(_getBufferRecycler(), _createContentReference(obj), z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Reader _decorate(java.io.Reader r2, p000.po2 r3) throws java.io.IOException {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.InputDecorator r0 = r1._inputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.Reader r3 = r0.decorate((p000.po2) r3, (java.io.Reader) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.Reader, po2):java.io.Reader");
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(InputStream inputStream) throws IOException, JsonParseException {
        return createParser(inputStream);
    }

    public JsonFactory disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    public JsonFactory enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public final boolean isEnabled(StreamReadFeature streamReadFeature) {
        return (streamReadFeature.mappedFeature().getMask() & this._parserFeatures) != 0;
    }

    public JsonParser _createParser(char[] cArr, int i, int i2, po2 po2, boolean z) throws IOException {
        return new q75(po2, this._parserFeatures, (Reader) null, this._objectCodec, this._rootCharSymbols.mo28025n(this._factoryFeatures), cArr, i, i + i2, z);
    }

    @Deprecated
    public JsonParser createJsonParser(Reader reader) throws IOException, JsonParseException {
        return createParser(reader);
    }

    public JsonParser createParser(URL url) throws IOException, JsonParseException {
        po2 _createContext = _createContext(_createContentReference(url), true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), _createContext), _createContext);
    }

    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.DataInput _decorate(java.io.DataInput r2, p000.po2 r3) throws java.io.IOException {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.InputDecorator r0 = r1._inputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.DataInput r3 = r0.decorate((p000.po2) r3, (java.io.DataInput) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.DataInput, po2):java.io.DataInput");
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr) throws IOException, JsonParseException {
        return createParser(bArr);
    }

    public final boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return (streamWriteFeature.mappedFeature().getMask() & this._generatorFeatures) != 0;
    }

    public JsonParser _createParser(byte[] bArr, int i, int i2, po2 po2) throws IOException {
        return new z60(po2, bArr, i, i2).mo28319c(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr, int i, int i2) throws IOException, JsonParseException {
        return createParser(bArr, i, i2);
    }

    public JsonParser _createParser(DataInput dataInput, po2 po2) throws IOException {
        mo13758b("InputData source not (yet?) supported for this format (%s)");
        int l = z60.m30977l(dataInput);
        return new d37(po2, this._parserFeatures, dataInput, this._objectCodec, this._byteSymbolCanonicalizer.mo27933A(this._factoryFeatures), l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.OutputStream _decorate(java.io.OutputStream r2, p000.po2 r3) throws java.io.IOException {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.OutputDecorator r0 = r1._outputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.OutputStream r3 = r0.decorate((p000.po2) r3, (java.io.OutputStream) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.OutputStream, po2):java.io.OutputStream");
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(String str) throws IOException, JsonParseException {
        return createParser(str);
    }

    public JsonParser createParser(InputStream inputStream) throws IOException, JsonParseException {
        po2 _createContext = _createContext(_createContentReference(inputStream), false);
        return _createParser(_decorate(inputStream, _createContext), _createContext);
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        po2 _createContext = _createContext(_createContentReference(writer), false);
        return _createGenerator(_decorate(writer, _createContext), _createContext);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Writer _decorate(java.io.Writer r2, p000.po2 r3) throws java.io.IOException {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.OutputDecorator r0 = r1._outputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.Writer r3 = r0.decorate((p000.po2) r3, (java.io.Writer) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.Writer, po2):java.io.Writer");
    }

    public JsonParser createParser(Reader reader) throws IOException, JsonParseException {
        po2 _createContext = _createContext(_createContentReference(reader), false);
        return _createParser(_decorate(reader, _createContext), _createContext);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        po2 _createContext = _createContext(_createContentReference(fileOutputStream), true);
        _createContext.mo24751u(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate((OutputStream) fileOutputStream, _createContext), _createContext);
        }
        return _createGenerator(_decorate(_createWriter(fileOutputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    public JsonFactory(JsonFactory jsonFactory, xe4 xe4) {
        this._rootCharSymbols = yd0.m30513j();
        this._byteSymbolCanonicalizer = y60.m30387u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = xe4;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactory._maximumNonEscapedChar;
        this._quoteChar = jsonFactory._quoteChar;
    }

    public JsonParser createParser(byte[] bArr) throws IOException, JsonParseException {
        InputStream decorate;
        po2 _createContext = _createContext(_createContentReference(bArr), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator == null || (decorate = inputDecorator.decorate(_createContext, bArr, 0, bArr.length)) == null) {
            return _createParser(bArr, 0, bArr.length, _createContext);
        }
        return _createParser(decorate, _createContext);
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException, JsonParseException {
        InputStream decorate;
        po2 _createContext = _createContext(_createContentReference(bArr, i, i2), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator == null || (decorate = inputDecorator.decorate(_createContext, bArr, i, i2)) == null) {
            return _createParser(bArr, i, i2, _createContext);
        }
        return _createParser(decorate, _createContext);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), jsonEncoding);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), JsonEncoding.UTF8);
    }

    public JsonParser createParser(String str) throws IOException, JsonParseException {
        int length = str.length();
        if (this._inputDecorator != null || length > 32768 || !canUseCharArrays()) {
            return createParser((Reader) new StringReader(str));
        }
        po2 _createContext = _createContext(_createContentReference(str), true);
        char[] i = _createContext.mo24739i(length);
        str.getChars(0, length, i, 0);
        return _createParser(i, 0, length, _createContext, true);
    }

    public JsonFactory(C1977a aVar) {
        this._rootCharSymbols = yd0.m30513j();
        this._byteSymbolCanonicalizer = y60.m30387u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = aVar.f9839a;
        this._parserFeatures = aVar.f9840b;
        this._generatorFeatures = aVar.f9841c;
        this._inputDecorator = aVar.f9842d;
        this._outputDecorator = aVar.f9843e;
        this._characterEscapes = aVar.f9832i;
        this._rootValueSeparator = aVar.f9833j;
        this._maximumNonEscapedChar = aVar.f9834k;
        this._quoteChar = aVar.f9835l;
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        return createParser(cArr, 0, cArr.length);
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        if (this._inputDecorator != null) {
            return createParser((Reader) new CharArrayReader(cArr, i, i2));
        }
        return _createParser(cArr, i, i2, _createContext(_createContentReference(cArr, i, i2), true), false);
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        po2 _createContext = _createContext(_createContentReference(dataInput), false);
        return _createParser(_decorate(dataInput, _createContext), _createContext);
    }

    public JsonFactory(C1978b<?, ?> bVar, boolean z) {
        this._rootCharSymbols = yd0.m30513j();
        this._byteSymbolCanonicalizer = y60.m30387u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = bVar.f9839a;
        this._parserFeatures = bVar.f9840b;
        this._generatorFeatures = bVar.f9841c;
        this._inputDecorator = bVar.f9842d;
        this._outputDecorator = bVar.f9843e;
        this._characterEscapes = null;
        this._rootValueSeparator = null;
        this._maximumNonEscapedChar = 0;
        this._quoteChar = DEFAULT_QUOTE_CHAR;
    }
}
