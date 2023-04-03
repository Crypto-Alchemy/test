package p000;

import android.content.SharedPreferences;

/* renamed from: r78 */
public final class r78 extends i68<Boolean> {
    public r78(n88 n88, String str, Boolean bool) {
        super(n88, str, bool, (i78) null);
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo29888j(String str) {
        if (gk9.f29250c.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (gk9.f29251d.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.f29835b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        return null;
    }

    /* renamed from: r */
    public final Boolean mo29887c(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f29835b, false));
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.f29835b);
            if (valueOf.length() == 0) {
                return null;
            }
            "Invalid boolean value in SharedPreferences for ".concat(valueOf);
            return null;
        }
    }
}
