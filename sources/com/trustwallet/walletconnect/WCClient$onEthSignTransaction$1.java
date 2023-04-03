package com.trustwallet.walletconnect;

import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "<anonymous parameter 0>", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "<anonymous parameter 1>", "Lr37;", "invoke", "(JLcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WCClient.kt */
public final class WCClient$onEthSignTransaction$1 extends Lambda implements fd2<Long, WCEthereumTransaction, r37> {
    public static final WCClient$onEthSignTransaction$1 INSTANCE = new WCClient$onEthSignTransaction$1();

    public WCClient$onEthSignTransaction$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).longValue(), (WCEthereumTransaction) obj2);
        return r37.f33317a;
    }

    public final void invoke(long j, WCEthereumTransaction wCEthereumTransaction) {
        vx2.m53591g(wCEthereumTransaction, "<anonymous parameter 1>");
    }
}
