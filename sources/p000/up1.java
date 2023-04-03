package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;

/* renamed from: up1 */
/* compiled from: EncryptedSharedPrefs */
public class up1 {

    /* renamed from: a */
    public static String f45162a = "safemoon_encrypted_shared_prefs";

    /* renamed from: b */
    public static String f45163b = "safemoon_shared_prefs";

    /* renamed from: a */
    public static void m72956a(Context context) {
        m72957b(context).edit().clear().apply();
    }

    /* renamed from: b */
    public static SharedPreferences m72957b(Context context) {
        try {
            return EncryptedSharedPreferences.m9850b(f45162a, ko3.m20943c(ko3.f14239a), context, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        } catch (Exception e) {
            e.printStackTrace();
            dq6.m57042b("Khang").mo51264a("Exception: %s", e.getLocalizedMessage());
            return context.getSharedPreferences(f45163b, 0);
        }
    }

    /* renamed from: c */
    public static String m72958c(Context context, String str) {
        return m72957b(context).getString(str, "");
    }

    /* renamed from: d */
    public static String m72959d(Context context, String str, String str2) {
        return m72957b(context).getString(str, str2);
    }

    /* renamed from: e */
    public static void m72960e(Context context, String str, String str2) {
        m72957b(context).edit().putString(str, str2).apply();
    }
}
