package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "state", "Lr37;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Snapshot.kt */
public final class GlobalSnapshot$1$1$1 extends Lambda implements rc2<Object, r37> {
    public final /* synthetic */ List<rc2<Object, r37>> $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$1$1$1(List<rc2<Object, r37>> list) {
        super(1);
        this.$it = list;
    }

    public final void invoke(Object obj) {
        vx2.m53591g(obj, "state");
        List<rc2<Object, r37>> list = this.$it;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).invoke(obj);
        }
    }
}
