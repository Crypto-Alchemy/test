package net.safemoon.androidwallet.viewmodels.blockChainClass;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Transfer.kt */
public final class Transfer$address$2 extends Lambda implements pc2<String> {
    public final /* synthetic */ Transfer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transfer$address$2(Transfer transfer) {
        super(0);
        this.this$0 = transfer;
    }

    public final String invoke() {
        mo2 m = this.this$0.mo61865m();
        TokenType q = this.this$0.mo61869q();
        Wallet c = ol0.m70351c(this.this$0.mo61858e());
        vx2.m53588d(c);
        return m.mo56291a(q, c);
    }
}
