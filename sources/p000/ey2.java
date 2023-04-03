package p000;

import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\nJ\u0012\u0010\u0010\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\nR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R$\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u00148\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"Ley2;", "", "T", "", "", "tableNames", "", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "a", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "liveData", "Lr37;", "b", "c", "Landroidx/room/RoomDatabase;", "Landroidx/room/RoomDatabase;", "database", "", "Ljava/util/Set;", "getLiveDataSet$room_runtime_release", "()Ljava/util/Set;", "liveDataSet", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ey2 */
/* compiled from: InvalidationLiveDataContainer.kt */
public final class ey2 {

    /* renamed from: a */
    public final RoomDatabase f11458a;

    /* renamed from: b */
    public final Set<LiveData<?>> f11459b;

    public ey2(RoomDatabase roomDatabase) {
        vx2.m53591g(roomDatabase, "database");
        this.f11458a = roomDatabase;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        vx2.m53590f(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f11459b = newSetFromMap;
    }

    /* renamed from: a */
    public final <T> LiveData<T> mo19554a(String[] strArr, boolean z, Callable<T> callable) {
        vx2.m53591g(strArr, "tableNames");
        vx2.m53591g(callable, "computeFunction");
        return new oh5(this.f11458a, this, z, callable, strArr);
    }

    /* renamed from: b */
    public final void mo19555b(LiveData<?> liveData) {
        vx2.m53591g(liveData, "liveData");
        this.f11459b.add(liveData);
    }

    /* renamed from: c */
    public final void mo19556c(LiveData<?> liveData) {
        vx2.m53591g(liveData, "liveData");
        this.f11459b.remove(liveData);
    }
}
