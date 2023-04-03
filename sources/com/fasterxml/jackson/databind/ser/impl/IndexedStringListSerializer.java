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
import java.util.List;
import org.web3j.abi.datatypes.Utf8String;

@zz2
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();
    private static final long serialVersionUID = 1;

    public IndexedStringListSerializer() {
        super(List.class);
    }

    public y63<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new IndexedStringListSerializer(this, bool);
    }

    /* renamed from: a */
    public final void mo16601a(List<String> list, JsonGenerator jsonGenerator, zw5 zw5, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            try {
                String str = list.get(i2);
                if (str == null) {
                    zw5.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.mo13860Z0(str);
                }
                i2++;
            } catch (Exception e) {
                wrapAndThrow(zw5, (Throwable) e, (Object) list, i2);
                return;
            }
        }
    }

    public void acceptContentVisitor(e43 e43) throws JsonMappingException {
        e43.mo19119d(JsonFormatTypes.STRING);
    }

    public g53 contentSchema() {
        return createSchemaNode(Utf8String.TYPE_NAME, true);
    }

    public IndexedStringListSerializer(IndexedStringListSerializer indexedStringListSerializer, Boolean bool) {
        super(indexedStringListSerializer, bool);
    }

    public void serialize(List<String> list, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        int size = list.size();
        if (size != 1 || ((this._unwrapSingle != null || !zw5.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.mo13850P0(list, size);
            mo16601a(list, jsonGenerator, zw5, size);
            jsonGenerator.mo13853S();
            return;
        }
        mo16601a(list, jsonGenerator, zw5, 1);
    }

    public void serializeWithType(List<String> list, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(list, JsonToken.START_ARRAY));
        jsonGenerator.mo13895s(list);
        mo16601a(list, jsonGenerator, zw5, list.size());
        m17.mo16713h(jsonGenerator, g);
    }
}
