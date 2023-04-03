package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "state", "Lr37;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SnapshotStateObserver.kt */
public final class SnapshotStateObserver$readObserver$1 extends Lambda implements rc2<Object, r37> {
    public final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$readObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(1);
        this.this$0 = snapshotStateObserver;
    }

    public final void invoke(Object obj) {
        vx2.m53591g(obj, "state");
        if (!this.this$0.f1597f) {
            v04 b = this.this$0.f1595d;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (b) {
                SnapshotStateObserver.ObservedScopeMap a = snapshotStateObserver.f1598g;
                vx2.m53588d(a);
                a.mo3185r(obj);
                r37 r37 = r37.f33317a;
            }
        }
    }
}
