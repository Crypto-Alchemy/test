package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"", "", "changed", "La56;", "<anonymous parameter 1>", "Lr37;", "invoke", "(Ljava/util/Set;La56;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Recomposer.kt */
public final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends Lambda implements fd2<Set<? extends Object>, a56, r37> {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2$unregisterApplyObserver$1(Recomposer recomposer) {
        super(2);
        this.this$0 = recomposer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) (Set) obj, (a56) obj2);
        return r37.f33317a;
    }

    public final void invoke(Set<? extends Object> set, a56 a56) {
        ma0 ma0;
        vx2.m53591g(set, "changed");
        vx2.m53591g(a56, "<anonymous parameter 1>");
        Object E = this.this$0.f1543e;
        Recomposer recomposer = this.this$0;
        synchronized (E) {
            if (((Recomposer.State) recomposer.f1558t.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                recomposer.f1547i.add(set);
                ma0 = recomposer.mo3091U();
            } else {
                ma0 = null;
            }
        }
        if (ma0 != null) {
            Result.C6167a aVar = Result.Companion;
            ma0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
        }
    }
}
