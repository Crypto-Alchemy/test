package p000;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, mo44877d2 = {"Ljh0;", "Ljava/io/Closeable;", "Lhu0;", "Lr37;", "close", "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "A", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "lifecycle-viewmodel-ktx_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: jh0 */
/* compiled from: ViewModel.kt */
public final class jh0 implements Closeable, hu0 {

    /* renamed from: a */
    public final CoroutineContext f13612a;

    public jh0(CoroutineContext coroutineContext) {
        vx2.m53591g(coroutineContext, "context");
        this.f13612a = coroutineContext;
    }

    /* renamed from: A */
    public CoroutineContext mo6303A() {
        return this.f13612a;
    }

    public void close() {
        i33.m58818f(mo6303A(), (CancellationException) null, 1, (Object) null);
    }
}
