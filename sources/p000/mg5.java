package p000;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lmg5;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lr37;", "run", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lma0;", "d", "Lma0;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lma0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: mg5 */
/* compiled from: Executors.kt */
public final class mg5 implements Runnable {

    /* renamed from: a */
    public final CoroutineDispatcher f40914a;

    /* renamed from: d */
    public final ma0<r37> f40915d;

    public mg5(CoroutineDispatcher coroutineDispatcher, ma0<? super r37> ma0) {
        this.f40914a = coroutineDispatcher;
        this.f40915d = ma0;
    }

    public void run() {
        this.f40915d.mo56168y(this.f40914a, r37.f33317a);
    }
}
