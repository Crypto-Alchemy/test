package net.safemoon.androidwallet.viewmodels.blockChainClass;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: MyWeb3.kt */
public final class MyWeb3$address$2 extends Lambda implements pc2<String> {
    public final /* synthetic */ MyWeb3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyWeb3$address$2(MyWeb3 myWeb3) {
        super(0);
        this.this$0 = myWeb3;
    }

    public final String invoke() {
        Wallet c = ol0.m70351c(this.this$0.mo61800a());
        if (c != null) {
            return c.getAddress(this.this$0.mo61838f().getCoinType().getValue());
        }
        return null;
    }
}
