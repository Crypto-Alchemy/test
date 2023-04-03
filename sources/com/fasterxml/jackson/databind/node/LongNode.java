package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class LongNode extends NumericNode {
    public final long _value;

    public LongNode(long j) {
        this._value = j;
    }

    public static LongNode valueOf(long j) {
        return new LongNode(j);
    }

    public boolean asBoolean(boolean z) {
        if (this._value != 0) {
            return true;
        }
        return false;
    }

    public String asText() {
        return lc4.m21396x(this._value);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(this._value);
    }

    public boolean canConvertToInt() {
        long j = this._value;
        if (j < -2147483648L || j > 2147483647L) {
            return false;
        }
        return true;
    }

    public boolean canConvertToLong() {
        return true;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof LongNode)) {
            return false;
        }
        if (((LongNode) obj)._value == this._value) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return (float) this._value;
    }

    public int hashCode() {
        long j = this._value;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    public int intValue() {
        return (int) this._value;
    }

    public boolean isIntegralNumber() {
        return true;
    }

    public boolean isLong() {
        return true;
    }

    public long longValue() {
        return this._value;
    }

    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.LONG;
    }

    public Number numberValue() {
        return Long.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13882i0(this._value);
    }

    public short shortValue() {
        return (short) ((int) this._value);
    }
}
