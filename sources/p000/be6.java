package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007JK\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0010\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\tH\u0007¨\u0006\u001e"}, mo44877d2 = {"Lbe6;", "", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lr37;", "a", "b", "Ljava/io/File;", "file", "", "c", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "selectionArgs", "editTable", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "cursorFactory", "Landroid/database/Cursor;", "e", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/Cursor;", "d", "Landroid/database/sqlite/SQLiteOpenHelper;", "sQLiteOpenHelper", "enabled", "f", "<init>", "()V", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: be6 */
/* compiled from: SupportSQLiteCompat.kt */
public final class be6 {

    /* renamed from: a */
    public static final be6 f8089a = new be6();

    /* renamed from: a */
    public static final void m11296a(CancellationSignal cancellationSignal) {
        vx2.m53591g(cancellationSignal, "cancellationSignal");
        cancellationSignal.cancel();
    }

    /* renamed from: b */
    public static final CancellationSignal m11297b() {
        return new CancellationSignal();
    }

    /* renamed from: c */
    public static final boolean m11298c(File file) {
        vx2.m53591g(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    /* renamed from: d */
    public static final boolean m11299d(SQLiteDatabase sQLiteDatabase) {
        vx2.m53591g(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    /* renamed from: e */
    public static final Cursor m11300e(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        vx2.m53591g(sQLiteDatabase, "sQLiteDatabase");
        vx2.m53591g(str, "sql");
        vx2.m53591g(strArr, "selectionArgs");
        vx2.m53591g(cancellationSignal, "cancellationSignal");
        vx2.m53591g(cursorFactory, "cursorFactory");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        vx2.m53590f(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    /* renamed from: f */
    public static final void m11301f(SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
        vx2.m53591g(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
    }
}
