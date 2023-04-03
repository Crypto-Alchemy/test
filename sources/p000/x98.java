package p000;

import android.content.SharedPreferences;

/* renamed from: x98 */
public final class x98 extends c48<Boolean> {
    /* renamed from: a */
    public static Boolean m54316a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) wk8.m53945a(new te8(sharedPreferences, str, bool));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            }
            return bool;
        }
    }
}
