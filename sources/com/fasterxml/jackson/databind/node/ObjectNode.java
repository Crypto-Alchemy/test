package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ObjectNode extends ContainerNode<ObjectNode> {
    private static final long serialVersionUID = 1;
    public final Map<String, g53> _children;

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new LinkedHashMap();
    }

    public g53 _at(n53 n53) {
        return get(n53.mo23513g());
    }

    public boolean _childrenEqual(ObjectNode objectNode) {
        return this._children.equals(objectNode._children);
    }

    public ObjectNode _put(String str, g53 g53) {
        this._children.put(str, g53);
        return this;
    }

    public JsonToken asToken() {
        return JsonToken.START_OBJECT;
    }

    public Iterator<g53> elements() {
        return this._children.values().iterator();
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.util.Comparator<p000.g53> r5, p000.g53 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fasterxml.jackson.databind.node.ObjectNode
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.fasterxml.jackson.databind.node.ObjectNode r6 = (com.fasterxml.jackson.databind.node.ObjectNode) r6
            java.util.Map<java.lang.String, g53> r0 = r4._children
            java.util.Map<java.lang.String, g53> r6 = r6._children
            int r2 = r0.size()
            int r3 = r6.size()
            if (r3 == r2) goto L_0x0017
            return r1
        L_0x0017:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r6.get(r3)
            g53 r3 = (p000.g53) r3
            if (r3 == 0) goto L_0x0043
            java.lang.Object r2 = r2.getValue()
            g53 r2 = (p000.g53) r2
            boolean r2 = r2.equals(r5, r3)
            if (r2 != 0) goto L_0x001f
        L_0x0043:
            return r1
        L_0x0044:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.ObjectNode.equals(java.util.Comparator, g53):boolean");
    }

    public Iterator<String> fieldNames() {
        return this._children.keySet().iterator();
    }

    public Iterator<Map.Entry<String, g53>> fields() {
        return this._children.entrySet().iterator();
    }

    public List<g53> findParents(String str, List<g53> list) {
        for (Map.Entry next : this._children.entrySet()) {
            if (str.equals(next.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(this);
            } else {
                list = ((g53) next.getValue()).findParents(str, list);
            }
        }
        return list;
    }

    public g53 findValue(String str) {
        for (Map.Entry next : this._children.entrySet()) {
            if (str.equals(next.getKey())) {
                return (g53) next.getValue();
            }
            g53 findValue = ((g53) next.getValue()).findValue(str);
            if (findValue != null) {
                return findValue;
            }
        }
        return null;
    }

    public List<g53> findValues(String str, List<g53> list) {
        for (Map.Entry next : this._children.entrySet()) {
            if (str.equals(next.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(next.getValue());
            } else {
                list = ((g53) next.getValue()).findValues(str, list);
            }
        }
        return list;
    }

    public List<String> findValuesAsText(String str, List<String> list) {
        for (Map.Entry next : this._children.entrySet()) {
            if (str.equals(next.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(((g53) next.getValue()).asText());
            } else {
                list = ((g53) next.getValue()).findValuesAsText(str, list);
            }
        }
        return list;
    }

    public g53 get(int i) {
        return null;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    public boolean isEmpty(zw5 zw5) {
        return this._children.isEmpty();
    }

    public final boolean isObject() {
        return true;
    }

    @Deprecated
    public g53 put(String str, g53 g53) {
        if (g53 == null) {
            g53 = nullNode();
        }
        return this._children.put(str, g53);
    }

    @Deprecated
    public g53 putAll(Map<String, ? extends g53> map) {
        return setAll(map);
    }

    public ArrayNode putArray(String str) {
        ArrayNode arrayNode = arrayNode();
        _put(str, arrayNode);
        return arrayNode;
    }

    public g53 putIfAbsent(String str, g53 g53) {
        if (g53 == null) {
            g53 = nullNode();
        }
        return (g53) this._children.putIfAbsent(str, g53);
    }

    public ObjectNode putNull(String str) {
        this._children.put(str, nullNode());
        return this;
    }

    public ObjectNode putObject(String str) {
        ObjectNode objectNode = objectNode();
        _put(str, objectNode);
        return objectNode;
    }

    public ObjectNode putPOJO(String str, Object obj) {
        return _put(str, pojoNode(obj));
    }

    public ObjectNode putRawValue(String str, l75 l75) {
        return _put(str, rawValueNode(l75));
    }

    public g53 remove(String str) {
        return this._children.remove(str);
    }

    public g53 replace(String str, g53 g53) {
        if (g53 == null) {
            g53 = nullNode();
        }
        return this._children.put(str, g53);
    }

    public g53 required(String str) {
        g53 g53 = this._children.get(str);
        if (g53 != null) {
            return g53;
        }
        return (g53) _reportRequiredViolation("No value for property '%s' of `ObjectNode`", str);
    }

    public ObjectNode retain(Collection<String> collection) {
        this._children.keySet().retainAll(collection);
        return this;
    }

    public void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        boolean z;
        if (zw5 == null || zw5.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) {
            z = false;
        } else {
            z = true;
        }
        jsonGenerator.mo13854S0(this);
        for (Map.Entry next : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) next.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(zw5)) {
                jsonGenerator.mo13864b0((String) next.getKey());
                baseJsonNode.serialize(jsonGenerator, zw5);
            }
        }
        jsonGenerator.mo13855W();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        boolean z;
        if (zw5 == null || zw5.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) {
            z = false;
        } else {
            z = true;
        }
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(this, JsonToken.START_OBJECT));
        for (Map.Entry next : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) next.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(zw5)) {
                jsonGenerator.mo13864b0((String) next.getKey());
                baseJsonNode.serialize(jsonGenerator, zw5);
            }
        }
        m17.mo16713h(jsonGenerator, g);
    }

    public <T extends g53> T set(String str, g53 g53) {
        if (g53 == null) {
            g53 = nullNode();
        }
        this._children.put(str, g53);
        return this;
    }

    public <T extends g53> T setAll(Map<String, ? extends g53> map) {
        for (Map.Entry next : map.entrySet()) {
            Object obj = (g53) next.getValue();
            if (obj == null) {
                obj = nullNode();
            }
            this._children.put(next.getKey(), obj);
        }
        return this;
    }

    public int size() {
        return this._children.size();
    }

    public <T extends g53> T without(String str) {
        this._children.remove(str);
        return this;
    }

    public ObjectNode deepCopy() {
        ObjectNode objectNode = new ObjectNode(this._nodeFactory);
        for (Map.Entry next : this._children.entrySet()) {
            objectNode._children.put(next.getKey(), ((g53) next.getValue()).deepCopy());
        }
        return objectNode;
    }

    public ObjectNode findParent(String str) {
        for (Map.Entry next : this._children.entrySet()) {
            if (str.equals(next.getKey())) {
                return this;
            }
            g53 findParent = ((g53) next.getValue()).findParent(str);
            if (findParent != null) {
                return (ObjectNode) findParent;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    @Deprecated
    public g53 putAll(ObjectNode objectNode) {
        return setAll(objectNode);
    }

    public ObjectNode remove(Collection<String> collection) {
        this._children.keySet().removeAll(collection);
        return this;
    }

    public ObjectNode removeAll() {
        this._children.clear();
        return this;
    }

    public ObjectNode retain(String... strArr) {
        return retain((Collection<String>) Arrays.asList(strArr));
    }

    public ObjectNode with(String str) {
        g53 g53 = this._children.get(str);
        if (g53 == null) {
            ObjectNode objectNode = objectNode();
            this._children.put(str, objectNode);
            return objectNode;
        } else if (g53 instanceof ObjectNode) {
            return (ObjectNode) g53;
        } else {
            throw new UnsupportedOperationException("Property '" + str + "' has value that is not of type ObjectNode (but " + g53.getClass().getName() + ")");
        }
    }

    public ArrayNode withArray(String str) {
        g53 g53 = this._children.get(str);
        if (g53 == null) {
            ArrayNode arrayNode = arrayNode();
            this._children.put(str, arrayNode);
            return arrayNode;
        } else if (g53 instanceof ArrayNode) {
            return (ArrayNode) g53;
        } else {
            throw new UnsupportedOperationException("Property '" + str + "' has value that is not of type ArrayNode (but " + g53.getClass().getName() + ")");
        }
    }

    public <T extends g53> T without(Collection<String> collection) {
        this._children.keySet().removeAll(collection);
        return this;
    }

    public ObjectNode(JsonNodeFactory jsonNodeFactory, Map<String, g53> map) {
        super(jsonNodeFactory);
        this._children = map;
    }

    public g53 get(String str) {
        return this._children.get(str);
    }

    public g53 path(int i) {
        return MissingNode.getInstance();
    }

    public ObjectNode put(String str, short s) {
        return _put(str, numberNode(s));
    }

    public g53 path(String str) {
        g53 g53 = this._children.get(str);
        if (g53 != null) {
            return g53;
        }
        return MissingNode.getInstance();
    }

    public ObjectNode put(String str, Short sh) {
        g53 g53;
        if (sh == null) {
            g53 = nullNode();
        } else {
            g53 = numberNode(sh.shortValue());
        }
        return _put(str, g53);
    }

    public <T extends g53> T setAll(ObjectNode objectNode) {
        this._children.putAll(objectNode._children);
        return this;
    }

    public ObjectNode put(String str, int i) {
        return _put(str, numberNode(i));
    }

    public ObjectNode put(String str, Integer num) {
        g53 g53;
        if (num == null) {
            g53 = nullNode();
        } else {
            g53 = numberNode(num.intValue());
        }
        return _put(str, g53);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return _childrenEqual((ObjectNode) obj);
        }
        return false;
    }

    public ObjectNode put(String str, long j) {
        return _put(str, numberNode(j));
    }

    public ObjectNode put(String str, Long l) {
        g53 g53;
        if (l == null) {
            g53 = nullNode();
        } else {
            g53 = numberNode(l.longValue());
        }
        return _put(str, g53);
    }

    public ObjectNode put(String str, float f) {
        return _put(str, numberNode(f));
    }

    public ObjectNode put(String str, Float f) {
        g53 g53;
        if (f == null) {
            g53 = nullNode();
        } else {
            g53 = numberNode(f.floatValue());
        }
        return _put(str, g53);
    }

    public ObjectNode put(String str, double d) {
        return _put(str, numberNode(d));
    }

    public ObjectNode put(String str, Double d) {
        g53 g53;
        if (d == null) {
            g53 = nullNode();
        } else {
            g53 = numberNode(d.doubleValue());
        }
        return _put(str, g53);
    }

    public ObjectNode put(String str, BigDecimal bigDecimal) {
        g53 g53;
        if (bigDecimal == null) {
            g53 = nullNode();
        } else {
            g53 = numberNode(bigDecimal);
        }
        return _put(str, g53);
    }

    public ObjectNode put(String str, BigInteger bigInteger) {
        g53 g53;
        if (bigInteger == null) {
            g53 = nullNode();
        } else {
            g53 = numberNode(bigInteger);
        }
        return _put(str, g53);
    }

    public ObjectNode put(String str, String str2) {
        g53 g53;
        if (str2 == null) {
            g53 = nullNode();
        } else {
            g53 = textNode(str2);
        }
        return _put(str, g53);
    }

    public ObjectNode put(String str, boolean z) {
        return _put(str, booleanNode(z));
    }

    public ObjectNode put(String str, Boolean bool) {
        g53 g53;
        if (bool == null) {
            g53 = nullNode();
        } else {
            g53 = booleanNode(bool.booleanValue());
        }
        return _put(str, g53);
    }

    public ObjectNode put(String str, byte[] bArr) {
        g53 g53;
        if (bArr == null) {
            g53 = nullNode();
        } else {
            g53 = binaryNode(bArr);
        }
        return _put(str, g53);
    }
}
