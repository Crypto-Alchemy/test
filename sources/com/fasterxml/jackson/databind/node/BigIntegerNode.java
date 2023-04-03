package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerNode extends NumericNode {

    /* renamed from: a */
    public static final BigInteger f10082a = BigInteger.valueOf(-2147483648L);

    /* renamed from: d */
    public static final BigInteger f10083d = BigInteger.valueOf(2147483647L);

    /* renamed from: e */
    public static final BigInteger f10084e = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: g */
    public static final BigInteger f10085g = BigInteger.valueOf(Long.MAX_VALUE);
    public final BigInteger _value;

    public BigIntegerNode(BigInteger bigInteger) {
        this._value = bigInteger;
    }

    public static BigIntegerNode valueOf(BigInteger bigInteger) {
        return new BigIntegerNode(bigInteger);
    }

    public boolean asBoolean(boolean z) {
        return !BigInteger.ZERO.equals(this._value);
    }

    public String asText() {
        return this._value.toString();
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public BigInteger bigIntegerValue() {
        return this._value;
    }

    public boolean canConvertToInt() {
        if (this._value.compareTo(f10082a) < 0 || this._value.compareTo(f10083d) > 0) {
            return false;
        }
        return true;
    }

    public boolean canConvertToLong() {
        if (this._value.compareTo(f10084e) < 0 || this._value.compareTo(f10085g) > 0) {
            return false;
        }
        return true;
    }

    public BigDecimal decimalValue() {
        return new BigDecimal(this._value);
    }

    public double doubleValue() {
        return this._value.doubleValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BigIntegerNode)) {
            return ((BigIntegerNode) obj)._value.equals(this._value);
        }
        return false;
    }

    public float floatValue() {
        return this._value.floatValue();
    }

    public int hashCode() {
        return this._value.hashCode();
    }

    public int intValue() {
        return this._value.intValue();
    }

    public boolean isBigInteger() {
        return true;
    }

    public boolean isIntegralNumber() {
        return true;
    }

    public long longValue() {
        return this._value.longValue();
    }

    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.BIG_INTEGER;
    }

    public Number numberValue() {
        return this._value;
    }

    public final void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13888l0(this._value);
    }

    public short shortValue() {
        return this._value.shortValue();
    }
}
