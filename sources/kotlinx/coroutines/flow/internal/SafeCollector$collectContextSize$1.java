package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "", "count", "Lkotlin/coroutines/CoroutineContext$a;", "<anonymous parameter 1>", "invoke", "(ILkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Integer;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: SafeCollector.kt */
public final class SafeCollector$collectContextSize$1 extends Lambda implements fd2<Integer, CoroutineContext.C6188a, Integer> {
    public static final SafeCollector$collectContextSize$1 INSTANCE = new SafeCollector$collectContextSize$1();

    public SafeCollector$collectContextSize$1() {
        super(2);
    }

    public final Integer invoke(int i, CoroutineContext.C6188a aVar) {
        return Integer.valueOf(i + 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (CoroutineContext.C6188a) obj2);
    }
}
