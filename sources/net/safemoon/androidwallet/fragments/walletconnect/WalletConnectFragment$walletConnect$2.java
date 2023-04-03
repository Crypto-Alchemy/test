package net.safemoon.androidwallet.fragments.walletconnect;

import androidx.fragment.app.FragmentActivity;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44876d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"<anonymous>", "net/safemoon/androidwallet/fragments/walletconnect/WalletConnectFragment$walletConnect$2$1", "invoke", "()Lnet/safemoon/androidwallet/fragments/walletconnect/WalletConnectFragment$walletConnect$2$1;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WalletConnectFragment.kt */
public final class WalletConnectFragment$walletConnect$2 extends Lambda implements pc2<C86011> {
    public final /* synthetic */ WalletConnectFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectFragment$walletConnect$2(WalletConnectFragment walletConnectFragment) {
        super(0);
        this.this$0 = walletConnectFragment;
    }

    public final C86011 invoke() {
        FragmentActivity requireActivity = this.this$0.requireActivity();
        FragmentActivity activity = this.this$0.getActivity();
        Wallet c = activity != null ? ol0.m70351c(activity) : null;
        vx2.m53588d(c);
        return new qf7(this.this$0, requireActivity, c) {

            /* renamed from: j */
            public final /* synthetic */ WalletConnectFragment f42441j;

            {
                this.f42441j = r1;
                vx2.m53590f(r2, "requireActivity()");
            }

            /* renamed from: s */
            public void mo58176s(WCPeerMeta wCPeerMeta) {
                vx2.m53591g(wCPeerMeta, "peer");
                y23 unused = d50.m56748b(this.f42441j.f42433k, (CoroutineContext) null, (CoroutineStart) null, new WalletConnectFragment$walletConnect$2$1$onSessionRequest$1(this.f42441j, wCPeerMeta, (ns0<? super WalletConnectFragment$walletConnect$2$1$onSessionRequest$1>) null), 3, (Object) null);
            }
        };
    }
}
