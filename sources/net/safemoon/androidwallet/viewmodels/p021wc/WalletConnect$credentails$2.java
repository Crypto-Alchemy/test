package net.safemoon.androidwallet.viewmodels.p021wc;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.MyCoinType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lcw0;", "kotlin.jvm.PlatformType", "invoke", "()Lcw0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.WalletConnect$credentails$2 */
/* compiled from: WalletConnect.kt */
public final class WalletConnect$credentails$2 extends Lambda implements pc2<cw0> {
    public final /* synthetic */ WalletConnect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnect$credentails$2(WalletConnect walletConnect) {
        super(0);
        this.this$0 = walletConnect;
    }

    public final cw0 invoke() {
        return cw0.create(this.this$0.mo62002m().getPrivateKey(MyCoinType.ETHEREUM.getValue()));
    }
}
