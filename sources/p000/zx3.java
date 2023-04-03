package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo44877d2 = {"Lkotlin/coroutines/CoroutineContext;", "Lyx3;", "a", "(Lkotlin/coroutines/CoroutineContext;)Lyx3;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "monotonicFrameClock", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: zx3 */
/* compiled from: MonotonicFrameClock.kt */
public final class zx3 {
    /* renamed from: a */
    public static final yx3 m31581a(CoroutineContext coroutineContext) {
        vx2.m53591g(coroutineContext, "<this>");
        yx3 yx3 = (yx3) coroutineContext.get(yx3.f20400n);
        if (yx3 != null) {
            return yx3;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }
}
