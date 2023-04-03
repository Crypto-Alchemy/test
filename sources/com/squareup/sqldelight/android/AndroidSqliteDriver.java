package com.squareup.sqldelight.android;

import android.content.Context;
import android.util.LruCache;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.util.Arrays;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.m76;
import p000.nt6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001+\u0018\u00002\u00020\u0001:\u0002\u001d=B)\b\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010&\u0012\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b/\u00100BM\b\u0017\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u00107\u001a\u000206\u0012\b\b\u0002\u00109\u001a\u000208\u0012\b\b\u0002\u0010!\u001a\u00020\u0006\u0012\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b/\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002H\u0016J?\u0010\u000f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\rH\u0016JW\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006>"}, mo44877d2 = {"Lcom/squareup/sqldelight/android/AndroidSqliteDriver;", "Lm76;", "Lnt6$b;", "v0", "kotlin.jvm.PlatformType", "H0", "", "identifier", "", "sql", "parameters", "Lkotlin/Function1;", "Lo76;", "Lr37;", "binders", "m1", "(Ljava/lang/Integer;Ljava/lang/String;ILrc2;)V", "Ll76;", "r0", "(Ljava/lang/Integer;Ljava/lang/String;ILrc2;)Ll76;", "close", "T", "Lkotlin/Function0;", "Lkj;", "createStatement", "result", "d", "(Ljava/lang/Integer;Lpc2;Lrc2;Lrc2;)Ljava/lang/Object;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "a", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "openHelper", "I", "cacheSize", "Ljava/lang/ThreadLocal;", "e", "Ljava/lang/ThreadLocal;", "transactions", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "g", "Lef3;", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "com/squareup/sqldelight/android/AndroidSqliteDriver$c", "k", "Lcom/squareup/sqldelight/android/AndroidSqliteDriver$c;", "statements", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Landroidx/sqlite/db/SupportSQLiteDatabase;I)V", "Lm76$b;", "schema", "Landroid/content/Context;", "context", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "factory", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "callback", "", "useNoBackupDirectory", "(Lm76$b;Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;IZ)V", "b", "sqldelight-android-driver_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* compiled from: AndroidSqliteDriver.kt */
public final class AndroidSqliteDriver implements m76 {

    /* renamed from: a */
    public final SupportSQLiteOpenHelper f26951a;

    /* renamed from: d */
    public final int f26952d;

    /* renamed from: e */
    public final ThreadLocal<nt6.C6292b> f26953e;

    /* renamed from: g */
    public final ef3 f26954g;

    /* renamed from: k */
    public final C5466c f26955k;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0014X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Lcom/squareup/sqldelight/android/AndroidSqliteDriver$b;", "Lnt6$b;", "", "successful", "Lr37;", "f", "h", "Lnt6$b;", "i", "()Lnt6$b;", "enclosingTransaction", "<init>", "(Lcom/squareup/sqldelight/android/AndroidSqliteDriver;Lnt6$b;)V", "sqldelight-android-driver_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: com.squareup.sqldelight.android.AndroidSqliteDriver$b */
    /* compiled from: AndroidSqliteDriver.kt */
    public final class C5465b extends nt6.C6292b {

        /* renamed from: h */
        public final nt6.C6292b f26958h;

        /* renamed from: i */
        public final /* synthetic */ AndroidSqliteDriver f26959i;

        public C5465b(AndroidSqliteDriver androidSqliteDriver, nt6.C6292b bVar) {
            vx2.m53591g(androidSqliteDriver, "this$0");
            this.f26959i = androidSqliteDriver;
            this.f26958h = bVar;
        }

        /* renamed from: f */
        public void mo39624f(boolean z) {
            if (mo39625i() == null) {
                if (z) {
                    this.f26959i.mo39620e().setTransactionSuccessful();
                    this.f26959i.mo39620e().endTransaction();
                } else {
                    this.f26959i.mo39620e().endTransaction();
                }
            }
            this.f26959i.f26953e.set(mo39625i());
        }

