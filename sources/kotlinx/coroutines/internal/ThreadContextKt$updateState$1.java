package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnp6;", "state", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lnp6;Lkotlin/coroutines/CoroutineContext$a;)Lnp6;", "<no name provided>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: ThreadContext.kt */
public final class ThreadContextKt$updateState$1 extends Lambda implements fd2<np6, CoroutineContext.C6188a, np6> {
    public static final ThreadContextKt$updateState$1 INSTANCE = new ThreadContextKt$updateState$1();

    public ThreadContextKt$updateState$1() {
        super(2);
    }

    public final np6 invoke(np6 np6, CoroutineContext.C6188a aVar) {
        if (aVar instanceof dp6) {
            dp6 dp6 = (dp6) aVar;
            np6.mo62778a(dp6, dp6.mo51247J(np6.f43531a));
        }
        return np6;
    }
}
