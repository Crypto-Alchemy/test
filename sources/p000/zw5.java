package p000;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: zw5 */
/* compiled from: SerializerProvider */
public abstract class zw5 extends k21 {
    public static final boolean CACHE_UNKNOWN_MAPPINGS = false;
    public static final y63<Object> DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    public static final y63<Object> DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    public transient ContextAttributes _attributes;
    public final SerializationConfig _config;
    public DateFormat _dateFormat;
    public y63<Object> _keySerializer;
    public final m75 _knownSerializers;
    public y63<Object> _nullKeySerializer;
    public y63<Object> _nullValueSerializer;
    public final Class<?> _serializationView;
    public final ww5 _serializerCache;
    public final yw5 _serializerFactory;
    public final boolean _stdNullValueSerializer;
    public y63<Object> _unknownTypeSerializer;

    public zw5() {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new ww5();
        this._knownSerializers = null;
        this._serializationView = null;
        this._attributes = null;
        this._stdNullValueSerializer = true;
    }

    public y63<Object> _createAndCacheUntypedSerializer(Class<?> cls) throws JsonMappingException {
        y63<Object> y63;
        JavaType constructType = this._config.constructType(cls);
        try {
            y63 = _createUntypedSerializer(constructType);
        } catch (IllegalArgumentException e) {
            reportBadDefinition(constructType, wf0.m29528o(e));
            y63 = null;
        }
        if (y63 != null) {
            this._serializerCache.mo27604c(cls, constructType, y63, this);
        }
        return y63;
    }

    public y63<Object> _createUntypedSerializer(JavaType javaType) throws JsonMappingException {
        return this._serializerFactory.createSerializer(this, javaType);
    }

    public final DateFormat _dateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    public y63<Object> _findExplicitUntypedSerializer(Class<?> cls) throws JsonMappingException {
        y63<Object> f = this._knownSerializers.mo23066f(cls);
        if (f == null && (f = this._serializerCache.mo27613l(cls)) == null) {
            f = _createAndCacheUntypedSerializer(cls);
        }
        if (isUnknownTypeSerializer(f)) {
            return null;
        }
        return f;
    }

    public y63<Object> _handleContextualResolvable(y63<?> y63, BeanProperty beanProperty) throws JsonMappingException {
        if (y63 instanceof ye5) {
            ((ye5) y63).resolve(this);
        }
        return handleSecondaryContextualization(y63, beanProperty);
    }

    public y63<Object> _handleResolvable(y63<?> y63) throws JsonMappingException {
        if (y63 instanceof ye5) {
            ((ye5) y63).resolve(this);
        }
        return y63;
    }

    public void _reportIncompatibleRootType(Object obj, JavaType javaType) throws IOException {
        if (!javaType.isPrimitive() || !wf0.m29529o0(javaType.getRawClass()).isAssignableFrom(obj.getClass())) {
            reportBadDefinition(javaType, String.format("Incompatible types: declared root type (%s) vs %s", new Object[]{javaType, wf0.m29514h(obj)}));
        }
    }

