package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.C2021a;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasicSerializerFactory extends yw5 implements Serializable {
    public static final HashMap<String, y63<?>> _concrete;
    public static final HashMap<String, Class<? extends y63<?>>> _concreteLazy;
    public final SerializerFactoryConfig _factoryConfig;

    /* renamed from: com.fasterxml.jackson.databind.ser.BasicSerializerFactory$a */
    public static /* synthetic */ class C2037a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10095a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f10096b;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonInclude$Include[] r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10096b = r0
                r1 = 1
                com.fasterxml.jackson.annotation.JsonInclude$Include r2 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10096b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonInclude$Include r3 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f10096b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f10096b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f10096b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f10096b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.fasterxml.jackson.annotation.JsonFormat$Shape[] r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f10095a = r3
                com.fasterxml.jackson.annotation.JsonFormat$Shape r4 = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING     // Catch:{ NoSuchFieldError -> 0x005a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = f10095a     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = f10095a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.C2037a.<clinit>():void");
        }
    }

    static {
        HashMap<String, Class<? extends y63<?>>> hashMap = new HashMap<>();
        HashMap<String, y63<?>> hashMap2 = new HashMap<>();
        hashMap2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        hashMap2.put(StringBuffer.class.getName(), toStringSerializer);
        hashMap2.put(StringBuilder.class.getName(), toStringSerializer);
        hashMap2.put(Character.class.getName(), toStringSerializer);
        hashMap2.put(Character.TYPE.getName(), toStringSerializer);
        NumberSerializers.m14313a(hashMap2);
        hashMap2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        hashMap2.put(Boolean.class.getName(), new BooleanSerializer(false));
        hashMap2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), CalendarSerializer.instance);
        hashMap2.put(Date.class.getName(), DateSerializer.instance);
        for (Map.Entry next : StdJdkSerializers.m14318a()) {
            Object value = next.getValue();
            if (value instanceof y63) {
                hashMap2.put(((Class) next.getKey()).getName(), (y63) value);
            } else {
                hashMap.put(((Class) next.getKey()).getName(), (Class) value);
            }
        }
        hashMap.put(fr6.class.getName(), TokenBufferSerializer.class);
        _concrete = hashMap2;
        _concreteLazy = hashMap;
    }

    public BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this._factoryConfig = serializerFactoryConfig == null ? new SerializerFactoryConfig() : serializerFactoryConfig;
    }

    public MapSerializer _checkMapContentInclusion(zw5 zw5, n00 n00, MapSerializer mapSerializer) throws JsonMappingException {
        JsonInclude.Include include;
        JavaType contentType = mapSerializer.getContentType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(zw5, n00, contentType, Map.class);
        if (_findInclusionWithContent == null) {
            include = JsonInclude.Include.USE_DEFAULTS;
        } else {
            include = _findInclusionWithContent.getContentInclusion();
        }
        boolean z = true;
        Object obj = null;
        if (include != JsonInclude.Include.USE_DEFAULTS && include != JsonInclude.Include.ALWAYS) {
            int i = C2037a.f10096b[include.ordinal()];
            if (i == 1) {
                obj = t00.m27231b(contentType);
                if (obj != null && obj.getClass().isArray()) {
                    obj = C2103cq.m14359b(obj);
                }
            } else if (i != 2) {
                if (i == 3) {
                    obj = MapSerializer.MARKER_FOR_EMPTY;
                } else if (i == 4 && (obj = zw5.includeFilterInstance((q00) null, _findInclusionWithContent.getContentFilter())) != null) {
                    z = zw5.includeFilterSuppressNulls(obj);
                }
            } else if (contentType.isReferenceType()) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            }
            return mapSerializer.withContentInclusion(obj, z);
        } else if (!zw5.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES)) {
            return mapSerializer.withContentInclusion((Object) null, true);
        } else {
            return mapSerializer;
        }
    }

    public y63<Object> _findContentSerializer(zw5 zw5, C2911nl nlVar) throws JsonMappingException {
        Object findContentSerializer = zw5.getAnnotationIntrospector().findContentSerializer(nlVar);
        if (findContentSerializer != null) {
            return zw5.serializerInstance(nlVar, findContentSerializer);
        }
        return null;
    }

    public JsonInclude.Value _findInclusionWithContent(zw5 zw5, n00 n00, JavaType javaType, Class<?> cls) throws JsonMappingException {
        SerializationConfig config = zw5.getConfig();
        JsonInclude.Value defaultPropertyInclusion = config.getDefaultPropertyInclusion(cls, n00.mo23458p(config.getDefaultPropertyInclusion()));
        JsonInclude.Value defaultPropertyInclusion2 = config.getDefaultPropertyInclusion(javaType.getRawClass(), (JsonInclude.Value) null);
        if (defaultPropertyInclusion2 == null) {
            return defaultPropertyInclusion;
        }
        int i = C2037a.f10096b[defaultPropertyInclusion2.getValueInclusion().ordinal()];
        if (i == 4) {
            return defaultPropertyInclusion.withContentFilter(defaultPropertyInclusion2.getContentFilter());
        }
        if (i != 6) {
            return defaultPropertyInclusion.withContentInclusion(defaultPropertyInclusion2.getValueInclusion());
        }
        return defaultPropertyInclusion;
    }

    public y63<Object> _findKeySerializer(zw5 zw5, C2911nl nlVar) throws JsonMappingException {
        Object findKeySerializer = zw5.getAnnotationIntrospector().findKeySerializer(nlVar);
        if (findKeySerializer != null) {
            return zw5.serializerInstance(nlVar, findKeySerializer);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000d A[LOOP:0: B:1:0x000d->B:4:0x0022, LOOP_START, PHI: r0 
      PHI: (r0v2 y63<?>) = (r0v1 y63<?>), (r0v15 y63<?>) binds: [B:0:0x0000, B:4:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<?> buildArraySerializer(p000.zw5 r8, com.fasterxml.jackson.databind.type.ArrayType r9, p000.n00 r10, boolean r11, p000.m17 r12, p000.y63<java.lang.Object> r13) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.SerializationConfig r8 = r8.getConfig()
            java.lang.Iterable r0 = r7.customSerializers()
            java.util.Iterator r6 = r0.iterator()
            r0 = 0
        L_0x000d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r0 = r6.next()
            ax5 r0 = (p000.ax5) r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            y63 r0 = r0.findArraySerializer(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x000d
        L_0x0024:
            if (r0 != 0) goto L_0x0048
            java.lang.Class r1 = r9.getRawClass()
            if (r13 == 0) goto L_0x0032
            boolean r2 = p000.wf0.m29488O(r13)
            if (r2 == 0) goto L_0x003d
        L_0x0032:
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            if (r0 != r1) goto L_0x0039
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r0 = com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.instance
            goto L_0x003d
        L_0x0039:
            y63 r0 = com.fasterxml.jackson.databind.ser.std.StdArraySerializers.m14316a(r1)
        L_0x003d:
            if (r0 != 0) goto L_0x0048
            com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer r0 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer
            com.fasterxml.jackson.databind.JavaType r1 = r9.getContentType()
            r0.<init>(r1, r11, r12, r13)
        L_0x0048:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r11 = r7._factoryConfig
            boolean r11 = r11.hasSerializerModifiers()
            if (r11 == 0) goto L_0x006b
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r11 = r7._factoryConfig
            java.lang.Iterable r11 = r11.serializerModifiers()
            java.util.Iterator r11 = r11.iterator()
        L_0x005a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x006b
            java.lang.Object r12 = r11.next()
            s00 r12 = (p000.s00) r12
            y63 r0 = r12.mo25570b(r8, r9, r10, r0)
            goto L_0x005a
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer(zw5, com.fasterxml.jackson.databind.type.ArrayType, n00, boolean, m17, y63):y63");
    }

    public y63<?> buildAtomicReferenceSerializer(zw5 zw5, ReferenceType referenceType, n00 n00, boolean z, m17 m17, y63<Object> y63) throws JsonMappingException {
        JsonInclude.Include include;
        JavaType referencedType = referenceType.getReferencedType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(zw5, n00, referencedType, AtomicReference.class);
        if (_findInclusionWithContent == null) {
            include = JsonInclude.Include.USE_DEFAULTS;
        } else {
            include = _findInclusionWithContent.getContentInclusion();
        }
        boolean z2 = true;
        Object obj = null;
        if (include == JsonInclude.Include.USE_DEFAULTS || include == JsonInclude.Include.ALWAYS) {
            z2 = false;
        } else {
            int i = C2037a.f10096b[include.ordinal()];
            if (i == 1) {
                obj = t00.m27231b(referencedType);
                if (obj != null && obj.getClass().isArray()) {
                    obj = C2103cq.m14359b(obj);
                }
            } else if (i != 2) {
                if (i == 3) {
                    obj = MapSerializer.MARKER_FOR_EMPTY;
                } else if (i == 4 && (obj = zw5.includeFilterInstance((q00) null, _findInclusionWithContent.getContentFilter())) != null) {
                    z2 = zw5.includeFilterSuppressNulls(obj);
                }
            } else if (referencedType.isReferenceType()) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            }
        }
        return new AtomicReferenceSerializer(referenceType, z, m17, y63).withContentInclusion(obj, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0019 A[LOOP:0: B:1:0x0019->B:4:0x0032, LOOP_START, PHI: r1 
      PHI: (r1v2 y63<?>) = (r1v1 y63<?>), (r1v20 y63<?>) binds: [B:0:0x0000, B:4:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<?> buildCollectionSerializer(p000.zw5 r16, com.fasterxml.jackson.databind.type.CollectionType r17, p000.n00 r18, boolean r19, p000.m17 r20, p000.y63<java.lang.Object> r21) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r15 = this;
            r0 = r15
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            com.fasterxml.jackson.databind.SerializationConfig r12 = r16.getConfig()
            java.lang.Iterable r1 = r15.customSerializers()
            java.util.Iterator r13 = r1.iterator()
            r14 = 0
            r1 = r14
        L_0x0019:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0034
            java.lang.Object r1 = r13.next()
            ax5 r1 = (p000.ax5) r1
            r2 = r12
            r3 = r17
            r4 = r18
            r5 = r20
            r6 = r21
            y63 r1 = r1.findCollectionSerializer(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0019
        L_0x0034:
            if (r1 != 0) goto L_0x009c
            y63 r1 = r15.findSerializerByAnnotations(r16, r17, r18)
            if (r1 != 0) goto L_0x009c
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r7.mo23449g(r14)
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.getShape()
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r2 != r3) goto L_0x0049
            return r14
        L_0x0049:
            java.lang.Class r2 = r17.getRawClass()
            java.lang.Class<java.util.EnumSet> r3 = java.util.EnumSet.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x0066
            com.fasterxml.jackson.databind.JavaType r1 = r17.getContentType()
            boolean r2 = r1.isEnumImplType()
            if (r2 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r14 = r1
        L_0x0061:
            y63 r1 = r15.buildEnumSetSerializer(r14)
            goto L_0x009c
        L_0x0066:
            com.fasterxml.jackson.databind.JavaType r3 = r17.getContentType()
            java.lang.Class r3 = r3.getRawClass()
            boolean r2 = r15.isIndexedList(r2)
            if (r2 == 0) goto L_0x0088
            if (r3 != r11) goto L_0x007f
            boolean r2 = p000.wf0.m29488O(r21)
            if (r2 == 0) goto L_0x0092
            com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer r1 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance
            goto L_0x0092
        L_0x007f:
            com.fasterxml.jackson.databind.JavaType r1 = r17.getContentType()
            com.fasterxml.jackson.databind.ser.ContainerSerializer r1 = r15.buildIndexedListSerializer(r1, r8, r9, r10)
            goto L_0x0092
        L_0x0088:
            if (r3 != r11) goto L_0x0092
            boolean r2 = p000.wf0.m29488O(r21)
            if (r2 == 0) goto L_0x0092
            com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer r1 = com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer.instance
        L_0x0092:
            if (r1 != 0) goto L_0x009c
            com.fasterxml.jackson.databind.JavaType r1 = r17.getContentType()
            com.fasterxml.jackson.databind.ser.ContainerSerializer r1 = r15.buildCollectionSerializer(r1, r8, r9, r10)
        L_0x009c:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r0._factoryConfig
            boolean r2 = r2.hasSerializerModifiers()
            if (r2 == 0) goto L_0x00c1
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r0._factoryConfig
            java.lang.Iterable r2 = r2.serializerModifiers()
            java.util.Iterator r2 = r2.iterator()
        L_0x00ae:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c1
            java.lang.Object r3 = r2.next()
            s00 r3 = (p000.s00) r3
            r4 = r17
            y63 r1 = r3.mo25572d(r12, r4, r7, r1)
            goto L_0x00ae
        L_0x00c1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer(zw5, com.fasterxml.jackson.databind.type.CollectionType, n00, boolean, m17, y63):y63");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[LOOP:0: B:20:0x006a->B:23:0x0084, LOOP_START, PHI: r3 
      PHI: (r3v13 y63<?>) = (r3v1 y63<?>), (r3v21 y63<?>) binds: [B:19:0x0062, B:23:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<?> buildContainerSerializer(p000.zw5 r19, com.fasterxml.jackson.databind.JavaType r20, p000.n00 r21, boolean r22) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r18 = this;
            r8 = r18
            r1 = r19
            r7 = r21
            com.fasterxml.jackson.databind.SerializationConfig r0 = r19.getConfig()
            if (r22 != 0) goto L_0x0024
            boolean r2 = r20.useStaticType()
            if (r2 == 0) goto L_0x0024
            boolean r2 = r20.isContainerType()
            if (r2 == 0) goto L_0x0022
            com.fasterxml.jackson.databind.JavaType r2 = r20.getContentType()
            boolean r2 = r2.isJavaLangObject()
            if (r2 != 0) goto L_0x0024
        L_0x0022:
            r2 = 1
            goto L_0x0026
        L_0x0024:
            r2 = r22
        L_0x0026:
            com.fasterxml.jackson.databind.JavaType r3 = r20.getContentType()
            m17 r16 = r8.createTypeSerializer(r0, r3)
            if (r16 == 0) goto L_0x0031
            r2 = 0
        L_0x0031:
            r4 = r2
            com.fasterxml.jackson.databind.introspect.a r2 = r21.mo23462t()
            y63 r17 = r8._findContentSerializer(r1, r2)
            boolean r2 = r20.isMapLikeType()
            r3 = 0
            if (r2 == 0) goto L_0x00b2
            r2 = r20
            com.fasterxml.jackson.databind.type.MapLikeType r2 = (com.fasterxml.jackson.databind.type.MapLikeType) r2
            com.fasterxml.jackson.databind.introspect.a r5 = r21.mo23462t()
            y63 r5 = r8._findKeySerializer(r1, r5)
            boolean r6 = r2 instanceof com.fasterxml.jackson.databind.type.MapType
            if (r6 == 0) goto L_0x0062
            com.fasterxml.jackson.databind.type.MapType r2 = (com.fasterxml.jackson.databind.type.MapType) r2
            r0 = r18
            r1 = r19
            r3 = r21
            r6 = r16
            r7 = r17
            y63 r0 = r0.buildMapSerializer(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L_0x0062:
            java.lang.Iterable r4 = r18.customSerializers()
            java.util.Iterator r4 = r4.iterator()
        L_0x006a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0086
            java.lang.Object r3 = r4.next()
            r9 = r3
            ax5 r9 = (p000.ax5) r9
            r10 = r0
            r11 = r2
            r12 = r21
            r13 = r5
            r14 = r16
            r15 = r17
            y63 r3 = r9.findMapLikeSerializer(r10, r11, r12, r13, r14, r15)
            if (r3 == 0) goto L_0x006a
        L_0x0086:
            if (r3 != 0) goto L_0x008c
            y63 r3 = r18.findSerializerByAnnotations(r19, r20, r21)
        L_0x008c:
            if (r3 == 0) goto L_0x00b1
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r8._factoryConfig
            boolean r1 = r1.hasSerializerModifiers()
            if (r1 == 0) goto L_0x00b1
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r8._factoryConfig
            java.lang.Iterable r1 = r1.serializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a0:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00b1
            java.lang.Object r4 = r1.next()
            s00 r4 = (p000.s00) r4
            y63 r3 = r4.mo25575g(r0, r2, r7, r3)
            goto L_0x00a0
        L_0x00b1:
            return r3
        L_0x00b2:
            boolean r2 = r20.isCollectionLikeType()
            if (r2 == 0) goto L_0x0125
            r9 = r20
            com.fasterxml.jackson.databind.type.CollectionLikeType r9 = (com.fasterxml.jackson.databind.type.CollectionLikeType) r9
            boolean r2 = r9 instanceof com.fasterxml.jackson.databind.type.CollectionType
            if (r2 == 0) goto L_0x00d2
            r2 = r9
            com.fasterxml.jackson.databind.type.CollectionType r2 = (com.fasterxml.jackson.databind.type.CollectionType) r2
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r16
            r6 = r17
            y63 r0 = r0.buildCollectionSerializer(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x00d2:
            java.lang.Iterable r2 = r18.customSerializers()
            java.util.Iterator r10 = r2.iterator()
        L_0x00da:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00f8
            java.lang.Object r2 = r10.next()
            ax5 r2 = (p000.ax5) r2
            r3 = r0
            r4 = r9
            r5 = r21
            r6 = r16
            r11 = r7
            r7 = r17
            y63 r3 = r2.findCollectionLikeSerializer(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L_0x00f6
            goto L_0x00f9
        L_0x00f6:
            r7 = r11
            goto L_0x00da
        L_0x00f8:
            r11 = r7
        L_0x00f9:
            if (r3 != 0) goto L_0x00ff
            y63 r3 = r18.findSerializerByAnnotations(r19, r20, r21)
        L_0x00ff:
            if (r3 == 0) goto L_0x0124
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r8._factoryConfig
            boolean r1 = r1.hasSerializerModifiers()
            if (r1 == 0) goto L_0x0124
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r8._factoryConfig
            java.lang.Iterable r1 = r1.serializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x0113:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0124
            java.lang.Object r2 = r1.next()
            s00 r2 = (p000.s00) r2
            y63 r3 = r2.mo25571c(r0, r9, r11, r3)
            goto L_0x0113
        L_0x0124:
            return r3
        L_0x0125:
            r11 = r7
            boolean r0 = r20.isArrayType()
            if (r0 == 0) goto L_0x013f
            r2 = r20
            com.fasterxml.jackson.databind.type.ArrayType r2 = (com.fasterxml.jackson.databind.type.ArrayType) r2
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r16
            r6 = r17
            y63 r0 = r0.buildArraySerializer(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x013f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(zw5, com.fasterxml.jackson.databind.JavaType, n00, boolean):y63");
    }

    public y63<?> buildEnumSerializer(SerializationConfig serializationConfig, JavaType javaType, n00 n00) throws JsonMappingException {
        JsonFormat.Value g = n00.mo23449g((JsonFormat.Value) null);
        if (g.getShape() == JsonFormat.Shape.OBJECT) {
            ((C3563wz) n00).mo27629O("declaringClass");
            return null;
        }
        y63<?> construct = EnumSerializer.construct(javaType.getRawClass(), serializationConfig, n00, g);
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (s00 e : this._factoryConfig.serializerModifiers()) {
                construct = e.mo25573e(serializationConfig, javaType, n00, construct);
            }
        }
        return construct;
    }

    public y63<?> buildEnumSetSerializer(JavaType javaType) {
        return new EnumSetSerializer(javaType);
    }

    public ContainerSerializer<?> buildIndexedListSerializer(JavaType javaType, boolean z, m17 m17, y63<Object> y63) {
        return new IndexedListSerializer(javaType, z, m17, y63);
    }

    public y63<?> buildIterableSerializer(SerializationConfig serializationConfig, JavaType javaType, n00 n00, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IterableSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    public y63<?> buildIteratorSerializer(SerializationConfig serializationConfig, JavaType javaType, n00 n00, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IteratorSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    public y63<?> buildMapEntrySerializer(zw5 zw5, JavaType javaType, n00 n00, boolean z, JavaType javaType2, JavaType javaType3) throws JsonMappingException {
        JsonInclude.Include include;
        Object obj = null;
        if (JsonFormat.Value.merge(n00.mo23449g((JsonFormat.Value) null), zw5.getDefaultPropertyFormat(Map.Entry.class)).getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(javaType3, javaType2, javaType3, z, createTypeSerializer(zw5.getConfig(), javaType3), (BeanProperty) null);
        JavaType contentType = mapEntrySerializer.getContentType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(zw5, n00, contentType, Map.Entry.class);
        if (_findInclusionWithContent == null) {
            include = JsonInclude.Include.USE_DEFAULTS;
        } else {
            include = _findInclusionWithContent.getContentInclusion();
        }
        if (include == JsonInclude.Include.USE_DEFAULTS || include == JsonInclude.Include.ALWAYS) {
            return mapEntrySerializer;
        }
        int i = C2037a.f10096b[include.ordinal()];
        boolean z2 = true;
        if (i == 1) {
            obj = t00.m27231b(contentType);
            if (obj != null && obj.getClass().isArray()) {
                obj = C2103cq.m14359b(obj);
            }
        } else if (i != 2) {
            if (i == 3) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i == 4 && (obj = zw5.includeFilterInstance((q00) null, _findInclusionWithContent.getContentFilter())) != null) {
                z2 = zw5.includeFilterSuppressNulls(obj);
            }
        } else if (contentType.isReferenceType()) {
            obj = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapEntrySerializer.withContentInclusion(obj, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x001f A[LOOP:0: B:4:0x001f->B:7:0x003a, LOOP_START, PHI: r1 
      PHI: (r1v4 y63<?>) = (r1v3 y63<?>), (r1v20 y63<?>) binds: [B:3:0x0012, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<?> buildMapSerializer(p000.zw5 r20, com.fasterxml.jackson.databind.type.MapType r21, p000.n00 r22, boolean r23, p000.y63<java.lang.Object> r24, p000.m17 r25, p000.y63<java.lang.Object> r26) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r19 = this;
            r0 = r19
            r8 = r22
            r9 = 0
            com.fasterxml.jackson.annotation.JsonFormat$Value r1 = r8.mo23449g(r9)
            com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = r1.getShape()
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r1 != r2) goto L_0x0012
            return r9
        L_0x0012:
            com.fasterxml.jackson.databind.SerializationConfig r10 = r20.getConfig()
            java.lang.Iterable r1 = r19.customSerializers()
            java.util.Iterator r11 = r1.iterator()
            r1 = r9
        L_0x001f:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x003c
            java.lang.Object r1 = r11.next()
            ax5 r1 = (p000.ax5) r1
            r2 = r10
            r3 = r21
            r4 = r22
            r5 = r24
            r6 = r25
            r7 = r26
            y63 r1 = r1.findMapSerializer(r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x001f
        L_0x003c:
            if (r1 != 0) goto L_0x0081
            y63 r1 = r19.findSerializerByAnnotations(r20, r21, r22)
            if (r1 != 0) goto L_0x0081
            java.lang.Object r18 = r0.findFilterId(r10, r8)
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            com.fasterxml.jackson.databind.introspect.a r2 = r22.mo23462t()
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r1 = r10.getDefaultPropertyIgnorals(r1, r2)
            if (r1 != 0) goto L_0x0056
            r11 = r9
            goto L_0x005b
        L_0x0056:
            java.util.Set r1 = r1.findIgnoredForSerialization()
            r11 = r1
        L_0x005b:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            com.fasterxml.jackson.databind.introspect.a r2 = r22.mo23462t()
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r1 = r10.getDefaultPropertyInclusions(r1, r2)
            if (r1 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            java.util.Set r9 = r1.getIncluded()
        L_0x006c:
            r12 = r9
            r13 = r21
            r14 = r23
            r15 = r25
            r16 = r24
            r17 = r26
            com.fasterxml.jackson.databind.ser.std.MapSerializer r1 = com.fasterxml.jackson.databind.ser.std.MapSerializer.construct(r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = r20
            com.fasterxml.jackson.databind.ser.std.MapSerializer r1 = r0._checkMapContentInclusion(r2, r8, r1)
        L_0x0081:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r0._factoryConfig
            boolean r2 = r2.hasSerializerModifiers()
            if (r2 == 0) goto L_0x00a6
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r0._factoryConfig
            java.lang.Iterable r2 = r2.serializerModifiers()
            java.util.Iterator r2 = r2.iterator()
        L_0x0093:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00a6
            java.lang.Object r3 = r2.next()
            s00 r3 = (p000.s00) r3
            r4 = r21
            y63 r1 = r3.mo25576h(r10, r4, r8, r1)
            goto L_0x0093
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer(zw5, com.fasterxml.jackson.databind.type.MapType, n00, boolean, y63, m17, y63):y63");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001c A[LOOP:0: B:3:0x001c->B:6:0x002c, LOOP_START, PHI: r4 
      PHI: (r4v7 y63) = (r4v6 y63), (r4v10 y63) binds: [B:2:0x0011, B:6:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<java.lang.Object> createKeySerializer(p000.zw5 r7, com.fasterxml.jackson.databind.JavaType r8, p000.y63<java.lang.Object> r9) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r6 = this;
            com.fasterxml.jackson.databind.SerializationConfig r0 = r7.getConfig()
            n00 r1 = r0.introspect(r8)
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r6._factoryConfig
            boolean r2 = r2.hasKeySerializers()
            r3 = 0
            if (r2 == 0) goto L_0x002f
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r6._factoryConfig
            java.lang.Iterable r2 = r2.keySerializers()
            java.util.Iterator r2 = r2.iterator()
            r4 = r3
        L_0x001c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0030
            java.lang.Object r4 = r2.next()
            ax5 r4 = (p000.ax5) r4
            y63 r4 = r4.findSerializer(r0, r8, r1)
            if (r4 == 0) goto L_0x001c
            goto L_0x0030
        L_0x002f:
            r4 = r3
        L_0x0030:
            if (r4 != 0) goto L_0x0081
            com.fasterxml.jackson.databind.introspect.a r2 = r1.mo23462t()
            y63 r2 = r6._findKeySerializer(r7, r2)
            if (r2 != 0) goto L_0x007f
            if (r9 != 0) goto L_0x0082
            java.lang.Class r2 = r8.getRawClass()
            r4 = 0
            y63 r2 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.m14320b(r0, r2, r4)
            if (r2 != 0) goto L_0x007f
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r1.mo23451i()
            if (r2 != 0) goto L_0x0053
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r1.mo23452j()
        L_0x0053:
            if (r2 == 0) goto L_0x0076
            com.fasterxml.jackson.databind.JavaType r4 = r2.getType()
            y63 r7 = r6.createKeySerializer((p000.zw5) r7, (com.fasterxml.jackson.databind.JavaType) r4, (p000.y63<java.lang.Object>) r9)
            boolean r9 = r0.canOverrideAccessModifiers()
            if (r9 == 0) goto L_0x0070
            java.lang.reflect.Member r9 = r2.getMember()
            com.fasterxml.jackson.databind.MapperFeature r4 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r4 = r0.isEnabled(r4)
            p000.wf0.m29512g(r9, r4)
        L_0x0070:
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r9 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
            r9.<init>(r2, r3, r7)
            goto L_0x0082
        L_0x0076:
            java.lang.Class r7 = r8.getRawClass()
            y63 r9 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.m14319a(r0, r7)
            goto L_0x0082
        L_0x007f:
            r9 = r2
            goto L_0x0082
        L_0x0081:
            r9 = r4
        L_0x0082:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r7 = r6._factoryConfig
            boolean r7 = r7.hasSerializerModifiers()
            if (r7 == 0) goto L_0x00a5
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r7 = r6._factoryConfig
            java.lang.Iterable r7 = r7.serializerModifiers()
            java.util.Iterator r7 = r7.iterator()
        L_0x0094:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x00a5
            java.lang.Object r2 = r7.next()
            s00 r2 = (p000.s00) r2
            y63 r9 = r2.mo25574f(r0, r8, r1, r9)
            goto L_0x0094
        L_0x00a5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer(zw5, com.fasterxml.jackson.databind.JavaType, y63):y63");
    }

    public abstract y63<Object> createSerializer(zw5 zw5, JavaType javaType) throws JsonMappingException;

    public m17 createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) {
        Collection<NamedType> collection;
        C2021a t = serializationConfig.introspectClassAnnotations(javaType.getRawClass()).mo23462t();
        l17<?> findTypeResolver = serializationConfig.getAnnotationIntrospector().findTypeResolver(serializationConfig, t, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = serializationConfig.getDefaultTyper(javaType);
            collection = null;
        } else {
            collection = serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, t);
        }
        if (findTypeResolver == null) {
            return null;
        }
        return findTypeResolver.buildTypeSerializer(serializationConfig, javaType, collection);
    }

    public abstract Iterable<ax5> customSerializers();

    public ot0<Object, Object> findConverter(zw5 zw5, C2911nl nlVar) throws JsonMappingException {
        Object findSerializationConverter = zw5.getAnnotationIntrospector().findSerializationConverter(nlVar);
        if (findSerializationConverter == null) {
            return null;
        }
        return zw5.converterInstance(nlVar, findSerializationConverter);
    }

    public y63<?> findConvertingSerializer(zw5 zw5, C2911nl nlVar, y63<?> y63) throws JsonMappingException {
        ot0<Object, Object> findConverter = findConverter(zw5, nlVar);
        if (findConverter == null) {
            return y63;
        }
        return new StdDelegatingSerializer(findConverter, findConverter.mo23478c(zw5.getTypeFactory()), y63);
    }

    public Object findFilterId(SerializationConfig serializationConfig, n00 n00) {
        return serializationConfig.getAnnotationIntrospector().findFilterId(n00.mo23462t());
    }

    public y63<?> findOptionalStdSerializer(zw5 zw5, JavaType javaType, n00 n00, boolean z) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findSerializer(zw5.getConfig(), javaType, n00);
    }

    public y63<?> findReferenceSerializer(zw5 zw5, ReferenceType referenceType, n00 n00, boolean z) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        m17 m17 = (m17) contentType.getTypeHandler();
        SerializationConfig config = zw5.getConfig();
        if (m17 == null) {
            m17 = createTypeSerializer(config, contentType);
        }
        m17 m172 = m17;
        y63 y63 = (y63) contentType.getValueHandler();
        for (ax5 findReferenceSerializer : customSerializers()) {
            y63<?> findReferenceSerializer2 = findReferenceSerializer.findReferenceSerializer(config, referenceType, n00, m172, y63);
            if (findReferenceSerializer2 != null) {
                return findReferenceSerializer2;
            }
        }
        if (referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return buildAtomicReferenceSerializer(zw5, referenceType, n00, z, m172, y63);
        }
        return null;
    }

    public final y63<?> findSerializerByAddonType(SerializationConfig serializationConfig, JavaType javaType, n00 n00, boolean z) throws JsonMappingException {
        JavaType javaType2;
        JavaType javaType3;
        Class<?> rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            JavaType[] findTypeParameters = serializationConfig.getTypeFactory().findTypeParameters(javaType, (Class<?>) Iterator.class);
            if (findTypeParameters == null || findTypeParameters.length != 1) {
                javaType3 = TypeFactory.unknownType();
            } else {
                javaType3 = findTypeParameters[0];
            }
            return buildIteratorSerializer(serializationConfig, javaType, n00, z, javaType3);
        } else if (Iterable.class.isAssignableFrom(rawClass)) {
            JavaType[] findTypeParameters2 = serializationConfig.getTypeFactory().findTypeParameters(javaType, (Class<?>) Iterable.class);
            if (findTypeParameters2 == null || findTypeParameters2.length != 1) {
                javaType2 = TypeFactory.unknownType();
            } else {
                javaType2 = findTypeParameters2[0];
            }
            return buildIterableSerializer(serializationConfig, javaType, n00, z, javaType2);
        } else if (CharSequence.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        } else {
            return null;
        }
    }

    public final y63<?> findSerializerByAnnotations(zw5 zw5, JavaType javaType, n00 n00) throws JsonMappingException {
        if (w63.class.isAssignableFrom(javaType.getRawClass())) {
            return SerializableSerializer.instance;
        }
        AnnotatedMember j = n00.mo23452j();
        if (j == null) {
            return null;
        }
        if (zw5.canOverrideAccessModifiers()) {
            wf0.m29512g(j.getMember(), zw5.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        JavaType type = j.getType();
        y63<Object> findSerializerFromAnnotation = findSerializerFromAnnotation(zw5, j);
        if (findSerializerFromAnnotation == null) {
            findSerializerFromAnnotation = (y63) type.getValueHandler();
        }
        m17 m17 = (m17) type.getTypeHandler();
        if (m17 == null) {
            m17 = createTypeSerializer(zw5.getConfig(), type);
        }
        return new JsonValueSerializer(j, m17, findSerializerFromAnnotation);
    }

    public final y63<?> findSerializerByLookup(JavaType javaType, SerializationConfig serializationConfig, n00 n00, boolean z) {
        Class cls;
        String name = javaType.getRawClass().getName();
        y63<?> y63 = _concrete.get(name);
        if (y63 != null || (cls = _concreteLazy.get(name)) == null) {
            return y63;
        }
        return (y63) wf0.m29522l(cls, false);
    }

    public final y63<?> findSerializerByPrimaryType(zw5 zw5, JavaType javaType, n00 n00, boolean z) throws JsonMappingException {
        if (javaType.isEnumType()) {
            return buildEnumSerializer(zw5.getConfig(), javaType, n00);
        }
        Class<?> rawClass = javaType.getRawClass();
        y63<?> findOptionalStdSerializer = findOptionalStdSerializer(zw5, javaType, n00, z);
        if (findOptionalStdSerializer != null) {
            return findOptionalStdSerializer;
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return CalendarSerializer.instance;
        }
        if (Date.class.isAssignableFrom(rawClass)) {
            return DateSerializer.instance;
        }
        if (Map.Entry.class.isAssignableFrom(rawClass)) {
            JavaType findSuperType = javaType.findSuperType(Map.Entry.class);
            return buildMapEntrySerializer(zw5, javaType, n00, z, findSuperType.containedTypeOrUnknown(0), findSuperType.containedTypeOrUnknown(1));
        } else if (ByteBuffer.class.isAssignableFrom(rawClass)) {
            return new ByteBufferSerializer();
        } else {
            if (InetAddress.class.isAssignableFrom(rawClass)) {
                return new InetAddressSerializer();
            }
            if (InetSocketAddress.class.isAssignableFrom(rawClass)) {
                return new InetSocketAddressSerializer();
            }
            if (TimeZone.class.isAssignableFrom(rawClass)) {
                return new TimeZoneSerializer();
            }
            if (Charset.class.isAssignableFrom(rawClass)) {
                return ToStringSerializer.instance;
            }
            if (Number.class.isAssignableFrom(rawClass)) {
                int i = C2037a.f10095a[n00.mo23449g((JsonFormat.Value) null).getShape().ordinal()];
                if (i == 1) {
                    return ToStringSerializer.instance;
                }
                if (i == 2 || i == 3) {
                    return null;
                }
                return NumberSerializer.instance;
            } else if (ClassLoader.class.isAssignableFrom(rawClass)) {
                return new ToEmptyObjectSerializer(javaType);
            } else {
                return null;
            }
        }
    }

    public y63<Object> findSerializerFromAnnotation(zw5 zw5, C2911nl nlVar) throws JsonMappingException {
        Object findSerializer = zw5.getAnnotationIntrospector().findSerializer(nlVar);
        if (findSerializer == null) {
            return null;
        }
        return findConvertingSerializer(zw5, nlVar, zw5.serializerInstance(nlVar, findSerializer));
    }

    public SerializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public boolean isIndexedList(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    public boolean usesStaticTyping(SerializationConfig serializationConfig, n00 n00, m17 m17) {
        if (m17 != null) {
            return false;
        }
        JsonSerialize.Typing findSerializationTyping = serializationConfig.getAnnotationIntrospector().findSerializationTyping(n00.mo23462t());
        if (findSerializationTyping == null || findSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) {
            return serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
        }
        if (findSerializationTyping == JsonSerialize.Typing.STATIC) {
            return true;
        }
        return false;
    }

    public final yw5 withAdditionalKeySerializers(ax5 ax5) {
        return withConfig(this._factoryConfig.withAdditionalKeySerializers(ax5));
    }

    public final yw5 withAdditionalSerializers(ax5 ax5) {
        return withConfig(this._factoryConfig.withAdditionalSerializers(ax5));
    }

    public abstract yw5 withConfig(SerializerFactoryConfig serializerFactoryConfig);

    public final yw5 withSerializerModifier(s00 s00) {
        return withConfig(this._factoryConfig.withSerializerModifier(s00));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0017 A[LOOP:0: B:3:0x0017->B:6:0x0027, LOOP_START, PHI: r2 
      PHI: (r2v5 y63<?>) = (r2v0 y63<?>), (r2v8 y63<?>) binds: [B:2:0x000d, B:6:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<java.lang.Object> createKeySerializer(com.fasterxml.jackson.databind.SerializationConfig r5, com.fasterxml.jackson.databind.JavaType r6, p000.y63<java.lang.Object> r7) {
        /*
            r4 = this;
            n00 r0 = r5.introspect(r6)
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            boolean r1 = r1.hasKeySerializers()
            r2 = 0
            if (r1 == 0) goto L_0x0029
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            java.lang.Iterable r1 = r1.keySerializers()
            java.util.Iterator r1 = r1.iterator()
        L_0x0017:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0029
            java.lang.Object r2 = r1.next()
            ax5 r2 = (p000.ax5) r2
            y63 r2 = r2.findSerializer(r5, r6, r0)
            if (r2 == 0) goto L_0x0017
        L_0x0029:
            if (r2 != 0) goto L_0x0041
            if (r7 != 0) goto L_0x0042
            java.lang.Class r7 = r6.getRawClass()
            r1 = 0
            y63 r7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.m14320b(r5, r7, r1)
            if (r7 != 0) goto L_0x0042
            java.lang.Class r7 = r6.getRawClass()
            y63 r7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.m14319a(r5, r7)
            goto L_0x0042
        L_0x0041:
            r7 = r2
        L_0x0042:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            boolean r1 = r1.hasSerializerModifiers()
            if (r1 == 0) goto L_0x0065
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            java.lang.Iterable r1 = r1.serializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x0054:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0065
            java.lang.Object r2 = r1.next()
            s00 r2 = (p000.s00) r2
            y63 r7 = r2.mo25574f(r5, r6, r0, r7)
            goto L_0x0054
        L_0x0065:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, y63):y63");
    }

    public ContainerSerializer<?> buildCollectionSerializer(JavaType javaType, boolean z, m17 m17, y63<Object> y63) {
        return new CollectionSerializer(javaType, z, m17, y63);
    }
}
