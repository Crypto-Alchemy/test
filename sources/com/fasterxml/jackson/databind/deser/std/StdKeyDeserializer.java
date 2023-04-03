package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@zz2
public class StdKeyDeserializer extends ha3 implements Serializable {
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_BYTE = 2;
    public static final int TYPE_BYTE_ARRAY = 17;
    public static final int TYPE_CALENDAR = 11;
    public static final int TYPE_CHAR = 4;
    public static final int TYPE_CLASS = 15;
    public static final int TYPE_CURRENCY = 16;
    public static final int TYPE_DATE = 10;
    public static final int TYPE_DOUBLE = 8;
    public static final int TYPE_FLOAT = 7;
    public static final int TYPE_INT = 5;
    public static final int TYPE_LOCALE = 9;
    public static final int TYPE_LONG = 6;
    public static final int TYPE_SHORT = 3;
    public static final int TYPE_URI = 13;
    public static final int TYPE_URL = 14;
    public static final int TYPE_UUID = 12;
    private static final long serialVersionUID = 1;
    public final FromStringDeserializer<?> _deser;
    public final Class<?> _keyClass;
    public final int _kind;

    public static final class DelegatingKD extends ha3 implements Serializable {
        private static final long serialVersionUID = 1;
        public final o43<?> _delegate;
        public final Class<?> _keyClass;

        public DelegatingKD(Class<?> cls, o43<?> o43) {
            this._keyClass = cls;
            this._delegate = o43;
        }

        public final Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            if (str == null) {
                return null;
            }
            fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering();
            bufferForInputBuffering.mo13860Z0(str);
            try {
                JsonParser x1 = bufferForInputBuffering.mo20092x1();
                x1.mo13938N0();
                Object deserialize = this._delegate.deserialize(x1, deserializationContext);
                if (deserialize != null) {
                    return deserialize;
                }
                return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
            } catch (Exception e) {
                return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation: %s", e.getMessage());
            }
        }

