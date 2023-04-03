package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.p006db.SupportSQLiteQuery;
import androidx.sqlite.p006db.framework.FrameworkSQLiteDatabase;

/* renamed from: cc2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class cc2 implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ SupportSQLiteQuery f8405a;

    public /* synthetic */ cc2(SupportSQLiteQuery supportSQLiteQuery) {
        this.f8405a = supportSQLiteQuery;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return FrameworkSQLiteDatabase.m9930e(this.f8405a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
