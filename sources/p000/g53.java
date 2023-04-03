package p000;

import com.fasterxml.jackson.core.C1979c;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.w63;

/* renamed from: g53 */
/* compiled from: JsonNode */
public abstract class g53 extends w63.C3522a implements C1979c, Iterable<g53> {

    /* renamed from: g53$a */
    /* compiled from: JsonNode */
    public static /* synthetic */ class C2344a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12179a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.databind.node.JsonNodeType[] r0 = com.fasterxml.jackson.databind.node.JsonNodeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12179a = r0
                com.fasterxml.jackson.databind.node.JsonNodeType r1 = com.fasterxml.jackson.databind.node.JsonNodeType.ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12179a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.node.JsonNodeType r1 = com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12179a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.node.JsonNodeType r1 = com.fasterxml.jackson.databind.node.JsonNodeType.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.g53.C2344a.<clinit>():void");
        }
    }

    public abstract g53 _at(n53 n53);

    public <T> T _reportRequiredViolation(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public <T extends g53> T _this() {
        return this;
    }

    public boolean asBoolean() {
        return asBoolean(false);
    }

    public boolean asBoolean(boolean z) {
        return z;
    }

    public double asDouble() {
        return asDouble(Utils.DOUBLE_EPSILON);
    }

    public double asDouble(double d) {
        return d;
    }

    public int asInt() {
        return asInt(0);
    }

    public int asInt(int i) {
        return i;
    }

    public long asLong() {
        return asLong(0);
    }

    public long asLong(long j) {
        return j;
    }

    public abstract String asText();

    public String asText(String str) {
        String asText = asText();
        return asText == null ? str : asText;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.ZERO;
    }

    public byte[] binaryValue() throws IOException {
        return null;
    }

    public boolean booleanValue() {
        return false;
    }

    public boolean canConvertToExactIntegral() {
        return isIntegralNumber();
    }

    public boolean canConvertToInt() {
        return false;
    }

    public boolean canConvertToLong() {
        return false;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.ZERO;
    }

    public abstract <T extends g53> T deepCopy();

    public double doubleValue() {
        return Utils.DOUBLE_EPSILON;
    }

    public Iterator<g53> elements() {
        return wf0.m29526n();
    }

    public abstract boolean equals(Object obj);

    public boolean equals(Comparator<g53> comparator, g53 g53) {
        return comparator.compare(this, g53) == 0;
    }

    public Iterator<String> fieldNames() {
        return wf0.m29526n();
    }

    public Iterator<Map.Entry<String, g53>> fields() {
        return wf0.m29526n();
    }

    public abstract g53 findParent(String str);

    public final List<g53> findParents(String str) {
        List<g53> findParents = findParents(str, (List<g53>) null);
        return findParents == null ? Collections.emptyList() : findParents;
    }

    public abstract List<g53> findParents(String str, List<g53> list);

    public abstract g53 findPath(String str);

    public abstract g53 findValue(String str);

    public final List<g53> findValues(String str) {
        List<g53> findValues = findValues(str, (List<g53>) null);
        return findValues == null ? Collections.emptyList() : findValues;
    }

    public abstract List<g53> findValues(String str, List<g53> list);

    public final List<String> findValuesAsText(String str) {
        List<String> findValuesAsText = findValuesAsText(str, (List<String>) null);
        return findValuesAsText == null ? Collections.emptyList() : findValuesAsText;
    }

    public abstract List<String> findValuesAsText(String str, List<String> list);

    public float floatValue() {
        return Utils.FLOAT_EPSILON;
    }

    public abstract g53 get(int i);

    public g53 get(String str) {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public boolean has(String str) {
        return get(str) != null;
    }

    public boolean hasNonNull(String str) {
        g53 g53 = get(str);
        return g53 != null && !g53.isNull();
    }

    public int intValue() {
        return 0;
    }

    public boolean isArray() {
        return false;
    }

    public boolean isBigDecimal() {
        return false;
    }

    public boolean isBigInteger() {
        return false;
    }

    public final boolean isBinary() {
        if (getNodeType() == JsonNodeType.BINARY) {
            return true;
        }
        return false;
    }

    public final boolean isBoolean() {
        if (getNodeType() == JsonNodeType.BOOLEAN) {
            return true;
        }
        return false;
    }

    public final boolean isContainerNode() {
        JsonNodeType nodeType = getNodeType();
        if (nodeType == JsonNodeType.OBJECT || nodeType == JsonNodeType.ARRAY) {
            return true;
        }
        return false;
    }

    public boolean isDouble() {
        return false;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isFloat() {
        return false;
    }

    public boolean isFloatingPointNumber() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isIntegralNumber() {
        return false;
    }

    public boolean isLong() {
        return false;
    }

    public boolean isMissingNode() {
        return false;
    }

    public final boolean isNull() {
        if (getNodeType() == JsonNodeType.NULL) {
            return true;
        }
        return false;
    }

    public final boolean isNumber() {
        if (getNodeType() == JsonNodeType.NUMBER) {
            return true;
        }
        return false;
    }

    public boolean isObject() {
        return false;
    }

    public final boolean isPojo() {
        if (getNodeType() == JsonNodeType.POJO) {
            return true;
        }
        return false;
    }

    public boolean isShort() {
        return false;
    }

    public final boolean isTextual() {
        if (getNodeType() == JsonNodeType.STRING) {
            return true;
        }
        return false;
    }

    public final boolean isValueNode() {
        int i = C2344a.f12179a[getNodeType().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        return true;
    }

    public final Iterator<g53> iterator() {
        return elements();
    }

    public long longValue() {
        return 0;
    }

    public Number numberValue() {
        return null;
    }

    public abstract g53 path(int i);

    public abstract g53 path(String str);

    public <T extends g53> T require() throws IllegalArgumentException {
        return _this();
    }

    public <T extends g53> T requireNonNull() throws IllegalArgumentException {
        return _this();
    }

    public g53 required(String str) throws IllegalArgumentException {
        return (g53) _reportRequiredViolation("Node of type `%s` has no fields", getClass().getName());
    }

    public g53 requiredAt(String str) throws IllegalArgumentException {
        return requiredAt(n53.m22805e(str));
    }

    public short shortValue() {
        return 0;
    }

    public int size() {
        return 0;
    }

    public String textValue() {
        return null;
    }

    public String toPrettyString() {
        return toString();
    }

    public abstract String toString();

    public <T extends g53> T with(String str) {
        throw new UnsupportedOperationException("JsonNode not of type ObjectNode (but " + getClass().getName() + "), cannot call with() on it");
    }

    public <T extends g53> T withArray(String str) {
        throw new UnsupportedOperationException("JsonNode not of type ObjectNode (but " + getClass().getName() + "), cannot call withArray() on it");
    }

    public boolean has(int i) {
        return get(i) != null;
    }

    public g53 required(int i) throws IllegalArgumentException {
        return (g53) _reportRequiredViolation("Node of type `%s` has no indexed values", getClass().getName());
    }

    public final g53 requiredAt(n53 n53) throws IllegalArgumentException {
        g53 g53 = this;
        for (n53 n532 = n53; !n532.mo23517j(); n532 = n532.mo23518k()) {
            g53 = g53._at(n532);
            if (g53 == null) {
                _reportRequiredViolation("No node at '%s' (unmatched part: '%s')", n53, n532);
            }
        }
        return g53;
    }

    /* renamed from: at */
    public final g53 m17594at(n53 n53) {
        if (n53.mo23517j()) {
            return this;
        }
        g53 _at = _at(n53);
        if (_at == null) {
            return MissingNode.getInstance();
        }
        return _at.mo20353at(n53.mo23518k());
    }

    public boolean hasNonNull(int i) {
        g53 g53 = get(i);
        return g53 != null && !g53.isNull();
    }

    /* renamed from: at */
    public final g53 m17593at(String str) {
        return mo20353at(n53.m22805e(str));
    }
}
