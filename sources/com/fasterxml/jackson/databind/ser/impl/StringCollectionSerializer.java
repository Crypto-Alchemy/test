package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.io.IOException;
import java.util.Collection;
import org.web3j.abi.datatypes.Utf8String;

@zz2
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>> {
    public static final StringCollectionSerializer instance = new StringCollectionSerializer();

    public StringCollectionSerializer() {
        super(Collection.class);
    }

    public y63<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new StringCollectionSerializer(this, bool);
    }

    public void acceptContentVisitor(e43 e43) throws JsonMappingException {
        e43.mo19119d(JsonFormatTypes.STRING);
    }

    public g53 contentSchema() {
        return createSchemaNode(Utf8String.TYPE_NAME, true);
    }

    public final void serializeContents(Collection<String> collection, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        int i = 0;
        try {
            for (String next : collection) {
                if (next == null) {
                    zw5.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.mo13860Z0(next);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(zw5, (Throwable) e, (Object) collection, 0);
        }
    }

    public StringCollectionSerializer(StringCollectionSerializer stringCollectionSerializer, Boolean bool) {
        super(stringCollectionSerializer, bool);
    }

    public void serialize(Collection<String> collection, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        int size = collection.size();
        if (size != 1 || ((this._unwrapSingle != null || !zw5.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.mo13850P0(collection, size);
            serializeContents(collection, jsonGenerator, zw5);
            jsonGenerator.mo13853S();
            return;
        }
        serializeContents(collection, jsonGenerator, zw5);
    }

    public void serializeWithType(Collection<String> collection, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(collection, JsonToken.START_ARRAY));
        jsonGenerator.mo13895s(collection);
        serializeContents(collection, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }
}
