package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ShortNode extends NumericNode {
    public final short _value;

    public ShortNode(short s) {
        this._value = s;
    }

    public static ShortNode valueOf(short s) {
        return new ShortNode(s);
    }

    public boolean asBoolean(boolean z) {
        if (this._value != 0) {
            return true;
        }
        return false;
    }

    public String asText() {
        return lc4.m21395w(this._value);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf((long) this._value);
    }

    public boolean canConvertToInt() {
        return true;
    }

    public boolean canConvertToLong() {
        return true;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf((long) this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ShortNode)) {
            return false;
        }
        if (((ShortNode) obj)._value == this._value) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return (float) this._value;
    }

    public int hashCode() {
        return this._value;
    }

    public int intValue() {
        return this._value;
    }

    public boolean isIntegralNumber() {
        return true;
    }

    public boolean isShort() {
        return true;
    }

    public long longValue() {
        return (long) this._value;
    }

    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.INT;
    }

    public Number numberValue() {
        return Short.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13891o0(this._value);
    }

    public short shortValue() {
        return this._value;
    }
}
