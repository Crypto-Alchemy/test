package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"La56;", "T", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)La56;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Snapshot.kt */
public final class SnapshotKt$takeNewSnapshot$1 extends Lambda implements rc2<SnapshotIdSet, T> {
    public final /* synthetic */ rc2<SnapshotIdSet, T> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotKt$takeNewSnapshot$1(rc2<? super SnapshotIdSet, ? extends T> rc2) {
        super(1);
        this.$block = rc2;
    }

    public final T invoke(SnapshotIdSet snapshotIdSet) {
        vx2.m53591g(snapshotIdSet, "invalid");
        T t = (a56) this.$block.invoke(snapshotIdSet);
        synchronized (SnapshotKt.m2219C()) {
            SnapshotKt.f1585d = SnapshotKt.f1585d.mo3159A(t.mo43f());
            r37 r37 = r37.f33317a;
        }
        return t;
    }
}
