package androidx.room;

import androidx.sqlite.p006db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "", "obj", "Landroidx/sqlite/db/SupportSQLiteStatement;", "invoke", "(Landroidx/sqlite/db/SupportSQLiteStatement;)Ljava/lang/Long;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1 */
/* compiled from: AutoClosingRoomOpenHelper.kt */
public final class C1361xe79bbce6 extends Lambda implements rc2<SupportSQLiteStatement, Long> {
    public static final C1361xe79bbce6 INSTANCE = new C1361xe79bbce6();

    public C1361xe79bbce6() {
        super(1);
    }

    public final Long invoke(SupportSQLiteStatement supportSQLiteStatement) {
        vx2.m53591g(supportSQLiteStatement, "obj");
        return Long.valueOf(supportSQLiteStatement.executeInsert());
    }
}
