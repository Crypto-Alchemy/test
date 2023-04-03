package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@zz2
public class UntypedObjectDeserializer extends StdDeserializer<Object> implements xe5, js0 {
    public static final Object[] NO_OBJECTS = new Object[0];
    private static final long serialVersionUID = 1;
    public o43<Object> _listDeserializer;
    public JavaType _listType;
    public o43<Object> _mapDeserializer;
    public JavaType _mapType;
    public final boolean _nonMerging;
    public o43<Object> _numberDeserializer;
    public o43<Object> _stringDeserializer;

    @zz2
    public static class Vanilla extends StdDeserializer<Object> {
        private static final long serialVersionUID = 1;
        public static final Vanilla std = new Vanilla();
        public final boolean _nonMerging;

        public Vanilla() {
            this(false);
        }

        public static Vanilla instance(boolean z) {
            if (z) {
                return new Vanilla(true);
            }
            return std;
        }

        public Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
            boolean isEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
            if (isEnabled) {
                mo15858a(map, str, obj, obj2);
            }
            while (str2 != null) {
                jsonParser.mo13938N0();
                Object deserialize = deserialize(jsonParser, deserializationContext);
                Object put = map.put(str2, deserialize);
                if (put != null && isEnabled) {
                    mo15858a(map, str2, put, deserialize);
                }
                str2 = jsonParser.mo13930E0();
            }
            return map;
        }

