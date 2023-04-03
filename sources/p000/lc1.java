package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lc1 */
/* compiled from: DependencyDao_Impl */
public final class lc1 implements kc1 {

    /* renamed from: a */
    public final RoomDatabase f14470a;

    /* renamed from: b */
    public final vq1<hc1> f14471b;

    /* renamed from: lc1$a */
    /* compiled from: DependencyDao_Impl */
    public class C2752a extends vq1<hc1> {
        public C2752a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, hc1 hc1) {
            String str = hc1.f12816a;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = hc1.f12817b;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public lc1(RoomDatabase roomDatabase) {
        this.f14470a = roomDatabase;
        this.f14471b = new C2752a(roomDatabase);
    }

    /* renamed from: a */
    public List<String> mo22245a(String str) {
        lh5 a = lh5.m21448a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f14470a.mo10118d();
        Cursor c = iz0.m19913c(this.f14470a, a, false, (CancellationSignal) null);
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

    /* renamed from: b */
    public boolean mo22246b(String str) {
        boolean z = true;
        lh5 a = lh5.m21448a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f14470a.mo10118d();
        boolean z2 = false;
        Cursor c = iz0.m19913c(this.f14470a, a, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                if (c.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            c.close();
            a.mo22765f();
        }
    }

    /* renamed from: c */
    public void mo22247c(hc1 hc1) {
        this.f14470a.mo10118d();
        this.f14470a.mo10119e();
        try {
            this.f14471b.mo27296j(hc1);
            this.f14470a.mo10115C();
        } finally {
            this.f14470a.mo10124j();
        }
    }

    /* renamed from: d */
    public boolean mo22248d(String str) {
        boolean z = true;
        lh5 a = lh5.m21448a("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f14470a.mo10118d();
        boolean z2 = false;
        Cursor c = iz0.m19913c(this.f14470a, a, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                if (c.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            c.close();
            a.mo22765f();
        }
    }
}
