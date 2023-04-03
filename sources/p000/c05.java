package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteQuery;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002H\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u0001J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0010H\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J)\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014H\u0016¢\u0006\u0004\b\u0013\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R(\u0010'\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060$\u0018\u00010#8VX\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00048\u0016X\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048WX\u0005¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010\u00068\u0016X\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, mo44877d2 = {"Lc05;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Lr37;", "close", "", "inTransaction", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "beginTransaction", "beginTransactionNonExclusive", "endTransaction", "setTransactionSuccessful", "query", "Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "cancellationSignal", "execSQL", "", "", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "a", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "delegate", "Ljava/util/concurrent/Executor;", "d", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$f;", "e", "Landroidx/room/RoomDatabase$f;", "queryCallback", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isOpen", "()Z", "isWriteAheadLoggingEnabled", "getPath", "()Ljava/lang/String;", "path", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$f;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: c05 */
/* compiled from: QueryInterceptorDatabase.kt */
public final class c05 implements SupportSQLiteDatabase {

    /* renamed from: a */
    public final SupportSQLiteDatabase f8315a;

    /* renamed from: d */
    public final Executor f8316d;

    /* renamed from: e */
    public final RoomDatabase.C1371f f8317e;

    public c05(SupportSQLiteDatabase supportSQLiteDatabase, Executor executor, RoomDatabase.C1371f fVar) {
        vx2.m53591g(supportSQLiteDatabase, "delegate");
        vx2.m53591g(executor, "queryCallbackExecutor");
        vx2.m53591g(fVar, "queryCallback");
        this.f8315a = supportSQLiteDatabase;
        this.f8316d = executor;
        this.f8317e = fVar;
    }

    /* renamed from: j */
    public static final void m11679j(c05 c05) {
        vx2.m53591g(c05, "this$0");
        c05.f8317e.mo10159a("BEGIN EXCLUSIVE TRANSACTION", ck0.m33062j());
    }

    /* renamed from: k */
    public static final void m11680k(c05 c05) {
        vx2.m53591g(c05, "this$0");
        c05.f8317e.mo10159a("BEGIN DEFERRED TRANSACTION", ck0.m33062j());
    }

    /* renamed from: l */
    public static final void m11681l(c05 c05) {
        vx2.m53591g(c05, "this$0");
        c05.f8317e.mo10159a("END TRANSACTION", ck0.m33062j());
    }

    /* renamed from: m */
    public static final void m11682m(c05 c05, String str) {
        vx2.m53591g(c05, "this$0");
        vx2.m53591g(str, "$sql");
        c05.f8317e.mo10159a(str, ck0.m33062j());
    }

    /* renamed from: n */
    public static final void m11683n(c05 c05, String str, List list) {
        vx2.m53591g(c05, "this$0");
        vx2.m53591g(str, "$sql");
        vx2.m53591g(list, "$inputArguments");
        c05.f8317e.mo10159a(str, list);
    }

    /* renamed from: p */
    public static final void m11684p(c05 c05, String str) {
        vx2.m53591g(c05, "this$0");
        vx2.m53591g(str, "$query");
        c05.f8317e.mo10159a(str, ck0.m33062j());
    }

    /* renamed from: q */
    public static final void m11685q(c05 c05, SupportSQLiteQuery supportSQLiteQuery, f05 f05) {
        vx2.m53591g(c05, "this$0");
        vx2.m53591g(supportSQLiteQuery, "$query");
        vx2.m53591g(f05, "$queryInterceptorProgram");
        c05.f8317e.mo10159a(supportSQLiteQuery.mo10285d(), f05.mo19564a());
    }

    /* renamed from: s */
    public static final void m11686s(c05 c05, SupportSQLiteQuery supportSQLiteQuery, f05 f05) {
        vx2.m53591g(c05, "this$0");
        vx2.m53591g(supportSQLiteQuery, "$query");
        vx2.m53591g(f05, "$queryInterceptorProgram");
        c05.f8317e.mo10159a(supportSQLiteQuery.mo10285d(), f05.mo19564a());
    }

    /* renamed from: v */
    public static final void m11687v(c05 c05) {
        vx2.m53591g(c05, "this$0");
        c05.f8317e.mo10159a("TRANSACTION SUCCESSFUL", ck0.m33062j());
    }

    public void beginTransaction() {
        this.f8316d.execute(new xz4(this));
        this.f8315a.beginTransaction();
    }

    public void beginTransactionNonExclusive() {
        this.f8316d.execute(new tz4(this));
        this.f8315a.beginTransactionNonExclusive();
    }

    public void close() {
        this.f8315a.close();
    }

    public SupportSQLiteStatement compileStatement(String str) {
        vx2.m53591g(str, "sql");
        return new j05(this.f8315a.compileStatement(str), str, this.f8316d, this.f8317e);
    }

    public void endTransaction() {
        this.f8316d.execute(new zz4(this));
        this.f8315a.endTransaction();
    }

    public void execSQL(String str) {
        vx2.m53591g(str, "sql");
        this.f8316d.execute(new b05(this, str));
        this.f8315a.execSQL(str);
    }

    public List<Pair<String, String>> getAttachedDbs() {
        return this.f8315a.getAttachedDbs();
    }

    public String getPath() {
        return this.f8315a.getPath();
    }

    public boolean inTransaction() {
        return this.f8315a.inTransaction();
    }

    public boolean isOpen() {
        return this.f8315a.isOpen();
    }

    public boolean isWriteAheadLoggingEnabled() {
        return this.f8315a.isWriteAheadLoggingEnabled();
    }

    public Cursor query(String str) {
        vx2.m53591g(str, "query");
        this.f8316d.execute(new yz4(this, str));
        return this.f8315a.query(str);
    }

    public void setTransactionSuccessful() {
        this.f8316d.execute(new vz4(this));
        this.f8315a.setTransactionSuccessful();
    }

    public void execSQL(String str, Object[] objArr) {
        vx2.m53591g(str, "sql");
        vx2.m53591g(objArr, "bindArgs");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(bk0.m32598e(objArr));
        this.f8316d.execute(new a05(this, str, arrayList));
        this.f8315a.execSQL(str, new List[]{arrayList});
    }

    public Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        vx2.m53591g(supportSQLiteQuery, "query");
        f05 f05 = new f05();
        supportSQLiteQuery.mo10286e(f05);
        this.f8316d.execute(new wz4(this, supportSQLiteQuery, f05));
        return this.f8315a.query(supportSQLiteQuery);
    }

    public Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        vx2.m53591g(supportSQLiteQuery, "query");
        f05 f05 = new f05();
        supportSQLiteQuery.mo10286e(f05);
        this.f8316d.execute(new uz4(this, supportSQLiteQuery, f05));
        return this.f8315a.query(supportSQLiteQuery);
    }
}
