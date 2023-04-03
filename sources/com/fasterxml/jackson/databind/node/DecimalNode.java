package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class DecimalNode extends NumericNode {
    public static final DecimalNode ZERO = new DecimalNode(BigDecimal.ZERO);

    /* renamed from: a */
    public static final BigDecimal f10086a = BigDecimal.valueOf(-2147483648L);

    /* renamed from: d */
    public static final BigDecimal f10087d = BigDecimal.valueOf(2147483647L);

    /* renamed from: e */
    public static final BigDecimal f10088e = BigDecimal.valueOf(Long.MIN_VALUE);

    /* renamed from: g */
    public static final BigDecimal f10089g = BigDecimal.valueOf(Long.MAX_VALUE);
    public final BigDecimal _value;

    public DecimalNode(BigDecimal bigDecimal) {
        this._value = bigDecimal;
    }

    public static DecimalNode valueOf(BigDecimal bigDecimal) {
        return new DecimalNode(bigDecimal);
    }

    public String asText() {
        return this._value.toString();
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public BigInteger bigIntegerValue() {
        return this._value.toBigInteger();
    }

    public boolean canConvertToExactIntegral() {
        if (this._value.signum() == 0 || this._value.scale() <= 0 || this._value.stripTrailingZeros().scale() <= 0) {
            return true;
        }
        return false;
    }

    public boolean canConvertToInt() {
        if (this._value.compareTo(f10086a) < 0 || this._value.compareTo(f10087d) > 0) {
            return false;
        }
        return true;
    }

    public boolean canConvertToLong() {
        if (this._value.compareTo(f10088e) < 0 || this._value.compareTo(f10089g) > 0) {
            return false;
        }
        return true;
    }

    public BigDecimal decimalValue() {
        return this._value;
    }

    public double doubleValue() {
        return this._value.doubleValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof DecimalNode)) {
            return false;
        }
        if (((DecimalNode) obj)._value.compareTo(this._value) == 0) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return this._value.floatValue();
    }

    public int hashCode() {
        return Double.valueOf(doubleValue()).hashCode();
    }

    public int intValue() {
        return this._value.intValue();
    }

    public boolean isBigDecimal() {
        return true;
    }

    public boolean isFloatingPointNumber() {
        return true;
    }

    public long longValue() {
        return this._value.longValue();
    }

    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.BIG_DECIMAL;
    }

    public Number numberValue() {
        return this._value;
    }

    public final void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13886k0(this._value);
    }

    public short shortValue() {
        return this._value.shortValue();
    }
}
