package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;

/* renamed from: x40 */
/* compiled from: BuildCompat */
public class x40 {
    /* renamed from: a */
    public static boolean m29872a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m29873b() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    /* renamed from: c */
    public static boolean m29874c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || (i >= 30 && m29872a("S", Build.VERSION.CODENAME))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m29875d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 32 && m29872a("Tiramisu", Build.VERSION.CODENAME))) {
            return true;
        }
        return false;
    }
}
