package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ab8 */
public final class ab8 {

    /* renamed from: a */
    public SharedPreferences f20893a;

    public ab8(Context context) {
        try {
            Context d = mi2.m48309d(context);
            this.f20893a = d == null ? null : d.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable unused) {
            this.f20893a = null;
        }
    }

    /* renamed from: a */
    public final boolean mo28911a(String str, boolean z) {
        try {
            SharedPreferences sharedPreferences = this.f20893a;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final float mo28912b(String str, float f) {
        try {
            SharedPreferences sharedPreferences = this.f20893a;
            return sharedPreferences == null ? Utils.FLOAT_EPSILON : sharedPreferences.getFloat(str, Utils.FLOAT_EPSILON);
        } catch (Throwable unused) {
            return Utils.FLOAT_EPSILON;
        }
    }

    /* renamed from: c */
    public final String mo28913c(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f20893a;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
