package androidx.room;

import androidx.sqlite.p006db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "", "obj", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1 */
/* compiled from: AutoClosingRoomOpenHelper.kt */
public final class C1358x4ec8cd3b extends Lambda implements rc2<SupportSQLiteDatabase, String> {
    public static final C1358x4ec8cd3b INSTANCE = new C1358x4ec8cd3b();

    public C1358x4ec8cd3b() {
        super(1);
    }

    public final String invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
        vx2.m53591g(supportSQLiteDatabase, "obj");
        return supportSQLiteDatabase.getPath();
    }
}
