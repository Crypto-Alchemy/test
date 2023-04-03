package androidx.room;

import androidx.sqlite.p006db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 */
/* compiled from: AutoClosingRoomOpenHelper.kt */
public /* synthetic */ class C1356x5693171d extends FunctionReferenceImpl implements rc2<SupportSQLiteDatabase, Boolean> {
    public static final C1356x5693171d INSTANCE = new C1356x5693171d();

    public C1356x5693171d() {
        super(1, SupportSQLiteDatabase.class, "inTransaction", "inTransaction()Z", 0);
    }

    public final Boolean invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
        vx2.m53591g(supportSQLiteDatabase, "p0");
        return Boolean.valueOf(supportSQLiteDatabase.inTransaction());
    }
}
