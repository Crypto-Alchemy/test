package p000;

import android.app.Activity;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.p021wc.WalletConnect;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000fH\u0016¨\u0006\u0017"}, mo44877d2 = {"Lqf7;", "Lnet/safemoon/androidwallet/viewmodels/wc/WalletConnect;", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "peer", "Lr37;", "s", "", "id", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;", "message", "q", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "transaction", "r", "", "", "p", "Landroid/app/Activity;", "activity", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "<init>", "(Landroid/app/Activity;Lnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qf7 */
/* compiled from: WC.kt */
public class qf7 extends WalletConnect {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qf7(Activity activity, Wallet wallet2) {
        super(activity, wallet2);
        vx2.m53591g(activity, "activity");
        vx2.m53591g(wallet2, "wallet");
    }

    /* renamed from: p */
    public void mo61960p(int i, String str) {
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
    }

    /* renamed from: q */
    public void mo61961q(long j, WCEthereumSignMessage wCEthereumSignMessage) {
        vx2.m53591g(wCEthereumSignMessage, ThrowableDeserializer.PROP_NAME_MESSAGE);
    }

    /* renamed from: r */
    public void mo61962r(long j, WCEthereumTransaction wCEthereumTransaction) {
        vx2.m53591g(wCEthereumTransaction, "transaction");
    }

    /* renamed from: s */
    public void mo58176s(WCPeerMeta wCPeerMeta) {
        vx2.m53591g(wCPeerMeta, "peer");
    }
}
