package p000;

import android.content.SharedPreferences;

/* renamed from: s78 */
public final class s78 extends i68<String> {
    public s78(n88 n88, String str, String str2) {
        super(n88, str, str2, (i78) null);
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo29888j(String str) {
        return str;
    }

    /* renamed from: r */
    public final String mo29887c(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.f29835b, (String) null);
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.f29835b);
            if (valueOf.length() != 0) {
                "Invalid string value in SharedPreferences for ".concat(valueOf);
            }
            return null;
        }
    }
}
