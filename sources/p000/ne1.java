package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: ne1 */
/* compiled from: DeviceUtils */
public class ne1 {
    /* renamed from: a */
    public static boolean m23121a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return m23122b(context, str, b15.assume_strong_biometrics_models);
    }

    /* renamed from: b */
    public static boolean m23122b(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : context.getResources().getStringArray(i)) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m23123c(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(i)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m23124d(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equalsIgnoreCase : context.getResources().getStringArray(i)) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m23125e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return m23122b(context, str, b15.delay_showing_prompt_models);
    }

    /* renamed from: f */
    public static boolean m23126f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return m23123c(context, str, b15.hide_fingerprint_instantly_prefixes);
    }

    /* renamed from: g */
    public static boolean m23127g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        if (m23124d(context, str, b15.crypto_fingerprint_fallback_vendors) || m23123c(context, str2, b15.crypto_fingerprint_fallback_prefixes)) {
            return true;
        }
        return false;
    }
}
