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
import net.safemoon.androidwallet.model.collectible.RoomCollection;
import net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft;
import net.safemoon.androidwallet.model.collectible.RoomNFT;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: fj0 */
/* compiled from: CollectionDao_Impl */
public final class fj0 implements ej0 {

    /* renamed from: a */
    public final RoomDatabase f37802a;

    /* renamed from: b */
    public final vq1<RoomCollection> f37803b;

    /* renamed from: c */
    public final uq1<RoomCollection> f37804c;

    /* renamed from: d */
    public final SharedSQLiteStatement f37805d;

    /* renamed from: e */
    public final SharedSQLiteStatement f37806e;

    /* renamed from: fj0$a */
    /* compiled from: CollectionDao_Impl */
    public class C7078a implements Callable<List<RoomCollectionAndNft>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f37807a;

        public C7078a(lh5 lh5) {
            this.f37807a = lh5;
        }

        /* renamed from: a */
        public List<RoomCollectionAndNft> call() throws Exception {
            Long l;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            int i;
            String str9;
            int i2;
            int i3;
            ArrayList arrayList;
            int i4;
            Cursor c = iz0.m19913c(fj0.this.f37802a, this.f37807a, true, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "chain");
                int e3 = px0.m25190e(c, "contractAddress");
                int e4 = px0.m25190e(c, "contract_type");
                int e5 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e6 = px0.m25190e(c, "description");
                int e7 = px0.m25190e(c, "imageUrl");
                int e8 = px0.m25190e(c, "symbol");
                int e9 = px0.m25190e(c, "marketPlace");
                int e10 = px0.m25190e(c, "slug");
                int e11 = px0.m25190e(c, "updatedTime");
                int e12 = px0.m25190e(c, "order");
                int e13 = px0.m25190e(c, "typeDeleteNft");
                int e14 = px0.m25190e(c, "fullData");
                hl3 hl3 = new hl3();
                while (c.moveToNext()) {
                    if (!c.isNull(e)) {
                        int i5 = e12;
                        int i6 = e13;
                        long j = c.getLong(e);
                        if (((ArrayList) hl3.mo21209h(j)) == null) {
                            i4 = e11;
                            hl3.mo21214o(j, new ArrayList());
                        } else {
                            i4 = e11;
                        }
                        e12 = i5;
                        e13 = i6;
                        e11 = i4;
                    }
                }
                int i7 = e11;
                int i8 = e12;
                int i9 = e13;
                c.moveToPosition(-1);
                fj0.this.mo51683m(hl3);
                ArrayList arrayList2 = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        l = null;
                    } else {
                        l = Long.valueOf(c.getLong(e));
                    }
                    int i10 = c.getInt(e2);
                    if (c.isNull(e3)) {
                        str = null;
                    } else {
                        str = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e6);
                    }
                    if (c.isNull(e7)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e7);
                    }
                    if (c.isNull(e8)) {
                        str6 = null;
                    } else {
                        str6 = c.getString(e8);
                    }
                    if (c.isNull(e9)) {
                        str7 = null;
                    } else {
                        str7 = c.getString(e9);
                    }
                    if (c.isNull(e10)) {
                        i = i7;
                        str8 = null;
                    } else {
                        str8 = c.getString(e10);
                        i = i7;
                    }
                    long j2 = c.getLong(i);
                    int i11 = i8;
                    int i12 = c.getInt(i11);
                    int i13 = i9;
                    int i14 = c.getInt(i13);
                    i9 = i13;
                    int i15 = e14;
                    if (c.isNull(i15)) {
                        e14 = i15;
                        str9 = null;
                    } else {
                        str9 = c.getString(i15);
                        e14 = i15;
                    }
                    RoomCollection roomCollection = new RoomCollection(l, i10, str, str2, str3, str4, str5, str6, str7, str8, j2, i12, i14, str9);
                    if (!c.isNull(e)) {
                        i3 = e3;
                        i2 = e4;
                        arrayList = (ArrayList) hl3.mo21209h(c.getLong(e));
                    } else {
                        i3 = e3;
                        i2 = e4;
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList2.add(new RoomCollectionAndNft(roomCollection, arrayList));
                    e3 = i3;
                    e4 = i2;
                    i7 = i;
                    i8 = i11;
                }
                return arrayList2;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f37807a.mo22765f();
        }
    }

    /* renamed from: fj0$b */
    /* compiled from: CollectionDao_Impl */
    public class C7079b implements Callable<List<RoomCollection>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f37809a;

        public C7079b(lh5 lh5) {
            this.f37809a = lh5;
        }

        /* renamed from: a */
        public List<RoomCollection> call() throws Exception {
            C7079b bVar;
            Long l;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            int i;
            Cursor c = iz0.m19913c(fj0.this.f37802a, this.f37809a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "chain");
                int e3 = px0.m25190e(c, "contractAddress");
                int e4 = px0.m25190e(c, "contract_type");
                int e5 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e6 = px0.m25190e(c, "description");
                int e7 = px0.m25190e(c, "imageUrl");
                int e8 = px0.m25190e(c, "symbol");
                int e9 = px0.m25190e(c, "marketPlace");
                int e10 = px0.m25190e(c, "slug");
                int e11 = px0.m25190e(c, "updatedTime");
                int e12 = px0.m25190e(c, "order");
                int e13 = px0.m25190e(c, "typeDeleteNft");
                try {
                    int e14 = px0.m25190e(c, "fullData");
                    ArrayList arrayList = new ArrayList(c.getCount());
                    while (c.moveToNext()) {
                        if (c.isNull(e)) {
                            l = null;
                        } else {
                            l = Long.valueOf(c.getLong(e));
                        }
                        int i2 = c.getInt(e2);
                        if (c.isNull(e3)) {
                            str = null;
                        } else {
                            str = c.getString(e3);
                        }
                        if (c.isNull(e4)) {
                            str2 = null;
                        } else {
                            str2 = c.getString(e4);
                        }
                        if (c.isNull(e5)) {
                            str3 = null;
                        } else {
                            str3 = c.getString(e5);
                        }
                        if (c.isNull(e6)) {
                            str4 = null;
                        } else {
                            str4 = c.getString(e6);
                        }
                        if (c.isNull(e7)) {
                            str5 = null;
                        } else {
                            str5 = c.getString(e7);
                        }
                        if (c.isNull(e8)) {
                            str6 = null;
                        } else {
                            str6 = c.getString(e8);
                        }
                        if (c.isNull(e9)) {
                            str7 = null;
                        } else {
                            str7 = c.getString(e9);
                        }
                        if (c.isNull(e10)) {
                            str8 = null;
                        } else {
                            str8 = c.getString(e10);
                        }
                        long j = c.getLong(e11);
                        int i3 = c.getInt(e12);
                        int i4 = c.getInt(e13);
                        int i5 = e14;
                        if (c.isNull(i5)) {
                            i = e;
                            str9 = null;
                        } else {
                            str9 = c.getString(i5);
                            i = e;
                        }
                        arrayList.add(new RoomCollection(l, i2, str, str2, str3, str4, str5, str6, str7, str8, j, i3, i4, str9));
                        e = i;
                        e14 = i5;
                    }
                    c.close();
                    this.f37809a.mo22765f();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    bVar = this;
                    c.close();
                    bVar.f37809a.mo22765f();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = this;
                c.close();
                bVar.f37809a.mo22765f();
                throw th;
            }
        }
    }

    /* renamed from: fj0$c */
    /* compiled from: CollectionDao_Impl */
    public class C7080c extends vq1<RoomCollection> {
        public C7080c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `table_room_collections` (`_id`,`chain`,`contractAddress`,`contract_type`,`name`,`description`,`imageUrl`,`symbol`,`marketPlace`,`slug`,`updatedTime`,`order`,`typeDeleteNft`,`fullData`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, RoomCollection roomCollection) {
            if (roomCollection.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, roomCollection.getId().longValue());
            }
            supportSQLiteStatement.bindLong(2, (long) roomCollection.getChain());
            if (roomCollection.getContractAddress() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, roomCollection.getContractAddress());
            }
            if (roomCollection.getContract_type() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, roomCollection.getContract_type());
            }
            if (roomCollection.getName() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, roomCollection.getName());
            }
            if (roomCollection.getDescription() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, roomCollection.getDescription());
            }
            if (roomCollection.getImageUrl() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, roomCollection.getImageUrl());
            }
            if (roomCollection.getSymbol() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, roomCollection.getSymbol());
            }
            if (roomCollection.getMarketPlace() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, roomCollection.getMarketPlace());
            }
            if (roomCollection.getSlug() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, roomCollection.getSlug());
            }
            supportSQLiteStatement.bindLong(11, roomCollection.getUpdatedTime());
            supportSQLiteStatement.bindLong(12, (long) roomCollection.getOrder());
            supportSQLiteStatement.bindLong(13, (long) roomCollection.getTypeDeleteNft());
            if (roomCollection.getFullData() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, roomCollection.getFullData());
            }
        }
    }

    /* renamed from: fj0$d */
    /* compiled from: CollectionDao_Impl */
    public class C7081d extends uq1<RoomCollection> {
        public C7081d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM `table_room_collections` WHERE `_id` = ?";
        }

        /* renamed from: k */
        public void mo26841i(SupportSQLiteStatement supportSQLiteStatement, RoomCollection roomCollection) {
            if (roomCollection.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, roomCollection.getId().longValue());
            }
        }
    }

    /* renamed from: fj0$e */
    /* compiled from: CollectionDao_Impl */
    public class C7082e extends SharedSQLiteStatement {
        public C7082e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_room_collections SET `order` = ? WHERE _id=?";
        }
    }

    /* renamed from: fj0$f */
    /* compiled from: CollectionDao_Impl */
    public class C7083f extends SharedSQLiteStatement {
        public C7083f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_room_collections SET `typeDeleteNft` = ? WHERE _id=?";
        }
    }

    /* renamed from: fj0$g */
    /* compiled from: CollectionDao_Impl */
    public class C7084g implements Callable<Long> {

        /* renamed from: a */
        public final /* synthetic */ RoomCollection f37815a;

        public C7084g(RoomCollection roomCollection) {
            this.f37815a = roomCollection;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            fj0.this.f37802a.mo10119e();
            try {
                long l = fj0.this.f37803b.mo27298l(this.f37815a);
                fj0.this.f37802a.mo10115C();
                return Long.valueOf(l);
            } finally {
                fj0.this.f37802a.mo10124j();
            }
        }
    }

    /* renamed from: fj0$h */
    /* compiled from: CollectionDao_Impl */
    public class C7085h implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ RoomCollection f37817a;

        public C7085h(RoomCollection roomCollection) {
            this.f37817a = roomCollection;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            fj0.this.f37802a.mo10119e();
            try {
                fj0.this.f37804c.mo26842j(this.f37817a);
                fj0.this.f37802a.mo10115C();
                return r37.f33317a;
            } finally {
                fj0.this.f37802a.mo10124j();
            }
        }
    }

    /* renamed from: fj0$i */
    /* compiled from: CollectionDao_Impl */
    public class C7086i implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ int f37819a;

        /* renamed from: d */
        public final /* synthetic */ long f37820d;

        public C7086i(int i, long j) {
            this.f37819a = i;
            this.f37820d = j;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = fj0.this.f37805d.mo10162b();
            b.bindLong(1, (long) this.f37819a);
            b.bindLong(2, this.f37820d);
            fj0.this.f37802a.mo10119e();
            try {
                b.executeUpdateDelete();
                fj0.this.f37802a.mo10115C();
                return r37.f33317a;
            } finally {
                fj0.this.f37802a.mo10124j();
                fj0.this.f37805d.mo10168h(b);
            }
        }
    }

    /* renamed from: fj0$j */
    /* compiled from: CollectionDao_Impl */
    public class C7087j implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ int f37822a;

        /* renamed from: d */
        public final /* synthetic */ long f37823d;

        public C7087j(int i, long j) {
            this.f37822a = i;
            this.f37823d = j;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = fj0.this.f37806e.mo10162b();
            b.bindLong(1, (long) this.f37822a);
            b.bindLong(2, this.f37823d);
            fj0.this.f37802a.mo10119e();
            try {
                b.executeUpdateDelete();
                fj0.this.f37802a.mo10115C();
                return r37.f33317a;
            } finally {
                fj0.this.f37802a.mo10124j();
                fj0.this.f37806e.mo10168h(b);
            }
        }
    }

    public fj0(RoomDatabase roomDatabase) {
        this.f37802a = roomDatabase;
        this.f37803b = new C7080c(roomDatabase);
        this.f37804c = new C7081d(roomDatabase);
        this.f37805d = new C7082e(roomDatabase);
        this.f37806e = new C7083f(roomDatabase);
    }

    /* renamed from: n */
    public static List<Class<?>> m57723n() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public Object mo51484a(long j, int i, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f37802a, true, new C7086i(i, j), ns0);
    }

    /* renamed from: b */
    public Object mo51485b(int i, ns0<? super List<RoomCollection>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_collections WHERE chain=? ORDER BY `order` ASC", 1);
        a.bindLong(1, (long) i);
        return CoroutinesRoom.m9773a(this.f37802a, false, iz0.m19911a(), new C7079b(a), ns0);
    }

    /* renamed from: c */
    public Object mo51486c(RoomCollection roomCollection, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f37802a, true, new C7085h(roomCollection), ns0);
    }

    /* renamed from: d */
    public Object mo51487d(long j, int i, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f37802a, true, new C7087j(i, j), ns0);
    }

    /* renamed from: e */
    public Object mo51488e(RoomCollection roomCollection, ns0<? super Long> ns0) {
        return CoroutinesRoom.m9774b(this.f37802a, true, new C7084g(roomCollection), ns0);
    }

    /* renamed from: f */
    public LiveData<List<RoomCollectionAndNft>> mo51489f(int i) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_collections WHERE chain=? ORDER BY `order` ASC", 1);
        a.bindLong(1, (long) i);
        return this.f37802a.mo10128n().mo20867d(new String[]{"table_room_nft", "table_room_collections"}, false, new C7078a(a));
    }

    /* renamed from: m */
    public final void mo51683m(hl3<ArrayList<RoomNFT>> hl3) {
        ArrayList h;
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        hl3<ArrayList<RoomNFT>> hl32 = hl3;
        if (!hl3.mo21212l()) {
            if (hl3.mo21219u() > 999) {
                hl3 hl33 = new hl3(999);
                int u = hl3.mo21219u();
                int i = 0;
                int i2 = 0;
                while (i < u) {
                    hl33.mo21214o(hl32.mo21213m(i), hl32.mo21220v(i));
                    i++;
                    i2++;
                    if (i2 == 999) {
                        mo51683m(hl33);
                        hl33 = new hl3(999);
                        i2 = 0;
                    }
                }
                if (i2 > 0) {
                    mo51683m(hl33);
                    return;
                }
                return;
            }
            StringBuilder b = ib6.m19545b();
            b.append("SELECT `_id`,`chain`,`collectionId`,`token_id`,`name`,`description`,`animation_url`,`image_preview_url`,`image_data`,`token_uri`,`attributes`,`fullData`,`permalink`,`openSeaUrl`,`updatedTime`,`order` FROM `table_room_nft` WHERE `collectionId` IN (");
            int u2 = hl3.mo21219u();
            ib6.m19544a(b, u2);
            b.append(")");
            lh5 a = lh5.m21448a(b.toString(), u2 + 0);
            int i3 = 1;
            for (int i4 = 0; i4 < hl3.mo21219u(); i4++) {
                a.bindLong(i3, hl32.mo21213m(i4));
                i3++;
            }
            Cursor c = iz0.m19913c(this.f37802a, a, false, (CancellationSignal) null);
            try {
                int d = px0.m25189d(c, "collectionId");
                if (d != -1) {
                    while (c.moveToNext()) {
                        if (!c.isNull(d) && (h = hl32.mo21209h(c.getLong(d))) != null) {
                            if (c.isNull(0)) {
                                l = null;
                            } else {
                                l = Long.valueOf(c.getLong(0));
                            }
                            int i5 = c.getInt(1);
                            long j = c.getLong(2);
                            if (c.isNull(3)) {
                                str = null;
                            } else {
                                str = c.getString(3);
                            }
                            if (c.isNull(4)) {
                                str2 = null;
                            } else {
                                str2 = c.getString(4);
                            }
                            if (c.isNull(5)) {
                                str3 = null;
                            } else {
                                str3 = c.getString(5);
                            }
                            if (c.isNull(6)) {
                                str4 = null;
                            } else {
                                str4 = c.getString(6);
                            }
                            if (c.isNull(7)) {
                                str5 = null;
                            } else {
                                str5 = c.getString(7);
                            }
                            if (c.isNull(8)) {
                                str6 = null;
                            } else {
                                str6 = c.getString(8);
                            }
                            if (c.isNull(9)) {
                                str7 = null;
                            } else {
                                str7 = c.getString(9);
                            }
                            if (c.isNull(10)) {
                                str8 = null;
                            } else {
                                str8 = c.getString(10);
                            }
                            if (c.isNull(11)) {
                                str9 = null;
                            } else {
                                str9 = c.getString(11);
                            }
                            if (c.isNull(12)) {
                                str10 = null;
                            } else {
                                str10 = c.getString(12);
                            }
                            if (c.isNull(13)) {
                                str11 = null;
                            } else {
                                str11 = c.getString(13);
                            }
                            h.add(new RoomNFT(l, i5, j, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, c.getLong(14), c.getInt(15)));
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
