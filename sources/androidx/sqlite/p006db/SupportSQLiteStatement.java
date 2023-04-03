package androidx.sqlite.p006db;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, mo44877d2 = {"Landroidx/sqlite/db/SupportSQLiteStatement;", "Lje6;", "Lr37;", "execute", "", "executeUpdateDelete", "", "executeInsert", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.sqlite.db.SupportSQLiteStatement */
/* compiled from: SupportSQLiteStatement.kt */
public interface SupportSQLiteStatement extends je6 {
    void execute();

    long executeInsert();

    int executeUpdateDelete();
}