    public fr6 bufferForValueConversion(xe4 xe4) {
        return new fr6(xe4, false);
    }

    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        if (javaType.hasRawClass(cls)) {
            return javaType;
        }
        return getConfig().getTypeFactory().constructSpecializedType(javaType, cls, true);
    }

    public void defaultSerializeDateKey(long j, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.mo13864b0(String.valueOf(j));
        } else {
            jsonGenerator.mo13864b0(_dateFormat().format(new Date(j)));
        }
    }

    public final void defaultSerializeDateValue(long j, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.mo13882i0(j);
        } else {
            jsonGenerator.mo13860Z0(_dateFormat().format(new Date(j)));
        }
    }

    public final void defaultSerializeField(String str, Object obj, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo13864b0(str);
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
        } else if (this._stdNullValueSerializer) {
            jsonGenerator.mo13866c0();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public final void defaultSerializeNull(JsonGenerator jsonGenerator) throws IOException {
        if (this._stdNullValueSerializer) {
            jsonGenerator.mo13866c0();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public final void defaultSerializeValue(Object obj, JsonGenerator jsonGenerator) throws IOException {
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
        } else if (this._stdNullValueSerializer) {
            jsonGenerator.mo13866c0();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public y63<Object> findContentValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> e = this._knownSerializers.mo23065e(javaType);
        if (e == null && (e = this._serializerCache.mo27612k(javaType)) == null && (e = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handleSecondaryContextualization(e, beanProperty);
    }

    public y63<Object> findKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return _handleContextualResolvable(this._serializerFactory.createKeySerializer(this, javaType, this._keySerializer), beanProperty);
    }

    public y63<Object> findNullKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return this._nullKeySerializer;
    }

    public y63<Object> findNullValueSerializer(BeanProperty beanProperty) throws JsonMappingException {
        return this._nullValueSerializer;
    }

    public abstract un7 findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator);

    public y63<Object> findPrimaryPropertySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> e = this._knownSerializers.mo23065e(javaType);
        if (e == null && (e = this._serializerCache.mo27612k(javaType)) == null && (e = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handlePrimaryContextualization(e, beanProperty);
    }

    public m17 findTypeSerializer(JavaType javaType) throws JsonMappingException {
        return this._serializerFactory.createTypeSerializer(this._config, javaType);
    }

    public y63<Object> findTypedValueSerializer(Class<?> cls, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> d = this._knownSerializers.mo23064d(cls);
        if (d != null) {
            return d;
        }
        y63<Object> j = this._serializerCache.mo27611j(cls);
        if (j != null) {
            return j;
        }
        y63<Object> findValueSerializer = findValueSerializer(cls, beanProperty);
        yw5 yw5 = this._serializerFactory;
        SerializationConfig serializationConfig = this._config;
        m17 createTypeSerializer = yw5.createTypeSerializer(serializationConfig, serializationConfig.constructType(cls));
        if (createTypeSerializer != null) {
            findValueSerializer = new d27(createTypeSerializer.mo11783a(beanProperty), findValueSerializer);
        }
        if (z) {
            this._serializerCache.mo27606e(cls, findValueSerializer);
        }
        return findValueSerializer;
    }

    public y63<Object> findValueSerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> f = this._knownSerializers.mo23066f(cls);
        if (f == null && (f = this._serializerCache.mo27613l(cls)) == null && (f = this._serializerCache.mo27612k(this._config.constructType(cls))) == null && (f = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handleSecondaryContextualization(f, beanProperty);
    }

    public final Class<?> getActiveView() {
        return this._serializationView;
    }

    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    public y63<Object> getDefaultNullKeySerializer() {
        return this._nullKeySerializer;
    }

    public y63<Object> getDefaultNullValueSerializer() {
        return this._nullValueSerializer;
    }

    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls) {
        return this._config.getDefaultPropertyInclusion(cls);
    }

    public final p12 getFilterProvider() {
        this._config.getFilterProvider();
        return null;
    }

    public JsonGenerator getGenerator() {
        return null;
    }

    public Locale getLocale() {
        return this._config.getLocale();
    }

    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public y63<Object> getUnknownTypeSerializer(Class<?> cls) {
        if (cls == Object.class) {
            return this._unknownTypeSerializer;
        }
        return new UnknownSerializer(cls);
    }

    public y63<?> handlePrimaryContextualization(y63<?> y63, BeanProperty beanProperty) throws JsonMappingException {
        if (y63 == null || !(y63 instanceof ls0)) {
            return y63;
        }
        return ((ls0) y63).createContextual(this, beanProperty);
    }

    public y63<?> handleSecondaryContextualization(y63<?> y63, BeanProperty beanProperty) throws JsonMappingException {
        if (y63 == null || !(y63 instanceof ls0)) {
            return y63;
        }
        return ((ls0) y63).createContextual(this, beanProperty);
    }

    public final boolean hasSerializationFeatures(int i) {
        return this._config.hasSerializationFeatures(i);
    }

    public abstract Object includeFilterInstance(q00 q00, Class<?> cls) throws JsonMappingException;

    public abstract boolean includeFilterSuppressNulls(Object obj) throws JsonMappingException;

    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from((JsonParser) null, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, wf0.m29480G(javaType)}), str2), javaType, str);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public boolean isUnknownTypeSerializer(y63<?> y63) {
        if (y63 == this._unknownTypeSerializer || y63 == null) {
            return true;
        }
        if (!isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS) || y63.getClass() != UnknownSerializer.class) {
            return false;
        }
        return true;
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr));
    }

    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType);
    }

    public <T> T reportBadPropertyDefinition(n00 n00, q00 q00, String str, Object... objArr) throws JsonMappingException {
        String str2;
        String _format = _format(str, objArr);
        String str3 = xg5.MISSING_REASON;
        if (q00 != null) {
            str2 = _quotedString(q00.getName());
        } else {
            str2 = str3;
        }
        if (n00 != null) {
            str3 = wf0.m29497X(n00.mo23460r());
        }
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid definition for property %s (of type %s): %s", new Object[]{str2, str3, _format}), n00, q00);
    }

    public <T> T reportBadTypeDefinition(n00 n00, String str, Object... objArr) throws JsonMappingException {
        String str2;
        if (n00 != null) {
            str2 = wf0.m29497X(n00.mo23460r());
        } else {
            str2 = xg5.MISSING_REASON;
        }
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid type definition for type %s: %s", new Object[]{str2, _format(str, objArr)}), n00, (q00) null);
    }

    public void reportMappingProblem(String str, Object... objArr) throws JsonMappingException {
        throw mappingException(str, objArr);
    }

    public abstract y63<Object> serializerInstance(C2911nl nlVar, Object obj) throws JsonMappingException;

    public void setDefaultKeySerializer(y63<Object> y63) {
        if (y63 != null) {
            this._keySerializer = y63;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null JsonSerializer");
    }

    public void setNullKeySerializer(y63<Object> y63) {
        if (y63 != null) {
            this._nullKeySerializer = y63;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null JsonSerializer");
    }

    public void setNullValueSerializer(y63<Object> y63) {
        if (y63 != null) {
            this._nullValueSerializer = y63;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null JsonSerializer");
    }

    public final fr6 bufferForValueConversion() {
        return bufferForValueConversion((xe4) null);
    }

    public final SerializationConfig getConfig() {
        return this._config;
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    @Deprecated
    public JsonMappingException mappingException(Throwable th, String str, Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr), th);
    }

    public <T> T reportBadDefinition(JavaType javaType, String str, Throwable th) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType).withCause(th);
    }

    public void reportMappingProblem(Throwable th, String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getGenerator(), _format(str, objArr), th);
    }

    public zw5 setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public y63<Object> findKeySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        return findKeySerializer(this._config.constructType(cls), beanProperty);
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.mo13864b0(String.valueOf(date.getTime()));
        } else {
            jsonGenerator.mo13864b0(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.mo13882i0(date.getTime());
        } else {
            jsonGenerator.mo13860Z0(_dateFormat().format(date));
        }
    }

    public <T> T reportBadDefinition(Class<?> cls, String str, Throwable th) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, constructType(cls)).withCause(th);
    }

    public y63<Object> _createAndCacheUntypedSerializer(JavaType javaType) throws JsonMappingException {
        y63<Object> y63;
        try {
            y63 = _createUntypedSerializer(javaType);
        } catch (IllegalArgumentException e) {
            reportMappingProblem(e, wf0.m29528o(e), new Object[0]);
            y63 = null;
        }
        if (y63 != null) {
            this._serializerCache.mo27603b(javaType, y63, this);
        }
        return y63;
    }

    public y63<Object> findContentValueSerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> f = this._knownSerializers.mo23066f(cls);
        if (f == null && (f = this._serializerCache.mo27613l(cls)) == null && (f = this._serializerCache.mo27612k(this._config.constructType(cls))) == null && (f = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handleSecondaryContextualization(f, beanProperty);
    }

    public y63<Object> findPrimaryPropertySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> f = this._knownSerializers.mo23066f(cls);
        if (f == null && (f = this._serializerCache.mo27613l(cls)) == null && (f = this._serializerCache.mo27612k(this._config.constructType(cls))) == null && (f = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handlePrimaryContextualization(f, beanProperty);
    }

    public y63<Object> findValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        if (javaType == null) {
            reportMappingProblem("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        y63<Object> e = this._knownSerializers.mo23065e(javaType);
        if (e == null && (e = this._serializerCache.mo27612k(javaType)) == null && (e = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handleSecondaryContextualization(e, beanProperty);
    }

    public y63<Object> findTypedValueSerializer(JavaType javaType, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> c = this._knownSerializers.mo23063c(javaType);
        if (c != null) {
            return c;
        }
        y63<Object> i = this._serializerCache.mo27610i(javaType);
        if (i != null) {
            return i;
        }
        y63<Object> findValueSerializer = findValueSerializer(javaType, beanProperty);
        m17 createTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, javaType);
        if (createTypeSerializer != null) {
            findValueSerializer = new d27(createTypeSerializer.mo11783a(beanProperty), findValueSerializer);
        }
        if (z) {
            this._serializerCache.mo27605d(javaType, findValueSerializer);
        }
        return findValueSerializer;
    }

    public zw5(zw5 zw5, SerializationConfig serializationConfig, yw5 yw5) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        y63<Object> y63 = DEFAULT_NULL_KEY_SERIALIZER;
        this._nullKeySerializer = y63;
        this._serializerFactory = yw5;
        this._config = serializationConfig;
        ww5 ww5 = zw5._serializerCache;
        this._serializerCache = ww5;
        this._unknownTypeSerializer = zw5._unknownTypeSerializer;
        this._keySerializer = zw5._keySerializer;
        y63<Object> y632 = zw5._nullValueSerializer;
        this._nullValueSerializer = y632;
        this._nullKeySerializer = zw5._nullKeySerializer;
        this._stdNullValueSerializer = y632 == y63;
        this._serializationView = serializationConfig.getActiveView();
        this._attributes = serializationConfig.getAttributes();
        this._knownSerializers = ww5.mo27608g();
    }

    public y63<Object> findValueSerializer(Class<?> cls) throws JsonMappingException {
        y63<Object> f = this._knownSerializers.mo23066f(cls);
        if (f != null) {
            return f;
        }
        y63<Object> l = this._serializerCache.mo27613l(cls);
        if (l != null) {
            return l;
        }
        y63<Object> k = this._serializerCache.mo27612k(this._config.constructType(cls));
        if (k != null) {
            return k;
        }
        y63<Object> _createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(cls);
        return _createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(cls) : _createAndCacheUntypedSerializer;
    }

    public y63<Object> findValueSerializer(JavaType javaType) throws JsonMappingException {
        y63<Object> e = this._knownSerializers.mo23065e(javaType);
        if (e != null) {
            return e;
        }
        y63<Object> k = this._serializerCache.mo27612k(javaType);
        if (k != null) {
            return k;
        }
        y63<Object> _createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(javaType);
        return _createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(javaType.getRawClass()) : _createAndCacheUntypedSerializer;
    }

    public zw5(zw5 zw5) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializationView = null;
        this._serializerFactory = null;
        this._knownSerializers = null;
        this._serializerCache = new ww5();
        this._unknownTypeSerializer = zw5._unknownTypeSerializer;
        this._keySerializer = zw5._keySerializer;
        this._nullValueSerializer = zw5._nullValueSerializer;
        this._nullKeySerializer = zw5._nullKeySerializer;
        this._stdNullValueSerializer = zw5._stdNullValueSerializer;
    }
}
