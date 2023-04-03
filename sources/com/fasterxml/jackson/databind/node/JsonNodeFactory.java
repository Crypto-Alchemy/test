package com.fasterxml.jackson.databind.node;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonNodeFactory implements Serializable {

    /* renamed from: a */
    public static final JsonNodeFactory f10091a;

    /* renamed from: d */
    public static final JsonNodeFactory f10092d = new JsonNodeFactory(true);
    public static final JsonNodeFactory instance;
    private static final long serialVersionUID = 1;
    private final boolean _cfgBigDecimalExact;

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        f10091a = jsonNodeFactory;
        instance = jsonNodeFactory;
    }

    public JsonNodeFactory(boolean z) {
        this._cfgBigDecimalExact = z;
    }

    public static JsonNodeFactory withExactBigDecimals(boolean z) {
        if (z) {
            return f10092d;
        }
        return f10091a;
    }

    public boolean _inIntRange(long j) {
        return ((long) ((int) j)) == j;
    }

    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    public g53 missingNode() {
        return MissingNode.getInstance();
    }

    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    public ValueNode rawValueNode(l75 l75) {
        return new POJONode(l75);
    }

    public ArrayNode arrayNode(int i) {
        return new ArrayNode(this, i);
    }

    public BooleanNode booleanNode(boolean z) {
        return z ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    public NullNode nullNode() {
        return NullNode.getInstance();
    }

    public TextNode textNode(String str) {
        return TextNode.valueOf(str);
    }

    public JsonNodeFactory() {
        this(false);
    }

    public BinaryNode binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    public BinaryNode binaryNode(byte[] bArr, int i, int i2) {
        return BinaryNode.valueOf(bArr, i, i2);
    }

    public NumericNode numberNode(byte b) {
        return IntNode.valueOf(b);
    }

    public ValueNode numberNode(Byte b) {
        return b == null ? nullNode() : IntNode.valueOf(b.intValue());
    }

    public NumericNode numberNode(short s) {
        return ShortNode.valueOf(s);
    }

    public ValueNode numberNode(Short sh) {
        return sh == null ? nullNode() : ShortNode.valueOf(sh.shortValue());
    }

    public NumericNode numberNode(int i) {
        return IntNode.valueOf(i);
    }

    public ValueNode numberNode(Integer num) {
        return num == null ? nullNode() : IntNode.valueOf(num.intValue());
    }

    public NumericNode numberNode(long j) {
        return LongNode.valueOf(j);
    }

    public ValueNode numberNode(Long l) {
        if (l == null) {
            return nullNode();
        }
        return LongNode.valueOf(l.longValue());
    }

    public ValueNode numberNode(BigInteger bigInteger) {
        if (bigInteger == null) {
            return nullNode();
        }
        return BigIntegerNode.valueOf(bigInteger);
    }

    public NumericNode numberNode(float f) {
        return FloatNode.valueOf(f);
    }

    public ValueNode numberNode(Float f) {
        return f == null ? nullNode() : FloatNode.valueOf(f.floatValue());
    }

    public NumericNode numberNode(double d) {
        return DoubleNode.valueOf(d);
    }

    public ValueNode numberNode(Double d) {
        return d == null ? nullNode() : DoubleNode.valueOf(d.doubleValue());
    }

    public ValueNode numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return nullNode();
        }
        if (this._cfgBigDecimalExact) {
            return DecimalNode.valueOf(bigDecimal);
        }
        if (bigDecimal.signum() == 0) {
            return DecimalNode.ZERO;
        }
        try {
            bigDecimal = bigDecimal.stripTrailingZeros();
        } catch (ArithmeticException unused) {
        }
        return DecimalNode.valueOf(bigDecimal);
    }
}
