package p000;

import android.content.SharedPreferences;

/* renamed from: ap8 */
public final class ap8 extends c48<Long> {
    /* renamed from: a */
    public static Long m31902a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) wk8.m53945a(new ks8(sharedPreferences, str, l));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            }
            return l;
        }
    }
}
