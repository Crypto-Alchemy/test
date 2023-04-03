package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.io.Serializable;

public abstract class BaseJsonNode extends g53 implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract JsonToken asToken();

    public final g53 findPath(String str) {
        g53 findValue = findValue(str);
        if (findValue == null) {
            return MissingNode.getInstance();
        }
        return findValue;
    }

    public abstract int hashCode();

    public JsonParser.NumberType numberType() {
        return null;
    }

    public g53 required(String str) {
        return (g53) _reportRequiredViolation("Node of type `%s` has no fields", getClass().getSimpleName());
    }

    public abstract void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException;

    public abstract void serializeWithType(JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException;

    public String toPrettyString() {
        return nx2.m23497b(this);
    }

    public String toString() {
        return nx2.m23498c(this);
    }

    public JsonParser traverse() {
        return new tx6(this);
    }

    public Object writeReplace() {
        return NodeSerialization.from(this);
    }

    public JsonParser traverse(xe4 xe4) {
        return new tx6(this, xe4);
    }

    public g53 required(int i) {
        return (g53) _reportRequiredViolation("Node of type `%s` has no indexed values", getClass().getSimpleName());
    }
}
