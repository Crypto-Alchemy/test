package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0010¨\u0006\b"}, mo44877d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "Lr37;", "a", "Ly23;", "collectJob", "b", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: SafeCollector.common.kt */
public final class SafeCollector_commonKt {
    /* renamed from: a */
    public static final void m63469a(SafeCollector<?> safeCollector, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new SafeCollector_commonKt$checkContext$result$1(safeCollector))).intValue() != safeCollector.collectContextSize) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    /* renamed from: b */
    public static final y23 m63470b(y23 y23, y23 y232) {
        while (y23 != null) {
            if (y23 == y232 || !(y23 instanceof jn5)) {
                return y23;
            }
            y23 = ((jn5) y23).mo52757T0();
        }
        return null;
    }
}
