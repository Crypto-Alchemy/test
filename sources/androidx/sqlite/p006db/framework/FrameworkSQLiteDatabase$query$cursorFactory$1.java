package androidx.sqlite.p006db.framework;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.p006db.SupportSQLiteQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\b\n"}, mo44877d2 = {"<anonymous>", "Landroid/database/sqlite/SQLiteCursor;", "<anonymous parameter 0>", "Landroid/database/sqlite/SQLiteDatabase;", "masterQuery", "Landroid/database/sqlite/SQLiteCursorDriver;", "editTable", "", "sqLiteQuery", "Landroid/database/sqlite/SQLiteQuery;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1 */
/* compiled from: FrameworkSQLiteDatabase.kt */
public final class FrameworkSQLiteDatabase$query$cursorFactory$1 extends Lambda implements kd2<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {
    public final /* synthetic */ SupportSQLiteQuery $query;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteDatabase$query$cursorFactory$1(SupportSQLiteQuery supportSQLiteQuery) {
        super(4);
        this.$query = supportSQLiteQuery;
    }

    public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        SupportSQLiteQuery supportSQLiteQuery = this.$query;
        vx2.m53588d(sQLiteQuery);
        supportSQLiteQuery.mo10286e(new gc2(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
