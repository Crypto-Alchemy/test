package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.C2040a;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

@zz2
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements ls0 {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    public static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    private static final long serialVersionUID = 1;
    public C2040a _dynamicValueSerializers;
    public final Object _filterId;
    public final Set<String> _ignoredEntries;
    public final Set<String> _includedEntries;
    public final IgnorePropertiesUtil.Checker _inclusionChecker;
    public y63<Object> _keySerializer;
    public final JavaType _keyType;
    public final BeanProperty _property;
    public final boolean _sortKeys;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public y63<Object> _valueSerializer;
    public final JavaType _valueType;
    public final boolean _valueTypeIsStatic;
    public final m17 _valueTypeSerializer;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.MapSerializer$a */
    public static /* synthetic */ class C2049a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10119a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonInclude$Include[] r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10119a = r0
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10119a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10119a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10119a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10119a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10119a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.C2049a.<clinit>():void");
        }
    }

    public MapSerializer(Set<String> set, Set<String> set2, JavaType javaType, JavaType javaType2, boolean z, m17 m17, y63<?> y63, y63<?> y632) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = javaType;
        this._valueType = javaType2;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = m17;
        this._keySerializer = y63;
        this._valueSerializer = y632;
        this._dynamicValueSerializers = C2040a.m14286c();
        this._property = null;
        this._filterId = null;
        this._sortKeys = false;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._inclusionChecker = IgnorePropertiesUtil.m14341a(set, set2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fasterxml.jackson.databind.ser.std.MapSerializer construct(java.util.Set<java.lang.String> r12, java.util.Set<java.lang.String> r13, com.fasterxml.jackson.databind.JavaType r14, boolean r15, p000.m17 r16, p000.y63<java.lang.Object> r17, p000.y63<java.lang.Object> r18, java.lang.Object r19) {
        /*
            r0 = r14
            r1 = r19
            if (r0 != 0) goto L_0x000a
            com.fasterxml.jackson.databind.JavaType r0 = UNSPECIFIED_TYPE
            r6 = r0
            r7 = r6
            goto L_0x0021
        L_0x000a:
            com.fasterxml.jackson.databind.JavaType r2 = r14.getKeyType()
            java.lang.Class<java.util.Properties> r3 = java.util.Properties.class
            boolean r3 = r14.hasRawClass(r3)
            if (r3 == 0) goto L_0x001b
            com.fasterxml.jackson.databind.JavaType r0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType()
            goto L_0x001f
        L_0x001b:
            com.fasterxml.jackson.databind.JavaType r0 = r14.getContentType()
        L_0x001f:
            r7 = r0
            r6 = r2
        L_0x0021:
            r0 = 0
            if (r15 != 0) goto L_0x002e
            if (r7 == 0) goto L_0x0036
            boolean r2 = r7.isFinal()
            if (r2 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0036
        L_0x002e:
            java.lang.Class r2 = r7.getRawClass()
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r2 != r3) goto L_0x0038
        L_0x0036:
            r8 = r0
            goto L_0x0039
        L_0x0038:
            r8 = r15
        L_0x0039:
            com.fasterxml.jackson.databind.ser.std.MapSerializer r0 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r3 = r0
            r4 = r12
            r5 = r13
            r9 = r16
            r10 = r17
            r11 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r1 == 0) goto L_0x004d
            com.fasterxml.jackson.databind.ser.std.MapSerializer r0 = r0.withFilterId((java.lang.Object) r1)
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.construct(java.util.Set, java.util.Set, com.fasterxml.jackson.databind.JavaType, boolean, m17, y63, y63, java.lang.Object):com.fasterxml.jackson.databind.ser.std.MapSerializer");
    }

    public void _ensureOverride(String str) {
        wf0.m29527n0(MapSerializer.class, this, str);
    }

    public final y63<Object> _findAndAddDynamic(C2040a aVar, Class<?> cls, zw5 zw5) throws JsonMappingException {
        C2040a.C2044d i = aVar.mo16643i(cls, zw5, this._property);
        C2040a aVar2 = i.f10110b;
        if (aVar != aVar2) {
            this._dynamicValueSerializers = aVar2;
        }
        return i.f10109a;
    }

    public boolean _hasNullKey(Map<?, ?> map) {
        if (!(map instanceof HashMap) || !map.containsKey((Object) null)) {
            return false;
        }
        return true;
    }

    public Map<?, ?> _orderEntries(Map<?, ?> map, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (!_hasNullKey(map)) {
            return new TreeMap(map);
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (key == null) {
                _writeNullKeyedEntry(jsonGenerator, zw5, next.getValue());
            } else {
                treeMap.put(key, next.getValue());
            }
        }
        return treeMap;
    }

    public void _writeNullKeyedEntry(JsonGenerator jsonGenerator, zw5 zw5, Object obj) throws IOException {
        y63<Object> y63;
        y63<Object> findNullKeySerializer = zw5.findNullKeySerializer(this._keyType, this._property);
        if (obj != null) {
            y63 = this._valueSerializer;
            if (y63 == null) {
                y63 = mo16725a(zw5, obj);
            }
            Object obj2 = this._suppressableValue;
            if (obj2 == MARKER_FOR_EMPTY) {
                if (y63.isEmpty(zw5, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        } else if (!this._suppressNulls) {
            y63 = zw5.getDefaultNullValueSerializer();
        } else {
            return;
        }
        try {
            findNullKeySerializer.serialize(null, jsonGenerator, zw5);
            y63.serialize(obj, jsonGenerator, zw5);
        } catch (Exception e) {
            wrapAndThrow(zw5, (Throwable) e, obj, "");
        }
    }

    /* renamed from: a */
    public final y63<Object> mo16725a(zw5 zw5, Object obj) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        y63<Object> k = this._dynamicValueSerializers.mo16645k(cls);
        if (k != null) {
            return k;
        }
        if (this._valueType.hasGenericTypes()) {
            return _findAndAddDynamic(this._dynamicValueSerializers, zw5.constructSpecializedType(this._valueType, cls), zw5);
        }
        return _findAndAddDynamic(this._dynamicValueSerializers, cls, zw5);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        d53 g = t43.mo26055g(javaType);
        if (g != null) {
            g.mo18521a(this._keySerializer, this._keyType);
            y63<Object> y63 = this._valueSerializer;
            if (y63 == null) {
                y63 = _findAndAddDynamic(this._dynamicValueSerializers, this._valueType, t43.mo25637b());
            }
            g.mo18522n(y63, this._valueType);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0126, code lost:
        if (r0 != 5) goto L_0x015f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<?> createContextual(p000.zw5 r14, com.fasterxml.jackson.databind.BeanProperty r15) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r13 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r14.getAnnotationIntrospector()
            r1 = 0
            if (r15 != 0) goto L_0x0009
            r2 = r1
            goto L_0x000d
        L_0x0009:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r15.getMember()
        L_0x000d:
            boolean r3 = com.fasterxml.jackson.databind.ser.std.StdSerializer._neitherNull(r2, r0)
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r0.findKeySerializer(r2)
            if (r3 == 0) goto L_0x001e
            y63 r3 = r14.serializerInstance(r2, r3)
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            java.lang.Object r4 = r0.findContentSerializer(r2)
            if (r4 == 0) goto L_0x002a
            y63 r4 = r14.serializerInstance(r2, r4)
            goto L_0x002e
        L_0x002a:
            r4 = r1
            goto L_0x002e
        L_0x002c:
            r3 = r1
            r4 = r3
        L_0x002e:
            if (r4 != 0) goto L_0x0032
            y63<java.lang.Object> r4 = r13._valueSerializer
        L_0x0032:
            y63 r4 = r13.findContextualConvertingSerializer(r14, r15, r4)
            if (r4 != 0) goto L_0x004a
            boolean r5 = r13._valueTypeIsStatic
            if (r5 == 0) goto L_0x004a
            com.fasterxml.jackson.databind.JavaType r5 = r13._valueType
            boolean r5 = r5.isJavaLangObject()
            if (r5 != 0) goto L_0x004a
            com.fasterxml.jackson.databind.JavaType r4 = r13._valueType
            y63 r4 = r14.findContentValueSerializer((com.fasterxml.jackson.databind.JavaType) r4, (com.fasterxml.jackson.databind.BeanProperty) r15)
        L_0x004a:
            r8 = r4
            if (r3 != 0) goto L_0x004f
            y63<java.lang.Object> r3 = r13._keySerializer
        L_0x004f:
            if (r3 != 0) goto L_0x0058
            com.fasterxml.jackson.databind.JavaType r3 = r13._keyType
            y63 r3 = r14.findKeySerializer((com.fasterxml.jackson.databind.JavaType) r3, (com.fasterxml.jackson.databind.BeanProperty) r15)
            goto L_0x005c
        L_0x0058:
            y63 r3 = r14.handleSecondaryContextualization(r3, r15)
        L_0x005c:
            r7 = r3
            java.util.Set<java.lang.String> r3 = r13._ignoredEntries
            java.util.Set<java.lang.String> r4 = r13._includedEntries
            boolean r5 = com.fasterxml.jackson.databind.ser.std.StdSerializer._neitherNull(r2, r0)
            r12 = 0
            if (r5 == 0) goto L_0x00d5
            com.fasterxml.jackson.databind.SerializationConfig r5 = r14.getConfig()
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r6 = r0.findPropertyIgnoralByName(r5, r2)
            java.util.Set r6 = r6.findIgnoredForSerialization()
            boolean r9 = com.fasterxml.jackson.databind.ser.std.StdSerializer._nonEmpty(r6)
            if (r9 == 0) goto L_0x009c
            if (r3 != 0) goto L_0x0082
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            goto L_0x0088
        L_0x0082:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r3)
            r3 = r9
        L_0x0088:
            java.util.Iterator r6 = r6.iterator()
        L_0x008c:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x009c
            java.lang.Object r9 = r6.next()
            java.lang.String r9 = (java.lang.String) r9
            r3.add(r9)
            goto L_0x008c
        L_0x009c:
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r5 = r0.findPropertyInclusionByName(r5, r2)
            java.util.Set r5 = r5.getIncluded()
            if (r5 == 0) goto L_0x00c8
            if (r4 != 0) goto L_0x00ae
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            goto L_0x00b4
        L_0x00ae:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r4)
            r4 = r6
        L_0x00b4:
            java.util.Iterator r5 = r5.iterator()
        L_0x00b8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c8
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r4.add(r6)
            goto L_0x00b8
        L_0x00c8:
            java.lang.Boolean r5 = r0.findSerializationSortAlphabetically(r2)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = r6.equals(r5)
            r9 = r3
            r10 = r4
            goto L_0x00d8
        L_0x00d5:
            r9 = r3
            r10 = r4
            r5 = r12
        L_0x00d8:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r13.findFormatOverrides(r14, r15, r3)
            if (r3 == 0) goto L_0x00ee
            com.fasterxml.jackson.annotation.JsonFormat$Feature r4 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SORTED_MAP_ENTRIES
            java.lang.Boolean r3 = r3.getFeature(r4)
            if (r3 == 0) goto L_0x00ee
            boolean r3 = r3.booleanValue()
            r11 = r3
            goto L_0x00ef
        L_0x00ee:
            r11 = r5
        L_0x00ef:
            r5 = r13
            r6 = r15
            com.fasterxml.jackson.databind.ser.std.MapSerializer r3 = r5.withResolved(r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x0101
            java.lang.Object r0 = r0.findFilterId(r2)
            if (r0 == 0) goto L_0x0101
            com.fasterxml.jackson.databind.ser.std.MapSerializer r3 = r3.withFilterId((java.lang.Object) r0)
        L_0x0101:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            com.fasterxml.jackson.annotation.JsonInclude$Value r15 = r13.findIncludeOverrides(r14, r15, r0)
            if (r15 == 0) goto L_0x0163
            com.fasterxml.jackson.annotation.JsonInclude$Include r0 = r15.getContentInclusion()
            com.fasterxml.jackson.annotation.JsonInclude$Include r2 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r0 == r2) goto L_0x0163
            int[] r2 = com.fasterxml.jackson.databind.ser.std.MapSerializer.C2049a.f10119a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 == r2) goto L_0x0148
            r4 = 2
            if (r0 == r4) goto L_0x013c
            r4 = 3
            if (r0 == r4) goto L_0x0139
            r4 = 4
            if (r0 == r4) goto L_0x0129
            r14 = 5
            if (r0 == r14) goto L_0x015e
            goto L_0x015f
        L_0x0129:
            java.lang.Class r15 = r15.getContentFilter()
            java.lang.Object r1 = r14.includeFilterInstance(r1, r15)
            if (r1 != 0) goto L_0x0134
            goto L_0x015e
        L_0x0134:
            boolean r12 = r14.includeFilterSuppressNulls(r1)
            goto L_0x015f
        L_0x0139:
            java.lang.Object r1 = MARKER_FOR_EMPTY
            goto L_0x015e
        L_0x013c:
            com.fasterxml.jackson.databind.JavaType r14 = r13._valueType
            boolean r14 = r14.isReferenceType()
            if (r14 == 0) goto L_0x015e
            java.lang.Object r14 = MARKER_FOR_EMPTY
            r1 = r14
            goto L_0x015e
        L_0x0148:
            com.fasterxml.jackson.databind.JavaType r14 = r13._valueType
            java.lang.Object r1 = p000.t00.m27231b(r14)
            if (r1 == 0) goto L_0x015e
            java.lang.Class r14 = r1.getClass()
            boolean r14 = r14.isArray()
            if (r14 == 0) goto L_0x015e
            java.lang.Object r1 = p000.C2103cq.m14359b(r1)
        L_0x015e:
            r12 = r2
        L_0x015f:
            com.fasterxml.jackson.databind.ser.std.MapSerializer r3 = r3.withContentInclusion(r1, r12)
        L_0x0163:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(zw5, com.fasterxml.jackson.databind.BeanProperty):y63");
    }

    public y63<?> getContentSerializer() {
        return this._valueSerializer;
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    public y63<?> getKeySerializer() {
        return this._keySerializer;
    }

    public g53 getSchema(zw5 zw5, Type type) {
        return createSchemaNode("object", true);
    }

    public void serializeFields(Map<?, ?> map, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        Object obj = null;
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, zw5, (Object) null);
            return;
        }
        y63<Object> y63 = this._keySerializer;
        try {
            Object obj2 = null;
            for (Map.Entry next : map.entrySet()) {
                try {
                    Object value = next.getValue();
                    obj2 = next.getKey();
                    if (obj2 == null) {
                        zw5.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, zw5);
                    } else {
                        IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
                        if (checker == null || !checker.shouldIgnore(obj2)) {
                            y63.serialize(obj2, jsonGenerator, zw5);
                        }
                    }
                    if (value == null) {
                        zw5.defaultSerializeNull(jsonGenerator);
                    } else {
                        y63<Object> y632 = this._valueSerializer;
                        if (y632 == null) {
                            y632 = mo16725a(zw5, value);
                        }
                        y632.serialize(value, jsonGenerator, zw5);
                    }
                } catch (Exception e) {
                    e = e;
                    obj = obj2;
                    wrapAndThrow(zw5, (Throwable) e, (Object) map, String.valueOf(obj));
                }
            }
        } catch (Exception e2) {
            e = e2;
            wrapAndThrow(zw5, (Throwable) e, (Object) map, String.valueOf(obj));
        }
    }

    public void serializeFieldsUsing(Map<?, ?> map, JsonGenerator jsonGenerator, zw5 zw5, y63<Object> y63) throws IOException {
        y63<Object> y632 = this._keySerializer;
        m17 m17 = this._valueTypeSerializer;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(key)) {
                if (key == null) {
                    zw5.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, zw5);
                } else {
                    y632.serialize(key, jsonGenerator, zw5);
                }
                Object value = next.getValue();
                if (value == null) {
                    zw5.defaultSerializeNull(jsonGenerator);
                } else if (m17 == null) {
                    try {
                        y63.serialize(value, jsonGenerator, zw5);
                    } catch (Exception e) {
                        wrapAndThrow(zw5, (Throwable) e, (Object) map, String.valueOf(key));
                    }
                } else {
                    y63.serializeWithType(value, jsonGenerator, zw5, m17);
                }
            }
        }
    }

    public void serializeFilteredAnyProperties(zw5 zw5, JsonGenerator jsonGenerator, Object obj, Map<?, ?> map, hx4 hx4, Object obj2) throws IOException {
        boolean z;
        y63<Object> y63;
        y63<Object> y632;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        if (MARKER_FOR_EMPTY == obj2) {
            z = true;
        } else {
            z = false;
        }
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(key)) {
                if (key == null) {
                    y63 = zw5.findNullKeySerializer(this._keyType, this._property);
                } else {
                    y63 = this._keySerializer;
                }
                Object value = next.getValue();
                if (value != null) {
                    y632 = this._valueSerializer;
                    if (y632 == null) {
                        y632 = mo16725a(zw5, value);
                    }
                    if (z) {
                        if (y632.isEmpty(zw5, value)) {
                        }
                    } else if (obj2 != null && obj2.equals(value)) {
                    }
                } else if (!this._suppressNulls) {
                    y632 = zw5.getDefaultNullValueSerializer();
                }
                mapProperty.reset(key, value, y63, y632);
                try {
                    hx4.mo21414a(obj, jsonGenerator, zw5, mapProperty);
                } catch (Exception e) {
                    wrapAndThrow(zw5, (Throwable) e, (Object) map, String.valueOf(key));
                }
            }
        }
    }

    public void serializeFilteredFields(Map<?, ?> map, JsonGenerator jsonGenerator, zw5 zw5, hx4 hx4, Object obj) throws IOException {
        boolean z;
        y63<Object> y63;
        y63<Object> y632;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        if (MARKER_FOR_EMPTY == obj) {
            z = true;
        } else {
            z = false;
        }
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(key)) {
                if (key == null) {
                    y63 = zw5.findNullKeySerializer(this._keyType, this._property);
                } else {
                    y63 = this._keySerializer;
                }
                Object value = next.getValue();
                if (value != null) {
                    y632 = this._valueSerializer;
                    if (y632 == null) {
                        y632 = mo16725a(zw5, value);
                    }
                    if (z) {
                        if (y632.isEmpty(zw5, value)) {
                        }
                    } else if (obj != null && obj.equals(value)) {
                    }
                } else if (!this._suppressNulls) {
                    y632 = zw5.getDefaultNullValueSerializer();
                }
                mapProperty.reset(key, value, y63, y632);
                try {
                    hx4.mo21414a(map, jsonGenerator, zw5, mapProperty);
                } catch (Exception e) {
                    wrapAndThrow(zw5, (Throwable) e, (Object) map, String.valueOf(key));
                }
            }
        }
    }

    public void serializeOptionalFields(Map<?, ?> map, JsonGenerator jsonGenerator, zw5 zw5, Object obj) throws IOException {
        boolean z;
        y63<Object> y63;
        y63<Object> y632;
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, zw5, obj);
            return;
        }
        if (MARKER_FOR_EMPTY == obj) {
            z = true;
        } else {
            z = false;
        }
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (key == null) {
                y63 = zw5.findNullKeySerializer(this._keyType, this._property);
            } else {
                IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
                if (checker == null || !checker.shouldIgnore(key)) {
                    y63 = this._keySerializer;
                }
            }
            Object value = next.getValue();
            if (value != null) {
                y632 = this._valueSerializer;
                if (y632 == null) {
                    y632 = mo16725a(zw5, value);
                }
                if (z) {
                    if (y632.isEmpty(zw5, value)) {
                    }
                } else if (obj != null && obj.equals(value)) {
                }
            } else if (!this._suppressNulls) {
                y632 = zw5.getDefaultNullValueSerializer();
            }
            try {
                y63.serialize(key, jsonGenerator, zw5);
                y632.serialize(value, jsonGenerator, zw5);
            } catch (Exception e) {
                wrapAndThrow(zw5, (Throwable) e, (Object) map, String.valueOf(key));
            }
        }
    }

    public void serializeTypedFields(Map<?, ?> map, JsonGenerator jsonGenerator, zw5 zw5, Object obj) throws IOException {
        boolean z;
        y63<Object> y63;
        y63<Object> y632;
        if (MARKER_FOR_EMPTY == obj) {
            z = true;
        } else {
            z = false;
        }
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (key == null) {
                y63 = zw5.findNullKeySerializer(this._keyType, this._property);
            } else {
                IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
                if (checker == null || !checker.shouldIgnore(key)) {
                    y63 = this._keySerializer;
                }
            }
            Object value = next.getValue();
            if (value != null) {
                y632 = this._valueSerializer;
                if (y632 == null) {
                    y632 = mo16725a(zw5, value);
                }
                if (z) {
                    if (y632.isEmpty(zw5, value)) {
                    }
                } else if (obj != null && obj.equals(value)) {
                }
            } else if (!this._suppressNulls) {
                y632 = zw5.getDefaultNullValueSerializer();
            }
            y63.serialize(key, jsonGenerator, zw5);
            try {
                y632.serializeWithType(value, jsonGenerator, zw5, this._valueTypeSerializer);
            } catch (Exception e) {
                wrapAndThrow(zw5, (Throwable) e, (Object) map, String.valueOf(key));
            }
        }
    }

    public void serializeWithoutTypeInfo(Map<?, ?> map, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        hx4 findPropertyFilter;
        if (!map.isEmpty()) {
            if (this._sortKeys || zw5.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = _orderEntries(map, jsonGenerator, zw5);
            }
            Map<?, ?> map2 = map;
            Object obj = this._filterId;
            if (obj == null || (findPropertyFilter = findPropertyFilter(zw5, obj, map2)) == null) {
                Object obj2 = this._suppressableValue;
                if (obj2 != null || this._suppressNulls) {
                    serializeOptionalFields(map2, jsonGenerator, zw5, obj2);
                    return;
                }
                y63<Object> y63 = this._valueSerializer;
                if (y63 != null) {
                    serializeFieldsUsing(map2, jsonGenerator, zw5, y63);
                } else {
                    serializeFields(map2, jsonGenerator, zw5);
                }
            } else {
                serializeFilteredFields(map2, jsonGenerator, zw5, findPropertyFilter, this._suppressableValue);
            }
        }
    }

    public MapSerializer withContentInclusion(Object obj, boolean z) {
        if (obj == this._suppressableValue && z == this._suppressNulls) {
            return this;
        }
        _ensureOverride("withContentInclusion");
        return new MapSerializer(this, this._valueTypeSerializer, obj, z);
    }

    public MapSerializer withResolved(BeanProperty beanProperty, y63<?> y63, y63<?> y632, Set<String> set, Set<String> set2, boolean z) {
        _ensureOverride("withResolved");
        MapSerializer mapSerializer = new MapSerializer(this, beanProperty, y63, y632, set, set2);
        return z != mapSerializer._sortKeys ? new MapSerializer(mapSerializer, this._filterId, z) : mapSerializer;
    }

    @Deprecated
    public void _ensureOverride() {
        _ensureOverride(xg5.MISSING_REASON);
    }

    public MapSerializer _withValueTypeSerializer(m17 m17) {
        if (this._valueTypeSerializer == m17) {
            return this;
        }
        _ensureOverride("_withValueTypeSerializer");
        return new MapSerializer(this, m17, this._suppressableValue, this._suppressNulls);
    }

    public boolean hasSingleElement(Map<?, ?> map) {
        return map.size() == 1;
    }

    public boolean isEmpty(zw5 zw5, Map<?, ?> map) {
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this._suppressableValue;
        if (obj == null && !this._suppressNulls) {
            return false;
        }
        y63<Object> y63 = this._valueSerializer;
        boolean z = MARKER_FOR_EMPTY == obj;
        if (y63 != null) {
            for (Object next : map.values()) {
                if (next == null) {
                    if (!this._suppressNulls) {
                        return false;
                    }
                } else if (z) {
                    if (!y63.isEmpty(zw5, next)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object next2 : map.values()) {
            if (next2 != null) {
                try {
                    y63<Object> a = mo16725a(zw5, next2);
                    if (!z) {
                        if (obj != null && obj.equals(map)) {
                        }
                        return false;
                    } else if (!a.isEmpty(zw5, next2)) {
                        return false;
                    }
                } catch (DatabindException unused) {
                }
            } else if (!this._suppressNulls) {
                return false;
            }
        }
        return true;
    }

    public void serialize(Map<?, ?> map, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13854S0(map);
        serializeWithoutTypeInfo(map, jsonGenerator, zw5);
        jsonGenerator.mo13855W();
    }

    public void serializeWithType(Map<?, ?> map, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        jsonGenerator.mo13895s(map);
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(map, JsonToken.START_OBJECT));
        serializeWithoutTypeInfo(map, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }

    public MapSerializer withFilterId(Object obj) {
        if (this._filterId == obj) {
            return this;
        }
        _ensureOverride("withFilterId");
        return new MapSerializer(this, obj, this._sortKeys);
    }

    @Deprecated
    public MapSerializer withContentInclusion(Object obj) {
        return new MapSerializer(this, this._valueTypeSerializer, obj, this._suppressNulls);
    }

    public final y63<Object> _findAndAddDynamic(C2040a aVar, JavaType javaType, zw5 zw5) throws JsonMappingException {
        C2040a.C2044d h = aVar.mo16642h(javaType, zw5, this._property);
        C2040a aVar2 = h.f10110b;
        if (aVar != aVar2) {
            this._dynamicValueSerializers = aVar2;
        }
        return h.f10109a;
    }

    public MapSerializer withResolved(BeanProperty beanProperty, y63<?> y63, y63<?> y632, Set<String> set, boolean z) {
        return withResolved(beanProperty, y63, y632, set, (Set<String>) null, z);
    }

    public static MapSerializer construct(Set<String> set, JavaType javaType, boolean z, m17 m17, y63<Object> y63, y63<Object> y632, Object obj) {
        return construct(set, (Set<String>) null, javaType, z, m17, y63, y632, obj);
    }

    @Deprecated
    public static MapSerializer construct(String[] strArr, JavaType javaType, boolean z, m17 m17, y63<Object> y63, y63<Object> y632, Object obj) {
        return construct((Set<String>) C2103cq.m14358a(strArr), javaType, z, m17, y63, y632, obj);
    }

    @Deprecated
    public MapSerializer(Set<String> set, JavaType javaType, JavaType javaType2, boolean z, m17 m17, y63<?> y63, y63<?> y632) {
        this(set, (Set<String>) null, javaType, javaType2, z, m17, y63, y632);
    }

    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, y63<?> y63, y63<?> y632, Set<String> set, Set<String> set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = y63;
        this._valueSerializer = y632;
        this._dynamicValueSerializers = C2040a.m14286c();
        this._property = beanProperty;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = IgnorePropertiesUtil.m14341a(set, set2);
    }

    @Deprecated
    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, y63<?> y63, y63<?> y632, Set<String> set) {
        this(mapSerializer, beanProperty, y63, y632, set, (Set<String>) null);
    }

    public MapSerializer(MapSerializer mapSerializer, m17 m17, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = m17;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = obj;
        this._suppressNulls = z;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = C2040a.m14286c();
        this._property = mapSerializer._property;
        this._filterId = obj;
        this._sortKeys = z;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }

    @Deprecated
    public MapSerializer(MapSerializer mapSerializer, m17 m17, Object obj) {
        this(mapSerializer, m17, obj, false);
    }
}
