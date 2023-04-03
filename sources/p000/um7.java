package p000;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import androidx.work.C1519b;

/* renamed from: um7 */
/* compiled from: WorkProgressDao_Impl */
public final class um7 implements tm7 {

    /* renamed from: a */
    public final RoomDatabase f18533a;

    /* renamed from: b */
    public final vq1<sm7> f18534b;

    /* renamed from: c */
    public final SharedSQLiteStatement f18535c;

    /* renamed from: d */
    public final SharedSQLiteStatement f18536d;

    /* renamed from: um7$a */
    /* compiled from: WorkProgressDao_Impl */
    public class C3421a extends vq1<sm7> {
        public C3421a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, sm7 sm7) {
            String str = sm7.f17734a;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            byte[] n = C1519b.m10472n(sm7.f17735b);
            if (n == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindBlob(2, n);
            }
        }
    }

    /* renamed from: um7$b */
    /* compiled from: WorkProgressDao_Impl */
    public class C3422b extends SharedSQLiteStatement {
        public C3422b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: um7$c */
    /* compiled from: WorkProgressDao_Impl */
    public class C3423c extends SharedSQLiteStatement {
        public C3423c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public um7(RoomDatabase roomDatabase) {
        this.f18533a = roomDatabase;
        this.f18534b = new C3421a(roomDatabase);
        this.f18535c = new C3422b(roomDatabase);
        this.f18536d = new C3423c(roomDatabase);
    }

    /* renamed from: a */
    public void mo26514a() {
        this.f18533a.mo10118d();
        SupportSQLiteStatement b = this.f18536d.mo10162b();
        this.f18533a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f18533a.mo10115C();
        } finally {
            this.f18533a.mo10124j();
            this.f18536d.mo10168h(b);
        }
    }

    public void delete(String str) {
        this.f18533a.mo10118d();
        SupportSQLiteStatement b = this.f18535c.mo10162b();
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f18533a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f18533a.mo10115C();
        } finally {
            this.f18533a.mo10124j();
            this.f18535c.mo10168h(b);
        }
    }
}
