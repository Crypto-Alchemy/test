package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonFactory;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StdDateFormat extends DateFormat {
    public static final String[] ALL_FORMATS = {DATE_FORMAT_STR_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSS", DATE_FORMAT_STR_RFC1123, DATE_FORMAT_STR_PLAIN};
    public static final Calendar CALENDAR;
    public static final DateFormat DATE_FORMAT_RFC1123;
    public static final String DATE_FORMAT_STR_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
    public static final String DATE_FORMAT_STR_PLAIN = "yyyy-MM-dd";
    public static final String DATE_FORMAT_STR_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    public static final Locale DEFAULT_LOCALE;
    public static final TimeZone DEFAULT_TIMEZONE;
    public static final Pattern PATTERN_ISO8601 = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
    public static final Pattern PATTERN_PLAIN = Pattern.compile(PATTERN_PLAIN_STR);
    public static final String PATTERN_PLAIN_STR = "\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d";
    public static final StdDateFormat instance = new StdDateFormat();
    public Boolean _lenient;
    public final Locale _locale;
    public transient TimeZone _timezone;
    private boolean _tzSerializedWithColon;

    /* renamed from: a */
    public transient Calendar f10170a;

    /* renamed from: d */
    public transient DateFormat f10171d;

    static {
        try {
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            DEFAULT_TIMEZONE = timeZone;
            Locale locale = Locale.US;
            DEFAULT_LOCALE = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_STR_RFC1123, locale);
            DATE_FORMAT_RFC1123 = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            CALENDAR = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public StdDateFormat() {
        this._tzSerializedWithColon = true;
        this._locale = DEFAULT_LOCALE;
    }

    public static <T> boolean _equals(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || !t.equals(t2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final DateFormat m14344a(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat dateFormat2;
        if (!locale.equals(DEFAULT_LOCALE)) {
            dateFormat2 = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = DEFAULT_TIMEZONE;
            }
            dateFormat2.setTimeZone(timeZone);
        } else {
            dateFormat2 = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                dateFormat2.setTimeZone(timeZone);
            }
        }
        if (bool != null) {
            dateFormat2.setLenient(bool.booleanValue());
        }
        return dateFormat2;
    }

    /* renamed from: b */
    public static int m14345b(String str, int i) {
        return ((str.charAt(i) - '0') * 10) + (str.charAt(i + 1) - '0');
    }

    /* renamed from: d */
    public static int m14346d(String str, int i) {
        return ((str.charAt(i) - '0') * 1000) + ((str.charAt(i + 1) - '0') * 100) + ((str.charAt(i + 2) - '0') * 10) + (str.charAt(i + 3) - '0');
    }

    /* renamed from: g */
    public static void m14347g(StringBuffer stringBuffer, int i) {
        int i2 = i / 10;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 10;
        }
        stringBuffer.append((char) (i + 48));
    }

    public static TimeZone getDefaultTimeZone() {
        return DEFAULT_TIMEZONE;
    }

    @Deprecated
    public static DateFormat getISO8601Format(TimeZone timeZone, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_STR_ISO8601, locale);
        simpleDateFormat.setTimeZone(DEFAULT_TIMEZONE);
        return simpleDateFormat;
    }

    @Deprecated
    public static DateFormat getRFC1123Format(TimeZone timeZone, Locale locale) {
        return m14344a(DATE_FORMAT_RFC1123, DATE_FORMAT_STR_RFC1123, timeZone, locale, (Boolean) null);
    }

    /* renamed from: h */
    public static void m14348h(StringBuffer stringBuffer, int i) {
        int i2 = i / 100;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 100;
        }
        m14347g(stringBuffer, i);
    }

    /* renamed from: i */
    public static void m14349i(StringBuffer stringBuffer, int i) {
        int i2 = i / 100;
        if (i2 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i2 > 99) {
                stringBuffer.append(i2);
            } else {
                m14347g(stringBuffer, i2);
            }
            i -= i2 * 100;
        }
        m14347g(stringBuffer, i);
    }

    public void _clearFormats() {
        this.f10171d = null;
    }

    public void _format(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar _getCalendar = _getCalendar(timeZone);
        _getCalendar.setTime(date);
        int i = _getCalendar.get(1);
        char c = '+';
        if (_getCalendar.get(0) == 0) {
            _formatBCEYear(stringBuffer, i);
        } else {
            if (i > 9999) {
                stringBuffer.append('+');
            }
            m14349i(stringBuffer, i);
        }
        stringBuffer.append('-');
        m14347g(stringBuffer, _getCalendar.get(2) + 1);
        stringBuffer.append('-');
        m14347g(stringBuffer, _getCalendar.get(5));
        stringBuffer.append('T');
        m14347g(stringBuffer, _getCalendar.get(11));
        stringBuffer.append(':');
        m14347g(stringBuffer, _getCalendar.get(12));
        stringBuffer.append(':');
        m14347g(stringBuffer, _getCalendar.get(13));
        stringBuffer.append('.');
        m14348h(stringBuffer, _getCalendar.get(14));
        int offset = timeZone.getOffset(_getCalendar.getTimeInMillis());
        if (offset != 0) {
            int i2 = offset / 60000;
            int abs = Math.abs(i2 / 60);
            int abs2 = Math.abs(i2 % 60);
            if (offset < 0) {
                c = '-';
            }
            stringBuffer.append(c);
            m14347g(stringBuffer, abs);
            if (this._tzSerializedWithColon) {
                stringBuffer.append(':');
            }
            m14347g(stringBuffer, abs2);
        } else if (this._tzSerializedWithColon) {
            stringBuffer.append("+00:00");
        } else {
            stringBuffer.append("+0000");
        }
    }

    public void _formatBCEYear(StringBuffer stringBuffer, int i) {
        if (i == 1) {
            stringBuffer.append("+0000");
            return;
        }
        stringBuffer.append('-');
        m14349i(stringBuffer, i - 1);
    }

    public Calendar _getCalendar(TimeZone timeZone) {
        Calendar calendar = this.f10170a;
        if (calendar == null) {
            calendar = (Calendar) CALENDAR.clone();
            this.f10170a = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    public Date _parseAsISO8601(String str, ParsePosition parsePosition) throws IllegalArgumentException, ParseException {
        char c;
        String str2;
        int i;
        int i2;
        String str3 = str;
        int length = str.length();
        TimeZone timeZone = DEFAULT_TIMEZONE;
        if (!(this._timezone == null || 'Z' == str3.charAt(length - 1))) {
            timeZone = this._timezone;
        }
        Calendar _getCalendar = _getCalendar(timeZone);
        _getCalendar.clear();
        int i3 = 0;
        if (length > 10) {
            Matcher matcher = PATTERN_ISO8601.matcher(str3);
            if (matcher.matches()) {
                int start = matcher.start(2);
                int end = matcher.end(2);
                int i4 = end - start;
                if (i4 > 1) {
                    int b = m14345b(str3, start + 1) * 3600;
                    if (i4 >= 5) {
                        b += m14345b(str3, end - 2) * 60;
                    }
                    if (str3.charAt(start) == '-') {
                        i2 = b * -1000;
                    } else {
                        i2 = b * 1000;
                    }
                    _getCalendar.set(15, i2);
                    _getCalendar.set(16, 0);
                }
                int d = m14346d(str3, 0);
                int b2 = m14345b(str3, 5) - 1;
                int b3 = m14345b(str3, 8);
                int b4 = m14345b(str3, 11);
                int b5 = m14345b(str3, 14);
                if (length <= 16 || str3.charAt(16) != ':') {
                    i = 0;
                } else {
                    i = m14345b(str3, 17);
                }
                int i5 = d;
                int i6 = b2;
                int i7 = b3;
                int i8 = b4;
                Matcher matcher2 = matcher;
                _getCalendar.set(i5, i6, i7, i8, b5, i);
                int start2 = matcher2.start(1) + 1;
                int end2 = matcher2.end(1);
                if (start2 >= end2) {
                    _getCalendar.set(14, 0);
                } else {
                    int i9 = end2 - start2;
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 != 2) {
                                if (i9 == 3 || i9 <= 9) {
                                    i3 = 0 + (str3.charAt(start2 + 2) - '0');
                                } else {
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", new Object[]{str3, matcher2.group(1).substring(1)}), start2);
                                }
                            }
                            i3 += (str3.charAt(start2 + 1) - '0') * 10;
                        }
                        i3 += (str3.charAt(start2) - '0') * 100;
                    }
                    _getCalendar.set(14, i3);
                }
                return _getCalendar.getTime();
            }
            c = 1;
            str2 = DATE_FORMAT_STR_ISO8601;
        } else if (PATTERN_PLAIN.matcher(str3).matches()) {
            _getCalendar.set(m14346d(str3, 0), m14345b(str3, 5) - 1, m14345b(str3, 8), 0, 0, 0);
            _getCalendar.set(14, 0);
            return _getCalendar.getTime();
        } else {
            str2 = DATE_FORMAT_STR_PLAIN;
            c = 1;
        }
        Object[] objArr = new Object[3];
        objArr[0] = str3;
        objArr[c] = str2;
        objArr[2] = this._lenient;
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", objArr), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date _parseDate(java.lang.String r5, java.text.ParsePosition r6) throws java.text.ParseException {
        /*
            r4 = this;
            boolean r0 = r4.looksLikeISO8601(r5)
            if (r0 == 0) goto L_0x000b
            java.util.Date r5 = r4.parseAsISO8601(r5, r6)
            return r5
        L_0x000b:
            int r0 = r5.length()
        L_0x000f:
            int r0 = r0 + -1
            r1 = 45
            if (r0 < 0) goto L_0x0025
            char r2 = r5.charAt(r0)
            r3 = 48
            if (r2 < r3) goto L_0x0021
            r3 = 57
            if (r2 <= r3) goto L_0x000f
        L_0x0021:
            if (r0 > 0) goto L_0x0025
            if (r2 == r1) goto L_0x000f
        L_0x0025:
            if (r0 >= 0) goto L_0x0039
            r0 = 0
            char r2 = r5.charAt(r0)
            if (r2 == r1) goto L_0x0034
            boolean r0 = p000.kc4.m20638a(r5, r0)
            if (r0 == 0) goto L_0x0039
        L_0x0034:
            java.util.Date r5 = r4.mo16990f(r5, r6)
            return r5
        L_0x0039:
            java.util.Date r5 = r4.parseAsRFC1123(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    /* renamed from: f */
    public final Date mo16990f(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return new Date(kc4.m20649l(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", new Object[]{str}), parsePosition.getErrorIndex());
        }
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this._timezone;
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        _format(timeZone, this._locale, date, stringBuffer);
        return stringBuffer;
    }

    public TimeZone getTimeZone() {
        return this._timezone;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean isColonIncludedInTimeZone() {
        return this._tzSerializedWithColon;
    }

    public boolean isLenient() {
        Boolean bool = this._lenient;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean looksLikeISO8601(String str) {
        if (str.length() < 7 || !Character.isDigit(str.charAt(0)) || !Character.isDigit(str.charAt(3)) || str.charAt(4) != '-' || !Character.isDigit(str.charAt(5))) {
            return false;
        }
        return true;
    }

    public Date parse(String str) throws ParseException {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date _parseDate = _parseDate(trim, parsePosition);
        if (_parseDate != null) {
            return _parseDate;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : ALL_FORMATS) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            }
            sb.append(str2);
        }
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", new Object[]{trim, sb.toString()}), parsePosition.getErrorIndex());
    }

    public Date parseAsISO8601(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return _parseAsISO8601(str, parsePosition);
        } catch (IllegalArgumentException e) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", new Object[]{str, e.getMessage()}), parsePosition.getErrorIndex());
        }
    }

    public Date parseAsRFC1123(String str, ParsePosition parsePosition) {
        if (this.f10171d == null) {
            this.f10171d = m14344a(DATE_FORMAT_RFC1123, DATE_FORMAT_STR_RFC1123, this._timezone, this._locale, this._lenient);
        }
        return this.f10171d.parse(str, parsePosition);
    }

    public void setLenient(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        if (!_equals(valueOf, this._lenient)) {
            this._lenient = valueOf;
            _clearFormats();
        }
    }

    public void setTimeZone(TimeZone timeZone) {
        if (!timeZone.equals(this._timezone)) {
            _clearFormats();
            this._timezone = timeZone;
        }
    }

    public String toPattern() {
        String str;
        StringBuilder sb = new StringBuilder(100);
        sb.append("[one of: '");
        sb.append(DATE_FORMAT_STR_ISO8601);
        sb.append("', '");
        sb.append(DATE_FORMAT_STR_RFC1123);
        sb.append("' (");
        if (Boolean.FALSE.equals(this._lenient)) {
            str = "strict";
        } else {
            str = "lenient";
        }
        sb.append(str);
        sb.append(")]");
        return sb.toString();
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", new Object[]{getClass().getName(), this._timezone, this._locale, this._lenient});
    }

    public StdDateFormat withColonInTimeZone(boolean z) {
        if (this._tzSerializedWithColon == z) {
            return this;
        }
        return new StdDateFormat(this._timezone, this._locale, this._lenient, z);
    }

    public StdDateFormat withLenient(Boolean bool) {
        if (_equals(bool, this._lenient)) {
            return this;
        }
        return new StdDateFormat(this._timezone, this._locale, bool, this._tzSerializedWithColon);
    }

    public StdDateFormat withLocale(Locale locale) {
        if (locale.equals(this._locale)) {
            return this;
        }
        return new StdDateFormat(this._timezone, locale, this._lenient, this._tzSerializedWithColon);
    }

    public StdDateFormat withTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        TimeZone timeZone2 = this._timezone;
        if (timeZone == timeZone2 || timeZone.equals(timeZone2)) {
            return this;
        }
        return new StdDateFormat(timeZone, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    public StdDateFormat clone() {
        return new StdDateFormat(this._timezone, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    @Deprecated
    public StdDateFormat(TimeZone timeZone, Locale locale) {
        this._tzSerializedWithColon = true;
        this._timezone = timeZone;
        this._locale = locale;
    }

    public StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool) {
        this(timeZone, locale, bool, false);
    }

    public StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool, boolean z) {
        this._timezone = timeZone;
        this._locale = locale;
        this._lenient = bool;
        this._tzSerializedWithColon = z;
    }

    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return _parseDate(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
