package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo44877d2 = {"Lkm0;", "Lns0;", "", "Lkotlin/Result;", "result", "Lr37;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: km0 */
/* compiled from: ContinuationImpl.kt */
public final class km0 implements ns0<Object> {

    /* renamed from: a */
    public static final km0 f30925a = new km0();

    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
