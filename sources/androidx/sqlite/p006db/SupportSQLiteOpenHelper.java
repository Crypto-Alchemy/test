package androidx.sqlite.p006db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.sqlcipher.database.SQLiteDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H&R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, mo44877d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ljava/io/Closeable;", "", "enabled", "Lr37;", "setWriteAheadLoggingEnabled", "close", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "a", "Configuration", "b", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper */
/* compiled from: SupportSQLiteOpenHelper.kt */
public interface SupportSQLiteOpenHelper extends Closeable {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0002\u0003\u0007B5\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, mo44877d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "", "b", "Ljava/lang/String;", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "c", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "callback", "", "d", "Z", "useNoBackupDirectory", "e", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;ZZ)V", "f", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration */
    /* compiled from: SupportSQLiteOpenHelper.kt */
    public static final class Configuration {

        /* renamed from: f */
        public static final C1389b f6976f = new C1389b((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final Context f6977a;

        /* renamed from: b */
        public final String f6978b;

        /* renamed from: c */
        public final C1390a f6979c;

        /* renamed from: d */
        public final boolean f6980d;

        /* renamed from: e */
        public final boolean f6981e;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0017"}, mo44877d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;", "", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "a", "", "name", "c", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "callback", "b", "", "useNoBackupDirectory", "d", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Ljava/lang/String;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "Z", "e", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;)V", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$a */
        /* compiled from: SupportSQLiteOpenHelper.kt */
        public static class C1388a {

            /* renamed from: a */
            public final Context f6982a;

            /* renamed from: b */
            public String f6983b;

            /* renamed from: c */
            public C1390a f6984c;

            /* renamed from: d */
            public boolean f6985d;

            /* renamed from: e */
            public boolean f6986e;

            public C1388a(Context context) {
                vx2.m53591g(context, "context");
                this.f6982a = context;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
                if (r0 == false) goto L_0x001a;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.sqlite.p006db.SupportSQLiteOpenHelper.Configuration mo10271a() {
                /*
                    r7 = this;
                    androidx.sqlite.db.SupportSQLiteOpenHelper$a r3 = r7.f6984c
                    if (r3 == 0) goto L_0x0038
                    boolean r0 = r7.f6985d
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L_0x001a
                    java.lang.String r0 = r7.f6983b
                    if (r0 == 0) goto L_0x0017
                    int r0 = r0.length()
                    if (r0 != 0) goto L_0x0015
                    goto L_0x0017
                L_0x0015:
                    r0 = r1
                    goto L_0x0018
                L_0x0017:
                    r0 = r2
                L_0x0018:
                    if (r0 != 0) goto L_0x001b
                L_0x001a:
                    r1 = r2
                L_0x001b:
                    if (r1 == 0) goto L_0x002c
                    androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration r6 = new androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration
                    android.content.Context r1 = r7.f6982a
                    java.lang.String r2 = r7.f6983b
                    boolean r4 = r7.f6985d
                    boolean r5 = r7.f6986e
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r6
                L_0x002c:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Must set a non-null database name to a configuration that uses the no backup directory."
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L_0x0038:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Must set a callback to create the configuration."
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p006db.SupportSQLiteOpenHelper.Configuration.C1388a.mo10271a():androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration");
            }

            /* renamed from: b */
            public C1388a mo10272b(C1390a aVar) {
                vx2.m53591g(aVar, "callback");
                this.f6984c = aVar;
                return this;
            }

            /* renamed from: c */
            public C1388a mo10273c(String str) {
                this.f6983b = str;
                return this;
            }

            /* renamed from: d */
            public C1388a mo10274d(boolean z) {
                this.f6985d = z;
                return this;
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, mo44877d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$b;", "", "Landroid/content/Context;", "context", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;", "a", "<init>", "()V", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$b */
        /* compiled from: SupportSQLiteOpenHelper.kt */
        public static final class C1389b {
            public C1389b() {
            }

            public /* synthetic */ C1389b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C1388a mo10275a(Context context) {
                vx2.m53591g(context, "context");
                return new C1388a(context);
            }
        }

        public Configuration(Context context, String str, C1390a aVar, boolean z, boolean z2) {
            vx2.m53591g(context, "context");
            vx2.m53591g(aVar, "callback");
            this.f6977a = context;
            this.f6978b = str;
            this.f6979c = aVar;
            this.f6980d = z;
            this.f6981e = z2;
        }

        /* renamed from: a */
        public static final C1388a m9911a(Context context) {
            return f6976f.mo10275a(context);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u0000 \u00052\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "Lr37;", "b", "d", "", "oldVersion", "newVersion", "g", "e", "f", "c", "", "fileName", "a", "I", "version", "<init>", "(I)V", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$a */
    /* compiled from: SupportSQLiteOpenHelper.kt */
    public static abstract class C1390a {

        /* renamed from: b */
        public static final C1391a f6987b = new C1391a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final int f6988a;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$a$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$a$a */
        /* compiled from: SupportSQLiteOpenHelper.kt */
        public static final class C1391a {
            public C1391a() {
            }

            public /* synthetic */ C1391a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C1390a(int i) {
            this.f6988a = i;
        }

        /* renamed from: a */
        public final void mo10276a(String str) {
            int i;
            boolean z;
            boolean z2 = true;
            if (!yb6.m74344y(str, SQLiteDatabase.MEMORY, true)) {
                int length = str.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length) {
                    if (!z3) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (vx2.m53593i(str.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z3) {
                        if (!z) {
                            z3 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i2, length + 1).toString().length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("deleting the database file: ");
                    sb.append(str);
                    try {
                        be6.m11298c(new File(str));
                    } catch (Exception unused) {
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo10277b(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "db");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
            if (r1 != null) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            r4 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            if (r4.hasNext() != false) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
            r1 = ((android.util.Pair) r4.next()).second;
            p000.vx2.m53590f(r1, "p.second");
            mo10276a((java.lang.String) r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
            r4 = r4.getPath();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
            if (r4 != null) goto L_0x0058;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
            mo10276a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0031 */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002f A[ExcHandler: all (r2v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
          PHI: (r1v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r1v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:6:0x002a, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:6:0x002a] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10278c(androidx.sqlite.p006db.SupportSQLiteDatabase r4) {
            /*
                r3 = this;
                java.lang.String r0 = "p.second"
                java.lang.String r1 = "db"
                p000.vx2.m53591g(r4, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Corruption reported by sqlite on database: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ".path"
                r1.append(r2)
                boolean r1 = r4.isOpen()
                if (r1 != 0) goto L_0x0029
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L_0x0028
                r3.mo10276a(r4)
            L_0x0028:
                return
            L_0x0029:
                r1 = 0
                java.util.List r1 = r4.getAttachedDbs()     // Catch:{ SQLiteException -> 0x0031, all -> 0x002f }
                goto L_0x0031
            L_0x002f:
                r2 = move-exception
                goto L_0x0035
            L_0x0031:
                r4.close()     // Catch:{ IOException -> 0x005c, all -> 0x002f }
                goto L_0x005c
            L_0x0035:
                if (r1 == 0) goto L_0x0052
                java.util.Iterator r4 = r1.iterator()
            L_0x003b:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x005b
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                p000.vx2.m53590f(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.mo10276a(r1)
                goto L_0x003b
            L_0x0052:
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L_0x005b
                r3.mo10276a(r4)
            L_0x005b:
                throw r2
            L_0x005c:
                if (r1 == 0) goto L_0x0079
                java.util.Iterator r4 = r1.iterator()
            L_0x0062:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x0082
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                p000.vx2.m53590f(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.mo10276a(r1)
                goto L_0x0062
            L_0x0079:
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L_0x0082
                r3.mo10276a(r4)
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p006db.SupportSQLiteOpenHelper.C1390a.mo10278c(androidx.sqlite.db.SupportSQLiteDatabase):void");
        }

        /* renamed from: d */
        public abstract void mo10279d(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: e */
        public void mo10280e(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            vx2.m53591g(supportSQLiteDatabase, "db");
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        /* renamed from: f */
        public void mo10281f(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "db");
        }

        /* renamed from: g */
        public abstract void mo10282g(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, mo44877d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "configuration", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "create", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$b */
    /* compiled from: SupportSQLiteOpenHelper.kt */
    public interface C1392b {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
