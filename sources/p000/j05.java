package p000;

import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002H\u0001J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0011H\u0016J\u001a\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0014H\u0002R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, mo44877d2 = {"Lj05;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "Lr37;", "close", "execute", "", "executeUpdateDelete", "", "executeInsert", "index", "bindNull", "value", "bindLong", "", "bindDouble", "", "bindString", "", "bindBlob", "bindIndex", "", "g", "a", "Landroidx/sqlite/db/SupportSQLiteStatement;", "delegate", "d", "Ljava/lang/String;", "sqlStatement", "Ljava/util/concurrent/Executor;", "e", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$f;", "Landroidx/room/RoomDatabase$f;", "queryCallback", "", "k", "Ljava/util/List;", "bindArgsCache", "<init>", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$f;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: j05 */
/* compiled from: QueryInterceptorStatement.kt */
public final class j05 implements SupportSQLiteStatement {

    /* renamed from: a */
    public final SupportSQLiteStatement f13470a;

    /* renamed from: d */
    public final String f13471d;

    /* renamed from: e */
    public final Executor f13472e;

    /* renamed from: g */
    public final RoomDatabase.C1371f f13473g;

    /* renamed from: k */
    public final List<Object> f13474k = new ArrayList();

    public j05(SupportSQLiteStatement supportSQLiteStatement, String str, Executor executor, RoomDatabase.C1371f fVar) {
        vx2.m53591g(supportSQLiteStatement, "delegate");
        vx2.m53591g(str, "sqlStatement");
        vx2.m53591g(executor, "queryCallbackExecutor");
        vx2.m53591g(fVar, "queryCallback");
        this.f13470a = supportSQLiteStatement;
        this.f13471d = str;
        this.f13472e = executor;
        this.f13473g = fVar;
    }

    /* renamed from: d */
    public static final void m19927d(j05 j05) {
        vx2.m53591g(j05, "this$0");
        j05.f13473g.mo10159a(j05.f13471d, j05.f13474k);
    }

    /* renamed from: e */
    public static final void m19928e(j05 j05) {
        vx2.m53591g(j05, "this$0");
        j05.f13473g.mo10159a(j05.f13471d, j05.f13474k);
    }

    /* renamed from: f */
    public static final void m19929f(j05 j05) {
        vx2.m53591g(j05, "this$0");
        j05.f13473g.mo10159a(j05.f13471d, j05.f13474k);
    }

    public void bindBlob(int i, byte[] bArr) {
        vx2.m53591g(bArr, "value");
        mo21706g(i, bArr);
        this.f13470a.bindBlob(i, bArr);
    }

    public void bindDouble(int i, double d) {
        mo21706g(i, Double.valueOf(d));
        this.f13470a.bindDouble(i, d);
    }

    public void bindLong(int i, long j) {
        mo21706g(i, Long.valueOf(j));
        this.f13470a.bindLong(i, j);
    }

    public void bindNull(int i) {
        Object[] array = this.f13474k.toArray(new Object[0]);
        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        mo21706g(i, Arrays.copyOf(array, array.length));
        this.f13470a.bindNull(i);
    }

    public void bindString(int i, String str) {
        vx2.m53591g(str, "value");
        mo21706g(i, str);
        this.f13470a.bindString(i, str);
    }

    public void close() {
        this.f13470a.close();
    }

    public void execute() {
        this.f13472e.execute(new i05(this));
        this.f13470a.execute();
    }

    public long executeInsert() {
        this.f13472e.execute(new h05(this));
        return this.f13470a.executeInsert();
    }

    public int executeUpdateDelete() {
        this.f13472e.execute(new g05(this));
        return this.f13470a.executeUpdateDelete();
    }

    /* renamed from: g */
    public final void mo21706g(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.f13474k.size()) {
            int size = (i2 - this.f13474k.size()) + 1;
            for (int i3 = 0; i3 < size; i3++) {
                this.f13474k.add((Object) null);
            }
        }
        this.f13474k.set(i2, obj);
    }
}
