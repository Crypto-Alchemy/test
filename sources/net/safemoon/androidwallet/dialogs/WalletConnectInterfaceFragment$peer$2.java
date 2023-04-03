package net.safemoon.androidwallet.dialogs;

import com.google.gson.Gson;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "kotlin.jvm.PlatformType", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WalletConnectInterfaceFragment.kt */
public final class WalletConnectInterfaceFragment$peer$2 extends Lambda implements pc2<WCPeerMeta> {
    public final /* synthetic */ WalletConnectInterfaceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectInterfaceFragment$peer$2(WalletConnectInterfaceFragment walletConnectInterfaceFragment) {
        super(0);
        this.this$0 = walletConnectInterfaceFragment;
    }

    public final WCPeerMeta invoke() {
        return (WCPeerMeta) new Gson().fromJson(this.this$0.requireArguments().getString("ARG_PEER"), WCPeerMeta.class);
    }
}
