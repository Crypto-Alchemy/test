package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fn7 */
/* compiled from: WorkTagDao_Impl */
public final class fn7 implements en7 {

    /* renamed from: a */
    public final RoomDatabase f11953a;

    /* renamed from: b */
    public final vq1<dn7> f11954b;

    /* renamed from: fn7$a */
    /* compiled from: WorkTagDao_Impl */
    public class C2310a extends vq1<dn7> {
        public C2310a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, dn7 dn7) {
            String str = dn7.f10800a;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = dn7.f10801b;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public fn7(RoomDatabase roomDatabase) {
        this.f11953a = roomDatabase;
        this.f11954b = new C2310a(roomDatabase);
    }

    /* renamed from: a */
    public List<String> mo19428a(String str) {
        lh5 a = lh5.m21448a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f11953a.mo10118d();
        Cursor c = iz0.m19913c(this.f11953a, a, false, (CancellationSignal) null);
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
    public void mo19429b(dn7 dn7) {
        this.f11953a.mo10118d();
        this.f11953a.mo10119e();
        try {
            this.f11954b.mo27296j(dn7);
            this.f11953a.mo10115C();
        } finally {
            this.f11953a.mo10124j();
        }
    }
}
