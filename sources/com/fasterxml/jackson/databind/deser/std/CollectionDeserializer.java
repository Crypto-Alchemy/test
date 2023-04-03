package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.C2001a;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@zz2
public class CollectionDeserializer extends ContainerDeserializerBase<Collection<Object>> implements js0 {
    private static final long serialVersionUID = -1;
    public final o43<Object> _delegateDeserializer;
    public final o43<Object> _valueDeserializer;
    public final ValueInstantiator _valueInstantiator;
    public final j07 _valueTypeDeserializer;

    /* renamed from: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer$a */
    public static final class C2004a extends C2001a.C2002a {

        /* renamed from: c */
        public final C2005b f9954c;

        /* renamed from: d */
        public final List<Object> f9955d = new ArrayList();

        public C2004a(C2005b bVar, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            super(unresolvedForwardReference, cls);
            this.f9954c = bVar;
        }

        /* renamed from: c */
        public void mo15344c(Object obj, Object obj2) throws IOException {
            this.f9954c.mo15650c(obj, obj2);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer$b */
    public static class C2005b {

        /* renamed from: a */
        public final Class<?> f9956a;

        /* renamed from: b */
        public final Collection<Object> f9957b;

        /* renamed from: c */
        public List<C2004a> f9958c = new ArrayList();

        public C2005b(Class<?> cls, Collection<Object> collection) {
            this.f9956a = cls;
            this.f9957b = collection;
        }

        /* renamed from: a */
        public void mo15648a(Object obj) {
            if (this.f9958c.isEmpty()) {
                this.f9957b.add(obj);
                return;
            }
            List<C2004a> list = this.f9958c;
            list.get(list.size() - 1).f9955d.add(obj);
        }

        /* renamed from: b */
        public C2001a.C2002a mo15649b(UnresolvedForwardReference unresolvedForwardReference) {
            C2004a aVar = new C2004a(this, unresolvedForwardReference, this.f9956a);
            this.f9958c.add(aVar);
            return aVar;
        }

        /* renamed from: c */
        public void mo15650c(Object obj, Object obj2) throws IOException {
            Iterator<C2004a> it = this.f9958c.iterator();
            Collection collection = this.f9957b;
            while (it.hasNext()) {
                C2004a next = it.next();
                if (next.mo15620d(obj)) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(next.f9955d);
                    return;
                }
                collection = next.f9955d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public CollectionDeserializer(JavaType javaType, o43<Object> o43, j07 j07, ValueInstantiator valueInstantiator) {
        this(javaType, o43, j07, valueInstantiator, (o43<Object>) null, (bc4) null, (Boolean) null);
    }

    public Collection<Object> _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        boolean z;
        Object obj;
        jsonParser.mo13951Y0(collection);
        o43<Object> o43 = this._valueDeserializer;
        if (o43.getObjectIdReader() != null) {
            return _deserializeWithObjectId(jsonParser, deserializationContext, collection);
        }
        j07 j07 = this._valueTypeDeserializer;
        while (true) {
            JsonToken N0 = jsonParser.mo13938N0();
            if (N0 == JsonToken.END_ARRAY) {
                return collection;
            }
            try {
                if (N0 == JsonToken.VALUE_NULL) {
                    if (!this._skipNullValues) {
                        obj = this._nullProvider.getNullValue(deserializationContext);
                    }
                } else if (j07 == null) {
                    obj = o43.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = o43.deserializeWithType(jsonParser, deserializationContext, j07);
                }
                collection.add(obj);
            } catch (Exception e) {
                if (deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    wf0.m29519j0(e);
                }
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) collection, collection.size());
            }
        }
    }

