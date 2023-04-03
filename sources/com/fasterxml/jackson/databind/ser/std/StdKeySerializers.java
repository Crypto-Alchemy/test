package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.impl.C2040a;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public abstract class StdKeySerializers {

    /* renamed from: a */
    public static final y63<Object> f10130a = new StdKeySerializer();

    /* renamed from: b */
    public static final y63<Object> f10131b = new StringKeySerializer();

    public static class Default extends StdSerializer<Object> {
        public static final int TYPE_BYTE_ARRAY = 7;
        public static final int TYPE_CALENDAR = 2;
        public static final int TYPE_CLASS = 3;
        public static final int TYPE_DATE = 1;
        public static final int TYPE_ENUM = 4;
        public static final int TYPE_INTEGER = 5;
        public static final int TYPE_LONG = 6;
        public static final int TYPE_TO_STRING = 8;
        public final int _typeId;

        public Default(int i, Class<?> cls) {
            super(cls, false);
            this._typeId = i;
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            String str;
            switch (this._typeId) {
                case 1:
                    zw5.defaultSerializeDateKey((Date) obj, jsonGenerator);
                    return;
                case 2:
                    zw5.defaultSerializeDateKey(((Calendar) obj).getTimeInMillis(), jsonGenerator);
                    return;
                case 3:
                    jsonGenerator.mo13864b0(((Class) obj).getName());
                    return;
                case 4:
                    if (zw5.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                        str = obj.toString();
                    } else {
                        Enum enumR = (Enum) obj;
                        if (zw5.isEnabled(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                            str = String.valueOf(enumR.ordinal());
                        } else {
                            str = enumR.name();
                        }
                    }
                    jsonGenerator.mo13864b0(str);
                    return;
                case 5:
                case 6:
                    jsonGenerator.mo13857X(((Number) obj).longValue());
                    return;
                case 7:
                    jsonGenerator.mo13864b0(zw5.getConfig().getBase64Variant().encode((byte[]) obj));
                    return;
                default:
                    jsonGenerator.mo13864b0(obj.toString());
                    return;
            }
        }
    }

    public static class Dynamic extends StdSerializer<Object> {
        public transient C2040a _dynamicSerializers = C2040a.m14286c();

        public Dynamic() {
            super(String.class, false);
        }

        public y63<Object> _findAndAddDynamic(C2040a aVar, Class<?> cls, zw5 zw5) throws JsonMappingException {
            if (cls == Object.class) {
                Default defaultR = new Default(8, cls);
                this._dynamicSerializers = aVar.mo16644j(cls, defaultR);
                return defaultR;
            }
            C2040a.C2044d e = aVar.mo16639e(cls, zw5, (BeanProperty) null);
            C2040a aVar2 = e.f10110b;
            if (aVar != aVar2) {
                this._dynamicSerializers = aVar2;
            }
            return e.f10109a;
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            visitStringFormat(t43, javaType);
        }

        public Object readResolve() {
            this._dynamicSerializers = C2040a.m14286c();
            return this;
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            Class<?> cls = obj.getClass();
            C2040a aVar = this._dynamicSerializers;
            y63<Object> k = aVar.mo16645k(cls);
            if (k == null) {
                k = _findAndAddDynamic(aVar, cls, zw5);
            }
            k.serialize(obj, jsonGenerator, zw5);
        }
    }

    public static class EnumKeySerializer extends StdSerializer<Object> {
        public final EnumValues _values;

        public EnumKeySerializer(Class<?> cls, EnumValues enumValues) {
            super(cls, false);
            this._values = enumValues;
        }

        public static EnumKeySerializer construct(Class<?> cls, EnumValues enumValues) {
            return new EnumKeySerializer(cls, enumValues);
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            if (zw5.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                jsonGenerator.mo13864b0(obj.toString());
                return;
            }
            Enum enumR = (Enum) obj;
            if (zw5.isEnabled(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                jsonGenerator.mo13864b0(String.valueOf(enumR.ordinal()));
            } else {
                jsonGenerator.mo13858Y(this._values.serializedValueFor(enumR));
            }
        }
    }

    public static class StringKeySerializer extends StdSerializer<Object> {
        public StringKeySerializer() {
            super(String.class, false);
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            jsonGenerator.mo13864b0((String) obj);
        }
    }

    /* renamed from: a */
    public static y63<Object> m14319a(SerializationConfig serializationConfig, Class<?> cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new Dynamic();
            }
            if (wf0.m29485L(cls)) {
                return EnumKeySerializer.construct(cls, EnumValues.constructFromName(serializationConfig, cls));
            }
        }
        return new Default(8, cls);
    }

    /* renamed from: b */
    public static y63<Object> m14320b(SerializationConfig serializationConfig, Class<?> cls, boolean z) {
        if (cls == null || cls == Object.class) {
            return new Dynamic();
        }
        if (cls == String.class) {
            return f10131b;
        }
        if (cls.isPrimitive()) {
            cls = wf0.m29529o0(cls);
        }
        if (cls == Integer.class) {
            return new Default(5, cls);
        }
        if (cls == Long.class) {
            return new Default(6, cls);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new Default(8, cls);
        }
        if (cls == Class.class) {
            return new Default(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new Default(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new Default(2, cls);
        }
        if (cls == UUID.class) {
            return new Default(8, cls);
        }
        if (cls == byte[].class) {
            return new Default(7, cls);
        }
        if (z) {
            return new Default(8, cls);
        }
        return null;
    }
}
