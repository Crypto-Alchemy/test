package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AsDeductionTypeDeserializer extends AsPropertyTypeDeserializer {

    /* renamed from: a */
    public static final BitSet f10080a = new BitSet(0);
    private static final long serialVersionUID = 1;
    private final Map<String, Integer> fieldBitIndex;
    private final Map<BitSet, String> subtypeFingerprints;

    public AsDeductionTypeDeserializer(JavaType javaType, r07 r07, JavaType javaType2, DeserializationConfig deserializationConfig, Collection<NamedType> collection) {
        super(javaType, r07, (String) null, false, javaType2, (JsonTypeInfo.C1971As) null);
        this.fieldBitIndex = new HashMap();
        this.subtypeFingerprints = buildFingerprints(deserializationConfig, collection);
    }

    /* renamed from: a */
    public static void m14274a(List<BitSet> list, int i) {
        Iterator<BitSet> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().get(i)) {
                it.remove();
            }
        }
    }

    public Map<BitSet, String> buildFingerprints(DeserializationConfig deserializationConfig, Collection<NamedType> collection) {
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap hashMap = new HashMap();
        int i = 0;
        for (NamedType next : collection) {
            List<q00> o = deserializationConfig.introspect(deserializationConfig.getTypeFactory().constructType((Type) next.getType())).mo23457o();
            BitSet bitSet = new BitSet(o.size() + i);
            for (q00 name : o) {
                String name2 = name.getName();
                if (isEnabled) {
                    name2 = name2.toLowerCase();
                }
                Integer num = this.fieldBitIndex.get(name2);
                if (num == null) {
                    num = Integer.valueOf(i);
                    this.fieldBitIndex.put(name2, Integer.valueOf(i));
                    i++;
                }
                bitSet.set(num.intValue());
            }
            String str = (String) hashMap.put(bitSet, next.getType().getName());
            if (str != null) {
                throw new IllegalStateException(String.format("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", new Object[]{str, next.getType().getName()}));
            }
        }
        return hashMap;
    }

    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        JsonToken g = jsonParser.mo13965g();
        if (g == JsonToken.START_OBJECT) {
            g = jsonParser.mo13938N0();
        } else if (g != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, (fr6) null, "Unexpected input");
        }
        if (g == JsonToken.END_OBJECT && (str = this.subtypeFingerprints.get(f10080a)) != null) {
            return _deserializeTypedForId(jsonParser, deserializationContext, (fr6) null, str);
        }
        LinkedList linkedList = new LinkedList(this.subtypeFingerprints.keySet());
        fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        boolean isEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (g == JsonToken.FIELD_NAME) {
            String f = jsonParser.mo13964f();
            if (isEnabled) {
                f = f.toLowerCase();
            }
            bufferForInputBuffering.mo20074B1(jsonParser);
            Integer num = this.fieldBitIndex.get(f);
            if (num != null) {
                m14274a(linkedList, num.intValue());
                if (linkedList.size() == 1) {
                    return _deserializeTypedForId(jsonParser, deserializationContext, bufferForInputBuffering, this.subtypeFingerprints.get(linkedList.get(0)));
                }
            }
            g = jsonParser.mo13938N0();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, bufferForInputBuffering, String.format("Cannot deduce unique subtype of %s (%d candidates match)", new Object[]{wf0.m29480G(this._baseType), Integer.valueOf(linkedList.size())}));
    }

    public j07 forProperty(BeanProperty beanProperty) {
        if (beanProperty == this._property) {
            return this;
        }
        return new AsDeductionTypeDeserializer(this, beanProperty);
    }

    public AsDeductionTypeDeserializer(AsDeductionTypeDeserializer asDeductionTypeDeserializer, BeanProperty beanProperty) {
        super(asDeductionTypeDeserializer, beanProperty);
        this.fieldBitIndex = asDeductionTypeDeserializer.fieldBitIndex;
        this.subtypeFingerprints = asDeductionTypeDeserializer.subtypeFingerprints;
    }
}
