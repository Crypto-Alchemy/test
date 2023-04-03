package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"2\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, mo44877d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "b", "countOrElement", "c", "oldState", "Lr37;", "a", "Lxj6;", "Lxj6;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$a;", "Lfd2;", "countAll", "Ldp6;", "findOne", "Lnp6;", "d", "updateState", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: ThreadContext.kt */
public final class ThreadContextKt {

    /* renamed from: a */
    public static final xj6 f40474a = new xj6("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final fd2<Object, CoroutineContext.C6188a, Object> f40475b = ThreadContextKt$countAll$1.INSTANCE;

    /* renamed from: c */
    public static final fd2<dp6<?>, CoroutineContext.C6188a, dp6<?>> f40476c = ThreadContextKt$findOne$1.INSTANCE;

    /* renamed from: d */
    public static final fd2<np6, CoroutineContext.C6188a, np6> f40477d = ThreadContextKt$updateState$1.INSTANCE;

    /* renamed from: a */
    public static final void m63495a(CoroutineContext coroutineContext, Object obj) {
        if (obj != f40474a) {
            if (obj instanceof np6) {
                ((np6) obj).mo62779b(coroutineContext);
                return;
            }
            Object fold = coroutineContext.fold(null, f40476c);
            if (fold != null) {
                ((dp6) fold).mo51248k(coroutineContext, obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    /* renamed from: b */
    public static final Object m63496b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f40475b);
        vx2.m53588d(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m63497c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = m63496b(coroutineContext);
        }
        if (obj == 0) {
            return f40474a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new np6(coroutineContext, ((Number) obj).intValue()), f40477d);
        }
        return ((dp6) obj).mo51247J(coroutineContext);
    }
}
