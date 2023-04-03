package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.Arrays;
import p000.g53;

/* compiled from: JsonNodeDeserializer */
abstract class BaseNodeDeserializer<T extends g53> extends StdDeserializer<T> {
    public final Boolean _supportsUpdates;

    /* renamed from: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer$a */
    /* compiled from: JsonNodeDeserializer */
    public static final class C2003a {

        /* renamed from: a */
        public ContainerNode[] f9951a;

        /* renamed from: b */
        public int f9952b;

        /* renamed from: c */
        public int f9953c;

        /* renamed from: a */
        public ContainerNode mo15640a() {
            int i = this.f9952b;
            if (i == 0) {
                return null;
            }
            ContainerNode[] containerNodeArr = this.f9951a;
            int i2 = i - 1;
            this.f9952b = i2;
            return containerNodeArr[i2];
        }

        /* renamed from: b */
        public void mo15641b(ContainerNode containerNode) {
            int i = this.f9952b;
            int i2 = this.f9953c;
            if (i < i2) {
                ContainerNode[] containerNodeArr = this.f9951a;
                this.f9952b = i + 1;
                containerNodeArr[i] = containerNode;
                return;
            }
            if (this.f9951a == null) {
                this.f9953c = 10;
                this.f9951a = new ContainerNode[10];
            } else {
                int min = i2 + Math.min(4000, Math.max(20, i2 >> 1));
                this.f9953c = min;
                this.f9951a = (ContainerNode[]) Arrays.copyOf(this.f9951a, min);
            }
            ContainerNode[] containerNodeArr2 = this.f9951a;
            int i3 = this.f9952b;
            this.f9952b = i3 + 1;
            containerNodeArr2[i3] = containerNode;
        }
    }

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
    }

    public final g53 _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        int h = jsonParser.mo13967h();
        if (h == 2) {
            return nodeFactory.objectNode();
        }
        switch (h) {
            case 6:
                return nodeFactory.textNode(jsonParser.mo13947W());
            case 7:
                return _fromInt(jsonParser, deserializationContext, nodeFactory);
            case 8:
                return _fromFloat(jsonParser, deserializationContext, nodeFactory);
            case 9:
                return nodeFactory.booleanNode(true);
            case 10:
                return nodeFactory.booleanNode(false);
            case 11:
                return nodeFactory.nullNode();
            case 12:
                return _fromEmbedded(jsonParser, deserializationContext);
            default:
                return (g53) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
    }

    public final ContainerNode<?> _deserializeContainerNoRecursion(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, C2003a aVar, ContainerNode<?> containerNode) throws IOException {
        ObjectNode objectNode;
        g53 textNode;
        ObjectNode objectNode2;
        JsonParser jsonParser2 = jsonParser;
        JsonNodeFactory jsonNodeFactory2 = jsonNodeFactory;
        C2003a aVar2 = aVar;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures() & StdDeserializer.F_MASK_INT_COERCIONS;
        ContainerNode<?> containerNode2 = containerNode;
        do {
            boolean z = true;
            if (!(containerNode2 instanceof ObjectNode)) {
                ArrayNode arrayNode = (ArrayNode) containerNode2;
                while (true) {
                    JsonToken N0 = jsonParser.mo13938N0();
                    if (N0 == null) {
                        N0 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (N0.mo14000id()) {
                        case 1:
                            aVar2.mo15641b(containerNode2);
                            containerNode2 = jsonNodeFactory.objectNode();
                            arrayNode.add((g53) containerNode2);
                            continue;
                        case 3:
                            aVar2.mo15641b(containerNode2);
                            containerNode2 = jsonNodeFactory.arrayNode();
                            arrayNode.add((g53) containerNode2);
                            continue;
                        case 4:
                            break;
                        case 6:
                            arrayNode.add((g53) jsonNodeFactory2.textNode(jsonParser.mo13947W()));
                            break;
                        case 7:
                            arrayNode.add(_fromInt(jsonParser2, deserializationFeatures, jsonNodeFactory2));
                            break;
                        case 8:
                            arrayNode.add(_fromFloat(jsonParser, deserializationContext, jsonNodeFactory));
                            break;
                        case 9:
                            arrayNode.add((g53) jsonNodeFactory2.booleanNode(true));
                            break;
                        case 10:
                            arrayNode.add((g53) jsonNodeFactory2.booleanNode(false));
                            break;
                        case 11:
                            arrayNode.add((g53) jsonNodeFactory.nullNode());
                            break;
                        default:
                            arrayNode.add(_deserializeRareScalar(jsonParser, deserializationContext));
                            break;
                    }
                }
            } else {
                ObjectNode objectNode3 = containerNode2;
                ObjectNode objectNode4 = (ObjectNode) containerNode2;
                String E0 = jsonParser.mo13930E0();
                while (true) {
                    if (E0 != null) {
                        JsonToken N02 = jsonParser.mo13938N0();
                        if (N02 == null) {
                            N02 = JsonToken.NOT_AVAILABLE;
                        }
                        int id = N02.mo14000id();
                        if (id == z) {
                            ObjectNode objectNode5 = objectNode4;
                            ObjectNode objectNode6 = jsonNodeFactory.objectNode();
                            g53 replace = objectNode5.replace(E0, objectNode6);
                            if (replace != null) {
                                ObjectNode objectNode7 = objectNode5;
                                objectNode = objectNode6;
                                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, E0, objectNode7, replace, objectNode6);
                            } else {
                                objectNode = objectNode6;
                            }
                            aVar2.mo15641b(objectNode3);
                            objectNode4 = objectNode;
                            objectNode3 = objectNode4;
                        } else if (id != 3) {
                            switch (id) {
                                case 6:
                                    textNode = jsonNodeFactory2.textNode(jsonParser.mo13947W());
                                    break;
                                case 7:
                                    textNode = _fromInt(jsonParser2, deserializationFeatures, jsonNodeFactory2);
                                    break;
                                case 8:
                                    textNode = _fromFloat(jsonParser, deserializationContext, jsonNodeFactory);
                                    break;
                                case 9:
                                    textNode = jsonNodeFactory2.booleanNode(z);
                                    break;
                                case 10:
                                    textNode = jsonNodeFactory2.booleanNode(false);
                                    break;
                                case 11:
                                    textNode = jsonNodeFactory.nullNode();
                                    break;
                                default:
                                    textNode = _deserializeRareScalar(jsonParser, deserializationContext);
                                    break;
                            }
                            g53 g53 = textNode;
                            g53 replace2 = objectNode4.replace(E0, g53);
                            if (replace2 != null) {
                                objectNode2 = objectNode4;
                                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, E0, objectNode4, replace2, g53);
                            } else {
                                objectNode2 = objectNode4;
                            }
                            objectNode4 = objectNode2;
                        } else {
                            ObjectNode objectNode8 = objectNode4;
                            ArrayNode arrayNode2 = jsonNodeFactory.arrayNode();
                            g53 replace3 = objectNode8.replace(E0, arrayNode2);
                            if (replace3 != null) {
                                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, E0, objectNode8, replace3, arrayNode2);
                            }
                            aVar2.mo15641b(objectNode3);
                            containerNode2 = arrayNode2;
                            continue;
                        }
                        E0 = jsonParser.mo13930E0();
                        z = true;
                    }
                }
            }
            containerNode2 = aVar.mo15640a();
            continue;
        } while (containerNode2 != null);
        return containerNode;
    }

    public final ObjectNode _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, C2003a aVar) throws IOException {
        g53 g53;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String f = jsonParser.mo13964f();
        while (f != null) {
            JsonToken N0 = jsonParser.mo13938N0();
            if (N0 == null) {
                N0 = JsonToken.NOT_AVAILABLE;
            }
            int id = N0.mo14000id();
            if (id == 1) {
                g53 = _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, aVar, jsonNodeFactory.objectNode());
            } else if (id != 3) {
                g53 = _deserializeAnyScalar(jsonParser, deserializationContext);
            } else {
                g53 = _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, aVar, jsonNodeFactory.arrayNode());
            }
            g53 g532 = g53;
            g53 replace = objectNode.replace(f, g532);
            if (replace != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, f, objectNode, replace, g532);
            }
            f = jsonParser.mo13930E0();
        }
        return objectNode;
    }

    public final g53 _deserializeRareScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int h = jsonParser.mo13967h();
        if (h == 2) {
            return deserializationContext.getNodeFactory().objectNode();
        }
        if (h == 8) {
            return _fromFloat(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
        }
        if (h != 12) {
            return (g53) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
        return _fromEmbedded(jsonParser, deserializationContext);
    }

    public final g53 _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        Object A = jsonParser.mo13924A();
        if (A == null) {
            return nodeFactory.nullNode();
        }
        if (A.getClass() == byte[].class) {
            return nodeFactory.binaryNode((byte[]) A);
        }
        if (A instanceof l75) {
            return nodeFactory.rawValueNode((l75) A);
        }
        if (A instanceof g53) {
            return (g53) A;
        }
        return nodeFactory.pojoNode(A);
    }

    public final g53 _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType K = jsonParser.mo13935K();
        if (K == JsonParser.NumberType.BIG_DECIMAL) {
            return jsonNodeFactory.numberNode(jsonParser.mo13988y());
        }
        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            if (jsonParser.mo13929D0()) {
                return jsonNodeFactory.numberNode(jsonParser.mo13990z());
            }
            return jsonNodeFactory.numberNode(jsonParser.mo13988y());
        } else if (K == JsonParser.NumberType.FLOAT) {
            return jsonNodeFactory.numberNode(jsonParser.mo13927C());
        } else {
            return jsonNodeFactory.numberNode(jsonParser.mo13990z());
        }
    }

    public final g53 _fromInt(JsonParser jsonParser, int i, JsonNodeFactory jsonNodeFactory) throws IOException {
        if (i == 0) {
            JsonParser.NumberType K = jsonParser.mo13935K();
            if (K == JsonParser.NumberType.INT) {
                return jsonNodeFactory.numberNode(jsonParser.mo13933I());
            }
            if (K == JsonParser.NumberType.LONG) {
                return jsonNodeFactory.numberNode(jsonParser.mo13934J());
            }
            return jsonNodeFactory.numberNode(jsonParser.mo13971j());
        } else if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i)) {
            return jsonNodeFactory.numberNode(jsonParser.mo13971j());
        } else {
            return jsonNodeFactory.numberNode(jsonParser.mo13934J());
        }
    }

    public void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, g53 g53, g53 g532) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch((Class<?>) g53.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
        if (!deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            return;
        }
        if (g53.isArray()) {
            ((ArrayNode) g53).add(g532);
            objectNode.replace(str, g53);
            return;
        }
        ArrayNode arrayNode = jsonNodeFactory.arrayNode();
        arrayNode.add(g53);
        arrayNode.add(g532);
        objectNode.replace(str, arrayNode);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return j07.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public boolean isCachable() {
        return true;
    }

    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    public final g53 updateObject(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode, C2003a aVar) throws IOException {
        String str;
        g53 g53;
        if (jsonParser.mo13928C0()) {
            str = jsonParser.mo13930E0();
        } else if (!jsonParser.mo13984s0(JsonToken.FIELD_NAME)) {
            return (g53) deserialize(jsonParser, deserializationContext);
        } else {
            str = jsonParser.mo13964f();
        }
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        while (str != null) {
            JsonToken N0 = jsonParser.mo13938N0();
            g53 g532 = objectNode.get(str);
            if (g532 != null) {
                if (g532 instanceof ObjectNode) {
                    if (N0 == JsonToken.START_OBJECT) {
                        g53 updateObject = updateObject(jsonParser, deserializationContext, (ObjectNode) g532, aVar);
                        if (updateObject != g532) {
                            objectNode.set(str, updateObject);
                        }
                        str = jsonParser.mo13930E0();
                    }
                } else if ((g532 instanceof ArrayNode) && N0 == JsonToken.START_ARRAY) {
                    _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, aVar, (ArrayNode) g532);
                    str = jsonParser.mo13930E0();
                }
            }
            if (N0 == null) {
                N0 = JsonToken.NOT_AVAILABLE;
            }
            int id = N0.mo14000id();
            if (id == 1) {
                g53 = _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, aVar, nodeFactory.objectNode());
            } else if (id == 3) {
                g53 = _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, aVar, nodeFactory.arrayNode());
            } else if (id == 6) {
                g53 = nodeFactory.textNode(jsonParser.mo13947W());
            } else if (id != 7) {
                switch (id) {
                    case 9:
                        g53 = nodeFactory.booleanNode(true);
                        break;
                    case 10:
                        g53 = nodeFactory.booleanNode(false);
                        break;
                    case 11:
                        g53 = nodeFactory.nullNode();
                        break;
                    default:
                        g53 = _deserializeRareScalar(jsonParser, deserializationContext);
                        break;
                }
            } else {
                g53 = _fromInt(jsonParser, deserializationContext, nodeFactory);
            }
            objectNode.set(str, g53);
            str = jsonParser.mo13930E0();
        }
        return objectNode;
    }

    public final g53 _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberType;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        if ((StdDeserializer.F_MASK_INT_COERCIONS & deserializationFeatures) == 0) {
            numberType = jsonParser.mo13935K();
        } else if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures)) {
            numberType = JsonParser.NumberType.BIG_INTEGER;
        } else if (DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures)) {
            numberType = JsonParser.NumberType.LONG;
        } else {
            numberType = jsonParser.mo13935K();
        }
        if (numberType == JsonParser.NumberType.INT) {
            return jsonNodeFactory.numberNode(jsonParser.mo13933I());
        }
        if (numberType == JsonParser.NumberType.LONG) {
            return jsonNodeFactory.numberNode(jsonParser.mo13934J());
        }
        return jsonNodeFactory.numberNode(jsonParser.mo13971j());
    }
}
