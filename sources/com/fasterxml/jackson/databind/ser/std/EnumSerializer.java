package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Objects;
import org.web3j.abi.datatypes.Utf8String;

@zz2
public class EnumSerializer extends StdScalarSerializer<Enum<?>> implements ls0 {
    private static final long serialVersionUID = 1;
    public final Boolean _serializeAsIndex;
    public final EnumValues _values;

    public EnumSerializer(EnumValues enumValues, Boolean bool) {
        super(enumValues.getEnumClass(), false);
        this._values = enumValues;
        this._serializeAsIndex = bool;
    }

    public static Boolean _isShapeWrittenUsingIndex(Class<?> cls, JsonFormat.Value value, boolean z, Boolean bool) {
        JsonFormat.Shape shape;
        String str;
        if (value == null) {
            shape = null;
        } else {
            shape = value.getShape();
        }
        if (shape == null || shape == JsonFormat.Shape.ANY || shape == JsonFormat.Shape.SCALAR) {
            return bool;
        }
        if (shape == JsonFormat.Shape.STRING || shape == JsonFormat.Shape.NATURAL) {
            return Boolean.FALSE;
        }
        if (shape.isNumeric() || shape == JsonFormat.Shape.ARRAY) {
            return Boolean.TRUE;
        }
        Object[] objArr = new Object[3];
        objArr[0] = shape;
        objArr[1] = cls.getName();
        if (z) {
            str = "class";
        } else {
            str = "property";
        }
        objArr[2] = str;
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", objArr));
    }

    public static EnumSerializer construct(Class<?> cls, SerializationConfig serializationConfig, n00 n00, JsonFormat.Value value) {
        return new EnumSerializer(EnumValues.constructFromName(serializationConfig, cls), _isShapeWrittenUsingIndex(cls, value, true, (Boolean) null));
    }

    public final boolean _serializeAsIndex(zw5 zw5) {
        Boolean bool = this._serializeAsIndex;
        if (bool != null) {
            return bool.booleanValue();
        }
        return zw5.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        zw5 b = t43.mo25637b();
        if (_serializeAsIndex(b)) {
            visitIntFormat(t43, javaType, JsonParser.NumberType.INT);
            return;
        }
        b73 i = t43.mo26056i(javaType);
        if (i != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (b == null || !b.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                for (qw5 value : this._values.values()) {
                    linkedHashSet.add(value.getValue());
                }
            } else {
                for (Enum<?> enumR : this._values.enums()) {
                    linkedHashSet.add(enumR.toString());
                }
            }
            i.mo22677b(linkedHashSet);
        }
    }

    public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(zw5, beanProperty, handledType());
        if (findFormatOverrides != null) {
            Boolean _isShapeWrittenUsingIndex = _isShapeWrittenUsingIndex(handledType(), findFormatOverrides, false, this._serializeAsIndex);
            if (!Objects.equals(_isShapeWrittenUsingIndex, this._serializeAsIndex)) {
                return new EnumSerializer(this._values, _isShapeWrittenUsingIndex);
            }
        }
        return this;
    }

    public EnumValues getEnumValues() {
        return this._values;
    }

    public g53 getSchema(zw5 zw5, Type type) {
        if (_serializeAsIndex(zw5)) {
            return createSchemaNode("integer", true);
        }
        ObjectNode createSchemaNode = createSchemaNode(Utf8String.TYPE_NAME, true);
        if (type != null && zw5.constructType(type).isEnumType()) {
            ArrayNode putArray = createSchemaNode.putArray("enum");
            for (qw5 value : this._values.values()) {
                putArray.add(value.getValue());
            }
        }
        return createSchemaNode;
    }

    public final void serialize(Enum<?> enumR, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (_serializeAsIndex(zw5)) {
            jsonGenerator.mo13880h0(enumR.ordinal());
        } else if (zw5.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.mo13860Z0(enumR.toString());
        } else {
            jsonGenerator.mo13859Y0(this._values.serializedValueFor(enumR));
        }
    }
}
