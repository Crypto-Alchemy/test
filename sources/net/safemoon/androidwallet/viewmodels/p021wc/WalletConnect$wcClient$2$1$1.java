package net.safemoon.androidwallet.viewmodels.p021wc;

import com.trustwallet.walletconnect.models.WCPeerMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "id", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "peer", "Lr37;", "invoke", "(JLcom/trustwallet/walletconnect/models/WCPeerMeta;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.WalletConnect$wcClient$2$1$1 */
/* compiled from: WalletConnect.kt */
public final class WalletConnect$wcClient$2$1$1 extends Lambda implements fd2<Long, WCPeerMeta, r37> {
    public final /* synthetic */ WalletConnect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnect$wcClient$2$1$1(WalletConnect walletConnect) {
        super(2);
        this.this$0 = walletConnect;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).longValue(), (WCPeerMeta) obj2);
        return r37.f33317a;
    }

    public final void invoke(long j, WCPeerMeta wCPeerMeta) {
        vx2.m53591g(wCPeerMeta, "peer");
        this.this$0.f43170h = wCPeerMeta;
        this.this$0.mo58176s(wCPeerMeta);
    }
}
