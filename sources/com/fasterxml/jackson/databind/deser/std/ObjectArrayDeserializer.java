package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Objects;

@zz2
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object[]> implements js0 {
    private static final long serialVersionUID = 1;
    public final Class<?> _elementClass;
    public o43<Object> _elementDeserializer;
    public final j07 _elementTypeDeserializer;
    public final Object[] _emptyValue;
    public final boolean _untyped;

    public ObjectArrayDeserializer(JavaType javaType, o43<Object> o43, j07 j07) {
        super(javaType, (bc4) null, (Boolean) null);
        ArrayType arrayType = (ArrayType) javaType;
        Class<?> rawClass = arrayType.getContentType().getRawClass();
        this._elementClass = rawClass;
        this._untyped = rawClass == Object.class;
        this._elementDeserializer = o43;
        this._elementTypeDeserializer = j07;
        this._emptyValue = arrayType.getEmptyArray();
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        o43 o43;
        o43 o432 = this._elementDeserializer;
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._containerType.getRawClass(), JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        o43 findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, o432);
        JavaType contentType = this._containerType.getContentType();
        if (findConvertingContentDeserializer == null) {
            o43 = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            o43 = deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, contentType);
        }
        j07 j07 = this._elementTypeDeserializer;
        if (j07 != null) {
            j07 = j07.forProperty(beanProperty);
        }
        return withResolved(j07, o43, findContentNullProvider(deserializationContext, beanProperty, o43), findFormatFeature);
    }

    public Byte[] deserializeFromBase64(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        byte[] l = jsonParser.mo13975l(deserializationContext.getBase64Variant());
        Byte[] bArr = new Byte[l.length];
        int length = l.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = Byte.valueOf(l[i]);
        }
        return bArr;
    }

    public o43<Object> getContentDeserializer() {
        return this._elementDeserializer;
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._emptyValue;
    }

    public Object[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        boolean z;
        Object obj;
        Object[] objArr;
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
                j07 j07 = this._elementTypeDeserializer;
                if (j07 == null) {
                    obj = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, j07);
                }
            } else if (this._skipNullValues) {
                return this._emptyValue;
            } else {
                obj = this._nullProvider.getNullValue(deserializationContext);
            }
            if (this._untyped) {
                objArr = new Object[1];
            } else {
                objArr = (Object[]) Array.newInstance(this._elementClass, 1);
            }
            objArr[0] = obj;
            return objArr;
        } else if (!jsonParser.mo13984s0(JsonToken.VALUE_STRING)) {
            return (Object[]) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        } else {
            if (this._elementClass == Byte.class) {
                return deserializeFromBase64(jsonParser, deserializationContext);
            }
            return (Object[]) _deserializeFromString(jsonParser, deserializationContext);
        }
    }

    public boolean isCachable() {
        if (this._elementDeserializer == null && this._elementTypeDeserializer == null) {
            return true;
        }
        return false;
    }

    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    public ObjectArrayDeserializer withDeserializer(j07 j07, o43<?> o43) {
        return withResolved(j07, o43, this._nullProvider, this._unwrapSingle);
    }

    public ObjectArrayDeserializer withResolved(j07 j07, o43<?> o43, bc4 bc4, Boolean bool) {
        if (Objects.equals(bool, this._unwrapSingle) && bc4 == this._nullProvider && o43 == this._elementDeserializer && j07 == this._elementTypeDeserializer) {
            return this;
        }
        return new ObjectArrayDeserializer(this, o43, j07, bc4, bool);
    }

    public Object[] deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return (Object[]) j07.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object[] objArr;
        Object obj;
        if (!jsonParser.mo13926B0()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        we4 leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] i = leaseObjectBuffer.mo27498i();
        j07 j07 = this._elementTypeDeserializer;
        int i2 = 0;
        while (true) {
            try {
                JsonToken N0 = jsonParser.mo13938N0();
                if (N0 == JsonToken.END_ARRAY) {
                    break;
                }
                if (N0 == JsonToken.VALUE_NULL) {
                    if (!this._skipNullValues) {
                        obj = this._nullProvider.getNullValue(deserializationContext);
                    }
                } else if (j07 == null) {
                    obj = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, j07);
                }
                if (i2 >= i.length) {
                    i = leaseObjectBuffer.mo27492c(i);
                    i2 = 0;
                }
                int i3 = i2 + 1;
                try {
                    i[i2] = obj;
                    i2 = i3;
                } catch (Exception e) {
                    e = e;
                    i2 = i3;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) i, leaseObjectBuffer.mo27493d() + i2);
                }
            } catch (Exception e2) {
                e = e2;
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) i, leaseObjectBuffer.mo27493d() + i2);
            }
        }
        if (this._untyped) {
            objArr = leaseObjectBuffer.mo27495f(i, i2);
        } else {
            objArr = leaseObjectBuffer.mo27496g(i, i2, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
        return objArr;
    }

    public ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, o43<Object> o43, j07 j07, bc4 bc4, Boolean bool) {
        super((ContainerDeserializerBase<?>) objectArrayDeserializer, bc4, bool);
        this._elementClass = objectArrayDeserializer._elementClass;
        this._untyped = objectArrayDeserializer._untyped;
        this._emptyValue = objectArrayDeserializer._emptyValue;
        this._elementDeserializer = o43;
        this._elementTypeDeserializer = j07;
    }

    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        Object[] objArr2;
        Object obj;
        if (!jsonParser.mo13926B0()) {
            Object[] handleNonArray = handleNonArray(jsonParser, deserializationContext);
            if (handleNonArray == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr3 = new Object[(handleNonArray.length + length)];
            System.arraycopy(objArr, 0, objArr3, 0, length);
            System.arraycopy(handleNonArray, 0, objArr3, length, handleNonArray.length);
            return objArr3;
        }
        we4 leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = objArr.length;
        Object[] j = leaseObjectBuffer.mo27499j(objArr, length2);
        j07 j07 = this._elementTypeDeserializer;
        while (true) {
            try {
                JsonToken N0 = jsonParser.mo13938N0();
                if (N0 == JsonToken.END_ARRAY) {
                    break;
                }
                if (N0 == JsonToken.VALUE_NULL) {
                    if (!this._skipNullValues) {
                        obj = this._nullProvider.getNullValue(deserializationContext);
                    }
                } else if (j07 == null) {
                    obj = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, j07);
                }
                if (length2 >= j.length) {
                    j = leaseObjectBuffer.mo27492c(j);
                    length2 = 0;
                }
                int i = length2 + 1;
                try {
                    j[length2] = obj;
                    length2 = i;
                } catch (Exception e) {
                    e = e;
                    length2 = i;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) j, leaseObjectBuffer.mo27493d() + length2);
                }
            } catch (Exception e2) {
                e = e2;
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) j, leaseObjectBuffer.mo27493d() + length2);
            }
        }
        if (this._untyped) {
            objArr2 = leaseObjectBuffer.mo27495f(j, length2);
        } else {
            objArr2 = leaseObjectBuffer.mo27496g(j, length2, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
        return objArr2;
    }
}
