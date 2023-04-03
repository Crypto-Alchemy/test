package androidx.sqlite.p006db;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000fH&J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H'J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J)\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0013H&¢\u0006\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R(\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001e\u0018\u00010\u001d8fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, mo44877d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/io/Closeable;", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "Lr37;", "beginTransaction", "beginTransactionNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "query", "Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "cancellationSignal", "execSQL", "", "", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "isOpen", "()Z", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.sqlite.db.SupportSQLiteDatabase */
/* compiled from: SupportSQLiteDatabase.kt */
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    SupportSQLiteStatement compileStatement(String str);

    void endTransaction();

    void execSQL(String str) throws SQLException;

    void execSQL(String str, Object[] objArr) throws SQLException;

    List<Pair<String, String>> getAttachedDbs();

    String getPath();

    boolean inTransaction();

    boolean isOpen();

    boolean isWriteAheadLoggingEnabled();

    Cursor query(SupportSQLiteQuery supportSQLiteQuery);

    Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal);

    Cursor query(String str);

    void setTransactionSuccessful();
}
