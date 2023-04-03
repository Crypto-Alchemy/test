package net.safemoon.androidwallet.domain.useCase.wipe;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, mo44877d2 = {"Lnet/safemoon/androidwallet/domain/useCase/wipe/AsyncWipeDataUseCase;", "Llp2;", "Lr37;", "execute", "a", "Llp2;", "origin", "<init>", "(Llp2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AsyncWipeDataUseCase.kt */
public final class AsyncWipeDataUseCase implements lp2 {

    /* renamed from: a */
    public final lp2 f41855a;

    public AsyncWipeDataUseCase(lp2 lp2) {
        vx2.m53591g(lp2, "origin");
        this.f41855a = lp2;
    }

    public void execute() {
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new AsyncWipeDataUseCase$execute$1(this, (ns0<? super AsyncWipeDataUseCase$execute$1>) null), 3, (Object) null);
    }
}
