package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class IntNode extends NumericNode {
    public static final int MAX_CANONICAL = 10;
    public static final int MIN_CANONICAL = -1;

    /* renamed from: a */
    public static final IntNode[] f10090a = new IntNode[12];
    public final int _value;

    static {
        for (int i = 0; i < 12; i++) {
            f10090a[i] = new IntNode(i - 1);
        }
    }

    public IntNode(int i) {
        this._value = i;
    }

    public static IntNode valueOf(int i) {
        if (i > 10 || i < -1) {
            return new IntNode(i);
        }
        return f10090a[i - -1];
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
        if (obj == null || !(obj instanceof IntNode)) {
            return false;
        }
        if (((IntNode) obj)._value == this._value) {
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

    public boolean isInt() {
        return true;
    }

    public boolean isIntegralNumber() {
        return true;
    }

    public long longValue() {
        return (long) this._value;
    }

    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.INT;
    }

    public Number numberValue() {
        return Integer.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13880h0(this._value);
    }

    public short shortValue() {
        return (short) this._value;
    }
}
