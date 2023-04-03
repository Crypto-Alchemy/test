package p000;

import java.util.Iterator;
import java.util.Locale;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: hb0 */
/* compiled from: capitalizeDecapitalize.kt */
public final class hb0 {
    /* renamed from: a */
    public static final String m58513a(String str) {
        boolean z;
        vx2.m53591g(str, "<this>");
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (!z2) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
        return upperCase + substring;
    }

    /* renamed from: b */
    public static final String m58514b(String str) {
        boolean z;
        vx2.m53591g(str, "<this>");
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt < '[') {
            z2 = true;
        }
        if (!z2) {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
        return lowerCase + substring;
    }

    /* renamed from: c */
    public static final String m58515c(String str, boolean z) {
        boolean z2;
        boolean z3;
        Object obj;
        vx2.m53591g(str, "<this>");
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !m58516d(str, 0, z)) {
            return str;
        }
        if (str.length() != 1 && m58516d(str, 1, z)) {
            Iterator it = StringsKt__StringsKt.m63093X(str).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!m58516d(str, ((Number) obj).intValue(), z)) {
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num == null) {
                return m58517e(str, z);
            }
            int intValue = num.intValue() - 1;
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, intValue);
            vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(m58517e(substring, z));
            String substring2 = str.substring(intValue);
            vx2.m53590f(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        } else if (z) {
            return m58514b(str);
        } else {
            if (str.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring3 = str.substring(1);
            vx2.m53590f(substring3, "this as java.lang.String).substring(startIndex)");
            return lowerCase + substring3;
        }
    }

    /* renamed from: d */
    public static final boolean m58516d(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        if (!z) {
            return Character.isUpperCase(charAt);
        }
        if ('A' > charAt || charAt >= '[') {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final String m58517e(String str, boolean z) {
        if (z) {
            return m58518f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    /* renamed from: f */
    public static final String m58518f(String str) {
        boolean z;
        vx2.m53591g(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' > charAt || charAt >= '[') {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "builder.toString()");
        return sb2;
    }
}
