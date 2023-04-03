package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.C1974a;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.impl.C2001a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class DefaultDeserializationContext extends DeserializationContext {
    private static final long serialVersionUID = 1;
    private List<C1974a> _objectIdResolvers;
    public transient LinkedHashMap<ObjectIdGenerator.IdKey, C2001a> _objectIds;

    public static final class Impl extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1;

        public Impl(C1999a aVar) {
            super(aVar, (DeserializerCache) null);
        }

        public DefaultDeserializationContext copy() {
            wf0.m29527n0(Impl.class, this, "copy");
            return new Impl(this);
        }

        public DefaultDeserializationContext createDummyInstance(DeserializationConfig deserializationConfig) {
            return new Impl(this, deserializationConfig);
        }

        public DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, iu2 iu2) {
            return new Impl(this, deserializationConfig, jsonParser, iu2);
        }

        public DefaultDeserializationContext with(C1999a aVar) {
            return new Impl(this, aVar);
        }

        public Impl(Impl impl, DeserializationConfig deserializationConfig, JsonParser jsonParser, iu2 iu2) {
            super(impl, deserializationConfig, jsonParser, iu2);
        }

        public Impl(Impl impl) {
            super(impl);
        }

        public Impl(Impl impl, C1999a aVar) {
            super((DefaultDeserializationContext) impl, aVar);
        }

        public Impl(Impl impl, DeserializationConfig deserializationConfig) {
            super((DefaultDeserializationContext) impl, deserializationConfig);
        }
    }

    public DefaultDeserializationContext(C1999a aVar, DeserializerCache deserializerCache) {
        super(aVar, deserializerCache);
    }

    public Object _unwrapAndDeserialize(JsonParser jsonParser, JavaType javaType, o43<Object> o43, Object obj) throws IOException {
        Object obj2;
        String simpleName = this._config.findRootName(javaType).getSimpleName();
        JsonToken g = jsonParser.mo13965g();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (g != jsonToken) {
            reportWrongTokenException(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", wf0.m29495V(simpleName), jsonParser.mo13965g());
        }
        JsonToken N0 = jsonParser.mo13938N0();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (N0 != jsonToken2) {
            reportWrongTokenException(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name %s), but %s", wf0.m29495V(simpleName), jsonParser.mo13965g());
        }
        String f = jsonParser.mo13964f();
        if (!simpleName.equals(f)) {
            reportPropertyInputMismatch(javaType, f, "Root name (%s) does not match expected (%s) for type %s", wf0.m29495V(f), wf0.m29495V(simpleName), wf0.m29480G(javaType));
        }
        jsonParser.mo13938N0();
        if (obj == null) {
            obj2 = o43.deserialize(jsonParser, this);
        } else {
            obj2 = o43.deserialize(jsonParser, this, obj);
        }
        JsonToken N02 = jsonParser.mo13938N0();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (N02 != jsonToken3) {
            reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", wf0.m29495V(simpleName), jsonParser.mo13965g());
        }
        return obj2;
    }

    public void checkUnresolvedObjectId() throws UnresolvedForwardReference {
        if (this._objectIds != null && isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            UnresolvedForwardReference unresolvedForwardReference = null;
            for (Map.Entry<ObjectIdGenerator.IdKey, C2001a> value : this._objectIds.entrySet()) {
                C2001a aVar = (C2001a) value.getValue();
                if (aVar.mo15612d() && !tryToResolveUnresolvedObjectId(aVar)) {
                    if (unresolvedForwardReference == null) {
                        unresolvedForwardReference = new UnresolvedForwardReference(getParser(), "Unresolved forward references for: ").withStackTrace();
                    }
                    Object obj = aVar.mo15611c().key;
                    Iterator<C2001a.C2002a> e = aVar.mo15613e();
                    while (e.hasNext()) {
                        C2001a.C2002a next = e.next();
                        unresolvedForwardReference.addUnresolvedId(obj, next.mo15618a(), next.mo15619b());
                    }
                }
            }
            if (unresolvedForwardReference != null) {
                throw unresolvedForwardReference;
            }
        }
    }

    public DefaultDeserializationContext copy() {
        throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
    }

    public abstract DefaultDeserializationContext createDummyInstance(DeserializationConfig deserializationConfig);

    public abstract DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, iu2 iu2);

    public C2001a createReadableObjectId(ObjectIdGenerator.IdKey idKey) {
        return new C2001a(idKey);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Class<o43$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: o43<java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.o43<java.lang.Object> deserializerInstance(p000.C2911nl r3, java.lang.Object r4) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            r3 = 0
            if (r4 != 0) goto L_0x0004
            return r3
        L_0x0004:
            boolean r0 = r4 instanceof p000.o43
            if (r0 == 0) goto L_0x000b
            o43 r4 = (p000.o43) r4
            goto L_0x0036
        L_0x000b:
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0062
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<o43$a> r0 = p000.o43.C2939a.class
            if (r4 == r0) goto L_0x0061
            boolean r0 = p000.wf0.m29483J(r4)
            if (r0 == 0) goto L_0x001c
            goto L_0x0061
        L_0x001c:
            java.lang.Class<o43> r3 = p000.o43.class
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L_0x0041
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r2._config
            r3.getHandlerInstantiator()
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r2._config
            boolean r3 = r3.canOverrideAccessModifiers()
            java.lang.Object r3 = p000.wf0.m29522l(r4, r3)
            r4 = r3
            o43 r4 = (p000.o43) r4
        L_0x0036:
            boolean r3 = r4 instanceof p000.xe5
            if (r3 == 0) goto L_0x0040
            r3 = r4
            xe5 r3 = (p000.xe5) r3
            r3.resolve(r2)
        L_0x0040:
            return r4
        L_0x0041:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AnnotationIntrospector returned Class "
            r0.append(r1)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected Class<JsonDeserializer>"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x0061:
            return r3
        L_0x0062:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AnnotationIntrospector returned deserializer definition of type "
            r0.append(r1)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected type JsonDeserializer or Class<JsonDeserializer> instead"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.deserializerInstance(nl, java.lang.Object):o43");
    }

    public C2001a findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, C1974a aVar) {
        C1974a aVar2 = null;
        if (obj == null) {
            return null;
        }
        ObjectIdGenerator.IdKey key = objectIdGenerator.key(obj);
        LinkedHashMap<ObjectIdGenerator.IdKey, C2001a> linkedHashMap = this._objectIds;
        if (linkedHashMap == null) {
            this._objectIds = new LinkedHashMap<>();
        } else {
            C2001a aVar3 = linkedHashMap.get(key);
            if (aVar3 != null) {
                return aVar3;
            }
        }
        List<C1974a> list = this._objectIdResolvers;
        if (list != null) {
            Iterator<C1974a> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1974a next = it.next();
                if (next.mo13688b(aVar)) {
                    aVar2 = next;
                    break;
                }
            }
        } else {
            this._objectIdResolvers = new ArrayList(8);
        }
        if (aVar2 == null) {
            aVar2 = aVar.mo13690d(this);
            this._objectIdResolvers.add(aVar2);
        }
        C2001a createReadableObjectId = createReadableObjectId(key);
        createReadableObjectId.mo15615g(aVar2);
        this._objectIds.put(key, createReadableObjectId);
        return createReadableObjectId;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Class<ha3$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: ha3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.ha3 keyDeserializerInstance(p000.C2911nl r3, java.lang.Object r4) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            r3 = 0
            if (r4 != 0) goto L_0x0004
            return r3
        L_0x0004:
            boolean r0 = r4 instanceof p000.ha3
            if (r0 == 0) goto L_0x000b
            ha3 r4 = (p000.ha3) r4
            goto L_0x0036
        L_0x000b:
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0062
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<ha3$a> r0 = p000.ha3.C2459a.class
            if (r4 == r0) goto L_0x0061
            boolean r0 = p000.wf0.m29483J(r4)
            if (r0 == 0) goto L_0x001c
            goto L_0x0061
        L_0x001c:
            java.lang.Class<ha3> r3 = p000.ha3.class
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L_0x0041
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r2._config
            r3.getHandlerInstantiator()
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r2._config
            boolean r3 = r3.canOverrideAccessModifiers()
            java.lang.Object r3 = p000.wf0.m29522l(r4, r3)
            r4 = r3
            ha3 r4 = (p000.ha3) r4
        L_0x0036:
            boolean r3 = r4 instanceof p000.xe5
            if (r3 == 0) goto L_0x0040
            r3 = r4
            xe5 r3 = (p000.xe5) r3
            r3.resolve(r2)
        L_0x0040:
            return r4
        L_0x0041:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AnnotationIntrospector returned Class "
            r0.append(r1)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected Class<KeyDeserializer>"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x0061:
            return r3
        L_0x0062:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AnnotationIntrospector returned key deserializer definition of type "
            r0.append(r1)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.keyDeserializerInstance(nl, java.lang.Object):ha3");
    }

    public Object readRootValue(JsonParser jsonParser, JavaType javaType, o43<Object> o43, Object obj) throws IOException {
        if (this._config.useRootWrapping()) {
            return _unwrapAndDeserialize(jsonParser, javaType, o43, obj);
        }
        if (obj == null) {
            return o43.deserialize(jsonParser, this);
        }
        return o43.deserialize(jsonParser, this, obj);
    }

    public boolean tryToResolveUnresolvedObjectId(C2001a aVar) {
        return aVar.mo15616h(this);
    }

    public abstract DefaultDeserializationContext with(C1999a aVar);

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, iu2 iu2) {
        super(defaultDeserializationContext, deserializationConfig, jsonParser, iu2);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig) {
        super((DeserializationContext) defaultDeserializationContext, deserializationConfig);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, C1999a aVar) {
        super((DeserializationContext) defaultDeserializationContext, aVar);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext) {
        super((DeserializationContext) defaultDeserializationContext);
    }
}
