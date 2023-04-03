package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C7756a;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¨\u0006\t"}, mo44877d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "Lr37;", "a", "originalException", "thrownException", "b", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: gu0 */
/* compiled from: CoroutineExceptionHandler.kt */
public final class gu0 {
    /* renamed from: a */
    public static final void m58254a(CoroutineContext coroutineContext, Throwable th) {
        try {
            fu0 fu0 = (fu0) coroutineContext.get(fu0.f37916i);
            if (fu0 != null) {
                fu0.mo4113q(coroutineContext, th);
            } else {
                C7756a.m63234a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            C7756a.m63234a(coroutineContext, m58255b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m58255b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ru1.m51326a(runtimeException, th);
        return runtimeException;
    }
}
