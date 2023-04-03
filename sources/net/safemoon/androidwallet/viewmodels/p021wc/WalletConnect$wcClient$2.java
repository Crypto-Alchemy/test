package net.safemoon.androidwallet.viewmodels.p021wc;

import com.google.gson.GsonBuilder;
import com.trustwallet.walletconnect.WCClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import okhttp3.OkHttpClient;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lcom/trustwallet/walletconnect/WCClient;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.WalletConnect$wcClient$2 */
/* compiled from: WalletConnect.kt */
public final class WalletConnect$wcClient$2 extends Lambda implements pc2<WCClient> {
    public final /* synthetic */ WalletConnect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnect$wcClient$2(WalletConnect walletConnect) {
        super(0);
        this.this$0 = walletConnect;
    }

    public final WCClient invoke() {
        WCClient wCClient = new WCClient(new GsonBuilder(), new OkHttpClient());
        WalletConnect walletConnect = this.this$0;
        wCClient.setOnSessionRequest(new WalletConnect$wcClient$2$1$1(walletConnect));
        wCClient.setOnDisconnect(new WalletConnect$wcClient$2$1$2(walletConnect));
        wCClient.setOnFailure(WalletConnect$wcClient$2$1$3.INSTANCE);
        wCClient.setOnGetAccounts(WalletConnect$wcClient$2$1$4.INSTANCE);
        wCClient.setOnEthSign(new WalletConnect$wcClient$2$1$5(walletConnect));
        wCClient.setOnEthSignTransaction(new WalletConnect$wcClient$2$1$6(walletConnect));
        wCClient.setOnEthSendTransaction(new WalletConnect$wcClient$2$1$7(walletConnect));
        wCClient.setOnSignTransaction(WalletConnect$wcClient$2$1$8.INSTANCE);
        return wCClient;
    }
}
