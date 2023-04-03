package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, mo44877d2 = {"Lb52;", "T", "Ljn5;", "", "cause", "", "W", "Lkotlin/coroutines/CoroutineContext;", "context", "Lns0;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lns0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: b52 */
/* compiled from: FlowCoroutine.kt */
public final class b52<T> extends jn5<T> {
    public b52(CoroutineContext coroutineContext, ns0<? super T> ns0) {
        super(coroutineContext, ns0);
    }

    /* renamed from: W */
    public boolean mo50487W(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return mo55495R(th);
    }
}
