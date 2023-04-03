package p000;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Deprecated
/* renamed from: u63 */
/* compiled from: JsonSchema */
public class u63 {

    /* renamed from: a */
    public final ObjectNode f18391a;

    @JsonCreator
    public u63(ObjectNode objectNode) {
        this.f18391a = objectNode;
    }

    /* renamed from: a */
    public static g53 m28093a() {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", "any");
        return objectNode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof u63)) {
            return false;
        }
        u63 u63 = (u63) obj;
        ObjectNode objectNode = this.f18391a;
        if (objectNode != null) {
            return objectNode.equals(u63.f18391a);
        }
        if (u63.f18391a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f18391a.hashCode();
    }

    public String toString() {
        return this.f18391a.toString();
    }
}
