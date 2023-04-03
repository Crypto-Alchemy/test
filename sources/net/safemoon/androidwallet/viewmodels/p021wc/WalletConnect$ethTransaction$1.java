package net.safemoon.androidwallet.viewmodels.p021wc;

import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.WalletConnect", mo48632f = "WalletConnect.kt", mo48633l = {200}, mo48634m = "ethTransaction")
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.WalletConnect$ethTransaction$1 */
/* compiled from: WalletConnect.kt */
public final class WalletConnect$ethTransaction$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WalletConnect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnect$ethTransaction$1(WalletConnect walletConnect, ns0<? super WalletConnect$ethTransaction$1> ns0) {
        super(ns0);
        this.this$0 = walletConnect;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo62000j((RoomConnectedInfo) null, 0, (WCEthereumTransaction) null, false, this);
    }
}
