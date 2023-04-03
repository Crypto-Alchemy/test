package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.C2040a;
import java.io.IOException;
import java.util.Map;

@zz2
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements ls0 {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    public C2040a _dynamicValueSerializers;
    public final JavaType _entryType;
    public y63<Object> _keySerializer;
    public final JavaType _keyType;
    public final BeanProperty _property;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public y63<Object> _valueSerializer;
    public final JavaType _valueType;
    public final boolean _valueTypeIsStatic;
    public final m17 _valueTypeSerializer;

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer$a */
    public static /* synthetic */ class C2038a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10097a;

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
                f10097a = r0
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10097a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10097a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10097a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10097a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10097a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.C2038a.<clinit>():void");
        }
    }

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z, m17 m17, BeanProperty beanProperty) {
        super(javaType);
        this._entryType = javaType;
        this._keyType = javaType2;
        this._valueType = javaType3;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = m17;
        this._property = beanProperty;
        this._dynamicValueSerializers = C2040a.m14286c();
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    public final y63<Object> _findAndAddDynamic(C2040a aVar, Class<?> cls, zw5 zw5) throws JsonMappingException {
        C2040a.C2044d i = aVar.mo16643i(cls, zw5, this._property);
        C2040a aVar2 = i.f10110b;
        if (aVar != aVar2) {
            this._dynamicValueSerializers = aVar2;
        }
        return i.f10109a;
    }

    public ContainerSerializer<?> _withValueTypeSerializer(m17 m17) {
        return new MapEntrySerializer(this, this._property, m17, this._keySerializer, this._valueSerializer, this._suppressableValue, this._suppressNulls);
    }

    public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember annotatedMember;
        y63 y63;
        y63 y632;
        y63 y633;
        boolean z;
        Object obj;
        JsonInclude.Value findPropertyInclusion;
        JsonInclude.Include contentInclusion;
        boolean includeFilterSuppressNulls;
        AnnotationIntrospector annotationIntrospector = zw5.getAnnotationIntrospector();
        Object obj2 = null;
        if (beanProperty == null) {
            annotatedMember = null;
        } else {
            annotatedMember = beanProperty.getMember();
        }
        if (annotatedMember == null || annotationIntrospector == null) {
            y632 = null;
            y63 = null;
        } else {
            Object findKeySerializer = annotationIntrospector.findKeySerializer(annotatedMember);
            if (findKeySerializer != null) {
                y63 = zw5.serializerInstance(annotatedMember, findKeySerializer);
            } else {
                y63 = null;
            }
            Object findContentSerializer = annotationIntrospector.findContentSerializer(annotatedMember);
            if (findContentSerializer != null) {
                y632 = zw5.serializerInstance(annotatedMember, findContentSerializer);
            } else {
                y632 = null;
            }
        }
        if (y632 == null) {
            y632 = this._valueSerializer;
        }
        y63 findContextualConvertingSerializer = findContextualConvertingSerializer(zw5, beanProperty, y632);
        if (findContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            findContextualConvertingSerializer = zw5.findContentValueSerializer(this._valueType, beanProperty);
        }
        y63 y634 = findContextualConvertingSerializer;
        if (y63 == null) {
            y63 = this._keySerializer;
        }
        if (y63 == null) {
            y633 = zw5.findKeySerializer(this._keyType, beanProperty);
        } else {
            y633 = zw5.handleSecondaryContextualization(y63, beanProperty);
        }
        y63 y635 = y633;
        Object obj3 = this._suppressableValue;
        boolean z2 = this._suppressNulls;
        if (beanProperty == null || (findPropertyInclusion = beanProperty.findPropertyInclusion(zw5.getConfig(), (Class<?>) null)) == null || (contentInclusion = findPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            obj = obj3;
            z = z2;
        } else {
            int i = C2038a.f10097a[contentInclusion.ordinal()];
            if (i == 1) {
                obj2 = t00.m27231b(this._valueType);
                if (obj2 != null && obj2.getClass().isArray()) {
                    obj2 = C2103cq.m14359b(obj2);
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        obj2 = zw5.includeFilterInstance((q00) null, findPropertyInclusion.getContentFilter());
                        if (obj2 != null) {
                            includeFilterSuppressNulls = zw5.includeFilterSuppressNulls(obj2);
                        }
                    } else if (i != 5) {
                        includeFilterSuppressNulls = false;
                    }
                    z = includeFilterSuppressNulls;
                    obj = obj2;
                } else {
                    obj2 = MARKER_FOR_EMPTY;
                }
            } else if (this._valueType.isReferenceType()) {
                obj2 = MARKER_FOR_EMPTY;
            }
            obj = obj2;
            z = true;
        }
        return withResolved(beanProperty, y635, y634, obj, z);
    }

    public y63<?> getContentSerializer() {
        return this._valueSerializer;
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    public boolean hasSingleElement(Map.Entry<?, ?> entry) {
        return true;
    }

    public void serializeDynamic(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        y63<Object> y63;
        y63<Object> y632;
        m17 m17 = this._valueTypeSerializer;
        Object key = entry.getKey();
        if (key == null) {
            y63 = zw5.findNullKeySerializer(this._keyType, this._property);
        } else {
            y63 = this._keySerializer;
        }
        Object value = entry.getValue();
        if (value != null) {
            y632 = this._valueSerializer;
            if (y632 == null) {
                Class<?> cls = value.getClass();
                y63<Object> k = this._dynamicValueSerializers.mo16645k(cls);
                if (k != null) {
                    y632 = k;
                } else if (this._valueType.hasGenericTypes()) {
                    y632 = _findAndAddDynamic(this._dynamicValueSerializers, zw5.constructSpecializedType(this._valueType, cls), zw5);
                } else {
                    y632 = _findAndAddDynamic(this._dynamicValueSerializers, cls, zw5);
                }
            }
            Object obj = this._suppressableValue;
            if (obj != null && ((obj == MARKER_FOR_EMPTY && y632.isEmpty(zw5, value)) || this._suppressableValue.equals(value))) {
                return;
            }
        } else if (!this._suppressNulls) {
            y632 = zw5.getDefaultNullValueSerializer();
        } else {
            return;
        }
        y63.serialize(key, jsonGenerator, zw5);
        if (m17 == null) {
            try {
                y632.serialize(value, jsonGenerator, zw5);
            } catch (Exception e) {
                wrapAndThrow(zw5, (Throwable) e, (Object) entry, "" + key);
            }
        } else {
            y632.serializeWithType(value, jsonGenerator, zw5, m17);
        }
    }

    public MapEntrySerializer withContentInclusion(Object obj, boolean z) {
        if (this._suppressableValue == obj && this._suppressNulls == z) {
            return this;
        }
        return new MapEntrySerializer(this, this._property, this._valueTypeSerializer, this._keySerializer, this._valueSerializer, obj, z);
    }

    public MapEntrySerializer withResolved(BeanProperty beanProperty, y63<?> y63, y63<?> y632, Object obj, boolean z) {
        return new MapEntrySerializer(this, beanProperty, this._valueTypeSerializer, y63, y632, obj, z);
    }

    public boolean isEmpty(zw5 zw5, Map.Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        y63<Object> y63 = this._valueSerializer;
        if (y63 == null) {
            Class<?> cls = value.getClass();
            y63<Object> k = this._dynamicValueSerializers.mo16645k(cls);
            if (k == null) {
                try {
                    y63 = _findAndAddDynamic(this._dynamicValueSerializers, cls, zw5);
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                y63 = k;
            }
        }
        Object obj = this._suppressableValue;
        if (obj == MARKER_FOR_EMPTY) {
            return y63.isEmpty(zw5, value);
        }
        return obj.equals(value);
    }

    public void serialize(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13854S0(entry);
        serializeDynamic(entry, jsonGenerator, zw5);
        jsonGenerator.mo13855W();
    }

    public void serializeWithType(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        jsonGenerator.mo13895s(entry);
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(entry, JsonToken.START_OBJECT));
        serializeDynamic(entry, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }

    public final y63<Object> _findAndAddDynamic(C2040a aVar, JavaType javaType, zw5 zw5) throws JsonMappingException {
        C2040a.C2044d h = aVar.mo16642h(javaType, zw5, this._property);
        C2040a aVar2 = h.f10110b;
        if (aVar != aVar2) {
            this._dynamicValueSerializers = aVar2;
        }
        return h.f10109a;
    }

    @Deprecated
    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, m17 m17, y63<?> y63, y63<?> y632) {
        this(mapEntrySerializer, beanProperty, m17, y63, y632, mapEntrySerializer._suppressableValue, mapEntrySerializer._suppressNulls);
    }

    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, m17 m17, y63<?> y63, y63<?> y632, Object obj, boolean z) {
        super(Map.class, false);
        this._entryType = mapEntrySerializer._entryType;
        this._keyType = mapEntrySerializer._keyType;
        this._valueType = mapEntrySerializer._valueType;
        this._valueTypeIsStatic = mapEntrySerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapEntrySerializer._valueTypeSerializer;
        this._keySerializer = y63;
        this._valueSerializer = y632;
        this._dynamicValueSerializers = C2040a.m14286c();
        this._property = mapEntrySerializer._property;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }
}
