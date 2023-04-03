package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.util.Objects;

@zz2
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements js0 {

    /* renamed from: a */
    public static final String[] f9976a = new String[0];
    public static final StringArrayDeserializer instance = new StringArrayDeserializer();
    private static final long serialVersionUID = 2;
    public o43<String> _elementDeserializer;
    public final bc4 _nullProvider;
    public final boolean _skipNullValues;
    public final Boolean _unwrapSingle;

    public StringArrayDeserializer() {
        this((o43<?>) null, (bc4) null, (Boolean) null);
    }

    public final String[] _deserializeCustom(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        Object[] objArr;
        int i;
        String str;
        Class<String> cls = String.class;
        we4 leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        if (strArr == null) {
            objArr = leaseObjectBuffer.mo27498i();
            i = 0;
        } else {
            i = strArr.length;
            objArr = leaseObjectBuffer.mo27499j(strArr, i);
        }
        o43<String> o43 = this._elementDeserializer;
        while (true) {
            try {
                if (jsonParser.mo13932G0() == null) {
                    JsonToken g = jsonParser.mo13965g();
                    if (g == JsonToken.END_ARRAY) {
                        String[] strArr2 = (String[]) leaseObjectBuffer.mo27496g(objArr, i, cls);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr2;
                    } else if (g != JsonToken.VALUE_NULL) {
                        str = o43.deserialize(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        str = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                } else {
                    str = o43.deserialize(jsonParser, deserializationContext);
                }
                if (i >= objArr.length) {
                    objArr = leaseObjectBuffer.mo27492c(objArr);
                    i = 0;
                }
                int i2 = i + 1;
                try {
                    objArr[i] = str;
                    i = i2;
                } catch (Exception e) {
                    e = e;
                    i = i2;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) cls, i);
                }
            } catch (Exception e2) {
                e = e2;
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) cls, i);
            }
        }
    }

    /* renamed from: a */
    public final String[] mo15836a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        boolean z;
        String str;
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
                str = (String) this._nullProvider.getNullValue(deserializationContext);
            } else {
                str = _parseString(jsonParser, deserializationContext);
            }
            return new String[]{str};
        } else if (jsonParser.mo13984s0(JsonToken.VALUE_STRING)) {
            return (String[]) _deserializeFromString(jsonParser, deserializationContext);
        } else {
            return (String[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        o43 o43;
        o43 findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._elementDeserializer);
        JavaType constructType = deserializationContext.constructType(String.class);
        if (findConvertingContentDeserializer == null) {
            o43 = deserializationContext.findContextualValueDeserializer(constructType, beanProperty);
        } else {
            o43 = deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, constructType);
        }
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, String[].class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        bc4 findContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, o43);
        if (o43 != null && isDefaultDeserializer(o43)) {
            o43 = null;
        }
        if (this._elementDeserializer == o43 && Objects.equals(this._unwrapSingle, findFormatFeature) && this._nullProvider == findContentNullProvider) {
            return this;
        }
        return new StringArrayDeserializer(o43, findContentNullProvider, findFormatFeature);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return j07.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return f9976a;
    }

    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public StringArrayDeserializer(o43<?> o43, bc4 bc4, Boolean bool) {
        super((Class<?>) String[].class);
        this._elementDeserializer = o43;
        this._nullProvider = bc4;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(bc4);
    }

    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.mo13926B0()) {
            return mo15836a(jsonParser, deserializationContext);
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, (String[]) null);
        }
        we4 leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] i = leaseObjectBuffer.mo27498i();
        int i2 = 0;
        while (true) {
            try {
                String G0 = jsonParser.mo13932G0();
                if (G0 == null) {
                    JsonToken g = jsonParser.mo13965g();
                    if (g == JsonToken.END_ARRAY) {
                        String[] strArr = (String[]) leaseObjectBuffer.mo27496g(i, i2, String.class);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr;
                    } else if (g != JsonToken.VALUE_NULL) {
                        G0 = _parseString(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        G0 = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                }
                if (i2 >= i.length) {
                    i = leaseObjectBuffer.mo27492c(i);
                    i2 = 0;
                }
                int i3 = i2 + 1;
                try {
                    i[i2] = G0;
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
    }

    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        if (!jsonParser.mo13926B0()) {
            String[] a = mo15836a(jsonParser, deserializationContext);
            if (a == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[(a.length + length)];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(a, 0, strArr2, length, a.length);
            return strArr2;
        } else if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, strArr);
        } else {
            we4 leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            int length2 = strArr.length;
            Object[] j = leaseObjectBuffer.mo27499j(strArr, length2);
            while (true) {
                try {
                    String G0 = jsonParser.mo13932G0();
                    if (G0 == null) {
                        JsonToken g = jsonParser.mo13965g();
                        if (g == JsonToken.END_ARRAY) {
                            String[] strArr3 = (String[]) leaseObjectBuffer.mo27496g(j, length2, String.class);
                            deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                            return strArr3;
                        } else if (g != JsonToken.VALUE_NULL) {
                            G0 = _parseString(jsonParser, deserializationContext);
                        } else if (this._skipNullValues) {
                            return f9976a;
                        } else {
                            G0 = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    }
                    if (length2 >= j.length) {
                        j = leaseObjectBuffer.mo27492c(j);
                        length2 = 0;
                    }
                    int i = length2 + 1;
                    try {
                        j[length2] = G0;
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
        }
    }
}
