package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteStatement;

/* renamed from: nu4 */
/* compiled from: PreferenceDao_Impl */
public final class nu4 implements mu4 {

    /* renamed from: a */
    public final RoomDatabase f15687a;

    /* renamed from: b */
    public final vq1<lu4> f15688b;

    /* renamed from: nu4$a */
    /* compiled from: PreferenceDao_Impl */
    public class C2922a extends vq1<lu4> {
        public C2922a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, lu4 lu4) {
            String str = lu4.f14734a;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            Long l = lu4.f14735b;
            if (l == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, l.longValue());
            }
        }
    }

    public nu4(RoomDatabase roomDatabase) {
        this.f15687a = roomDatabase;
        this.f15688b = new C2922a(roomDatabase);
    }

    /* renamed from: a */
    public Long mo23406a(String str) {
        lh5 a = lh5.m21448a("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f15687a.mo10118d();
        Long l = null;
        Cursor c = iz0.m19913c(this.f15687a, a, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                if (!c.isNull(0)) {
                    l = Long.valueOf(c.getLong(0));
                }
            }
            return l;
        } finally {
            c.close();
            a.mo22765f();
        }
    }

    /* renamed from: b */
    public void mo23407b(lu4 lu4) {
        this.f15687a.mo10118d();
        this.f15687a.mo10119e();
        try {
            this.f15688b.mo27296j(lu4);
            this.f15687a.mo10115C();
        } finally {
            this.f15687a.mo10124j();
        }
    }
}
