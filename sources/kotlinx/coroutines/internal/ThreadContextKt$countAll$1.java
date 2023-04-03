package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "countOrElement", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Object;", "<no name provided>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: ThreadContext.kt */
public final class ThreadContextKt$countAll$1 extends Lambda implements fd2<Object, CoroutineContext.C6188a, Object> {
    public static final ThreadContextKt$countAll$1 INSTANCE = new ThreadContextKt$countAll$1();

    public ThreadContextKt$countAll$1() {
        super(2);
    }

    public final Object invoke(Object obj, CoroutineContext.C6188a aVar) {
        if (!(aVar instanceof dp6)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
    }
}
