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
import net.safemoon.androidwallet.model.contact.room.RoomContact;
import org.web3j.abi.datatypes.Address;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: fr0 */
/* compiled from: ContactDao_Impl */
public final class fr0 implements er0 {

    /* renamed from: a */
    public final RoomDatabase f37884a;

    /* renamed from: b */
    public final vq1<RoomContact> f37885b;

    /* renamed from: c */
    public final uq1<RoomContact> f37886c;

    /* renamed from: d */
    public final SharedSQLiteStatement f37887d;

    /* renamed from: e */
    public final SharedSQLiteStatement f37888e;

    /* renamed from: fr0$a */
    /* compiled from: ContactDao_Impl */
    public class C7094a extends vq1<RoomContact> {
        public C7094a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `table_contact` (`_id`,`name`,`address`,`tokenTypeChain`,`profilePath`,`lastSent`,`contactCreate`,`linkId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, RoomContact roomContact) {
            supportSQLiteStatement.bindLong(1, (long) roomContact.getId());
            if (roomContact.getName() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, roomContact.getName());
            }
            if (roomContact.getAddress() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, roomContact.getAddress());
            }
            supportSQLiteStatement.bindLong(4, (long) roomContact.getChainAddress());
            if (roomContact.getProfilePath() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, roomContact.getProfilePath());
            }
            if (roomContact.getLastSent() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindLong(6, roomContact.getLastSent().longValue());
            }
            if (roomContact.getContactCreate() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, roomContact.getContactCreate().longValue());
            }
            if (roomContact.getLinkId() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, roomContact.getLinkId());
            }
        }
    }

    /* renamed from: fr0$b */
    /* compiled from: ContactDao_Impl */
    public class C7095b extends uq1<RoomContact> {
        public C7095b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM `table_contact` WHERE `_id` = ?";
        }

        /* renamed from: k */
        public void mo26841i(SupportSQLiteStatement supportSQLiteStatement, RoomContact roomContact) {
            supportSQLiteStatement.bindLong(1, (long) roomContact.getId());
        }
    }

    /* renamed from: fr0$c */
    /* compiled from: ContactDao_Impl */
    public class C7096c extends SharedSQLiteStatement {
        public C7096c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_contact SET lastSent = ? WHERE _id=?";
        }
    }

    /* renamed from: fr0$d */
    /* compiled from: ContactDao_Impl */
    public class C7097d extends SharedSQLiteStatement {
        public C7097d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM table_contact where linkId=?";
        }
    }

    /* renamed from: fr0$e */
    /* compiled from: ContactDao_Impl */
    public class C7098e implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ RoomContact f37893a;

        public C7098e(RoomContact roomContact) {
            this.f37893a = roomContact;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            fr0.this.f37884a.mo10119e();
            try {
                fr0.this.f37885b.mo27296j(this.f37893a);
                fr0.this.f37884a.mo10115C();
                return r37.f33317a;
            } finally {
                fr0.this.f37884a.mo10124j();
            }
        }
    }

    /* renamed from: fr0$f */
    /* compiled from: ContactDao_Impl */
    public class C7099f implements Callable<List<RoomContact>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f37895a;

        public C7099f(lh5 lh5) {
            this.f37895a = lh5;
        }

        /* renamed from: a */
        public List<RoomContact> call() throws Exception {
            String str;
            String str2;
            String str3;
            Long l;
            Long l2;
            String str4;
            Cursor c = iz0.m19913c(fr0.this.f37884a, this.f37895a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e3 = px0.m25190e(c, Address.TYPE_NAME);
                int e4 = px0.m25190e(c, "tokenTypeChain");
                int e5 = px0.m25190e(c, "profilePath");
                int e6 = px0.m25190e(c, "lastSent");
                int e7 = px0.m25190e(c, "contactCreate");
                int e8 = px0.m25190e(c, "linkId");
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
                    int i2 = c.getInt(e4);
                    if (c.isNull(e5)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        l = null;
                    } else {
                        l = Long.valueOf(c.getLong(e6));
                    }
                    if (c.isNull(e7)) {
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(c.getLong(e7));
                    }
                    if (c.isNull(e8)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e8);
                    }
                    arrayList.add(new RoomContact(i, str, str2, i2, str3, l, l2, str4));
                }
                return arrayList;
            } finally {
                c.close();
                this.f37895a.mo22765f();
            }
        }
    }

    /* renamed from: fr0$g */
    /* compiled from: ContactDao_Impl */
    public class C7100g implements Callable<List<RoomContact>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f37897a;

        public C7100g(lh5 lh5) {
            this.f37897a = lh5;
        }

        /* renamed from: a */
        public List<RoomContact> call() throws Exception {
            String str;
            String str2;
            String str3;
            Long l;
            Long l2;
            String str4;
            Cursor c = iz0.m19913c(fr0.this.f37884a, this.f37897a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e3 = px0.m25190e(c, Address.TYPE_NAME);
                int e4 = px0.m25190e(c, "tokenTypeChain");
                int e5 = px0.m25190e(c, "profilePath");
                int e6 = px0.m25190e(c, "lastSent");
                int e7 = px0.m25190e(c, "contactCreate");
                int e8 = px0.m25190e(c, "linkId");
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
                    int i2 = c.getInt(e4);
                    if (c.isNull(e5)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        l = null;
                    } else {
                        l = Long.valueOf(c.getLong(e6));
                    }
                    if (c.isNull(e7)) {
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(c.getLong(e7));
                    }
                    if (c.isNull(e8)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e8);
                    }
                    arrayList.add(new RoomContact(i, str, str2, i2, str3, l, l2, str4));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f37897a.mo22765f();
        }
    }

    public fr0(RoomDatabase roomDatabase) {
        this.f37884a = roomDatabase;
        this.f37885b = new C7094a(roomDatabase);
        this.f37886c = new C7095b(roomDatabase);
        this.f37887d = new C7096c(roomDatabase);
        this.f37888e = new C7097d(roomDatabase);
    }

    /* renamed from: h */
    public static List<Class<?>> m57849h() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public LiveData<List<RoomContact>> mo51526a() {
        return this.f37884a.mo10128n().mo20867d(new String[]{"table_contact"}, false, new C7100g(lh5.m21448a("SELECT * FROM table_contact ", 0)));
    }

    /* renamed from: b */
    public Object mo51527b(RoomContact roomContact, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f37884a, true, new C7098e(roomContact), ns0);
    }

    /* renamed from: c */
    public Object mo51528c(String str, ns0<? super List<RoomContact>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_contact where linkId = ?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        return CoroutinesRoom.m9773a(this.f37884a, false, iz0.m19911a(), new C7099f(a), ns0);
    }

    /* renamed from: d */
    public void mo51529d(int i, long j) {
        this.f37884a.mo10118d();
        SupportSQLiteStatement b = this.f37887d.mo10162b();
        b.bindLong(1, j);
        b.bindLong(2, (long) i);
        this.f37884a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f37884a.mo10115C();
        } finally {
            this.f37884a.mo10124j();
            this.f37887d.mo10168h(b);
        }
    }

    public void delete(String str) {
        this.f37884a.mo10118d();
        SupportSQLiteStatement b = this.f37888e.mo10162b();
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f37884a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f37884a.mo10115C();
        } finally {
            this.f37884a.mo10124j();
            this.f37888e.mo10168h(b);
        }
    }

    /* renamed from: e */
    public void mo51531e(RoomContact roomContact) {
        this.f37884a.mo10118d();
        this.f37884a.mo10119e();
        try {
            this.f37886c.mo26842j(roomContact);
            this.f37884a.mo10115C();
        } finally {
            this.f37884a.mo10124j();
        }
    }
}
