package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.C1979c;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.p009io.CharacterEscapes;
import com.fasterxml.jackson.databind.C1988a;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.cfg.MutableCoercionConfig;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.C1999a;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.C2029f;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.web3j.ens.contracts.generated.PublicResolver;

public class ObjectMapper extends xe4 implements Serializable {
    public static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    public static final BaseSettings DEFAULT_BASE;
    private static final long serialVersionUID = 2;
    public final CoercionConfigs _coercionConfigs;
    public final ConfigOverrides _configOverrides;
    public DeserializationConfig _deserializationConfig;
    public DefaultDeserializationContext _deserializationContext;
    public iu2 _injectableValues;
    public final JsonFactory _jsonFactory;
    public SimpleMixInResolver _mixIns;
    public Set<Object> _registeredModuleTypes;
    public final ConcurrentHashMap<JavaType, o43<Object>> _rootDeserializers;
    public SerializationConfig _serializationConfig;
    public yw5 _serializerFactory;
    public DefaultSerializerProvider _serializerProvider;
    public jd6 _subtypeResolver;
    public TypeFactory _typeFactory;

    public static class DefaultTypeResolverBuilder extends u96 implements Serializable {
        private static final long serialVersionUID = 1;
        public final DefaultTyping _appliesFor;
        public final PolymorphicTypeValidator _subtypeValidator;

        @Deprecated
        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping) {
            this(defaultTyping, (PolymorphicTypeValidator) LaissezFaireSubTypeValidator.instance);
        }

        /* renamed from: a */
        public static <T> T m13987a(T t, String str) {
            if (t != null) {
                return t;
            }
            throw new NullPointerException(str);
        }

