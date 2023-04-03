package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.C2021a;
import com.fasterxml.jackson.databind.ser.impl.C2040a;

public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter {
    private static final long serialVersionUID = 1;

    public VirtualBeanPropertyWriter(q00 q00, C2236em emVar, JavaType javaType) {
        this(q00, emVar, javaType, (y63<?>) null, (m17) null, (JavaType) null, q00.mo24879e());
    }

    public static boolean _suppressNulls(JsonInclude.Value value) {
        JsonInclude.Include valueInclusion;
        if (value == null || (valueInclusion = value.getValueInclusion()) == JsonInclude.Include.ALWAYS || valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
            return false;
        }
        return true;
    }

    public static Object _suppressableValue(JsonInclude.Value value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        JsonInclude.Include valueInclusion = value.getValueInclusion();
        if (valueInclusion == JsonInclude.Include.ALWAYS || valueInclusion == JsonInclude.Include.NON_NULL || valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
            return null;
        }
        return BeanPropertyWriter.MARKER_FOR_EMPTY;
    }

    public boolean isVirtual() {
        return true;
    }

    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        Object value = value(obj, jsonGenerator, zw5);
        if (value == null) {
            y63<Object> y63 = this._nullSerializer;
            if (y63 != null) {
                y63.serialize(null, jsonGenerator, zw5);
            } else {
                jsonGenerator.mo13866c0();
            }
        } else {
            y63<Object> y632 = this._serializer;
            if (y632 == null) {
                Class<?> cls = value.getClass();
                C2040a aVar = this._dynamicSerializers;
                y63<Object> k = aVar.mo16645k(cls);
                if (k == null) {
                    y632 = _findAndAddDynamic(aVar, cls, zw5);
                } else {
                    y632 = k;
                }
            }
            Object obj2 = this._suppressableValue;
            if (obj2 != null) {
                if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                    if (y632.isEmpty(zw5, value)) {
                        serializeAsPlaceholder(obj, jsonGenerator, zw5);
                        return;
                    }
                } else if (obj2.equals(value)) {
                    serializeAsPlaceholder(obj, jsonGenerator, zw5);
                    return;
                }
            }
            if (value != obj || !_handleSelfReference(obj, jsonGenerator, zw5, y632)) {
                m17 m17 = this._typeSerializer;
                if (m17 == null) {
                    y632.serialize(value, jsonGenerator, zw5);
                } else {
                    y632.serializeWithType(value, jsonGenerator, zw5, m17);
                }
            }
        }
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        Object value = value(obj, jsonGenerator, zw5);
        if (value != null) {
            y63<Object> y63 = this._serializer;
            if (y63 == null) {
                Class<?> cls = value.getClass();
                C2040a aVar = this._dynamicSerializers;
                y63<Object> k = aVar.mo16645k(cls);
                if (k == null) {
                    y63 = _findAndAddDynamic(aVar, cls, zw5);
                } else {
                    y63 = k;
                }
            }
            Object obj2 = this._suppressableValue;
            if (obj2 != null) {
                if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                    if (y63.isEmpty(zw5, value)) {
                        return;
                    }
                } else if (obj2.equals(value)) {
                    return;
                }
            }
            if (value != obj || !_handleSelfReference(obj, jsonGenerator, zw5, y63)) {
                jsonGenerator.mo13858Y(this._name);
                m17 m17 = this._typeSerializer;
                if (m17 == null) {
                    y63.serialize(value, jsonGenerator, zw5);
                } else {
                    y63.serializeWithType(value, jsonGenerator, zw5, m17);
                }
            }
        } else if (this._nullSerializer != null) {
            jsonGenerator.mo13858Y(this._name);
            this._nullSerializer.serialize(null, jsonGenerator, zw5);
        }
    }

    public abstract Object value(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception;

    public abstract VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, C2021a aVar, q00 q00, JavaType javaType);

    public VirtualBeanPropertyWriter() {
    }

    public VirtualBeanPropertyWriter(q00 q00, C2236em emVar, JavaType javaType, y63<?> y63, m17 m17, JavaType javaType2, JsonInclude.Value value, Class<?>[] clsArr) {
        super(q00, q00.mo24894v(), emVar, javaType, y63, m17, javaType2, _suppressNulls(value), _suppressableValue(value), clsArr);
    }

    @Deprecated
    public VirtualBeanPropertyWriter(q00 q00, C2236em emVar, JavaType javaType, y63<?> y63, m17 m17, JavaType javaType2, JsonInclude.Value value) {
        this(q00, emVar, javaType, y63, m17, javaType2, value, (Class<?>[]) null);
    }

    public VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualBeanPropertyWriter) {
        super(virtualBeanPropertyWriter);
    }

    public VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualBeanPropertyWriter, PropertyName propertyName) {
        super((BeanPropertyWriter) virtualBeanPropertyWriter, propertyName);
    }
}
