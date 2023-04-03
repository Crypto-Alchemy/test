package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import net.safemoon.androidwallet.model.token.room.RoomCustomToken;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: wy0 */
/* compiled from: CustomTokenDao_Impl */
public final class wy0 implements vy0 {

    /* renamed from: a */
    public final RoomDatabase f45776a;

    /* renamed from: b */
    public final vq1<RoomCustomToken> f45777b;

    /* renamed from: c */
    public final SharedSQLiteStatement f45778c;

    /* renamed from: d */
    public final SharedSQLiteStatement f45779d;

    /* renamed from: wy0$a */
    /* compiled from: CustomTokenDao_Impl */
    public class C9563a implements Callable<List<RoomCustomToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f45780a;

        public C9563a(lh5 lh5) {
            this.f45780a = lh5;
        }

        /* renamed from: a */
        public List<RoomCustomToken> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z;
            Cursor c = iz0.m19913c(wy0.this.f45776a, this.f45780a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "symbolWithType");
                int e2 = px0.m25190e(c, "symbol");
                int e3 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e4 = px0.m25190e(c, "iconPath");
                int e5 = px0.m25190e(c, "contractorAddress");
                int e6 = px0.m25190e(c, "tokenTypeChain");
                int e7 = px0.m25190e(c, "decimals");
                int e8 = px0.m25190e(c, "allowSwap");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "priceInUsdt");
                int e11 = px0.m25190e(c, "percentChange1h");
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
                        str3 = null;
                    } else {
                        str3 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e5);
                    }
                    int i = c.getInt(e6);
                    int i2 = c.getInt(e7);
                    if (c.getInt(e8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new RoomCustomToken(str, str2, str3, str4, str5, i, i2, z, c.getDouble(e9), c.getDouble(e10), c.getDouble(e11)));
                }
                return arrayList;
            } finally {
                c.close();
                this.f45780a.mo22765f();
            }
        }
    }

    /* renamed from: wy0$b */
    /* compiled from: CustomTokenDao_Impl */
    public class C9564b implements Callable<RoomCustomToken> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f45782a;

        public C9564b(lh5 lh5) {
            this.f45782a = lh5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: net.safemoon.androidwallet.model.token.room.RoomCustomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: net.safemoon.androidwallet.model.token.room.RoomCustomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: net.safemoon.androidwallet.model.token.room.RoomCustomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: net.safemoon.androidwallet.model.token.room.RoomCustomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: net.safemoon.androidwallet.model.token.room.RoomCustomToken} */
        /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public net.safemoon.androidwallet.model.token.room.RoomCustomToken call() throws java.lang.Exception {
            /*
                r30 = this;
                r1 = r30
                wy0 r0 = p000.wy0.this
                androidx.room.RoomDatabase r0 = r0.f45776a
                lh5 r2 = r1.f45782a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = p000.iz0.m19913c(r0, r2, r3, r4)
                java.lang.String r0 = "symbolWithType"
                int r0 = p000.px0.m25190e(r2, r0)     // Catch:{ all -> 0x00ce }
                java.lang.String r5 = "symbol"
                int r5 = p000.px0.m25190e(r2, r5)     // Catch:{ all -> 0x00ce }
                java.lang.String r6 = "name"
                int r6 = p000.px0.m25190e(r2, r6)     // Catch:{ all -> 0x00ce }
                java.lang.String r7 = "iconPath"
                int r7 = p000.px0.m25190e(r2, r7)     // Catch:{ all -> 0x00ce }
                java.lang.String r8 = "contractorAddress"
                int r8 = p000.px0.m25190e(r2, r8)     // Catch:{ all -> 0x00ce }
                java.lang.String r9 = "tokenTypeChain"
                int r9 = p000.px0.m25190e(r2, r9)     // Catch:{ all -> 0x00ce }
                java.lang.String r10 = "decimals"
                int r10 = p000.px0.m25190e(r2, r10)     // Catch:{ all -> 0x00ce }
                java.lang.String r11 = "allowSwap"
                int r11 = p000.px0.m25190e(r2, r11)     // Catch:{ all -> 0x00ce }
                java.lang.String r12 = "nativeBalance"
                int r12 = p000.px0.m25190e(r2, r12)     // Catch:{ all -> 0x00ce }
                java.lang.String r13 = "priceInUsdt"
                int r13 = p000.px0.m25190e(r2, r13)     // Catch:{ all -> 0x00ce }
                java.lang.String r14 = "percentChange1h"
                int r14 = p000.px0.m25190e(r2, r14)     // Catch:{ all -> 0x00ce }
                boolean r15 = r2.moveToFirst()     // Catch:{ all -> 0x00ce }
                if (r15 == 0) goto L_0x00c5
                boolean r15 = r2.isNull(r0)     // Catch:{ all -> 0x00ce }
                if (r15 == 0) goto L_0x0061
                r16 = r4
                goto L_0x0067
            L_0x0061:
                java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00ce }
                r16 = r0
            L_0x0067:
                boolean r0 = r2.isNull(r5)     // Catch:{ all -> 0x00ce }
                if (r0 == 0) goto L_0x0070
                r17 = r4
                goto L_0x0076
            L_0x0070:
                java.lang.String r0 = r2.getString(r5)     // Catch:{ all -> 0x00ce }
                r17 = r0
            L_0x0076:
                boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x00ce }
                if (r0 == 0) goto L_0x007f
                r18 = r4
                goto L_0x0085
            L_0x007f:
                java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x00ce }
                r18 = r0
            L_0x0085:
                boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x00ce }
                if (r0 == 0) goto L_0x008e
                r19 = r4
                goto L_0x0094
            L_0x008e:
                java.lang.String r0 = r2.getString(r7)     // Catch:{ all -> 0x00ce }
                r19 = r0
            L_0x0094:
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x00ce }
                if (r0 == 0) goto L_0x009d
            L_0x009a:
                r20 = r4
                goto L_0x00a2
            L_0x009d:
                java.lang.String r4 = r2.getString(r8)     // Catch:{ all -> 0x00ce }
                goto L_0x009a
            L_0x00a2:
                int r21 = r2.getInt(r9)     // Catch:{ all -> 0x00ce }
                int r22 = r2.getInt(r10)     // Catch:{ all -> 0x00ce }
                int r0 = r2.getInt(r11)     // Catch:{ all -> 0x00ce }
                if (r0 == 0) goto L_0x00b1
                r3 = 1
            L_0x00b1:
                r23 = r3
                double r24 = r2.getDouble(r12)     // Catch:{ all -> 0x00ce }
                double r26 = r2.getDouble(r13)     // Catch:{ all -> 0x00ce }
                double r28 = r2.getDouble(r14)     // Catch:{ all -> 0x00ce }
                net.safemoon.androidwallet.model.token.room.RoomCustomToken r4 = new net.safemoon.androidwallet.model.token.room.RoomCustomToken     // Catch:{ all -> 0x00ce }
                r15 = r4
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28)     // Catch:{ all -> 0x00ce }
            L_0x00c5:
                r2.close()
                lh5 r0 = r1.f45782a
                r0.mo22765f()
                return r4
            L_0x00ce:
                r0 = move-exception
                r2.close()
                lh5 r2 = r1.f45782a
                r2.mo22765f()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.wy0.C9564b.call():net.safemoon.androidwallet.model.token.room.RoomCustomToken");
        }
    }

    /* renamed from: wy0$c */
    /* compiled from: CustomTokenDao_Impl */
    public class C9565c extends vq1<RoomCustomToken> {
        public C9565c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `table_custom` (`symbolWithType`,`symbol`,`name`,`iconPath`,`contractorAddress`,`tokenTypeChain`,`decimals`,`allowSwap`,`nativeBalance`,`priceInUsdt`,`percentChange1h`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, RoomCustomToken roomCustomToken) {
            if (roomCustomToken.getSymbolWithType() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, roomCustomToken.getSymbolWithType());
            }
            if (roomCustomToken.getSymbol() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, roomCustomToken.getSymbol());
            }
            if (roomCustomToken.getName() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, roomCustomToken.getName());
            }
            if (roomCustomToken.getIconResName() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, roomCustomToken.getIconResName());
            }
            if (roomCustomToken.getContractAddress() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, roomCustomToken.getContractAddress());
            }
            supportSQLiteStatement.bindLong(6, (long) roomCustomToken.getChainId());
            supportSQLiteStatement.bindLong(7, (long) roomCustomToken.getDecimals());
            supportSQLiteStatement.bindLong(8, roomCustomToken.getAllowSwap() ? 1 : 0);
            supportSQLiteStatement.bindDouble(9, roomCustomToken.getNativeBalance());
            supportSQLiteStatement.bindDouble(10, roomCustomToken.getPriceInUsdt());
            supportSQLiteStatement.bindDouble(11, roomCustomToken.getPercentChange1h());
        }
    }

    /* renamed from: wy0$d */
    /* compiled from: CustomTokenDao_Impl */
    public class C9566d extends SharedSQLiteStatement {
        public C9566d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_custom SET `iconPath` = ? WHERE symbolWithType=?";
        }
    }

    /* renamed from: wy0$e */
    /* compiled from: CustomTokenDao_Impl */
    public class C9567e extends SharedSQLiteStatement {
        public C9567e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM table_custom WHERE symbolWithType=?";
        }
    }

    /* renamed from: wy0$f */
    /* compiled from: CustomTokenDao_Impl */
    public class C9568f implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ RoomCustomToken f45787a;

        public C9568f(RoomCustomToken roomCustomToken) {
            this.f45787a = roomCustomToken;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            wy0.this.f45776a.mo10119e();
            try {
                wy0.this.f45777b.mo27296j(this.f45787a);
                wy0.this.f45776a.mo10115C();
                return r37.f33317a;
            } finally {
                wy0.this.f45776a.mo10124j();
            }
        }
    }

    /* renamed from: wy0$g */
    /* compiled from: CustomTokenDao_Impl */
    public class C9569g implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ String f45789a;

        /* renamed from: d */
        public final /* synthetic */ String f45790d;

        public C9569g(String str, String str2) {
            this.f45789a = str;
            this.f45790d = str2;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = wy0.this.f45778c.mo10162b();
            String str = this.f45789a;
            if (str == null) {
                b.bindNull(1);
            } else {
                b.bindString(1, str);
            }
            String str2 = this.f45790d;
            if (str2 == null) {
                b.bindNull(2);
            } else {
                b.bindString(2, str2);
            }
            wy0.this.f45776a.mo10119e();
            try {
                b.executeUpdateDelete();
                wy0.this.f45776a.mo10115C();
                return r37.f33317a;
            } finally {
                wy0.this.f45776a.mo10124j();
                wy0.this.f45778c.mo10168h(b);
            }
        }
    }

    /* renamed from: wy0$h */
    /* compiled from: CustomTokenDao_Impl */
    public class C9570h implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ String f45792a;

        public C9570h(String str) {
            this.f45792a = str;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = wy0.this.f45779d.mo10162b();
            String str = this.f45792a;
            if (str == null) {
                b.bindNull(1);
            } else {
                b.bindString(1, str);
            }
            wy0.this.f45776a.mo10119e();
            try {
                b.executeUpdateDelete();
                wy0.this.f45776a.mo10115C();
                return r37.f33317a;
            } finally {
                wy0.this.f45776a.mo10124j();
                wy0.this.f45779d.mo10168h(b);
            }
        }
    }

    /* renamed from: wy0$i */
    /* compiled from: CustomTokenDao_Impl */
    public class C9571i implements Callable<List<RoomCustomToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f45794a;

        public C9571i(lh5 lh5) {
            this.f45794a = lh5;
        }

        /* renamed from: a */
        public List<RoomCustomToken> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z;
            Cursor c = iz0.m19913c(wy0.this.f45776a, this.f45794a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "symbolWithType");
                int e2 = px0.m25190e(c, "symbol");
                int e3 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e4 = px0.m25190e(c, "iconPath");
                int e5 = px0.m25190e(c, "contractorAddress");
                int e6 = px0.m25190e(c, "tokenTypeChain");
                int e7 = px0.m25190e(c, "decimals");
                int e8 = px0.m25190e(c, "allowSwap");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "priceInUsdt");
                int e11 = px0.m25190e(c, "percentChange1h");
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
                        str3 = null;
                    } else {
                        str3 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e5);
                    }
                    int i = c.getInt(e6);
                    int i2 = c.getInt(e7);
                    if (c.getInt(e8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new RoomCustomToken(str, str2, str3, str4, str5, i, i2, z, c.getDouble(e9), c.getDouble(e10), c.getDouble(e11)));
                }
                return arrayList;
            } finally {
                c.close();
                this.f45794a.mo22765f();
            }
        }
    }

    public wy0(RoomDatabase roomDatabase) {
        this.f45776a = roomDatabase;
        this.f45777b = new C9565c(roomDatabase);
        this.f45778c = new C9566d(roomDatabase);
        this.f45779d = new C9567e(roomDatabase);
    }

    /* renamed from: e */
    public static List<Class<?>> m73757e() {
        return Collections.emptyList();
    }

    /* renamed from: g */
    public Object mo66594g(int i, ns0<? super List<RoomCustomToken>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_custom WHERE tokenTypeChain LIKE ?", 1);
        a.bindLong(1, (long) i);
        return CoroutinesRoom.m9773a(this.f45776a, false, iz0.m19911a(), new C9571i(a), ns0);
    }

    /* renamed from: h */
    public Object mo66595h(RoomCustomToken roomCustomToken, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f45776a, true, new C9568f(roomCustomToken), ns0);
    }

    /* renamed from: i */
    public Object mo66596i(ns0<? super List<RoomCustomToken>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_custom ", 0);
        return CoroutinesRoom.m9773a(this.f45776a, false, iz0.m19911a(), new C9563a(a), ns0);
    }

    /* renamed from: j */
    public Object mo66597j(String str, ns0<? super RoomCustomToken> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_custom WHERE iconPath=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        return CoroutinesRoom.m9773a(this.f45776a, false, iz0.m19911a(), new C9564b(a), ns0);
    }

    /* renamed from: k */
    public Object mo66598k(String str, String str2, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f45776a, true, new C9569g(str2, str), ns0);
    }

    /* renamed from: l */
    public Object mo66599l(String str, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f45776a, true, new C9570h(str), ns0);
    }
}
