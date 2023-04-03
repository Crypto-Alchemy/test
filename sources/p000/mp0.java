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
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet;
import net.safemoon.androidwallet.model.wallets.Wallet;

/* renamed from: mp0 */
/* compiled from: ConnectedInfoDao_Impl */
public final class mp0 implements lp0 {

    /* renamed from: a */
    public final RoomDatabase f40988a;

    /* renamed from: b */
    public final vq1<RoomConnectedInfo> f40989b;

    /* renamed from: c */
    public final SharedSQLiteStatement f40990c;

    /* renamed from: mp0$a */
    /* compiled from: ConnectedInfoDao_Impl */
    public class C7908a extends vq1<RoomConnectedInfo> {
        public C7908a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `table_wallet_connect` (`session`,`peerId`,`remotePeerId`,`chainId`,`peerMeta`,`connectedAt`,`isAutoDisconnect`,`walletId`,`version`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, RoomConnectedInfo roomConnectedInfo) {
            if (roomConnectedInfo.getSession() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, roomConnectedInfo.getSession());
            }
            if (roomConnectedInfo.getPeerId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, roomConnectedInfo.getPeerId());
            }
            if (roomConnectedInfo.getRemotePeerId() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, roomConnectedInfo.getRemotePeerId());
            }
            supportSQLiteStatement.bindLong(4, (long) roomConnectedInfo.getChainId());
            if (roomConnectedInfo.getPeerMeta() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, roomConnectedInfo.getPeerMeta());
            }
            supportSQLiteStatement.bindLong(6, roomConnectedInfo.getConnectedAtUnix());
            supportSQLiteStatement.bindLong(7, roomConnectedInfo.isAutoDisconnect() ? 1 : 0);
            supportSQLiteStatement.bindLong(8, roomConnectedInfo.getWalletId());
            supportSQLiteStatement.bindLong(9, (long) roomConnectedInfo.getVersion());
        }
    }

    /* renamed from: mp0$b */
    /* compiled from: ConnectedInfoDao_Impl */
    public class C7909b extends SharedSQLiteStatement {
        public C7909b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM table_wallet_connect WHERE session=?";
        }
    }

    /* renamed from: mp0$c */
    /* compiled from: ConnectedInfoDao_Impl */
    public class C7910c implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ RoomConnectedInfo f40993a;

        public C7910c(RoomConnectedInfo roomConnectedInfo) {
            this.f40993a = roomConnectedInfo;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            mp0.this.f40988a.mo10119e();
            try {
                mp0.this.f40989b.mo27296j(this.f40993a);
                mp0.this.f40988a.mo10115C();
                return r37.f33317a;
            } finally {
                mp0.this.f40988a.mo10124j();
            }
        }
    }

    /* renamed from: mp0$d */
    /* compiled from: ConnectedInfoDao_Impl */
    public class C7911d implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ String f40995a;

        public C7911d(String str) {
            this.f40995a = str;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = mp0.this.f40990c.mo10162b();
            String str = this.f40995a;
            if (str == null) {
                b.bindNull(1);
            } else {
                b.bindString(1, str);
            }
            mp0.this.f40988a.mo10119e();
            try {
                b.executeUpdateDelete();
                mp0.this.f40988a.mo10115C();
                return r37.f33317a;
            } finally {
                mp0.this.f40988a.mo10124j();
                mp0.this.f40990c.mo10168h(b);
            }
        }
    }

    /* renamed from: mp0$e */
    /* compiled from: ConnectedInfoDao_Impl */
    public class C7912e implements Callable<List<RoomConnectedInfoAndWallet>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f40997a;

        public C7912e(lh5 lh5) {
            this.f40997a = lh5;
        }

        /* renamed from: a */
        public List<RoomConnectedInfoAndWallet> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            boolean z;
            boolean z2 = true;
            String str5 = null;
            Cursor c = iz0.m19913c(mp0.this.f40988a, this.f40997a, true, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "session");
                int e2 = px0.m25190e(c, "peerId");
                int e3 = px0.m25190e(c, "remotePeerId");
                int e4 = px0.m25190e(c, "chainId");
                int e5 = px0.m25190e(c, "peerMeta");
                int e6 = px0.m25190e(c, "connectedAt");
                int e7 = px0.m25190e(c, "isAutoDisconnect");
                int e8 = px0.m25190e(c, "walletId");
                int e9 = px0.m25190e(c, "version");
                hl3 hl3 = new hl3();
                while (c.moveToNext()) {
                    hl3.mo21214o(c.getLong(e8), null);
                }
                c.moveToPosition(-1);
                mp0.this.mo56301h(hl3);
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        str = str5;
                    } else {
                        str = c.getString(e);
                    }
                    if (c.isNull(e2)) {
                        str2 = str5;
                    } else {
                        str2 = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str3 = str5;
                    } else {
                        str3 = c.getString(e3);
                    }
                    int i = c.getInt(e4);
                    if (c.isNull(e5)) {
                        str4 = str5;
                    } else {
                        str4 = c.getString(e5);
                    }
                    long j = c.getLong(e6);
                    if (c.getInt(e7) != 0) {
                        z = z2;
                    } else {
                        z = false;
                    }
                    arrayList.add(new RoomConnectedInfoAndWallet(new RoomConnectedInfo(str, str2, str3, i, str4, j, z, c.getLong(e8), c.getInt(e9)), (Wallet) hl3.mo21209h(c.getLong(e8))));
                    z2 = true;
                    str5 = null;
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f40997a.mo22765f();
        }
    }

    public mp0(RoomDatabase roomDatabase) {
        this.f40988a = roomDatabase;
        this.f40989b = new C7908a(roomDatabase);
        this.f40990c = new C7909b(roomDatabase);
    }

    /* renamed from: i */
    public static List<Class<?>> m64388i() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public Object mo55946a(String str, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f40988a, true, new C7911d(str), ns0);
    }

    /* renamed from: b */
    public LiveData<List<RoomConnectedInfoAndWallet>> mo55947b() {
        return this.f40988a.mo10128n().mo20867d(new String[]{"table_wallet", "table_wallet_connect"}, false, new C7912e(lh5.m21448a("SELECT * FROM table_wallet_connect", 0)));
    }

    /* renamed from: c */
    public Object mo55948c(RoomConnectedInfo roomConnectedInfo, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f40988a, true, new C7910c(roomConnectedInfo), ns0);
    }

    /* renamed from: h */
    public final void mo56301h(hl3<Wallet> hl3) {
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        Integer num;
        hl3<Wallet> hl32 = hl3;
        if (!hl3.mo21212l()) {
            if (hl3.mo21219u() > 999) {
                hl3 hl33 = new hl3(999);
                int u = hl3.mo21219u();
                int i = 0;
                int i2 = 0;
                while (i < u) {
                    hl33.mo21214o(hl32.mo21213m(i), null);
                    i++;
                    i2++;
                    if (i2 == 999) {
                        mo56301h(hl33);
                        hl32.mo21215p(hl33);
                        hl33 = new hl3(999);
                        i2 = 0;
                    }
                }
                if (i2 > 0) {
                    mo56301h(hl33);
                    hl32.mo21215p(hl33);
                    return;
                }
                return;
            }
            StringBuilder b = ib6.m19545b();
            b.append("SELECT `_id`,`name`,`prefix`,`privateKey`,`address`,`passPhrase`,`ka`,`u5b64`,`isLinked`,`order`,`isPrimaryWallet`,`myCoinType` FROM `table_wallet` WHERE `_id` IN (");
            int u2 = hl3.mo21219u();
            ib6.m19544a(b, u2);
            b.append(")");
            lh5 a = lh5.m21448a(b.toString(), u2 + 0);
            int i3 = 1;
            for (int i4 = 0; i4 < hl3.mo21219u(); i4++) {
                a.bindLong(i3, hl32.mo21213m(i4));
                i3++;
            }
            Cursor c = iz0.m19913c(this.f40988a, a, false, (CancellationSignal) null);
            try {
                int d = px0.m25189d(c, "_id");
                if (d != -1) {
                    while (c.moveToNext()) {
                        long j = c.getLong(d);
                        if (hl32.mo21207f(j)) {
                            if (c.isNull(0)) {
                                l = null;
                            } else {
                                l = Long.valueOf(c.getLong(0));
                            }
                            if (c.isNull(1)) {
                                str = null;
                            } else {
                                str = c.getString(1);
                            }
                            if (c.isNull(2)) {
                                str2 = null;
                            } else {
                                str2 = c.getString(2);
                            }
                            if (c.isNull(3)) {
                                str3 = null;
                            } else {
                                str3 = c.getString(3);
                            }
                            if (c.isNull(4)) {
                                str4 = null;
                            } else {
                                str4 = c.getString(4);
                            }
                            if (c.isNull(5)) {
                                str5 = null;
                            } else {
                                str5 = c.getString(5);
                            }
                            if (c.isNull(6)) {
                                str6 = null;
                            } else {
                                str6 = c.getString(6);
                            }
                            if (c.isNull(7)) {
                                str7 = null;
                            } else {
                                str7 = c.getString(7);
                            }
                            int i5 = c.getInt(8);
                            int i6 = c.getInt(9);
                            if (c.getInt(10) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (c.isNull(11)) {
                                num = null;
                            } else {
                                num = Integer.valueOf(c.getInt(11));
                            }
                            hl32.mo21214o(j, new Wallet(l, str, str2, str3, str4, str5, str6, str7, i5, i6, z, num));
                        }
                    }
                    c.close();
                }
            } finally {
                c.close();
            }
        }
    }
}
