package androidx.work.impl;

import android.content.Context;
import androidx.sqlite.p006db.SupportSQLiteDatabase;

/* renamed from: androidx.work.impl.a */
/* compiled from: WorkDatabaseMigrations */
public class C1528a {

    /* renamed from: a */
    public static tv3 f7549a = new C1529a(1, 2);

    /* renamed from: b */
    public static tv3 f7550b = new C1530b(3, 4);

    /* renamed from: c */
    public static tv3 f7551c = new C1531c(4, 5);

    /* renamed from: d */
    public static tv3 f7552d = new C1532d(6, 7);

    /* renamed from: e */
    public static tv3 f7553e = new C1533e(7, 8);

    /* renamed from: f */
    public static tv3 f7554f = new C1534f(8, 9);

    /* renamed from: g */
    public static tv3 f7555g = new C1535g(11, 12);

    /* renamed from: androidx.work.impl.a$a */
    /* compiled from: WorkDatabaseMigrations */
    public class C1529a extends tv3 {
        public C1529a(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS alarmInfo");
            supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.a$b */
    /* compiled from: WorkDatabaseMigrations */
    public class C1530b extends tv3 {
        public C1530b(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* renamed from: androidx.work.impl.a$c */
    /* compiled from: WorkDatabaseMigrations */
    public class C1531c extends tv3 {
        public C1531c(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.a$d */
    /* compiled from: WorkDatabaseMigrations */
    public class C1532d extends tv3 {
        public C1532d(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.a$e */
    /* compiled from: WorkDatabaseMigrations */
    public class C1533e extends tv3 {
        public C1533e(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.a$f */
    /* compiled from: WorkDatabaseMigrations */
    public class C1534f extends tv3 {
        public C1534f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$g */
    /* compiled from: WorkDatabaseMigrations */
    public class C1535g extends tv3 {
        public C1535g(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$h */
    /* compiled from: WorkDatabaseMigrations */
    public static class C1536h extends tv3 {

        /* renamed from: c */
        public final Context f7556c;

        public C1536h(Context context, int i, int i2) {
            super(i, i2);
            this.f7556c = context;
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (this.f18286b >= 10) {
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.f7556c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* renamed from: androidx.work.impl.a$i */
    /* compiled from: WorkDatabaseMigrations */
    public static class C1537i extends tv3 {

        /* renamed from: c */
        public final Context f7557c;

        public C1537i(Context context) {
            super(9, 10);
            this.f7557c = context;
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            pu4.m25178b(this.f7557c, supportSQLiteDatabase);
            yp2.m30721a(this.f7557c, supportSQLiteDatabase);
        }
    }
}
