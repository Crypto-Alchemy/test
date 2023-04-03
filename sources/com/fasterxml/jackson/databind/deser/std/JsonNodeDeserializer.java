package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

public class JsonNodeDeserializer extends BaseNodeDeserializer<g53> {

    /* renamed from: a */
    public static final JsonNodeDeserializer f9963a = new JsonNodeDeserializer();

    public JsonNodeDeserializer() {
        super(g53.class, (Boolean) null);
    }

    public static o43<? extends g53> getDeserializer(Class<?> cls) {
        if (cls == ObjectNode.class) {
            return ObjectDeserializer.getInstance();
        }
        if (cls == ArrayNode.class) {
            return ArrayDeserializer.getInstance();
        }
        return f9963a;
    }

    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, j07);
    }

    public Object getAbsentValue(DeserializationContext deserializationContext) {
        return null;
    }

    public /* bridge */ /* synthetic */ boolean isCachable() {
        return super.isCachable();
    }

    public /* bridge */ /* synthetic */ LogicalType logicalType() {
        return super.logicalType();
    }

    public /* bridge */ /* synthetic */ Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return super.supportsUpdate(deserializationConfig);
    }

    public static final class ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
        public static final ArrayDeserializer _instance = new ArrayDeserializer();
        private static final long serialVersionUID = 1;

        public ArrayDeserializer() {
            super(ArrayNode.class, Boolean.TRUE);
        }

        public static ArrayDeserializer getInstance() {
            return _instance;
        }

        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (!jsonParser.mo13926B0()) {
                return (ArrayNode) deserializationContext.handleUnexpectedToken((Class<?>) ArrayNode.class, jsonParser);
            }
            JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
            ArrayNode arrayNode = nodeFactory.arrayNode();
            _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.C2003a(), arrayNode);
            return arrayNode;
        }

        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) throws IOException {
            if (!jsonParser.mo13926B0()) {
                return (ArrayNode) deserializationContext.handleUnexpectedToken((Class<?>) ArrayNode.class, jsonParser);
            }
            _deserializeContainerNoRecursion(jsonParser, deserializationContext, deserializationContext.getNodeFactory(), new BaseNodeDeserializer.C2003a(), arrayNode);
            return arrayNode;
        }
    }

    public static final class ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
        public static final ObjectDeserializer _instance = new ObjectDeserializer();
        private static final long serialVersionUID = 1;

        public ObjectDeserializer() {
            super(ObjectNode.class, Boolean.TRUE);
        }

        public static ObjectDeserializer getInstance() {
            return _instance;
        }

        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
            if (jsonParser.mo13928C0()) {
                ObjectNode objectNode = nodeFactory.objectNode();
                _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.C2003a(), objectNode);
                return objectNode;
            } else if (jsonParser.mo13984s0(JsonToken.FIELD_NAME)) {
                return _deserializeObjectAtName(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.C2003a());
            } else {
                if (jsonParser.mo13984s0(JsonToken.END_OBJECT)) {
                    return nodeFactory.objectNode();
                }
                return (ObjectNode) deserializationContext.handleUnexpectedToken((Class<?>) ObjectNode.class, jsonParser);
            }
        }

        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) throws IOException {
            if (jsonParser.mo13928C0() || jsonParser.mo13984s0(JsonToken.FIELD_NAME)) {
                return (ObjectNode) updateObject(jsonParser, deserializationContext, objectNode, new BaseNodeDeserializer.C2003a());
            }
            return (ObjectNode) deserializationContext.handleUnexpectedToken((Class<?>) ObjectNode.class, jsonParser);
        }
    }

    public g53 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        BaseNodeDeserializer.C2003a aVar = new BaseNodeDeserializer.C2003a();
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        int h = jsonParser.mo13967h();
        if (h == 1) {
            return _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, aVar, nodeFactory.objectNode());
        } else if (h == 2) {
            return nodeFactory.objectNode();
        } else {
            if (h == 3) {
                return _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, aVar, nodeFactory.arrayNode());
            } else if (h != 5) {
                return _deserializeAnyScalar(jsonParser, deserializationContext);
            } else {
                return _deserializeObjectAtName(jsonParser, deserializationContext, nodeFactory, aVar);
            }
        }
    }

    public g53 getNullValue(DeserializationContext deserializationContext) {
        return deserializationContext.getNodeFactory().nullNode();
    }
}
