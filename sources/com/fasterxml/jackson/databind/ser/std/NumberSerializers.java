package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;

public class NumberSerializers {

    public static abstract class Base<T> extends StdScalarSerializer<T> implements ls0 {
        public final boolean _isInt;
        public final JsonParser.NumberType _numberType;
        public final String _schemaType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Base(Class<?> cls, JsonParser.NumberType numberType, String str) {
            super(cls, false);
            boolean z = false;
            this._numberType = numberType;
            this._schemaType = str;
            this._isInt = (numberType == JsonParser.NumberType.INT || numberType == JsonParser.NumberType.LONG || numberType == JsonParser.NumberType.BIG_INTEGER) ? true : z;
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            if (this._isInt) {
                visitIntFormat(t43, javaType, this._numberType);
            } else {
                visitFloatFormat(t43, javaType, this._numberType);
            }
        }

        public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
            JsonFormat.Value findFormatOverrides = findFormatOverrides(zw5, beanProperty, handledType());
            if (findFormatOverrides == null || C2051a.f10121a[findFormatOverrides.getShape().ordinal()] != 1) {
                return this;
            }
            if (handledType() == BigDecimal.class) {
                return NumberSerializer.bigDecimalAsStringSerializer();
            }
            return ToStringSerializer.instance;
        }

        public g53 getSchema(zw5 zw5, Type type) {
            return createSchemaNode(this._schemaType, true);
        }
    }

    @zz2
    public static class DoubleSerializer extends Base<Object> {
        public DoubleSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.DOUBLE, "number");
        }

        @Deprecated
        public static boolean notFinite(double d) {
            return lc4.m21387o(d);
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            jsonGenerator.mo13872e0(((Double) obj).doubleValue());
        }

        public void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
            Double d = (Double) obj;
            if (lc4.m21387o(d.doubleValue())) {
                WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(obj, JsonToken.VALUE_NUMBER_FLOAT));
                jsonGenerator.mo13872e0(d.doubleValue());
                m17.mo16713h(jsonGenerator, g);
                return;
            }
            jsonGenerator.mo13872e0(d.doubleValue());
        }
    }

    @zz2
    public static class FloatSerializer extends Base<Object> {
        public static final FloatSerializer instance = new FloatSerializer();

        public FloatSerializer() {
            super(Float.class, JsonParser.NumberType.FLOAT, "number");
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            jsonGenerator.mo13877g0(((Float) obj).floatValue());
        }
    }

    @zz2
    public static class IntLikeSerializer extends Base<Object> {
        public static final IntLikeSerializer instance = new IntLikeSerializer();

        public IntLikeSerializer() {
            super(Number.class, JsonParser.NumberType.INT, "integer");
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            jsonGenerator.mo13880h0(((Number) obj).intValue());
        }
    }

    @zz2
    public static class IntegerSerializer extends Base<Object> {
        public IntegerSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.INT, "integer");
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            jsonGenerator.mo13880h0(((Integer) obj).intValue());
        }

        public void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
            serialize(obj, jsonGenerator, zw5);
        }
    }

    @zz2
    public static class LongSerializer extends Base<Object> {
        public LongSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.LONG, "number");
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            jsonGenerator.mo13882i0(((Long) obj).longValue());
        }
    }

    @zz2
    public static class ShortSerializer extends Base<Object> {
        public static final ShortSerializer instance = new ShortSerializer();

        public ShortSerializer() {
            super(Short.class, JsonParser.NumberType.INT, "number");
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            jsonGenerator.mo13891o0(((Short) obj).shortValue());
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializers$a */
    public static /* synthetic */ class C2051a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10121a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f10121a = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m14313a(Map<String, y63<?>> map) {
        Class<Double> cls = Double.class;
        Class<Long> cls2 = Long.class;
        Class<Integer> cls3 = Integer.class;
        map.put(cls3.getName(), new IntegerSerializer(cls3));
        Class cls4 = Integer.TYPE;
        map.put(cls4.getName(), new IntegerSerializer(cls4));
        map.put(cls2.getName(), new LongSerializer(cls2));
        Class cls5 = Long.TYPE;
        map.put(cls5.getName(), new LongSerializer(cls5));
        String name = Byte.class.getName();
        IntLikeSerializer intLikeSerializer = IntLikeSerializer.instance;
        map.put(name, intLikeSerializer);
        map.put(Byte.TYPE.getName(), intLikeSerializer);
        String name2 = Short.class.getName();
        ShortSerializer shortSerializer = ShortSerializer.instance;
        map.put(name2, shortSerializer);
        map.put(Short.TYPE.getName(), shortSerializer);
        map.put(cls.getName(), new DoubleSerializer(cls));
        map.put(Double.TYPE.getName(), new DoubleSerializer(Double.TYPE));
        String name3 = Float.class.getName();
        FloatSerializer floatSerializer = FloatSerializer.instance;
        map.put(name3, floatSerializer);
        map.put(Float.TYPE.getName(), floatSerializer);
    }
}
