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
import net.safemoon.androidwallet.model.token.room.RoomToken;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: a67 */
/* compiled from: UserTokenListDao_Impl */
public final class a67 implements z57 {

    /* renamed from: a */
    public final RoomDatabase f36361a;

    /* renamed from: b */
    public final vq1<RoomToken> f36362b;

    /* renamed from: c */
    public final uq1<RoomToken> f36363c;

    /* renamed from: d */
    public final SharedSQLiteStatement f36364d;

    /* renamed from: e */
    public final SharedSQLiteStatement f36365e;

    /* renamed from: f */
    public final SharedSQLiteStatement f36366f;

    /* renamed from: g */
    public final SharedSQLiteStatement f36367g;

    /* renamed from: h */
    public final SharedSQLiteStatement f36368h;

    /* renamed from: a67$a */
    /* compiled from: UserTokenListDao_Impl */
    public class C6796a implements Callable<List<RoomToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f36369a;

        public C6796a(lh5 lh5) {
            this.f36369a = lh5;
        }

        /* renamed from: a */
        public List<RoomToken> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z;
            Cursor c = iz0.m19913c(a67.this.f36361a, this.f36369a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "symbolWithType");
                int e2 = px0.m25190e(c, "symbol");
                int e3 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e4 = px0.m25190e(c, "iconName");
                int e5 = px0.m25190e(c, "contractorAddress");
                int e6 = px0.m25190e(c, "tokenTypeChain");
                int e7 = px0.m25190e(c, "decimals");
                int e8 = px0.m25190e(c, "allowSwap");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "priceInUsdt");
                int e11 = px0.m25190e(c, "percentChange1h");
                int e12 = px0.m25190e(c, "order");
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
                    arrayList.add(new RoomToken(str, str2, str3, str4, str5, i, i2, z, c.getDouble(e9), c.getDouble(e10), c.getDouble(e11), c.getInt(e12)));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f36369a.mo22765f();
        }
    }

    /* renamed from: a67$b */
    /* compiled from: UserTokenListDao_Impl */
    public class C6797b implements Callable<List<RoomToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f36371a;

        public C6797b(lh5 lh5) {
            this.f36371a = lh5;
        }

        /* renamed from: a */
        public List<RoomToken> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z;
            Cursor c = iz0.m19913c(a67.this.f36361a, this.f36371a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "symbolWithType");
                int e2 = px0.m25190e(c, "symbol");
                int e3 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e4 = px0.m25190e(c, "iconName");
                int e5 = px0.m25190e(c, "contractorAddress");
                int e6 = px0.m25190e(c, "tokenTypeChain");
                int e7 = px0.m25190e(c, "decimals");
                int e8 = px0.m25190e(c, "allowSwap");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "priceInUsdt");
                int e11 = px0.m25190e(c, "percentChange1h");
                int e12 = px0.m25190e(c, "order");
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
                    arrayList.add(new RoomToken(str, str2, str3, str4, str5, i, i2, z, c.getDouble(e9), c.getDouble(e10), c.getDouble(e11), c.getInt(e12)));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f36371a.mo22765f();
        }
    }

    /* renamed from: a67$c */
    /* compiled from: UserTokenListDao_Impl */
    public class C6798c implements Callable<RoomToken> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f36373a;

        public C6798c(lh5 lh5) {
            this.f36373a = lh5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public net.safemoon.androidwallet.model.token.room.RoomToken call() throws java.lang.Exception {
            /*
                r32 = this;
                r1 = r32
                a67 r0 = p000.a67.this
                androidx.room.RoomDatabase r0 = r0.f36361a
                lh5 r2 = r1.f36373a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = p000.iz0.m19913c(r0, r2, r3, r4)
                java.lang.String r0 = "symbolWithType"
                int r0 = p000.px0.m25190e(r2, r0)     // Catch:{ all -> 0x00d9 }
                java.lang.String r5 = "symbol"
                int r5 = p000.px0.m25190e(r2, r5)     // Catch:{ all -> 0x00d9 }
                java.lang.String r6 = "name"
                int r6 = p000.px0.m25190e(r2, r6)     // Catch:{ all -> 0x00d9 }
                java.lang.String r7 = "iconName"
                int r7 = p000.px0.m25190e(r2, r7)     // Catch:{ all -> 0x00d9 }
                java.lang.String r8 = "contractorAddress"
                int r8 = p000.px0.m25190e(r2, r8)     // Catch:{ all -> 0x00d9 }
                java.lang.String r9 = "tokenTypeChain"
                int r9 = p000.px0.m25190e(r2, r9)     // Catch:{ all -> 0x00d9 }
                java.lang.String r10 = "decimals"
                int r10 = p000.px0.m25190e(r2, r10)     // Catch:{ all -> 0x00d9 }
                java.lang.String r11 = "allowSwap"
                int r11 = p000.px0.m25190e(r2, r11)     // Catch:{ all -> 0x00d9 }
                java.lang.String r12 = "nativeBalance"
                int r12 = p000.px0.m25190e(r2, r12)     // Catch:{ all -> 0x00d9 }
                java.lang.String r13 = "priceInUsdt"
                int r13 = p000.px0.m25190e(r2, r13)     // Catch:{ all -> 0x00d9 }
                java.lang.String r14 = "percentChange1h"
                int r14 = p000.px0.m25190e(r2, r14)     // Catch:{ all -> 0x00d9 }
                java.lang.String r15 = "order"
                int r15 = p000.px0.m25190e(r2, r15)     // Catch:{ all -> 0x00d9 }
                boolean r16 = r2.moveToFirst()     // Catch:{ all -> 0x00d9 }
                if (r16 == 0) goto L_0x00d0
                boolean r16 = r2.isNull(r0)     // Catch:{ all -> 0x00d9 }
                if (r16 == 0) goto L_0x0067
                r17 = r4
                goto L_0x006d
            L_0x0067:
                java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00d9 }
                r17 = r0
            L_0x006d:
                boolean r0 = r2.isNull(r5)     // Catch:{ all -> 0x00d9 }
                if (r0 == 0) goto L_0x0076
                r18 = r4
                goto L_0x007c
            L_0x0076:
                java.lang.String r0 = r2.getString(r5)     // Catch:{ all -> 0x00d9 }
                r18 = r0
            L_0x007c:
                boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x00d9 }
                if (r0 == 0) goto L_0x0085
                r19 = r4
                goto L_0x008b
            L_0x0085:
                java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x00d9 }
                r19 = r0
            L_0x008b:
                boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x00d9 }
                if (r0 == 0) goto L_0x0094
                r20 = r4
                goto L_0x009a
            L_0x0094:
                java.lang.String r0 = r2.getString(r7)     // Catch:{ all -> 0x00d9 }
                r20 = r0
            L_0x009a:
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x00d9 }
                if (r0 == 0) goto L_0x00a3
            L_0x00a0:
                r21 = r4
                goto L_0x00a8
            L_0x00a3:
                java.lang.String r4 = r2.getString(r8)     // Catch:{ all -> 0x00d9 }
                goto L_0x00a0
            L_0x00a8:
                int r22 = r2.getInt(r9)     // Catch:{ all -> 0x00d9 }
                int r23 = r2.getInt(r10)     // Catch:{ all -> 0x00d9 }
                int r0 = r2.getInt(r11)     // Catch:{ all -> 0x00d9 }
                if (r0 == 0) goto L_0x00b7
                r3 = 1
            L_0x00b7:
                r24 = r3
                double r25 = r2.getDouble(r12)     // Catch:{ all -> 0x00d9 }
                double r27 = r2.getDouble(r13)     // Catch:{ all -> 0x00d9 }
                double r29 = r2.getDouble(r14)     // Catch:{ all -> 0x00d9 }
                int r31 = r2.getInt(r15)     // Catch:{ all -> 0x00d9 }
                net.safemoon.androidwallet.model.token.room.RoomToken r4 = new net.safemoon.androidwallet.model.token.room.RoomToken     // Catch:{ all -> 0x00d9 }
                r16 = r4
                r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31)     // Catch:{ all -> 0x00d9 }
            L_0x00d0:
                r2.close()
                lh5 r0 = r1.f36373a
                r0.mo22765f()
                return r4
            L_0x00d9:
                r0 = move-exception
                r2.close()
                lh5 r2 = r1.f36373a
                r2.mo22765f()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.a67.C6798c.call():net.safemoon.androidwallet.model.token.room.RoomToken");
        }
    }

    /* renamed from: a67$d */
    /* compiled from: UserTokenListDao_Impl */
    public class C6799d implements Callable<RoomToken> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f36375a;

        public C6799d(lh5 lh5) {
            this.f36375a = lh5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public net.safemoon.androidwallet.model.token.room.RoomToken call() throws java.lang.Exception {
            /*
                r32 = this;
                r1 = r32
                a67 r0 = p000.a67.this
                androidx.room.RoomDatabase r0 = r0.f36361a
                lh5 r2 = r1.f36375a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = p000.iz0.m19913c(r0, r2, r3, r4)
                java.lang.String r0 = "symbolWithType"
                int r0 = p000.px0.m25190e(r2, r0)     // Catch:{ all -> 0x00d9 }
                java.lang.String r5 = "symbol"
                int r5 = p000.px0.m25190e(r2, r5)     // Catch:{ all -> 0x00d9 }
                java.lang.String r6 = "name"
                int r6 = p000.px0.m25190e(r2, r6)     // Catch:{ all -> 0x00d9 }
                java.lang.String r7 = "iconName"
                int r7 = p000.px0.m25190e(r2, r7)     // Catch:{ all -> 0x00d9 }
                java.lang.String r8 = "contractorAddress"
                int r8 = p000.px0.m25190e(r2, r8)     // Catch:{ all -> 0x00d9 }
                java.lang.String r9 = "tokenTypeChain"
                int r9 = p000.px0.m25190e(r2, r9)     // Catch:{ all -> 0x00d9 }
                java.lang.String r10 = "decimals"
                int r10 = p000.px0.m25190e(r2, r10)     // Catch:{ all -> 0x00d9 }
                java.lang.String r11 = "allowSwap"
                int r11 = p000.px0.m25190e(r2, r11)     // Catch:{ all -> 0x00d9 }
                java.lang.String r12 = "nativeBalance"
                int r12 = p000.px0.m25190e(r2, r12)     // Catch:{ all -> 0x00d9 }
                java.lang.String r13 = "priceInUsdt"
                int r13 = p000.px0.m25190e(r2, r13)     // Catch:{ all -> 0x00d9 }
                java.lang.String r14 = "percentChange1h"
                int r14 = p000.px0.m25190e(r2, r14)     // Catch:{ all -> 0x00d9 }
                java.lang.String r15 = "order"
                int r15 = p000.px0.m25190e(r2, r15)     // Catch:{ all -> 0x00d9 }
                boolean r16 = r2.moveToFirst()     // Catch:{ all -> 0x00d9 }
                if (r16 == 0) goto L_0x00d0
                boolean r16 = r2.isNull(r0)     // Catch:{ all -> 0x00d9 }
                if (r16 == 0) goto L_0x0067
                r17 = r4
                goto L_0x006d
            L_0x0067:
                java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00d9 }
                r17 = r0
            L_0x006d:
                boolean r0 = r2.isNull(r5)     // Catch:{ all -> 0x00d9 }
                if (r0 == 0) goto L_0x0076
                r18 = r4
                goto L_0x007c
            L_0x0076:
                java.lang.String r0 = r2.getString(r5)     // Catch:{ all -> 0x00d9 }
                r18 = r0
            L_0x007c:
                boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x00d9 }
                if (r0 == 0) goto L_0x0085
                r19 = r4
                goto L_0x008b
            L_0x0085:
                java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x00d9 }
                r19 = r0
            L_0x008b:
                boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x00d9 }
                if (r0 == 0) goto L_0x0094
                r20 = r4
                goto L_0x009a
            L_0x0094:
                java.lang.String r0 = r2.getString(r7)     // Catch:{ all -> 0x00d9 }
                r20 = r0
            L_0x009a:
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x00d9 }
                if (r0 == 0) goto L_0x00a3
            L_0x00a0:
                r21 = r4
                goto L_0x00a8
            L_0x00a3:
                java.lang.String r4 = r2.getString(r8)     // Catch:{ all -> 0x00d9 }
                goto L_0x00a0
            L_0x00a8:
                int r22 = r2.getInt(r9)     // Catch:{ all -> 0x00d9 }
                int r23 = r2.getInt(r10)     // Catch:{ all -> 0x00d9 }
                int r0 = r2.getInt(r11)     // Catch:{ all -> 0x00d9 }
                if (r0 == 0) goto L_0x00b7
                r3 = 1
            L_0x00b7:
                r24 = r3
                double r25 = r2.getDouble(r12)     // Catch:{ all -> 0x00d9 }
                double r27 = r2.getDouble(r13)     // Catch:{ all -> 0x00d9 }
                double r29 = r2.getDouble(r14)     // Catch:{ all -> 0x00d9 }
                int r31 = r2.getInt(r15)     // Catch:{ all -> 0x00d9 }
                net.safemoon.androidwallet.model.token.room.RoomToken r4 = new net.safemoon.androidwallet.model.token.room.RoomToken     // Catch:{ all -> 0x00d9 }
                r16 = r4
                r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31)     // Catch:{ all -> 0x00d9 }
            L_0x00d0:
                r2.close()
                lh5 r0 = r1.f36375a
                r0.mo22765f()
                return r4
            L_0x00d9:
                r0 = move-exception
                r2.close()
                lh5 r2 = r1.f36375a
                r2.mo22765f()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.a67.C6799d.call():net.safemoon.androidwallet.model.token.room.RoomToken");
        }
    }

    /* renamed from: a67$e */
    /* compiled from: UserTokenListDao_Impl */
    public class C6800e implements Callable<List<RoomToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f36377a;

        public C6800e(lh5 lh5) {
            this.f36377a = lh5;
        }

        /* renamed from: a */
        public List<RoomToken> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z;
            Cursor c = iz0.m19913c(a67.this.f36361a, this.f36377a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "symbolWithType");
                int e2 = px0.m25190e(c, "symbol");
                int e3 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e4 = px0.m25190e(c, "iconName");
                int e5 = px0.m25190e(c, "contractorAddress");
                int e6 = px0.m25190e(c, "tokenTypeChain");
                int e7 = px0.m25190e(c, "decimals");
                int e8 = px0.m25190e(c, "allowSwap");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "priceInUsdt");
                int e11 = px0.m25190e(c, "percentChange1h");
                int e12 = px0.m25190e(c, "order");
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
                    arrayList.add(new RoomToken(str, str2, str3, str4, str5, i, i2, z, c.getDouble(e9), c.getDouble(e10), c.getDouble(e11), c.getInt(e12)));
                }
                return arrayList;
            } finally {
                c.close();
                this.f36377a.mo22765f();
            }
        }
    }

    /* renamed from: a67$f */
    /* compiled from: UserTokenListDao_Impl */
    public class C6801f implements Callable<List<RoomToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f36379a;

        public C6801f(lh5 lh5) {
            this.f36379a = lh5;
        }

        /* renamed from: a */
        public List<RoomToken> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z;
            Cursor c = iz0.m19913c(a67.this.f36361a, this.f36379a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "symbolWithType");
                int e2 = px0.m25190e(c, "symbol");
                int e3 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e4 = px0.m25190e(c, "iconName");
                int e5 = px0.m25190e(c, "contractorAddress");
                int e6 = px0.m25190e(c, "tokenTypeChain");
                int e7 = px0.m25190e(c, "decimals");
                int e8 = px0.m25190e(c, "allowSwap");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "priceInUsdt");
                int e11 = px0.m25190e(c, "percentChange1h");
                int e12 = px0.m25190e(c, "order");
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
                    arrayList.add(new RoomToken(str, str2, str3, str4, str5, i, i2, z, c.getDouble(e9), c.getDouble(e10), c.getDouble(e11), c.getInt(e12)));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f36379a.mo22765f();
        }
    }

    /* renamed from: a67$g */
    /* compiled from: UserTokenListDao_Impl */
    public class C6802g implements Callable<List<RoomToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f36381a;

        public C6802g(lh5 lh5) {
            this.f36381a = lh5;
        }

        /* renamed from: a */
        public List<RoomToken> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z;
            Cursor c = iz0.m19913c(a67.this.f36361a, this.f36381a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "symbolWithType");
                int e2 = px0.m25190e(c, "symbol");
                int e3 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e4 = px0.m25190e(c, "iconName");
                int e5 = px0.m25190e(c, "contractorAddress");
                int e6 = px0.m25190e(c, "tokenTypeChain");
                int e7 = px0.m25190e(c, "decimals");
                int e8 = px0.m25190e(c, "allowSwap");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "priceInUsdt");
                int e11 = px0.m25190e(c, "percentChange1h");
                int e12 = px0.m25190e(c, "order");
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
                    arrayList.add(new RoomToken(str, str2, str3, str4, str5, i, i2, z, c.getDouble(e9), c.getDouble(e10), c.getDouble(e11), c.getInt(e12)));
                }
                return arrayList;
            } finally {
                c.close();
                this.f36381a.mo22765f();
            }
        }
    }

    /* renamed from: a67$h */
    /* compiled from: UserTokenListDao_Impl */
    public class C6803h implements Callable<List<RoomToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f36383a;

        public C6803h(lh5 lh5) {
            this.f36383a = lh5;
        }

        /* renamed from: a */
        public List<RoomToken> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z;
            Cursor c = iz0.m19913c(a67.this.f36361a, this.f36383a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "symbolWithType");
                int e2 = px0.m25190e(c, "symbol");
                int e3 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e4 = px0.m25190e(c, "iconName");
                int e5 = px0.m25190e(c, "contractorAddress");
                int e6 = px0.m25190e(c, "tokenTypeChain");
                int e7 = px0.m25190e(c, "decimals");
                int e8 = px0.m25190e(c, "allowSwap");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "priceInUsdt");
                int e11 = px0.m25190e(c, "percentChange1h");
                int e12 = px0.m25190e(c, "order");
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
                    arrayList.add(new RoomToken(str, str2, str3, str4, str5, i, i2, z, c.getDouble(e9), c.getDouble(e10), c.getDouble(e11), c.getInt(e12)));
                }
                return arrayList;
            } finally {
                c.close();
                this.f36383a.mo22765f();
            }
        }
    }

    /* renamed from: a67$i */
    /* compiled from: UserTokenListDao_Impl */
    public class C6804i implements Callable<RoomToken> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f36385a;

        public C6804i(lh5 lh5) {
            this.f36385a = lh5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: net.safemoon.androidwallet.model.token.room.RoomToken} */
        /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public net.safemoon.androidwallet.model.token.room.RoomToken call() throws java.lang.Exception {
            /*
                r32 = this;
                r1 = r32
                a67 r0 = p000.a67.this
                androidx.room.RoomDatabase r0 = r0.f36361a
                lh5 r2 = r1.f36385a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = p000.iz0.m19913c(r0, r2, r3, r4)
                java.lang.String r0 = "symbolWithType"
                int r0 = p000.px0.m25190e(r2, r0)     // Catch:{ all -> 0x00d4 }
                java.lang.String r5 = "symbol"
                int r5 = p000.px0.m25190e(r2, r5)     // Catch:{ all -> 0x00d4 }
                java.lang.String r6 = "name"
                int r6 = p000.px0.m25190e(r2, r6)     // Catch:{ all -> 0x00d4 }
                java.lang.String r7 = "iconName"
                int r7 = p000.px0.m25190e(r2, r7)     // Catch:{ all -> 0x00d4 }
                java.lang.String r8 = "contractorAddress"
                int r8 = p000.px0.m25190e(r2, r8)     // Catch:{ all -> 0x00d4 }
                java.lang.String r9 = "tokenTypeChain"
                int r9 = p000.px0.m25190e(r2, r9)     // Catch:{ all -> 0x00d4 }
                java.lang.String r10 = "decimals"
                int r10 = p000.px0.m25190e(r2, r10)     // Catch:{ all -> 0x00d4 }
                java.lang.String r11 = "allowSwap"
                int r11 = p000.px0.m25190e(r2, r11)     // Catch:{ all -> 0x00d4 }
                java.lang.String r12 = "nativeBalance"
                int r12 = p000.px0.m25190e(r2, r12)     // Catch:{ all -> 0x00d4 }
                java.lang.String r13 = "priceInUsdt"
                int r13 = p000.px0.m25190e(r2, r13)     // Catch:{ all -> 0x00d4 }
                java.lang.String r14 = "percentChange1h"
                int r14 = p000.px0.m25190e(r2, r14)     // Catch:{ all -> 0x00d4 }
                java.lang.String r15 = "order"
                int r15 = p000.px0.m25190e(r2, r15)     // Catch:{ all -> 0x00d4 }
                boolean r16 = r2.moveToFirst()     // Catch:{ all -> 0x00d4 }
                if (r16 == 0) goto L_0x00d0
                boolean r16 = r2.isNull(r0)     // Catch:{ all -> 0x00d4 }
                if (r16 == 0) goto L_0x0067
                r17 = r4
                goto L_0x006d
            L_0x0067:
                java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00d4 }
                r17 = r0
            L_0x006d:
                boolean r0 = r2.isNull(r5)     // Catch:{ all -> 0x00d4 }
                if (r0 == 0) goto L_0x0076
                r18 = r4
                goto L_0x007c
            L_0x0076:
                java.lang.String r0 = r2.getString(r5)     // Catch:{ all -> 0x00d4 }
                r18 = r0
            L_0x007c:
                boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x00d4 }
                if (r0 == 0) goto L_0x0085
                r19 = r4
                goto L_0x008b
            L_0x0085:
                java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x00d4 }
                r19 = r0
            L_0x008b:
                boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x00d4 }
                if (r0 == 0) goto L_0x0094
                r20 = r4
                goto L_0x009a
            L_0x0094:
                java.lang.String r0 = r2.getString(r7)     // Catch:{ all -> 0x00d4 }
                r20 = r0
            L_0x009a:
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x00d4 }
                if (r0 == 0) goto L_0x00a3
            L_0x00a0:
                r21 = r4
                goto L_0x00a8
            L_0x00a3:
                java.lang.String r4 = r2.getString(r8)     // Catch:{ all -> 0x00d4 }
                goto L_0x00a0
            L_0x00a8:
                int r22 = r2.getInt(r9)     // Catch:{ all -> 0x00d4 }
                int r23 = r2.getInt(r10)     // Catch:{ all -> 0x00d4 }
                int r0 = r2.getInt(r11)     // Catch:{ all -> 0x00d4 }
                if (r0 == 0) goto L_0x00b7
                r3 = 1
            L_0x00b7:
                r24 = r3
                double r25 = r2.getDouble(r12)     // Catch:{ all -> 0x00d4 }
                double r27 = r2.getDouble(r13)     // Catch:{ all -> 0x00d4 }
                double r29 = r2.getDouble(r14)     // Catch:{ all -> 0x00d4 }
                int r31 = r2.getInt(r15)     // Catch:{ all -> 0x00d4 }
                net.safemoon.androidwallet.model.token.room.RoomToken r4 = new net.safemoon.androidwallet.model.token.room.RoomToken     // Catch:{ all -> 0x00d4 }
                r16 = r4
                r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31)     // Catch:{ all -> 0x00d4 }
            L_0x00d0:
                r2.close()
                return r4
            L_0x00d4:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.a67.C6804i.call():net.safemoon.androidwallet.model.token.room.RoomToken");
        }

        public void finalize() {
            this.f36385a.mo22765f();
        }
    }

    /* renamed from: a67$j */
    /* compiled from: UserTokenListDao_Impl */
    public class C6805j extends vq1<RoomToken> {
        public C6805j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `table_token` (`symbolWithType`,`symbol`,`name`,`iconName`,`contractorAddress`,`tokenTypeChain`,`decimals`,`allowSwap`,`nativeBalance`,`priceInUsdt`,`percentChange1h`,`order`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, RoomToken roomToken) {
            if (roomToken.getSymbolWithType() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, roomToken.getSymbolWithType());
            }
            if (roomToken.getSymbol() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, roomToken.getSymbol());
            }
            if (roomToken.getName() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, roomToken.getName());
            }
            if (roomToken.getIconResName() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, roomToken.getIconResName());
            }
            if (roomToken.getContractAddress() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, roomToken.getContractAddress());
            }
            supportSQLiteStatement.bindLong(6, (long) roomToken.getChainId());
            supportSQLiteStatement.bindLong(7, (long) roomToken.getDecimals());
            supportSQLiteStatement.bindLong(8, roomToken.getAllowSwap() ? 1 : 0);
            supportSQLiteStatement.bindDouble(9, roomToken.getNativeBalance());
            supportSQLiteStatement.bindDouble(10, roomToken.getPriceInUsdt());
            supportSQLiteStatement.bindDouble(11, roomToken.getPercentChange1h());
            supportSQLiteStatement.bindLong(12, (long) roomToken.getOrder());
        }
    }

    /* renamed from: a67$k */
    /* compiled from: UserTokenListDao_Impl */
    public class C6806k extends uq1<RoomToken> {
        public C6806k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM `table_token` WHERE `symbolWithType` = ?";
        }

        /* renamed from: k */
        public void mo26841i(SupportSQLiteStatement supportSQLiteStatement, RoomToken roomToken) {
            if (roomToken.getSymbolWithType() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, roomToken.getSymbolWithType());
            }
        }
    }

    /* renamed from: a67$l */
    /* compiled from: UserTokenListDao_Impl */
    public class C6807l extends SharedSQLiteStatement {
        public C6807l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_token SET nativeBalance = ? WHERE symbolWithType=?";
        }
    }

    /* renamed from: a67$m */
    /* compiled from: UserTokenListDao_Impl */
    public class C6808m extends SharedSQLiteStatement {
        public C6808m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_token SET priceInUsdt = ?, percentChange1h = ? WHERE symbolWithType=?";
        }
    }

    /* renamed from: a67$n */
    /* compiled from: UserTokenListDao_Impl */
    public class C6809n extends SharedSQLiteStatement {
        public C6809n(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_token SET `order` = ? WHERE symbolWithType=?";
        }
    }

    /* renamed from: a67$o */
    /* compiled from: UserTokenListDao_Impl */
    public class C6810o extends SharedSQLiteStatement {
        public C6810o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_token SET `iconName` = ? WHERE symbolWithType=?";
        }
    }

    /* renamed from: a67$p */
    /* compiled from: UserTokenListDao_Impl */
    public class C6811p extends SharedSQLiteStatement {
        public C6811p(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM table_token";
        }
    }

    /* renamed from: a67$q */
    /* compiled from: UserTokenListDao_Impl */
    public class C6812q implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ int f36394a;

        /* renamed from: d */
        public final /* synthetic */ String f36395d;

        public C6812q(int i, String str) {
            this.f36394a = i;
            this.f36395d = str;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = a67.this.f36366f.mo10162b();
            b.bindLong(1, (long) this.f36394a);
            String str = this.f36395d;
            if (str == null) {
                b.bindNull(2);
            } else {
                b.bindString(2, str);
            }
            a67.this.f36361a.mo10119e();
            try {
                b.executeUpdateDelete();
                a67.this.f36361a.mo10115C();
                return r37.f33317a;
            } finally {
                a67.this.f36361a.mo10124j();
                a67.this.f36366f.mo10168h(b);
            }
        }
    }

    /* renamed from: a67$r */
    /* compiled from: UserTokenListDao_Impl */
    public class C6813r implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ String f36397a;

        /* renamed from: d */
        public final /* synthetic */ String f36398d;

        public C6813r(String str, String str2) {
            this.f36397a = str;
            this.f36398d = str2;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = a67.this.f36367g.mo10162b();
            String str = this.f36397a;
            if (str == null) {
                b.bindNull(1);
            } else {
                b.bindString(1, str);
            }
            String str2 = this.f36398d;
            if (str2 == null) {
                b.bindNull(2);
            } else {
                b.bindString(2, str2);
            }
            a67.this.f36361a.mo10119e();
            try {
                b.executeUpdateDelete();
                a67.this.f36361a.mo10115C();
                return r37.f33317a;
            } finally {
                a67.this.f36361a.mo10124j();
                a67.this.f36367g.mo10168h(b);
            }
        }
    }

    public a67(RoomDatabase roomDatabase) {
        this.f36361a = roomDatabase;
        this.f36362b = new C6805j(roomDatabase);
        this.f36363c = new C6806k(roomDatabase);
        this.f36364d = new C6807l(roomDatabase);
        this.f36365e = new C6808m(roomDatabase);
        this.f36366f = new C6809n(roomDatabase);
        this.f36367g = new C6810o(roomDatabase);
        this.f36368h = new C6811p(roomDatabase);
    }

    /* renamed from: t */
    public static List<Class<?>> m55384t() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public LiveData<List<RoomToken>> mo50074a() {
        return this.f36361a.mo10128n().mo20867d(new String[]{"table_token"}, false, new C6797b(lh5.m21448a("SELECT * FROM table_token ORDER BY `order` ASC", 0)));
    }

    /* renamed from: b */
    public void mo50075b(String str, double d) {
        this.f36361a.mo10118d();
        SupportSQLiteStatement b = this.f36364d.mo10162b();
        b.bindDouble(1, d);
        if (str == null) {
            b.bindNull(2);
        } else {
            b.bindString(2, str);
        }
        this.f36361a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f36361a.mo10115C();
        } finally {
            this.f36361a.mo10124j();
            this.f36364d.mo10168h(b);
        }
    }

    /* renamed from: c */
    public void mo50076c(String str, double d, double d2) {
        this.f36361a.mo10118d();
        SupportSQLiteStatement b = this.f36365e.mo10162b();
        b.bindDouble(1, d);
        b.bindDouble(2, d2);
        if (str == null) {
            b.bindNull(3);
        } else {
            b.bindString(3, str);
        }
        this.f36361a.mo10119e();
        try {
            b.executeUpdateDelete();
            this.f36361a.mo10115C();
        } finally {
            this.f36361a.mo10124j();
            this.f36365e.mo10168h(b);
        }
    }

    /* renamed from: d */
    public LiveData<RoomToken> mo50077d(String str) {
        lh5 a = lh5.m21448a("SELECT * FROM table_token WHERE symbolWithType=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        return this.f36361a.mo10128n().mo20867d(new String[]{"table_token"}, false, new C6804i(a));
    }

    /* renamed from: e */
    public Object mo50078e(String str, String str2, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f36361a, true, new C6813r(str2, str), ns0);
    }

    /* renamed from: f */
    public Object mo50079f(String str, ns0<? super RoomToken> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_token WHERE symbolWithType=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        return CoroutinesRoom.m9773a(this.f36361a, false, iz0.m19911a(), new C6798c(a), ns0);
    }

    /* renamed from: g */
    public Object mo50080g(int i, ns0<? super List<RoomToken>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_token WHERE tokenTypeChain LIKE ? ORDER BY `order` ASC", 1);
        a.bindLong(1, (long) i);
        return CoroutinesRoom.m9773a(this.f36361a, false, iz0.m19911a(), new C6800e(a), ns0);
    }

    /* renamed from: h */
    public Object mo50081h(int i, String str, ns0<? super RoomToken> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_token WHERE tokenTypeChain=? AND contractorAddress=? COLLATE NOCASE", 2);
        a.bindLong(1, (long) i);
        if (str == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str);
        }
        return CoroutinesRoom.m9773a(this.f36361a, false, iz0.m19911a(), new C6799d(a), ns0);
    }

    /* renamed from: i */
    public void mo50082i(RoomToken roomToken) {
        this.f36361a.mo10118d();
        this.f36361a.mo10119e();
        try {
            this.f36363c.mo26842j(roomToken);
            this.f36361a.mo10115C();
        } finally {
            this.f36361a.mo10124j();
        }
    }

    /* renamed from: j */
    public LiveData<List<RoomToken>> mo50083j() {
        return this.f36361a.mo10128n().mo20867d(new String[]{"table_token"}, false, new C6801f(lh5.m21448a("SELECT * FROM table_token WHERE tokenTypeChain <= 0 AND tokenTypeChain not in (-501) ORDER BY `order` ASC", 0)));
    }

    /* renamed from: k */
    public Object mo50084k(ns0<? super List<RoomToken>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_token WHERE tokenTypeChain <= 0 AND tokenTypeChain not in (-501) ORDER BY `order` ASC", 0);
        return CoroutinesRoom.m9773a(this.f36361a, false, iz0.m19911a(), new C6802g(a), ns0);
    }

    /* renamed from: l */
    public LiveData<List<RoomToken>> mo50085l(int i) {
        lh5 a = lh5.m21448a("SELECT * FROM table_token WHERE tokenTypeChain LIKE ? ORDER BY `order` ASC", 1);
        a.bindLong(1, (long) i);
        return this.f36361a.mo10128n().mo20867d(new String[]{"table_token"}, false, new C6796a(a));
    }

    /* renamed from: m */
    public Object mo50086m(String str, int i, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f36361a, true, new C6812q(i, str), ns0);
    }

    /* renamed from: n */
    public boolean mo50087n(String str, int i) {
        lh5 a = lh5.m21448a("SELECT EXISTS (SELECT 1 FROM table_token WHERE symbolWithType = ? AND tokenTypeChain =?)", 2);
        boolean z = true;
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        a.bindLong(2, (long) i);
        this.f36361a.mo10118d();
        boolean z2 = false;
        Cursor c = iz0.m19913c(this.f36361a, a, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                if (c.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            c.close();
            a.mo22765f();
        }
    }

    /* renamed from: o */
    public void mo50088o(RoomToken roomToken) {
        this.f36361a.mo10118d();
        this.f36361a.mo10119e();
        try {
            this.f36362b.mo27296j(roomToken);
            this.f36361a.mo10115C();
        } finally {
            this.f36361a.mo10124j();
        }
    }

    /* renamed from: p */
    public Object mo50089p(ns0<? super List<RoomToken>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_token ORDER BY `order` ASC", 0);
        return CoroutinesRoom.m9773a(this.f36361a, false, iz0.m19911a(), new C6803h(a), ns0);
    }
}
