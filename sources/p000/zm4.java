package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lzm4;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lr37;", "m", "Lkh1;", "e", "Lkh1;", "dispatchQueue", "<init>", "()V", "lifecycle-runtime-ktx_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: zm4 */
/* compiled from: PausingDispatcher.kt */
public final class zm4 extends CoroutineDispatcher {

    /* renamed from: e */
    public final kh1 f20609e = new kh1();

    /* renamed from: m */
    public void mo3894m(CoroutineContext coroutineContext, Runnable runnable) {
        vx2.m53591g(coroutineContext, "context");
        vx2.m53591g(runnable, "block");
        this.f20609e.mo22294c(coroutineContext, runnable);
    }

    /* renamed from: z */
    public boolean mo28541z(CoroutineContext coroutineContext) {
        vx2.m53591g(coroutineContext, "context");
        if (qh1.m71266c().mo55551K().mo28541z(coroutineContext)) {
            return true;
        }
        return !this.f20609e.mo22293b();
    }
}
