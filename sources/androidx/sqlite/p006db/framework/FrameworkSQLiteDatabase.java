package androidx.sqlite.p006db.framework;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteQuery;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0013H\u0016¢\u0006\u0004\b\u0012\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018R\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR.\u0010$\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001f\u0018\u00010\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u000b8WX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&¨\u0006."}, mo44877d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "Lr37;", "beginTransaction", "beginTransactionNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "query", "Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "cancellationSignal", "execSQL", "", "", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "c", "a", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "", "Landroid/util/Pair;", "d", "Ljava/util/List;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isOpen", "()Z", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "e", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteDatabase */
/* compiled from: FrameworkSQLiteDatabase.kt */
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {

    /* renamed from: e */
    public static final C1393a f6989e = new C1393a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final String[] f6990g = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: k */
    public static final String[] f6991k = new String[0];

    /* renamed from: a */
    public final SQLiteDatabase f6992a;

    /* renamed from: d */
    public final List<Pair<String, String>> f6993d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, mo44877d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$a;", "", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "<init>", "()V", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$a */
    /* compiled from: FrameworkSQLiteDatabase.kt */
    public static final class C1393a {
        public C1393a() {
        }

        public /* synthetic */ C1393a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        vx2.m53591g(sQLiteDatabase, "delegate");
        this.f6992a = sQLiteDatabase;
        this.f6993d = sQLiteDatabase.getAttachedDbs();
    }

    /* renamed from: d */
    public static final Cursor m9929d(kd2 kd2, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        vx2.m53591g(kd2, "$tmp0");
        return (Cursor) kd2.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* renamed from: e */
    public static final Cursor m9930e(SupportSQLiteQuery supportSQLiteQuery, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        vx2.m53591g(supportSQLiteQuery, "$query");
        vx2.m53588d(sQLiteQuery);
        supportSQLiteQuery.mo10286e(new gc2(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public void beginTransaction() {
        this.f6992a.beginTransaction();
    }

    public void beginTransactionNonExclusive() {
        this.f6992a.beginTransactionNonExclusive();
    }

    /* renamed from: c */
    public final boolean mo10287c(SQLiteDatabase sQLiteDatabase) {
        vx2.m53591g(sQLiteDatabase, "sqLiteDatabase");
        return vx2.m53586b(this.f6992a, sQLiteDatabase);
    }

    public void close() throws IOException {
        this.f6992a.close();
    }

    public SupportSQLiteStatement compileStatement(String str) {
        vx2.m53591g(str, "sql");
        SQLiteStatement compileStatement = this.f6992a.compileStatement(str);
        vx2.m53590f(compileStatement, "delegate.compileStatement(sql)");
        return new hc2(compileStatement);
    }

    public void endTransaction() {
        this.f6992a.endTransaction();
    }

    public void execSQL(String str) throws SQLException {
        vx2.m53591g(str, "sql");
        this.f6992a.execSQL(str);
    }

    public List<Pair<String, String>> getAttachedDbs() {
        return this.f6993d;
    }

    public String getPath() {
        return this.f6992a.getPath();
    }

    public boolean inTransaction() {
        return this.f6992a.inTransaction();
    }

    public boolean isOpen() {
        return this.f6992a.isOpen();
    }

    public boolean isWriteAheadLoggingEnabled() {
        return be6.m11299d(this.f6992a);
    }

    public Cursor query(String str) {
        vx2.m53591g(str, "query");
        return query((SupportSQLiteQuery) new y26(str));
    }

    public void setTransactionSuccessful() {
        this.f6992a.setTransactionSuccessful();
    }

    public void execSQL(String str, Object[] objArr) throws SQLException {
        vx2.m53591g(str, "sql");
        vx2.m53591g(objArr, "bindArgs");
        this.f6992a.execSQL(str, objArr);
    }

    public Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        vx2.m53591g(supportSQLiteQuery, "query");
        Cursor rawQueryWithFactory = this.f6992a.rawQueryWithFactory(new dc2(new FrameworkSQLiteDatabase$query$cursorFactory$1(supportSQLiteQuery)), supportSQLiteQuery.mo10285d(), f6991k, (String) null);
        vx2.m53590f(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        vx2.m53591g(supportSQLiteQuery, "query");
        SQLiteDatabase sQLiteDatabase = this.f6992a;
        String d = supportSQLiteQuery.mo10285d();
        String[] strArr = f6991k;
        vx2.m53588d(cancellationSignal);
        return be6.m11300e(sQLiteDatabase, d, strArr, (String) null, cancellationSignal, new cc2(supportSQLiteQuery));
    }
}
