package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import net.safemoon.androidwallet.model.RoomTokenInfo;

/* renamed from: jr6 */
/* compiled from: TokenInfoDao_Impl */
public final class jr6 implements ir6 {

    /* renamed from: a */
    public final RoomDatabase f38779a;

    /* renamed from: b */
    public final vq1<RoomTokenInfo> f38780b;

    /* renamed from: jr6$a */
    /* compiled from: TokenInfoDao_Impl */
    public class C7307a extends vq1<RoomTokenInfo> {
        public C7307a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `table_room_token_info` (`_id`,`symbolWithType`,`chainId`,`slug`,`cmcId`) VALUES (?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, RoomTokenInfo roomTokenInfo) {
            if (roomTokenInfo.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, roomTokenInfo.getId().longValue());
            }
            if (roomTokenInfo.getSymbolWithType() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, roomTokenInfo.getSymbolWithType());
            }
            supportSQLiteStatement.bindLong(3, (long) roomTokenInfo.getChainId());
            if (roomTokenInfo.getSlug() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, roomTokenInfo.getSlug());
            }
            if (roomTokenInfo.getCmcId() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, (long) roomTokenInfo.getCmcId().intValue());
            }
        }
    }

    /* renamed from: jr6$b */
    /* compiled from: TokenInfoDao_Impl */
    public class C7308b implements Callable<Long> {

        /* renamed from: a */
        public final /* synthetic */ RoomTokenInfo f38782a;

        public C7308b(RoomTokenInfo roomTokenInfo) {
            this.f38782a = roomTokenInfo;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            jr6.this.f38779a.mo10119e();
            try {
                long l = jr6.this.f38780b.mo27298l(this.f38782a);
                jr6.this.f38779a.mo10115C();
                return Long.valueOf(l);
            } finally {
                jr6.this.f38779a.mo10124j();
            }
        }
    }

    /* renamed from: jr6$c */
    /* compiled from: TokenInfoDao_Impl */
    public class C7309c implements Callable<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f38784a;

        public C7309c(lh5 lh5) {
            this.f38784a = lh5;
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            Integer num;
            boolean z = false;
            Boolean bool = null;
            Cursor c = iz0.m19913c(jr6.this.f38779a, this.f38784a, false, (CancellationSignal) null);
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
                this.f38784a.mo22765f();
            }
        }
    }

    /* renamed from: jr6$d */
    /* compiled from: TokenInfoDao_Impl */
    public class C7310d implements Callable<RoomTokenInfo> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f38786a;

        public C7310d(lh5 lh5) {
            this.f38786a = lh5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: net.safemoon.androidwallet.model.RoomTokenInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: net.safemoon.androidwallet.model.RoomTokenInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: net.safemoon.androidwallet.model.RoomTokenInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: net.safemoon.androidwallet.model.RoomTokenInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: net.safemoon.androidwallet.model.RoomTokenInfo} */
        /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Integer] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public net.safemoon.androidwallet.model.RoomTokenInfo call() throws java.lang.Exception {
            /*
                r13 = this;
                jr6 r0 = p000.jr6.this
                androidx.room.RoomDatabase r0 = r0.f38779a
                lh5 r1 = r13.f38786a
                r2 = 0
                r3 = 0
                android.database.Cursor r0 = p000.iz0.m19913c(r0, r1, r2, r3)
                java.lang.String r1 = "_id"
                int r1 = p000.px0.m25190e(r0, r1)     // Catch:{ all -> 0x0081 }
                java.lang.String r2 = "symbolWithType"
                int r2 = p000.px0.m25190e(r0, r2)     // Catch:{ all -> 0x0081 }
                java.lang.String r4 = "chainId"
                int r4 = p000.px0.m25190e(r0, r4)     // Catch:{ all -> 0x0081 }
                java.lang.String r5 = "slug"
                int r5 = p000.px0.m25190e(r0, r5)     // Catch:{ all -> 0x0081 }
                java.lang.String r6 = "cmcId"
                int r6 = p000.px0.m25190e(r0, r6)     // Catch:{ all -> 0x0081 }
                boolean r7 = r0.moveToFirst()     // Catch:{ all -> 0x0081 }
                if (r7 == 0) goto L_0x0078
                boolean r7 = r0.isNull(r1)     // Catch:{ all -> 0x0081 }
                if (r7 == 0) goto L_0x003a
                r8 = r3
                goto L_0x0043
            L_0x003a:
                long r7 = r0.getLong(r1)     // Catch:{ all -> 0x0081 }
                java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0081 }
                r8 = r1
            L_0x0043:
                boolean r1 = r0.isNull(r2)     // Catch:{ all -> 0x0081 }
                if (r1 == 0) goto L_0x004b
                r9 = r3
                goto L_0x0050
            L_0x004b:
                java.lang.String r1 = r0.getString(r2)     // Catch:{ all -> 0x0081 }
                r9 = r1
            L_0x0050:
                int r10 = r0.getInt(r4)     // Catch:{ all -> 0x0081 }
                boolean r1 = r0.isNull(r5)     // Catch:{ all -> 0x0081 }
                if (r1 == 0) goto L_0x005c
                r11 = r3
                goto L_0x0061
            L_0x005c:
                java.lang.String r1 = r0.getString(r5)     // Catch:{ all -> 0x0081 }
                r11 = r1
            L_0x0061:
                boolean r1 = r0.isNull(r6)     // Catch:{ all -> 0x0081 }
                if (r1 == 0) goto L_0x0069
            L_0x0067:
                r12 = r3
                goto L_0x0072
            L_0x0069:
                int r1 = r0.getInt(r6)     // Catch:{ all -> 0x0081 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0081 }
                goto L_0x0067
            L_0x0072:
                net.safemoon.androidwallet.model.RoomTokenInfo r3 = new net.safemoon.androidwallet.model.RoomTokenInfo     // Catch:{ all -> 0x0081 }
                r7 = r3
                r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0081 }
            L_0x0078:
                r0.close()
                lh5 r0 = r13.f38786a
                r0.mo22765f()
                return r3
            L_0x0081:
                r1 = move-exception
                r0.close()
                lh5 r0 = r13.f38786a
                r0.mo22765f()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.jr6.C7310d.call():net.safemoon.androidwallet.model.RoomTokenInfo");
        }
    }

    public jr6(RoomDatabase roomDatabase) {
        this.f38779a = roomDatabase;
        this.f38780b = new C7307a(roomDatabase);
    }

    /* renamed from: f */
    public static List<Class<?>> m59551f() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public Object mo52531a(RoomTokenInfo roomTokenInfo, ns0<? super Long> ns0) {
        return CoroutinesRoom.m9774b(this.f38779a, true, new C7308b(roomTokenInfo), ns0);
    }

    /* renamed from: b */
    public Object mo52532b(int i, ns0<? super RoomTokenInfo> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_token_info WHERE cmcId = ?", 1);
        a.bindLong(1, (long) i);
        return CoroutinesRoom.m9773a(this.f38779a, false, iz0.m19911a(), new C7310d(a), ns0);
    }

    /* renamed from: c */
    public Object mo52533c(String str, ns0<? super Boolean> ns0) {
        lh5 a = lh5.m21448a("SELECT EXISTS (SELECT 1 FROM table_room_token_info WHERE symbolWithType = ?)", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        return CoroutinesRoom.m9773a(this.f38779a, false, iz0.m19911a(), new C7309c(a), ns0);
    }
}
