package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, mo44877d2 = {"Lkotlinx/coroutines/e;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lr37;", "m", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.e */
/* compiled from: Unconfined.kt */
public final class C7771e extends CoroutineDispatcher {

    /* renamed from: e */
    public static final C7771e f40385e = new C7771e();

    /* renamed from: m */
    public void mo3894m(CoroutineContext coroutineContext, Runnable runnable) {
        jp7 jp7 = (jp7) coroutineContext.get(jp7.f38763e);
        if (jp7 != null) {
            jp7.f38764d = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }

    /* renamed from: z */
    public boolean mo28541z(CoroutineContext coroutineContext) {
        return false;
    }
}
