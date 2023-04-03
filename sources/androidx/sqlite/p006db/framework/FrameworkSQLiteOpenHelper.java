package androidx.sqlite.p006db.framework;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.io.File;
import java.util.UUID;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0003\b-.B7\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0016\u0010!\u001a\u0004\u0018\u00010\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020\u00198BX\u0002¢\u0006\f\u001a\u0004\b\u0013\u0010&*\u0004\b'\u0010(¨\u0006/"}, mo44877d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "", "enabled", "Lr37;", "setWriteAheadLoggingEnabled", "close", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "", "d", "Ljava/lang/String;", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "e", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "callback", "g", "Z", "useNoBackupDirectory", "k", "allowDataLossOnRecovery", "Lef3;", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "r", "Lef3;", "lazyDelegate", "s", "writeAheadLoggingEnabled", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "getDelegate$delegate", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;)Ljava/lang/Object;", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;ZZ)V", "x", "b", "OpenHelper", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper */
/* compiled from: FrameworkSQLiteOpenHelper.kt */
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {

    /* renamed from: x */
    public static final C1396a f6994x = new C1396a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final Context f6995a;

    /* renamed from: d */
    public final String f6996d;

    /* renamed from: e */
    public final SupportSQLiteOpenHelper.C1390a f6997e;

    /* renamed from: g */
    public final boolean f6998g;

    /* renamed from: k */
    public final boolean f6999k;

    /* renamed from: r */
    public final ef3<OpenHelper> f7000r = C6169a.m47232a(new FrameworkSQLiteOpenHelper$lazyDelegate$1(this));

    /* renamed from: s */
    public boolean f7001s;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000 82\u00020\u0001:\u00039:\u0018B1\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J \u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010(¨\u0006;"}, mo44877d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "", "writable", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "c", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "d", "Lr37;", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "db", "onConfigure", "onDowngrade", "onOpen", "close", "f", "e", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "getDbRef", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "dbRef", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "getCallback", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "callback", "g", "Z", "getAllowDataLossOnRecovery", "()Z", "allowDataLossOnRecovery", "k", "migrated", "Lov4;", "r", "Lov4;", "lock", "s", "opened", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;Z)V", "x", "CallbackException", "CallbackName", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class OpenHelper extends SQLiteOpenHelper {

        /* renamed from: x */
        public static final C1394a f7002x = new C1394a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final Context f7003a;

        /* renamed from: d */
        public final C1397b f7004d;

        /* renamed from: e */
        public final SupportSQLiteOpenHelper.C1390a f7005e;

        /* renamed from: g */
        public final boolean f7006g;

        /* renamed from: k */
        public boolean f7007k;

        /* renamed from: r */
        public final ov4 f7008r;

        /* renamed from: s */
        public boolean f7009s;

        @Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo44877d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "callbackName", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "cause", "", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;Ljava/lang/Throwable;)V", "getCallbackName", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException */
        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        public static final class CallbackException extends RuntimeException {
            private final CallbackName callbackName;
            private final Throwable cause;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public CallbackException(CallbackName callbackName2, Throwable th) {
                super(th);
                vx2.m53591g(callbackName2, "callbackName");
                vx2.m53591g(th, "cause");
                this.callbackName = callbackName2;
                this.cause = th;
            }

            public final CallbackName getCallbackName() {
                return this.callbackName;
            }

            public Throwable getCause() {
                return this.cause;
            }
        }

        @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo44877d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "(Ljava/lang/String;I)V", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName */
        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, mo44877d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$a;", "", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "a", "<init>", "()V", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$a */
        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        public static final class C1394a {
            public C1394a() {
            }

            public /* synthetic */ C1394a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final FrameworkSQLiteDatabase mo10303a(C1397b bVar, SQLiteDatabase sQLiteDatabase) {
                vx2.m53591g(bVar, "refHolder");
                vx2.m53591g(sQLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase a = bVar.mo10304a();
                if (a != null && a.mo10287c(sQLiteDatabase)) {
                    return a;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sQLiteDatabase);
                bVar.mo10305b(frameworkSQLiteDatabase);
                return frameworkSQLiteDatabase;
            }
        }

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$b */
        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        public /* synthetic */ class C1395b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f7011a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[] r0 = androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f7011a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper.OpenHelper.C1395b.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, C1397b bVar, SupportSQLiteOpenHelper.C1390a aVar, boolean z) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f6988a, new ec2(aVar, bVar));
            vx2.m53591g(context, "context");
            vx2.m53591g(bVar, "dbRef");
            vx2.m53591g(aVar, "callback");
            this.f7003a = context;
            this.f7004d = bVar;
            this.f7005e = aVar;
            this.f7006g = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                vx2.m53590f(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            vx2.m53590f(cacheDir, "context.cacheDir");
            this.f7008r = new ov4(str, cacheDir, false);
        }

        /* renamed from: b */
        public static final void m9940b(SupportSQLiteOpenHelper.C1390a aVar, C1397b bVar, SQLiteDatabase sQLiteDatabase) {
            vx2.m53591g(aVar, "$callback");
            vx2.m53591g(bVar, "$dbRef");
            C1394a aVar2 = f7002x;
            vx2.m53590f(sQLiteDatabase, "dbObj");
            aVar.mo10278c(aVar2.mo10303a(bVar, sQLiteDatabase));
        }

        /* renamed from: c */
        public final SupportSQLiteDatabase mo10291c(boolean z) {
            boolean z2;
            try {
                ov4 ov4 = this.f7008r;
                if (this.f7009s || getDatabaseName() == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ov4.mo24120b(z2);
                this.f7007k = false;
                SQLiteDatabase f = mo10295f(z);
                if (this.f7007k) {
                    close();
                    return mo10291c(z);
                }
                FrameworkSQLiteDatabase d = mo10293d(f);
                this.f7008r.mo24121d();
                return d;
            } finally {
                this.f7008r.mo24121d();
            }
        }

        public void close() {
            try {
                ov4.m24065c(this.f7008r, false, 1, (Object) null);
                super.close();
                this.f7004d.mo10305b((FrameworkSQLiteDatabase) null);
                this.f7009s = false;
            } finally {
                this.f7008r.mo24121d();
            }
        }

        /* renamed from: d */
        public final FrameworkSQLiteDatabase mo10293d(SQLiteDatabase sQLiteDatabase) {
            vx2.m53591g(sQLiteDatabase, "sqLiteDatabase");
            return f7002x.mo10303a(this.f7004d, sQLiteDatabase);
        }

        /* renamed from: e */
        public final SQLiteDatabase mo10294e(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                vx2.m53590f(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            vx2.m53590f(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|10|12|13|14|15|16) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0035 */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.database.sqlite.SQLiteDatabase mo10295f(boolean r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getDatabaseName()
                if (r0 == 0) goto L_0x0028
                android.content.Context r1 = r4.f7003a
                java.io.File r1 = r1.getDatabasePath(r0)
                java.io.File r1 = r1.getParentFile()
                if (r1 == 0) goto L_0x0028
                r1.mkdirs()
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L_0x0028
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid database parent file, not a directory: "
                r2.append(r3)
                r2.append(r1)
            L_0x0028:
                android.database.sqlite.SQLiteDatabase r5 = r4.mo10294e(r5)     // Catch:{ all -> 0x002d }
                return r5
            L_0x002d:
                super.close()
                r1 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0035 }
            L_0x0035:
                android.database.sqlite.SQLiteDatabase r5 = r4.mo10294e(r5)     // Catch:{ all -> 0x003a }
                return r5
            L_0x003a:
                r1 = move-exception
                super.close()
                boolean r2 = r1 instanceof androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException
                if (r2 == 0) goto L_0x0067
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException r1 = (androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException) r1
                java.lang.Throwable r2 = r1.getCause()
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = r1.getCallbackName()
                int[] r3 = androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper.OpenHelper.C1395b.f7011a
                int r1 = r1.ordinal()
                r1 = r3[r1]
                r3 = 1
                if (r1 == r3) goto L_0x0066
                r3 = 2
                if (r1 == r3) goto L_0x0066
                r3 = 3
                if (r1 == r3) goto L_0x0066
                r3 = 4
                if (r1 == r3) goto L_0x0066
                boolean r1 = r2 instanceof android.database.sqlite.SQLiteException
                if (r1 == 0) goto L_0x0065
                goto L_0x0071
            L_0x0065:
                throw r2
            L_0x0066:
                throw r2
            L_0x0067:
                boolean r2 = r1 instanceof android.database.sqlite.SQLiteException
                if (r2 == 0) goto L_0x0082
                if (r0 == 0) goto L_0x0081
                boolean r2 = r4.f7006g
                if (r2 == 0) goto L_0x0081
            L_0x0071:
                android.content.Context r1 = r4.f7003a
                r1.deleteDatabase(r0)
                android.database.sqlite.SQLiteDatabase r5 = r4.mo10294e(r5)     // Catch:{ CallbackException -> 0x007b }
                return r5
            L_0x007b:
                r5 = move-exception
                java.lang.Throwable r5 = r5.getCause()
                throw r5
            L_0x0081:
                throw r1
            L_0x0082:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper.OpenHelper.mo10295f(boolean):android.database.sqlite.SQLiteDatabase");
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            vx2.m53591g(sQLiteDatabase, "db");
            try {
                this.f7005e.mo10277b(mo10293d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            vx2.m53591g(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f7005e.mo10279d(mo10293d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            vx2.m53591g(sQLiteDatabase, "db");
            this.f7007k = true;
            try {
                this.f7005e.mo10280e(mo10293d(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            vx2.m53591g(sQLiteDatabase, "db");
            if (!this.f7007k) {
                try {
                    this.f7005e.mo10281f(mo10293d(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.f7009s = true;
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            vx2.m53591g(sQLiteDatabase, "sqLiteDatabase");
            this.f7007k = true;
            try {
                this.f7005e.mo10282g(mo10293d(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$a */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class C1396a {
        public C1396a() {
        }

        public /* synthetic */ C1396a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0007R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "a", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "()Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "b", "(Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;)V", "db", "<init>", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$b */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class C1397b {

        /* renamed from: a */
        public FrameworkSQLiteDatabase f7012a;

        public C1397b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f7012a = frameworkSQLiteDatabase;
        }

        /* renamed from: a */
        public final FrameworkSQLiteDatabase mo10304a() {
            return this.f7012a;
        }

        /* renamed from: b */
        public final void mo10305b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f7012a = frameworkSQLiteDatabase;
        }
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.C1390a aVar, boolean z, boolean z2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(aVar, "callback");
        this.f6995a = context;
        this.f6996d = str;
        this.f6997e = aVar;
        this.f6998g = z;
        this.f6999k = z2;
    }

    public void close() {
        if (this.f7000r.isInitialized()) {
            mo10290g().close();
        }
    }

    /* renamed from: g */
    public final OpenHelper mo10290g() {
        return this.f7000r.getValue();
    }

    public String getDatabaseName() {
        return this.f6996d;
    }

    public SupportSQLiteDatabase getWritableDatabase() {
        return mo10290g().mo10291c(true);
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f7000r.isInitialized()) {
            be6.m11301f(mo10290g(), z);
        }
        this.f7001s = z;
    }
}