        public Class<?> getKeyClass() {
            return this._keyClass;
        }
    }

    @zz2
    public static final class EnumKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        public final EnumResolver _byNameResolver;
        public EnumResolver _byToStringResolver;
        public final Enum<?> _enumDefaultValue;
        public final AnnotatedMethod _factory;

        public EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.getEnumClass());
            this._byNameResolver = enumResolver;
            this._factory = annotatedMethod;
            this._enumDefaultValue = enumResolver.getDefaultValue();
        }

        public Object _parse(String str, DeserializationContext deserializationContext) throws IOException {
            EnumResolver enumResolver;
            AnnotatedMethod annotatedMethod = this._factory;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.call1(str);
                } catch (Exception e) {
                    wf0.m29523l0(e);
                }
            }
            if (deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
                enumResolver = mo15819a(deserializationContext);
            } else {
                enumResolver = this._byNameResolver;
            }
            Enum<?> findEnum = enumResolver.findEnum(str);
            if (findEnum != null) {
                return findEnum;
            }
            if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this._enumDefaultValue;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return findEnum;
            }
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not one of the values accepted for Enum class: %s", enumResolver.getEnumIds());
        }

        /* renamed from: a */
        public final EnumResolver mo15819a(DeserializationContext deserializationContext) {
            EnumResolver enumResolver = this._byToStringResolver;
            if (enumResolver == null) {
                synchronized (this) {
                    enumResolver = EnumResolver.constructUsingToString(deserializationContext.getConfig(), (Class<?>) this._byNameResolver.getEnumClass());
                    this._byToStringResolver = enumResolver;
                }
            }
            return enumResolver;
        }
    }

    public static final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        public final Constructor<?> _ctor;

        public StringCtorKeyDeserializer(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this._ctor = constructor;
        }

        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._ctor.newInstance(new Object[]{str});
        }
    }

    public static final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        public final Method _factoryMethod;

        public StringFactoryKeyDeserializer(Method method) {
            super(-1, method.getDeclaringClass());
            this._factoryMethod = method;
        }

        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._factoryMethod.invoke((Object) null, new Object[]{str});
        }
    }

    @zz2
    public static final class StringKD extends StdKeyDeserializer {

        /* renamed from: a */
        public static final StringKD f9974a = new StringKD(String.class);

        /* renamed from: d */
        public static final StringKD f9975d = new StringKD(Object.class);
        private static final long serialVersionUID = 1;

        public StringKD(Class<?> cls) {
            super(-1, cls);
        }

        public static StringKD forType(Class<?> cls) {
            if (cls == String.class) {
                return f9974a;
            }
            if (cls == Object.class) {
                return f9975d;
            }
            return new StringKD(cls);
        }

        public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            return str;
        }
    }

    public StdKeyDeserializer(int i, Class<?> cls) {
        this(i, cls, (FromStringDeserializer<?>) null);
    }

    public static StdKeyDeserializer forType(Class<?> cls) {
        int i;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class || cls == Serializable.class) {
            return StringKD.forType(cls);
        }
        if (cls == UUID.class) {
            i = 12;
        } else if (cls == Integer.class) {
            i = 5;
        } else if (cls == Long.class) {
            i = 6;
        } else if (cls == Date.class) {
            i = 10;
        } else if (cls == Calendar.class) {
            i = 11;
        } else if (cls == Boolean.class) {
            i = 1;
        } else if (cls == Byte.class) {
            i = 2;
        } else if (cls == Character.class) {
            i = 4;
        } else if (cls == Short.class) {
            i = 3;
        } else if (cls == Float.class) {
            i = 7;
        } else if (cls == Double.class) {
            i = 8;
        } else if (cls == URI.class) {
            i = 13;
        } else if (cls == URL.class) {
            i = 14;
        } else if (cls == Class.class) {
            i = 15;
        } else if (cls == Locale.class) {
            return new StdKeyDeserializer(9, cls, FromStringDeserializer.findDeserializer(Locale.class));
        } else {
            if (cls == Currency.class) {
                return new StdKeyDeserializer(16, cls, FromStringDeserializer.findDeserializer(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i = 17;
        }
        return new StdKeyDeserializer(i, cls);
    }

    public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
        switch (this._kind) {
            case 1:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(str)) {
                    return Boolean.FALSE;
                }
                return deserializationContext.handleWeirdKey(this._keyClass, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int _parseInt = _parseInt(str);
                if (_parseInt < -128 || _parseInt > 255) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                }
                return Byte.valueOf((byte) _parseInt);
            case 3:
                int _parseInt2 = _parseInt(str);
                if (_parseInt2 < -32768 || _parseInt2 > 32767) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                }
                return Short.valueOf((short) _parseInt2);
            case 4:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                return deserializationContext.handleWeirdKey(this._keyClass, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(_parseInt(str));
            case 6:
                return Long.valueOf(_parseLong(str));
            case 7:
                return Float.valueOf((float) _parseDouble(str));
            case 8:
                return Double.valueOf(_parseDouble(str));
            case 9:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e) {
                    return _weirdKey(deserializationContext, str, e);
                }
            case 10:
                return deserializationContext.parseDate(str);
            case 11:
                return deserializationContext.constructCalendar(deserializationContext.parseDate(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e2) {
                    return _weirdKey(deserializationContext, str, e2);
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e3) {
                    return _weirdKey(deserializationContext, str, e3);
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e4) {
                    return _weirdKey(deserializationContext, str, e4);
                }
            case 15:
                try {
                    return deserializationContext.findClass(str);
                } catch (Exception unused) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e5) {
                    return _weirdKey(deserializationContext, str, e5);
                }
            case 17:
                try {
                    return deserializationContext.getConfig().getBase64Variant().decode(str);
                } catch (IllegalArgumentException e6) {
                    return _weirdKey(deserializationContext, str, e6);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this._keyClass);
        }
    }

    public double _parseDouble(String str) throws IllegalArgumentException {
        return kc4.m20646i(str);
    }

    public int _parseInt(String str) throws IllegalArgumentException {
        return Integer.parseInt(str);
    }

    public long _parseLong(String str) throws IllegalArgumentException {
        return Long.parseLong(str);
    }

    public Object _weirdKey(DeserializationContext deserializationContext, String str, Exception exc) throws IOException {
        return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", wf0.m29528o(exc));
    }

    public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            Object _parse = _parse(str, deserializationContext);
            if (_parse != null) {
                return _parse;
            }
            if (!wf0.m29485L(this._keyClass) || !deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
            }
            return null;
        } catch (Exception e) {
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation, problem: (%s) %s", e.getClass().getName(), wf0.m29528o(e));
        }
    }

    public Class<?> getKeyClass() {
        return this._keyClass;
    }

    public StdKeyDeserializer(int i, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this._kind = i;
        this._keyClass = cls;
        this._deser = fromStringDeserializer;
    }
}