        /* renamed from: a */
        public final void mo15858a(Map<String, Object> map, String str, Object obj, Object obj2) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                map.put(str, obj);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            map.put(str, arrayList);
        }

        /* renamed from: b */
        public final Object mo15859b(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            switch (jsonParser.mo13967h()) {
                case 1:
                    if (jsonParser.mo13938N0() == JsonToken.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    if (jsonParser.mo13938N0() == JsonToken.END_ARRAY) {
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                            return UntypedObjectDeserializer.NO_OBJECTS;
                        }
                        return new ArrayList(2);
                    } else if (i > 1000) {
                        throw new JsonParseException(jsonParser, "JSON is too deeply nested.");
                    } else if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        return mapArrayToArray(jsonParser, deserializationContext, i);
                    } else {
                        return mapArray(jsonParser, deserializationContext, i);
                    }
                case 5:
                    break;
                case 6:
                    return jsonParser.mo13947W();
                case 7:
                    if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                        return _coerceIntegral(jsonParser, deserializationContext);
                    }
                    return jsonParser.mo13936L();
                case 8:
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.mo13988y();
                    }
                    return jsonParser.mo13936L();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.mo13924A();
                default:
                    return deserializationContext.handleUnexpectedToken((Class<?>) Object.class, jsonParser);
            }
            if (i <= 1000) {
                return mapObject(jsonParser, deserializationContext, i);
            }
            throw new JsonParseException(jsonParser, "JSON is too deeply nested.");
        }

        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return mo15859b(jsonParser, deserializationContext, 0);
        }

        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
            int h = jsonParser.mo13967h();
            if (!(h == 1 || h == 3)) {
                switch (h) {
                    case 5:
                        break;
                    case 6:
                        return jsonParser.mo13947W();
                    case 7:
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                            return jsonParser.mo13971j();
                        }
                        return jsonParser.mo13936L();
                    case 8:
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                            return jsonParser.mo13988y();
                        }
                        return jsonParser.mo13936L();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return jsonParser.mo13924A();
                    default:
                        return deserializationContext.handleUnexpectedToken((Class<?>) Object.class, jsonParser);
                }
            }
            return j07.deserializeTypedFromAny(jsonParser, deserializationContext);
        }

        public LogicalType logicalType() {
            return LogicalType.Untyped;
        }

        @Deprecated
        public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return mapArray(jsonParser, deserializationContext, 0);
        }

        @Deprecated
        public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return mapArrayToArray(jsonParser, deserializationContext, 0);
        }

        @Deprecated
        public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return mapObject(jsonParser, deserializationContext, 0);
        }

        public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
            if (this._nonMerging) {
                return Boolean.FALSE;
            }
            return null;
        }

        public Vanilla(boolean z) {
            super((Class<?>) Object.class);
            this._nonMerging = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
            if (r0 != 5) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6, java.lang.Object r7) throws java.io.IOException {
            /*
                r4 = this;
                boolean r0 = r4._nonMerging
                if (r0 == 0) goto L_0x0009
                java.lang.Object r5 = r4.deserialize(r5, r6)
                return r5
            L_0x0009:
                int r0 = r5.mo13967h()
                r1 = 1
                if (r0 == r1) goto L_0x003d
                r1 = 2
                if (r0 == r1) goto L_0x003c
                r1 = 3
                if (r0 == r1) goto L_0x001d
                r1 = 4
                if (r0 == r1) goto L_0x003c
                r1 = 5
                if (r0 == r1) goto L_0x0046
                goto L_0x006f
            L_0x001d:
                com.fasterxml.jackson.core.JsonToken r0 = r5.mo13938N0()
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
                if (r0 != r1) goto L_0x0026
                return r7
            L_0x0026:
                boolean r0 = r7 instanceof java.util.Collection
                if (r0 == 0) goto L_0x006f
                r0 = r7
                java.util.Collection r0 = (java.util.Collection) r0
            L_0x002d:
                java.lang.Object r1 = r4.deserialize(r5, r6)
                r0.add(r1)
                com.fasterxml.jackson.core.JsonToken r1 = r5.mo13938N0()
                com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
                if (r1 != r2) goto L_0x002d
            L_0x003c:
                return r7
            L_0x003d:
                com.fasterxml.jackson.core.JsonToken r0 = r5.mo13938N0()
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
                if (r0 != r1) goto L_0x0046
                return r7
            L_0x0046:
                boolean r0 = r7 instanceof java.util.Map
                if (r0 == 0) goto L_0x006f
                r0 = r7
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = r5.mo13964f()
            L_0x0051:
                r5.mo13938N0()
                java.lang.Object r2 = r0.get(r1)
                if (r2 == 0) goto L_0x005f
                java.lang.Object r3 = r4.deserialize(r5, r6, r2)
                goto L_0x0063
            L_0x005f:
                java.lang.Object r3 = r4.deserialize(r5, r6)
            L_0x0063:
                if (r3 == r2) goto L_0x0068
                r0.put(r1, r3)
            L_0x0068:
                java.lang.String r1 = r5.mo13930E0()
                if (r1 != 0) goto L_0x0051
                return r7
            L_0x006f:
                java.lang.Object r5 = r4.deserialize(r5, r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
        }

        public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            int i2 = i + 1;
            Object b = mo15859b(jsonParser, deserializationContext, i2);
            JsonToken N0 = jsonParser.mo13938N0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            int i3 = 2;
            if (N0 == jsonToken) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(b);
                return arrayList;
            }
            Object b2 = mo15859b(jsonParser, deserializationContext, i2);
            if (jsonParser.mo13938N0() == jsonToken) {
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(b);
                arrayList2.add(b2);
                return arrayList2;
            }
            we4 leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] i4 = leaseObjectBuffer.mo27498i();
            i4[0] = b;
            i4[1] = b2;
            int i5 = 2;
            while (true) {
                Object b3 = mo15859b(jsonParser, deserializationContext, i2);
                i3++;
                if (i5 >= i4.length) {
                    i4 = leaseObjectBuffer.mo27492c(i4);
                    i5 = 0;
                }
                int i6 = i5 + 1;
                i4[i5] = b3;
                if (jsonParser.mo13938N0() == JsonToken.END_ARRAY) {
                    ArrayList arrayList3 = new ArrayList(i3);
                    leaseObjectBuffer.mo27494e(i4, i6, arrayList3);
                    return arrayList3;
                }
                i5 = i6;
            }
        }

        public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            int i2 = i + 1;
            we4 leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] i3 = leaseObjectBuffer.mo27498i();
            int i4 = 0;
            while (true) {
                Object b = mo15859b(jsonParser, deserializationContext, i2);
                if (i4 >= i3.length) {
                    i3 = leaseObjectBuffer.mo27492c(i3);
                    i4 = 0;
                }
                int i5 = i4 + 1;
                i3[i4] = b;
                if (jsonParser.mo13938N0() == JsonToken.END_ARRAY) {
                    return leaseObjectBuffer.mo27495f(i3, i5);
                }
                i4 = i5;
            }
        }

        public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            int i2 = i + 1;
            String f = jsonParser.mo13964f();
            jsonParser.mo13938N0();
            Object b = mo15859b(jsonParser, deserializationContext, i2);
            String E0 = jsonParser.mo13930E0();
            if (E0 == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(f, b);
                return linkedHashMap;
            }
            jsonParser.mo13938N0();
            Object b2 = mo15859b(jsonParser, deserializationContext, i2);
            String E02 = jsonParser.mo13930E0();
            if (E02 == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
                linkedHashMap2.put(f, b);
                return linkedHashMap2.put(E0, b2) != null ? _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap2, f, b, b2, E02) : linkedHashMap2;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put(f, b);
            if (linkedHashMap3.put(E0, b2) != null) {
                return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, f, b, b2, E02);
            }
            String str = E02;
            do {
                jsonParser.mo13938N0();
                Object b3 = mo15859b(jsonParser, deserializationContext, i2);
                Object put = linkedHashMap3.put(str, b3);
                if (put != null) {
                    return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, str, put, b3, jsonParser.mo13930E0());
                }
                str = jsonParser.mo13930E0();
            } while (str != null);
            return linkedHashMap3;
        }
    }

    @Deprecated
    public UntypedObjectDeserializer() {
        this((JavaType) null, (JavaType) null);
    }

    public o43<Object> _clearIfStdImpl(o43<Object> o43) {
        if (wf0.m29488O(o43)) {
            return null;
        }
        return o43;
    }

    public o43<Object> _findCustomDeser(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        return deserializationContext.findNonContextualValueDeserializer(javaType);
    }

    public Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
        boolean isEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
        if (isEnabled) {
            mo15851a(map, str, obj, obj2);
        }
        while (str2 != null) {
            jsonParser.mo13938N0();
            Object deserialize = deserialize(jsonParser, deserializationContext);
            Object put = map.put(str2, deserialize);
            if (put != null && isEnabled) {
                mo15851a(map, str, put, deserialize);
            }
            str2 = jsonParser.mo13930E0();
        }
        return map;
    }

    /* renamed from: a */
    public final void mo15851a(Map<String, Object> map, String str, Object obj, Object obj2) {
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            map.put(str, obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        map.put(str, arrayList);
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        boolean z;
        if (beanProperty != null || !Boolean.FALSE.equals(deserializationContext.getConfig().getDefaultMergeable(Object.class))) {
            z = false;
        } else {
            z = true;
        }
        if (this._stringDeserializer == null && this._numberDeserializer == null && this._mapDeserializer == null && this._listDeserializer == null && getClass() == UntypedObjectDeserializer.class) {
            return Vanilla.instance(z);
        }
        if (z != this._nonMerging) {
            return new UntypedObjectDeserializer(this, z);
        }
        return this;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.mo13967h()) {
            case 1:
            case 2:
            case 5:
                o43<Object> o43 = this._mapDeserializer;
                if (o43 != null) {
                    return o43.deserialize(jsonParser, deserializationContext);
                }
                return mapObject(jsonParser, deserializationContext);
            case 3:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return mapArrayToArray(jsonParser, deserializationContext);
                }
                o43<Object> o432 = this._listDeserializer;
                if (o432 != null) {
                    return o432.deserialize(jsonParser, deserializationContext);
                }
                return mapArray(jsonParser, deserializationContext);
            case 6:
                o43<Object> o433 = this._stringDeserializer;
                if (o433 != null) {
                    return o433.deserialize(jsonParser, deserializationContext);
                }
                return jsonParser.mo13947W();
            case 7:
                o43<Object> o434 = this._numberDeserializer;
                if (o434 != null) {
                    return o434.deserialize(jsonParser, deserializationContext);
                }
                if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                }
                return jsonParser.mo13936L();
            case 8:
                o43<Object> o435 = this._numberDeserializer;
                if (o435 != null) {
                    return o435.deserialize(jsonParser, deserializationContext);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.mo13988y();
                }
                return jsonParser.mo13936L();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.mo13924A();
            default:
                return deserializationContext.handleUnexpectedToken((Class<?>) Object.class, jsonParser);
        }
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        int h = jsonParser.mo13967h();
        if (!(h == 1 || h == 3)) {
            switch (h) {
                case 5:
                    break;
                case 6:
                    o43<Object> o43 = this._stringDeserializer;
                    if (o43 != null) {
                        return o43.deserialize(jsonParser, deserializationContext);
                    }
                    return jsonParser.mo13947W();
                case 7:
                    o43<Object> o432 = this._numberDeserializer;
                    if (o432 != null) {
                        return o432.deserialize(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                        return _coerceIntegral(jsonParser, deserializationContext);
                    }
                    return jsonParser.mo13936L();
                case 8:
                    o43<Object> o433 = this._numberDeserializer;
                    if (o433 != null) {
                        return o433.deserialize(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.mo13988y();
                    }
                    return jsonParser.mo13936L();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.mo13924A();
                default:
                    return deserializationContext.handleUnexpectedToken((Class<?>) Object.class, jsonParser);
            }
        }
        return j07.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public boolean isCachable() {
        return true;
    }

    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken N0 = jsonParser.mo13938N0();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        int i = 2;
        if (N0 == jsonToken) {
            return new ArrayList(2);
        }
        Object deserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.mo13938N0() == jsonToken) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(deserialize);
            return arrayList;
        }
        Object deserialize2 = deserialize(jsonParser, deserializationContext);
        if (jsonParser.mo13938N0() == jsonToken) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(deserialize);
            arrayList2.add(deserialize2);
            return arrayList2;
        }
        we4 leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] i2 = leaseObjectBuffer.mo27498i();
        i2[0] = deserialize;
        i2[1] = deserialize2;
        int i3 = 2;
        while (true) {
            Object deserialize3 = deserialize(jsonParser, deserializationContext);
            i++;
            if (i3 >= i2.length) {
                i2 = leaseObjectBuffer.mo27492c(i2);
                i3 = 0;
            }
            int i4 = i3 + 1;
            i2[i3] = deserialize3;
            if (jsonParser.mo13938N0() == JsonToken.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i);
                leaseObjectBuffer.mo27494e(i2, i4, arrayList3);
                return arrayList3;
            }
            i3 = i4;
        }
    }

    public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo13938N0() == JsonToken.END_ARRAY) {
            return NO_OBJECTS;
        }
        we4 leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] i = leaseObjectBuffer.mo27498i();
        int i2 = 0;
        while (true) {
            Object deserialize = deserialize(jsonParser, deserializationContext);
            if (i2 >= i.length) {
                i = leaseObjectBuffer.mo27492c(i);
                i2 = 0;
            }
            int i3 = i2 + 1;
            i[i2] = deserialize;
            if (jsonParser.mo13938N0() == JsonToken.END_ARRAY) {
                return leaseObjectBuffer.mo27495f(i, i3);
            }
            i2 = i3;
        }
    }

    public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        JsonToken g = jsonParser.mo13965g();
        if (g == JsonToken.START_OBJECT) {
            str = jsonParser.mo13930E0();
        } else if (g == JsonToken.FIELD_NAME) {
            str = jsonParser.mo13964f();
        } else if (g != JsonToken.END_OBJECT) {
            return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null) {
            return new LinkedHashMap(2);
        }
        jsonParser.mo13938N0();
        Object deserialize = deserialize(jsonParser, deserializationContext);
        String E0 = jsonParser.mo13930E0();
        if (E0 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(str2, deserialize);
            return linkedHashMap;
        }
        jsonParser.mo13938N0();
        Object deserialize2 = deserialize(jsonParser, deserializationContext);
        String E02 = jsonParser.mo13930E0();
        if (E02 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str2, deserialize);
            return linkedHashMap2.put(E0, deserialize2) != null ? _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap2, str2, deserialize, deserialize2, E02) : linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str2, deserialize);
        if (linkedHashMap3.put(E0, deserialize2) != null) {
            return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, str2, deserialize, deserialize2, E02);
        }
        do {
            jsonParser.mo13938N0();
            Object deserialize3 = deserialize(jsonParser, deserializationContext);
            Object put = linkedHashMap3.put(E02, deserialize3);
            if (put != null) {
                return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, E02, put, deserialize3, jsonParser.mo13930E0());
            }
            E02 = jsonParser.mo13930E0();
        } while (E02 != null);
        return linkedHashMap3;
    }

    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        JavaType constructType = deserializationContext.constructType(Object.class);
        JavaType constructType2 = deserializationContext.constructType(String.class);
        TypeFactory typeFactory = deserializationContext.getTypeFactory();
        JavaType javaType = this._listType;
        if (javaType == null) {
            this._listDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructCollectionType((Class<? extends Collection>) List.class, constructType)));
        } else {
            this._listDeserializer = _findCustomDeser(deserializationContext, javaType);
        }
        JavaType javaType2 = this._mapType;
        if (javaType2 == null) {
            this._mapDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructMapType((Class<? extends Map>) Map.class, constructType2, constructType)));
        } else {
            this._mapDeserializer = _findCustomDeser(deserializationContext, javaType2);
        }
        this._stringDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, constructType2));
        this._numberDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructType((Type) Number.class)));
        JavaType unknownType = TypeFactory.unknownType();
        this._mapDeserializer = deserializationContext.handleSecondaryContextualization(this._mapDeserializer, (BeanProperty) null, unknownType);
        this._listDeserializer = deserializationContext.handleSecondaryContextualization(this._listDeserializer, (BeanProperty) null, unknownType);
        this._stringDeserializer = deserializationContext.handleSecondaryContextualization(this._stringDeserializer, (BeanProperty) null, unknownType);
        this._numberDeserializer = deserializationContext.handleSecondaryContextualization(this._numberDeserializer, (BeanProperty) null, unknownType);
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public UntypedObjectDeserializer(JavaType javaType, JavaType javaType2) {
        super((Class<?>) Object.class);
        this._listType = javaType;
        this._mapType = javaType2;
        this._nonMerging = false;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, o43<?> o43, o43<?> o432, o43<?> o433, o43<?> o434) {
        super((Class<?>) Object.class);
        this._mapDeserializer = o43;
        this._listDeserializer = o432;
        this._stringDeserializer = o433;
        this._numberDeserializer = o434;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = untypedObjectDeserializer._nonMerging;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super((Class<?>) Object.class);
        this._mapDeserializer = untypedObjectDeserializer._mapDeserializer;
        this._listDeserializer = untypedObjectDeserializer._listDeserializer;
        this._stringDeserializer = untypedObjectDeserializer._stringDeserializer;
        this._numberDeserializer = untypedObjectDeserializer._numberDeserializer;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = z;
    }

    public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        while (jsonParser.mo13938N0() != JsonToken.END_ARRAY) {
            collection.add(deserialize(jsonParser, deserializationContext));
        }
        return collection;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this._nonMerging) {
            return deserialize(jsonParser, deserializationContext);
        }
        switch (jsonParser.mo13967h()) {
            case 1:
            case 2:
            case 5:
                o43<Object> o43 = this._mapDeserializer;
                if (o43 != null) {
                    return o43.deserialize(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Map) {
                    return mapObject(jsonParser, deserializationContext, (Map) obj);
                }
                return mapObject(jsonParser, deserializationContext);
            case 3:
                o43<Object> o432 = this._listDeserializer;
                if (o432 != null) {
                    return o432.deserialize(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Collection) {
                    return mapArray(jsonParser, deserializationContext, (Collection) obj);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return mapArrayToArray(jsonParser, deserializationContext);
                }
                return mapArray(jsonParser, deserializationContext);
            case 6:
                o43<Object> o433 = this._stringDeserializer;
                if (o433 != null) {
                    return o433.deserialize(jsonParser, deserializationContext, obj);
                }
                return jsonParser.mo13947W();
            case 7:
                o43<Object> o434 = this._numberDeserializer;
                if (o434 != null) {
                    return o434.deserialize(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                }
                return jsonParser.mo13936L();
            case 8:
                o43<Object> o435 = this._numberDeserializer;
                if (o435 != null) {
                    return o435.deserialize(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.mo13988y();
                }
                return jsonParser.mo13936L();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.mo13924A();
            default:
                return deserialize(jsonParser, deserializationContext);
        }
    }

    public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        Object obj;
        JsonToken g = jsonParser.mo13965g();
        if (g == JsonToken.START_OBJECT) {
            g = jsonParser.mo13938N0();
        }
        if (g == JsonToken.END_OBJECT) {
            return map;
        }
        String f = jsonParser.mo13964f();
        do {
            jsonParser.mo13938N0();
            Object obj2 = map.get(f);
            if (obj2 != null) {
                obj = deserialize(jsonParser, deserializationContext, obj2);
            } else {
                obj = deserialize(jsonParser, deserializationContext);
            }
            if (obj != obj2) {
                map.put(f, obj);
            }
            f = jsonParser.mo13930E0();
        } while (f != null);
        return map;
    }
}
