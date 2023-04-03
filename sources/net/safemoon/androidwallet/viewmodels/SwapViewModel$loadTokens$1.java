package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.swap.AllSwapTokens;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/SwapViewModel$loadTokens$1", "Lp90;", "Lnet/safemoon/androidwallet/model/swap/AllSwapTokens;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwapViewModel.kt */
public final class SwapViewModel$loadTokens$1 implements p90<AllSwapTokens> {

    /* renamed from: a */
    public final /* synthetic */ SwapViewModel f42980a;

    public SwapViewModel$loadTokens$1(SwapViewModel swapViewModel) {
        this.f42980a = swapViewModel;
    }

    /* renamed from: a */
    public void mo47103a(k90<AllSwapTokens> k90, Throwable th) {
        vx2.m53591g(k90, "call");
        vx2.m53591g(th, "t");
    }

    /* renamed from: b */
    public void mo47104b(k90<AllSwapTokens> k90, bg5<AllSwapTokens> bg5) {
        vx2.m53591g(k90, "call");
        vx2.m53591g(bg5, "response");
        if (bg5.mo50581e() && bg5.mo50578a() != null) {
            y23 unused = d50.m56748b(cd7.m11843a(this.f42980a), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$loadTokens$1$onResponse$1(this.f42980a, bg5, (ns0<? super SwapViewModel$loadTokens$1$onResponse$1>) null), 3, (Object) null);
        }
    }
}
