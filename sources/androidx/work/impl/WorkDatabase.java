package androidx.work.impl;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import androidx.work.impl.C1528a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends RoomDatabase {

    /* renamed from: p */
    public static final long f7539p = TimeUnit.DAYS.toMillis(1);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    public class C1525a implements SupportSQLiteOpenHelper.C1392b {

        /* renamed from: a */
        public final /* synthetic */ Context f7540a;

        public C1525a(Context context) {
            this.f7540a = context;
        }

        public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
            SupportSQLiteOpenHelper.Configuration.C1388a a = SupportSQLiteOpenHelper.Configuration.m9911a(this.f7540a);
            a.mo10273c(configuration.f6978b).mo10272b(configuration.f6979c).mo10274d(true);
            return new fc2().create(a.mo10271a());
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabase$b */
    public class C1526b extends RoomDatabase.C1367b {
        /* renamed from: c */
        public void mo10152c(SupportSQLiteDatabase supportSQLiteDatabase) {
            super.mo10152c(supportSQLiteDatabase);
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL(WorkDatabase.m10505I());
                supportSQLiteDatabase.setTransactionSuccessful();
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }

    /* renamed from: E */
    public static WorkDatabase m10502E(Context context, Executor executor, boolean z) {
        RoomDatabase.C1366a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = ih5.m19631c(context, cls).mo10145c();
        } else {
            aVar = ih5.m19629a(context, cls, fm7.m17132d());
            aVar.mo10148f(new C1525a(context));
        }
        return aVar.mo10149g(executor).mo10143a(m10503G()).mo10144b(C1528a.f7549a).mo10144b(new C1528a.C1536h(context, 2, 3)).mo10144b(C1528a.f7550b).mo10144b(C1528a.f7551c).mo10144b(new C1528a.C1536h(context, 5, 6)).mo10144b(C1528a.f7552d).mo10144b(C1528a.f7553e).mo10144b(C1528a.f7554f).mo10144b(new C1528a.C1537i(context)).mo10144b(new C1528a.C1536h(context, 10, 11)).mo10144b(C1528a.f7555g).mo10147e().mo10146d();
    }

    /* renamed from: G */
    public static RoomDatabase.C1367b m10503G() {
        return new C1526b();
    }

    /* renamed from: H */
    public static long m10504H() {
        return System.currentTimeMillis() - f7539p;
    }

    /* renamed from: I */
    public static String m10505I() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m10504H() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: F */
    public abstract kc1 mo10950F();

    /* renamed from: J */
    public abstract mu4 mo10951J();

    /* renamed from: K */
    public abstract nk6 mo10952K();

    /* renamed from: L */
    public abstract qm7 mo10953L();

    /* renamed from: M */
    public abstract tm7 mo10954M();

    /* renamed from: N */
    public abstract bn7 mo10955N();

    /* renamed from: O */
    public abstract en7 mo10956O();
}
