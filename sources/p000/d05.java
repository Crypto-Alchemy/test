package p000;

import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0004\u001a\u00020\u0003H\u0001J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001R\u001a\u0010\f\u001a\u00020\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, mo44877d2 = {"Ld05;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ltb1;", "Lr37;", "close", "", "enabled", "setWriteAheadLoggingEnabled", "a", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "delegate", "Ljava/util/concurrent/Executor;", "d", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$f;", "e", "Landroidx/room/RoomDatabase$f;", "queryCallback", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$f;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: d05 */
/* compiled from: QueryInterceptorOpenHelper.kt */
public final class d05 implements SupportSQLiteOpenHelper, tb1 {

    /* renamed from: a */
    public final SupportSQLiteOpenHelper f10416a;

    /* renamed from: d */
    public final Executor f10417d;

    /* renamed from: e */
    public final RoomDatabase.C1371f f10418e;

    public d05(SupportSQLiteOpenHelper supportSQLiteOpenHelper, Executor executor, RoomDatabase.C1371f fVar) {
        vx2.m53591g(supportSQLiteOpenHelper, "delegate");
        vx2.m53591g(executor, "queryCallbackExecutor");
        vx2.m53591g(fVar, "queryCallback");
        this.f10416a = supportSQLiteOpenHelper;
        this.f10417d = executor;
        this.f10418e = fVar;
    }

    public void close() {
        this.f10416a.close();
    }

    public String getDatabaseName() {
        return this.f10416a.getDatabaseName();
    }

    public SupportSQLiteOpenHelper getDelegate() {
        return this.f10416a;
    }

    public SupportSQLiteDatabase getWritableDatabase() {
        return new c05(getDelegate().getWritableDatabase(), this.f10417d, this.f10418e);
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f10416a.setWriteAheadLoggingEnabled(z);
    }
}
