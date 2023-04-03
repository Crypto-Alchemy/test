package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;

public class DateDeserializers {

    /* renamed from: a */
    public static final HashSet<String> f9959a;

    @zz2
    public static class CalendarDeserializer extends DateBasedDeserializer<Calendar> {
        public final Constructor<Calendar> _defaultCtor;

        public CalendarDeserializer() {
            super(Calendar.class);
            this._defaultCtor = null;
        }

        public /* bridge */ /* synthetic */ o43 createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public Object getEmptyValue(DeserializationContext deserializationContext) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0);
            return gregorianCalendar;
        }

        public /* bridge */ /* synthetic */ LogicalType logicalType() {
            return super.logicalType();
        }

        public Calendar deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date _parseDate = _parseDate(jsonParser, deserializationContext);
            if (_parseDate == null) {
                return null;
            }
            Constructor<Calendar> constructor = this._defaultCtor;
            if (constructor == null) {
                return deserializationContext.constructCalendar(_parseDate);
            }
            try {
                Calendar newInstance = constructor.newInstance(new Object[0]);
                newInstance.setTimeInMillis(_parseDate.getTime());
                TimeZone timeZone = deserializationContext.getTimeZone();
                if (timeZone != null) {
                    newInstance.setTimeZone(timeZone);
                }
                return newInstance;
            } catch (Exception e) {
                return (Calendar) deserializationContext.handleInstantiationProblem(handledType(), _parseDate, e);
            }
        }

        public CalendarDeserializer withDateFormat(DateFormat dateFormat, String str) {
            return new CalendarDeserializer(this, dateFormat, str);
        }

        public CalendarDeserializer(Class<? extends Calendar> cls) {
            super(cls);
            this._defaultCtor = wf0.m29531q(cls, false);
        }

        public CalendarDeserializer(CalendarDeserializer calendarDeserializer, DateFormat dateFormat, String str) {
            super(calendarDeserializer, dateFormat, str);
            this._defaultCtor = calendarDeserializer._defaultCtor;
        }
    }

    @zz2
    public static class DateDeserializer extends DateBasedDeserializer<Date> {
        public static final DateDeserializer instance = new DateDeserializer();

        public DateDeserializer() {
            super(Date.class);
        }

        public /* bridge */ /* synthetic */ o43 createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return new Date(0);
        }

        public /* bridge */ /* synthetic */ LogicalType logicalType() {
            return super.logicalType();
        }

        public DateDeserializer(DateDeserializer dateDeserializer, DateFormat dateFormat, String str) {
            super(dateDeserializer, dateFormat, str);
        }

        public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return _parseDate(jsonParser, deserializationContext);
        }

        public DateDeserializer withDateFormat(DateFormat dateFormat, String str) {
            return new DateDeserializer(this, dateFormat, str);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.std.DateDeserializers$a */
    public static /* synthetic */ class C2006a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9960a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.databind.cfg.CoercionAction[] r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9960a = r0
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9960a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9960a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.TryConvert     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.DateDeserializers.C2006a.<clinit>():void");
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f9959a = hashSet;
        hashSet.add("java.util.Calendar");
        hashSet.add("java.util.GregorianCalendar");
        hashSet.add("java.util.Date");
    }

    /* renamed from: a */
    public static o43<?> m14093a(Class<?> cls, String str) {
        if (!f9959a.contains(str)) {
            return null;
        }
        if (cls == Calendar.class) {
            return new CalendarDeserializer();
        }
        if (cls == Date.class) {
            return DateDeserializer.instance;
        }
        if (cls == GregorianCalendar.class) {
            return new CalendarDeserializer(GregorianCalendar.class);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m14094b(Class<?> cls) {
        return f9959a.contains(cls.getName());
    }

    public static abstract class DateBasedDeserializer<T> extends StdScalarDeserializer<T> implements js0 {
        public final DateFormat _customFormat;
        public final String _formatString;

        public DateBasedDeserializer(Class<?> cls) {
            super(cls);
            this._customFormat = null;
            this._formatString = null;
        }

        public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date parse;
            if (this._customFormat == null || !jsonParser.mo13984s0(JsonToken.VALUE_STRING)) {
                return super._parseDate(jsonParser, deserializationContext);
            }
            String trim = jsonParser.mo13947W().trim();
            if (trim.isEmpty()) {
                if (C2006a.f9960a[_checkFromStringCoercion(deserializationContext, trim).ordinal()] != 1) {
                    return null;
                }
                return new Date(0);
            }
            synchronized (this._customFormat) {
                try {
                    parse = this._customFormat.parse(trim);
                } catch (ParseException unused) {
                    return (Date) deserializationContext.handleWeirdStringValue(handledType(), trim, "expected format \"%s\"", this._formatString);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return parse;
        }

        public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            StdDateFormat stdDateFormat;
            StdDateFormat stdDateFormat2;
            Locale locale;
            Locale locale2;
            JsonFormat.Value findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
            if (findFormatOverrides != null) {
                TimeZone timeZone = findFormatOverrides.getTimeZone();
                Boolean lenient = findFormatOverrides.getLenient();
                if (findFormatOverrides.hasPattern()) {
                    String pattern = findFormatOverrides.getPattern();
                    if (findFormatOverrides.hasLocale()) {
                        locale2 = findFormatOverrides.getLocale();
                    } else {
                        locale2 = deserializationContext.getLocale();
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale2);
                    if (timeZone == null) {
                        timeZone = deserializationContext.getTimeZone();
                    }
                    simpleDateFormat.setTimeZone(timeZone);
                    if (lenient != null) {
                        simpleDateFormat.setLenient(lenient.booleanValue());
                    }
                    return withDateFormat(simpleDateFormat, pattern);
                } else if (timeZone != null) {
                    DateFormat dateFormat = deserializationContext.getConfig().getDateFormat();
                    if (dateFormat.getClass() == StdDateFormat.class) {
                        if (findFormatOverrides.hasLocale()) {
                            locale = findFormatOverrides.getLocale();
                        } else {
                            locale = deserializationContext.getLocale();
                        }
                        StdDateFormat withLocale = ((StdDateFormat) dateFormat).withTimeZone(timeZone).withLocale(locale);
                        stdDateFormat2 = withLocale;
                        if (lenient != null) {
                            stdDateFormat2 = withLocale.withLenient(lenient);
                        }
                    } else {
                        DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
                        dateFormat2.setTimeZone(timeZone);
                        stdDateFormat2 = dateFormat2;
                        if (lenient != null) {
                            dateFormat2.setLenient(lenient.booleanValue());
                            stdDateFormat2 = dateFormat2;
                        }
                    }
                    return withDateFormat(stdDateFormat2, this._formatString);
                } else if (lenient != null) {
                    DateFormat dateFormat3 = deserializationContext.getConfig().getDateFormat();
                    String str = this._formatString;
                    if (dateFormat3.getClass() == StdDateFormat.class) {
                        StdDateFormat withLenient = ((StdDateFormat) dateFormat3).withLenient(lenient);
                        str = withLenient.toPattern();
                        stdDateFormat = withLenient;
                    } else {
                        DateFormat dateFormat4 = (DateFormat) dateFormat3.clone();
                        dateFormat4.setLenient(lenient.booleanValue());
                        boolean z = dateFormat4 instanceof SimpleDateFormat;
                        stdDateFormat = dateFormat4;
                        if (z) {
                            ((SimpleDateFormat) dateFormat4).toPattern();
                            stdDateFormat = dateFormat4;
                        }
                    }
                    if (str == null) {
                        str = "[unknown]";
                    }
                    return withDateFormat(stdDateFormat, str);
                }
            }
            return this;
        }

        public LogicalType logicalType() {
            return LogicalType.DateTime;
        }

        public abstract DateBasedDeserializer<T> withDateFormat(DateFormat dateFormat, String str);

        public DateBasedDeserializer(DateBasedDeserializer<T> dateBasedDeserializer, DateFormat dateFormat, String str) {
            super(dateBasedDeserializer._valueClass);
            this._customFormat = dateFormat;
            this._formatString = str;
        }
    }
}
