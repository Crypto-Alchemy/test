package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Ls04;", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Ls04;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Snapshot.kt */
public final class GlobalSnapshot$takeNestedMutableSnapshot$1 extends Lambda implements rc2<SnapshotIdSet, s04> {
    public final /* synthetic */ rc2<Object, r37> $readObserver;
    public final /* synthetic */ rc2<Object, r37> $writeObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedMutableSnapshot$1(rc2<Object, r37> rc2, rc2<Object, r37> rc22) {
        super(1);
        this.$readObserver = rc2;
        this.$writeObserver = rc22;
    }

    public final s04 invoke(SnapshotIdSet snapshotIdSet) {
        int h;
        vx2.m53591g(snapshotIdSet, "invalid");
        synchronized (SnapshotKt.m2219C()) {
            h = SnapshotKt.f1586e;
            SnapshotKt.f1586e = h + 1;
        }
        return new s04(h, snapshotIdSet, this.$readObserver, this.$writeObserver);
    }
}
