package p000;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: t00 */
/* compiled from: BeanUtil */
public class t00 {
    /* renamed from: a */
    public static String m27230a(JavaType javaType) {
        String str;
        String str2;
        String name = javaType.getRawClass().getName();
        if (m27232c(name)) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str2 = "Java 8 date/time";
            str = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else if (!m27233d(name)) {
            return null;
        } else {
            str2 = "Joda date/time";
            str = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", new Object[]{str2, wf0.m29480G(javaType), str});
    }

    /* renamed from: b */
    public static Object m27231b(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Class<?> b0 = wf0.m29503b0(rawClass);
        if (b0 != null) {
            return wf0.m29524m(b0);
        }
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return JsonInclude.Include.NON_EMPTY;
        }
        if (rawClass == String.class) {
            return "";
        }
        if (javaType.isTypeOrSubTypeOf(Date.class)) {
            return new Date(0);
        }
        if (!javaType.isTypeOrSubTypeOf(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0);
        return gregorianCalendar;
    }

    /* renamed from: c */
    public static boolean m27232c(String str) {
        return str.startsWith("java.time.");
    }

    /* renamed from: d */
    public static boolean m27233d(String str) {
        return str.startsWith("org.joda.time.");
    }
}
