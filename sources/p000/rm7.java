package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rm7 */
/* compiled from: WorkNameDao_Impl */
public final class rm7 implements qm7 {

    /* renamed from: a */
    public final RoomDatabase f17294a;

    /* renamed from: b */
    public final vq1<pm7> f17295b;

    /* renamed from: rm7$a */
    /* compiled from: WorkNameDao_Impl */
    public class C3209a extends vq1<pm7> {
        public C3209a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, pm7 pm7) {
            String str = pm7.f16567a;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = pm7.f16568b;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public rm7(RoomDatabase roomDatabase) {
        this.f17294a = roomDatabase;
        this.f17295b = new C3209a(roomDatabase);
    }

    /* renamed from: a */
    public void mo25154a(pm7 pm7) {
        this.f17294a.mo10118d();
        this.f17294a.mo10119e();
        try {
            this.f17295b.mo27296j(pm7);
            this.f17294a.mo10115C();
        } finally {
            this.f17294a.mo10124j();
        }
    }

    /* renamed from: b */
    public List<String> mo25155b(String str) {
        lh5 a = lh5.m21448a("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f17294a.mo10118d();
        Cursor c = iz0.m19913c(this.f17294a, a, false, (CancellationSignal) null);
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
}
