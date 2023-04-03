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
import net.safemoon.androidwallet.model.wallets.Wallet;
import org.web3j.abi.datatypes.Address;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: jh7 */
/* compiled from: WalletDao_Impl */
public final class jh7 implements ih7 {

    /* renamed from: a */
    public final RoomDatabase f38680a;

    /* renamed from: b */
    public final vq1<Wallet> f38681b;

    /* renamed from: c */
    public final uq1<Wallet> f38682c;

    /* renamed from: d */
    public final SharedSQLiteStatement f38683d;

    /* renamed from: e */
    public final SharedSQLiteStatement f38684e;

    /* renamed from: f */
    public final SharedSQLiteStatement f38685f;

    /* renamed from: g */
    public final SharedSQLiteStatement f38686g;

    /* renamed from: h */
    public final SharedSQLiteStatement f38687h;

    /* renamed from: jh7$a */
    /* compiled from: WalletDao_Impl */
    public class C7280a implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ String f38688a;

        /* renamed from: d */
        public final /* synthetic */ int f38689d;

        /* renamed from: e */
        public final /* synthetic */ long f38690e;

        public C7280a(String str, int i, long j) {
            this.f38688a = str;
            this.f38689d = i;
            this.f38690e = j;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = jh7.this.f38683d.mo10162b();
            String str = this.f38688a;
            if (str == null) {
                b.bindNull(1);
            } else {
                b.bindString(1, str);
            }
            b.bindLong(2, (long) this.f38689d);
            b.bindLong(3, this.f38690e);
            jh7.this.f38680a.mo10119e();
            try {
                b.executeUpdateDelete();
                jh7.this.f38680a.mo10115C();
                return r37.f33317a;
            } finally {
                jh7.this.f38680a.mo10124j();
                jh7.this.f38683d.mo10168h(b);
            }
        }
    }

    /* renamed from: jh7$b */
    /* compiled from: WalletDao_Impl */
    public class C7281b implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ String f38692a;

        /* renamed from: d */
        public final /* synthetic */ long f38693d;

        public C7281b(String str, long j) {
            this.f38692a = str;
            this.f38693d = j;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = jh7.this.f38684e.mo10162b();
            String str = this.f38692a;
            if (str == null) {
                b.bindNull(1);
            } else {
                b.bindString(1, str);
            }
            b.bindLong(2, this.f38693d);
            jh7.this.f38680a.mo10119e();
            try {
                b.executeUpdateDelete();
                jh7.this.f38680a.mo10115C();
                return r37.f33317a;
            } finally {
                jh7.this.f38680a.mo10124j();
                jh7.this.f38684e.mo10168h(b);
            }
        }
    }

    /* renamed from: jh7$c */
    /* compiled from: WalletDao_Impl */
    public class C7282c implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ int f38695a;

        /* renamed from: d */
        public final /* synthetic */ long f38696d;

        public C7282c(int i, long j) {
            this.f38695a = i;
            this.f38696d = j;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = jh7.this.f38685f.mo10162b();
            b.bindLong(1, (long) this.f38695a);
            b.bindLong(2, this.f38696d);
            jh7.this.f38680a.mo10119e();
            try {
                b.executeUpdateDelete();
                jh7.this.f38680a.mo10115C();
                return r37.f33317a;
            } finally {
                jh7.this.f38680a.mo10124j();
                jh7.this.f38685f.mo10168h(b);
            }
        }
    }

    /* renamed from: jh7$d */
    /* compiled from: WalletDao_Impl */
    public class C7283d implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ String f38698a;

        /* renamed from: d */
        public final /* synthetic */ String f38699d;

        /* renamed from: e */
        public final /* synthetic */ String f38700e;

        /* renamed from: g */
        public final /* synthetic */ String f38701g;

        /* renamed from: k */
        public final /* synthetic */ int f38702k;

        /* renamed from: r */
        public final /* synthetic */ String f38703r;

        /* renamed from: s */
        public final /* synthetic */ long f38704s;

        public C7283d(String str, String str2, String str3, String str4, int i, String str5, long j) {
            this.f38698a = str;
            this.f38699d = str2;
            this.f38700e = str3;
            this.f38701g = str4;
            this.f38702k = i;
            this.f38703r = str5;
            this.f38704s = j;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = jh7.this.f38686g.mo10162b();
            String str = this.f38698a;
            if (str == null) {
                b.bindNull(1);
            } else {
                b.bindString(1, str);
            }
            String str2 = this.f38699d;
            if (str2 == null) {
                b.bindNull(2);
            } else {
                b.bindString(2, str2);
            }
            String str3 = this.f38700e;
            if (str3 == null) {
                b.bindNull(3);
            } else {
                b.bindString(3, str3);
            }
            String str4 = this.f38701g;
            if (str4 == null) {
                b.bindNull(4);
            } else {
                b.bindString(4, str4);
            }
            b.bindLong(5, (long) this.f38702k);
            String str5 = this.f38703r;
            if (str5 == null) {
                b.bindNull(6);
            } else {
                b.bindString(6, str5);
            }
            b.bindLong(7, this.f38704s);
            jh7.this.f38680a.mo10119e();
            try {
                b.executeUpdateDelete();
                jh7.this.f38680a.mo10115C();
                return r37.f33317a;
            } finally {
                jh7.this.f38680a.mo10124j();
                jh7.this.f38686g.mo10168h(b);
            }
        }
    }

    /* renamed from: jh7$e */
    /* compiled from: WalletDao_Impl */
    public class C7284e implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ int f38706a;

        /* renamed from: d */
        public final /* synthetic */ long f38707d;

        public C7284e(int i, long j) {
            this.f38706a = i;
            this.f38707d = j;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = jh7.this.f38687h.mo10162b();
            b.bindLong(1, (long) this.f38706a);
            b.bindLong(2, this.f38707d);
            jh7.this.f38680a.mo10119e();
            try {
                b.executeUpdateDelete();
                jh7.this.f38680a.mo10115C();
                return r37.f33317a;
            } finally {
                jh7.this.f38680a.mo10124j();
                jh7.this.f38687h.mo10168h(b);
            }
        }
    }

    /* renamed from: jh7$f */
    /* compiled from: WalletDao_Impl */
    public class C7285f implements Callable<List<Wallet>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f38709a;

        public C7285f(lh5 lh5) {
            this.f38709a = lh5;
        }

        /* renamed from: a */
        public List<Wallet> call() throws Exception {
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
            Cursor c = iz0.m19913c(jh7.this.f38680a, this.f38709a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e3 = px0.m25190e(c, "prefix");
                int e4 = px0.m25190e(c, "privateKey");
                int e5 = px0.m25190e(c, Address.TYPE_NAME);
                int e6 = px0.m25190e(c, "passPhrase");
                int e7 = px0.m25190e(c, "ka");
                int e8 = px0.m25190e(c, "u5b64");
                int e9 = px0.m25190e(c, "isLinked");
                int e10 = px0.m25190e(c, "order");
                int e11 = px0.m25190e(c, "isPrimaryWallet");
                int e12 = px0.m25190e(c, "myCoinType");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        l = null;
                    } else {
                        l = Long.valueOf(c.getLong(e));
                    }
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e6);
                    }
                    if (c.isNull(e7)) {
                        str6 = null;
                    } else {
                        str6 = c.getString(e7);
                    }
                    if (c.isNull(e8)) {
                        str7 = null;
                    } else {
                        str7 = c.getString(e8);
                    }
                    int i = c.getInt(e9);
                    int i2 = c.getInt(e10);
                    if (c.getInt(e11) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c.isNull(e12)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(c.getInt(e12));
                    }
                    arrayList.add(new Wallet(l, str, str2, str3, str4, str5, str6, str7, i, i2, z, num));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f38709a.mo22765f();
        }
    }

    /* renamed from: jh7$g */
    /* compiled from: WalletDao_Impl */
    public class C7286g implements Callable<Integer> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f38711a;

        public C7286g(lh5 lh5) {
            this.f38711a = lh5;
        }

        /* renamed from: a */
        public Integer call() throws Exception {
            Integer num = null;
            Cursor c = iz0.m19913c(jh7.this.f38680a, this.f38711a, false, (CancellationSignal) null);
            try {
                if (c.moveToFirst()) {
                    if (!c.isNull(0)) {
                        num = Integer.valueOf(c.getInt(0));
                    }
                }
                return num;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f38711a.mo22765f();
        }
    }

    /* renamed from: jh7$h */
    /* compiled from: WalletDao_Impl */
    public class C7287h implements Callable<List<Wallet>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f38713a;

        public C7287h(lh5 lh5) {
            this.f38713a = lh5;
        }

        /* renamed from: a */
        public List<Wallet> call() throws Exception {
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
            Cursor c = iz0.m19913c(jh7.this.f38680a, this.f38713a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e3 = px0.m25190e(c, "prefix");
                int e4 = px0.m25190e(c, "privateKey");
                int e5 = px0.m25190e(c, Address.TYPE_NAME);
                int e6 = px0.m25190e(c, "passPhrase");
                int e7 = px0.m25190e(c, "ka");
                int e8 = px0.m25190e(c, "u5b64");
                int e9 = px0.m25190e(c, "isLinked");
                int e10 = px0.m25190e(c, "order");
                int e11 = px0.m25190e(c, "isPrimaryWallet");
                int e12 = px0.m25190e(c, "myCoinType");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        l = null;
                    } else {
                        l = Long.valueOf(c.getLong(e));
                    }
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e6);
                    }
                    if (c.isNull(e7)) {
                        str6 = null;
                    } else {
                        str6 = c.getString(e7);
                    }
                    if (c.isNull(e8)) {
                        str7 = null;
                    } else {
                        str7 = c.getString(e8);
                    }
                    int i = c.getInt(e9);
                    int i2 = c.getInt(e10);
                    if (c.getInt(e11) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c.isNull(e12)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(c.getInt(e12));
                    }
                    arrayList.add(new Wallet(l, str, str2, str3, str4, str5, str6, str7, i, i2, z, num));
                }
                return arrayList;
            } finally {
                c.close();
                this.f38713a.mo22765f();
            }
        }
    }

    /* renamed from: jh7$i */
    /* compiled from: WalletDao_Impl */
    public class C7288i implements Callable<Wallet> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f38715a;

        public C7288i(lh5 lh5) {
            this.f38715a = lh5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: net.safemoon.androidwallet.model.wallets.Wallet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: net.safemoon.androidwallet.model.wallets.Wallet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: net.safemoon.androidwallet.model.wallets.Wallet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: net.safemoon.androidwallet.model.wallets.Wallet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: net.safemoon.androidwallet.model.wallets.Wallet} */
        /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Integer] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public net.safemoon.androidwallet.model.wallets.Wallet call() throws java.lang.Exception {
            /*
                r29 = this;
                r1 = r29
                jh7 r0 = p000.jh7.this
                androidx.room.RoomDatabase r0 = r0.f38680a
                lh5 r2 = r1.f38715a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = p000.iz0.m19913c(r0, r2, r3, r4)
                java.lang.String r0 = "_id"
                int r0 = p000.px0.m25190e(r2, r0)     // Catch:{ all -> 0x010d }
                java.lang.String r5 = "name"
                int r5 = p000.px0.m25190e(r2, r5)     // Catch:{ all -> 0x010d }
                java.lang.String r6 = "prefix"
                int r6 = p000.px0.m25190e(r2, r6)     // Catch:{ all -> 0x010d }
                java.lang.String r7 = "privateKey"
                int r7 = p000.px0.m25190e(r2, r7)     // Catch:{ all -> 0x010d }
                java.lang.String r8 = "address"
                int r8 = p000.px0.m25190e(r2, r8)     // Catch:{ all -> 0x010d }
                java.lang.String r9 = "passPhrase"
                int r9 = p000.px0.m25190e(r2, r9)     // Catch:{ all -> 0x010d }
                java.lang.String r10 = "ka"
                int r10 = p000.px0.m25190e(r2, r10)     // Catch:{ all -> 0x010d }
                java.lang.String r11 = "u5b64"
                int r11 = p000.px0.m25190e(r2, r11)     // Catch:{ all -> 0x010d }
                java.lang.String r12 = "isLinked"
                int r12 = p000.px0.m25190e(r2, r12)     // Catch:{ all -> 0x010d }
                java.lang.String r13 = "order"
                int r13 = p000.px0.m25190e(r2, r13)     // Catch:{ all -> 0x010d }
                java.lang.String r14 = "isPrimaryWallet"
                int r14 = p000.px0.m25190e(r2, r14)     // Catch:{ all -> 0x010d }
                java.lang.String r15 = "myCoinType"
                int r15 = p000.px0.m25190e(r2, r15)     // Catch:{ all -> 0x010d }
                boolean r16 = r2.moveToFirst()     // Catch:{ all -> 0x010d }
                if (r16 == 0) goto L_0x0104
                boolean r16 = r2.isNull(r0)     // Catch:{ all -> 0x010d }
                if (r16 == 0) goto L_0x0067
                r17 = r4
                goto L_0x0071
            L_0x0067:
                long r16 = r2.getLong(r0)     // Catch:{ all -> 0x010d }
                java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x010d }
                r17 = r0
            L_0x0071:
                boolean r0 = r2.isNull(r5)     // Catch:{ all -> 0x010d }
                if (r0 == 0) goto L_0x007a
                r18 = r4
                goto L_0x0080
            L_0x007a:
                java.lang.String r0 = r2.getString(r5)     // Catch:{ all -> 0x010d }
                r18 = r0
            L_0x0080:
                boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x010d }
                if (r0 == 0) goto L_0x0089
                r19 = r4
                goto L_0x008f
            L_0x0089:
                java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x010d }
                r19 = r0
            L_0x008f:
                boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x010d }
                if (r0 == 0) goto L_0x0098
                r20 = r4
                goto L_0x009e
            L_0x0098:
                java.lang.String r0 = r2.getString(r7)     // Catch:{ all -> 0x010d }
                r20 = r0
            L_0x009e:
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x010d }
                if (r0 == 0) goto L_0x00a7
                r21 = r4
                goto L_0x00ad
            L_0x00a7:
                java.lang.String r0 = r2.getString(r8)     // Catch:{ all -> 0x010d }
                r21 = r0
            L_0x00ad:
                boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x010d }
                if (r0 == 0) goto L_0x00b6
                r22 = r4
                goto L_0x00bc
            L_0x00b6:
                java.lang.String r0 = r2.getString(r9)     // Catch:{ all -> 0x010d }
                r22 = r0
            L_0x00bc:
                boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x010d }
                if (r0 == 0) goto L_0x00c5
                r23 = r4
                goto L_0x00cb
            L_0x00c5:
                java.lang.String r0 = r2.getString(r10)     // Catch:{ all -> 0x010d }
                r23 = r0
            L_0x00cb:
                boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x010d }
                if (r0 == 0) goto L_0x00d4
                r24 = r4
                goto L_0x00da
            L_0x00d4:
                java.lang.String r0 = r2.getString(r11)     // Catch:{ all -> 0x010d }
                r24 = r0
            L_0x00da:
                int r25 = r2.getInt(r12)     // Catch:{ all -> 0x010d }
                int r26 = r2.getInt(r13)     // Catch:{ all -> 0x010d }
                int r0 = r2.getInt(r14)     // Catch:{ all -> 0x010d }
                if (r0 == 0) goto L_0x00e9
                r3 = 1
            L_0x00e9:
                r27 = r3
                boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x010d }
                if (r0 == 0) goto L_0x00f4
            L_0x00f1:
                r28 = r4
                goto L_0x00fd
            L_0x00f4:
                int r0 = r2.getInt(r15)     // Catch:{ all -> 0x010d }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x010d }
                goto L_0x00f1
            L_0x00fd:
                net.safemoon.androidwallet.model.wallets.Wallet r4 = new net.safemoon.androidwallet.model.wallets.Wallet     // Catch:{ all -> 0x010d }
                r16 = r4
                r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x010d }
            L_0x0104:
                r2.close()
                lh5 r0 = r1.f38715a
                r0.mo22765f()
                return r4
            L_0x010d:
                r0 = move-exception
                r2.close()
                lh5 r2 = r1.f38715a
                r2.mo22765f()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.jh7.C7288i.call():net.safemoon.androidwallet.model.wallets.Wallet");
        }
    }

    /* renamed from: jh7$j */
    /* compiled from: WalletDao_Impl */
    public class C7289j implements Callable<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f38717a;

        public C7289j(lh5 lh5) {
            this.f38717a = lh5;
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            Integer num;
            boolean z = false;
            Boolean bool = null;
            Cursor c = iz0.m19913c(jh7.this.f38680a, this.f38717a, false, (CancellationSignal) null);
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
                this.f38717a.mo22765f();
            }
        }
    }

    /* renamed from: jh7$k */
    /* compiled from: WalletDao_Impl */
    public class C7290k extends vq1<Wallet> {
        public C7290k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR REPLACE INTO `table_wallet` (`_id`,`name`,`prefix`,`privateKey`,`address`,`passPhrase`,`ka`,`u5b64`,`isLinked`,`order`,`isPrimaryWallet`,`myCoinType`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, Wallet wallet2) {
            if (wallet2.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, wallet2.getId().longValue());
            }
            if (wallet2.getName() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, wallet2.getName());
            }
            if (wallet2.getPrefix() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, wallet2.getPrefix());
            }
            if (wallet2.getPrivateKey() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, wallet2.getPrivateKey());
            }
            if (wallet2.getAddress() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, wallet2.getAddress());
            }
            if (wallet2.getPassPhrase() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, wallet2.getPassPhrase());
            }
            if (wallet2.getKA() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, wallet2.getKA());
            }
            if (wallet2.getU5B64() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, wallet2.getU5B64());
            }
            supportSQLiteStatement.bindLong(9, (long) wallet2.getLinkedState());
            supportSQLiteStatement.bindLong(10, (long) wallet2.getOrder());
            supportSQLiteStatement.bindLong(11, wallet2.isPrimaryWallet() ? 1 : 0);
            if (wallet2.getMyCoinType() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindLong(12, (long) wallet2.getMyCoinType().intValue());
            }
        }
    }

    /* renamed from: jh7$l */
    /* compiled from: WalletDao_Impl */
    public class C7291l extends uq1<Wallet> {
        public C7291l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM `table_wallet` WHERE `_id` = ?";
        }

        /* renamed from: k */
        public void mo26841i(SupportSQLiteStatement supportSQLiteStatement, Wallet wallet2) {
            if (wallet2.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, wallet2.getId().longValue());
            }
        }
    }

    /* renamed from: jh7$m */
    /* compiled from: WalletDao_Impl */
    public class C7292m extends SharedSQLiteStatement {
        public C7292m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_wallet SET name = ?, isLinked = ? WHERE _id=?";
        }
    }

    /* renamed from: jh7$n */
    /* compiled from: WalletDao_Impl */
    public class C7293n extends SharedSQLiteStatement {
        public C7293n(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_wallet SET name = ? WHERE _id=?";
        }
    }

    /* renamed from: jh7$o */
    /* compiled from: WalletDao_Impl */
    public class C7294o extends SharedSQLiteStatement {
        public C7294o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_wallet SET isLinked = ? WHERE _id=?";
        }
    }

    /* renamed from: jh7$p */
    /* compiled from: WalletDao_Impl */
    public class C7295p extends SharedSQLiteStatement {
        public C7295p(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_wallet SET ka = ?, u5b64= ?, privateKey=?, passPhrase=?, `order`=?, name=? WHERE _id=?";
        }
    }

    /* renamed from: jh7$q */
    /* compiled from: WalletDao_Impl */
    public class C7296q extends SharedSQLiteStatement {
        public C7296q(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_wallet SET `order` = ? WHERE _id=?";
        }
    }

    /* renamed from: jh7$r */
    /* compiled from: WalletDao_Impl */
    public class C7297r implements Callable<Long> {

        /* renamed from: a */
        public final /* synthetic */ Wallet f38726a;

        public C7297r(Wallet wallet2) {
            this.f38726a = wallet2;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            jh7.this.f38680a.mo10119e();
            try {
                long l = jh7.this.f38681b.mo27298l(this.f38726a);
                jh7.this.f38680a.mo10115C();
                return Long.valueOf(l);
            } finally {
                jh7.this.f38680a.mo10124j();
            }
        }
    }

    /* renamed from: jh7$s */
    /* compiled from: WalletDao_Impl */
    public class C7298s implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ Wallet f38728a;

        public C7298s(Wallet wallet2) {
            this.f38728a = wallet2;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            jh7.this.f38680a.mo10119e();
            try {
                jh7.this.f38682c.mo26842j(this.f38728a);
                jh7.this.f38680a.mo10115C();
                return r37.f33317a;
            } finally {
                jh7.this.f38680a.mo10124j();
            }
        }
    }

    public jh7(RoomDatabase roomDatabase) {
        this.f38680a = roomDatabase;
        this.f38681b = new C7290k(roomDatabase);
        this.f38682c = new C7291l(roomDatabase);
        this.f38683d = new C7292m(roomDatabase);
        this.f38684e = new C7293n(roomDatabase);
        this.f38685f = new C7294o(roomDatabase);
        this.f38686g = new C7295p(roomDatabase);
        this.f38687h = new C7296q(roomDatabase);
    }

    /* renamed from: u */
    public static List<Class<?>> m59396u() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public Object mo52474a(long j, int i, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f38680a, true, new C7284e(i, j), ns0);
    }

    /* renamed from: b */
    public Object mo52475b(String str, ns0<? super Boolean> ns0) {
        lh5 a = lh5.m21448a("SELECT EXISTS (SELECT 1 FROM table_wallet WHERE UPPER(address) = UPPER(?))", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        return CoroutinesRoom.m9773a(this.f38680a, false, iz0.m19911a(), new C7289j(a), ns0);
    }

    /* renamed from: c */
    public LiveData<List<Wallet>> mo52476c() {
        return this.f38680a.mo10128n().mo20867d(new String[]{"table_wallet"}, false, new C7285f(lh5.m21448a("SELECT * FROM table_wallet ORDER BY `order` ASC", 0)));
    }

    /* renamed from: d */
    public Object mo52477d(Wallet wallet2, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f38680a, true, new C7298s(wallet2), ns0);
    }

    /* renamed from: e */
    public Object mo52478e(long j, String str, int i, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f38680a, true, new C7280a(str, i, j), ns0);
    }

    /* renamed from: f */
    public Object mo52479f(long j, ns0<? super Wallet> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_wallet where _id=?", 1);
        a.bindLong(1, j);
        return CoroutinesRoom.m9773a(this.f38680a, false, iz0.m19911a(), new C7288i(a), ns0);
    }

    /* renamed from: g */
    public Object mo52480g(Wallet wallet2, ns0<? super Long> ns0) {
        return CoroutinesRoom.m9774b(this.f38680a, true, new C7297r(wallet2), ns0);
    }

    /* renamed from: h */
    public Object mo52481h(long j, String str, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f38680a, true, new C7281b(str, j), ns0);
    }

    /* renamed from: i */
    public Object mo52482i(long j, String str, String str2, String str3, String str4, int i, String str5, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f38680a, true, new C7283d(str3, str4, str, str2, i, str5, j), ns0);
    }

    /* renamed from: j */
    public Object mo52483j(long j, int i, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f38680a, true, new C7282c(i, j), ns0);
    }

    /* renamed from: k */
    public LiveData<Integer> mo52484k() {
        return this.f38680a.mo10128n().mo20867d(new String[]{"table_wallet"}, false, new C7286g(lh5.m21448a("SELECT COUNT(*) FROM table_wallet", 0)));
    }

    /* renamed from: l */
    public Object mo52485l(ns0<? super List<Wallet>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_wallet ORDER BY `order` ASC", 0);
        return CoroutinesRoom.m9773a(this.f38680a, false, iz0.m19911a(), new C7287h(a), ns0);
    }
}
