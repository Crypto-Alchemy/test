package p000;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lhc2;", "Lgc2;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "Lr37;", "execute", "", "executeUpdateDelete", "", "executeInsert", "Landroid/database/sqlite/SQLiteStatement;", "d", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: hc2 */
/* compiled from: FrameworkSQLiteStatement.kt */
public final class hc2 extends gc2 implements SupportSQLiteStatement {

    /* renamed from: d */
    public final SQLiteStatement f12818d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hc2(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        vx2.m53591g(sQLiteStatement, "delegate");
        this.f12818d = sQLiteStatement;
    }

    public void execute() {
        this.f12818d.execute();
    }

    public long executeInsert() {
        return this.f12818d.executeInsert();
    }

    public int executeUpdateDelete() {
        return this.f12818d.executeUpdateDelete();
    }
}
