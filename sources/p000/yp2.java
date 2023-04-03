package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;

/* renamed from: yp2 */
/* compiled from: IdGenerator */
public class yp2 {

    /* renamed from: a */
    public final WorkDatabase f20311a;

    public yp2(WorkDatabase workDatabase) {
        this.f20311a = workDatabase;
    }

    /* renamed from: a */
    public static void m30721a(Context context, SupportSQLiteDatabase supportSQLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.setTransactionSuccessful();
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }

    /* renamed from: b */
    public int mo28170b() {
        int c;
        synchronized (yp2.class) {
            c = mo28171c("next_alarm_manager_id");
        }
        return c;
    }

    /* renamed from: c */
    public final int mo28171c(String str) {
        int i;
        this.f20311a.mo10119e();
        try {
            Long a = this.f20311a.mo10951J().mo23406a(str);
            int i2 = 0;
            if (a != null) {
                i = a.intValue();
            } else {
                i = 0;
            }
            if (i != Integer.MAX_VALUE) {
                i2 = i + 1;
            }
            mo28173e(str, i2);
            this.f20311a.mo10115C();
            return i;
        } finally {
            this.f20311a.mo10124j();
        }
    }

    /* renamed from: d */
    public int mo28172d(int i, int i2) {
        synchronized (yp2.class) {
            int c = mo28171c("next_job_scheduler_id");
            if (c >= i) {
                if (c <= i2) {
                    i = c;
                }
            }
            mo28173e("next_job_scheduler_id", i + 1);
        }
        return i;
    }

    /* renamed from: e */
    public final void mo28173e(String str, int i) {
        this.f20311a.mo10951J().mo23407b(new lu4(str, (long) i));
    }
}
