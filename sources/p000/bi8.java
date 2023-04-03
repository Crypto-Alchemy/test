package p000;

import android.content.SharedPreferences;

/* renamed from: bi8 */
public final class bi8 extends c48<Integer> {
    /* renamed from: a */
    public static Integer m32578a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) wk8.m53945a(new jl8(sharedPreferences, str, num));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            }
            return num;
        }
    }
}
