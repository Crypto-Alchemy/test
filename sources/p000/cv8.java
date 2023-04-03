package p000;

import android.content.SharedPreferences;

/* renamed from: cv8 */
public final class cv8 extends c48<String> {
    /* renamed from: a */
    public static String m43252a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) wk8.m53945a(new gy8(sharedPreferences, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            }
            return str2;
        }
    }
}
