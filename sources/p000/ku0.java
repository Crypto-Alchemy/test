package p000;

import androidx.room.RoomDatabase;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo44877d2 = {"Landroidx/room/RoomDatabase;", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "b", "(Landroidx/room/RoomDatabase;)Lkotlinx/coroutines/CoroutineDispatcher;", "transactionDispatcher", "room-ktx_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ku0 */
/* compiled from: CoroutinesRoom.kt */
public final class ku0 {
    /* renamed from: a */
    public static final CoroutineDispatcher m21080a(RoomDatabase roomDatabase) {
        vx2.m53591g(roomDatabase, "<this>");
        Map<String, Object> l = roomDatabase.mo10126l();
        Object obj = l.get("QueryDispatcher");
        if (obj == null) {
            obj = bv1.m56171a(roomDatabase.mo10130p());
            l.put("QueryDispatcher", obj);
        }
        vx2.m53589e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) obj;
    }

    /* renamed from: b */
    public static final CoroutineDispatcher m21081b(RoomDatabase roomDatabase) {
        vx2.m53591g(roomDatabase, "<this>");
        Map<String, Object> l = roomDatabase.mo10126l();
        Object obj = l.get("TransactionDispatcher");
        if (obj == null) {
            obj = bv1.m56171a(roomDatabase.mo10133s());
            l.put("TransactionDispatcher", obj);
        }
        vx2.m53589e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) obj;
    }
}
