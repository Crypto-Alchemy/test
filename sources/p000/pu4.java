package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;

/* renamed from: pu4 */
/* compiled from: PreferenceUtils */
public class pu4 {

    /* renamed from: a */
    public final WorkDatabase f16651a;

    public pu4(WorkDatabase workDatabase) {
        this.f16651a = workDatabase;
    }

    /* renamed from: b */
    public static void m25178b(Context context, SupportSQLiteDatabase supportSQLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.setTransactionSuccessful();
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }

    /* renamed from: a */
    public boolean mo24791a() {
        Long a = this.f16651a.mo10951J().mo23406a("reschedule_needed");
        if (a == null || a.longValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo24792c(boolean z) {
        this.f16651a.mo10951J().mo23407b(new lu4("reschedule_needed", z));
    }
}
