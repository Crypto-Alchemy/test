package net.safemoon.androidwallet.database.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.kh5;
import p000.kl6;

public final class ApplicationRoomDatabase_Impl extends ApplicationRoomDatabase {

    /* renamed from: D */
    public volatile z57 f41675D;

    /* renamed from: E */
    public volatile xz1 f41676E;

    /* renamed from: F */
    public volatile vy0 f41677F;

    /* renamed from: G */
    public volatile lb5 f41678G;

    /* renamed from: H */
    public volatile ir6 f41679H;

    /* renamed from: I */
    public volatile ej0 f41680I;

    /* renamed from: J */
    public volatile o64 f41681J;

    /* renamed from: K */
    public volatile ci0 f41682K;

    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase_Impl$a */
    public class C8271a extends kh5.C2681b {
        public C8271a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo10957a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_token` (`symbolWithType` TEXT NOT NULL, `symbol` TEXT NOT NULL, `name` TEXT NOT NULL, `iconName` TEXT NOT NULL, `contractorAddress` TEXT NOT NULL, `tokenTypeChain` INTEGER NOT NULL, `decimals` INTEGER NOT NULL, `allowSwap` INTEGER NOT NULL, `nativeBalance` REAL NOT NULL, `priceInUsdt` REAL NOT NULL, `percentChange1h` REAL NOT NULL, `order` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`symbolWithType`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_fiat` (`symbol` TEXT NOT NULL, `name` TEXT, `rate` REAL, PRIMARY KEY(`symbol`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_custom` (`symbolWithType` TEXT NOT NULL, `symbol` TEXT NOT NULL, `name` TEXT NOT NULL, `iconPath` TEXT NOT NULL, `contractorAddress` TEXT NOT NULL, `tokenTypeChain` INTEGER NOT NULL, `decimals` INTEGER NOT NULL, `allowSwap` INTEGER NOT NULL, `nativeBalance` REAL NOT NULL, `priceInUsdt` REAL NOT NULL, `percentChange1h` REAL NOT NULL, PRIMARY KEY(`symbolWithType`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_reflections_token_2` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `symbolWithType` TEXT NOT NULL, `symbol` TEXT NOT NULL, `name` TEXT NOT NULL, `iconPath` TEXT NOT NULL, `contractorAddress` TEXT NOT NULL, `tokenTypeChain` INTEGER NOT NULL, `decimals` INTEGER NOT NULL, `nativeBalance` TEXT, `firstTimeStamp` INTEGER, `enableAdvanceMode` INTEGER NOT NULL DEFAULT 0, `latestBalance` INTEGER, `latestTimeStamp` INTEGER, `cmcId` INTEGER DEFAULT 0, `priceUsd` REAL DEFAULT 0)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_reflections_data_2` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `symbolWithType` TEXT NOT NULL, `nativeBalance` TEXT NOT NULL, `blockBalance` TEXT NOT NULL, `block` TEXT NOT NULL, `timeStamp` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_token_info` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `symbolWithType` TEXT NOT NULL, `chainId` INTEGER NOT NULL, `slug` TEXT, `cmcId` INTEGER)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_collections` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `chain` INTEGER NOT NULL, `contractAddress` TEXT NOT NULL, `contract_type` TEXT NOT NULL, `name` TEXT, `description` TEXT, `imageUrl` TEXT, `symbol` TEXT, `marketPlace` TEXT, `slug` TEXT, `updatedTime` INTEGER NOT NULL, `order` INTEGER NOT NULL, `typeDeleteNft` INTEGER NOT NULL, `fullData` TEXT)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_nft` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `chain` INTEGER NOT NULL, `collectionId` INTEGER NOT NULL, `token_id` TEXT, `name` TEXT, `description` TEXT, `animation_url` TEXT, `image_preview_url` TEXT, `image_data` TEXT, `token_uri` TEXT, `attributes` TEXT, `fullData` TEXT, `permalink` TEXT, `openSeaUrl` TEXT, `updatedTime` INTEGER NOT NULL, `order` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_coin_price_alert` (`id` INTEGER NOT NULL, `symbol` TEXT NOT NULL, `name` TEXT NOT NULL, `slug` TEXT NOT NULL, `cmcData` TEXT NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fefac8fc8af195b65b82d49e876bed20')");
        }

        /* renamed from: b */
        public void mo10958b(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_token`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_fiat`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_custom`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_room_reflections_token_2`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_room_reflections_data_2`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_room_token_info`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_room_collections`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_room_nft`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `table_room_coin_price_alert`");
            if (ApplicationRoomDatabase_Impl.this.f6881h != null) {
                int size = ApplicationRoomDatabase_Impl.this.f6881h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C1367b) ApplicationRoomDatabase_Impl.this.f6881h.get(i)).mo10151b(supportSQLiteDatabase);
                }
            }
        }

        /* renamed from: c */
        public void mo10959c(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (ApplicationRoomDatabase_Impl.this.f6881h != null) {
                int size = ApplicationRoomDatabase_Impl.this.f6881h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C1367b) ApplicationRoomDatabase_Impl.this.f6881h.get(i)).mo10150a(supportSQLiteDatabase);
                }
            }
        }

        /* renamed from: d */
        public void mo10960d(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase unused = ApplicationRoomDatabase_Impl.this.f6874a = supportSQLiteDatabase;
            ApplicationRoomDatabase_Impl.this.mo10138x(supportSQLiteDatabase);
            if (ApplicationRoomDatabase_Impl.this.f6881h != null) {
                int size = ApplicationRoomDatabase_Impl.this.f6881h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C1367b) ApplicationRoomDatabase_Impl.this.f6881h.get(i)).mo10152c(supportSQLiteDatabase);
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
            hashMap.put("symbolWithType", new kl6.C2707a("symbolWithType", "TEXT", true, 1, (String) null, 1));
            hashMap.put("symbol", new kl6.C2707a("symbol", "TEXT", true, 0, (String) null, 1));
            hashMap.put(PublicResolver.FUNC_NAME, new kl6.C2707a(PublicResolver.FUNC_NAME, "TEXT", true, 0, (String) null, 1));
            hashMap.put("iconName", new kl6.C2707a("iconName", "TEXT", true, 0, (String) null, 1));
            hashMap.put("contractorAddress", new kl6.C2707a("contractorAddress", "TEXT", true, 0, (String) null, 1));
            hashMap.put("tokenTypeChain", new kl6.C2707a("tokenTypeChain", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("decimals", new kl6.C2707a("decimals", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("allowSwap", new kl6.C2707a("allowSwap", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("nativeBalance", new kl6.C2707a("nativeBalance", "REAL", true, 0, (String) null, 1));
            hashMap.put("priceInUsdt", new kl6.C2707a("priceInUsdt", "REAL", true, 0, (String) null, 1));
            hashMap.put("percentChange1h", new kl6.C2707a("percentChange1h", "REAL", true, 0, (String) null, 1));
            hashMap.put("order", new kl6.C2707a("order", "INTEGER", true, 0, "0", 1));
            Object obj = "order";
            kl6 kl6 = new kl6("table_token", hashMap, new HashSet(0), new HashSet(0));
            kl6 a = kl6.m20892a(supportSQLiteDatabase2, "table_token");
            if (!kl6.equals(a)) {
                return new kh5.C2682c(false, "table_token(net.safemoon.androidwallet.model.token.room.RoomToken).\n Expected:\n" + kl6 + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(3);
            hashMap2.put("symbol", new kl6.C2707a("symbol", "TEXT", true, 1, (String) null, 1));
            hashMap2.put(PublicResolver.FUNC_NAME, new kl6.C2707a(PublicResolver.FUNC_NAME, "TEXT", false, 0, (String) null, 1));
            hashMap2.put("rate", new kl6.C2707a("rate", "REAL", false, 0, (String) null, 1));
            Object obj2 = "percentChange1h";
            kl6 kl62 = new kl6("table_fiat", hashMap2, new HashSet(0), new HashSet(0));
            kl6 a2 = kl6.m20892a(supportSQLiteDatabase2, "table_fiat");
            if (!kl62.equals(a2)) {
                return new kh5.C2682c(false, "table_fiat(net.safemoon.androidwallet.model.fiat.room.RoomFiat).\n Expected:\n" + kl62 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(11);
            hashMap3.put("symbolWithType", new kl6.C2707a("symbolWithType", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("symbol", new kl6.C2707a("symbol", "TEXT", true, 0, (String) null, 1));
            hashMap3.put(PublicResolver.FUNC_NAME, new kl6.C2707a(PublicResolver.FUNC_NAME, "TEXT", true, 0, (String) null, 1));
            hashMap3.put("iconPath", new kl6.C2707a("iconPath", "TEXT", true, 0, (String) null, 1));
            hashMap3.put("contractorAddress", new kl6.C2707a("contractorAddress", "TEXT", true, 0, (String) null, 1));
            hashMap3.put("tokenTypeChain", new kl6.C2707a("tokenTypeChain", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("decimals", new kl6.C2707a("decimals", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("allowSwap", new kl6.C2707a("allowSwap", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("nativeBalance", new kl6.C2707a("nativeBalance", "REAL", true, 0, (String) null, 1));
            hashMap3.put("priceInUsdt", new kl6.C2707a("priceInUsdt", "REAL", true, 0, (String) null, 1));
            hashMap3.put(obj2, new kl6.C2707a("percentChange1h", "REAL", true, 0, (String) null, 1));
            kl6 kl63 = new kl6("table_custom", hashMap3, new HashSet(0), new HashSet(0));
            kl6 a3 = kl6.m20892a(supportSQLiteDatabase2, "table_custom");
            if (!kl63.equals(a3)) {
                return new kh5.C2682c(false, "table_custom(net.safemoon.androidwallet.model.token.room.RoomCustomToken).\n Expected:\n" + kl63 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(15);
            hashMap4.put("_id", new kl6.C2707a("_id", "INTEGER", false, 1, (String) null, 1));
            hashMap4.put("symbolWithType", new kl6.C2707a("symbolWithType", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("symbol", new kl6.C2707a("symbol", "TEXT", true, 0, (String) null, 1));
            hashMap4.put(PublicResolver.FUNC_NAME, new kl6.C2707a(PublicResolver.FUNC_NAME, "TEXT", true, 0, (String) null, 1));
            hashMap4.put("iconPath", new kl6.C2707a("iconPath", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("contractorAddress", new kl6.C2707a("contractorAddress", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("tokenTypeChain", new kl6.C2707a("tokenTypeChain", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("decimals", new kl6.C2707a("decimals", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("nativeBalance", new kl6.C2707a("nativeBalance", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("firstTimeStamp", new kl6.C2707a("firstTimeStamp", "INTEGER", false, 0, (String) null, 1));
            hashMap4.put("enableAdvanceMode", new kl6.C2707a("enableAdvanceMode", "INTEGER", true, 0, "0", 1));
            hashMap4.put("latestBalance", new kl6.C2707a("latestBalance", "INTEGER", false, 0, (String) null, 1));
            hashMap4.put("latestTimeStamp", new kl6.C2707a("latestTimeStamp", "INTEGER", false, 0, (String) null, 1));
            hashMap4.put("cmcId", new kl6.C2707a("cmcId", "INTEGER", false, 0, "0", 1));
            hashMap4.put("priceUsd", new kl6.C2707a("priceUsd", "REAL", false, 0, "0", 1));
            kl6 kl64 = new kl6("table_room_reflections_token_2", hashMap4, new HashSet(0), new HashSet(0));
            kl6 a4 = kl6.m20892a(supportSQLiteDatabase2, "table_room_reflections_token_2");
            if (!kl64.equals(a4)) {
                return new kh5.C2682c(false, "table_room_reflections_token_2(net.safemoon.androidwallet.model.reflections.RoomReflectionsToken).\n Expected:\n" + kl64 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(6);
            hashMap5.put("_id", new kl6.C2707a("_id", "INTEGER", false, 1, (String) null, 1));
            hashMap5.put("symbolWithType", new kl6.C2707a("symbolWithType", "TEXT", true, 0, (String) null, 1));
            hashMap5.put("nativeBalance", new kl6.C2707a("nativeBalance", "TEXT", true, 0, (String) null, 1));
            hashMap5.put("blockBalance", new kl6.C2707a("blockBalance", "TEXT", true, 0, (String) null, 1));
            hashMap5.put("block", new kl6.C2707a("block", "TEXT", true, 0, (String) null, 1));
            hashMap5.put("timeStamp", new kl6.C2707a("timeStamp", "INTEGER", true, 0, (String) null, 1));
            kl6 kl65 = new kl6("table_room_reflections_data_2", hashMap5, new HashSet(0), new HashSet(0));
            kl6 a5 = kl6.m20892a(supportSQLiteDatabase2, "table_room_reflections_data_2");
            if (!kl65.equals(a5)) {
                return new kh5.C2682c(false, "table_room_reflections_data_2(net.safemoon.androidwallet.model.reflections.RoomReflectionsData).\n Expected:\n" + kl65 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(5);
            hashMap6.put("_id", new kl6.C2707a("_id", "INTEGER", false, 1, (String) null, 1));
            hashMap6.put("symbolWithType", new kl6.C2707a("symbolWithType", "TEXT", true, 0, (String) null, 1));
            hashMap6.put("chainId", new kl6.C2707a("chainId", "INTEGER", true, 0, (String) null, 1));
            hashMap6.put("slug", new kl6.C2707a("slug", "TEXT", false, 0, (String) null, 1));
            hashMap6.put("cmcId", new kl6.C2707a("cmcId", "INTEGER", false, 0, (String) null, 1));
            kl6 kl66 = new kl6("table_room_token_info", hashMap6, new HashSet(0), new HashSet(0));
            kl6 a6 = kl6.m20892a(supportSQLiteDatabase2, "table_room_token_info");
            if (!kl66.equals(a6)) {
                return new kh5.C2682c(false, "table_room_token_info(net.safemoon.androidwallet.model.RoomTokenInfo).\n Expected:\n" + kl66 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(14);
            hashMap7.put("_id", new kl6.C2707a("_id", "INTEGER", false, 1, (String) null, 1));
            hashMap7.put("chain", new kl6.C2707a("chain", "INTEGER", true, 0, (String) null, 1));
            hashMap7.put("contractAddress", new kl6.C2707a("contractAddress", "TEXT", true, 0, (String) null, 1));
            hashMap7.put("contract_type", new kl6.C2707a("contract_type", "TEXT", true, 0, (String) null, 1));
            hashMap7.put(PublicResolver.FUNC_NAME, new kl6.C2707a(PublicResolver.FUNC_NAME, "TEXT", false, 0, (String) null, 1));
            hashMap7.put("description", new kl6.C2707a("description", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("imageUrl", new kl6.C2707a("imageUrl", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("symbol", new kl6.C2707a("symbol", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("marketPlace", new kl6.C2707a("marketPlace", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("slug", new kl6.C2707a("slug", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("updatedTime", new kl6.C2707a("updatedTime", "INTEGER", true, 0, (String) null, 1));
            Object obj3 = obj;
            hashMap7.put(obj3, new kl6.C2707a("order", "INTEGER", true, 0, (String) null, 1));
            hashMap7.put("typeDeleteNft", new kl6.C2707a("typeDeleteNft", "INTEGER", true, 0, (String) null, 1));
            hashMap7.put("fullData", new kl6.C2707a("fullData", "TEXT", false, 0, (String) null, 1));
            kl6 kl67 = new kl6("table_room_collections", hashMap7, new HashSet(0), new HashSet(0));
            kl6 a7 = kl6.m20892a(supportSQLiteDatabase2, "table_room_collections");
            if (!kl67.equals(a7)) {
                return new kh5.C2682c(false, "table_room_collections(net.safemoon.androidwallet.model.collectible.RoomCollection).\n Expected:\n" + kl67 + "\n Found:\n" + a7);
            }
            HashMap hashMap8 = new HashMap(16);
            hashMap8.put("_id", new kl6.C2707a("_id", "INTEGER", false, 1, (String) null, 1));
            hashMap8.put("chain", new kl6.C2707a("chain", "INTEGER", true, 0, (String) null, 1));
            hashMap8.put("collectionId", new kl6.C2707a("collectionId", "INTEGER", true, 0, (String) null, 1));
            hashMap8.put("token_id", new kl6.C2707a("token_id", "TEXT", false, 0, (String) null, 1));
            hashMap8.put(PublicResolver.FUNC_NAME, new kl6.C2707a(PublicResolver.FUNC_NAME, "TEXT", false, 0, (String) null, 1));
            hashMap8.put("description", new kl6.C2707a("description", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("animation_url", new kl6.C2707a("animation_url", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("image_preview_url", new kl6.C2707a("image_preview_url", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("image_data", new kl6.C2707a("image_data", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("token_uri", new kl6.C2707a("token_uri", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("attributes", new kl6.C2707a("attributes", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("fullData", new kl6.C2707a("fullData", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("permalink", new kl6.C2707a("permalink", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("openSeaUrl", new kl6.C2707a("openSeaUrl", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("updatedTime", new kl6.C2707a("updatedTime", "INTEGER", true, 0, (String) null, 1));
            hashMap8.put(obj3, new kl6.C2707a("order", "INTEGER", true, 0, (String) null, 1));
            kl6 kl68 = new kl6("table_room_nft", hashMap8, new HashSet(0), new HashSet(0));
            kl6 a8 = kl6.m20892a(supportSQLiteDatabase2, "table_room_nft");
            if (!kl68.equals(a8)) {
                return new kh5.C2682c(false, "table_room_nft(net.safemoon.androidwallet.model.collectible.RoomNFT).\n Expected:\n" + kl68 + "\n Found:\n" + a8);
            }
            HashMap hashMap9 = new HashMap(5);
            hashMap9.put("id", new kl6.C2707a("id", "INTEGER", true, 1, (String) null, 1));
            hashMap9.put("symbol", new kl6.C2707a("symbol", "TEXT", true, 0, (String) null, 1));
            hashMap9.put(PublicResolver.FUNC_NAME, new kl6.C2707a(PublicResolver.FUNC_NAME, "TEXT", true, 0, (String) null, 1));
            hashMap9.put("slug", new kl6.C2707a("slug", "TEXT", true, 0, (String) null, 1));
            hashMap9.put("cmcData", new kl6.C2707a("cmcData", "TEXT", true, 0, (String) null, 1));
            kl6 kl69 = new kl6("table_room_coin_price_alert", hashMap9, new HashSet(0), new HashSet(0));
            kl6 a9 = kl6.m20892a(supportSQLiteDatabase2, "table_room_coin_price_alert");
            if (kl69.equals(a9)) {
                return new kh5.C2682c(true, (String) null);
            }
            return new kh5.C2682c(false, "table_room_coin_price_alert(net.safemoon.androidwallet.model.RoomCoinPriceAlert).\n Expected:\n" + kl69 + "\n Found:\n" + a9);
        }
    }

    /* renamed from: S */
    public ci0 mo57111S() {
        ci0 ci0;
        if (this.f41682K != null) {
            return this.f41682K;
        }
        synchronized (this) {
            if (this.f41682K == null) {
                this.f41682K = new di0(this);
            }
            ci0 = this.f41682K;
        }
        return ci0;
    }

    /* renamed from: T */
    public ej0 mo57112T() {
        ej0 ej0;
        if (this.f41680I != null) {
            return this.f41680I;
        }
        synchronized (this) {
            if (this.f41680I == null) {
                this.f41680I = new fj0(this);
            }
            ej0 = this.f41680I;
        }
        return ej0;
    }

    /* renamed from: U */
    public vy0 mo57113U() {
        vy0 vy0;
        if (this.f41677F != null) {
            return this.f41677F;
        }
        synchronized (this) {
            if (this.f41677F == null) {
                this.f41677F = new wy0(this);
            }
            vy0 = this.f41677F;
        }
        return vy0;
    }

    /* renamed from: V */
    public xz1 mo57114V() {
        xz1 xz1;
        if (this.f41676E != null) {
            return this.f41676E;
        }
        synchronized (this) {
            if (this.f41676E == null) {
                this.f41676E = new yz1(this);
            }
            xz1 = this.f41676E;
        }
        return xz1;
    }

    /* renamed from: W */
    public o64 mo57115W() {
        o64 o64;
        if (this.f41681J != null) {
            return this.f41681J;
        }
        synchronized (this) {
            if (this.f41681J == null) {
                this.f41681J = new p64(this);
            }
            o64 = this.f41681J;
        }
        return o64;
    }

    /* renamed from: X */
    public lb5 mo57116X() {
        lb5 lb5;
        if (this.f41678G != null) {
            return this.f41678G;
        }
        synchronized (this) {
            if (this.f41678G == null) {
                this.f41678G = new mb5(this);
            }
            lb5 = this.f41678G;
        }
        return lb5;
    }

    /* renamed from: Y */
    public ir6 mo57117Y() {
        ir6 ir6;
        if (this.f41679H != null) {
            return this.f41679H;
        }
        synchronized (this) {
            if (this.f41679H == null) {
                this.f41679H = new jr6(this);
            }
            ir6 = this.f41679H;
        }
        return ir6;
    }

    /* renamed from: Z */
    public z57 mo57118Z() {
        z57 z57;
        if (this.f41675D != null) {
            return this.f41675D;
        }
        synchronized (this) {
            if (this.f41675D == null) {
                this.f41675D = new a67(this);
            }
            z57 = this.f41675D;
        }
        return z57;
    }

    /* renamed from: f */
    public void mo10120f() {
        super.mo10117c();
        SupportSQLiteDatabase writableDatabase = super.mo10129o().getWritableDatabase();
        try {
            super.mo10119e();
            writableDatabase.execSQL("DELETE FROM `table_token`");
            writableDatabase.execSQL("DELETE FROM `table_fiat`");
            writableDatabase.execSQL("DELETE FROM `table_custom`");
            writableDatabase.execSQL("DELETE FROM `table_room_reflections_token_2`");
            writableDatabase.execSQL("DELETE FROM `table_room_reflections_data_2`");
            writableDatabase.execSQL("DELETE FROM `table_room_token_info`");
            writableDatabase.execSQL("DELETE FROM `table_room_collections`");
            writableDatabase.execSQL("DELETE FROM `table_room_nft`");
            writableDatabase.execSQL("DELETE FROM `table_room_coin_price_alert`");
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
        return new gy2(this, new HashMap(0), new HashMap(0), "table_token", "table_fiat", "table_custom", "table_room_reflections_token_2", "table_room_reflections_data_2", "table_room_token_info", "table_room_collections", "table_room_nft", "table_room_coin_price_alert");
    }

    /* renamed from: i */
    public SupportSQLiteOpenHelper mo10123i(j21 j21) {
        return j21.f13481c.create(SupportSQLiteOpenHelper.Configuration.m9911a(j21.f13479a).mo10273c(j21.f13480b).mo10272b(new kh5(j21, new C8271a(13), "fefac8fc8af195b65b82d49e876bed20", "c18b1d1b854366e4ecbaf93dee4432dc")).mo10271a());
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
        hashMap.put(z57.class, a67.m55384t());
        hashMap.put(xz1.class, yz1.m74690g());
        hashMap.put(vy0.class, wy0.m73757e());
        hashMap.put(lb5.class, mb5.m64228H());
        hashMap.put(ir6.class, jr6.m59551f());
        hashMap.put(ej0.class, fj0.m57723n());
        hashMap.put(o64.class, p64.m70932p());
        hashMap.put(ci0.class, di0.m56862j());
        return hashMap;
    }
}
