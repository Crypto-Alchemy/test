package net.safemoon.androidwallet.database.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase;", "Landroidx/room/RoomDatabase;", "Lz57;", "Z", "Lxz1;", "V", "Lvy0;", "U", "Llb5;", "X", "Lir6;", "Y", "Lej0;", "T", "Lo64;", "W", "Lci0;", "S", "<init>", "()V", "p", "m", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ApplicationRoomDatabase.kt */
public abstract class ApplicationRoomDatabase extends RoomDatabase {

    /* renamed from: A */
    public static final C8258a f41661A = new C8258a();

    /* renamed from: B */
    public static final C8259b f41662B = new C8259b();

    /* renamed from: C */
    public static final C8260c f41663C = new C8260c();

    /* renamed from: p */
    public static final C8270m f41664p = new C8270m((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static ApplicationRoomDatabase f41665q;

    /* renamed from: r */
    public static final C8261d f41666r = new C8261d();

    /* renamed from: s */
    public static final C8262e f41667s = new C8262e();

    /* renamed from: t */
    public static final C8263f f41668t = new C8263f();

    /* renamed from: u */
    public static final C8264g f41669u = new C8264g();

    /* renamed from: v */
    public static final C8265h f41670v = new C8265h();

    /* renamed from: w */
    public static final C8266i f41671w = new C8266i();

    /* renamed from: x */
    public static final C8267j f41672x = new C8267j();

    /* renamed from: y */
    public static final C8268k f41673y = new C8268k();

    /* renamed from: z */
    public static final C8269l f41674z = new C8269l();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$a", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$a */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8258a extends tv3 {
        public C8258a() {
            super(10, 11);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("ALTER TABLE `table_room_nft` ADD COLUMN `image_data` TEXT");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$b", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$b */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8259b extends tv3 {
        public C8259b() {
            super(11, 12);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("ALTER TABLE `table_room_collections` ADD COLUMN `fullData` TEXT");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$c", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$c */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8260c extends tv3 {
        public C8260c() {
            super(12, 13);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("DROP TABLE `table_contact`");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$d", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$d */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8261d extends tv3 {
        public C8261d() {
            super(1, 2);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_fiat` (`symbol` TEXT PRIMARY KEY NOT NULL, `name` TEXT, `rate` REAL)");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$e", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$e */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8262e extends tv3 {
        public C8262e() {
            super(2, 3);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$f", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$f */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8263f extends tv3 {
        public C8263f() {
            super(3, 4);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_custom` (`symbolWithType` TEXT NOT NULL, `symbol` TEXT NOT NULL, `name` TEXT NOT NULL, `iconPath` TEXT NOT NULL, `contractorAddress` TEXT NOT NULL, `tokenTypeChain` INTEGER NOT NULL, `decimals` INTEGER NOT NULL, `allowSwap` INTEGER NOT NULL, `nativeBalance` REAL NOT NULL, `priceInUsdt` REAL NOT NULL, `percentChange1h` REAL NOT NULL, PRIMARY KEY(`symbolWithType`))");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$g", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$g */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8264g extends tv3 {
        public C8264g() {
            super(4, 5);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("ALTER TABLE table_token ADD COLUMN `order` INTEGER NOT NULL DEFAULT 0");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$h", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$h */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8265h extends tv3 {
        public C8265h() {
            super(5, 6);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$i", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$i */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8266i extends tv3 {
        public C8266i() {
            super(6, 7);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_reflections_token_2` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `symbolWithType` TEXT NOT NULL, `symbol` TEXT NOT NULL, `name` TEXT NOT NULL, `iconPath` TEXT NOT NULL, `contractorAddress` TEXT NOT NULL, `tokenTypeChain` INTEGER NOT NULL, `decimals` INTEGER NOT NULL, `nativeBalance` TEXT, `firstTimeStamp` INTEGER, `enableAdvanceMode` INTEGER NOT NULL DEFAULT 0, `latestBalance` INTEGER, `latestTimeStamp` INTEGER, `cmcId` INTEGER DEFAULT 0, `priceUsd` REAL DEFAULT 0)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_reflections_data_2` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `symbolWithType` TEXT NOT NULL, `nativeBalance` TEXT NOT NULL, `blockBalance` TEXT NOT NULL, `block` TEXT NOT NULL, `timeStamp` INTEGER NOT NULL)");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$j", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$j */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8267j extends tv3 {
        public C8267j() {
            super(7, 8);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_token_info` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `symbolWithType` TEXT NOT NULL, `chainId` INTEGER NOT NULL, `slug` TEXT, `cmcId` INTEGER)");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$k", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$k */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8268k extends tv3 {
        public C8268k() {
            super(8, 9);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_coin_price_alert` (`id` INTEGER NOT NULL, `symbol` TEXT NOT NULL, `name` TEXT NOT NULL, `slug` TEXT NOT NULL, `cmcData` TEXT NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_nft` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `chain` INTEGER NOT NULL, `collectionId` INTEGER NOT NULL, `token_id` TEXT, `name` TEXT, `description` TEXT, `animation_url` TEXT, `image_preview_url` TEXT, `token_uri` TEXT, `attributes` TEXT, `fullData` TEXT, `permalink` TEXT, `openSeaUrl` TEXT, `updatedTime` INTEGER NOT NULL, `order` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_room_collections` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `chain` INTEGER NOT NULL, `contractAddress` TEXT NOT NULL, `contract_type` TEXT NOT NULL, `name` TEXT, `description` TEXT, `imageUrl` TEXT, `symbol` TEXT, `marketPlace` TEXT, `slug` TEXT, `updatedTime` INTEGER NOT NULL, `order` INTEGER NOT NULL)");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$l", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$l */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8269l extends tv3 {
        public C8269l() {
            super(9, 10);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("ALTER TABLE `table_room_collections` ADD COLUMN `typeDeleteNft` INTEGER NOT NULL DEFAULT 0");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\b*\f\u0011\u0014\u0017\u001a\u001d #&),/2\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u00108J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\f0\u000bJ\u001e\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\f0\u000bJ\u001e\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, mo44877d2 = {"Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$m;", "", "Landroid/content/Context;", "context", "", "walletPrefix", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase;", "b", "Lr37;", "g", "a", "", "Lkotlin/Pair;", "Lnet/safemoon/androidwallet/common/TokenType;", "d", "e", "f", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$a", "MIGRATION_10_11", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$a;", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$b", "MIGRATION_11_12", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$b;", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$c", "MIGRATION_12_13", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$c;", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$d", "MIGRATION_1_2", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$d;", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$e", "MIGRATION_2_3", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$e;", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$f", "MIGRATION_3_4", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$f;", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$g", "MIGRATION_4_5", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$g;", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$h", "MIGRATION_5_6", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$h;", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$i", "MIGRATION_6_7", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$i;", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$j", "MIGRATION_7_8", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$j;", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$k", "MIGRATION_8_9", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$k;", "net/safemoon/androidwallet/database/room/ApplicationRoomDatabase$l", "MIGRATION_9_10", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase$l;", "instance", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$m */
    /* compiled from: ApplicationRoomDatabase.kt */
    public static final class C8270m {
        public C8270m() {
        }

        public /* synthetic */ C8270m(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ ApplicationRoomDatabase m65847c(C8270m mVar, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return mVar.mo57120b(context, str);
        }

        /* renamed from: a */
        public final void mo57119a(Context context) {
            vx2.m53591g(context, "context");
            m65847c(this, context, (String) null, 2, (Object) null).mo10120f();
        }

        /* renamed from: b */
        public final ApplicationRoomDatabase mo57120b(Context context, String str) {
            boolean z;
            String str2;
            vx2.m53591g(context, "context");
            if (ApplicationRoomDatabase.f41665q == null) {
                synchronized (this) {
                    Wallet c = ol0.m70351c(context);
                    if (str == null && (c == null || (str = c.getPrefix()) == null)) {
                        str = "";
                    }
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str2 = "";
                    } else {
                        str2 = str + "_";
                    }
                    String str3 = str2 + "safemoon";
                    zi7.f46397a.mo67318f(str3);
                    if (ApplicationRoomDatabase.f41665q == null) {
                        Context applicationContext = context.getApplicationContext();
                        vx2.m53590f(applicationContext, "context.applicationContext");
                        ApplicationRoomDatabase.f41665q = ih5.m19629a(applicationContext, ApplicationRoomDatabase.class, str3).mo10144b(ApplicationRoomDatabase.f41666r).mo10144b(ApplicationRoomDatabase.f41667s).mo10144b(ApplicationRoomDatabase.f41668t).mo10144b(ApplicationRoomDatabase.f41669u).mo10144b(ApplicationRoomDatabase.f41670v).mo10144b(ApplicationRoomDatabase.f41671w).mo10144b(ApplicationRoomDatabase.f41672x).mo10144b(ApplicationRoomDatabase.f41673y).mo10144b(ApplicationRoomDatabase.f41674z).mo10144b(ApplicationRoomDatabase.f41661A).mo10144b(ApplicationRoomDatabase.f41662B).mo10144b(ApplicationRoomDatabase.f41663C).mo10146d();
                    }
                    r37 r37 = r37.f33317a;
                }
            }
            ApplicationRoomDatabase E = ApplicationRoomDatabase.f41665q;
            vx2.m53588d(E);
            return E;
        }

        /* renamed from: d */
        public final List<Pair<TokenType, List<String>>> mo57121d() {
            return ck0.m33065m(wy6.m54142a(TokenType.BEP_20, ck0.m33065m("BEP_BNB", "BEP_SAFEMOON_V2")), wy6.m54142a(TokenType.ERC_20, ck0.m33065m("ERC_ETH", "ERC_PSAFEMOON")), wy6.m54142a(TokenType.POLYGON, ck0.m33065m("POLYGON_MATIC", "POLYGON_USDT")), wy6.m54142a(TokenType.AVALANCHE_C, ck0.m33065m("AVALANCHE_C_AVAX", "AVALANCHE_C_USDT")), wy6.m54142a(TokenType.SOLANA, ck0.m33065m("SOLANA_SOL", "SOLANA_USDC")), wy6.m54142a(TokenType.MULTI_COIN, ck0.m33065m("MULTI_COIN_BITCOIN", "MULTI_COIN_DOGE")));
        }

        /* renamed from: e */
        public final List<Pair<TokenType, List<String>>> mo57122e() {
            return ck0.m33062j();
        }

        /* renamed from: f */
        public final Pair<List<String>, List<String>> mo57123f() {
            return new Pair<>(bk0.m32598e("BEP_SAFEMOON_V2"), ck0.m33062j());
        }

        /* renamed from: g */
        public final void mo57124g() {
            ApplicationRoomDatabase.f41665q = null;
            C7126gf.f38011a.mo50768a();
            c67.f37071a.mo50768a();
            va5.f45251a.mo66466b();
            qu4.f44243a.mo50768a();
            lr0.f40678a.mo55966b();
            yy0.f46294a.mo67190b();
        }
    }

    /* renamed from: S */
    public abstract ci0 mo57111S();

    /* renamed from: T */
    public abstract ej0 mo57112T();

    /* renamed from: U */
    public abstract vy0 mo57113U();

    /* renamed from: V */
    public abstract xz1 mo57114V();

    /* renamed from: W */
    public abstract o64 mo57115W();

    /* renamed from: X */
    public abstract lb5 mo57116X();

    /* renamed from: Y */
    public abstract ir6 mo57117Y();

    /* renamed from: Z */
    public abstract z57 mo57118Z();
}
