package net.safemoon.androidwallet.fragments.collectibles;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/common/TokenType;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SendToNftFragment.kt */
public final class SendToNftFragment$tokenType$2 extends Lambda implements pc2<TokenType> {
    public final /* synthetic */ SendToNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendToNftFragment$tokenType$2(SendToNftFragment sendToNftFragment) {
        super(0);
        this.this$0 = sendToNftFragment;
    }

    public final TokenType invoke() {
        TokenType.C8246a aVar = TokenType.Companion;
        Integer chainID = this.this$0.mo58015U().getChainID();
        vx2.m53588d(chainID);
        return aVar.mo57099b(chainID.intValue());
    }
}
