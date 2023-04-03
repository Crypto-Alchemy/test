package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayNode extends ContainerNode<ArrayNode> {
    private static final long serialVersionUID = 1;
    private final List<g53> _children;

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new ArrayList();
    }

    public ArrayNode _add(g53 g53) {
        this._children.add(g53);
        return this;
    }

    public g53 _at(n53 n53) {
        return get(n53.mo23512f());
    }

    public boolean _childrenEqual(ArrayNode arrayNode) {
        return this._children.equals(arrayNode._children);
    }

    public ArrayNode _insert(int i, g53 g53) {
        if (i < 0) {
            this._children.add(0, g53);
        } else if (i >= this._children.size()) {
            this._children.add(g53);
        } else {
            this._children.add(i, g53);
        }
        return this;
    }

    public ArrayNode _set(int i, g53 g53) {
        if (i < 0 || i >= this._children.size()) {
            throw new IndexOutOfBoundsException("Illegal index " + i + ", array size " + size());
        }
        this._children.set(i, g53);
        return this;
    }

    public ArrayNode add(g53 g53) {
        if (g53 == null) {
            g53 = nullNode();
        }
        _add(g53);
        return this;
    }

    public ArrayNode addAll(ArrayNode arrayNode) {
        this._children.addAll(arrayNode._children);
        return this;
    }

    public ArrayNode addArray() {
        ArrayNode arrayNode = arrayNode();
        _add(arrayNode);
        return arrayNode;
    }

    public ArrayNode addNull() {
        return _add(nullNode());
    }

    public ObjectNode addObject() {
        ObjectNode objectNode = objectNode();
        _add(objectNode);
        return objectNode;
    }

    public ArrayNode addPOJO(Object obj) {
        g53 g53;
        if (obj == null) {
            g53 = nullNode();
        } else {
            g53 = pojoNode(obj);
        }
        return _add(g53);
    }

    public ArrayNode addRawValue(l75 l75) {
        g53 g53;
        if (l75 == null) {
            g53 = nullNode();
        } else {
            g53 = rawValueNode(l75);
        }
        return _add(g53);
    }

    public JsonToken asToken() {
        return JsonToken.START_ARRAY;
    }

    public Iterator<g53> elements() {
        return this._children.iterator();
    }

    public boolean equals(Comparator<g53> comparator, g53 g53) {
        if (!(g53 instanceof ArrayNode)) {
            return false;
        }
        ArrayNode arrayNode = (ArrayNode) g53;
        int size = this._children.size();
        if (arrayNode.size() != size) {
            return false;
        }
        List<g53> list = this._children;
        List<g53> list2 = arrayNode._children;
        for (int i = 0; i < size; i++) {
            if (!list.get(i).equals(comparator, list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public List<g53> findParents(String str, List<g53> list) {
        for (g53 findParents : this._children) {
            list = findParents.findParents(str, list);
        }
        return list;
    }

    public g53 findValue(String str) {
        for (g53 findValue : this._children) {
            g53 findValue2 = findValue.findValue(str);
            if (findValue2 != null) {
                return findValue2;
            }
        }
        return null;
    }

    public List<g53> findValues(String str, List<g53> list) {
        for (g53 findValues : this._children) {
            list = findValues.findValues(str, list);
        }
        return list;
    }

    public List<String> findValuesAsText(String str, List<String> list) {
        for (g53 findValuesAsText : this._children) {
            list = findValuesAsText.findValuesAsText(str, list);
        }
        return list;
    }

    public g53 get(String str) {
        return null;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    public ArrayNode insert(int i, g53 g53) {
        if (g53 == null) {
            g53 = nullNode();
        }
        _insert(i, g53);
        return this;
    }

    public ArrayNode insertArray(int i) {
        ArrayNode arrayNode = arrayNode();
        _insert(i, arrayNode);
        return arrayNode;
    }

    public ArrayNode insertNull(int i) {
        return _insert(i, nullNode());
    }

    public ObjectNode insertObject(int i) {
        ObjectNode objectNode = objectNode();
        _insert(i, objectNode);
        return objectNode;
    }

    public ArrayNode insertPOJO(int i, Object obj) {
        g53 g53;
        if (obj == null) {
            g53 = nullNode();
        } else {
            g53 = pojoNode(obj);
        }
        return _insert(i, g53);
    }

    public ArrayNode insertRawValue(int i, l75 l75) {
        g53 g53;
        if (l75 == null) {
            g53 = nullNode();
        } else {
            g53 = rawValueNode(l75);
        }
        return _insert(i, g53);
    }

    public boolean isArray() {
        return true;
    }

    public boolean isEmpty(zw5 zw5) {
        return this._children.isEmpty();
    }

    public g53 remove(int i) {
        if (i < 0 || i >= this._children.size()) {
            return null;
        }
        return this._children.remove(i);
    }

    public g53 required(int i) {
        if (i >= 0 && i < this._children.size()) {
            return this._children.get(i);
        }
        return (g53) _reportRequiredViolation("No value at index #%d [0, %d) of `ArrayNode`", Integer.valueOf(i), Integer.valueOf(this._children.size()));
    }

    public void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        List<g53> list = this._children;
        int size = list.size();
        jsonGenerator.mo13850P0(this, size);
        for (int i = 0; i < size; i++) {
            ((BaseJsonNode) list.get(i)).serialize(jsonGenerator, zw5);
        }
        jsonGenerator.mo13853S();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(this, JsonToken.START_ARRAY));
        Iterator<g53> it = this._children.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).serialize(jsonGenerator, zw5);
        }
        m17.mo16713h(jsonGenerator, g);
    }

    public g53 set(int i, g53 g53) {
        if (g53 == null) {
            g53 = nullNode();
        }
        if (i >= 0 && i < this._children.size()) {
            return this._children.set(i, g53);
        }
        throw new IndexOutOfBoundsException("Illegal index " + i + ", array size " + size());
    }

    public ArrayNode setNull(int i) {
        return _set(i, nullNode());
    }

    public ArrayNode setPOJO(int i, Object obj) {
        g53 g53;
        if (obj == null) {
            g53 = nullNode();
        } else {
            g53 = pojoNode(obj);
        }
        return _set(i, g53);
    }

    public ArrayNode setRawValue(int i, l75 l75) {
        g53 g53;
        if (l75 == null) {
            g53 = nullNode();
        } else {
            g53 = rawValueNode(l75);
        }
        return _set(i, g53);
    }

    public int size() {
        return this._children.size();
    }

    public ArrayNode addAll(Collection<? extends g53> collection) {
        for (g53 add : collection) {
            add(add);
        }
        return this;
    }

    public ArrayNode deepCopy() {
        ArrayNode arrayNode = new ArrayNode(this._nodeFactory);
        for (g53 deepCopy : this._children) {
            arrayNode._children.add(deepCopy.deepCopy());
        }
        return arrayNode;
    }

    public ObjectNode findParent(String str) {
        for (g53 findParent : this._children) {
            g53 findParent2 = findParent.findParent(str);
            if (findParent2 != null) {
                return (ObjectNode) findParent2;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    public ArrayNode removeAll() {
        this._children.clear();
        return this;
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, int i) {
        super(jsonNodeFactory);
        this._children = new ArrayList(i);
    }

    public ArrayNode add(short s) {
        return _add(numberNode(s));
    }

    public g53 get(int i) {
        if (i < 0 || i >= this._children.size()) {
            return null;
        }
        return this._children.get(i);
    }

    public ArrayNode insert(int i, short s) {
        return _insert(i, numberNode(s));
    }

    public g53 path(String str) {
        return MissingNode.getInstance();
    }

    public ArrayNode add(Short sh) {
        return _add(sh == null ? nullNode() : numberNode(sh.shortValue()));
    }

    public ArrayNode insert(int i, Short sh) {
        return _insert(i, sh == null ? nullNode() : numberNode(sh.shortValue()));
    }

    public g53 path(int i) {
        if (i < 0 || i >= this._children.size()) {
            return MissingNode.getInstance();
        }
        return this._children.get(i);
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, List<g53> list) {
        super(jsonNodeFactory);
        this._children = list;
    }

    public ArrayNode add(int i) {
        return _add(numberNode(i));
    }

    public ArrayNode insert(int i, int i2) {
        return _insert(i, numberNode(i2));
    }

    public ArrayNode set(int i, short s) {
        return _set(i, numberNode(s));
    }

    public ArrayNode add(Integer num) {
        return _add(num == null ? nullNode() : numberNode(num.intValue()));
    }

    public ArrayNode insert(int i, Integer num) {
        return _insert(i, num == null ? nullNode() : numberNode(num.intValue()));
    }

    public ArrayNode set(int i, Short sh) {
        return _set(i, sh == null ? nullNode() : numberNode(sh.shortValue()));
    }

    public ArrayNode add(long j) {
        return _add(numberNode(j));
    }

    public ArrayNode insert(int i, long j) {
        return _insert(i, numberNode(j));
    }

    public ArrayNode set(int i, int i2) {
        return _set(i, numberNode(i2));
    }

    public ArrayNode add(Long l) {
        return _add(l == null ? nullNode() : numberNode(l.longValue()));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this._children.equals(((ArrayNode) obj)._children);
        }
        return false;
    }

    public ArrayNode insert(int i, Long l) {
        return _insert(i, l == null ? nullNode() : numberNode(l.longValue()));
    }

    public ArrayNode set(int i, Integer num) {
        return _set(i, num == null ? nullNode() : numberNode(num.intValue()));
    }

    public ArrayNode add(float f) {
        return _add(numberNode(f));
    }

    public ArrayNode insert(int i, float f) {
        return _insert(i, numberNode(f));
    }

    public ArrayNode set(int i, long j) {
        return _set(i, numberNode(j));
    }

    public ArrayNode add(Float f) {
        return _add(f == null ? nullNode() : numberNode(f.floatValue()));
    }

    public ArrayNode insert(int i, Float f) {
        return _insert(i, f == null ? nullNode() : numberNode(f.floatValue()));
    }

    public ArrayNode set(int i, Long l) {
        return _set(i, l == null ? nullNode() : numberNode(l.longValue()));
    }

    public ArrayNode add(double d) {
        return _add(numberNode(d));
    }

    public ArrayNode insert(int i, double d) {
        return _insert(i, numberNode(d));
    }

    public ArrayNode set(int i, float f) {
        return _set(i, numberNode(f));
    }

    public ArrayNode add(Double d) {
        return _add(d == null ? nullNode() : numberNode(d.doubleValue()));
    }

    public ArrayNode insert(int i, Double d) {
        return _insert(i, d == null ? nullNode() : numberNode(d.doubleValue()));
    }

    public ArrayNode set(int i, Float f) {
        return _set(i, f == null ? nullNode() : numberNode(f.floatValue()));
    }

    public ArrayNode add(BigDecimal bigDecimal) {
        return _add(bigDecimal == null ? nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode insert(int i, BigDecimal bigDecimal) {
        return _insert(i, bigDecimal == null ? nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode set(int i, double d) {
        return _set(i, numberNode(d));
    }

    public ArrayNode add(BigInteger bigInteger) {
        return _add(bigInteger == null ? nullNode() : numberNode(bigInteger));
    }

    public ArrayNode insert(int i, BigInteger bigInteger) {
        return _insert(i, bigInteger == null ? nullNode() : numberNode(bigInteger));
    }

    public ArrayNode set(int i, Double d) {
        return _set(i, d == null ? nullNode() : numberNode(d.doubleValue()));
    }

    public ArrayNode add(String str) {
        return _add(str == null ? nullNode() : textNode(str));
    }

    public ArrayNode insert(int i, String str) {
        return _insert(i, str == null ? nullNode() : textNode(str));
    }

    public ArrayNode set(int i, BigDecimal bigDecimal) {
        return _set(i, bigDecimal == null ? nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode add(boolean z) {
        return _add(booleanNode(z));
    }

    public ArrayNode insert(int i, boolean z) {
        return _insert(i, booleanNode(z));
    }

    public ArrayNode set(int i, BigInteger bigInteger) {
        return _set(i, bigInteger == null ? nullNode() : numberNode(bigInteger));
    }

    public ArrayNode add(Boolean bool) {
        return _add(bool == null ? nullNode() : booleanNode(bool.booleanValue()));
    }

    public ArrayNode insert(int i, Boolean bool) {
        if (bool == null) {
            return insertNull(i);
        }
        return _insert(i, booleanNode(bool.booleanValue()));
    }

    public ArrayNode set(int i, String str) {
        return _set(i, str == null ? nullNode() : textNode(str));
    }

    public ArrayNode add(byte[] bArr) {
        return _add(bArr == null ? nullNode() : binaryNode(bArr));
    }

    public ArrayNode set(int i, boolean z) {
        return _set(i, booleanNode(z));
    }

    public ArrayNode insert(int i, byte[] bArr) {
        if (bArr == null) {
            return insertNull(i);
        }
        return _insert(i, binaryNode(bArr));
    }

    public ArrayNode set(int i, Boolean bool) {
        return _set(i, bool == null ? nullNode() : booleanNode(bool.booleanValue()));
    }

    public ArrayNode set(int i, byte[] bArr) {
        return _set(i, bArr == null ? nullNode() : binaryNode(bArr));
    }
}
