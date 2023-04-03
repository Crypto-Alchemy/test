package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.IllformedLocaleException;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {

    public static class Std extends FromStringDeserializer<Object> {
        public static final String LOCALE_EXT_MARKER = "_#";
        public static final int STD_CHARSET = 9;
        public static final int STD_CLASS = 4;
        public static final int STD_CURRENCY = 6;
        public static final int STD_FILE = 1;
        public static final int STD_INET_ADDRESS = 11;
        public static final int STD_INET_SOCKET_ADDRESS = 12;
        public static final int STD_JAVA_TYPE = 5;
        public static final int STD_LOCALE = 8;
        public static final int STD_PATTERN = 7;
        public static final int STD_TIME_ZONE = 10;
        public static final int STD_URI = 3;
        public static final int STD_URL = 2;
        private static final long serialVersionUID = 1;
        public final int _kind;

        public Std(Class<?> cls, int i) {
            super(cls);
            this._kind = i;
        }

        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            int i;
            switch (this._kind) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return deserializationContext.findClass(str);
                    } catch (Exception e) {
                        return deserializationContext.handleInstantiationProblem(this._valueClass, str, wf0.m29479F(e));
                    }
                case 5:
                    return deserializationContext.getTypeFactory().constructFromCanonical(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    return mo15687b(str, deserializationContext);
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int lastIndexOf = str.lastIndexOf(93);
                        if (lastIndexOf != -1) {
                            int indexOf = str.indexOf(58, lastIndexOf);
                            if (indexOf > -1) {
                                i = Integer.parseInt(str.substring(indexOf + 1));
                            } else {
                                i = 0;
                            }
                            return new InetSocketAddress(str.substring(0, lastIndexOf + 1), i);
                        }
                        throw new InvalidFormatException(deserializationContext.getParser(), "Bracketed IPv6 address must contain closing bracket", (Object) str, (Class<?>) InetSocketAddress.class);
                    }
                    int indexOf2 = str.indexOf(58);
                    if (indexOf2 >= 0) {
                        int i2 = indexOf2 + 1;
                        if (str.indexOf(58, i2) < 0) {
                            return new InetSocketAddress(str.substring(0, indexOf2), Integer.parseInt(str.substring(i2)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                default:
                    c97.m11761c();
                    return null;
            }
        }

        public Object _deserializeFromEmptyStringDefault(DeserializationContext deserializationContext) throws IOException {
            return getEmptyValue(deserializationContext);
        }

        public int _firstHyphenOrUnderscore(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '_' || charAt == '-') {
                    return i;
                }
            }
            return -1;
        }

        public boolean _shouldTrim() {
            if (this._kind != 7) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Locale mo15686a(String str, int i, String str2, String str3, int i2) {
            String str4 = "";
            if (i2 > 0 && i2 > i) {
                try {
                    str4 = str.substring(i + 1, i2);
                } catch (IllformedLocaleException unused) {
                    return new Locale(str2, str3, str4);
                }
            }
            String substring = str.substring(i2 + 2);
            if (substring.indexOf(95) < 0 && substring.indexOf(45) < 0) {
                return new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(str4).setScript(substring).build();
            }
            if (substring.indexOf(95) < 0) {
                return new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(str4).setExtension(substring.charAt(0), substring.substring(substring.indexOf(45) + 1)).build();
            }
            int indexOf = substring.indexOf(95);
            return new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(str4).setScript(substring.substring(0, indexOf)).setExtension(substring.charAt(indexOf + 1), substring.substring(indexOf + 3)).build();
        }

        /* renamed from: b */
        public final Locale mo15687b(String str, DeserializationContext deserializationContext) throws IOException {
            int _firstHyphenOrUnderscore = _firstHyphenOrUnderscore(str);
            if (_firstHyphenOrUnderscore < 0) {
                return new Locale(str);
            }
            String substring = str.substring(0, _firstHyphenOrUnderscore);
            String substring2 = str.substring(_firstHyphenOrUnderscore + 1);
            int _firstHyphenOrUnderscore2 = _firstHyphenOrUnderscore(substring2);
            if (_firstHyphenOrUnderscore2 < 0) {
                return new Locale(substring, substring2);
            }
            String substring3 = substring2.substring(0, _firstHyphenOrUnderscore2);
            int indexOf = substring2.indexOf(LOCALE_EXT_MARKER);
            if (indexOf < 0) {
                return new Locale(substring, substring3, substring2.substring(_firstHyphenOrUnderscore2 + 1));
            }
            return mo15686a(substring2, _firstHyphenOrUnderscore2, substring, substring3, indexOf);
        }

        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            int i = this._kind;
            if (i == 3) {
                return URI.create("");
            }
            if (i != 8) {
                return super.getEmptyValue(deserializationContext);
            }
            return Locale.ROOT;
        }
    }

    public static class StringBufferDeserializer extends FromStringDeserializer<Object> {
        public StringBufferDeserializer() {
            super(StringBuffer.class);
        }

        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            return new StringBuffer(str);
        }

        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String k0 = jsonParser.mo13974k0();
            if (k0 != null) {
                return _deserialize(k0, deserializationContext);
            }
            return FromStringDeserializer.super.deserialize(jsonParser, deserializationContext);
        }

        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return new StringBuffer();
        }

        public LogicalType logicalType() {
            return LogicalType.Textual;
        }
    }

    public static class StringBuilderDeserializer extends FromStringDeserializer<Object> {
        public StringBuilderDeserializer() {
            super(StringBuilder.class);
        }

        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            return new StringBuilder(str);
        }

        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String k0 = jsonParser.mo13974k0();
            if (k0 != null) {
                return _deserialize(k0, deserializationContext);
            }
            return FromStringDeserializer.super.deserialize(jsonParser, deserializationContext);
        }

        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return new StringBuilder();
        }

        public LogicalType logicalType() {
            return LogicalType.Textual;
        }
    }

    public FromStringDeserializer(Class<?> cls) {
        super(cls);
    }

    public static FromStringDeserializer<?> findDeserializer(Class<?> cls) {
        int i;
        if (cls == File.class) {
            i = 1;
        } else if (cls == URL.class) {
            i = 2;
        } else if (cls == URI.class) {
            i = 3;
        } else if (cls == Class.class) {
            i = 4;
        } else if (cls == JavaType.class) {
            i = 5;
        } else if (cls == Currency.class) {
            i = 6;
        } else if (cls == Pattern.class) {
            i = 7;
        } else if (cls == Locale.class) {
            i = 8;
        } else if (cls == Charset.class) {
            i = 9;
        } else if (cls == TimeZone.class) {
            i = 10;
        } else if (cls == InetAddress.class) {
            i = 11;
        } else if (cls == InetSocketAddress.class) {
            i = 12;
        } else if (cls == StringBuilder.class) {
            return new StringBuilderDeserializer();
        } else {
            if (cls == StringBuffer.class) {
                return new StringBufferDeserializer();
            }
            return null;
        }
        return new Std(cls, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<?>[] types() {
        /*
            r0 = 14
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<java.io.File> r2 = java.io.File.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<java.net.URL> r2 = java.net.URL.class
            r0[r1] = r2
            r1 = 2
            java.lang.Class<java.net.URI> r2 = java.net.URI.class
            r0[r1] = r2
            r1 = 3
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r0[r1] = r2
            r1 = 4
            java.lang.Class<com.fasterxml.jackson.databind.JavaType> r2 = com.fasterxml.jackson.databind.JavaType.class
            r0[r1] = r2
            r1 = 5
            java.lang.Class<java.util.Currency> r2 = java.util.Currency.class
            r0[r1] = r2
            r1 = 6
            java.lang.Class<java.util.regex.Pattern> r2 = java.util.regex.Pattern.class
            r0[r1] = r2
            r1 = 7
            java.lang.Class<java.util.Locale> r2 = java.util.Locale.class
            r0[r1] = r2
            r1 = 8
            java.lang.Class<java.nio.charset.Charset> r2 = java.nio.charset.Charset.class
            r0[r1] = r2
            r1 = 9
            java.lang.Class<java.util.TimeZone> r2 = java.util.TimeZone.class
            r0[r1] = r2
            r1 = 10
            java.lang.Class<java.net.InetAddress> r2 = java.net.InetAddress.class
            r0[r1] = r2
            r1 = 11
            java.lang.Class<java.net.InetSocketAddress> r2 = java.net.InetSocketAddress.class
            r0[r1] = r2
            r1 = 12
            java.lang.Class<java.lang.StringBuilder> r2 = java.lang.StringBuilder.class
            r0[r1] = r2
            r1 = 13
            java.lang.Class<java.lang.StringBuffer> r2 = java.lang.StringBuffer.class
            r0[r1] = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.types():java.lang.Class[]");
    }

    public abstract T _deserialize(String str, DeserializationContext deserializationContext) throws IOException;

    public T _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportInputMismatch((o43<?>) this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this._valueClass.getName());
        return null;
    }

    @Deprecated
    public final T _deserializeFromEmptyString() throws IOException {
        return null;
    }

    public Object _deserializeFromEmptyString(DeserializationContext deserializationContext) throws IOException {
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.EmptyString);
        if (findCoercionAction == CoercionAction.Fail) {
            deserializationContext.reportInputMismatch((o43<?>) this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", _coercedTypeDesc());
        }
        if (findCoercionAction == CoercionAction.AsNull) {
            return getNullValue(deserializationContext);
        }
        if (findCoercionAction == CoercionAction.AsEmpty) {
            return getEmptyValue(deserializationContext);
        }
        return _deserializeFromEmptyStringDefault(deserializationContext);
    }

    public Object _deserializeFromEmptyStringDefault(DeserializationContext deserializationContext) throws IOException {
        return getNullValue(deserializationContext);
    }

    public Object _deserializeFromOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        if (jsonToken == JsonToken.START_ARRAY) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT) {
            return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        Object A = jsonParser.mo13924A();
        if (A == null) {
            return null;
        }
        if (this._valueClass.isAssignableFrom(A.getClass())) {
            return A;
        }
        return _deserializeEmbedded(A, deserializationContext);
    }

    public boolean _shouldTrim() {
        return true;
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String k0 = jsonParser.mo13974k0();
        if (k0 == null) {
            JsonToken g = jsonParser.mo13965g();
            if (g != JsonToken.START_OBJECT) {
                return _deserializeFromOther(jsonParser, deserializationContext, g);
            }
            k0 = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        }
        if (k0.isEmpty()) {
            return _deserializeFromEmptyString(deserializationContext);
        }
        if (_shouldTrim()) {
            String trim = k0.trim();
            if (trim != k0 && trim.isEmpty()) {
                return _deserializeFromEmptyString(deserializationContext);
            }
            k0 = trim;
        }
        try {
            return _deserialize(k0, deserializationContext);
        } catch (IllegalArgumentException | MalformedURLException e) {
            String str = "not a valid textual representation";
            String message = e.getMessage();
            if (message != null) {
                str = str + ", problem: " + message;
            }
            throw deserializationContext.weirdStringException(k0, this._valueClass, str).withCause(e);
        }
    }

    public LogicalType logicalType() {
        return LogicalType.OtherScalar;
    }
}