    public Collection<Object> _deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        Class<?> handledType = handledType();
        if (str.isEmpty()) {
            CoercionAction _checkCoercionFail = _checkCoercionFail(deserializationContext, deserializationContext.findCoercionAction(logicalType(), handledType, CoercionInputShape.EmptyString), handledType, str, "empty String (\"\")");
            if (_checkCoercionFail != null) {
                return (Collection) _deserializeFromEmptyString(jsonParser, deserializationContext, _checkCoercionFail, handledType, "empty String (\"\")");
            }
        } else if (StdDeserializer._isBlank(str)) {
            return (Collection) _deserializeFromEmptyString(jsonParser, deserializationContext, deserializationContext.findCoercionFromBlankString(logicalType(), handledType, CoercionAction.Fail), handledType, "blank String (all whitespace)");
        }
        return handleNonArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
    }

    public Collection<Object> _deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        boolean z;
        Object obj;
        if (!jsonParser.mo13926B0()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        jsonParser.mo13951Y0(collection);
        o43<Object> o43 = this._valueDeserializer;
        j07 j07 = this._valueTypeDeserializer;
        C2005b bVar = new C2005b(this._containerType.getContentType().getRawClass(), collection);
        while (true) {
            JsonToken N0 = jsonParser.mo13938N0();
            if (N0 == JsonToken.END_ARRAY) {
                return collection;
            }
            try {
                if (N0 == JsonToken.VALUE_NULL) {
                    if (!this._skipNullValues) {
                        obj = this._nullProvider.getNullValue(deserializationContext);
                    }
                } else if (j07 == null) {
                    obj = o43.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = o43.deserializeWithType(jsonParser, deserializationContext, j07);
                }
                bVar.mo15648a(obj);
            } catch (UnresolvedForwardReference e) {
                e.getRoid().mo15609a(bVar.mo15649b(e));
            } catch (Exception e2) {
                if (deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    wf0.m29519j0(e2);
                }
                throw JsonMappingException.wrapWithPath((Throwable) e2, (Object) collection, collection.size());
            }
        }
    }

