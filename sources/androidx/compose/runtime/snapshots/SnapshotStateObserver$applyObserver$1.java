package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"", "", "applied", "La56;", "<anonymous parameter 1>", "Lr37;", "invoke", "(Ljava/util/Set;La56;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SnapshotStateObserver.kt */
public final class SnapshotStateObserver$applyObserver$1 extends Lambda implements fd2<Set<? extends Object>, a56, r37> {
    public final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$applyObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(2);
        this.this$0 = snapshotStateObserver;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) (Set) obj, (a56) obj2);
        return r37.f33317a;
    }

    public final void invoke(Set<? extends Object> set, a56 a56) {
        boolean z;
        vx2.m53591g(set, "applied");
        vx2.m53591g(a56, "<anonymous parameter 1>");
        SnapshotStateObserver snapshotStateObserver = this.this$0;
        synchronized (snapshotStateObserver.f1595d) {
            v04 b = snapshotStateObserver.f1595d;
            int n = b.mo26963n();
            z = false;
            if (n > 0) {
                Object[] m = b.mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i = 0;
                boolean z2 = false;
                do {
                    if (!((SnapshotStateObserver.ObservedScopeMap) m[i]).mo3184q(set)) {
                        if (!z2) {
                            z2 = false;
                            i++;
                        }
                    }
                    z2 = true;
                    i++;
                } while (i < n);
                z = z2;
            }
            r37 r37 = r37.f33317a;
        }
        if (z) {
            rc2 c = this.this$0.f1592a;
            final SnapshotStateObserver snapshotStateObserver2 = this.this$0;
            c.invoke(new pc2<r37>() {
                public final void invoke() {
                    SnapshotStateObserver snapshotStateObserver = snapshotStateObserver2;
                    synchronized (snapshotStateObserver.f1595d) {
                        v04 b = snapshotStateObserver.f1595d;
                        int n = b.mo26963n();
                        if (n > 0) {
                            int i = 0;
                            Object[] m = b.mo26962m();
                            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            do {
                                ((SnapshotStateObserver.ObservedScopeMap) m[i]).mo3183p();
                                i++;
                            } while (i < n);
                        }
                        r37 r37 = r37.f33317a;
                    }
                }
            });
        }
    }
}
