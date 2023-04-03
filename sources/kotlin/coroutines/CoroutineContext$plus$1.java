package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import p000.ps0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lkotlin/coroutines/CoroutineContext;", "acc", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$a;)Lkotlin/coroutines/CoroutineContext;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CoroutineContext.kt */
public final class CoroutineContext$plus$1 extends Lambda implements fd2<CoroutineContext, CoroutineContext.C6188a, CoroutineContext> {
    public static final CoroutineContext$plus$1 INSTANCE = new CoroutineContext$plus$1();

    public CoroutineContext$plus$1() {
        super(2);
    }

    public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.C6188a aVar) {
        CombinedContext combinedContext;
        vx2.m53591g(coroutineContext, "acc");
        vx2.m53591g(aVar, "element");
        CoroutineContext minusKey = coroutineContext.minusKey(aVar.getKey());
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (minusKey == emptyCoroutineContext) {
            return aVar;
        }
        ps0.C6371b bVar = ps0.f32794h;
        ps0 ps0 = (ps0) minusKey.get(bVar);
        if (ps0 == null) {
            combinedContext = new CombinedContext(minusKey, aVar);
        } else {
            CoroutineContext minusKey2 = minusKey.minusKey(bVar);
            if (minusKey2 == emptyCoroutineContext) {
                return new CombinedContext(aVar, ps0);
            }
            combinedContext = new CombinedContext(new CombinedContext(minusKey2, aVar), ps0);
        }
        return combinedContext;
    }
}
