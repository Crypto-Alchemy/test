package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/common/TokenType;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TransferHistoryFragment.kt */
public final class TransferHistoryFragment$tokenType$2 extends Lambda implements pc2<TokenType> {
    public final /* synthetic */ TransferHistoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferHistoryFragment$tokenType$2(TransferHistoryFragment transferHistoryFragment) {
        super(0);
        this.this$0 = transferHistoryFragment;
    }

    public final TokenType invoke() {
        return TokenType.Companion.mo57099b(this.this$0.mo57901q0().getChainId());
    }
}
