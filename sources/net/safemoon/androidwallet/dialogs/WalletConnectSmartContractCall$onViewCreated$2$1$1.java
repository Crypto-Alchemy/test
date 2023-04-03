package net.safemoon.androidwallet.dialogs;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectSmartContractCall.kt */
public final class WalletConnectSmartContractCall$onViewCreated$2$1$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ pb2 $this_run;
    public final /* synthetic */ WalletConnectSmartContractCall this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectSmartContractCall$onViewCreated$2$1$1(pb2 pb2, WalletConnectSmartContractCall walletConnectSmartContractCall) {
        super(0);
        this.$this_run = pb2;
        this.this$0 = walletConnectSmartContractCall;
    }

    public final void invoke() {
        this.$this_run.f32638b.setEnabled(false);
        if (this.this$0.f41836p1 != null) {
            this.this$0.mo57346g0();
            WalletConnectSmartContractCall.C8339c L = this.this$0.f41828X;
            if (L != null) {
                String N = this.this$0.f41836p1;
                vx2.m53588d(N);
                L.mo57352c(N);
                return;
            }
            return;
        }
        WalletConnectSmartContractCall.C8339c L2 = this.this$0.f41828X;
        if (L2 != null) {
            L2.mo57350a();
        }
    }
}
