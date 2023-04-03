package androidx.room;

import androidx.sqlite.p006db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "", "it", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomDatabase.kt */
public final class RoomDatabase$endTransaction$1 extends Lambda implements rc2<SupportSQLiteDatabase, Object> {
    public final /* synthetic */ RoomDatabase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomDatabase$endTransaction$1(RoomDatabase roomDatabase) {
        super(1);
        this.this$0 = roomDatabase;
    }

    public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
        vx2.m53591g(supportSQLiteDatabase, "it");
        this.this$0.mo10137w();
        return null;
    }
}
