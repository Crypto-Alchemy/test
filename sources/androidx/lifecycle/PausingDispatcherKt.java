package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aI\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo44877d2 = {"T", "Landroidx/lifecycle/Lifecycle;", "Lkotlin/Function2;", "Lhu0;", "Lns0;", "", "block", "a", "(Landroidx/lifecycle/Lifecycle;Lfd2;Lns0;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle$State;", "minState", "b", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lfd2;Lns0;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: PausingDispatcher.kt */
public final class PausingDispatcherKt {
    /* renamed from: a */
    public static final <T> Object m5049a(Lifecycle lifecycle, fd2<? super hu0, ? super ns0<? super T>, ? extends Object> fd2, ns0<? super T> ns0) {
        return m5050b(lifecycle, Lifecycle.State.CREATED, fd2, ns0);
    }

    /* renamed from: b */
    public static final <T> Object m5050b(Lifecycle lifecycle, Lifecycle.State state, fd2<? super hu0, ? super ns0<? super T>, ? extends Object> fd2, ns0<? super T> ns0) {
        return b50.m55768e(qh1.m71266c().mo55551K(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, fd2, (ns0<? super PausingDispatcherKt$whenStateAtLeast$2>) null), ns0);
    }
}
