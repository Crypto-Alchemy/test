package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFormat {

    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    public enum Shape {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        public boolean isNumeric() {
            if (this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT) {
                return true;
            }
            return false;
        }

        public boolean isStructured() {
            if (this == OBJECT || this == ARRAY) {
                return true;
            }
            return false;
        }
    }

    public static class Value implements Serializable {

        /* renamed from: d */
        public static final Value f9795d = new Value();
        private static final long serialVersionUID = 1;
        private final C1970a _features;
        private final Boolean _lenient;
        private final Locale _locale;
        private final String _pattern;
        private final Shape _shape;
        private final String _timezoneStr;

        /* renamed from: a */
        public transient TimeZone f9796a;

        public Value() {
            this("", Shape.ANY, "", "", C1970a.m13762c(), (Boolean) null);
        }

        /* renamed from: a */
        public static <T> boolean m13759a(T t, T t2) {
            if (t == null) {
                if (t2 == null) {
                    return true;
                }
                return false;
            } else if (t2 == null) {
                return false;
            } else {
                return t.equals(t2);
            }
        }

        public static final Value empty() {
            return f9795d;
        }

        public static Value forLeniency(boolean z) {
            return new Value("", (Shape) null, (Locale) null, (String) null, (TimeZone) null, C1970a.m13762c(), Boolean.valueOf(z));
        }

        public static Value forPattern(String str) {
            return new Value(str, (Shape) null, (Locale) null, (String) null, (TimeZone) null, C1970a.m13762c(), (Boolean) null);
        }

        public static Value forShape(Shape shape) {
            return new Value("", shape, (Locale) null, (String) null, (TimeZone) null, C1970a.m13762c(), (Boolean) null);
        }

        public static final Value from(JsonFormat jsonFormat) {
            if (jsonFormat == null) {
                return f9795d;
            }
            return new Value(jsonFormat);
        }

        public static Value merge(Value value, Value value2) {
            if (value == null) {
                return value2;
            }
            return value.withOverrides(value2);
        }

        public static Value mergeAll(Value... valueArr) {
            Value value = null;
            for (Value value2 : valueArr) {
                if (value2 != null) {
                    if (value != null) {
                        value2 = value.withOverrides(value2);
                    }
                    value = value2;
                }
            }
            return value;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            if (this._shape != value._shape || !this._features.equals(value._features)) {
                return false;
            }
            if (!m13759a(this._lenient, value._lenient) || !m13759a(this._timezoneStr, value._timezoneStr) || !m13759a(this._pattern, value._pattern) || !m13759a(this.f9796a, value.f9796a) || !m13759a(this._locale, value._locale)) {
                return false;
            }
            return true;
        }

        public Boolean getFeature(Feature feature) {
            return this._features.mo13581d(feature);
        }

        public C1970a getFeatures() {
            return this._features;
        }

        public Boolean getLenient() {
            return this._lenient;
        }

        public Locale getLocale() {
            return this._locale;
        }

        public String getPattern() {
            return this._pattern;
        }

        public Shape getShape() {
            return this._shape;
        }

        public TimeZone getTimeZone() {
            TimeZone timeZone = this.f9796a;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this._timezoneStr;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this.f9796a = timeZone2;
            return timeZone2;
        }

        public boolean hasLenient() {
            if (this._lenient != null) {
                return true;
            }
            return false;
        }

        public boolean hasLocale() {
            if (this._locale != null) {
                return true;
            }
            return false;
        }

        public boolean hasPattern() {
            String str = this._pattern;
            if (str == null || str.length() <= 0) {
                return false;
            }
            return true;
        }

        public boolean hasShape() {
            if (this._shape != Shape.ANY) {
                return true;
            }
            return false;
        }

        public boolean hasTimeZone() {
            String str;
            if (this.f9796a != null || ((str = this._timezoneStr) != null && !str.isEmpty())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            String str = this._timezoneStr;
            if (str == null) {
                i = 1;
            } else {
                i = str.hashCode();
            }
            String str2 = this._pattern;
            if (str2 != null) {
                i ^= str2.hashCode();
            }
            int hashCode = i + this._shape.hashCode();
            Boolean bool = this._lenient;
            if (bool != null) {
                hashCode ^= bool.hashCode();
            }
            Locale locale = this._locale;
            if (locale != null) {
                hashCode += locale.hashCode();
            }
            return hashCode ^ this._features.hashCode();
        }

        public boolean isLenient() {
            return Boolean.TRUE.equals(this._lenient);
        }

        public String timeZoneAsString() {
            TimeZone timeZone = this.f9796a;
            if (timeZone != null) {
                return timeZone.getID();
            }
            return this._timezoneStr;
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", new Object[]{this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr, this._features});
        }

        public Class<JsonFormat> valueFor() {
            return JsonFormat.class;
        }

        public Value withFeature(Feature feature) {
            C1970a e = this._features.mo13582e(feature);
            if (e == this._features) {
                return this;
            }
            return new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this.f9796a, e, this._lenient);
        }

        public Value withLenient(Boolean bool) {
            if (bool == this._lenient) {
                return this;
            }
            return new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this.f9796a, this._features, bool);
        }

        public Value withLocale(Locale locale) {
            return new Value(this._pattern, this._shape, locale, this._timezoneStr, this.f9796a, this._features, this._lenient);
        }

        public final Value withOverrides(Value value) {
            Value value2;
            C1970a aVar;
            TimeZone timeZone;
            String str;
            if (value == null || value == (value2 = f9795d) || value == this) {
                return this;
            }
            if (this == value2) {
                return value;
            }
            String str2 = value._pattern;
            if (str2 == null || str2.isEmpty()) {
                str2 = this._pattern;
            }
            String str3 = str2;
            Shape shape = value._shape;
            if (shape == Shape.ANY) {
                shape = this._shape;
            }
            Shape shape2 = shape;
            Locale locale = value._locale;
            if (locale == null) {
                locale = this._locale;
            }
            Locale locale2 = locale;
            C1970a aVar2 = this._features;
            if (aVar2 == null) {
                aVar = value._features;
            } else {
                aVar = aVar2.mo13584f(value._features);
            }
            C1970a aVar3 = aVar;
            Boolean bool = value._lenient;
            if (bool == null) {
                bool = this._lenient;
            }
            Boolean bool2 = bool;
            String str4 = value._timezoneStr;
            if (str4 == null || str4.isEmpty()) {
                str = this._timezoneStr;
                timeZone = this.f9796a;
            } else {
                timeZone = value.f9796a;
                str = str4;
            }
            return new Value(str3, shape2, locale2, str, timeZone, aVar3, bool2);
        }

        public Value withPattern(String str) {
            return new Value(str, this._shape, this._locale, this._timezoneStr, this.f9796a, this._features, this._lenient);
        }

        public Value withShape(Shape shape) {
            if (shape == this._shape) {
                return this;
            }
            return new Value(this._pattern, shape, this._locale, this._timezoneStr, this.f9796a, this._features, this._lenient);
        }

        public Value withTimeZone(TimeZone timeZone) {
            return new Value(this._pattern, this._shape, this._locale, (String) null, timeZone, this._features, this._lenient);
        }

        public Value withoutFeature(Feature feature) {
            C1970a g = this._features.mo13585g(feature);
            if (g == this._features) {
                return this;
            }
            return new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this.f9796a, g, this._lenient);
        }

        public Value(JsonFormat jsonFormat) {
            this(jsonFormat.pattern(), jsonFormat.shape(), jsonFormat.locale(), jsonFormat.timezone(), C1970a.m13760a(jsonFormat), jsonFormat.lenient().asBoolean());
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Value(java.lang.String r14, com.fasterxml.jackson.annotation.JsonFormat.Shape r15, java.lang.String r16, java.lang.String r17, com.fasterxml.jackson.annotation.JsonFormat.C1970a r18, java.lang.Boolean r19) {
            /*
                r13 = this;
                r0 = r16
                r1 = r17
                java.lang.String r2 = "##default"
                r3 = 0
                if (r0 == 0) goto L_0x001d
                int r4 = r16.length()
                if (r4 == 0) goto L_0x001d
                boolean r4 = r2.equals(r0)
                if (r4 == 0) goto L_0x0016
                goto L_0x001d
            L_0x0016:
                java.util.Locale r4 = new java.util.Locale
                r4.<init>(r0)
                r8 = r4
                goto L_0x001e
            L_0x001d:
                r8 = r3
            L_0x001e:
                if (r1 == 0) goto L_0x002f
                int r0 = r17.length()
                if (r0 == 0) goto L_0x002f
                boolean r0 = r2.equals(r1)
                if (r0 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r9 = r1
                goto L_0x0030
            L_0x002f:
                r9 = r3
            L_0x0030:
                r10 = 0
                r5 = r13
                r6 = r14
                r7 = r15
                r11 = r18
                r12 = r19
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonFormat.Value.<init>(java.lang.String, com.fasterxml.jackson.annotation.JsonFormat$Shape, java.lang.String, java.lang.String, com.fasterxml.jackson.annotation.JsonFormat$a, java.lang.Boolean):void");
        }

        public Value(String str, Shape shape, Locale locale, TimeZone timeZone, C1970a aVar, Boolean bool) {
            this._pattern = str == null ? "" : str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this.f9796a = timeZone;
            this._timezoneStr = null;
            this._features = aVar == null ? C1970a.m13762c() : aVar;
            this._lenient = bool;
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, C1970a aVar, Boolean bool) {
            this._pattern = str == null ? "" : str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this.f9796a = timeZone;
            this._timezoneStr = str2;
            this._features = aVar == null ? C1970a.m13762c() : aVar;
            this._lenient = bool;
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, C1970a aVar) {
            this(str, shape, locale, str2, timeZone, aVar, (Boolean) null);
        }

        @Deprecated
        public Value(String str, Shape shape, String str2, String str3, C1970a aVar) {
            this(str, shape, str2, str3, aVar, (Boolean) null);
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, TimeZone timeZone, C1970a aVar) {
            this(str, shape, locale, timeZone, aVar, (Boolean) null);
        }
    }

    /* renamed from: com.fasterxml.jackson.annotation.JsonFormat$a */
    public static class C1970a {

        /* renamed from: c */
        public static final C1970a f9797c = new C1970a(0, 0);

        /* renamed from: a */
        public final int f9798a;

        /* renamed from: b */
        public final int f9799b;

        public C1970a(int i, int i2) {
            this.f9798a = i;
            this.f9799b = i2;
        }

        /* renamed from: a */
        public static C1970a m13760a(JsonFormat jsonFormat) {
            return m13761b(jsonFormat.with(), jsonFormat.without());
        }

        /* renamed from: b */
        public static C1970a m13761b(Feature[] featureArr, Feature[] featureArr2) {
            int i = 0;
            for (Feature ordinal : featureArr) {
                i |= 1 << ordinal.ordinal();
            }
            int i2 = 0;
            for (Feature ordinal2 : featureArr2) {
                i2 |= 1 << ordinal2.ordinal();
            }
            return new C1970a(i, i2);
        }

        /* renamed from: c */
        public static C1970a m13762c() {
            return f9797c;
        }

        /* renamed from: d */
        public Boolean mo13581d(Feature feature) {
            int ordinal = 1 << feature.ordinal();
            if ((this.f9799b & ordinal) != 0) {
                return Boolean.FALSE;
            }
            if ((ordinal & this.f9798a) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        /* renamed from: e */
        public C1970a mo13582e(Feature... featureArr) {
            int i = this.f9798a;
            for (Feature ordinal : featureArr) {
                i |= 1 << ordinal.ordinal();
            }
            if (i == this.f9798a) {
                return this;
            }
            return new C1970a(i, this.f9799b);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C1970a aVar = (C1970a) obj;
            if (aVar.f9798a == this.f9798a && aVar.f9799b == this.f9799b) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public C1970a mo13584f(C1970a aVar) {
            if (aVar == null) {
                return this;
            }
            int i = aVar.f9799b;
            int i2 = aVar.f9798a;
            if (i == 0 && i2 == 0) {
                return this;
            }
            int i3 = this.f9798a;
            if (i3 == 0 && this.f9799b == 0) {
                return aVar;
            }
            int i4 = ((~i) & i3) | i2;
            int i5 = this.f9799b;
            int i6 = i | ((~i2) & i5);
            if (i4 == i3 && i6 == i5) {
                return this;
            }
            return new C1970a(i4, i6);
        }

        /* renamed from: g */
        public C1970a mo13585g(Feature... featureArr) {
            int i = this.f9799b;
            for (Feature ordinal : featureArr) {
                i |= 1 << ordinal.ordinal();
            }
            if (i == this.f9799b) {
                return this;
            }
            return new C1970a(this.f9798a, i);
        }

        public int hashCode() {
            return this.f9799b + this.f9798a;
        }

        public String toString() {
            if (this == f9797c) {
                return "EMPTY";
            }
            return String.format("(enabled=0x%x,disabled=0x%x)", new Object[]{Integer.valueOf(this.f9798a), Integer.valueOf(this.f9799b)});
        }
    }

    OptBoolean lenient() default OptBoolean.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.ANY;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};
}
