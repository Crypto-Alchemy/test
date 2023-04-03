package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lbx5;", "any", "Lr37;", "invoke", "(Lbx5;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTWebSocketHandlingViewModel.kt */
public final class AKTWebSocketHandlingViewModel$sendMessage$1$1$1$1 extends Lambda implements rc2<bx5, r37> {
    public final /* synthetic */ String $LSON;
    public final /* synthetic */ ak7 $webClient;
    public final /* synthetic */ AKTWebSocketHandlingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTWebSocketHandlingViewModel$sendMessage$1$1$1$1(AKTWebSocketHandlingViewModel aKTWebSocketHandlingViewModel, ak7 ak7, String str) {
        super(1);
        this.this$0 = aKTWebSocketHandlingViewModel;
        this.$webClient = ak7;
        this.$LSON = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((bx5) obj);
        return r37.f33317a;
    }

    public final void invoke(bx5 bx5) {
        this.this$0.f42603b = null;
        this.$webClient.mo50239V(this.$LSON);
    }
}
