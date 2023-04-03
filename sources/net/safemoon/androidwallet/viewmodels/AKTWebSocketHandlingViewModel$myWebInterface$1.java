package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0016¨\u0006\r"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel$myWebInterface$1", "Le24;", "", "message", "Lr37;", "c", "Lbx5;", "handshakedata", "d", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTWebSocketHandlingViewModel.kt */
public final class AKTWebSocketHandlingViewModel$myWebInterface$1 extends e24 {

    /* renamed from: a */
    public final /* synthetic */ AKTWebSocketHandlingViewModel f42607a;

    public AKTWebSocketHandlingViewModel$myWebInterface$1(AKTWebSocketHandlingViewModel aKTWebSocketHandlingViewModel) {
        this.f42607a = aKTWebSocketHandlingViewModel;
    }

    /* renamed from: b */
    public void mo51352b(Exception exc) {
        super.mo51352b(exc);
        y23 unused = d50.m56748b(cd7.m11843a(this.f42607a), (CoroutineContext) null, (CoroutineStart) null, new AKTWebSocketHandlingViewModel$myWebInterface$1$onError$1(this.f42607a, (ns0<? super AKTWebSocketHandlingViewModel$myWebInterface$1$onError$1>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public void mo51353c(String str) {
        y23 unused = d50.m56748b(cd7.m11843a(this.f42607a), (CoroutineContext) null, (CoroutineStart) null, new AKTWebSocketHandlingViewModel$myWebInterface$1$onMessage$1(this.f42607a, str, (ns0<? super AKTWebSocketHandlingViewModel$myWebInterface$1$onMessage$1>) null), 3, (Object) null);
    }

    /* renamed from: d */
    public void mo51354d(bx5 bx5) {
        super.mo51354d(bx5);
        rc2 c = this.f42607a.f42603b;
        if (c != null) {
            c.invoke(bx5);
        }
    }
}
