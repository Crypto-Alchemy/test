package net.safemoon.androidwallet.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.repository.WalletDataSource", mo48632f = "WalletDataSource.kt", mo48633l = {20}, mo48634m = "allWallets")
/* compiled from: WalletDataSource.kt */
public final class WalletDataSource$allWallets$2 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WalletDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletDataSource$allWallets$2(WalletDataSource walletDataSource, ns0<? super WalletDataSource$allWallets$2> ns0) {
        super(ns0);
        this.this$0 = walletDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60772d((TokenType) null, this);
    }
}
