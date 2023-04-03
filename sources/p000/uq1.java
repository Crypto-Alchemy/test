package p000;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, mo44877d2 = {"Luq1;", "T", "Landroidx/room/SharedSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "statement", "entity", "Lr37;", "i", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V", "", "j", "(Ljava/lang/Object;)I", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: uq1 */
/* compiled from: EntityDeletionOrUpdateAdapter.kt */
public abstract class uq1<T> extends SharedSQLiteStatement {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uq1(RoomDatabase roomDatabase) {
        super(roomDatabase);
        vx2.m53591g(roomDatabase, "database");
    }

    /* renamed from: i */
    public abstract void mo26841i(SupportSQLiteStatement supportSQLiteStatement, T t);

    /* renamed from: j */
    public final int mo26842j(T t) {
        SupportSQLiteStatement b = mo10162b();
        try {
            mo26841i(b, t);
            return b.executeUpdateDelete();
        } finally {
            mo10168h(b);
        }
    }
}
