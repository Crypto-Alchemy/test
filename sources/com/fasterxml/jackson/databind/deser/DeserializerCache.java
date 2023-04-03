package com.fasterxml.jackson.databind.deser;

import androidx.media3.common.PlaybackException;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.util.HashMap;
import p000.o43;

public final class DeserializerCache implements Serializable {
    private static final long serialVersionUID = 1;
    public final LRUMap<JavaType, o43<Object>> _cachedDeserializers;
    public final HashMap<JavaType, o43<Object>> _incompleteDeserializers;

    public DeserializerCache() {
        this(PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
    }

    public o43<Object> _createAndCache2(DeserializationContext deserializationContext, C1999a aVar, JavaType javaType) throws JsonMappingException {
        o43<Object> o43;
        boolean z;
        try {
            o43 = _createDeserializer(deserializationContext, aVar, javaType);
        } catch (IllegalArgumentException e) {
            deserializationContext.reportBadDefinition(javaType, wf0.m29528o(e));
            o43 = null;
        }
        if (o43 == null) {
            return null;
        }
        if (mo15463a(javaType) || !o43.isCachable()) {
            z = false;
        } else {
            z = true;
        }
        if (o43 instanceof xe5) {
            this._incompleteDeserializers.put(javaType, o43);
            ((xe5) o43).resolve(deserializationContext);
            this._incompleteDeserializers.remove(javaType);
        }
        if (z) {
            this._cachedDeserializers.put(javaType, o43);
        }
        return o43;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.o43<java.lang.Object> _createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext r4, com.fasterxml.jackson.databind.deser.C1999a r5, com.fasterxml.jackson.databind.JavaType r6) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r3 = this;
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, o43<java.lang.Object>> r0 = r3._incompleteDeserializers
            monitor-enter(r0)
            o43 r1 = r3._findCachedDeserializer(r6)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r1
        L_0x000b:
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, o43<java.lang.Object>> r1 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            int r1 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r1 <= 0) goto L_0x001f
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, o43<java.lang.Object>> r2 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0045 }
            o43 r2 = (p000.o43) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r2
        L_0x001f:
            o43 r4 = r3._createAndCache2(r4, r5, r6)     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, o43<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            int r5 = r5.size()     // Catch:{ all -> 0x0045 }
            if (r5 <= 0) goto L_0x0032
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, o43<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            r5.clear()     // Catch:{ all -> 0x0045 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r4
        L_0x0034:
            r4 = move-exception
            if (r1 != 0) goto L_0x0044
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, o43<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            int r5 = r5.size()     // Catch:{ all -> 0x0045 }
            if (r5 <= 0) goto L_0x0044
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, o43<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            r5.clear()     // Catch:{ all -> 0x0045 }
        L_0x0044:
            throw r4     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.a, com.fasterxml.jackson.databind.JavaType):o43");
    }

    public o43<Object> _createDeserializer(DeserializationContext deserializationContext, C1999a aVar, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isAbstract() || javaType.isMapLikeType() || javaType.isCollectionLikeType()) {
            javaType = aVar.mapAbstractType(config, javaType);
        }
        n00 introspect = config.introspect(javaType);
        o43<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.mo23462t());
        if (findDeserializerFromAnnotation != null) {
            return findDeserializerFromAnnotation;
        }
        JavaType c = mo15465c(deserializationContext, introspect.mo23462t(), javaType);
        if (c != javaType) {
            introspect = config.introspect(c);
            javaType = c;
        }
        Class<?> m = introspect.mo23455m();
        if (m != null) {
            return aVar.createBuilderBasedDeserializer(deserializationContext, javaType, introspect, m);
        }
        ot0<Object, Object> f = introspect.mo23448f();
        if (f == null) {
            return _createDeserializer2(deserializationContext, aVar, javaType, introspect);
        }
        JavaType b = f.mo23477b(deserializationContext.getTypeFactory());
        if (!b.hasRawClass(javaType.getRawClass())) {
            introspect = config.introspect(b);
        }
        return new StdDelegatingDeserializer(f, b, _createDeserializer2(deserializationContext, aVar, b, introspect));
    }

    public o43<?> _createDeserializer2(DeserializationContext deserializationContext, C1999a aVar, JavaType javaType, n00 n00) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isEnumType()) {
            return aVar.createEnumDeserializer(deserializationContext, javaType, n00);
        }
        if (javaType.isContainerType()) {
            if (javaType.isArrayType()) {
                return aVar.createArrayDeserializer(deserializationContext, (ArrayType) javaType, n00);
            }
            if (javaType.isMapLikeType() && n00.mo23449g((JsonFormat.Value) null).getShape() != JsonFormat.Shape.OBJECT) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                if (mapLikeType instanceof MapType) {
                    return aVar.createMapDeserializer(deserializationContext, (MapType) mapLikeType, n00);
                }
                return aVar.createMapLikeDeserializer(deserializationContext, mapLikeType, n00);
            } else if (javaType.isCollectionLikeType() && n00.mo23449g((JsonFormat.Value) null).getShape() != JsonFormat.Shape.OBJECT) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                if (collectionLikeType instanceof CollectionType) {
                    return aVar.createCollectionDeserializer(deserializationContext, (CollectionType) collectionLikeType, n00);
                }
                return aVar.createCollectionLikeDeserializer(deserializationContext, collectionLikeType, n00);
            }
        }
        if (javaType.isReferenceType()) {
            return aVar.createReferenceDeserializer(deserializationContext, (ReferenceType) javaType, n00);
        }
        if (g53.class.isAssignableFrom(javaType.getRawClass())) {
            return aVar.createTreeDeserializer(config, javaType, n00);
        }
        return aVar.createBeanDeserializer(deserializationContext, javaType, n00);
    }

    public o43<Object> _findCachedDeserializer(JavaType javaType) {
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        } else if (mo15463a(javaType)) {
            return null;
        } else {
            return this._cachedDeserializers.get(javaType);
        }
    }

    public ha3 _handleUnknownKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        return (ha3) deserializationContext.reportBadDefinition(javaType, "Cannot find a (Map) Key deserializer for type " + javaType);
    }

    public o43<Object> _handleUnknownValueDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        if (!wf0.m29484K(javaType.getRawClass())) {
            return (o43) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for abstract type " + javaType);
        }
        return (o43) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for type " + javaType);
    }

    /* renamed from: a */
    public final boolean mo15463a(JavaType javaType) {
        if (!javaType.isContainerType()) {
            return false;
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null && (contentType.getValueHandler() != null || contentType.getTypeHandler() != null)) {
            return true;
        }
        if (!javaType.isMapLikeType() || javaType.getKeyType().getValueHandler() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final Class<?> mo15464b(Object obj, String str, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Class) {
            Class<?> cls2 = (Class) obj;
            if (cls2 == cls || wf0.m29483J(cls2)) {
                return null;
            }
            return cls2;
        }
        throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
    }

    /* renamed from: c */
    public final JavaType mo15465c(DeserializationContext deserializationContext, C2911nl nlVar, JavaType javaType) throws JsonMappingException {
        Object findContentDeserializer;
        JavaType keyType;
        Object findKeyDeserializer;
        ha3 keyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (!(!javaType.isMapLikeType() || (keyType = javaType.getKeyType()) == null || keyType.getValueHandler() != null || (findKeyDeserializer = annotationIntrospector.findKeyDeserializer(nlVar)) == null || (keyDeserializerInstance = deserializationContext.keyDeserializerInstance(nlVar, findKeyDeserializer)) == null)) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
        }
        JavaType contentType = javaType.getContentType();
        if (!(contentType == null || contentType.getValueHandler() != null || (findContentDeserializer = annotationIntrospector.findContentDeserializer(nlVar)) == null)) {
            o43<Object> o43 = null;
            if (findContentDeserializer instanceof o43) {
                o43 = (o43) findContentDeserializer;
            } else {
                Class<?> b = mo15464b(findContentDeserializer, "findContentDeserializer", o43.C2939a.class);
                if (b != null) {
                    o43 = deserializationContext.deserializerInstance(nlVar, b);
                }
            }
            if (o43 != null) {
                javaType = javaType.withContentValueHandler(o43);
            }
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), nlVar, javaType);
    }

    public int cachedDeserializersCount() {
        return this._cachedDeserializers.size();
    }

    public ot0<Object, Object> findConverter(DeserializationContext deserializationContext, C2911nl nlVar) throws JsonMappingException {
        Object findDeserializationConverter = deserializationContext.getAnnotationIntrospector().findDeserializationConverter(nlVar);
        if (findDeserializationConverter == null) {
            return null;
        }
        return deserializationContext.converterInstance(nlVar, findDeserializationConverter);
    }

    public o43<Object> findConvertingDeserializer(DeserializationContext deserializationContext, C2911nl nlVar, o43<Object> o43) throws JsonMappingException {
        ot0<Object, Object> findConverter = findConverter(deserializationContext, nlVar);
        if (findConverter == null) {
            return o43;
        }
        return new StdDelegatingDeserializer(findConverter, findConverter.mo23477b(deserializationContext.getTypeFactory()), o43);
    }

    public o43<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, C2911nl nlVar) throws JsonMappingException {
        Object findDeserializer = deserializationContext.getAnnotationIntrospector().findDeserializer(nlVar);
        if (findDeserializer == null) {
            return null;
        }
        return findConvertingDeserializer(deserializationContext, nlVar, deserializationContext.deserializerInstance(nlVar, findDeserializer));
    }

    public ha3 findKeyDeserializer(DeserializationContext deserializationContext, C1999a aVar, JavaType javaType) throws JsonMappingException {
        ha3 createKeyDeserializer = aVar.createKeyDeserializer(deserializationContext, javaType);
        if (createKeyDeserializer == null) {
            return _handleUnknownKeyDeserializer(deserializationContext, javaType);
        }
        if (createKeyDeserializer instanceof xe5) {
            ((xe5) createKeyDeserializer).resolve(deserializationContext);
        }
        return createKeyDeserializer;
    }

    public o43<Object> findValueDeserializer(DeserializationContext deserializationContext, C1999a aVar, JavaType javaType) throws JsonMappingException {
        o43<Object> _findCachedDeserializer = _findCachedDeserializer(javaType);
        if (_findCachedDeserializer != null) {
            return _findCachedDeserializer;
        }
        o43<Object> _createAndCacheValueDeserializer = _createAndCacheValueDeserializer(deserializationContext, aVar, javaType);
        if (_createAndCacheValueDeserializer == null) {
            return _handleUnknownValueDeserializer(deserializationContext, javaType);
        }
        return _createAndCacheValueDeserializer;
    }

    public void flushCachedDeserializers() {
        this._cachedDeserializers.clear();
    }

    public boolean hasValueDeserializerFor(DeserializationContext deserializationContext, C1999a aVar, JavaType javaType) throws JsonMappingException {
        o43<Object> _findCachedDeserializer = _findCachedDeserializer(javaType);
        if (_findCachedDeserializer == null) {
            _findCachedDeserializer = _createAndCacheValueDeserializer(deserializationContext, aVar, javaType);
        }
        if (_findCachedDeserializer != null) {
            return true;
        }
        return false;
    }

    public Object writeReplace() {
        this._incompleteDeserializers.clear();
        return this;
    }

    public DeserializerCache(int i) {
        this._incompleteDeserializers = new HashMap<>(8);
        this._cachedDeserializers = new LRUMap<>(Math.min(64, i >> 2), i);
    }
}
