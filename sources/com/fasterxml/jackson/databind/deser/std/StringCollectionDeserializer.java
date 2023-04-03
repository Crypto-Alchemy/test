package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@zz2
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements js0 {
    private static final long serialVersionUID = 1;
    public final o43<Object> _delegateDeserializer;
    public final o43<String> _valueDeserializer;
    public final ValueInstantiator _valueInstantiator;

    public StringCollectionDeserializer(JavaType javaType, o43<?> o43, ValueInstantiator valueInstantiator) {
        this(javaType, valueInstantiator, (o43<?>) null, o43, o43, (Boolean) null);
    }

    /* renamed from: a */
    public final Collection<String> mo15838a(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection, o43<String> o43) throws IOException {
        String str;
        while (true) {
            try {
                if (jsonParser.mo13932G0() == null) {
                    JsonToken g = jsonParser.mo13965g();
                    if (g == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (g != JsonToken.VALUE_NULL) {
                        str = o43.deserialize(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        str = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                } else {
                    str = o43.deserialize(jsonParser, deserializationContext);
                }
                collection.add(str);
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) collection, collection.size());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.o43<?> createContextual(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.BeanProperty r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            r1 = 0
            if (r0 == 0) goto L_0x0031
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.getArrayDelegateCreator()
            if (r0 == 0) goto L_0x001a
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r6.getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getArrayDelegateType(r2)
            o43 r0 = r5.findDeserializer(r6, r0, r7)
            goto L_0x0032
        L_0x001a:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.getDelegateCreator()
            if (r0 == 0) goto L_0x0031
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r6.getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getDelegateType(r2)
            o43 r0 = r5.findDeserializer(r6, r0, r7)
            goto L_0x0032
        L_0x0031:
            r0 = r1
        L_0x0032:
            o43<java.lang.String> r2 = r5._valueDeserializer
            com.fasterxml.jackson.databind.JavaType r3 = r5._containerType
            com.fasterxml.jackson.databind.JavaType r3 = r3.getContentType()
            if (r2 != 0) goto L_0x0047
            o43 r2 = r5.findConvertingContentDeserializer(r6, r7, r2)
            if (r2 != 0) goto L_0x004b
            o43 r2 = r6.findContextualValueDeserializer(r3, r7)
            goto L_0x004b
        L_0x0047:
            o43 r2 = r6.handleSecondaryContextualization(r2, r7, r3)
        L_0x004b:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r4 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r3 = r5.findFormatFeature(r6, r7, r3, r4)
            bc4 r6 = r5.findContentNullProvider(r6, r7, r2)
            boolean r7 = r5.isDefaultDeserializer(r2)
            if (r7 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r6 = r5.withResolved(r0, r1, r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):o43");
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

    public final Collection<String> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        boolean z;
        String str;
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o43<String> o43 = this._valueDeserializer;
            if (jsonParser.mo13965g() == JsonToken.VALUE_NULL) {
                if (this._skipNullValues) {
                    return collection;
                }
                str = (String) this._nullProvider.getNullValue(deserializationContext);
            } else if (o43 == null) {
                try {
                    str = _parseString(jsonParser, deserializationContext);
                } catch (Exception e) {
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) collection, collection.size());
                }
            } else {
                str = o43.deserialize(jsonParser, deserializationContext);
            }
            collection.add(str);
            return collection;
        } else if (jsonParser.mo13984s0(JsonToken.VALUE_STRING)) {
            return (Collection) _deserializeFromString(jsonParser, deserializationContext);
        } else {
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
    }

    public boolean isCachable() {
        if (this._valueDeserializer == null && this._delegateDeserializer == null) {
            return true;
        }
        return false;
    }

    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    public StringCollectionDeserializer withResolved(o43<?> o43, o43<?> o432, bc4 bc4, Boolean bool) {
        if (Objects.equals(this._unwrapSingle, bool) && this._nullProvider == bc4 && this._valueDeserializer == o432 && this._delegateDeserializer == o43) {
            return this;
        }
        return new StringCollectionDeserializer(this._containerType, this._valueInstantiator, o43, o432, bc4, bool);
    }

    public StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, o43<?> o43, o43<?> o432, bc4 bc4, Boolean bool) {
        super(javaType, bc4, bool);
        this._valueDeserializer = o432;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = o43;
    }

    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        o43<Object> o43 = this._delegateDeserializer;
        if (o43 != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, o43.deserialize(jsonParser, deserializationContext));
        }
        return deserialize(jsonParser, deserializationContext, (Collection<String>) (Collection) this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str;
        if (!jsonParser.mo13926B0()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        o43<String> o43 = this._valueDeserializer;
        if (o43 != null) {
            return mo15838a(jsonParser, deserializationContext, collection, o43);
        }
        while (true) {
            try {
                String G0 = jsonParser.mo13932G0();
                if (G0 != null) {
                    collection.add(G0);
                } else {
                    JsonToken g = jsonParser.mo13965g();
                    if (g == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (g != JsonToken.VALUE_NULL) {
                        str = _parseString(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        str = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                    collection.add(str);
                }
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) collection, collection.size());
            }
        }
    }
}
