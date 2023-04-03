package p000;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.zendesk.logger.Logger;
import java.io.IOException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: pp7 */
/* compiled from: ZendeskDateTypeAdapter */
public class pp7 extends TypeAdapter<Date> {

    /* renamed from: a */
    public static final TimeZone f32781a = TimeZone.getTimeZone("UTC");

    /* renamed from: c */
    public static int m50067c(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* renamed from: a */
    public final boolean mo46842a(String str, int i, char c) {
        if (i >= str.length() || str.charAt(i) != c) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final String mo46843b(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f32781a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(21);
        mo46844d(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        mo46844d(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        mo46844d(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        mo46844d(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        mo46844d(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        mo46844d(sb, gregorianCalendar.get(13), 2);
        sb.append('Z');
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo46844d(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d1 A[Catch:{ IndexOutOfBoundsException -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124 A[Catch:{ IndexOutOfBoundsException -> 0x012c }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Date mo46845e(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "'"
            int r0 = r20.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            int r5 = r0 + 4
            int r0 = r1.mo46846f(r2, r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r6 = 45
            boolean r7 = r1.mo46842a(r2, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            if (r7 == 0) goto L_0x001c
            int r5 = r5 + 1
        L_0x001c:
            int r7 = r5 + 2
            int r5 = r1.mo46846f(r2, r5, r7)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            boolean r8 = r1.mo46842a(r2, r7, r6)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            if (r8 == 0) goto L_0x002a
            int r7 = r7 + 1
        L_0x002a:
            int r8 = r7 + 2
            int r7 = r1.mo46846f(r2, r7, r8)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r9 = 84
            boolean r9 = r1.mo46842a(r2, r8, r9)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r10 = 1
            if (r9 != 0) goto L_0x004d
            int r11 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            if (r11 > r8) goto L_0x004d
            java.util.GregorianCalendar r6 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            int r5 = r5 - r10
            r6.<init>(r0, r5, r7)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r3.setIndex(r8)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            java.util.Date r0 = r6.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            return r0
        L_0x004d:
            r11 = 90
            r13 = 2
            if (r9 == 0) goto L_0x00c7
            int r8 = r8 + 1
            int r9 = r8 + 2
            int r8 = r1.mo46846f(r2, r8, r9)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r14 = 58
            boolean r15 = r1.mo46842a(r2, r9, r14)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            if (r15 == 0) goto L_0x0064
            int r9 = r9 + 1
        L_0x0064:
            int r15 = r9 + 2
            int r9 = r1.mo46846f(r2, r9, r15)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            boolean r14 = r1.mo46842a(r2, r15, r14)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            if (r14 == 0) goto L_0x0072
            int r15 = r15 + 1
        L_0x0072:
            int r14 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            if (r14 <= r15) goto L_0x00c4
            char r14 = r2.charAt(r15)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            if (r14 == r11) goto L_0x00c4
            r12 = 43
            if (r14 == r12) goto L_0x00c4
            if (r14 == r6) goto L_0x00c4
            int r6 = r15 + 2
            int r12 = r1.mo46846f(r2, r15, r6)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r14 = 59
            if (r12 <= r14) goto L_0x0093
            r15 = 63
            if (r12 >= r15) goto L_0x0093
            r12 = r14
        L_0x0093:
            r14 = 46
            boolean r14 = r1.mo46842a(r2, r6, r14)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            if (r14 == 0) goto L_0x00bd
            int r6 = r6 + 1
            int r14 = r6 + 1
            int r14 = m50067c(r2, r14)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            int r15 = r6 + 3
            int r15 = java.lang.Math.min(r14, r15)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            int r16 = r1.mo46846f(r2, r6, r15)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            int r15 = r15 - r6
            if (r15 == r10) goto L_0x00b6
            if (r15 == r13) goto L_0x00b3
            goto L_0x00b8
        L_0x00b3:
            int r16 = r16 * 10
            goto L_0x00b8
        L_0x00b6:
            int r16 = r16 * 100
        L_0x00b8:
            r6 = r8
            r8 = r14
            r14 = r16
            goto L_0x00cb
        L_0x00bd:
            r14 = 0
            r17 = r8
            r8 = r6
            r6 = r17
            goto L_0x00cb
        L_0x00c4:
            r6 = r8
            r8 = r15
            goto L_0x00c9
        L_0x00c7:
            r6 = 0
            r9 = 0
        L_0x00c9:
            r12 = 0
            r14 = 0
        L_0x00cb:
            int r15 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            if (r15 <= r8) goto L_0x0124
            char r15 = r2.charAt(r8)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            if (r15 != r11) goto L_0x010a
            java.util.TimeZone r11 = f32781a     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            int r8 = r8 + r10
            java.util.GregorianCalendar r15 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r15.<init>(r11)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r11 = 0
            r15.setLenient(r11)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r15.set(r10, r0)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            int r5 = r5 - r10
            r15.set(r13, r5)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r0 = 5
            r15.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r0 = 11
            r15.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r0 = 12
            r15.set(r0, r9)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r0 = 13
            r15.set(r0, r12)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r0 = 14
            r15.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r3.setIndex(r8)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            java.util.Date r0 = r15.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            return r0
        L_0x010a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r5.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            java.lang.String r6 = "Invalid time zone indicator '"
            r5.append(r6)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r5.append(r15)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r5.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            java.lang.String r5 = r5.toString()     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            r0.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x012c }
        L_0x0124:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            java.lang.String r5 = "No time zone indicator"
            r0.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x012c }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x012c }
        L_0x012c:
            r0 = move-exception
            if (r2 != 0) goto L_0x0131
            r2 = 0
            goto L_0x0145
        L_0x0131:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 34
            r5.append(r6)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
        L_0x0145:
            java.lang.String r4 = r0.getMessage()
            if (r4 == 0) goto L_0x0151
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x016f
        L_0x0151:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "("
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            java.lang.String r5 = ")"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L_0x016f:
            java.text.ParseException r5 = new java.text.ParseException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to parse date ["
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = "]: "
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            int r3 = r20.getIndex()
            r5.<init>(r2, r3)
            r5.initCause(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pp7.mo46845e(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: f */
    public final int mo46846f(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
        }
        return -i3;
    }

    public Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            return mo46845e(nextString, new ParsePosition(0));
        } catch (ParseException e) {
            Logger.m43080d("ZendeskDateTypeAdapter", String.format(Locale.US, "Failed to parse Date from: %s", new Object[]{nextString}), e, new Object[0]);
            return null;
        }
    }

    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(mo46843b(date));
        }
    }
}
