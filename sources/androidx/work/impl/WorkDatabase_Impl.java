package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.kh5;
import p000.kl6;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q */
    public volatile bn7 f7541q;

    /* renamed from: r */
    public volatile kc1 f7542r;

    /* renamed from: s */
    public volatile en7 f7543s;

    /* renamed from: t */
    public volatile nk6 f7544t;

    /* renamed from: u */
    public volatile qm7 f7545u;

    /* renamed from: v */
    public volatile tm7 f7546v;

    /* renamed from: w */
    public volatile mu4 f7547w;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    public class C1527a extends kh5.C2681b {
        public C1527a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo10957a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        /* renamed from: b */
        public void mo10958b(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f6881h != null) {
                int size = WorkDatabase_Impl.this.f6881h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C1367b) WorkDatabase_Impl.this.f6881h.get(i)).mo10151b(supportSQLiteDatabase);
                }
            }
        }

        /* renamed from: c */
        public void mo10959c(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (WorkDatabase_Impl.this.f6881h != null) {
                int size = WorkDatabase_Impl.this.f6881h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C1367b) WorkDatabase_Impl.this.f6881h.get(i)).mo10150a(supportSQLiteDatabase);
                }
            }
        }

        /* renamed from: d */
        public void mo10960d(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase unused = WorkDatabase_Impl.this.f6874a = supportSQLiteDatabase;
            supportSQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.mo10138x(supportSQLiteDatabase);
            if (WorkDatabase_Impl.this.f6881h != null) {
                int size = WorkDatabase_Impl.this.f6881h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C1367b) WorkDatabase_Impl.this.f6881h.get(i)).mo10152c(supportSQLiteDatabase);
                }
            }
        }

        /* renamed from: e */
        public void mo10961e(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* renamed from: f */
        public void mo10962f(SupportSQLiteDatabase supportSQLiteDatabase) {
            iz0.m19912b(supportSQLiteDatabase);
        }

        /* renamed from: g */
        public kh5.C2682c mo10963g(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new kl6.C2707a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new kl6.C2707a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new kl6.C2710c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new kl6.C2710c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new kl6.C2712e("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new kl6.C2712e("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            kl6 kl6 = new kl6("Dependency", hashMap, hashSet, hashSet2);
            kl6 a = kl6.m20892a(supportSQLiteDatabase2, "Dependency");
            if (!kl6.equals(a)) {
                return new kh5.C2682c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + kl6 + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new kl6.C2707a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new kl6.C2707a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new kl6.C2707a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new kl6.C2707a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new kl6.C2707a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new kl6.C2707a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new kl6.C2707a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new kl6.C2707a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new kl6.C2707a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new kl6.C2707a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new kl6.C2707a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new kl6.C2707a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_start_time", new kl6.C2707a("period_start_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new kl6.C2707a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new kl6.C2707a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new kl6.C2707a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new kl6.C2707a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("required_network_type", new kl6.C2707a("required_network_type", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("requires_charging", new kl6.C2707a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new kl6.C2707a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new kl6.C2707a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new kl6.C2707a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new kl6.C2707a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new kl6.C2707a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new kl6.C2707a("content_uri_triggers", "BLOB", false, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new kl6.C2712e("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
            hashSet4.add(new kl6.C2712e("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"})));
            kl6 kl62 = new kl6("WorkSpec", hashMap2, hashSet3, hashSet4);
            kl6 a2 = kl6.m20892a(supportSQLiteDatabase2, "WorkSpec");
            if (!kl62.equals(a2)) {
                return new kh5.C2682c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + kl62 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new kl6.C2707a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new kl6.C2707a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new kl6.C2710c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new kl6.C2712e("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            kl6 kl63 = new kl6("WorkTag", hashMap3, hashSet5, hashSet6);
            kl6 a3 = kl6.m20892a(supportSQLiteDatabase2, "WorkTag");
            if (!kl63.equals(a3)) {
                return new kh5.C2682c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + kl63 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new kl6.C2707a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("system_id", new kl6.C2707a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new kl6.C2710c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            kl6 kl64 = new kl6("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            kl6 a4 = kl6.m20892a(supportSQLiteDatabase2, "SystemIdInfo");
            if (!kl64.equals(a4)) {
                return new kh5.C2682c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + kl64 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(PublicResolver.FUNC_NAME, new kl6.C2707a(PublicResolver.FUNC_NAME, "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new kl6.C2707a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new kl6.C2710c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new kl6.C2712e("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            kl6 kl65 = new kl6("WorkName", hashMap5, hashSet8, hashSet9);
            kl6 a5 = kl6.m20892a(supportSQLiteDatabase2, "WorkName");
            if (!kl65.equals(a5)) {
                return new kh5.C2682c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + kl65 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new kl6.C2707a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new kl6.C2707a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new kl6.C2710c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            kl6 kl66 = new kl6("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            kl6 a6 = kl6.m20892a(supportSQLiteDatabase2, "WorkProgress");
            if (!kl66.equals(a6)) {
                return new kh5.C2682c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + kl66 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new kl6.C2707a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new kl6.C2707a("long_value", "INTEGER", false, 0, (String) null, 1));
            kl6 kl67 = new kl6("Preference", hashMap7, new HashSet(0), new HashSet(0));
            kl6 a7 = kl6.m20892a(supportSQLiteDatabase2, "Preference");
            if (kl67.equals(a7)) {
                return new kh5.C2682c(true, (String) null);
            }
            return new kh5.C2682c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + kl67 + "\n Found:\n" + a7);
        }
    }

    /* renamed from: F */
    public kc1 mo10950F() {
        kc1 kc1;
        if (this.f7542r != null) {
            return this.f7542r;
        }
        synchronized (this) {
            if (this.f7542r == null) {
                this.f7542r = new lc1(this);
            }
            kc1 = this.f7542r;
        }
        return kc1;
    }

    /* renamed from: J */
    public mu4 mo10951J() {
        mu4 mu4;
        if (this.f7547w != null) {
            return this.f7547w;
        }
        synchronized (this) {
            if (this.f7547w == null) {
                this.f7547w = new nu4(this);
            }
            mu4 = this.f7547w;
        }
        return mu4;
    }

    /* renamed from: K */
    public nk6 mo10952K() {
        nk6 nk6;
        if (this.f7544t != null) {
            return this.f7544t;
        }
        synchronized (this) {
            if (this.f7544t == null) {
                this.f7544t = new ok6(this);
            }
            nk6 = this.f7544t;
        }
        return nk6;
    }

    /* renamed from: L */
    public qm7 mo10953L() {
        qm7 qm7;
        if (this.f7545u != null) {
            return this.f7545u;
        }
        synchronized (this) {
            if (this.f7545u == null) {
                this.f7545u = new rm7(this);
            }
            qm7 = this.f7545u;
        }
        return qm7;
    }

    /* renamed from: M */
    public tm7 mo10954M() {
        tm7 tm7;
        if (this.f7546v != null) {
            return this.f7546v;
        }
        synchronized (this) {
            if (this.f7546v == null) {
                this.f7546v = new um7(this);
            }
            tm7 = this.f7546v;
        }
        return tm7;
    }

    /* renamed from: N */
    public bn7 mo10955N() {
        bn7 bn7;
        if (this.f7541q != null) {
            return this.f7541q;
        }
        synchronized (this) {
            if (this.f7541q == null) {
                this.f7541q = new cn7(this);
            }
            bn7 = this.f7541q;
        }
        return bn7;
    }

    /* renamed from: O */
    public en7 mo10956O() {
        en7 en7;
        if (this.f7543s != null) {
            return this.f7543s;
        }
        synchronized (this) {
            if (this.f7543s == null) {
                this.f7543s = new fn7(this);
            }
            en7 = this.f7543s;
        }
        return en7;
    }

    /* renamed from: h */
    public gy2 mo10122h() {
        return new gy2(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* renamed from: i */
    public SupportSQLiteOpenHelper mo10123i(j21 j21) {
        return j21.f13481c.create(SupportSQLiteOpenHelper.Configuration.m9911a(j21.f13479a).mo10273c(j21.f13480b).mo10272b(new kh5(j21, new C1527a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).mo10271a());
    }
}
