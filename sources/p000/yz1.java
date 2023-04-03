package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: yz1 */
/* compiled from: FiatListDao_Impl */
public final class yz1 implements xz1 {

    /* renamed from: a */
    public final RoomDatabase f46300a;

    /* renamed from: b */
    public final vq1<RoomFiat> f46301b;

    /* renamed from: c */
    public final SharedSQLiteStatement f46302c;

    /* renamed from: d */
    public final SharedSQLiteStatement f46303d;

    /* renamed from: yz1$a */
    /* compiled from: FiatListDao_Impl */
    public class C9654a extends vq1<RoomFiat> {
        public C9654a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR IGNORE INTO `table_fiat` (`symbol`,`name`,`rate`) VALUES (?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, RoomFiat roomFiat) {
            if (roomFiat.getSymbol() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, roomFiat.getSymbol());
            }
            if (roomFiat.getName() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, roomFiat.getName());
            }
            if (roomFiat.getRate() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindDouble(3, roomFiat.getRate().doubleValue());
            }
        }
    }

    /* renamed from: yz1$b */
    /* compiled from: FiatListDao_Impl */
    public class C9655b extends SharedSQLiteStatement {
        public C9655b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_fiat SET rate = ? WHERE symbol=?";
        }
    }

    /* renamed from: yz1$c */
    /* compiled from: FiatListDao_Impl */
    public class C9656c extends SharedSQLiteStatement {
        public C9656c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_fiat SET name = ? WHERE symbol=?";
        }
    }

    /* renamed from: yz1$d */
    /* compiled from: FiatListDao_Impl */
    public class C9657d implements Callable<List<RoomFiat>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f46307a;

        public C9657d(lh5 lh5) {
            this.f46307a = lh5;
        }

        /* renamed from: a */
        public List<RoomFiat> call() throws Exception {
            String str;
            String str2;
            Double d;
            Cursor c = iz0.m19913c(yz1.this.f46300a, this.f46307a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "symbol");
                int e2 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e3 = px0.m25190e(c, "rate");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        str = null;
                    } else {
                        str = c.getString(e);
                    }
                    if (c.isNull(e2)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        d = null;
                    } else {
                        d = Double.valueOf(c.getDouble(e3));
                    }
                    arrayList.add(new RoomFiat(str, str2, d));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f46307a.mo22765f();
        }
    }

    public yz1(RoomDatabase roomDatabase) {
        this.f46300a = roomDatabase;
        this.f46301b = new C9654a(roomDatabase);
        this.f46302c = new C9655b(roomDatabase);
        this.f46303d = new C9656c(roomDatabase);
    }

    /* renamed from: g */
    public static List<Class<?>> m74690g() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public LiveData<List<RoomFiat>> mo66987a() {
        return this.f46300a.mo10128n().mo20867d(new String[]{"table_fiat"}, false, new C9657d(lh5.m21448a("SELECT * FROM table_fiat ", 0)));
    }

    /* renamed from: b */
    public void mo66988b(String str, double d) {
        this.f46300a.mo10118d();
        SupportSQLiteStatement b = this.f46302c.mo10162b();
        b.bindDouble(1, d);
        if (str == null) {
            b.bindNull(2);
        } else {
            b.bindString(2, str);
        }
        this.f46300a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f46300a.mo10115C();
        } finally {
            this.f46300a.mo10124j();
            this.f46302c.mo10168h(b);
        }
    }

    /* renamed from: c */
    public void mo66989c(RoomFiat... roomFiatArr) {
        this.f46300a.mo10118d();
        this.f46300a.mo10119e();
        try {
            this.f46301b.mo27297k(roomFiatArr);
            this.f46300a.mo10115C();
        } finally {
            this.f46300a.mo10124j();
        }
    }

    /* renamed from: d */
    public void mo66990d(String str, String str2) {
        this.f46300a.mo10118d();
        SupportSQLiteStatement b = this.f46303d.mo10162b();
        if (str2 == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str2);
        }
        if (str == null) {
            b.bindNull(2);
        } else {
            b.bindString(2, str);
        }
        this.f46300a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f46300a.mo10115C();
        } finally {
            this.f46300a.mo10124j();
            this.f46303d.mo10168h(b);
        }
    }

    /* renamed from: e */
    public boolean mo66991e(String str) {
        boolean z = true;
        lh5 a = lh5.m21448a("SELECT EXISTS (SELECT 1 FROM table_fiat WHERE symbol = ?)", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f46300a.mo10118d();
        boolean z2 = false;
        Cursor c = iz0.m19913c(this.f46300a, a, false, (CancellationSignal) null);
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
