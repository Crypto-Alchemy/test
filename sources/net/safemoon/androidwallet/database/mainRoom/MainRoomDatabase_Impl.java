package net.safemoon.androidwallet.database.mainRoom;

import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.web3j.abi.datatypes.Address;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.kh5;
import p000.kl6;

public final class MainRoomDatabase_Impl extends MainRoomDatabase {

    /* renamed from: A */
    public volatile er0 f41657A;

    /* renamed from: B */
    public volatile lp0 f41658B;

    /* renamed from: z */
    public volatile ih7 f41659z;

    /* renamed from: net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase_Impl$a */
    public class C8257a extends kh5.C2681b {
        public C8257a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo10957a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_wallet` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `prefix` TEXT NOT NULL, `privateKey` TEXT NOT NULL, `address` TEXT NOT NULL, `passPhrase` TEXT, `ka` TEXT, `u5b64` TEXT, `isLinked` INTEGER NOT NULL, `order` INTEGER NOT NULL DEFAULT 0, `isPrimaryWallet` INTEGER NOT NULL, `myCoinType` INTEGER)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_contact` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `address` TEXT NOT NULL, `tokenTypeChain` INTEGER NOT NULL, `profilePath` TEXT NOT NULL, `lastSent` INTEGER, `contactCreate` INTEGER, `linkId` TEXT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_wallet_connect` (`session` TEXT NOT NULL, `peerId` TEXT NOT NULL, `remotePeerId` TEXT NOT NULL, `chainId` INTEGER NOT NULL, `peerMeta` TEXT NOT NULL, `connectedAt` INTEGER NOT NULL, `isAutoDisconnect` INTEGER NOT NULL, `walletId` INTEGER NOT NULL, `version` INTEGER NOT NULL, PRIMARY KEY(`session`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7fc0764b47427c0cac88444290c5269b')");
        }

        /* renamed from: b */
        public void mo10958b(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_wallet`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_contact`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_wallet_connect`");
            if (MainRoomDatabase_Impl.this.f6881h != null) {
                int size = MainRoomDatabase_Impl.this.f6881h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C1367b) MainRoomDatabase_Impl.this.f6881h.get(i)).mo10151b(supportSQLiteDatabase);
                }
            }
        }

        /* renamed from: c */
        public void mo10959c(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (MainRoomDatabase_Impl.this.f6881h != null) {
                int size = MainRoomDatabase_Impl.this.f6881h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C1367b) MainRoomDatabase_Impl.this.f6881h.get(i)).mo10150a(supportSQLiteDatabase);
                }
            }
        }

        /* renamed from: d */
        public void mo10960d(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase unused = MainRoomDatabase_Impl.this.f6874a = supportSQLiteDatabase;
            MainRoomDatabase_Impl.this.mo10138x(supportSQLiteDatabase);
            if (MainRoomDatabase_Impl.this.f6881h != null) {
                int size = MainRoomDatabase_Impl.this.f6881h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C1367b) MainRoomDatabase_Impl.this.f6881h.get(i)).mo10152c(supportSQLiteDatabase);
                }
            }
        }

        /* renamed from: e */
        public void mo10961e(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* renamed from: f */
        public void mo10962f(SupportSQLiteDatabase supportSQLiteDatabase) {
            iz0.m19912b(supportSQLiteDatabase);
        }

        /* renamed from: g */
        public kh5.C2682c mo10963g(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
            HashMap hashMap = new HashMap(12);
            hashMap.put("_id", new kl6.C2707a("_id", "INTEGER", false, 1, (String) null, 1));
            hashMap.put(PublicResolver.FUNC_NAME, new kl6.C2707a(PublicResolver.FUNC_NAME, "TEXT", true, 0, (String) null, 1));
            hashMap.put("prefix", new kl6.C2707a("prefix", "TEXT", true, 0, (String) null, 1));
            hashMap.put("privateKey", new kl6.C2707a("privateKey", "TEXT", true, 0, (String) null, 1));
            hashMap.put(Address.TYPE_NAME, new kl6.C2707a(Address.TYPE_NAME, "TEXT", true, 0, (String) null, 1));
            hashMap.put("passPhrase", new kl6.C2707a("passPhrase", "TEXT", false, 0, (String) null, 1));
            hashMap.put("ka", new kl6.C2707a("ka", "TEXT", false, 0, (String) null, 1));
            hashMap.put("u5b64", new kl6.C2707a("u5b64", "TEXT", false, 0, (String) null, 1));
            hashMap.put("isLinked", new kl6.C2707a("isLinked", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("order", new kl6.C2707a("order", "INTEGER", true, 0, "0", 1));
            hashMap.put("isPrimaryWallet", new kl6.C2707a("isPrimaryWallet", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("myCoinType", new kl6.C2707a("myCoinType", "INTEGER", false, 0, (String) null, 1));
            kl6 kl6 = new kl6("table_wallet", hashMap, new HashSet(0), new HashSet(0));
            kl6 a = kl6.m20892a(supportSQLiteDatabase2, "table_wallet");
            if (!kl6.equals(a)) {
                return new kh5.C2682c(false, "table_wallet(net.safemoon.androidwallet.model.wallets.Wallet).\n Expected:\n" + kl6 + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(8);
            hashMap2.put("_id", new kl6.C2707a("_id", "INTEGER", true, 1, (String) null, 1));
            hashMap2.put(PublicResolver.FUNC_NAME, new kl6.C2707a(PublicResolver.FUNC_NAME, "TEXT", true, 0, (String) null, 1));
            hashMap2.put(Address.TYPE_NAME, new kl6.C2707a(Address.TYPE_NAME, "TEXT", true, 0, (String) null, 1));
            hashMap2.put("tokenTypeChain", new kl6.C2707a("tokenTypeChain", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("profilePath", new kl6.C2707a("profilePath", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("lastSent", new kl6.C2707a("lastSent", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("contactCreate", new kl6.C2707a("contactCreate", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("linkId", new kl6.C2707a("linkId", "TEXT", true, 0, (String) null, 1));
            kl6 kl62 = new kl6("table_contact", hashMap2, new HashSet(0), new HashSet(0));
            kl6 a2 = kl6.m20892a(supportSQLiteDatabase2, "table_contact");
            if (!kl62.equals(a2)) {
                return new kh5.C2682c(false, "table_contact(net.safemoon.androidwallet.model.contact.room.RoomContact).\n Expected:\n" + kl62 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(9);
            hashMap3.put("session", new kl6.C2707a("session", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("peerId", new kl6.C2707a("peerId", "TEXT", true, 0, (String) null, 1));
            hashMap3.put("remotePeerId", new kl6.C2707a("remotePeerId", "TEXT", true, 0, (String) null, 1));
            hashMap3.put("chainId", new kl6.C2707a("chainId", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("peerMeta", new kl6.C2707a("peerMeta", "TEXT", true, 0, (String) null, 1));
            hashMap3.put("connectedAt", new kl6.C2707a("connectedAt", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("isAutoDisconnect", new kl6.C2707a("isAutoDisconnect", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("walletId", new kl6.C2707a("walletId", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("version", new kl6.C2707a("version", "INTEGER", true, 0, (String) null, 1));
            kl6 kl63 = new kl6("table_wallet_connect", hashMap3, new HashSet(0), new HashSet(0));
            kl6 a3 = kl6.m20892a(supportSQLiteDatabase2, "table_wallet_connect");
            if (kl63.equals(a3)) {
                return new kh5.C2682c(true, (String) null);
            }
            return new kh5.C2682c(false, "table_wallet_connect(net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo).\n Expected:\n" + kl63 + "\n Found:\n" + a3);
        }
    }

    /* renamed from: O */
    public lp0 mo57106O() {
        lp0 lp0;
        if (this.f41658B != null) {
            return this.f41658B;
        }
        synchronized (this) {
            if (this.f41658B == null) {
                this.f41658B = new mp0(this);
            }
            lp0 = this.f41658B;
        }
        return lp0;
    }

    /* renamed from: P */
    public er0 mo57107P() {
        er0 er0;
        if (this.f41657A != null) {
            return this.f41657A;
        }
        synchronized (this) {
            if (this.f41657A == null) {
                this.f41657A = new fr0(this);
            }
            er0 = this.f41657A;
        }
        return er0;
    }

    /* renamed from: Q */
    public ih7 mo57108Q() {
        ih7 ih7;
        if (this.f41659z != null) {
            return this.f41659z;
        }
        synchronized (this) {
            if (this.f41659z == null) {
                this.f41659z = new jh7(this);
            }
            ih7 = this.f41659z;
        }
        return ih7;
    }

    /* renamed from: f */
    public void mo10120f() {
        super.mo10117c();
        SupportSQLiteDatabase writableDatabase = super.mo10129o().getWritableDatabase();
        try {
            super.mo10119e();
            writableDatabase.execSQL("DELETE FROM `table_wallet`");
            writableDatabase.execSQL("DELETE FROM `table_contact`");
            writableDatabase.execSQL("DELETE FROM `table_wallet_connect`");
            super.mo10115C();
        } finally {
            super.mo10124j();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    /* renamed from: h */
    public gy2 mo10122h() {
        return new gy2(this, new HashMap(0), new HashMap(0), "table_wallet", "table_contact", "table_wallet_connect");
    }

    /* renamed from: i */
    public SupportSQLiteOpenHelper mo10123i(j21 j21) {
        return j21.f13481c.create(SupportSQLiteOpenHelper.Configuration.m9911a(j21.f13479a).mo10273c(j21.f13480b).mo10272b(new kh5(j21, new C8257a(9), "7fc0764b47427c0cac88444290c5269b", "906d951225c81cba3010481e4dd8f077")).mo10271a());
    }

    /* renamed from: k */
    public List<tv3> mo10125k(Map<Class<Object>, Object> map) {
        return Arrays.asList(new tv3[0]);
    }

    /* renamed from: q */
    public Set<Class<Object>> mo10131q() {
        return new HashSet();
    }

    /* renamed from: r */
    public Map<Class<?>, List<Class<?>>> mo10132r() {
        HashMap hashMap = new HashMap();
        hashMap.put(ih7.class, jh7.m59396u());
        hashMap.put(er0.class, fr0.m57849h());
        hashMap.put(lp0.class, mp0.m64388i());
        return hashMap;
    }
}
