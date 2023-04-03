package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

@zz2
public class NumberSerializer extends StdScalarSerializer<Number> implements ls0 {
    public static final int MAX_BIG_DECIMAL_SCALE = 9999;
    public static final NumberSerializer instance = new NumberSerializer(Number.class);
    public final boolean _isInt;

    public static final class BigDecimalAsStringSerializer extends ToStringSerializerBase {
        public static final BigDecimalAsStringSerializer BD_INSTANCE = new BigDecimalAsStringSerializer();

        public BigDecimalAsStringSerializer() {
            super(BigDecimal.class);
        }

        public boolean _verifyBigDecimalRange(JsonGenerator jsonGenerator, BigDecimal bigDecimal) throws IOException {
            int scale = bigDecimal.scale();
            if (scale < -9999 || scale > 9999) {
                return false;
            }
            return true;
        }

        public boolean isEmpty(zw5 zw5, Object obj) {
            return false;
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            String str;
            if (jsonGenerator.mo13889m(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (!_verifyBigDecimalRange(jsonGenerator, bigDecimal)) {
                    zw5.reportMappingProblem(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(bigDecimal.scale()), Integer.valueOf(NumberSerializer.MAX_BIG_DECIMAL_SCALE), Integer.valueOf(NumberSerializer.MAX_BIG_DECIMAL_SCALE)}), new Object[0]);
                }
                str = bigDecimal.toPlainString();
            } else {
                str = obj.toString();
            }
            jsonGenerator.mo13860Z0(str);
        }

        public String valueToString(Object obj) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializer$a */
    public static /* synthetic */ class C2050a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10120a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f10120a = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NumberSerializer(Class<? extends Number> cls) {
        super(cls, false);
        boolean z = false;
        this._isInt = cls == BigInteger.class ? true : z;
    }

    public static y63<?> bigDecimalAsStringSerializer() {
        return BigDecimalAsStringSerializer.BD_INSTANCE;
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        if (this._isInt) {
            visitIntFormat(t43, javaType, JsonParser.NumberType.BIG_INTEGER);
        } else if (handledType() == BigDecimal.class) {
            visitFloatFormat(t43, javaType, JsonParser.NumberType.BIG_DECIMAL);
        } else {
            t43.mo26058k(javaType);
        }
    }

    public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(zw5, beanProperty, handledType());
        if (findFormatOverrides == null || C2050a.f10120a[findFormatOverrides.getShape().ordinal()] != 1) {
            return this;
        }
        if (handledType() == BigDecimal.class) {
            return bigDecimalAsStringSerializer();
        }
        return ToStringSerializer.instance;
    }

    public g53 getSchema(zw5 zw5, Type type) {
        String str;
        if (this._isInt) {
            str = "integer";
        } else {
            str = "number";
        }
        return createSchemaNode(str, true);
    }

    public void serialize(Number number, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (number instanceof BigDecimal) {
            jsonGenerator.mo13886k0((BigDecimal) number);
        } else if (number instanceof BigInteger) {
            jsonGenerator.mo13888l0((BigInteger) number);
        } else if (number instanceof Long) {
            jsonGenerator.mo13882i0(number.longValue());
        } else if (number instanceof Double) {
            jsonGenerator.mo13872e0(number.doubleValue());
        } else if (number instanceof Float) {
            jsonGenerator.mo13877g0(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.mo13880h0(number.intValue());
        } else {
            jsonGenerator.mo13884j0(number.toString());
        }
    }
}
