package p000;

import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u0000 \n2\u00020\u0001:\u0003\u001d\u0005\u0011B'\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u001e"}, mo44877d2 = {"Lkh5;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "Lr37;", "b", "d", "", "oldVersion", "newVersion", "g", "e", "f", "h", "j", "i", "Lj21;", "c", "Lj21;", "configuration", "Lkh5$b;", "Lkh5$b;", "delegate", "", "Ljava/lang/String;", "identityHash", "legacyHash", "<init>", "(Lj21;Lkh5$b;Ljava/lang/String;Ljava/lang/String;)V", "a", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: kh5 */
/* compiled from: RoomOpenHelper.kt */
public class kh5 extends SupportSQLiteOpenHelper.C1390a {

    /* renamed from: g */
    public static final C2680a f14082g = new C2680a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public j21 f14083c;

    /* renamed from: d */
    public final C2681b f14084d;

    /* renamed from: e */
    public final String f14085e;

    /* renamed from: f */
    public final String f14086f;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, mo44877d2 = {"Lkh5$a;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "b", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)Z", "a", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kh5$a */
    /* compiled from: RoomOpenHelper.kt */
    public static final class C2680a {
        public C2680a() {
        }

        public /* synthetic */ C2680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            p000.lh0.m47807a(r4, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            throw r1;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo22309a(androidx.sqlite.p006db.SupportSQLiteDatabase r4) {
            /*
                r3 = this;
                java.lang.String r0 = "db"
                p000.vx2.m53591g(r4, r0)
                java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r4 = r4.query((java.lang.String) r0)
                r0 = 0
                boolean r1 = r4.moveToFirst()     // Catch:{ all -> 0x001e }
                r2 = 0
                if (r1 == 0) goto L_0x001a
                int r1 = r4.getInt(r2)     // Catch:{ all -> 0x001e }
                if (r1 != 0) goto L_0x001a
                r2 = 1
            L_0x001a:
                p000.lh0.m47807a(r4, r0)
                return r2
            L_0x001e:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0020 }
            L_0x0020:
                r1 = move-exception
                p000.lh0.m47807a(r4, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.kh5.C2680a.mo22309a(androidx.sqlite.db.SupportSQLiteDatabase):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            p000.lh0.m47807a(r4, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            throw r1;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo22310b(androidx.sqlite.p006db.SupportSQLiteDatabase r4) {
            /*
                r3 = this;
                java.lang.String r0 = "db"
                p000.vx2.m53591g(r4, r0)
                java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                android.database.Cursor r4 = r4.query((java.lang.String) r0)
                r0 = 0
                boolean r1 = r4.moveToFirst()     // Catch:{ all -> 0x001e }
                r2 = 0
                if (r1 == 0) goto L_0x001a
                int r1 = r4.getInt(r2)     // Catch:{ all -> 0x001e }
                if (r1 == 0) goto L_0x001a
                r2 = 1
            L_0x001a:
                p000.lh0.m47807a(r4, r0)
                return r2
            L_0x001e:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0020 }
            L_0x0020:
                r1 = move-exception
                p000.lh0.m47807a(r4, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.kh5.C2680a.mo22310b(androidx.sqlite.db.SupportSQLiteDatabase):boolean");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lkh5$b;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "b", "a", "d", "c", "db", "Lkh5$c;", "g", "f", "e", "", "I", "version", "<init>", "(I)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kh5$b */
    /* compiled from: RoomOpenHelper.kt */
    public static abstract class C2681b {

        /* renamed from: a */
        public final int f14087a;

        public C2681b(int i) {
            this.f14087a = i;
        }

        /* renamed from: a */
        public abstract void mo10957a(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: b */
        public abstract void mo10958b(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: c */
        public abstract void mo10959c(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: d */
        public abstract void mo10960d(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: e */
        public abstract void mo10961e(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: f */
        public abstract void mo10962f(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: g */
        public abstract C2682c mo10963g(SupportSQLiteDatabase supportSQLiteDatabase);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lkh5$c;", "", "", "a", "Z", "isValid", "", "b", "Ljava/lang/String;", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kh5$c */
    /* compiled from: RoomOpenHelper.kt */
    public static class C2682c {

        /* renamed from: a */
        public final boolean f14088a;

        /* renamed from: b */
        public final String f14089b;

        public C2682c(boolean z, String str) {
            this.f14088a = z;
            this.f14089b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kh5(j21 j21, C2681b bVar, String str, String str2) {
        super(bVar.f14087a);
        vx2.m53591g(j21, "configuration");
        vx2.m53591g(bVar, "delegate");
        vx2.m53591g(str, "identityHash");
        vx2.m53591g(str2, "legacyHash");
        this.f14083c = j21;
        this.f14084d = bVar;
        this.f14085e = str;
        this.f14086f = str2;
    }

    /* renamed from: b */
    public void mo10277b(SupportSQLiteDatabase supportSQLiteDatabase) {
        vx2.m53591g(supportSQLiteDatabase, "db");
        super.mo10277b(supportSQLiteDatabase);
    }

    /* renamed from: d */
    public void mo10279d(SupportSQLiteDatabase supportSQLiteDatabase) {
        vx2.m53591g(supportSQLiteDatabase, "db");
        boolean a = f14082g.mo22309a(supportSQLiteDatabase);
        this.f14084d.mo10957a(supportSQLiteDatabase);
        if (!a) {
            C2682c g = this.f14084d.mo10963g(supportSQLiteDatabase);
            if (!g.f14088a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.f14089b);
            }
        }
        mo22308j(supportSQLiteDatabase);
        this.f14084d.mo10959c(supportSQLiteDatabase);
    }

    /* renamed from: e */
    public void mo10280e(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        vx2.m53591g(supportSQLiteDatabase, "db");
        mo10282g(supportSQLiteDatabase, i, i2);
    }

    /* renamed from: f */
    public void mo10281f(SupportSQLiteDatabase supportSQLiteDatabase) {
        vx2.m53591g(supportSQLiteDatabase, "db");
        super.mo10281f(supportSQLiteDatabase);
        mo22306h(supportSQLiteDatabase);
        this.f14084d.mo10960d(supportSQLiteDatabase);
        this.f14083c = null;
    }

    /* renamed from: g */
    public void mo10282g(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        List<tv3> d;
        vx2.m53591g(supportSQLiteDatabase, "db");
        j21 j21 = this.f14083c;
        boolean z = false;
        if (!(j21 == null || (d = j21.f13482d.mo10156d(i, i2)) == null)) {
            this.f14084d.mo10962f(supportSQLiteDatabase);
            for (tv3 a : d) {
                a.mo10964a(supportSQLiteDatabase);
            }
            C2682c g = this.f14084d.mo10963g(supportSQLiteDatabase);
            if (g.f14088a) {
                this.f14084d.mo10961e(supportSQLiteDatabase);
                mo22308j(supportSQLiteDatabase);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g.f14089b);
            }
        }
        if (!z) {
            j21 j212 = this.f14083c;
            if (j212 == null || j212.mo21712a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f14084d.mo10958b(supportSQLiteDatabase);
            this.f14084d.mo10957a(supportSQLiteDatabase);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        p000.lh0.m47807a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        throw r1;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22306h(androidx.sqlite.p006db.SupportSQLiteDatabase r4) {
        /*
            r3 = this;
            kh5$a r0 = f14082g
            boolean r0 = r0.mo22310b(r4)
            if (r0 == 0) goto L_0x005d
            y26 r0 = new y26
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r4 = r4.query((androidx.sqlite.p006db.SupportSQLiteQuery) r0)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 == 0) goto L_0x0020
            r0 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            p000.lh0.m47807a(r4, r1)
            java.lang.String r4 = r3.f14085e
            boolean r4 = p000.vx2.m53586b(r4, r0)
            if (r4 != 0) goto L_0x006f
            java.lang.String r4 = r3.f14086f
            boolean r4 = p000.vx2.m53586b(r4, r0)
            if (r4 == 0) goto L_0x0035
            goto L_0x006f
        L_0x0035:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r2)
            java.lang.String r2 = r3.f14085e
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L_0x0056:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            p000.lh0.m47807a(r4, r0)
            throw r1
        L_0x005d:
            kh5$b r0 = r3.f14084d
            kh5$c r0 = r0.mo10963g(r4)
            boolean r1 = r0.f14088a
            if (r1 == 0) goto L_0x0070
            kh5$b r0 = r3.f14084d
            r0.mo10961e(r4)
            r3.mo22308j(r4)
        L_0x006f:
            return
        L_0x0070:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.f14089b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kh5.mo22306h(androidx.sqlite.db.SupportSQLiteDatabase):void");
    }

    /* renamed from: i */
    public final void mo22307i(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    public final void mo22308j(SupportSQLiteDatabase supportSQLiteDatabase) {
        mo22307i(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(jh5.m20135a(this.f14085e));
    }
}
