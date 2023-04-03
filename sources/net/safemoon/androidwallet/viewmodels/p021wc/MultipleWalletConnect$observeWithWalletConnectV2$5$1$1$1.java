package net.safemoon.androidwallet.viewmodels.p021wc;

import com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage;
import kotlin.Metadata;
import net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect;
import net.safemoon.androidwallet.viewmodels.wcv2.Wc2Web3;
import p000.eh7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$observeWithWalletConnectV2$5$1$1$1", "Leh7$b;", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$5$1$1$1 */
/* compiled from: MultipleWalletConnect.kt */
public final class MultipleWalletConnect$observeWithWalletConnectV2$5$1$1$1 implements eh7.C7051b {

    /* renamed from: a */
    public final /* synthetic */ MultipleWalletConnect.C8882b f43154a;

    /* renamed from: b */
    public final /* synthetic */ MultipleWalletConnect f43155b;

    /* renamed from: c */
    public final /* synthetic */ eh7 f43156c;

    public MultipleWalletConnect$observeWithWalletConnectV2$5$1$1$1(MultipleWalletConnect.C8882b bVar, MultipleWalletConnect multipleWalletConnect, eh7 eh7) {
        this.f43154a = bVar;
        this.f43155b = multipleWalletConnect;
        this.f43156c = eh7;
    }

    /* renamed from: a */
    public void mo51474a() {
        try {
            Wc2Web3 wc2Web3 = new Wc2Web3(this.f43154a.mo61934c().getChainId(), this.f43154a.mo61935d());
            if (this.f43154a.mo61933b().getType() == WCEthereumSignMessage.WCSignType.ETH_SIGN_TYPE_DATA_V4) {
                this.f43155b.f43100d.mo62070b(wc2Web3.mo62037z(this.f43154a.mo61932a(), this.f43154a.mo61933b()), C8913xf779045d.INSTANCE);
            } else {
                this.f43155b.f43100d.mo62070b(wc2Web3.mo62033A(this.f43154a.mo61932a(), this.f43154a.mo61933b()), C8914xf779045e.INSTANCE);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f43156c.mo22266k();
            throw th;
        }
        this.f43156c.mo22266k();
    }

    /* renamed from: b */
    public void mo51475b() {
        this.f43155b.f43100d.mo62073e(C8915xad956c49.INSTANCE);
    }
}
