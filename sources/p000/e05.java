package p000;

import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Le05;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "configuration", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "create", "a", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "delegate", "Ljava/util/concurrent/Executor;", "b", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$f;", "c", "Landroidx/room/RoomDatabase$f;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$f;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: e05 */
/* compiled from: QueryInterceptorOpenHelperFactory.kt */
public final class e05 implements SupportSQLiteOpenHelper.C1392b {

    /* renamed from: a */
    public final SupportSQLiteOpenHelper.C1392b f11012a;

    /* renamed from: b */
    public final Executor f11013b;

    /* renamed from: c */
    public final RoomDatabase.C1371f f11014c;

    public e05(SupportSQLiteOpenHelper.C1392b bVar, Executor executor, RoomDatabase.C1371f fVar) {
        vx2.m53591g(bVar, "delegate");
        vx2.m53591g(executor, "queryCallbackExecutor");
        vx2.m53591g(fVar, "queryCallback");
        this.f11012a = bVar;
        this.f11013b = executor;
        this.f11014c = fVar;
    }

    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        vx2.m53591g(configuration, "configuration");
        return new d05(this.f11012a.create(configuration), this.f11013b, this.f11014c);
    }
}
