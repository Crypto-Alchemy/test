package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FloatNode extends NumericNode {
    public final float _value;

    public FloatNode(float f) {
        this._value = f;
    }

    public static FloatNode valueOf(float f) {
        return new FloatNode(f);
    }

    public String asText() {
        return lc4.m21394v(this._value);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }

    public boolean canConvertToExactIntegral() {
        if (!Float.isNaN(this._value) && !Float.isInfinite(this._value)) {
            float f = this._value;
            if (f == ((float) Math.round(f))) {
                return true;
            }
        }
        return false;
    }

    public boolean canConvertToInt() {
        float f = this._value;
        if (f < -2.14748365E9f || f > 2.14748365E9f) {
            return false;
        }
        return true;
    }

    public boolean canConvertToLong() {
        float f = this._value;
        if (f < -9.223372E18f || f > 9.223372E18f) {
            return false;
        }
        return true;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf((double) this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatNode)) {
            return false;
        }
        if (Float.compare(this._value, ((FloatNode) obj)._value) == 0) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return this._value;
    }

    public int hashCode() {
        return Float.floatToIntBits(this._value);
    }

    public int intValue() {
        return (int) this._value;
    }

    public boolean isFloat() {
        return true;
    }

    public boolean isFloatingPointNumber() {
        return true;
    }

    public boolean isNaN() {
        if (Float.isNaN(this._value) || Float.isInfinite(this._value)) {
            return true;
        }
        return false;
    }

    public long longValue() {
        return (long) this._value;
    }

    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.FLOAT;
    }

    public Number numberValue() {
        return Float.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13877g0(this._value);
    }

    public short shortValue() {
        return (short) ((int) this._value);
    }
}
