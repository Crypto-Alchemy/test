package p000;

import com.zendesk.logger.Logger;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: zj3 */
/* compiled from: LocaleUtil */
public class zj3 {

    /* renamed from: a */
    public static final String f36169a = "zj3";

    /* renamed from: b */
    public static final List<String> f36170b = Arrays.asList(new String[]{"he", "yi", "id"});

    /* renamed from: a */
    public static Locale m55130a(String str, String str2) {
        Class<String> cls = String.class;
        Class<Locale> cls2 = Locale.class;
        try {
            Constructor<Locale> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{Boolean.TYPE, cls, cls});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{Boolean.TRUE, str, str2});
        } catch (Exception e) {
            Logger.m43080d(f36169a, "Unable to create ISO-6390-Alpha3 per reflection", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static Locale m55131b(String str, String str2) {
        Class<String> cls = String.class;
        try {
            Method declaredMethod = Locale.class.getDeclaredMethod("createConstant", new Class[]{cls, cls});
            declaredMethod.setAccessible(true);
            return (Locale) declaredMethod.invoke((Object) null, new Object[]{str, str2});
        } catch (Exception e) {
            Logger.m43080d(f36169a, "Unable to create ISO-6390-Alpha3 per reflection", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static Locale m55132c(String str) {
        boolean z;
        String str2;
        Locale locale;
        String str3 = f36169a;
        Logger.m43078b(str3, "Assuming Locale.getDefault()", new Object[0]);
        Locale locale2 = Locale.getDefault();
        if (!kb6.m46949b(str)) {
            return locale2;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "-");
        int countTokens = stringTokenizer.countTokens();
        int i = 2;
        if (countTokens == 1 || countTokens == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (countTokens != 1) {
                i = 5;
            }
            if (i != str.length()) {
                Logger.m43078b(str3, "number of tokens is correct but the length of the locale string does not match the expected length", new Object[0]);
                return locale2;
            }
            String nextToken = stringTokenizer.nextToken();
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = "";
            }
            String upperCase = str2.toUpperCase(Locale.US);
            if (f36170b.contains(nextToken)) {
                Logger.m43078b(str3, "New ISO-6390-Alpha3 locale detected trying to create new locale per reflection", new Object[0]);
                locale = m55131b(nextToken, upperCase);
                if (locale == null) {
                    locale = m55130a(nextToken, upperCase);
                }
                if (locale == null) {
                    locale = new Locale(nextToken, upperCase);
                }
            } else {
                locale = new Locale(nextToken, upperCase);
            }
            return locale;
        }
        Logger.m43087k(str3, "Unexpected number of tokens, must be at least one and at most two", new Object[0]);
        return locale2;
    }

    /* renamed from: d */
    public static String m55133d(Locale locale) {
        if (locale == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        if (kb6.m46949b(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(Locale.US));
        }
        return sb.toString();
    }
}
