package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ok6 */
/* compiled from: SystemIdInfoDao_Impl */
public final class ok6 implements nk6 {

    /* renamed from: a */
    public final RoomDatabase f15933a;

    /* renamed from: b */
    public final vq1<mk6> f15934b;

    /* renamed from: c */
    public final SharedSQLiteStatement f15935c;

    /* renamed from: ok6$a */
    /* compiled from: SystemIdInfoDao_Impl */
    public class C2966a extends vq1<mk6> {
        public C2966a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, mk6 mk6) {
            String str = mk6.f14997a;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, (long) mk6.f14998b);
        }
    }

    /* renamed from: ok6$b */
    /* compiled from: SystemIdInfoDao_Impl */
    public class C2967b extends SharedSQLiteStatement {
        public C2967b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public ok6(RoomDatabase roomDatabase) {
        this.f15933a = roomDatabase;
        this.f15934b = new C2966a(roomDatabase);
        this.f15935c = new C2967b(roomDatabase);
    }

    /* renamed from: a */
    public mk6 mo23713a(String str) {
        lh5 a = lh5.m21448a("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f15933a.mo10118d();
        mk6 mk6 = null;
        Cursor c = iz0.m19913c(this.f15933a, a, false, (CancellationSignal) null);
        try {
            int e = px0.m25190e(c, "work_spec_id");
            int e2 = px0.m25190e(c, "system_id");
            if (c.moveToFirst()) {
                mk6 = new mk6(c.getString(e), c.getInt(e2));
            }
            return mk6;
        } finally {
            c.close();
            a.mo22765f();
        }
    }

    /* renamed from: b */
    public List<String> mo23714b() {
        lh5 a = lh5.m21448a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f15933a.mo10118d();
        Cursor c = iz0.m19913c(this.f15933a, a, false, (CancellationSignal) null);
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

    /* renamed from: c */
    public void mo23715c(mk6 mk6) {
        this.f15933a.mo10118d();
        this.f15933a.mo10119e();
        try {
            this.f15934b.mo27296j(mk6);
            this.f15933a.mo10115C();
        } finally {
            this.f15933a.mo10124j();
        }
    }

    /* renamed from: d */
    public void mo23716d(String str) {
        this.f15933a.mo10118d();
        SupportSQLiteStatement b = this.f15935c.mo10162b();
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f15933a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f15933a.mo10115C();
        } finally {
            this.f15933a.mo10124j();
            this.f15935c.mo10168h(b);
        }
    }
}
