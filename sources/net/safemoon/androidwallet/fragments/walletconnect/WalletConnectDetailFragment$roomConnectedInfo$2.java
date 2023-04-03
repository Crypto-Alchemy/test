package net.safemoon.androidwallet.fragments.walletconnect;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WalletConnectDetailFragment.kt */
public final class WalletConnectDetailFragment$roomConnectedInfo$2 extends Lambda implements pc2<RoomConnectedInfo> {
    public final /* synthetic */ WalletConnectDetailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectDetailFragment$roomConnectedInfo$2(WalletConnectDetailFragment walletConnectDetailFragment) {
        super(0);
        this.this$0 = walletConnectDetailFragment;
    }

    public final RoomConnectedInfo invoke() {
        if (!(this.this$0.requireArguments().getSerializable("roomConnectedInfo") instanceof RoomConnectedInfo)) {
            return null;
        }
        Serializable serializable = this.this$0.requireArguments().getSerializable("roomConnectedInfo");
        vx2.m53589e(serializable, "null cannot be cast to non-null type net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo");
        return (RoomConnectedInfo) serializable;
    }
}