    public Collection<Object> createDefaultInstance(DeserializationContext deserializationContext) throws IOException {
        return (Collection) this._valueInstantiator.createUsingDefault(deserializationContext);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return j07.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public o43<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public final Collection<Object> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        boolean z;
        Object obj;
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        o43<Object> o43 = this._valueDeserializer;
        j07 j07 = this._valueTypeDeserializer;
        try {
            if (jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
                if (this._skipNullValues) {
                    return collection;
                }
                obj = this._nullProvider.getNullValue(deserializationContext);
            } else if (j07 == null) {
                obj = o43.deserialize(jsonParser, deserializationContext);
            } else {
                obj = o43.deserializeWithType(jsonParser, deserializationContext, j07);
            }
            collection.add(obj);
            return collection;
        } catch (Exception e) {
            if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                wf0.m29519j0(e);
            }
            throw JsonMappingException.wrapWithPath((Throwable) e, (Object) Object.class, collection.size());
        }
    }

    public boolean isCachable() {
        if (this._valueDeserializer == null && this._valueTypeDeserializer == null && this._delegateDeserializer == null) {
            return true;
        }
        return false;
    }

    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    public CollectionDeserializer withResolved(o43<?> o43, o43<?> o432, j07 j07, bc4 bc4, Boolean bool) {
        return new CollectionDeserializer(this._containerType, o432, j07, this._valueInstantiator, o43, bc4, bool);
    }

    public CollectionDeserializer(JavaType javaType, o43<Object> o43, j07 j07, ValueInstantiator valueInstantiator, o43<Object> o432, bc4 bc4, Boolean bool) {
        super(javaType, bc4, bool);
        this._valueDeserializer = o43;
        this._valueTypeDeserializer = j07;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = o432;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.std.CollectionDeserializer createContextual(com.fasterxml.jackson.databind.DeserializationContext r8, com.fasterxml.jackson.databind.BeanProperty r9) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7._valueInstantiator
            if (r0 == 0) goto L_0x006d
            boolean r0 = r0.canCreateUsingDelegate()
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L_0x0039
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r8.getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getDelegateType(r4)
            if (r0 != 0) goto L_0x0034
            com.fasterxml.jackson.databind.JavaType r4 = r7._containerType
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r4
            com.fasterxml.jackson.databind.deser.ValueInstantiator r2 = r7._valueInstantiator
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r3[r1] = r2
            java.lang.String r1 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r8.reportBadDefinition(r4, r1)
        L_0x0034:
            o43 r0 = r7.findDeserializer(r8, r0, r9)
            goto L_0x006e
        L_0x0039:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7._valueInstantiator
            boolean r0 = r0.canCreateUsingArrayDelegate()
            if (r0 == 0) goto L_0x006d
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r8.getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getArrayDelegateType(r4)
            if (r0 != 0) goto L_0x0068
            com.fasterxml.jackson.databind.JavaType r4 = r7._containerType
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r4
            com.fasterxml.jackson.databind.deser.ValueInstantiator r2 = r7._valueInstantiator
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r3[r1] = r2
            java.lang.String r1 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r8.reportBadDefinition(r4, r1)
        L_0x0068:
            o43 r0 = r7.findDeserializer(r8, r0, r9)
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            r2 = r0
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r1 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r6 = r7.findFormatFeature(r8, r9, r0, r1)
            o43<java.lang.Object> r0 = r7._valueDeserializer
            o43 r0 = r7.findConvertingContentDeserializer(r8, r9, r0)
            com.fasterxml.jackson.databind.JavaType r1 = r7._containerType
            com.fasterxml.jackson.databind.JavaType r1 = r1.getContentType()
            if (r0 != 0) goto L_0x008a
            o43 r0 = r8.findContextualValueDeserializer(r1, r9)
            goto L_0x008e
        L_0x008a:
            o43 r0 = r8.handleSecondaryContextualization(r0, r9, r1)
        L_0x008e:
            r3 = r0
            j07 r0 = r7._valueTypeDeserializer
            if (r0 == 0) goto L_0x0097
            j07 r0 = r0.forProperty(r9)
        L_0x0097:
            r4 = r0
            bc4 r5 = r7.findContentNullProvider(r8, r9, r3)
            java.lang.Boolean r8 = r7._unwrapSingle
            boolean r8 = java.util.Objects.equals(r6, r8)
            if (r8 == 0) goto L_0x00b6
            bc4 r8 = r7._nullProvider
            if (r5 != r8) goto L_0x00b6
            o43<java.lang.Object> r8 = r7._delegateDeserializer
            if (r2 != r8) goto L_0x00b6
            o43<java.lang.Object> r8 = r7._valueDeserializer
            if (r3 != r8) goto L_0x00b6
            j07 r8 = r7._valueTypeDeserializer
            if (r4 == r8) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            return r7
        L_0x00b6:
            r1 = r7
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r8 = r1.withResolved(r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
    }

    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        o43<Object> o43 = this._delegateDeserializer;
        if (o43 != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, o43.deserialize(jsonParser, deserializationContext));
        }
        if (jsonParser.mo13926B0()) {
            return _deserializeFromArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
        }
        if (jsonParser.mo13984s0(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext, jsonParser.mo13947W());
        }
        return handleNonArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
    }

    public CollectionDeserializer(CollectionDeserializer collectionDeserializer) {
        super((ContainerDeserializerBase<?>) collectionDeserializer);
        this._valueDeserializer = collectionDeserializer._valueDeserializer;
        this._valueTypeDeserializer = collectionDeserializer._valueTypeDeserializer;
        this._valueInstantiator = collectionDeserializer._valueInstantiator;
        this._delegateDeserializer = collectionDeserializer._delegateDeserializer;
    }

    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        if (jsonParser.mo13926B0()) {
            return _deserializeFromArray(jsonParser, deserializationContext, collection);
        }
        return handleNonArray(jsonParser, deserializationContext, collection);
    }
}
