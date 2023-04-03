package androidx.room;

import android.util.Pair;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo44877d2 = {"<anonymous>", "", "Landroid/util/Pair;", "", "obj", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1 */
/* compiled from: AutoClosingRoomOpenHelper.kt */
public final class C1353x882a29d5 extends Lambda implements rc2<SupportSQLiteDatabase, List<? extends Pair<String, String>>> {
    public static final C1353x882a29d5 INSTANCE = new C1353x882a29d5();

    public C1353x882a29d5() {
        super(1);
    }

    public final List<Pair<String, String>> invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
        vx2.m53591g(supportSQLiteDatabase, "obj");
        return supportSQLiteDatabase.getAttachedDbs();
    }
}
