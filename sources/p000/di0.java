package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import net.safemoon.androidwallet.model.RoomCoinPriceAlert;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: di0 */
/* compiled from: CoinPriceAlertDao_Impl */
public final class di0 implements ci0 {

    /* renamed from: a */
    public final RoomDatabase f37288a;

    /* renamed from: b */
    public final vq1<RoomCoinPriceAlert> f37289b;

    /* renamed from: c */
    public final uq1<RoomCoinPriceAlert> f37290c;

    /* renamed from: d */
    public final SharedSQLiteStatement f37291d;

    /* renamed from: di0$a */
    /* compiled from: CoinPriceAlertDao_Impl */
    public class C6974a extends vq1<RoomCoinPriceAlert> {
        public C6974a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `table_room_coin_price_alert` (`id`,`symbol`,`name`,`slug`,`cmcData`) VALUES (?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, RoomCoinPriceAlert roomCoinPriceAlert) {
            supportSQLiteStatement.bindLong(1, (long) roomCoinPriceAlert.getCmcId());
            if (roomCoinPriceAlert.getSymbol() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, roomCoinPriceAlert.getSymbol());
            }
            if (roomCoinPriceAlert.getName() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, roomCoinPriceAlert.getName());
            }
            if (roomCoinPriceAlert.getSlug() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, roomCoinPriceAlert.getSlug());
            }
            if (roomCoinPriceAlert.getCmcData() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, roomCoinPriceAlert.getCmcData());
            }
        }
    }

    /* renamed from: di0$b */
    /* compiled from: CoinPriceAlertDao_Impl */
    public class C6975b extends uq1<RoomCoinPriceAlert> {
        public C6975b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM `table_room_coin_price_alert` WHERE `id` = ?";
        }

        /* renamed from: k */
        public void mo26841i(SupportSQLiteStatement supportSQLiteStatement, RoomCoinPriceAlert roomCoinPriceAlert) {
            supportSQLiteStatement.bindLong(1, (long) roomCoinPriceAlert.getCmcId());
        }
    }

    /* renamed from: di0$c */
    /* compiled from: CoinPriceAlertDao_Impl */
    public class C6976c extends SharedSQLiteStatement {
        public C6976c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM table_room_coin_price_alert where id=?";
        }
    }

    /* renamed from: di0$d */
    /* compiled from: CoinPriceAlertDao_Impl */
    public class C6977d implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ RoomCoinPriceAlert f37295a;

        public C6977d(RoomCoinPriceAlert roomCoinPriceAlert) {
            this.f37295a = roomCoinPriceAlert;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            di0.this.f37288a.mo10119e();
            try {
                di0.this.f37289b.mo27296j(this.f37295a);
                di0.this.f37288a.mo10115C();
                return r37.f33317a;
            } finally {
                di0.this.f37288a.mo10124j();
            }
        }
    }

    /* renamed from: di0$e */
    /* compiled from: CoinPriceAlertDao_Impl */
    public class C6978e implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ RoomCoinPriceAlert f37297a;

        public C6978e(RoomCoinPriceAlert roomCoinPriceAlert) {
            this.f37297a = roomCoinPriceAlert;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            di0.this.f37288a.mo10119e();
            try {
                di0.this.f37290c.mo26842j(this.f37297a);
                di0.this.f37288a.mo10115C();
                return r37.f33317a;
            } finally {
                di0.this.f37288a.mo10124j();
            }
        }
    }

    /* renamed from: di0$f */
    /* compiled from: CoinPriceAlertDao_Impl */
    public class C6979f implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ int f37299a;

        public C6979f(int i) {
            this.f37299a = i;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = di0.this.f37291d.mo10162b();
            b.bindLong(1, (long) this.f37299a);
            di0.this.f37288a.mo10119e();
            try {
                b.executeUpdateDelete();
                di0.this.f37288a.mo10115C();
                return r37.f33317a;
            } finally {
                di0.this.f37288a.mo10124j();
                di0.this.f37291d.mo10168h(b);
            }
        }
    }

    /* renamed from: di0$g */
    /* compiled from: CoinPriceAlertDao_Impl */
    public class C6980g implements Callable<List<RoomCoinPriceAlert>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f37301a;

        public C6980g(lh5 lh5) {
            this.f37301a = lh5;
        }

        /* renamed from: a */
        public List<RoomCoinPriceAlert> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            Cursor c = iz0.m19913c(di0.this.f37288a, this.f37301a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "id");
                int e2 = px0.m25190e(c, "symbol");
                int e3 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e4 = px0.m25190e(c, "slug");
                int e5 = px0.m25190e(c, "cmcData");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    int i = c.getInt(e);
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    arrayList.add(new RoomCoinPriceAlert(i, str, str2, str3, str4));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f37301a.mo22765f();
        }
    }

    /* renamed from: di0$h */
    /* compiled from: CoinPriceAlertDao_Impl */
    public class C6981h implements Callable<List<RoomCoinPriceAlert>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f37303a;

        public C6981h(lh5 lh5) {
            this.f37303a = lh5;
        }

        /* renamed from: a */
        public List<RoomCoinPriceAlert> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            Cursor c = iz0.m19913c(di0.this.f37288a, this.f37303a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "id");
                int e2 = px0.m25190e(c, "symbol");
                int e3 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e4 = px0.m25190e(c, "slug");
                int e5 = px0.m25190e(c, "cmcData");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    int i = c.getInt(e);
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    arrayList.add(new RoomCoinPriceAlert(i, str, str2, str3, str4));
                }
                return arrayList;
            } finally {
                c.close();
                this.f37303a.mo22765f();
            }
        }
    }

    public di0(RoomDatabase roomDatabase) {
        this.f37288a = roomDatabase;
        this.f37289b = new C6974a(roomDatabase);
        this.f37290c = new C6975b(roomDatabase);
        this.f37291d = new C6976c(roomDatabase);
    }

    /* renamed from: j */
    public static List<Class<?>> m56862j() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public LiveData<List<RoomCoinPriceAlert>> mo50899a() {
        return this.f37288a.mo10128n().mo20867d(new String[]{"table_room_coin_price_alert"}, false, new C6980g(lh5.m21448a("SELECT * FROM table_room_coin_price_alert", 0)));
    }

    /* renamed from: b */
    public Object mo50900b(ns0<? super List<RoomCoinPriceAlert>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_coin_price_alert", 0);
        return CoroutinesRoom.m9773a(this.f37288a, false, iz0.m19911a(), new C6981h(a), ns0);
    }

    /* renamed from: c */
    public Object mo50901c(int i, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f37288a, true, new C6979f(i), ns0);
    }

    /* renamed from: d */
    public Object mo50902d(RoomCoinPriceAlert roomCoinPriceAlert, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f37288a, true, new C6978e(roomCoinPriceAlert), ns0);
    }

    /* renamed from: e */
    public Object mo50903e(RoomCoinPriceAlert roomCoinPriceAlert, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f37288a, true, new C6977d(roomCoinPriceAlert), ns0);
    }
}