        public static DefaultTypeResolverBuilder construct(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            return new DefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator);
        }

        public j07 buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeDeserializer(deserializationConfig, javaType, collection);
            }
            return null;
        }

        public m17 buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeSerializer(serializationConfig, javaType, collection);
            }
            return null;
        }

        public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
            return this._subtypeValidator;
        }

        public boolean useForType(JavaType javaType) {
            Class<C1979c> cls = C1979c.class;
            if (javaType.isPrimitive()) {
                return false;
            }
            int i = C1986c.f9880a[this._appliesFor.ordinal()];
            if (i == 1) {
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
            } else if (i != 2) {
                if (i == 3) {
                    while (javaType.isArrayType()) {
                        javaType = javaType.getContentType();
                    }
                    while (javaType.isReferenceType()) {
                        javaType = javaType.getReferencedType();
                    }
                    if (javaType.isFinal() || cls.isAssignableFrom(javaType.getRawClass())) {
                        return false;
                    }
                    return true;
                } else if (i != 4) {
                    return javaType.isJavaLangObject();
                } else {
                    return true;
                }
            }
            while (javaType.isReferenceType()) {
                javaType = javaType.getReferencedType();
            }
            if (javaType.isJavaLangObject() || (!javaType.isConcrete() && !cls.isAssignableFrom(javaType.getRawClass()))) {
                return true;
            }
            return false;
        }

        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            this._appliesFor = (DefaultTyping) m13987a(defaultTyping, "Can not pass `null` DefaultTyping");
            this._subtypeValidator = (PolymorphicTypeValidator) m13987a(polymorphicTypeValidator, "Can not pass `null` PolymorphicTypeValidator");
        }

        public DefaultTypeResolverBuilder withDefaultImpl(Class<?> cls) {
            if (this._defaultImpl == cls) {
                return this;
            }
            wf0.m29527n0(DefaultTypeResolverBuilder.class, this, "withDefaultImpl");
            return new DefaultTypeResolverBuilder(this, cls);
        }

        public DefaultTypeResolverBuilder(DefaultTypeResolverBuilder defaultTypeResolverBuilder, Class<?> cls) {
            super(defaultTypeResolverBuilder, cls);
            this._appliesFor = defaultTypeResolverBuilder._appliesFor;
            this._subtypeValidator = defaultTypeResolverBuilder._subtypeValidator;
        }
    }

    public enum DefaultTyping {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL,
        EVERYTHING
    }

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$a */
    public class C1984a implements C1988a.C1989a {
        public C1984a() {
        }

        /* renamed from: a */
        public void mo14718a(ia3 ia3) {
            C1999a withAdditionalKeyDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalKeyDeserializers(ia3);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAdditionalKeyDeserializers);
        }

        /* renamed from: b */
        public void mo14719b(l87 l87) {
            C1999a withValueInstantiators = ObjectMapper.this._deserializationContext._factory.withValueInstantiators(l87);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(withValueInstantiators);
        }

        /* renamed from: c */
        public void mo14720c(NamedType... namedTypeArr) {
            ObjectMapper.this.registerSubtypes(namedTypeArr);
        }

        /* renamed from: d */
        public void mo14721d(ax5 ax5) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalSerializers(ax5);
        }

        /* renamed from: e */
        public void mo14722e(be1 be1) {
            C1999a withAdditionalDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalDeserializers(be1);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAdditionalDeserializers);
        }

        /* renamed from: f */
        public void mo14723f(Class<?> cls, Class<?> cls2) {
            ObjectMapper.this.addMixIn(cls, cls2);
        }

        /* renamed from: g */
        public void mo14724g(C2805m7 m7Var) {
            C1999a withAbstractTypeResolver = ObjectMapper.this._deserializationContext._factory.withAbstractTypeResolver(m7Var);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAbstractTypeResolver);
        }

        /* renamed from: h */
        public void mo14725h(ax5 ax5) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalKeySerializers(ax5);
        }

        /* renamed from: i */
        public void mo14726i(PropertyNamingStrategy propertyNamingStrategy) {
            ObjectMapper.this.setPropertyNamingStrategy(propertyNamingStrategy);
        }

        /* renamed from: j */
        public void mo14727j(p00 p00) {
            C1999a withDeserializerModifier = ObjectMapper.this._deserializationContext._factory.withDeserializerModifier(p00);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(withDeserializerModifier);
        }

        /* renamed from: k */
        public void mo14728k(s00 s00) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withSerializerModifier(s00);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$b */
    public static class C1985b implements PrivilegedAction<ServiceLoader<T>> {

        /* renamed from: a */
        public final /* synthetic */ ClassLoader f9878a;

        /* renamed from: b */
        public final /* synthetic */ Class f9879b;

        public C1985b(ClassLoader classLoader, Class cls) {
            this.f9878a = classLoader;
            this.f9879b = cls;
        }

        /* renamed from: a */
        public ServiceLoader<T> run() {
            ClassLoader classLoader = this.f9878a;
            if (classLoader == null) {
                return ServiceLoader.load(this.f9879b);
            }
            return ServiceLoader.load(this.f9879b, classLoader);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$c */
    public static /* synthetic */ class C1986c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9880a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping[] r0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9880a = r0
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9880a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9880a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9880a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.EVERYTHING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9880a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper.C1986c.<clinit>():void");
        }
    }

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        DEFAULT_ANNOTATION_INTROSPECTOR = jacksonAnnotationIntrospector;
        DEFAULT_BASE = new BaseSettings((C2029f) null, jacksonAnnotationIntrospector, (PropertyNamingStrategy) null, TypeFactory.defaultInstance(), (l17<?>) null, StdDateFormat.instance, (wk2) null, Locale.getDefault(), (TimeZone) null, C3514vx.m29159a(), LaissezFaireSubTypeValidator.instance, new DefaultAccessorNamingStrategy.Provider());
    }

    public ObjectMapper() {
        this((JsonFactory) null, (DefaultSerializerProvider) null, (DefaultDeserializationContext) null);
    }

    /* renamed from: c */
    public static <T> ServiceLoader<T> m13984c(Class<T> cls, ClassLoader classLoader) {
        if (System.getSecurityManager() != null) {
            return (ServiceLoader) AccessController.doPrivileged(new C1985b(classLoader, cls));
        }
        if (classLoader == null) {
            return ServiceLoader.load(cls);
        }
        return ServiceLoader.load(cls, classLoader);
    }

    public static List<C1988a> findModules() {
        return findModules((ClassLoader) null);
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", new Object[]{str}));
        }
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() != cls) {
            throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
        }
    }

    @Deprecated
    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        getSerializationConfig().initialize(jsonGenerator);
        _writeValueAndClose(jsonGenerator, obj);
    }

    public l17<?> _constructDefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
        return DefaultTypeResolverBuilder.construct(defaultTyping, polymorphicTypeValidator);
    }

    public Object _convert(Object obj, JavaType javaType) throws IllegalArgumentException {
        Object obj2;
        DefaultSerializerProvider _serializerProvider2 = _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE));
        fr6 bufferForValueConversion = _serializerProvider2.bufferForValueConversion(this);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            bufferForValueConversion = bufferForValueConversion.mo20077E1(true);
        }
        try {
            _serializerProvider2.serializeValue(bufferForValueConversion, obj);
            JsonParser x1 = bufferForValueConversion.mo20092x1();
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            JsonToken _initForReading = _initForReading(x1, javaType);
            if (_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext createDeserializationContext = createDeserializationContext(x1, deserializationConfig);
                obj2 = _findRootDeserializer(createDeserializationContext, javaType).getNullValue(createDeserializationContext);
            } else {
                if (_initForReading != JsonToken.END_ARRAY) {
                    if (_initForReading != JsonToken.END_OBJECT) {
                        DefaultDeserializationContext createDeserializationContext2 = createDeserializationContext(x1, deserializationConfig);
                        obj2 = _findRootDeserializer(createDeserializationContext2, javaType).deserialize(x1, createDeserializationContext2);
                    }
                }
                obj2 = null;
            }
            x1.close();
            return obj2;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public o43<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws DatabindException {
        o43<Object> o43 = this._rootDeserializers.get(javaType);
        if (o43 != null) {
            return o43;
        }
        o43<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (findRootValueDeserializer == null) {
            return (o43) deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, findRootValueDeserializer);
        return findRootValueDeserializer;
    }

    public JsonToken _initForReading(JsonParser jsonParser, JavaType javaType) throws IOException {
        this._deserializationConfig.initialize(jsonParser);
        JsonToken g = jsonParser.mo13965g();
        if (g != null || (g = jsonParser.mo13938N0()) != null) {
            return g;
        }
        throw MismatchedInputException.from(jsonParser, javaType, "No content to map due to end-of-input");
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig) {
        return new ObjectReader(this, deserializationConfig);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig) {
        return new ObjectWriter(this, serializationConfig);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r6 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r7.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _readMapAndClose(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.JavaType r7) throws java.io.IOException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r5.getDeserializationConfig()     // Catch:{ all -> 0x003f }
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r1 = r5.createDeserializationContext(r6, r0)     // Catch:{ all -> 0x003f }
            com.fasterxml.jackson.core.JsonToken r2 = r5._initForReading(r6, r7)     // Catch:{ all -> 0x003f }
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x003f }
            r4 = 0
            if (r2 != r3) goto L_0x001a
            o43 r2 = r5._findRootDeserializer(r1, r7)     // Catch:{ all -> 0x003f }
            java.lang.Object r4 = r2.getNullValue(r1)     // Catch:{ all -> 0x003f }
            goto L_0x002e
        L_0x001a:
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ all -> 0x003f }
            if (r2 == r3) goto L_0x002e
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ all -> 0x003f }
            if (r2 != r3) goto L_0x0023
            goto L_0x002e
        L_0x0023:
            o43 r2 = r5._findRootDeserializer(r1, r7)     // Catch:{ all -> 0x003f }
            java.lang.Object r4 = r1.readRootValue(r6, r7, r2, r4)     // Catch:{ all -> 0x003f }
            r1.checkUnresolvedObjectId()     // Catch:{ all -> 0x003f }
        L_0x002e:
            com.fasterxml.jackson.databind.DeserializationFeature r2 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x003f }
            boolean r0 = r0.isEnabled(r2)     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0039
            r5._verifyNoTrailingTokens(r6, r1, r7)     // Catch:{ all -> 0x003f }
        L_0x0039:
            if (r6 == 0) goto L_0x003e
            r6.close()
        L_0x003e:
            return r4
        L_0x003f:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            if (r6 == 0) goto L_0x004c
            r6.close()     // Catch:{ all -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r6 = move-exception
            r7.addSuppressed(r6)
        L_0x004c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.JavaType):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r6 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        r0.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.g53 _readTreeAndClose(com.fasterxml.jackson.core.JsonParser r6) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.Class<g53> r0 = p000.g53.class
            com.fasterxml.jackson.databind.JavaType r0 = r5.constructType((java.lang.reflect.Type) r0)     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r5.getDeserializationConfig()     // Catch:{ all -> 0x0050 }
            r1.initialize(r6)     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.core.JsonToken r2 = r6.mo13965g()     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x0025
            com.fasterxml.jackson.core.JsonToken r2 = r6.mo13938N0()     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x0025
            com.fasterxml.jackson.databind.node.JsonNodeFactory r0 = r1.getNodeFactory()     // Catch:{ all -> 0x0050 }
            g53 r0 = r0.missingNode()     // Catch:{ all -> 0x0050 }
            r6.close()
            return r0
        L_0x0025:
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r3 = r5.createDeserializationContext(r6, r1)     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x0050 }
            if (r2 != r4) goto L_0x0036
            com.fasterxml.jackson.databind.node.JsonNodeFactory r2 = r1.getNodeFactory()     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.node.NullNode r2 = r2.nullNode()     // Catch:{ all -> 0x0050 }
            goto L_0x0041
        L_0x0036:
            o43 r2 = r5._findRootDeserializer(r3, r0)     // Catch:{ all -> 0x0050 }
            r4 = 0
            java.lang.Object r2 = r3.readRootValue(r6, r0, r2, r4)     // Catch:{ all -> 0x0050 }
            g53 r2 = (p000.g53) r2     // Catch:{ all -> 0x0050 }
        L_0x0041:
            com.fasterxml.jackson.databind.DeserializationFeature r4 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.isEnabled(r4)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004c
            r5._verifyNoTrailingTokens(r6, r3, r0)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            r6.close()
            return r2
        L_0x0050:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            if (r6 == 0) goto L_0x005d
            r6.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r6 = move-exception
            r0.addSuppressed(r6)
        L_0x005d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._readTreeAndClose(com.fasterxml.jackson.core.JsonParser):g53");
    }

    public Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) throws IOException {
        JsonToken _initForReading = _initForReading(jsonParser, javaType);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
        Object obj = null;
        if (_initForReading == JsonToken.VALUE_NULL) {
            obj = _findRootDeserializer(createDeserializationContext, javaType).getNullValue(createDeserializationContext);
        } else if (!(_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT)) {
            obj = createDeserializationContext.readRootValue(jsonParser, javaType, _findRootDeserializer(createDeserializationContext, javaType), (Object) null);
        }
        jsonParser.mo13962e();
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createDeserializationContext, javaType);
        }
        return obj;
    }

    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        JsonToken N0 = jsonParser.mo13938N0();
        if (N0 != null) {
            deserializationContext.reportTrailingTokens(wf0.m29507d0(javaType), jsonParser, N0);
        }
    }

    public void _verifySchemaType(d82 d82) {
        if (d82 != null && !this._jsonFactory.canUseSchema(d82)) {
            throw new IllegalArgumentException("Cannot use FormatSchema of type " + d82.getClass().getName() + " for format " + this._jsonFactory.getFormatName());
        }
    }

    public final void _writeValueAndClose(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = getSerializationConfig();
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
                jsonGenerator.close();
            } catch (Exception e) {
                wf0.m29520k(jsonGenerator, e);
            }
        } else {
            mo14476a(jsonGenerator, obj, serializationConfig);
        }
    }

    /* renamed from: a */
    public final void mo14476a(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                wf0.m29518j(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
            wf0.m29518j(jsonGenerator, closeable, e);
        }
    }

    public void acceptJsonFormatVisitor(Class<?> cls, t43 t43) throws JsonMappingException {
        acceptJsonFormatVisitor(this._typeFactory.constructType((Type) cls), t43);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator) {
        return activateDefaultTyping(polymorphicTypeValidator, DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper activateDefaultTypingAsProperty(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, String str) {
        return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.C1972Id.CLASS, (r07) null).inclusion(JsonTypeInfo.C1971As.PROPERTY).typeProperty(str));
    }

    public ObjectMapper addHandler(nd1 nd1) {
        this._deserializationConfig = this._deserializationConfig.withHandler(nd1);
        return this;
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.addLocalDefinition(cls, cls2);
        return this;
    }

    @Deprecated
    public final void addMixInAnnotations(Class<?> cls, Class<?> cls2) {
        addMixIn(cls, cls2);
    }

    /* renamed from: b */
    public final void mo14486b(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            wf0.m29518j((JsonGenerator) null, closeable, e);
        }
    }

    public boolean canDeserialize(JavaType javaType) {
        return createDeserializationContext((JsonParser) null, getDeserializationConfig()).hasValueDeserializerFor(javaType, (AtomicReference<Throwable>) null);
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, (AtomicReference<Throwable>) null);
    }

    public ObjectMapper clearProblemHandlers() {
        this._deserializationConfig = this._deserializationConfig.withNoProblemHandlers();
        return this;
    }

    public MutableCoercionConfig coercionConfigDefaults() {
        return this._coercionConfigs.defaultCoercions();
    }

    public MutableCoercionConfig coercionConfigFor(LogicalType logicalType) {
        return this._coercionConfigs.findOrCreateCoercion(logicalType);
    }

    public MutableConfigOverride configOverride(Class<?> cls) {
        return this._configOverrides.findOrCreateOverride(cls);
    }

    @Deprecated
    public ObjectMapper configure(MapperFeature mapperFeature, boolean z) {
        MapperConfigBase mapperConfigBase;
        MapperConfigBase mapperConfigBase2;
        if (z) {
            mapperConfigBase = this._serializationConfig.with(new MapperFeature[]{mapperFeature});
        } else {
            mapperConfigBase = this._serializationConfig.without(new MapperFeature[]{mapperFeature});
        }
        this._serializationConfig = (SerializationConfig) mapperConfigBase;
        if (z) {
            mapperConfigBase2 = this._deserializationConfig.with(new MapperFeature[]{mapperFeature});
        } else {
            mapperConfigBase2 = this._deserializationConfig.without(new MapperFeature[]{mapperFeature});
        }
        this._deserializationConfig = (DeserializationConfig) mapperConfigBase2;
        return this;
    }

    public JavaType constructType(Type type) {
        _assertNotNull("t", type);
        return this._typeFactory.constructType(type);
    }

    public <T> T convertValue(Object obj, Class<T> cls) throws IllegalArgumentException {
        return _convert(obj, this._typeFactory.constructType((Type) cls));
    }

    public ObjectMapper copy() {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this);
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, jsonParser, (iu2) null);
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(outputStream, JsonEncoding.UTF8);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        return this._deserializationConfig.initialize(this._jsonFactory.createNonBlockingByteArrayParser());
    }

    public JsonParser createParser(File file) throws IOException {
        _assertNotNull("src", file);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(file));
    }

    public ObjectMapper deactivateDefaultTyping() {
        return setDefaultTyping((l17<?>) null);
    }

    public C2029f defaultClassIntrospector() {
        return new BasicClassIntrospector();
    }

    @Deprecated
    public ObjectMapper disable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.without(mapperFeatureArr);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.without(mapperFeatureArr);
        return this;
    }

    @Deprecated
    public ObjectMapper disableDefaultTyping() {
        return setDefaultTyping((l17<?>) null);
    }

    @Deprecated
    public ObjectMapper enable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(mapperFeatureArr);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(mapperFeatureArr);
        return this;
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping() {
        return activateDefaultTyping(getPolymorphicTypeValidator());
    }

    @Deprecated
    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaultTyping, String str) {
        return activateDefaultTypingAsProperty(getPolymorphicTypeValidator(), defaultTyping, str);
    }

    public ObjectMapper findAndRegisterModules() {
        return registerModules((Iterable<? extends C1988a>) findModules());
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    @Deprecated
    public u63 generateJsonSchema(Class<?> cls) throws JsonMappingException {
        return _serializerProvider(getSerializationConfig()).generateJsonSchema(cls);
    }

    public DateFormat getDateFormat() {
        return this._serializationConfig.getDateFormat();
    }

    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    public DeserializationContext getDeserializationContext() {
        return this._deserializationContext;
    }

    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public iu2 getInjectableValues() {
        return null;
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.getNodeFactory();
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        return this._deserializationConfig.getBaseSettings().getPolymorphicTypeValidator();
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._serializationConfig.getPropertyNamingStrategy();
    }

    public Set<Object> getRegisteredModuleIds() {
        Set<Object> set = this._registeredModuleTypes;
        if (set == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(set);
    }

    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    public yw5 getSerializerFactory() {
        return this._serializerFactory;
    }

    public zw5 getSerializerProvider() {
        return this._serializerProvider;
    }

    public zw5 getSerializerProviderInstance() {
        return _serializerProvider(this._serializationConfig);
    }

    public jd6 getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public VisibilityChecker<?> getVisibilityChecker() {
        return this._serializationConfig.getDefaultVisibilityChecker();
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.isEnabled(mapperFeature);
    }

    public int mixInCount() {
        return this._mixIns.localSize();
    }

    public <T extends C1979c> T readTree(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.mo13965g() == null && jsonParser.mo13938N0() == null) {
            return null;
        }
        T t = (g53) _readValue(deserializationConfig, jsonParser, constructType((Type) g53.class));
        return t == null ? getNodeFactory().nullNode() : t;
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("p", jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader reader() {
        return _newReader(getDeserializationConfig()).with((iu2) null);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, (Object) null, (d82) null, (iu2) null);
    }

    public ObjectReader readerForArrayOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructArrayType(cls), (Object) null, (d82) null, (iu2) null);
    }

    public ObjectReader readerForListOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructCollectionType((Class<? extends Collection>) List.class, cls), (Object) null, (d82) null, (iu2) null);
    }

    public ObjectReader readerForMapOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructMapType((Class<? extends Map>) Map.class, (Class<?>) String.class, cls), (Object) null, (d82) null, (iu2) null);
    }

    public ObjectReader readerForUpdating(Object obj) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) obj.getClass()), obj, (d82) null, (iu2) null);
    }

    public ObjectReader readerWithView(Class<?> cls) {
        return _newReader(getDeserializationConfig().withView(cls));
    }

    public ObjectMapper registerModule(C1988a aVar) {
        Object typeId;
        _assertNotNull("module", aVar);
        if (aVar.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        } else if (aVar.version() != null) {
            for (C1988a registerModule : aVar.getDependencies()) {
                registerModule(registerModule);
            }
            if (isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (typeId = aVar.getTypeId()) != null) {
                if (this._registeredModuleTypes == null) {
                    this._registeredModuleTypes = new LinkedHashSet();
                }
                if (!this._registeredModuleTypes.add(typeId)) {
                    return this;
                }
            }
            aVar.setupModule(new C1984a());
            return this;
        } else {
            throw new IllegalArgumentException("Module without defined version");
        }
    }

    public ObjectMapper registerModules(C1988a... aVarArr) {
        for (C1988a registerModule : aVarArr) {
            registerModule(registerModule);
        }
        return this;
    }

    public void registerSubtypes(Class<?>... clsArr) {
        getSubtypeResolver().registerSubtypes(clsArr);
    }

    public ObjectMapper setAccessorNaming(AccessorNamingStrategy.Provider provider) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(provider);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(provider);
        return this;
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(annotationIntrospector);
        return this;
    }

    public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(annotationIntrospector2);
        return this;
    }

    public ObjectMapper setBase64Variant(Base64Variant base64Variant) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(base64Variant);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(base64Variant);
        return this;
    }

    public ObjectMapper setConfig(DeserializationConfig deserializationConfig) {
        _assertNotNull("config", deserializationConfig);
        this._deserializationConfig = deserializationConfig;
        return this;
    }

    public ObjectMapper setConstructorDetector(ConstructorDetector constructorDetector) {
        this._deserializationConfig = this._deserializationConfig.with(constructorDetector);
        return this;
    }

    public ObjectMapper setDateFormat(DateFormat dateFormat) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(dateFormat);
        this._serializationConfig = this._serializationConfig.with(dateFormat);
        return this;
    }

    public ObjectMapper setDefaultAttributes(ContextAttributes contextAttributes) {
        this._deserializationConfig = this._deserializationConfig.with(contextAttributes);
        this._serializationConfig = this._serializationConfig.with(contextAttributes);
        return this;
    }

    public ObjectMapper setDefaultLeniency(Boolean bool) {
        this._configOverrides.setDefaultLeniency(bool);
        return this;
    }

    public ObjectMapper setDefaultMergeable(Boolean bool) {
        this._configOverrides.setDefaultMergeable(bool);
        return this;
    }

    public ObjectMapper setDefaultPrettyPrinter(su4 su4) {
        this._serializationConfig = this._serializationConfig.withDefaultPrettyPrinter(su4);
        return this;
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    public ObjectMapper setDefaultSetterInfo(JsonSetter.Value value) {
        this._configOverrides.setDefaultSetterInfo(value);
        return this;
    }

    public ObjectMapper setDefaultTyping(l17<?> l17) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(l17);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(l17);
        return this;
    }

    public ObjectMapper setDefaultVisibility(JsonAutoDetect.Value value) {
        this._configOverrides.setDefaultVisibility(VisibilityChecker.Std.construct(value));
        return this;
    }

    public ObjectMapper setFilterProvider(p12 p12) {
        this._serializationConfig = this._serializationConfig.withFilters(p12);
        return this;
    }

    @Deprecated
    public void setFilters(p12 p12) {
        this._serializationConfig = this._serializationConfig.withFilters(p12);
    }

    public Object setHandlerInstantiator(wk2 wk2) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(wk2);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(wk2);
        return this;
    }

    public ObjectMapper setInjectableValues(iu2 iu2) {
        return this;
    }

    public ObjectMapper setLocale(Locale locale) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(locale);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(locale);
        return this;
    }

    @Deprecated
    public void setMixInAnnotations(Map<Class<?>, Class<?>> map) {
        setMixIns(map);
    }

    public ObjectMapper setMixInResolver(C2029f.C2030a aVar) {
        SimpleMixInResolver withOverrides = this._mixIns.withOverrides(aVar);
        if (withOverrides != this._mixIns) {
            this._mixIns = withOverrides;
            this._deserializationConfig = new DeserializationConfig(this._deserializationConfig, withOverrides);
            this._serializationConfig = new SerializationConfig(this._serializationConfig, withOverrides);
        }
        return this;
    }

    public ObjectMapper setMixIns(Map<Class<?>, Class<?>> map) {
        this._mixIns.setLocalDefinitions(map);
        return this;
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonNodeFactory) {
        this._deserializationConfig = this._deserializationConfig.with(jsonNodeFactory);
        return this;
    }

    public ObjectMapper setPolymorphicTypeValidator(PolymorphicTypeValidator polymorphicTypeValidator) {
        this._deserializationConfig = this._deserializationConfig._withBase(this._deserializationConfig.getBaseSettings().with(polymorphicTypeValidator));
        return this;
    }

    @Deprecated
    public ObjectMapper setPropertyInclusion(JsonInclude.Value value) {
        return setDefaultPropertyInclusion(value);
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(propertyNamingStrategy);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(propertyNamingStrategy);
        return this;
    }

    public ObjectMapper setSerializationInclusion(JsonInclude.Include include) {
        setPropertyInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    public ObjectMapper setSerializerFactory(yw5 yw5) {
        this._serializerFactory = yw5;
        return this;
    }

    public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        this._serializerProvider = defaultSerializerProvider;
        return this;
    }

    public ObjectMapper setSubtypeResolver(jd6 jd6) {
        this._subtypeResolver = jd6;
        this._deserializationConfig = this._deserializationConfig.with(jd6);
        this._serializationConfig = this._serializationConfig.with(jd6);
        return this;
    }

    public ObjectMapper setTimeZone(TimeZone timeZone) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(timeZone);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(timeZone);
        return this;
    }

    public ObjectMapper setTypeFactory(TypeFactory typeFactory) {
        this._typeFactory = typeFactory;
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(typeFactory);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(typeFactory);
        return this;
    }

    public ObjectMapper setVisibility(VisibilityChecker<?> visibilityChecker) {
        this._configOverrides.setDefaultVisibility(visibilityChecker);
        return this;
    }

    @Deprecated
    public void setVisibilityChecker(VisibilityChecker<?> visibilityChecker) {
        setVisibility(visibilityChecker);
    }

    public JsonFactory tokenStreamFactory() {
        return this._jsonFactory;
    }

    public JsonParser treeAsTokens(C1979c cVar) {
        _assertNotNull("n", cVar);
        return new tx6((g53) cVar, this);
    }

    public <T> T treeToValue(C1979c cVar, Class<T> cls) throws IllegalArgumentException, JsonProcessingException {
        T pojo;
        if (cVar == null) {
            return null;
        }
        try {
            if (C1979c.class.isAssignableFrom(cls) && cls.isAssignableFrom(cVar.getClass())) {
                return cVar;
            }
            if (cVar.asToken() != JsonToken.VALUE_EMBEDDED_OBJECT || !(cVar instanceof POJONode) || ((pojo = ((POJONode) cVar).getPojo()) != null && !cls.isInstance(pojo))) {
                return readValue(treeAsTokens(cVar), cls);
            }
            return pojo;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    public <T> T updateValue(T t, Object obj) throws JsonMappingException {
        if (t == null || obj == null) {
            return t;
        }
        DefaultSerializerProvider _serializerProvider2 = _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE));
        fr6 bufferForValueConversion = _serializerProvider2.bufferForValueConversion(this);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            bufferForValueConversion = bufferForValueConversion.mo20077E1(true);
        }
        try {
            _serializerProvider2.serializeValue(bufferForValueConversion, obj);
            JsonParser x1 = bufferForValueConversion.mo20092x1();
            T readValue = readerForUpdating(t).readValue(x1);
            x1.close();
            return readValue;
        } catch (IOException e) {
            if (e instanceof JsonMappingException) {
                throw ((JsonMappingException) e);
            }
            throw JsonMappingException.fromUnexpectedIOE(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r4 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends p000.g53> T valueToTree(java.lang.Object r4) throws java.lang.IllegalArgumentException {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x000b
            com.fasterxml.jackson.databind.node.JsonNodeFactory r4 = r3.getNodeFactory()
            com.fasterxml.jackson.databind.node.NullNode r4 = r4.nullNode()
            return r4
        L_0x000b:
            com.fasterxml.jackson.databind.SerializationConfig r0 = r3.getSerializationConfig()
            com.fasterxml.jackson.databind.SerializationFeature r1 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_ROOT_VALUE
            com.fasterxml.jackson.databind.SerializationConfig r0 = r0.without((com.fasterxml.jackson.databind.SerializationFeature) r1)
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider r0 = r3._serializerProvider(r0)
            fr6 r1 = r0.bufferForValueConversion(r3)
            com.fasterxml.jackson.databind.DeserializationFeature r2 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS
            boolean r2 = r3.isEnabled((com.fasterxml.jackson.databind.DeserializationFeature) r2)
            if (r2 == 0) goto L_0x002a
            r2 = 1
            fr6 r1 = r1.mo20077E1(r2)
        L_0x002a:
            r0.serializeValue(r1, r4)     // Catch:{ IOException -> 0x004b }
            com.fasterxml.jackson.core.JsonParser r4 = r1.mo20092x1()     // Catch:{ IOException -> 0x004b }
            com.fasterxml.jackson.core.c r0 = r3.readTree((com.fasterxml.jackson.core.JsonParser) r4)     // Catch:{ all -> 0x003d }
            g53 r0 = (p000.g53) r0     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x003c
            r4.close()     // Catch:{ IOException -> 0x004b }
        L_0x003c:
            return r0
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            if (r4 == 0) goto L_0x004a
            r4.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch:{ IOException -> 0x004b }
        L_0x004a:
            throw r1     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            r4 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r4.getMessage()
            r0.<init>(r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper.valueToTree(java.lang.Object):g53");
    }

    public Version version() {
        return rk4.f17279a;
    }

    public void writeTree(JsonGenerator jsonGenerator, C1979c cVar) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, cVar);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException, StreamWriteException, DatabindException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.mo13887l() == null) {
            jsonGenerator.mo13901y(serializationConfig.constructDefaultPrettyPrinter());
        }
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
                return;
            }
            return;
        }
        mo14486b(jsonGenerator, obj, serializationConfig);
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
            com.fasterxml.jackson.core.JsonFactory r1 = r2._jsonFactory     // Catch:{ JsonProcessingException -> 0x0031, IOException -> 0x002b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper.writeValueAsBytes(java.lang.Object):byte[]");
    }

    public String writeValueAsString(Object obj) throws JsonProcessingException {
        ft5 ft5 = new ft5(this._jsonFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator((Writer) ft5), obj);
            return ft5.mo20168a();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectWriter writer() {
        return _newWriter(getSerializationConfig());
    }

    public ObjectWriter writerFor(Class<?> cls) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (cls == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType((Type) cls);
        }
        return _newWriter(serializationConfig, javaType, (su4) null);
    }

    public ObjectWriter writerWithDefaultPrettyPrinter() {
        SerializationConfig serializationConfig = getSerializationConfig();
        return _newWriter(serializationConfig, (JavaType) null, serializationConfig.getDefaultPrettyPrinter());
    }

    @Deprecated
    public ObjectWriter writerWithType(Class<?> cls) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (cls == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType((Type) cls);
        }
        return _newWriter(serializationConfig, javaType, (su4) null);
    }

    public ObjectWriter writerWithView(Class<?> cls) {
        return _newWriter(getSerializationConfig().withView(cls));
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, (DefaultSerializerProvider) null, (DefaultDeserializationContext) null);
    }

    public static List<C1988a> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator<C1988a> it = m13984c(C1988a.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig, JavaType javaType, Object obj, d82 d82, iu2 iu2) {
        return new ObjectReader(this, deserializationConfig, javaType, obj, d82, iu2);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, d82 d82) {
        return new ObjectWriter(this, serializationConfig, d82);
    }

    public void acceptJsonFormatVisitor(JavaType javaType, t43 t43) throws JsonMappingException {
        if (javaType != null) {
            _serializerProvider(getSerializationConfig()).acceptJsonFormatVisitor(javaType, t43);
            return;
        }
        throw new IllegalArgumentException("type must be provided");
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping) {
        return activateDefaultTyping(polymorphicTypeValidator, defaultTyping, JsonTypeInfo.C1971As.WRAPPER_ARRAY);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, atomicReference);
    }

    public MutableCoercionConfig coercionConfigFor(Class<?> cls) {
        return this._coercionConfigs.findOrCreateCoercion(cls);
    }

    public <T> T convertValue(Object obj, j17<T> j17) throws IllegalArgumentException {
        return _convert(obj, this._typeFactory.constructType((j17<?>) j17));
    }

    public ArrayNode createArrayNode() {
        return this._deserializationConfig.getNodeFactory().arrayNode();
    }

    public ObjectNode createObjectNode() {
        return this._deserializationConfig.getNodeFactory().objectNode();
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping) {
        return enableDefaultTyping(defaultTyping, JsonTypeInfo.C1971As.WRAPPER_ARRAY);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._serializationConfig.isEnabled(serializationFeature);
    }

    public g53 missingNode() {
        return this._deserializationConfig.getNodeFactory().missingNode();
    }

    public g53 nullNode() {
        return this._deserializationConfig.getNodeFactory().nullNode();
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature) {
        return _newReader(getDeserializationConfig().with(deserializationFeature));
    }

    public ObjectReader readerFor(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) cls), (Object) null, (d82) null, (iu2) null);
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        getSubtypeResolver().registerSubtypes(namedTypeArr);
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Include include) {
        this._configOverrides.setDefaultInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this._configOverrides.setDefaultVisibility(this._configOverrides.getDefaultVisibility().withVisibility(propertyAccessor, visibility));
        return this;
    }

    public ObjectWriter writer(SerializationFeature serializationFeature) {
        return _newWriter(getSerializationConfig().with(serializationFeature));
    }

    public ObjectMapper(ObjectMapper objectMapper) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        JsonFactory copy = objectMapper._jsonFactory.copy();
        this._jsonFactory = copy;
        copy.setCodec(this);
        this._subtypeResolver = objectMapper._subtypeResolver.copy();
        this._typeFactory = objectMapper._typeFactory;
        ConfigOverrides copy2 = objectMapper._configOverrides.copy();
        this._configOverrides = copy2;
        CoercionConfigs copy3 = objectMapper._coercionConfigs.copy();
        this._coercionConfigs = copy3;
        this._mixIns = objectMapper._mixIns.copy();
        RootNameLookup rootNameLookup = new RootNameLookup();
        ConfigOverrides configOverrides = copy2;
        this._serializationConfig = new SerializationConfig(objectMapper._serializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverrides);
        this._deserializationConfig = new DeserializationConfig(objectMapper._deserializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverrides, copy3);
        this._serializerProvider = objectMapper._serializerProvider.copy();
        this._deserializationContext = objectMapper._deserializationContext.copy();
        this._serializerFactory = objectMapper._serializerFactory;
        Set<Object> set = objectMapper._registeredModuleTypes;
        if (set == null) {
            this._registeredModuleTypes = null;
        } else {
            this._registeredModuleTypes = new LinkedHashSet(set);
        }
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, JavaType javaType, su4 su4) {
        return new ObjectWriter(this, serializationConfig, javaType, su4);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, JsonTypeInfo.C1971As as) {
        if (as != JsonTypeInfo.C1971As.EXTERNAL_PROPERTY) {
            return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.C1972Id.CLASS, (r07) null).inclusion(as));
        }
        throw new IllegalArgumentException("Cannot use includeAs of " + as);
    }

    public JavaType constructType(j17<?> j17) {
        _assertNotNull("typeRef", j17);
        return this._typeFactory.constructType(j17);
    }

    public <T> T convertValue(Object obj, JavaType javaType) throws IllegalArgumentException {
        return _convert(obj, javaType);
    }

    public JsonParser createParser(URL url) throws IOException {
        _assertNotNull("src", url);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(url));
    }

    public ObjectMapper disable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature);
        return this;
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping, JsonTypeInfo.C1971As as) {
        return activateDefaultTyping(getPolymorphicTypeValidator(), defaultTyping, as);
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.isEnabled(deserializationFeature);
    }

    public <T> T readValue(JsonParser jsonParser, j17<T> j17) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("p", jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType((j17<?>) j17));
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _newReader(getDeserializationConfig().with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader readerFor(j17<?> j17) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(j17), (Object) null, (d82) null, (iu2) null);
    }

    public ObjectMapper registerModules(Iterable<? extends C1988a> iterable) {
        _assertNotNull("modules", iterable);
        for (C1988a registerModule : iterable) {
            registerModule(registerModule);
        }
        return this;
    }

    public void registerSubtypes(Collection<Class<?>> collection) {
        getSubtypeResolver().registerSubtypes(collection);
    }

    public ObjectMapper setConfig(SerializationConfig serializationConfig) {
        _assertNotNull("config", serializationConfig);
        this._serializationConfig = serializationConfig;
        return this;
    }

    public ObjectWriter writer(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _newWriter(getSerializationConfig().with(serializationFeature, serializationFeatureArr));
    }

    public boolean canDeserialize(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        return createDeserializationContext((JsonParser) null, getDeserializationConfig()).hasValueDeserializerFor(javaType, atomicReference);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(outputStream, jsonEncoding);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature, serializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature, serializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._deserializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public <T> wn3<T> readValues(JsonParser jsonParser, af5 af5) throws IOException {
        return readValues(jsonParser, (JavaType) af5);
    }

    public ObjectReader reader(JsonNodeFactory jsonNodeFactory) {
        return _newReader(getDeserializationConfig()).with(jsonNodeFactory);
    }

    public ObjectWriter writer(DateFormat dateFormat) {
        return _newWriter(getSerializationConfig().with(dateFormat));
    }

    public ObjectWriter writerFor(j17<?> j17) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (j17 == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType(j17);
        }
        return _newWriter(serializationConfig, javaType, (su4) null);
    }

    @Deprecated
    public ObjectWriter writerWithType(j17<?> j17) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (j17 == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType(j17);
        }
        return _newWriter(serializationConfig, javaType, (su4) null);
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(serializationFeature) : this._serializationConfig.without(serializationFeature);
        return this;
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(inputStream));
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature);
        return this;
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._serializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public final <T> T readValue(JsonParser jsonParser, af5 af5) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("p", jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, (JavaType) af5);
    }

    public <T> wn3<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull("p", jsonParser);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, getDeserializationConfig());
        return new wn3(javaType, jsonParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext, javaType), false, (Object) null);
    }

    public ObjectReader reader(d82 d82) {
        _verifySchemaType(d82);
        return _newReader(getDeserializationConfig(), (JavaType) null, (Object) null, d82, (iu2) null);
    }

    public ObjectWriter writer(su4 su4) {
        if (su4 == null) {
            su4 = ObjectWriter.NULL_PRETTY_PRINTER;
        }
        return _newWriter(getSerializationConfig(), (JavaType) null, su4);
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonFactory.Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public void writeTree(JsonGenerator jsonGenerator, g53 g53) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, g53);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z) {
        this._deserializationConfig = z ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        _assertNotNull("w", writer);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(writer);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(reader));
    }

    public ObjectMapper disable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature disable : featureArr) {
            this._jsonFactory.disable(disable);
        }
        return this;
    }

    public ObjectMapper enable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature enable : featureArr) {
            this._jsonFactory.enable(enable);
        }
        return this;
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return isEnabled(streamReadFeature.mappedFeature());
    }

    public g53 readTree(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return _readTreeAndClose(this._jsonFactory.createParser(inputStream));
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("p", jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, javaType);
    }

    public ObjectReader reader(iu2 iu2) {
        return _newReader(getDeserializationConfig(), (JavaType) null, (Object) null, (d82) null, iu2);
    }

    public ObjectWriter writer(p12 p12) {
        return _newWriter(getSerializationConfig().withFilters(p12));
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, (su4) null);
    }

    @Deprecated
    public ObjectWriter writerWithType(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, (su4) null);
    }

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.mappedFeature());
    }

    public ObjectReader reader(Base64Variant base64Variant) {
        return _newReader((DeserializationConfig) getDeserializationConfig().with(base64Variant));
    }

    public ObjectWriter writer(d82 d82) {
        _verifySchemaType(d82);
        return _newWriter(getSerializationConfig(), d82);
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, bArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(bArr));
    }

    public ObjectMapper disable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature disable : featureArr) {
            this._jsonFactory.disable(disable);
        }
        return this;
    }

    public ObjectMapper enable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature enable : featureArr) {
            this._jsonFactory.enable(enable);
        }
        return this;
    }

    public g53 readTree(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return _readTreeAndClose(this._jsonFactory.createParser(reader));
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", file);
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader reader(ContextAttributes contextAttributes) {
        return _newReader(getDeserializationConfig().with(contextAttributes));
    }

    public ObjectMapper configure(JsonGenerator.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("outputFile", file);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(file, jsonEncoding);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public <T> wn3<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        return readValues(jsonParser, this._typeFactory.constructType((Type) cls));
    }

    @Deprecated
    public ObjectReader reader(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, (Object) null, (d82) null, (iu2) null);
    }

    public ObjectWriter writer(Base64Variant base64Variant) {
        return _newWriter((SerializationConfig) getSerializationConfig().with(base64Variant));
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, bArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(bArr, i, i2));
    }

    public g53 readTree(String str) throws JsonProcessingException, JsonMappingException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, str);
        try {
            return _readTreeAndClose(this._jsonFactory.createParser(str));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T readValue(File file, j17<T> j17) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", file);
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((j17<?>) j17));
    }

    public <T> wn3<T> readValues(JsonParser jsonParser, j17<T> j17) throws IOException {
        return readValues(jsonParser, this._typeFactory.constructType((j17<?>) j17));
    }

    @Deprecated
    public ObjectReader reader(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) cls), (Object) null, (d82) null, (iu2) null);
    }

    public <T> T treeToValue(C1979c cVar, JavaType javaType) throws IllegalArgumentException, JsonProcessingException {
        T pojo;
        if (cVar == null) {
            return null;
        }
        try {
            if (javaType.isTypeOrSubTypeOf(C1979c.class) && javaType.isTypeOrSuperTypeOf(cVar.getClass())) {
                return cVar;
            }
            if (cVar.asToken() != JsonToken.VALUE_EMBEDDED_OBJECT || !(cVar instanceof POJONode) || ((pojo = ((POJONode) cVar).getPojo()) != null && !javaType.isTypeOrSuperTypeOf(pojo.getClass()))) {
                return readValue(treeAsTokens(cVar), javaType);
            }
            return pojo;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    public void writeValue(File file, Object obj) throws IOException, StreamWriteException, DatabindException {
        _writeValueAndClose(createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(CharacterEscapes characterEscapes) {
        return _newWriter(getSerializationConfig()).with(characterEscapes);
    }

    @Deprecated
    public ObjectReader reader(j17<?> j17) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(j17), (Object) null, (d82) null, (iu2) null);
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException, StreamWriteException, DatabindException {
        _writeValueAndClose(createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(ContextAttributes contextAttributes) {
        return _newWriter(getSerializationConfig().with(contextAttributes));
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        _assertNotNull("out", dataOutput);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(dataOutput);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createParser(String str) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, str);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(str));
    }

    public <T> T readValue(File file, JavaType javaType) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", file);
        return _readMapAndClose(this._jsonFactory.createParser(file), javaType);
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(dataOutput), obj);
    }

    public void writeValue(Writer writer, Object obj) throws IOException, StreamWriteException, DatabindException {
        _writeValueAndClose(createGenerator(writer), obj);
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, cArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(cArr));
    }

    public g53 readTree(byte[] bArr) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr));
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", url);
        return _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((Type) cls));
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, cArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(cArr, i, i2));
    }

    public g53 readTree(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr, i, i2));
    }

    public <T> T readValue(URL url, j17<T> j17) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", url);
        return _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((j17<?>) j17));
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, dataInput);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(dataInput));
    }

    public g53 readTree(File file) throws IOException {
        _assertNotNull("file", file);
        return _readTreeAndClose(this._jsonFactory.createParser(file));
    }

    public <T> T readValue(URL url, JavaType javaType) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", url);
        return _readMapAndClose(this._jsonFactory.createParser(url), javaType);
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver((C2029f.C2030a) null);
        this._mixIns = simpleMixInResolver;
        BaseSettings withClassIntrospector = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
        ConfigOverrides configOverrides = new ConfigOverrides();
        this._configOverrides = configOverrides;
        CoercionConfigs coercionConfigs = new CoercionConfigs();
        this._coercionConfigs = coercionConfigs;
        BaseSettings baseSettings = withClassIntrospector;
        SimpleMixInResolver simpleMixInResolver2 = simpleMixInResolver;
        RootNameLookup rootNameLookup2 = rootNameLookup;
        ConfigOverrides configOverrides2 = configOverrides;
        this._serializationConfig = new SerializationConfig(baseSettings, this._subtypeResolver, simpleMixInResolver2, rootNameLookup2, configOverrides2);
        this._deserializationConfig = new DeserializationConfig(baseSettings, this._subtypeResolver, simpleMixInResolver2, rootNameLookup2, configOverrides2, coercionConfigs);
        boolean requiresPropertyOrdering = this._jsonFactory.requiresPropertyOrdering();
        SerializationConfig serializationConfig = this._serializationConfig;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig.isEnabled(mapperFeature) ^ requiresPropertyOrdering) {
            configure(mapperFeature, requiresPropertyOrdering);
        }
        this._serializerProvider = defaultSerializerProvider == null ? new DefaultSerializerProvider.Impl() : defaultSerializerProvider;
        this._deserializationContext = defaultDeserializationContext == null ? new DefaultDeserializationContext.Impl((C1999a) BeanDeserializerFactory.instance) : defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    public g53 readTree(URL url) throws IOException {
        _assertNotNull("source", url);
        return _readTreeAndClose(this._jsonFactory.createParser(url));
    }

    public <T> T readValue(String str, Class<T> cls) throws JsonProcessingException, JsonMappingException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, str);
        return readValue(str, this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(String str, j17<T> j17) throws JsonProcessingException, JsonMappingException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, str);
        return readValue(str, this._typeFactory.constructType((j17<?>) j17));
    }

    public <T> T readValue(String str, JavaType javaType) throws JsonProcessingException, JsonMappingException {
        _assertNotNull(PublicResolver.FUNC_CONTENT, str);
        try {
            return _readMapAndClose(this._jsonFactory.createParser(str), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", reader);
        return _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(Reader reader, j17<T> j17) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", reader);
        return _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((j17<?>) j17));
    }

    public <T> T readValue(Reader reader, JavaType javaType) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", reader);
        return _readMapAndClose(this._jsonFactory.createParser(reader), javaType);
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", inputStream);
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(InputStream inputStream, j17<T> j17) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", inputStream);
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((j17<?>) j17));
    }

    public <T> T readValue(InputStream inputStream, JavaType javaType) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", inputStream);
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), javaType);
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, Class<T> cls) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(byte[] bArr, j17<T> j17) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((j17<?>) j17));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, j17<T> j17) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType((j17<?>) j17));
    }

    public <T> T readValue(byte[] bArr, JavaType javaType) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public <T> T readValue(byte[] bArr, int i, int i2, JavaType javaType) throws IOException, StreamReadException, DatabindException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), javaType);
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        _assertNotNull("src", dataInput);
        return _readMapAndClose(this._jsonFactory.createParser(dataInput), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(DataInput dataInput, JavaType javaType) throws IOException {
        _assertNotNull("src", dataInput);
        return _readMapAndClose(this._jsonFactory.createParser(dataInput), javaType);
    }
}
