package net.safemoon.androidwallet.fragments.walletconnect;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.repository.WalletDataSource;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/repository/WalletDataSource;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WalletConnectDetailFragment.kt */
public final class WalletConnectDetailFragment$walletDataSource$2 extends Lambda implements pc2<WalletDataSource> {
    public final /* synthetic */ WalletConnectDetailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectDetailFragment$walletDataSource$2(WalletConnectDetailFragment walletConnectDetailFragment) {
        super(0);
        this.this$0 = walletConnectDetailFragment;
    }

    public final WalletDataSource invoke() {
        return new WalletDataSource(this.this$0.mo58149x().mo57108Q());
    }
}
