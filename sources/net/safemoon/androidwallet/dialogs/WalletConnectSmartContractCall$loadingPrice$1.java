package net.safemoon.androidwallet.dialogs;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall", mo48632f = "WalletConnectSmartContractCall.kt", mo48633l = {181, 183, 184, 185}, mo48634m = "loadingPrice")
/* compiled from: WalletConnectSmartContractCall.kt */
public final class WalletConnectSmartContractCall$loadingPrice$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WalletConnectSmartContractCall this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectSmartContractCall$loadingPrice$1(WalletConnectSmartContractCall walletConnectSmartContractCall, ns0<? super WalletConnectSmartContractCall$loadingPrice$1> ns0) {
        super(ns0);
        this.this$0 = walletConnectSmartContractCall;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo57342Z(this);
    }
}
