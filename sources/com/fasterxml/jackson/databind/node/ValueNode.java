package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.io.IOException;
import java.util.List;

public abstract class ValueNode extends BaseJsonNode {
    private static final long serialVersionUID = 1;

    public g53 _at(n53 n53) {
        return null;
    }

    public abstract JsonToken asToken();

    public <T extends g53> T deepCopy() {
        return this;
    }

    public final ObjectNode findParent(String str) {
        return null;
    }

    public final List<g53> findParents(String str, List<g53> list) {
        return list;
    }

    public final g53 findValue(String str) {
        return null;
    }

    public final List<g53> findValues(String str, List<g53> list) {
        return list;
    }

    public final List<String> findValuesAsText(String str, List<String> list) {
        return list;
    }

    public final g53 get(int i) {
        return null;
    }

    public final g53 get(String str) {
        return null;
    }

    public final boolean has(int i) {
        return false;
    }

    public final boolean has(String str) {
        return false;
    }

    public final boolean hasNonNull(int i) {
        return false;
    }

    public final boolean hasNonNull(String str) {
        return false;
    }

    public boolean isEmpty() {
        return true;
    }

    public void serializeWithType(JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(this, asToken()));
        serialize(jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }

    public final g53 path(int i) {
        return MissingNode.getInstance();
    }

    public final g53 path(String str) {
        return MissingNode.getInstance();
    }
}
