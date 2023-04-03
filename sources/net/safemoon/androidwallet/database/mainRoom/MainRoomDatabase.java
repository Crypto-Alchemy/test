package net.safemoon.androidwallet.database.mainRoom;

import android.content.Context;
import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.model.contact.room.RoomContact;
import org.web3j.abi.datatypes.Address;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase;", "Landroidx/room/RoomDatabase;", "Lih7;", "Q", "Ler0;", "P", "Llp0;", "O", "<init>", "()V", "p", "i", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MainRoomDatabase.kt */
public abstract class MainRoomDatabase extends RoomDatabase {

    /* renamed from: p */
    public static final C8256i f41647p = new C8256i((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final C8248a f41648q = new C8248a();

    /* renamed from: r */
    public static final C8249b f41649r = new C8249b();

    /* renamed from: s */
    public static final C8250c f41650s = new C8250c();

    /* renamed from: t */
    public static final C8251d f41651t = new C8251d();

    /* renamed from: u */
    public static final C8252e f41652u = new C8252e();

    /* renamed from: v */
    public static final C8253f f41653v = new C8253f();

    /* renamed from: w */
    public static final C8254g f41654w = new C8254g();

    /* renamed from: x */
    public static final C8255h f41655x = new C8255h();

    /* renamed from: y */
    public static MainRoomDatabase f41656y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$a", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase$a */
    /* compiled from: MainRoomDatabase.kt */
    public static final class C8248a extends tv3 {
        public C8248a() {
            super(1, 2);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `table_wallet_connect` (`session` TEXT NOT NULL, `peerId` TEXT NOT NULL, `remotePeerId` TEXT NOT NULL, `chainId` INTEGER NOT NULL, `peerMeta` TEXT NOT NULL, `connectedAt` INTEGER NOT NULL, `isAutoDisconnect` INTEGER NOT NULL, `walletId` INTEGER NOT NULL, PRIMARY KEY(`session`))");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$b", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase$b */
    /* compiled from: MainRoomDatabase.kt */
    public static final class C8249b extends tv3 {
        public C8249b() {
            super(2, 3);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("ALTER TABLE table_wallet ADD COLUMN `ka` TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE table_wallet ADD COLUMN `u5b64` TEXT");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$c", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase$c */
    /* compiled from: MainRoomDatabase.kt */
    public static final class C8250c extends tv3 {
        public C8250c() {
            super(3, 4);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("ALTER TABLE table_wallet ADD COLUMN `isLinked` INTEGER NOT NULL DEFAULT 0");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$d", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase$d */
    /* compiled from: MainRoomDatabase.kt */
    public static final class C8251d extends tv3 {
        public C8251d() {
            super(4, 5);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("ALTER TABLE table_wallet ADD COLUMN `order` INTEGER NOT NULL DEFAULT 0");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$e", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase$e */
    /* compiled from: MainRoomDatabase.kt */
    public static final class C8252e extends tv3 {
        public C8252e() {
            super(5, 6);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("ALTER TABLE table_wallet ADD COLUMN `isPrimaryWallet` INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("UPDATE `table_wallet` SET `isPrimaryWallet` = 1 where `name`= 'SafeMoon Master Wallet' and `u5b64` is not null");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$f", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase$f */
    /* compiled from: MainRoomDatabase.kt */
    public static final class C8253f extends tv3 {
        public C8253f() {
            super(6, 7);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("ALTER TABLE `table_wallet` ADD COLUMN `myCoinType` INTEGER");
            supportSQLiteDatabase.execSQL("UPDATE `table_wallet` SET `myCoinType` = 60 where `passPhrase` is null or `passPhrase`= ''");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$g", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase$g */
    /* compiled from: MainRoomDatabase.kt */
    public static final class C8254g extends tv3 {
        public C8254g() {
            super(7, 8);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
            vx2.m53591g(supportSQLiteDatabase2, "database");
            Cursor query = supportSQLiteDatabase2.query("SELECT * FROM table_contact");
            ArrayList arrayList = new ArrayList();
            if (query.moveToFirst()) {
                do {
                    int i = query.getInt(query.getColumnIndexOrThrow("_id"));
                    String string = query.getString(query.getColumnIndexOrThrow(PublicResolver.FUNC_NAME));
                    String string2 = query.getString(query.getColumnIndexOrThrow(Address.TYPE_NAME));
                    int i2 = query.getInt(query.getColumnIndexOrThrow("tokenTypeChain"));
                    String string3 = query.getString(query.getColumnIndexOrThrow("profilePath"));
                    long j = query.getLong(query.getColumnIndexOrThrow("lastSent"));
                    long j2 = query.getLong(query.getColumnIndexOrThrow("contactCreate"));
                    vx2.m53590f(string, PublicResolver.FUNC_NAME);
                    vx2.m53590f(string2, Address.TYPE_NAME);
                    vx2.m53590f(string3, "profilePath");
                    arrayList.add(new RoomContact(i, string, string2, i2, string3, Long.valueOf(j), Long.valueOf(j2), ""));
                } while (query.moveToNext());
            }
            query.close();
            supportSQLiteDatabase2.execSQL("ALTER TABLE `table_contact` ADD COLUMN `linkId` TEXT NOT NULL DEFAULT ''");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : arrayList) {
                RoomContact roomContact = (RoomContact) next;
                String str = roomContact.getName() + " - " + roomContact.getAddress();
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((List) obj).add(next);
            }
            for (Map.Entry value : linkedHashMap.entrySet()) {
                String uuid = UUID.randomUUID().toString();
                vx2.m53590f(uuid, "randomUUID().toString()");
                for (RoomContact id : (Iterable) value.getValue()) {
                    supportSQLiteDatabase2.execSQL("UPDATE table_contact SET linkId = '" + uuid + "' where _id = " + id.getId());
                }
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$h", "Ltv3;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase$h */
    /* compiled from: MainRoomDatabase.kt */
    public static final class C8255h extends tv3 {
        public C8255h() {
            super(8, 9);
        }

        /* renamed from: a */
        public void mo10964a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("ALTER TABLE `table_wallet_connect` ADD COLUMN `version` INTEGER NOT NULL DEFAULT 1");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\b*\b\u000b\u000e\u0011\u0014\u0017\u001a\u001d \b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, mo44877d2 = {"Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$i;", "", "Landroid/content/Context;", "context", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase;", "b", "Lr37;", "a", "", "DB_NAME", "Ljava/lang/String;", "net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$a", "MIGRATION_1_2", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$a;", "net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$b", "MIGRATION_2_3", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$b;", "net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$c", "MIGRATION_3_4", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$c;", "net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$d", "MIGRATION_4_5", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$d;", "net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$e", "MIGRATION_5_6", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$e;", "net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$f", "MIGRATION_6_7", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$f;", "net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$g", "MIGRATION_7_8", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$g;", "net/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$h", "MIGRATION_8_9", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase$h;", "instance", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase$i */
    /* compiled from: MainRoomDatabase.kt */
    public static final class C8256i {
        public C8256i() {
        }

        public /* synthetic */ C8256i(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo57109a(Context context) {
            vx2.m53591g(context, "context");
            mo57110b(context).mo10120f();
        }

        /* renamed from: b */
        public final MainRoomDatabase mo57110b(Context context) {
            vx2.m53591g(context, "context");
            if (MainRoomDatabase.f41656y == null) {
                synchronized (this) {
                    if (MainRoomDatabase.f41656y == null) {
                        Context applicationContext = context.getApplicationContext();
                        vx2.m53590f(applicationContext, "context.applicationContext");
                        MainRoomDatabase.f41656y = ih5.m19629a(applicationContext, MainRoomDatabase.class, "mainSafeMoon").mo10144b(MainRoomDatabase.f41648q, MainRoomDatabase.f41649r, MainRoomDatabase.f41650s, MainRoomDatabase.f41651t, MainRoomDatabase.f41652u, MainRoomDatabase.f41653v, MainRoomDatabase.f41654w, MainRoomDatabase.f41655x).mo10146d();
                    }
                    r37 r37 = r37.f33317a;
                }
            }
            MainRoomDatabase E = MainRoomDatabase.f41656y;
            vx2.m53588d(E);
            return E;
        }
    }

    /* renamed from: O */
    public abstract lp0 mo57106O();

    /* renamed from: P */
    public abstract er0 mo57107P();

    /* renamed from: Q */
    public abstract ih7 mo57108Q();
}
