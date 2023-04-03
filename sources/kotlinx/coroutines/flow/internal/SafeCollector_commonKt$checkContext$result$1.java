package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "count", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(ILkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Integer;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: SafeCollector.common.kt */
public final class SafeCollector_commonKt$checkContext$result$1 extends Lambda implements fd2<Integer, CoroutineContext.C6188a, Integer> {
    public final /* synthetic */ SafeCollector<?> $this_checkContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafeCollector_commonKt$checkContext$result$1(SafeCollector<?> safeCollector) {
        super(2);
        this.$this_checkContext = safeCollector;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (CoroutineContext.C6188a) obj2);
    }

    public final Integer invoke(int i, CoroutineContext.C6188a aVar) {
        CoroutineContext.C6190b key = aVar.getKey();
        CoroutineContext.C6188a aVar2 = this.$this_checkContext.collectContext.get(key);
        if (key != y23.f46117l) {
            return Integer.valueOf(aVar != aVar2 ? Integer.MIN_VALUE : i + 1);
        }
        y23 y23 = (y23) aVar2;
        y23 b = SafeCollector_commonKt.m63470b((y23) aVar, y23);
        if (b == y23) {
            if (y23 != null) {
                i++;
            }
            return Integer.valueOf(i);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + y23 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
