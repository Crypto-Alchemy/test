package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public abstract class DefaultSerializerProvider extends zw5 implements Serializable {
    private static final long serialVersionUID = 1;
    public transient JsonGenerator _generator;
    public transient ArrayList<ObjectIdGenerator<?>> _objectIdGenerators;
    public transient Map<Object, un7> _seenObjectIds;

    public static final class Impl extends DefaultSerializerProvider {
        private static final long serialVersionUID = 1;

        public Impl() {
        }

        public DefaultSerializerProvider copy() {
            if (Impl.class != Impl.class) {
                return DefaultSerializerProvider.super.copy();
            }
            return new Impl(this);
        }

        public Impl(Impl impl) {
            super(impl);
        }

        public Impl createInstance(SerializationConfig serializationConfig, yw5 yw5) {
            return new Impl(this, serializationConfig, yw5);
        }

        public Impl(zw5 zw5, SerializationConfig serializationConfig, yw5 yw5) {
            super(zw5, serializationConfig, yw5);
        }
    }

    public DefaultSerializerProvider() {
    }

    public Map<Object, un7> _createObjectIdMap() {
        if (isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID)) {
            return new HashMap();
        }
        return new IdentityHashMap();
    }

    public void _serializeNull(JsonGenerator jsonGenerator) throws IOException {
        try {
            getDefaultNullValueSerializer().serialize(null, jsonGenerator, this);
        } catch (Exception e) {
            throw mo16570d(jsonGenerator, e);
        }
    }

    public void acceptJsonFormatVisitor(JavaType javaType, t43 t43) throws JsonMappingException {
        if (javaType != null) {
            t43.mo25638h(this);
            findValueSerializer(javaType, (BeanProperty) null).acceptJsonFormatVisitor(t43, javaType);
            return;
        }
        throw new IllegalArgumentException("A class must be provided");
    }

    /* renamed from: b */
    public final void mo16565b(JsonGenerator jsonGenerator, Object obj, y63<Object> y63) throws IOException {
        try {
            y63.serialize(obj, jsonGenerator, this);
        } catch (Exception e) {
            throw mo16570d(jsonGenerator, e);
        }
    }

    /* renamed from: c */
    public final void mo16566c(JsonGenerator jsonGenerator, Object obj, y63<Object> y63, PropertyName propertyName) throws IOException {
        try {
            jsonGenerator.mo13852Q0();
            jsonGenerator.mo13858Y(propertyName.simpleAsEncoded(this._config));
            y63.serialize(obj, jsonGenerator, this);
            jsonGenerator.mo13855W();
        } catch (Exception e) {
            throw mo16570d(jsonGenerator, e);
        }
    }

    public int cachedSerializersCount() {
        return this._serializerCache.mo27609h();
    }

    public DefaultSerializerProvider copy() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationConfig, yw5 yw5);

    /* renamed from: d */
    public final IOException mo16570d(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String o = wf0.m29528o(exc);
        if (o == null) {
            o = "[no message for " + exc.getClass().getName() + "]";
        }
        return new JsonMappingException((Closeable) jsonGenerator, o, (Throwable) exc);
    }

    public un7 findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator) {
        Map<Object, un7> map = this._seenObjectIds;
        if (map == null) {
            this._seenObjectIds = _createObjectIdMap();
        } else {
            un7 un7 = map.get(obj);
            if (un7 != null) {
                return un7;
            }
        }
        ObjectIdGenerator<?> objectIdGenerator2 = null;
        ArrayList<ObjectIdGenerator<?>> arrayList = this._objectIdGenerators;
        if (arrayList != null) {
            int i = 0;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                ObjectIdGenerator<?> objectIdGenerator3 = this._objectIdGenerators.get(i);
                if (objectIdGenerator3.canUseFor(objectIdGenerator)) {
                    objectIdGenerator2 = objectIdGenerator3;
                    break;
                }
                i++;
            }
        } else {
            this._objectIdGenerators = new ArrayList<>(8);
        }
        if (objectIdGenerator2 == null) {
            objectIdGenerator2 = objectIdGenerator.newForSerialization(this);
            this._objectIdGenerators.add(objectIdGenerator2);
        }
        un7 un72 = new un7(objectIdGenerator2);
        this._seenObjectIds.put(obj, un72);
        return un72;
    }

    public void flushCachedSerializers() {
        this._serializerCache.mo27607f();
    }

    @Deprecated
    public u63 generateJsonSchema(Class<?> cls) throws JsonMappingException {
        g53 g53;
        y63<Object> findValueSerializer = findValueSerializer(cls, (BeanProperty) null);
        if (findValueSerializer instanceof ym5) {
            g53 = ((ym5) findValueSerializer).getSchema(this, (Type) null);
        } else {
            g53 = u63.m28093a();
        }
        if (g53 instanceof ObjectNode) {
            return new u63((ObjectNode) g53);
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " would not be serialized as a JSON object and therefore has no schema");
    }

    public JsonGenerator getGenerator() {
        return this._generator;
    }

    public boolean hasSerializerFor(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        if (cls == Object.class && !this._config.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            return true;
        }
        try {
            if (_findExplicitUntypedSerializer(cls) != null) {
                return true;
            }
            return false;
        } catch (JsonMappingException e) {
            if (atomicReference != null) {
                atomicReference.set(e);
            }
            return false;
        } catch (RuntimeException e2) {
            if (atomicReference != null) {
                atomicReference.set(e2);
                return false;
            }
            throw e2;
        }
    }

    public Object includeFilterInstance(q00 q00, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        this._config.getHandlerInstantiator();
        return wf0.m29522l(cls, this._config.canOverrideAccessModifiers());
    }

    public boolean includeFilterSuppressNulls(Object obj) throws JsonMappingException {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals((Object) null);
        } catch (Throwable th) {
            reportBadDefinition(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", new Object[]{obj.getClass().getName(), th.getClass().getName(), wf0.m29528o(th)}), th);
            return false;
        }
    }

    public void serializePolymorphic(JsonGenerator jsonGenerator, Object obj, JavaType javaType, y63<Object> y63, m17 m17) throws IOException {
        boolean z;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (y63 == null) {
            if (javaType == null || !javaType.isContainerType()) {
                y63 = findValueSerializer(obj.getClass(), (BeanProperty) null);
            } else {
                y63 = findValueSerializer(javaType, (BeanProperty) null);
            }
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            z = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (z) {
                jsonGenerator.mo13852Q0();
                jsonGenerator.mo13858Y(this._config.findRootName(obj.getClass()).simpleAsEncoded(this._config));
            }
        } else if (fullRootName.isEmpty()) {
            z = false;
        } else {
            jsonGenerator.mo13852Q0();
            jsonGenerator.mo13864b0(fullRootName.getSimpleName());
            z = true;
        }
        try {
            y63.serializeWithType(obj, jsonGenerator, this, m17);
            if (z) {
                jsonGenerator.mo13855W();
            }
        } catch (Exception e) {
            throw mo16570d(jsonGenerator, e);
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        Class<?> cls = obj.getClass();
        y63<Object> findTypedValueSerializer = findTypedValueSerializer(cls, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                mo16566c(jsonGenerator, obj, findTypedValueSerializer, this._config.findRootName(cls));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            mo16566c(jsonGenerator, obj, findTypedValueSerializer, fullRootName);
            return;
        }
        mo16565b(jsonGenerator, obj, findTypedValueSerializer);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Class<y63$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: y63} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<java.lang.Object> serializerInstance(p000.C2911nl r5, java.lang.Object r6) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof p000.y63
            if (r1 == 0) goto L_0x000b
            y63 r6 = (p000.y63) r6
            goto L_0x007c
        L_0x000b:
            boolean r1 = r6 instanceof java.lang.Class
            if (r1 != 0) goto L_0x0034
            com.fasterxml.jackson.databind.JavaType r1 = r5.getType()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AnnotationIntrospector returned serializer definition of type "
            r2.append(r3)
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = "; expected type JsonSerializer or Class<JsonSerializer> instead"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4.reportBadDefinition(r1, r2)
        L_0x0034:
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.Class<y63$a> r1 = p000.y63.C3656a.class
            if (r6 == r1) goto L_0x0081
            boolean r1 = p000.wf0.m29483J(r6)
            if (r1 == 0) goto L_0x0041
            goto L_0x0081
        L_0x0041:
            java.lang.Class<y63> r0 = p000.y63.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 != 0) goto L_0x006a
            com.fasterxml.jackson.databind.JavaType r5 = r5.getType()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AnnotationIntrospector returned Class "
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            java.lang.String r1 = "; expected Class<JsonSerializer>"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.reportBadDefinition(r5, r0)
        L_0x006a:
            com.fasterxml.jackson.databind.SerializationConfig r5 = r4._config
            r5.getHandlerInstantiator()
            com.fasterxml.jackson.databind.SerializationConfig r5 = r4._config
            boolean r5 = r5.canOverrideAccessModifiers()
            java.lang.Object r5 = p000.wf0.m29522l(r6, r5)
            r6 = r5
            y63 r6 = (p000.y63) r6
        L_0x007c:
            y63 r5 = r4._handleResolvable(r6)
            return r5
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializerInstance(nl, java.lang.Object):y63");
    }

    public DefaultSerializerProvider(zw5 zw5, SerializationConfig serializationConfig, yw5 yw5) {
        super(zw5, serializationConfig, yw5);
    }

    public DefaultSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        super(defaultSerializerProvider);
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (!javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        y63<Object> findTypedValueSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                mo16566c(jsonGenerator, obj, findTypedValueSerializer, this._config.findRootName(javaType));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            mo16566c(jsonGenerator, obj, findTypedValueSerializer, fullRootName);
            return;
        }
        mo16565b(jsonGenerator, obj, findTypedValueSerializer);
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType, y63<Object> y63) throws IOException {
        PropertyName propertyName;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (y63 == null) {
            y63 = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                if (javaType == null) {
                    propertyName = this._config.findRootName(obj.getClass());
                } else {
                    propertyName = this._config.findRootName(javaType);
                }
                mo16566c(jsonGenerator, obj, y63, propertyName);
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            mo16566c(jsonGenerator, obj, y63, fullRootName);
            return;
        }
        mo16565b(jsonGenerator, obj, y63);
    }
}