        /* renamed from: i */
        public nt6.C6292b mo39625i() {
            return this.f26958h;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\u000b"}, mo44877d2 = {"com/squareup/sqldelight/android/AndroidSqliteDriver$c", "Landroid/util/LruCache;", "", "Lkj;", "", "evicted", "key", "oldValue", "newValue", "Lr37;", "a", "sqldelight-android-driver_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: com.squareup.sqldelight.android.AndroidSqliteDriver$c */
    /* compiled from: AndroidSqliteDriver.kt */
    public static final class C5466c extends LruCache<Integer, C6155kj> {
        public C5466c(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo39626a(boolean z, int i, C6155kj kjVar, C6155kj kjVar2) {
            vx2.m53591g(kjVar, "oldValue");
            if (z) {
                kjVar.close();
            }
        }

        public /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            mo39626a(z, ((Number) obj).intValue(), (C6155kj) obj2, (C6155kj) obj3);
        }
    }

    public AndroidSqliteDriver(SupportSQLiteOpenHelper supportSQLiteOpenHelper, SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        this.f26951a = supportSQLiteOpenHelper;
        this.f26952d = i;
        if ((supportSQLiteOpenHelper != null) ^ (supportSQLiteDatabase == null ? false : true)) {
            this.f26953e = new ThreadLocal<>();
            this.f26954g = C6169a.m47232a(new AndroidSqliteDriver$database$2(this, supportSQLiteDatabase));
            this.f26955k = new C5466c(i);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public /* synthetic */ AndroidSqliteDriver(SupportSQLiteOpenHelper supportSQLiteOpenHelper, SupportSQLiteDatabase supportSQLiteDatabase, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(supportSQLiteOpenHelper, supportSQLiteDatabase, i);
    }

    /* renamed from: H0 */
    public nt6.C6292b mo39617H0() {
        return this.f26953e.get();
    }

    public void close() {
        r37 r37;
        this.f26955k.evictAll();
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f26951a;
        if (supportSQLiteOpenHelper == null) {
            r37 = null;
        } else {
            supportSQLiteOpenHelper.close();
            r37 = r37.f33317a;
        }
        if (r37 == null) {
            mo39620e().close();
        }
    }

    /* renamed from: d */
    public final <T> T mo39619d(Integer num, pc2<? extends C6155kj> pc2, rc2<? super o76, r37> rc2, rc2<? super C6155kj, ? extends T> rc22) {
        C6155kj kjVar;
        if (num != null) {
            kjVar = (C6155kj) this.f26955k.remove(num);
        } else {
            kjVar = null;
        }
        if (kjVar == null) {
            kjVar = (C6155kj) pc2.invoke();
        }
        if (rc2 != null) {
            try {
                rc2.invoke(kjVar);
            } catch (Throwable th) {
                if (num != null) {
                    C6155kj kjVar2 = (C6155kj) this.f26955k.put(num, kjVar);
                    if (kjVar2 != null) {
                        kjVar2.close();
                    }
                } else {
                    kjVar.close();
                }
                throw th;
            }
        }
        T invoke = rc22.invoke(kjVar);
        if (num != null) {
            C6155kj kjVar3 = (C6155kj) this.f26955k.put(num, kjVar);
            if (kjVar3 != null) {
                kjVar3.close();
            }
        } else {
            kjVar.close();
        }
        return invoke;
    }

    /* renamed from: e */
    public final SupportSQLiteDatabase mo39620e() {
        return (SupportSQLiteDatabase) this.f26954g.getValue();
    }

    /* renamed from: m1 */
    public void mo39621m1(Integer num, String str, int i, rc2<? super o76, r37> rc2) {
        vx2.m53591g(str, "sql");
        mo39619d(num, new AndroidSqliteDriver$execute$1(this, str), rc2, AndroidSqliteDriver$execute$2.INSTANCE);
    }

    /* renamed from: r0 */
    public l76 mo39622r0(Integer num, String str, int i, rc2<? super o76, r37> rc2) {
        vx2.m53591g(str, "sql");
        return (l76) mo39619d(num, new AndroidSqliteDriver$executeQuery$1(str, this, i), rc2, AndroidSqliteDriver$executeQuery$2.INSTANCE);
    }

    /* renamed from: v0 */
    public nt6.C6292b mo39623v0() {
        nt6.C6292b bVar = this.f26953e.get();
        C5465b bVar2 = new C5465b(this, bVar);
        this.f26953e.set(bVar2);
        if (bVar == null) {
            mo39620e().beginTransactionNonExclusive();
        }
        return bVar2;
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0015"}, mo44877d2 = {"Lcom/squareup/sqldelight/android/AndroidSqliteDriver$a;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "Lr37;", "d", "", "oldVersion", "newVersion", "g", "Lm76$b;", "c", "Lm76$b;", "schema", "", "Lwe;", "[Lwe;", "callbacks", "<init>", "(Lm76$b;[Lwe;)V", "(Lm76$b;)V", "sqldelight-android-driver_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: com.squareup.sqldelight.android.AndroidSqliteDriver$a */
    /* compiled from: AndroidSqliteDriver.kt */
    public static class C5464a extends SupportSQLiteOpenHelper.C1390a {

        /* renamed from: c */
        public final m76.C6236b f26956c;

        /* renamed from: d */
        public final C6660we[] f26957d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5464a(m76.C6236b bVar, C6660we... weVarArr) {
            super(bVar.getVersion());
            vx2.m53591g(bVar, "schema");
            vx2.m53591g(weVarArr, "callbacks");
            this.f26956c = bVar;
            this.f26957d = weVarArr;
        }

        /* renamed from: d */
        public void mo10279d(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "db");
            this.f26956c.mo30018a(new AndroidSqliteDriver((SupportSQLiteOpenHelper) null, supportSQLiteDatabase, 1, (DefaultConstructorMarker) null));
        }

        /* renamed from: g */
        public void mo10282g(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            boolean z;
            vx2.m53591g(supportSQLiteDatabase, "db");
            if (this.f26957d.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m76.C6236b bVar = this.f26956c;
                AndroidSqliteDriver androidSqliteDriver = new AndroidSqliteDriver((SupportSQLiteOpenHelper) null, supportSQLiteDatabase, 1, (DefaultConstructorMarker) null);
                C6660we[] weVarArr = this.f26957d;
                n76.m48675a(bVar, androidSqliteDriver, i, i2, (C6660we[]) Arrays.copyOf(weVarArr, weVarArr.length));
                return;
            }
            this.f26956c.mo30019b(new AndroidSqliteDriver((SupportSQLiteOpenHelper) null, supportSQLiteDatabase, 1, (DefaultConstructorMarker) null), i, i2);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C5464a(m76.C6236b bVar) {
            this(bVar, (C6660we[]) Arrays.copyOf(new C6660we[0], 0));
            vx2.m53591g(bVar, "schema");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AndroidSqliteDriver(p000.m76.C6236b r10, android.content.Context r11, java.lang.String r12, androidx.sqlite.p006db.SupportSQLiteOpenHelper.C1392b r13, androidx.sqlite.p006db.SupportSQLiteOpenHelper.C1390a r14, int r15, boolean r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 4
            if (r0 == 0) goto L_0x0007
            r0 = 0
            r4 = r0
            goto L_0x0008
        L_0x0007:
            r4 = r12
        L_0x0008:
            r0 = r17 & 8
            if (r0 == 0) goto L_0x0013
            fc2 r0 = new fc2
            r0.<init>()
            r5 = r0
            goto L_0x0014
        L_0x0013:
            r5 = r13
        L_0x0014:
            r0 = r17 & 16
            if (r0 == 0) goto L_0x0020
            com.squareup.sqldelight.android.AndroidSqliteDriver$a r0 = new com.squareup.sqldelight.android.AndroidSqliteDriver$a
            r2 = r10
            r0.<init>(r10)
            r6 = r0
            goto L_0x0022
        L_0x0020:
            r2 = r10
            r6 = r14
        L_0x0022:
            r0 = r17 & 32
            if (r0 == 0) goto L_0x002c
            int r0 = p000.C6101jj.m46523a()
            r7 = r0
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r0 = r17 & 64
            if (r0 == 0) goto L_0x0034
            r0 = 0
            r8 = r0
            goto L_0x0036
        L_0x0034:
            r8 = r16
        L_0x0036:
            r1 = r9
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.sqldelight.android.AndroidSqliteDriver.<init>(m76$b, android.content.Context, java.lang.String, androidx.sqlite.db.SupportSQLiteOpenHelper$b, androidx.sqlite.db.SupportSQLiteOpenHelper$a, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(m76.C6236b bVar, Context context, String str, SupportSQLiteOpenHelper.C1392b bVar2, SupportSQLiteOpenHelper.C1390a aVar, int i, boolean z) {
        this(bVar2.create(SupportSQLiteOpenHelper.Configuration.m9911a(context).mo10272b(aVar).mo10273c(str).mo10274d(z).mo10271a()), (SupportSQLiteDatabase) null, i);
        vx2.m53591g(bVar, "schema");
        vx2.m53591g(context, "context");
        vx2.m53591g(bVar2, "factory");
        vx2.m53591g(aVar, "callback");
    }
}
