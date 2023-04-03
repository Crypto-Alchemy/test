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
import net.safemoon.androidwallet.model.collectible.RoomNFT;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: p64 */
/* compiled from: NftDao_Impl */
public final class p64 implements o64 {

    /* renamed from: a */
    public final RoomDatabase f43986a;

    /* renamed from: b */
    public final vq1<RoomNFT> f43987b;

    /* renamed from: c */
    public final uq1<RoomNFT> f43988c;

    /* renamed from: d */
    public final SharedSQLiteStatement f43989d;

    /* renamed from: e */
    public final SharedSQLiteStatement f43990e;

    /* renamed from: p64$a */
    /* compiled from: NftDao_Impl */
    public class C9159a implements Callable<List<RoomNFT>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f43991a;

        public C9159a(lh5 lh5) {
            this.f43991a = lh5;
        }

        /* renamed from: a */
        public List<RoomNFT> call() throws Exception {
            C9159a aVar;
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
            int i;
            String string;
            Cursor c = iz0.m19913c(p64.this.f43986a, this.f43991a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "chain");
                int e3 = px0.m25190e(c, "collectionId");
                int e4 = px0.m25190e(c, "token_id");
                int e5 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e6 = px0.m25190e(c, "description");
                int e7 = px0.m25190e(c, "animation_url");
                int e8 = px0.m25190e(c, "image_preview_url");
                int e9 = px0.m25190e(c, "image_data");
                int e10 = px0.m25190e(c, "token_uri");
                int e11 = px0.m25190e(c, "attributes");
                int e12 = px0.m25190e(c, "fullData");
                int e13 = px0.m25190e(c, "permalink");
                int e14 = px0.m25190e(c, "openSeaUrl");
                try {
                    int e15 = px0.m25190e(c, "updatedTime");
                    int e16 = px0.m25190e(c, "order");
                    int i2 = e14;
                    ArrayList arrayList = new ArrayList(c.getCount());
                    while (c.moveToNext()) {
                        if (c.isNull(e)) {
                            l = null;
                        } else {
                            l = Long.valueOf(c.getLong(e));
                        }
                        int i3 = c.getInt(e2);
                        long j = c.getLong(e3);
                        if (c.isNull(e4)) {
                            str = null;
                        } else {
                            str = c.getString(e4);
                        }
                        if (c.isNull(e5)) {
                            str2 = null;
                        } else {
                            str2 = c.getString(e5);
                        }
                        if (c.isNull(e6)) {
                            str3 = null;
                        } else {
                            str3 = c.getString(e6);
                        }
                        if (c.isNull(e7)) {
                            str4 = null;
                        } else {
                            str4 = c.getString(e7);
                        }
                        if (c.isNull(e8)) {
                            str5 = null;
                        } else {
                            str5 = c.getString(e8);
                        }
                        if (c.isNull(e9)) {
                            str6 = null;
                        } else {
                            str6 = c.getString(e9);
                        }
                        if (c.isNull(e10)) {
                            str7 = null;
                        } else {
                            str7 = c.getString(e10);
                        }
                        if (c.isNull(e11)) {
                            str8 = null;
                        } else {
                            str8 = c.getString(e11);
                        }
                        if (c.isNull(e12)) {
                            str9 = null;
                        } else {
                            str9 = c.getString(e12);
                        }
                        if (c.isNull(e13)) {
                            i = i2;
                            str10 = null;
                        } else {
                            str10 = c.getString(e13);
                            i = i2;
                        }
                        if (c.isNull(i)) {
                            string = null;
                        } else {
                            string = c.getString(i);
                        }
                        int i4 = e15;
                        int i5 = e;
                        int i6 = i4;
                        long j2 = c.getLong(i6);
                        int i7 = i6;
                        int i8 = e16;
                        e16 = i8;
                        arrayList.add(new RoomNFT(l, i3, j, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, string, j2, c.getInt(i8)));
                        e = i5;
                        e15 = i7;
                        i2 = i;
                    }
                    c.close();
                    this.f43991a.mo22765f();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    aVar = this;
                    c.close();
                    aVar.f43991a.mo22765f();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                aVar = this;
                c.close();
                aVar.f43991a.mo22765f();
                throw th;
            }
        }
    }

    /* renamed from: p64$b */
    /* compiled from: NftDao_Impl */
    public class C9160b implements Callable<List<RoomNFT>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f43993a;

        public C9160b(lh5 lh5) {
            this.f43993a = lh5;
        }

        /* renamed from: a */
        public List<RoomNFT> call() throws Exception {
            C9160b bVar;
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
            int i;
            String string;
            Cursor c = iz0.m19913c(p64.this.f43986a, this.f43993a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "chain");
                int e3 = px0.m25190e(c, "collectionId");
                int e4 = px0.m25190e(c, "token_id");
                int e5 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e6 = px0.m25190e(c, "description");
                int e7 = px0.m25190e(c, "animation_url");
                int e8 = px0.m25190e(c, "image_preview_url");
                int e9 = px0.m25190e(c, "image_data");
                int e10 = px0.m25190e(c, "token_uri");
                int e11 = px0.m25190e(c, "attributes");
                int e12 = px0.m25190e(c, "fullData");
                int e13 = px0.m25190e(c, "permalink");
                int e14 = px0.m25190e(c, "openSeaUrl");
                try {
                    int e15 = px0.m25190e(c, "updatedTime");
                    int e16 = px0.m25190e(c, "order");
                    int i2 = e14;
                    ArrayList arrayList = new ArrayList(c.getCount());
                    while (c.moveToNext()) {
                        if (c.isNull(e)) {
                            l = null;
                        } else {
                            l = Long.valueOf(c.getLong(e));
                        }
                        int i3 = c.getInt(e2);
                        long j = c.getLong(e3);
                        if (c.isNull(e4)) {
                            str = null;
                        } else {
                            str = c.getString(e4);
                        }
                        if (c.isNull(e5)) {
                            str2 = null;
                        } else {
                            str2 = c.getString(e5);
                        }
                        if (c.isNull(e6)) {
                            str3 = null;
                        } else {
                            str3 = c.getString(e6);
                        }
                        if (c.isNull(e7)) {
                            str4 = null;
                        } else {
                            str4 = c.getString(e7);
                        }
                        if (c.isNull(e8)) {
                            str5 = null;
                        } else {
                            str5 = c.getString(e8);
                        }
                        if (c.isNull(e9)) {
                            str6 = null;
                        } else {
                            str6 = c.getString(e9);
                        }
                        if (c.isNull(e10)) {
                            str7 = null;
                        } else {
                            str7 = c.getString(e10);
                        }
                        if (c.isNull(e11)) {
                            str8 = null;
                        } else {
                            str8 = c.getString(e11);
                        }
                        if (c.isNull(e12)) {
                            str9 = null;
                        } else {
                            str9 = c.getString(e12);
                        }
                        if (c.isNull(e13)) {
                            i = i2;
                            str10 = null;
                        } else {
                            str10 = c.getString(e13);
                            i = i2;
                        }
                        if (c.isNull(i)) {
                            string = null;
                        } else {
                            string = c.getString(i);
                        }
                        int i4 = e15;
                        int i5 = e;
                        int i6 = i4;
                        long j2 = c.getLong(i6);
                        int i7 = i6;
                        int i8 = e16;
                        e16 = i8;
                        arrayList.add(new RoomNFT(l, i3, j, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, string, j2, c.getInt(i8)));
                        e = i5;
                        e15 = i7;
                        i2 = i;
                    }
                    c.close();
                    this.f43993a.mo22765f();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    bVar = this;
                    c.close();
                    bVar.f43993a.mo22765f();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = this;
                c.close();
                bVar.f43993a.mo22765f();
                throw th;
            }
        }
    }

    /* renamed from: p64$c */
    /* compiled from: NftDao_Impl */
    public class C9161c implements Callable<RoomNFT> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f43995a;

        public C9161c(lh5 lh5) {
            this.f43995a = lh5;
        }

        /* renamed from: a */
        public RoomNFT call() throws Exception {
            RoomNFT roomNFT;
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
            int i;
            C9161c cVar = this;
            Cursor c = iz0.m19913c(p64.this.f43986a, cVar.f43995a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "chain");
                int e3 = px0.m25190e(c, "collectionId");
                int e4 = px0.m25190e(c, "token_id");
                int e5 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e6 = px0.m25190e(c, "description");
                int e7 = px0.m25190e(c, "animation_url");
                int e8 = px0.m25190e(c, "image_preview_url");
                int e9 = px0.m25190e(c, "image_data");
                int e10 = px0.m25190e(c, "token_uri");
                int e11 = px0.m25190e(c, "attributes");
                int e12 = px0.m25190e(c, "fullData");
                int e13 = px0.m25190e(c, "permalink");
                int e14 = px0.m25190e(c, "openSeaUrl");
                try {
                    int e15 = px0.m25190e(c, "updatedTime");
                    int e16 = px0.m25190e(c, "order");
                    if (c.moveToFirst()) {
                        if (c.isNull(e)) {
                            l = null;
                        } else {
                            l = Long.valueOf(c.getLong(e));
                        }
                        int i2 = c.getInt(e2);
                        long j = c.getLong(e3);
                        if (c.isNull(e4)) {
                            str = null;
                        } else {
                            str = c.getString(e4);
                        }
                        if (c.isNull(e5)) {
                            str2 = null;
                        } else {
                            str2 = c.getString(e5);
                        }
                        if (c.isNull(e6)) {
                            str3 = null;
                        } else {
                            str3 = c.getString(e6);
                        }
                        if (c.isNull(e7)) {
                            str4 = null;
                        } else {
                            str4 = c.getString(e7);
                        }
                        if (c.isNull(e8)) {
                            str5 = null;
                        } else {
                            str5 = c.getString(e8);
                        }
                        if (c.isNull(e9)) {
                            str6 = null;
                        } else {
                            str6 = c.getString(e9);
                        }
                        if (c.isNull(e10)) {
                            str7 = null;
                        } else {
                            str7 = c.getString(e10);
                        }
                        if (c.isNull(e11)) {
                            str8 = null;
                        } else {
                            str8 = c.getString(e11);
                        }
                        if (c.isNull(e12)) {
                            str9 = null;
                        } else {
                            str9 = c.getString(e12);
                        }
                        if (c.isNull(e13)) {
                            str10 = null;
                        } else {
                            str10 = c.getString(e13);
                        }
                        if (c.isNull(e14)) {
                            i = e15;
                            str11 = null;
                        } else {
                            str11 = c.getString(e14);
                            i = e15;
                        }
                        roomNFT = new RoomNFT(l, i2, j, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, c.getLong(i), c.getInt(e16));
                    } else {
                        roomNFT = null;
                    }
                    c.close();
                    this.f43995a.mo22765f();
                    return roomNFT;
                } catch (Throwable th) {
                    th = th;
                    cVar = this;
                    c.close();
                    cVar.f43995a.mo22765f();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c.close();
                cVar.f43995a.mo22765f();
                throw th;
            }
        }
    }

    /* renamed from: p64$d */
    /* compiled from: NftDao_Impl */
    public class C9162d implements Callable<RoomNFT> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f43997a;

        public C9162d(lh5 lh5) {
            this.f43997a = lh5;
        }

        /* renamed from: a */
        public RoomNFT call() throws Exception {
            RoomNFT roomNFT;
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
            int i;
            C9162d dVar = this;
            Cursor c = iz0.m19913c(p64.this.f43986a, dVar.f43997a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "chain");
                int e3 = px0.m25190e(c, "collectionId");
                int e4 = px0.m25190e(c, "token_id");
                int e5 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e6 = px0.m25190e(c, "description");
                int e7 = px0.m25190e(c, "animation_url");
                int e8 = px0.m25190e(c, "image_preview_url");
                int e9 = px0.m25190e(c, "image_data");
                int e10 = px0.m25190e(c, "token_uri");
                int e11 = px0.m25190e(c, "attributes");
                int e12 = px0.m25190e(c, "fullData");
                int e13 = px0.m25190e(c, "permalink");
                int e14 = px0.m25190e(c, "openSeaUrl");
                try {
                    int e15 = px0.m25190e(c, "updatedTime");
                    int e16 = px0.m25190e(c, "order");
                    if (c.moveToFirst()) {
                        if (c.isNull(e)) {
                            l = null;
                        } else {
                            l = Long.valueOf(c.getLong(e));
                        }
                        int i2 = c.getInt(e2);
                        long j = c.getLong(e3);
                        if (c.isNull(e4)) {
                            str = null;
                        } else {
                            str = c.getString(e4);
                        }
                        if (c.isNull(e5)) {
                            str2 = null;
                        } else {
                            str2 = c.getString(e5);
                        }
                        if (c.isNull(e6)) {
                            str3 = null;
                        } else {
                            str3 = c.getString(e6);
                        }
                        if (c.isNull(e7)) {
                            str4 = null;
                        } else {
                            str4 = c.getString(e7);
                        }
                        if (c.isNull(e8)) {
                            str5 = null;
                        } else {
                            str5 = c.getString(e8);
                        }
                        if (c.isNull(e9)) {
                            str6 = null;
                        } else {
                            str6 = c.getString(e9);
                        }
                        if (c.isNull(e10)) {
                            str7 = null;
                        } else {
                            str7 = c.getString(e10);
                        }
                        if (c.isNull(e11)) {
                            str8 = null;
                        } else {
                            str8 = c.getString(e11);
                        }
                        if (c.isNull(e12)) {
                            str9 = null;
                        } else {
                            str9 = c.getString(e12);
                        }
                        if (c.isNull(e13)) {
                            str10 = null;
                        } else {
                            str10 = c.getString(e13);
                        }
                        if (c.isNull(e14)) {
                            i = e15;
                            str11 = null;
                        } else {
                            str11 = c.getString(e14);
                            i = e15;
                        }
                        roomNFT = new RoomNFT(l, i2, j, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, c.getLong(i), c.getInt(e16));
                    } else {
                        roomNFT = null;
                    }
                    c.close();
                    this.f43997a.mo22765f();
                    return roomNFT;
                } catch (Throwable th) {
                    th = th;
                    dVar = this;
                    c.close();
                    dVar.f43997a.mo22765f();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c.close();
                dVar.f43997a.mo22765f();
                throw th;
            }
        }
    }

    /* renamed from: p64$e */
    /* compiled from: NftDao_Impl */
    public class C9163e implements Callable<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f43999a;

        public C9163e(lh5 lh5) {
            this.f43999a = lh5;
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            Integer num;
            boolean z = false;
            Boolean bool = null;
            Cursor c = iz0.m19913c(p64.this.f43986a, this.f43999a, false, (CancellationSignal) null);
            try {
                if (c.moveToFirst()) {
                    if (c.isNull(0)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(c.getInt(0));
                    }
                    if (num != null) {
                        if (num.intValue() != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    }
                }
                return bool;
            } finally {
                c.close();
                this.f43999a.mo22765f();
            }
        }
    }

    /* renamed from: p64$f */
    /* compiled from: NftDao_Impl */
    public class C9164f extends vq1<RoomNFT> {
        public C9164f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `table_room_nft` (`_id`,`chain`,`collectionId`,`token_id`,`name`,`description`,`animation_url`,`image_preview_url`,`image_data`,`token_uri`,`attributes`,`fullData`,`permalink`,`openSeaUrl`,`updatedTime`,`order`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, RoomNFT roomNFT) {
            if (roomNFT.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, roomNFT.getId().longValue());
            }
            supportSQLiteStatement.bindLong(2, (long) roomNFT.getChain());
            supportSQLiteStatement.bindLong(3, roomNFT.getCollectionId());
            if (roomNFT.getToken_id() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, roomNFT.getToken_id());
            }
            if (roomNFT.getName() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, roomNFT.getName());
            }
            if (roomNFT.getDescription() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, roomNFT.getDescription());
            }
            if (roomNFT.getAnimation_url() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, roomNFT.getAnimation_url());
            }
            if (roomNFT.getImage_preview_url() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, roomNFT.getImage_preview_url());
            }
            if (roomNFT.getImage_data() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, roomNFT.getImage_data());
            }
            if (roomNFT.getToken_uri() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, roomNFT.getToken_uri());
            }
            if (roomNFT.getAttributes() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, roomNFT.getAttributes());
            }
            if (roomNFT.getFullData() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, roomNFT.getFullData());
            }
            if (roomNFT.getPermalink() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, roomNFT.getPermalink());
            }
            if (roomNFT.getOpenSeaUrl() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, roomNFT.getOpenSeaUrl());
            }
            supportSQLiteStatement.bindLong(15, roomNFT.getUpdatedTime());
            supportSQLiteStatement.bindLong(16, (long) roomNFT.getOrder());
        }
    }

    /* renamed from: p64$g */
    /* compiled from: NftDao_Impl */
    public class C9165g extends uq1<RoomNFT> {
        public C9165g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM `table_room_nft` WHERE `_id` = ?";
        }

        /* renamed from: k */
        public void mo26841i(SupportSQLiteStatement supportSQLiteStatement, RoomNFT roomNFT) {
            if (roomNFT.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, roomNFT.getId().longValue());
            }
        }
    }

    /* renamed from: p64$h */
    /* compiled from: NftDao_Impl */
    public class C9166h extends SharedSQLiteStatement {
        public C9166h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_room_nft SET `order` = ? WHERE _id=?";
        }
    }

    /* renamed from: p64$i */
    /* compiled from: NftDao_Impl */
    public class C9167i extends SharedSQLiteStatement {
        public C9167i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM table_room_nft WHERE collectionId=?";
        }
    }

    /* renamed from: p64$j */
    /* compiled from: NftDao_Impl */
    public class C9168j implements Callable<Long> {

        /* renamed from: a */
        public final /* synthetic */ RoomNFT f44005a;

        public C9168j(RoomNFT roomNFT) {
            this.f44005a = roomNFT;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            p64.this.f43986a.mo10119e();
            try {
                long l = p64.this.f43987b.mo27298l(this.f44005a);
                p64.this.f43986a.mo10115C();
                return Long.valueOf(l);
            } finally {
                p64.this.f43986a.mo10124j();
            }
        }
    }

    /* renamed from: p64$k */
    /* compiled from: NftDao_Impl */
    public class C9169k implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ RoomNFT f44007a;

        public C9169k(RoomNFT roomNFT) {
            this.f44007a = roomNFT;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            p64.this.f43986a.mo10119e();
            try {
                p64.this.f43988c.mo26842j(this.f44007a);
                p64.this.f43986a.mo10115C();
                return r37.f33317a;
            } finally {
                p64.this.f43986a.mo10124j();
            }
        }
    }

    /* renamed from: p64$l */
    /* compiled from: NftDao_Impl */
    public class C9170l implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ int f44009a;

        /* renamed from: d */
        public final /* synthetic */ long f44010d;

        public C9170l(int i, long j) {
            this.f44009a = i;
            this.f44010d = j;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = p64.this.f43989d.mo10162b();
            b.bindLong(1, (long) this.f44009a);
            b.bindLong(2, this.f44010d);
            p64.this.f43986a.mo10119e();
            try {
                b.executeUpdateDelete();
                p64.this.f43986a.mo10115C();
                return r37.f33317a;
            } finally {
                p64.this.f43986a.mo10124j();
                p64.this.f43989d.mo10168h(b);
            }
        }
    }

    /* renamed from: p64$m */
    /* compiled from: NftDao_Impl */
    public class C9171m implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ long f44012a;

        public C9171m(long j) {
            this.f44012a = j;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = p64.this.f43990e.mo10162b();
            b.bindLong(1, this.f44012a);
            p64.this.f43986a.mo10119e();
            try {
                b.executeUpdateDelete();
                p64.this.f43986a.mo10115C();
                return r37.f33317a;
            } finally {
                p64.this.f43986a.mo10124j();
                p64.this.f43990e.mo10168h(b);
            }
        }
    }

    /* renamed from: p64$n */
    /* compiled from: NftDao_Impl */
    public class C9172n implements Callable<List<RoomNFT>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f44014a;

        public C9172n(lh5 lh5) {
            this.f44014a = lh5;
        }

        /* renamed from: a */
        public List<RoomNFT> call() throws Exception {
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
            int i;
            String string;
            Cursor c = iz0.m19913c(p64.this.f43986a, this.f44014a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "chain");
                int e3 = px0.m25190e(c, "collectionId");
                int e4 = px0.m25190e(c, "token_id");
                int e5 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e6 = px0.m25190e(c, "description");
                int e7 = px0.m25190e(c, "animation_url");
                int e8 = px0.m25190e(c, "image_preview_url");
                int e9 = px0.m25190e(c, "image_data");
                int e10 = px0.m25190e(c, "token_uri");
                int e11 = px0.m25190e(c, "attributes");
                int e12 = px0.m25190e(c, "fullData");
                int e13 = px0.m25190e(c, "permalink");
                int e14 = px0.m25190e(c, "openSeaUrl");
                int e15 = px0.m25190e(c, "updatedTime");
                int e16 = px0.m25190e(c, "order");
                int i2 = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        l = null;
                    } else {
                        l = Long.valueOf(c.getLong(e));
                    }
                    int i3 = c.getInt(e2);
                    long j = c.getLong(e3);
                    if (c.isNull(e4)) {
                        str = null;
                    } else {
                        str = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e6);
                    }
                    if (c.isNull(e7)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e7);
                    }
                    if (c.isNull(e8)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e8);
                    }
                    if (c.isNull(e9)) {
                        str6 = null;
                    } else {
                        str6 = c.getString(e9);
                    }
                    if (c.isNull(e10)) {
                        str7 = null;
                    } else {
                        str7 = c.getString(e10);
                    }
                    if (c.isNull(e11)) {
                        str8 = null;
                    } else {
                        str8 = c.getString(e11);
                    }
                    if (c.isNull(e12)) {
                        str9 = null;
                    } else {
                        str9 = c.getString(e12);
                    }
                    if (c.isNull(e13)) {
                        i = i2;
                        str10 = null;
                    } else {
                        str10 = c.getString(e13);
                        i = i2;
                    }
                    if (c.isNull(i)) {
                        string = null;
                    } else {
                        string = c.getString(i);
                    }
                    int i4 = e15;
                    int i5 = e;
                    int i6 = i4;
                    long j2 = c.getLong(i6);
                    int i7 = i6;
                    int i8 = e16;
                    e16 = i8;
                    arrayList.add(new RoomNFT(l, i3, j, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, string, j2, c.getInt(i8)));
                    e = i5;
                    e15 = i7;
                    i2 = i;
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f44014a.mo22765f();
        }
    }

    public p64(RoomDatabase roomDatabase) {
        this.f43986a = roomDatabase;
        this.f43987b = new C9164f(roomDatabase);
        this.f43988c = new C9165g(roomDatabase);
        this.f43989d = new C9166h(roomDatabase);
        this.f43990e = new C9167i(roomDatabase);
    }

    /* renamed from: p */
    public static List<Class<?>> m70932p() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public Object mo62837a(long j, int i, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f43986a, true, new C9170l(i, j), ns0);
    }

    /* renamed from: b */
    public Object mo62838b(RoomNFT roomNFT, ns0<? super Long> ns0) {
        return CoroutinesRoom.m9774b(this.f43986a, true, new C9168j(roomNFT), ns0);
    }

    /* renamed from: c */
    public Object mo62839c(long j, ns0<? super RoomNFT> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_nft WHERE _id=?", 1);
        a.bindLong(1, j);
        return CoroutinesRoom.m9773a(this.f43986a, false, iz0.m19911a(), new C9162d(a), ns0);
    }

    /* renamed from: d */
    public LiveData<List<RoomNFT>> mo62840d(long j) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_nft WHERE collectionId=? ORDER BY `order` ASC", 1);
        a.bindLong(1, j);
        return this.f43986a.mo10128n().mo20867d(new String[]{"table_room_nft"}, false, new C9172n(a));
    }

    /* renamed from: e */
    public Object mo62841e(String str, long j, ns0<? super Boolean> ns0) {
        lh5 a = lh5.m21448a("SELECT EXISTS (SELECT 1 FROM table_room_nft WHERE token_id=? AND collectionId=?)", 2);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        a.bindLong(2, j);
        return CoroutinesRoom.m9773a(this.f43986a, false, iz0.m19911a(), new C9163e(a), ns0);
    }

    /* renamed from: f */
    public Object mo62842f(long j, ns0<? super List<RoomNFT>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_nft WHERE collectionId=? ORDER BY `order` ASC", 1);
        a.bindLong(1, j);
        return CoroutinesRoom.m9773a(this.f43986a, false, iz0.m19911a(), new C9159a(a), ns0);
    }

    /* renamed from: g */
    public Object mo62843g(long j, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f43986a, true, new C9171m(j), ns0);
    }

    /* renamed from: h */
    public Object mo62844h(RoomNFT roomNFT, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f43986a, true, new C9169k(roomNFT), ns0);
    }

    /* renamed from: i */
    public Object mo62845i(String str, long j, ns0<? super RoomNFT> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_nft WHERE token_id=? AND collectionId=?", 2);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        a.bindLong(2, j);
        return CoroutinesRoom.m9773a(this.f43986a, false, iz0.m19911a(), new C9161c(a), ns0);
    }

    /* renamed from: j */
    public Object mo62846j(int i, ns0<? super List<RoomNFT>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_nft WHERE chain=? ORDER BY `order` ASC", 1);
        a.bindLong(1, (long) i);
        return CoroutinesRoom.m9773a(this.f43986a, false, iz0.m19911a(), new C9160b(a), ns0);
    }
}
