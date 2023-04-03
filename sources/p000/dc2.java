package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.p006db.framework.FrameworkSQLiteDatabase;

/* renamed from: dc2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class dc2 implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ kd2 f10625a;

    public /* synthetic */ dc2(kd2 kd2) {
        this.f10625a = kd2;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return FrameworkSQLiteDatabase.m9929d(this.f10625a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
