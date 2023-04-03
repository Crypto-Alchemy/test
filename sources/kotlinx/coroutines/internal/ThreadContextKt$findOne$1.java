package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Ldp6;", "found", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Ldp6;Lkotlin/coroutines/CoroutineContext$a;)Ldp6;", "<no name provided>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: ThreadContext.kt */
public final class ThreadContextKt$findOne$1 extends Lambda implements fd2<dp6<?>, CoroutineContext.C6188a, dp6<?>> {
    public static final ThreadContextKt$findOne$1 INSTANCE = new ThreadContextKt$findOne$1();

    public ThreadContextKt$findOne$1() {
        super(2);
    }

    public final dp6<?> invoke(dp6<?> dp6, CoroutineContext.C6188a aVar) {
        if (dp6 != null) {
            return dp6;
        }
        if (aVar instanceof dp6) {
            return (dp6) aVar;
        }
        return null;
    }
}
