package androidx.room;

import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "T", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1 */
/* compiled from: AutoClosingRoomOpenHelper.kt */
public final class C1362xdd6c1cf2 extends Lambda implements rc2<SupportSQLiteDatabase, T> {
    public final /* synthetic */ rc2<SupportSQLiteStatement, T> $block;
    public final /* synthetic */ AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1362xdd6c1cf2(AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, rc2<? super SupportSQLiteStatement, ? extends T> rc2) {
        super(1);
        this.this$0 = autoClosingSupportSqliteStatement;
        this.$block = rc2;
    }

    public final T invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
        vx2.m53591g(supportSQLiteDatabase, "db");
        SupportSQLiteStatement compileStatement = supportSQLiteDatabase.compileStatement(this.this$0.f6860a);
        this.this$0.mo10038c(compileStatement);
        return this.$block.invoke(compileStatement);
    }
}
