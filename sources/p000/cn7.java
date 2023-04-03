package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import androidx.work.C1519b;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import p000.an7;

/* renamed from: cn7 */
/* compiled from: WorkSpecDao_Impl */
public final class cn7 implements bn7 {

    /* renamed from: a */
    public final RoomDatabase f8484a;

    /* renamed from: b */
    public final vq1<an7> f8485b;

    /* renamed from: c */
    public final SharedSQLiteStatement f8486c;

    /* renamed from: d */
    public final SharedSQLiteStatement f8487d;

    /* renamed from: e */
    public final SharedSQLiteStatement f8488e;

    /* renamed from: f */
    public final SharedSQLiteStatement f8489f;

    /* renamed from: g */
    public final SharedSQLiteStatement f8490g;

    /* renamed from: h */
    public final SharedSQLiteStatement f8491h;

    /* renamed from: i */
    public final SharedSQLiteStatement f8492i;

    /* renamed from: j */
    public final SharedSQLiteStatement f8493j;

    /* renamed from: cn7$a */
    /* compiled from: WorkSpecDao_Impl */
    public class C1689a extends vq1<an7> {
        public C1689a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, an7 an7) {
            String str = an7.f204a;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, (long) hn7.m19118j(an7.f205b));
            String str2 = an7.f206c;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            String str3 = an7.f207d;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
            byte[] n = C1519b.m10472n(an7.f208e);
            if (n == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindBlob(5, n);
            }
            byte[] n2 = C1519b.m10472n(an7.f209f);
            if (n2 == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindBlob(6, n2);
            }
            supportSQLiteStatement.bindLong(7, an7.f210g);
            supportSQLiteStatement.bindLong(8, an7.f211h);
            supportSQLiteStatement.bindLong(9, an7.f212i);
            supportSQLiteStatement.bindLong(10, (long) an7.f214k);
            supportSQLiteStatement.bindLong(11, (long) hn7.m19109a(an7.f215l));
            supportSQLiteStatement.bindLong(12, an7.f216m);
            supportSQLiteStatement.bindLong(13, an7.f217n);
            supportSQLiteStatement.bindLong(14, an7.f218o);
            supportSQLiteStatement.bindLong(15, an7.f219p);
            supportSQLiteStatement.bindLong(16, an7.f220q ? 1 : 0);
            supportSQLiteStatement.bindLong(17, (long) hn7.m19117i(an7.f221r));
            nq0 nq0 = an7.f213j;
            if (nq0 != null) {
                supportSQLiteStatement.bindLong(18, (long) hn7.m19116h(nq0.mo23759b()));
                supportSQLiteStatement.bindLong(19, nq0.mo23765g() ? 1 : 0);
                supportSQLiteStatement.bindLong(20, nq0.mo23766h() ? 1 : 0);
                supportSQLiteStatement.bindLong(21, nq0.mo23764f() ? 1 : 0);
                supportSQLiteStatement.bindLong(22, nq0.mo23768i() ? 1 : 0);
                supportSQLiteStatement.bindLong(23, nq0.mo23760c());
                supportSQLiteStatement.bindLong(24, nq0.mo23761d());
                byte[] c = hn7.m19111c(nq0.mo23758a());
                if (c == null) {
                    supportSQLiteStatement.bindNull(25);
                } else {
                    supportSQLiteStatement.bindBlob(25, c);
                }
            } else {
                supportSQLiteStatement.bindNull(18);
                supportSQLiteStatement.bindNull(19);
                supportSQLiteStatement.bindNull(20);
                supportSQLiteStatement.bindNull(21);
                supportSQLiteStatement.bindNull(22);
                supportSQLiteStatement.bindNull(23);
                supportSQLiteStatement.bindNull(24);
                supportSQLiteStatement.bindNull(25);
            }
        }
    }

    /* renamed from: cn7$b */
    /* compiled from: WorkSpecDao_Impl */
    public class C1690b extends SharedSQLiteStatement {
        public C1690b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: cn7$c */
    /* compiled from: WorkSpecDao_Impl */
    public class C1691c extends SharedSQLiteStatement {
        public C1691c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: cn7$d */
    /* compiled from: WorkSpecDao_Impl */
    public class C1692d extends SharedSQLiteStatement {
        public C1692d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: cn7$e */
    /* compiled from: WorkSpecDao_Impl */
    public class C1693e extends SharedSQLiteStatement {
        public C1693e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: cn7$f */
    /* compiled from: WorkSpecDao_Impl */
    public class C1694f extends SharedSQLiteStatement {
        public C1694f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: cn7$g */
    /* compiled from: WorkSpecDao_Impl */
    public class C1695g extends SharedSQLiteStatement {
        public C1695g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: cn7$h */
    /* compiled from: WorkSpecDao_Impl */
    public class C1696h extends SharedSQLiteStatement {
        public C1696h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: cn7$i */
    /* compiled from: WorkSpecDao_Impl */
    public class C1697i extends SharedSQLiteStatement {
        public C1697i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public cn7(RoomDatabase roomDatabase) {
        this.f8484a = roomDatabase;
        this.f8485b = new C1689a(roomDatabase);
        this.f8486c = new C1690b(roomDatabase);
        this.f8487d = new C1691c(roomDatabase);
        this.f8488e = new C1692d(roomDatabase);
        this.f8489f = new C1693e(roomDatabase);
        this.f8490g = new C1694f(roomDatabase);
        this.f8491h = new C1695g(roomDatabase);
        this.f8492i = new C1696h(roomDatabase);
        this.f8493j = new C1697i(roomDatabase);
    }

    /* renamed from: a */
    public int mo11709a(WorkInfo.State state, String... strArr) {
        this.f8484a.mo10118d();
        StringBuilder b = ib6.m19545b();
        b.append("UPDATE workspec SET state=");
        b.append("?");
        b.append(" WHERE id IN (");
        ib6.m19544a(b, strArr.length);
        b.append(")");
        SupportSQLiteStatement g = this.f8484a.mo10121g(b.toString());
        g.bindLong(1, (long) hn7.m19118j(state));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                g.bindNull(i);
            } else {
                g.bindString(i, str);
            }
            i++;
        }
        this.f8484a.mo10119e();
        try {
            int executeUpdateDelete = g.executeUpdateDelete();
            this.f8484a.mo10115C();
            return executeUpdateDelete;
        } finally {
            this.f8484a.mo10124j();
        }
    }

    /* renamed from: b */
    public List<an7> mo11710b(long j) {
        lh5 lh5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        lh5 a = lh5.m21448a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        a.bindLong(1, j);
        this.f8484a.mo10118d();
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            int e = px0.m25190e(c, "required_network_type");
            int e2 = px0.m25190e(c, "requires_charging");
            int e3 = px0.m25190e(c, "requires_device_idle");
            int e4 = px0.m25190e(c, "requires_battery_not_low");
            int e5 = px0.m25190e(c, "requires_storage_not_low");
            int e6 = px0.m25190e(c, "trigger_content_update_delay");
            int e7 = px0.m25190e(c, "trigger_max_content_delay");
            int e8 = px0.m25190e(c, "content_uri_triggers");
            int e9 = px0.m25190e(c, "id");
            int e10 = px0.m25190e(c, "state");
            int e11 = px0.m25190e(c, "worker_class_name");
            int e12 = px0.m25190e(c, "input_merger_class_name");
            int e13 = px0.m25190e(c, "input");
            int e14 = px0.m25190e(c, "output");
            lh5 = a;
            try {
                int e15 = px0.m25190e(c, "initial_delay");
                int e16 = px0.m25190e(c, "interval_duration");
                int e17 = px0.m25190e(c, "flex_duration");
                int e18 = px0.m25190e(c, "run_attempt_count");
                int e19 = px0.m25190e(c, "backoff_policy");
                int e20 = px0.m25190e(c, "backoff_delay_duration");
                int e21 = px0.m25190e(c, "period_start_time");
                int e22 = px0.m25190e(c, "minimum_retention_duration");
                int e23 = px0.m25190e(c, "schedule_requested_at");
                int e24 = px0.m25190e(c, "run_in_foreground");
                int e25 = px0.m25190e(c, "out_of_quota_policy");
                int i = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string = c.getString(e9);
                    int i2 = e9;
                    String string2 = c.getString(e11);
                    int i3 = e11;
                    nq0 nq0 = new nq0();
                    int i4 = e;
                    nq0.mo23770k(hn7.m19113e(c.getInt(e)));
                    if (c.getInt(e2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nq0.mo23772m(z);
                    if (c.getInt(e3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    nq0.mo23773n(z2);
                    if (c.getInt(e4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    nq0.mo23771l(z3);
                    if (c.getInt(e5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    nq0.mo23774o(z4);
                    int i5 = e2;
                    int i6 = e3;
                    nq0.mo23775p(c.getLong(e6));
                    nq0.mo23776q(c.getLong(e7));
                    nq0.mo23769j(hn7.m19110b(c.getBlob(e8)));
                    an7 an7 = new an7(string, string2);
                    an7.f205b = hn7.m19115g(c.getInt(e10));
                    an7.f207d = c.getString(e12);
                    an7.f208e = C1519b.m10471g(c.getBlob(e13));
                    int i7 = i;
                    an7.f209f = C1519b.m10471g(c.getBlob(i7));
                    int i8 = e15;
                    int i9 = i5;
                    i = i7;
                    an7.f210g = c.getLong(i8);
                    int i10 = e12;
                    int i11 = e16;
                    an7.f211h = c.getLong(i11);
                    int i12 = i8;
                    int i13 = e4;
                    int i14 = e17;
                    an7.f212i = c.getLong(i14);
                    int i15 = e18;
                    an7.f214k = c.getInt(i15);
                    int i16 = e19;
                    int i17 = i11;
                    an7.f215l = hn7.m19112d(c.getInt(i16));
                    e17 = i14;
                    int i18 = i13;
                    int i19 = e20;
                    an7.f216m = c.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = e21;
                    an7.f217n = c.getLong(i22);
                    int i23 = i19;
                    e21 = i22;
                    int i24 = e22;
                    an7.f218o = c.getLong(i24);
                    int i25 = i20;
                    int i26 = e23;
                    an7.f219p = c.getLong(i26);
                    int i27 = e24;
                    if (c.getInt(i27) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    an7.f220q = z5;
                    int i28 = e25;
                    int i29 = i26;
                    an7.f221r = hn7.m19114f(c.getInt(i28));
                    an7.f213j = nq0;
                    arrayList.add(an7);
                    e2 = i9;
                    e25 = i28;
                    e12 = i10;
                    e15 = i12;
                    e16 = i17;
                    e18 = i25;
                    e23 = i29;
                    e9 = i2;
                    e11 = i3;
                    e = i4;
                    e24 = i27;
                    e22 = i24;
                    e3 = i6;
                    int i30 = i21;
                    e20 = i23;
                    e4 = i18;
                    e19 = i30;
                }
                c.close();
                lh5.mo22765f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                lh5.mo22765f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lh5 = a;
            c.close();
            lh5.mo22765f();
            throw th;
        }
    }

    /* renamed from: c */
    public List<an7> mo11711c() {
        lh5 lh5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        lh5 a = lh5.m21448a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f8484a.mo10118d();
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            int e = px0.m25190e(c, "required_network_type");
            int e2 = px0.m25190e(c, "requires_charging");
            int e3 = px0.m25190e(c, "requires_device_idle");
            int e4 = px0.m25190e(c, "requires_battery_not_low");
            int e5 = px0.m25190e(c, "requires_storage_not_low");
            int e6 = px0.m25190e(c, "trigger_content_update_delay");
            int e7 = px0.m25190e(c, "trigger_max_content_delay");
            int e8 = px0.m25190e(c, "content_uri_triggers");
            int e9 = px0.m25190e(c, "id");
            int e10 = px0.m25190e(c, "state");
            int e11 = px0.m25190e(c, "worker_class_name");
            int e12 = px0.m25190e(c, "input_merger_class_name");
            int e13 = px0.m25190e(c, "input");
            int e14 = px0.m25190e(c, "output");
            lh5 = a;
            try {
                int e15 = px0.m25190e(c, "initial_delay");
                int e16 = px0.m25190e(c, "interval_duration");
                int e17 = px0.m25190e(c, "flex_duration");
                int e18 = px0.m25190e(c, "run_attempt_count");
                int e19 = px0.m25190e(c, "backoff_policy");
                int e20 = px0.m25190e(c, "backoff_delay_duration");
                int e21 = px0.m25190e(c, "period_start_time");
                int e22 = px0.m25190e(c, "minimum_retention_duration");
                int e23 = px0.m25190e(c, "schedule_requested_at");
                int e24 = px0.m25190e(c, "run_in_foreground");
                int e25 = px0.m25190e(c, "out_of_quota_policy");
                int i = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string = c.getString(e9);
                    int i2 = e9;
                    String string2 = c.getString(e11);
                    int i3 = e11;
                    nq0 nq0 = new nq0();
                    int i4 = e;
                    nq0.mo23770k(hn7.m19113e(c.getInt(e)));
                    if (c.getInt(e2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nq0.mo23772m(z);
                    if (c.getInt(e3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    nq0.mo23773n(z2);
                    if (c.getInt(e4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    nq0.mo23771l(z3);
                    if (c.getInt(e5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    nq0.mo23774o(z4);
                    int i5 = e2;
                    int i6 = e3;
                    nq0.mo23775p(c.getLong(e6));
                    nq0.mo23776q(c.getLong(e7));
                    nq0.mo23769j(hn7.m19110b(c.getBlob(e8)));
                    an7 an7 = new an7(string, string2);
                    an7.f205b = hn7.m19115g(c.getInt(e10));
                    an7.f207d = c.getString(e12);
                    an7.f208e = C1519b.m10471g(c.getBlob(e13));
                    int i7 = i;
                    an7.f209f = C1519b.m10471g(c.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = e15;
                    an7.f210g = c.getLong(i9);
                    int i10 = e13;
                    int i11 = e16;
                    an7.f211h = c.getLong(i11);
                    int i12 = i9;
                    int i13 = e4;
                    int i14 = e17;
                    an7.f212i = c.getLong(i14);
                    int i15 = e18;
                    an7.f214k = c.getInt(i15);
                    int i16 = e19;
                    int i17 = i11;
                    an7.f215l = hn7.m19112d(c.getInt(i16));
                    e17 = i14;
                    int i18 = i13;
                    int i19 = e20;
                    an7.f216m = c.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = e21;
                    an7.f217n = c.getLong(i22);
                    int i23 = i19;
                    e21 = i22;
                    int i24 = e22;
                    an7.f218o = c.getLong(i24);
                    int i25 = i20;
                    int i26 = e23;
                    an7.f219p = c.getLong(i26);
                    int i27 = e24;
                    if (c.getInt(i27) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    an7.f220q = z5;
                    int i28 = e25;
                    int i29 = i26;
                    an7.f221r = hn7.m19114f(c.getInt(i28));
                    an7.f213j = nq0;
                    arrayList.add(an7);
                    e25 = i28;
                    e2 = i8;
                    e13 = i10;
                    e15 = i12;
                    e16 = i17;
                    e18 = i25;
                    e23 = i29;
                    e9 = i2;
                    e11 = i3;
                    e = i4;
                    e24 = i27;
                    e22 = i24;
                    e3 = i6;
                    int i30 = i21;
                    e20 = i23;
                    e4 = i18;
                    e19 = i30;
                }
                c.close();
                lh5.mo22765f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                lh5.mo22765f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lh5 = a;
            c.close();
            lh5.mo22765f();
            throw th;
        }
    }

    /* renamed from: d */
    public List<String> mo11712d(String str) {
        lh5 a = lh5.m21448a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f8484a.mo10118d();
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(c.getString(0));
            }
            return arrayList;
        } finally {
            c.close();
            a.mo22765f();
        }
    }

    public void delete(String str) {
        this.f8484a.mo10118d();
        SupportSQLiteStatement b = this.f8486c.mo10162b();
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f8484a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f8484a.mo10115C();
        } finally {
            this.f8484a.mo10124j();
            this.f8486c.mo10168h(b);
        }
    }

    /* renamed from: e */
    public WorkInfo.State mo11714e(String str) {
        lh5 a = lh5.m21448a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f8484a.mo10118d();
        WorkInfo.State state = null;
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                state = hn7.m19115g(c.getInt(0));
            }
            return state;
        } finally {
            c.close();
            a.mo22765f();
        }
    }

    /* renamed from: f */
    public an7 mo11715f(String str) {
        lh5 lh5;
        an7 an7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2 = str;
        lh5 a = lh5.m21448a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str2);
        }
        this.f8484a.mo10118d();
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            int e = px0.m25190e(c, "required_network_type");
            int e2 = px0.m25190e(c, "requires_charging");
            int e3 = px0.m25190e(c, "requires_device_idle");
            int e4 = px0.m25190e(c, "requires_battery_not_low");
            int e5 = px0.m25190e(c, "requires_storage_not_low");
            int e6 = px0.m25190e(c, "trigger_content_update_delay");
            int e7 = px0.m25190e(c, "trigger_max_content_delay");
            int e8 = px0.m25190e(c, "content_uri_triggers");
            int e9 = px0.m25190e(c, "id");
            int e10 = px0.m25190e(c, "state");
            int e11 = px0.m25190e(c, "worker_class_name");
            int e12 = px0.m25190e(c, "input_merger_class_name");
            int e13 = px0.m25190e(c, "input");
            int e14 = px0.m25190e(c, "output");
            lh5 = a;
            try {
                int e15 = px0.m25190e(c, "initial_delay");
                int e16 = px0.m25190e(c, "interval_duration");
                int e17 = px0.m25190e(c, "flex_duration");
                int e18 = px0.m25190e(c, "run_attempt_count");
                int e19 = px0.m25190e(c, "backoff_policy");
                int e20 = px0.m25190e(c, "backoff_delay_duration");
                int e21 = px0.m25190e(c, "period_start_time");
                int e22 = px0.m25190e(c, "minimum_retention_duration");
                int e23 = px0.m25190e(c, "schedule_requested_at");
                int e24 = px0.m25190e(c, "run_in_foreground");
                int e25 = px0.m25190e(c, "out_of_quota_policy");
                if (c.moveToFirst()) {
                    String string = c.getString(e9);
                    String string2 = c.getString(e11);
                    int i = e25;
                    nq0 nq0 = new nq0();
                    nq0.mo23770k(hn7.m19113e(c.getInt(e)));
                    if (c.getInt(e2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nq0.mo23772m(z);
                    if (c.getInt(e3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    nq0.mo23773n(z2);
                    if (c.getInt(e4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    nq0.mo23771l(z3);
                    if (c.getInt(e5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    nq0.mo23774o(z4);
                    nq0.mo23775p(c.getLong(e6));
                    nq0.mo23776q(c.getLong(e7));
                    nq0.mo23769j(hn7.m19110b(c.getBlob(e8)));
                    an7 an72 = new an7(string, string2);
                    an72.f205b = hn7.m19115g(c.getInt(e10));
                    an72.f207d = c.getString(e12);
                    an72.f208e = C1519b.m10471g(c.getBlob(e13));
                    an72.f209f = C1519b.m10471g(c.getBlob(e14));
                    an72.f210g = c.getLong(e15);
                    an72.f211h = c.getLong(e16);
                    an72.f212i = c.getLong(e17);
                    an72.f214k = c.getInt(e18);
                    an72.f215l = hn7.m19112d(c.getInt(e19));
                    an72.f216m = c.getLong(e20);
                    an72.f217n = c.getLong(e21);
                    an72.f218o = c.getLong(e22);
                    an72.f219p = c.getLong(e23);
                    if (c.getInt(e24) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    an72.f220q = z5;
                    an72.f221r = hn7.m19114f(c.getInt(i));
                    an72.f213j = nq0;
                    an7 = an72;
                } else {
                    an7 = null;
                }
                c.close();
                lh5.mo22765f();
                return an7;
            } catch (Throwable th) {
                th = th;
                c.close();
                lh5.mo22765f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lh5 = a;
            c.close();
            lh5.mo22765f();
            throw th;
        }
    }

    /* renamed from: g */
    public void mo11716g(an7 an7) {
        this.f8484a.mo10118d();
        this.f8484a.mo10119e();
        try {
            this.f8485b.mo27296j(an7);
            this.f8484a.mo10115C();
        } finally {
            this.f8484a.mo10124j();
        }
    }

    /* renamed from: h */
    public List<String> mo11717h(String str) {
        lh5 a = lh5.m21448a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f8484a.mo10118d();
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(c.getString(0));
            }
            return arrayList;
        } finally {
            c.close();
            a.mo22765f();
        }
    }

    /* renamed from: i */
    public List<C1519b> mo11718i(String str) {
        lh5 a = lh5.m21448a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f8484a.mo10118d();
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(C1519b.m10471g(c.getBlob(0)));
            }
            return arrayList;
        } finally {
            c.close();
            a.mo22765f();
        }
    }

    /* renamed from: j */
    public List<an7> mo11719j(int i) {
        lh5 lh5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        lh5 a = lh5.m21448a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        a.bindLong(1, (long) i);
        this.f8484a.mo10118d();
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            int e = px0.m25190e(c, "required_network_type");
            int e2 = px0.m25190e(c, "requires_charging");
            int e3 = px0.m25190e(c, "requires_device_idle");
            int e4 = px0.m25190e(c, "requires_battery_not_low");
            int e5 = px0.m25190e(c, "requires_storage_not_low");
            int e6 = px0.m25190e(c, "trigger_content_update_delay");
            int e7 = px0.m25190e(c, "trigger_max_content_delay");
            int e8 = px0.m25190e(c, "content_uri_triggers");
            int e9 = px0.m25190e(c, "id");
            int e10 = px0.m25190e(c, "state");
            int e11 = px0.m25190e(c, "worker_class_name");
            int e12 = px0.m25190e(c, "input_merger_class_name");
            int e13 = px0.m25190e(c, "input");
            int e14 = px0.m25190e(c, "output");
            lh5 = a;
            try {
                int e15 = px0.m25190e(c, "initial_delay");
                int e16 = px0.m25190e(c, "interval_duration");
                int e17 = px0.m25190e(c, "flex_duration");
                int e18 = px0.m25190e(c, "run_attempt_count");
                int e19 = px0.m25190e(c, "backoff_policy");
                int e20 = px0.m25190e(c, "backoff_delay_duration");
                int e21 = px0.m25190e(c, "period_start_time");
                int e22 = px0.m25190e(c, "minimum_retention_duration");
                int e23 = px0.m25190e(c, "schedule_requested_at");
                int e24 = px0.m25190e(c, "run_in_foreground");
                int e25 = px0.m25190e(c, "out_of_quota_policy");
                int i2 = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string = c.getString(e9);
                    int i3 = e9;
                    String string2 = c.getString(e11);
                    int i4 = e11;
                    nq0 nq0 = new nq0();
                    int i5 = e;
                    nq0.mo23770k(hn7.m19113e(c.getInt(e)));
                    if (c.getInt(e2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nq0.mo23772m(z);
                    if (c.getInt(e3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    nq0.mo23773n(z2);
                    if (c.getInt(e4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    nq0.mo23771l(z3);
                    if (c.getInt(e5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    nq0.mo23774o(z4);
                    int i6 = e2;
                    int i7 = e3;
                    nq0.mo23775p(c.getLong(e6));
                    nq0.mo23776q(c.getLong(e7));
                    nq0.mo23769j(hn7.m19110b(c.getBlob(e8)));
                    an7 an7 = new an7(string, string2);
                    an7.f205b = hn7.m19115g(c.getInt(e10));
                    an7.f207d = c.getString(e12);
                    an7.f208e = C1519b.m10471g(c.getBlob(e13));
                    int i8 = i2;
                    an7.f209f = C1519b.m10471g(c.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = e15;
                    an7.f210g = c.getLong(i10);
                    int i11 = e12;
                    int i12 = e16;
                    an7.f211h = c.getLong(i12);
                    int i13 = i10;
                    int i14 = e4;
                    int i15 = e17;
                    an7.f212i = c.getLong(i15);
                    int i16 = e18;
                    an7.f214k = c.getInt(i16);
                    int i17 = e19;
                    int i18 = i12;
                    an7.f215l = hn7.m19112d(c.getInt(i17));
                    e17 = i15;
                    int i19 = i14;
                    int i20 = e20;
                    an7.f216m = c.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = e21;
                    an7.f217n = c.getLong(i23);
                    int i24 = i20;
                    e21 = i23;
                    int i25 = e22;
                    an7.f218o = c.getLong(i25);
                    int i26 = i21;
                    int i27 = e23;
                    an7.f219p = c.getLong(i27);
                    int i28 = e24;
                    if (c.getInt(i28) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    an7.f220q = z5;
                    int i29 = e25;
                    int i30 = i27;
                    an7.f221r = hn7.m19114f(c.getInt(i29));
                    an7.f213j = nq0;
                    arrayList.add(an7);
                    e25 = i29;
                    e2 = i9;
                    e12 = i11;
                    e15 = i13;
                    e16 = i18;
                    e18 = i26;
                    e23 = i30;
                    e9 = i3;
                    e11 = i4;
                    e = i5;
                    e24 = i28;
                    e22 = i25;
                    e3 = i7;
                    int i31 = i22;
                    e20 = i24;
                    e4 = i19;
                    e19 = i31;
                }
                c.close();
                lh5.mo22765f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                lh5.mo22765f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lh5 = a;
            c.close();
            lh5.mo22765f();
            throw th;
        }
    }

    /* renamed from: k */
    public int mo11720k() {
        this.f8484a.mo10118d();
        SupportSQLiteStatement b = this.f8492i.mo10162b();
        this.f8484a.mo10119e();
        try {
            int executeUpdateDelete = b.executeUpdateDelete();
            this.f8484a.mo10115C();
            return executeUpdateDelete;
        } finally {
            this.f8484a.mo10124j();
            this.f8492i.mo10168h(b);
        }
    }

    /* renamed from: l */
    public int mo11721l(String str, long j) {
        this.f8484a.mo10118d();
        SupportSQLiteStatement b = this.f8491h.mo10162b();
        b.bindLong(1, j);
        if (str == null) {
            b.bindNull(2);
        } else {
            b.bindString(2, str);
        }
        this.f8484a.mo10119e();
        try {
            int executeUpdateDelete = b.executeUpdateDelete();
            this.f8484a.mo10115C();
            return executeUpdateDelete;
        } finally {
            this.f8484a.mo10124j();
            this.f8491h.mo10168h(b);
        }
    }

    /* renamed from: m */
    public List<an7.C0041b> mo11722m(String str) {
        lh5 a = lh5.m21448a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f8484a.mo10118d();
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            int e = px0.m25190e(c, "id");
            int e2 = px0.m25190e(c, "state");
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                an7.C0041b bVar = new an7.C0041b();
                bVar.f222a = c.getString(e);
                bVar.f223b = hn7.m19115g(c.getInt(e2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            c.close();
            a.mo22765f();
        }
    }

    /* renamed from: n */
    public List<an7> mo11723n(int i) {
        lh5 lh5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        lh5 a = lh5.m21448a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a.bindLong(1, (long) i);
        this.f8484a.mo10118d();
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            int e = px0.m25190e(c, "required_network_type");
            int e2 = px0.m25190e(c, "requires_charging");
            int e3 = px0.m25190e(c, "requires_device_idle");
            int e4 = px0.m25190e(c, "requires_battery_not_low");
            int e5 = px0.m25190e(c, "requires_storage_not_low");
            int e6 = px0.m25190e(c, "trigger_content_update_delay");
            int e7 = px0.m25190e(c, "trigger_max_content_delay");
            int e8 = px0.m25190e(c, "content_uri_triggers");
            int e9 = px0.m25190e(c, "id");
            int e10 = px0.m25190e(c, "state");
            int e11 = px0.m25190e(c, "worker_class_name");
            int e12 = px0.m25190e(c, "input_merger_class_name");
            int e13 = px0.m25190e(c, "input");
            int e14 = px0.m25190e(c, "output");
            lh5 = a;
            try {
                int e15 = px0.m25190e(c, "initial_delay");
                int e16 = px0.m25190e(c, "interval_duration");
                int e17 = px0.m25190e(c, "flex_duration");
                int e18 = px0.m25190e(c, "run_attempt_count");
                int e19 = px0.m25190e(c, "backoff_policy");
                int e20 = px0.m25190e(c, "backoff_delay_duration");
                int e21 = px0.m25190e(c, "period_start_time");
                int e22 = px0.m25190e(c, "minimum_retention_duration");
                int e23 = px0.m25190e(c, "schedule_requested_at");
                int e24 = px0.m25190e(c, "run_in_foreground");
                int e25 = px0.m25190e(c, "out_of_quota_policy");
                int i2 = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string = c.getString(e9);
                    int i3 = e9;
                    String string2 = c.getString(e11);
                    int i4 = e11;
                    nq0 nq0 = new nq0();
                    int i5 = e;
                    nq0.mo23770k(hn7.m19113e(c.getInt(e)));
                    if (c.getInt(e2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nq0.mo23772m(z);
                    if (c.getInt(e3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    nq0.mo23773n(z2);
                    if (c.getInt(e4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    nq0.mo23771l(z3);
                    if (c.getInt(e5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    nq0.mo23774o(z4);
                    int i6 = e2;
                    int i7 = e3;
                    nq0.mo23775p(c.getLong(e6));
                    nq0.mo23776q(c.getLong(e7));
                    nq0.mo23769j(hn7.m19110b(c.getBlob(e8)));
                    an7 an7 = new an7(string, string2);
                    an7.f205b = hn7.m19115g(c.getInt(e10));
                    an7.f207d = c.getString(e12);
                    an7.f208e = C1519b.m10471g(c.getBlob(e13));
                    int i8 = i2;
                    an7.f209f = C1519b.m10471g(c.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = e15;
                    an7.f210g = c.getLong(i10);
                    int i11 = e12;
                    int i12 = e16;
                    an7.f211h = c.getLong(i12);
                    int i13 = i10;
                    int i14 = e4;
                    int i15 = e17;
                    an7.f212i = c.getLong(i15);
                    int i16 = e18;
                    an7.f214k = c.getInt(i16);
                    int i17 = e19;
                    int i18 = i12;
                    an7.f215l = hn7.m19112d(c.getInt(i17));
                    e17 = i15;
                    int i19 = i14;
                    int i20 = e20;
                    an7.f216m = c.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = e21;
                    an7.f217n = c.getLong(i23);
                    int i24 = i20;
                    e21 = i23;
                    int i25 = e22;
                    an7.f218o = c.getLong(i25);
                    int i26 = i21;
                    int i27 = e23;
                    an7.f219p = c.getLong(i27);
                    int i28 = e24;
                    if (c.getInt(i28) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    an7.f220q = z5;
                    int i29 = e25;
                    int i30 = i27;
                    an7.f221r = hn7.m19114f(c.getInt(i29));
                    an7.f213j = nq0;
                    arrayList.add(an7);
                    e25 = i29;
                    e2 = i9;
                    e12 = i11;
                    e15 = i13;
                    e16 = i18;
                    e18 = i26;
                    e23 = i30;
                    e9 = i3;
                    e11 = i4;
                    e = i5;
                    e24 = i28;
                    e22 = i25;
                    e3 = i7;
                    int i31 = i22;
                    e20 = i24;
                    e4 = i19;
                    e19 = i31;
                }
                c.close();
                lh5.mo22765f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                lh5.mo22765f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lh5 = a;
            c.close();
            lh5.mo22765f();
            throw th;
        }
    }

    /* renamed from: o */
    public void mo11724o(String str, C1519b bVar) {
        this.f8484a.mo10118d();
        SupportSQLiteStatement b = this.f8487d.mo10162b();
        byte[] n = C1519b.m10472n(bVar);
        if (n == null) {
            b.bindNull(1);
        } else {
            b.bindBlob(1, n);
        }
        if (str == null) {
            b.bindNull(2);
        } else {
            b.bindString(2, str);
        }
        this.f8484a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f8484a.mo10115C();
        } finally {
            this.f8484a.mo10124j();
            this.f8487d.mo10168h(b);
        }
    }

    /* renamed from: p */
    public List<an7> mo11725p() {
        lh5 lh5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        lh5 a = lh5.m21448a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f8484a.mo10118d();
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            int e = px0.m25190e(c, "required_network_type");
            int e2 = px0.m25190e(c, "requires_charging");
            int e3 = px0.m25190e(c, "requires_device_idle");
            int e4 = px0.m25190e(c, "requires_battery_not_low");
            int e5 = px0.m25190e(c, "requires_storage_not_low");
            int e6 = px0.m25190e(c, "trigger_content_update_delay");
            int e7 = px0.m25190e(c, "trigger_max_content_delay");
            int e8 = px0.m25190e(c, "content_uri_triggers");
            int e9 = px0.m25190e(c, "id");
            int e10 = px0.m25190e(c, "state");
            int e11 = px0.m25190e(c, "worker_class_name");
            int e12 = px0.m25190e(c, "input_merger_class_name");
            int e13 = px0.m25190e(c, "input");
            int e14 = px0.m25190e(c, "output");
            lh5 = a;
            try {
                int e15 = px0.m25190e(c, "initial_delay");
                int e16 = px0.m25190e(c, "interval_duration");
                int e17 = px0.m25190e(c, "flex_duration");
                int e18 = px0.m25190e(c, "run_attempt_count");
                int e19 = px0.m25190e(c, "backoff_policy");
                int e20 = px0.m25190e(c, "backoff_delay_duration");
                int e21 = px0.m25190e(c, "period_start_time");
                int e22 = px0.m25190e(c, "minimum_retention_duration");
                int e23 = px0.m25190e(c, "schedule_requested_at");
                int e24 = px0.m25190e(c, "run_in_foreground");
                int e25 = px0.m25190e(c, "out_of_quota_policy");
                int i = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string = c.getString(e9);
                    int i2 = e9;
                    String string2 = c.getString(e11);
                    int i3 = e11;
                    nq0 nq0 = new nq0();
                    int i4 = e;
                    nq0.mo23770k(hn7.m19113e(c.getInt(e)));
                    if (c.getInt(e2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nq0.mo23772m(z);
                    if (c.getInt(e3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    nq0.mo23773n(z2);
                    if (c.getInt(e4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    nq0.mo23771l(z3);
                    if (c.getInt(e5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    nq0.mo23774o(z4);
                    int i5 = e2;
                    int i6 = e3;
                    nq0.mo23775p(c.getLong(e6));
                    nq0.mo23776q(c.getLong(e7));
                    nq0.mo23769j(hn7.m19110b(c.getBlob(e8)));
                    an7 an7 = new an7(string, string2);
                    an7.f205b = hn7.m19115g(c.getInt(e10));
                    an7.f207d = c.getString(e12);
                    an7.f208e = C1519b.m10471g(c.getBlob(e13));
                    int i7 = i;
                    an7.f209f = C1519b.m10471g(c.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = e15;
                    an7.f210g = c.getLong(i9);
                    int i10 = e13;
                    int i11 = e16;
                    an7.f211h = c.getLong(i11);
                    int i12 = i9;
                    int i13 = e4;
                    int i14 = e17;
                    an7.f212i = c.getLong(i14);
                    int i15 = e18;
                    an7.f214k = c.getInt(i15);
                    int i16 = e19;
                    int i17 = i11;
                    an7.f215l = hn7.m19112d(c.getInt(i16));
                    e17 = i14;
                    int i18 = i13;
                    int i19 = e20;
                    an7.f216m = c.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = e21;
                    an7.f217n = c.getLong(i22);
                    int i23 = i19;
                    e21 = i22;
                    int i24 = e22;
                    an7.f218o = c.getLong(i24);
                    int i25 = i20;
                    int i26 = e23;
                    an7.f219p = c.getLong(i26);
                    int i27 = e24;
                    if (c.getInt(i27) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    an7.f220q = z5;
                    int i28 = e25;
                    int i29 = i26;
                    an7.f221r = hn7.m19114f(c.getInt(i28));
                    an7.f213j = nq0;
                    arrayList.add(an7);
                    e25 = i28;
                    e2 = i8;
                    e13 = i10;
                    e15 = i12;
                    e16 = i17;
                    e18 = i25;
                    e23 = i29;
                    e9 = i2;
                    e11 = i3;
                    e = i4;
                    e24 = i27;
                    e22 = i24;
                    e3 = i6;
                    int i30 = i21;
                    e20 = i23;
                    e4 = i18;
                    e19 = i30;
                }
                c.close();
                lh5.mo22765f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                lh5.mo22765f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lh5 = a;
            c.close();
            lh5.mo22765f();
            throw th;
        }
    }

    /* renamed from: q */
    public boolean mo11726q() {
        boolean z = false;
        lh5 a = lh5.m21448a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f8484a.mo10118d();
        Cursor c = iz0.m19913c(this.f8484a, a, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst() && c.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            c.close();
            a.mo22765f();
        }
    }

    /* renamed from: r */
    public int mo11727r(String str) {
        this.f8484a.mo10118d();
        SupportSQLiteStatement b = this.f8490g.mo10162b();
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f8484a.mo10119e();
        try {
            int executeUpdateDelete = b.executeUpdateDelete();
            this.f8484a.mo10115C();
            return executeUpdateDelete;
        } finally {
            this.f8484a.mo10124j();
            this.f8490g.mo10168h(b);
        }
    }

    /* renamed from: s */
    public int mo11728s(String str) {
        this.f8484a.mo10118d();
        SupportSQLiteStatement b = this.f8489f.mo10162b();
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f8484a.mo10119e();
        try {
            int executeUpdateDelete = b.executeUpdateDelete();
            this.f8484a.mo10115C();
            return executeUpdateDelete;
        } finally {
            this.f8484a.mo10124j();
            this.f8489f.mo10168h(b);
        }
    }

    /* renamed from: t */
    public void mo11729t(String str, long j) {
        this.f8484a.mo10118d();
        SupportSQLiteStatement b = this.f8488e.mo10162b();
        b.bindLong(1, j);
        if (str == null) {
            b.bindNull(2);
        } else {
            b.bindString(2, str);
        }
        this.f8484a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f8484a.mo10115C();
        } finally {
            this.f8484a.mo10124j();
            this.f8488e.mo10168h(b);
        }
    }
}
