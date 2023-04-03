package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/common/TokenType;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SendtoFragment.kt */
public final class SendtoFragment$tokenType$2 extends Lambda implements pc2<TokenType> {
    public final /* synthetic */ SendtoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendtoFragment$tokenType$2(SendtoFragment sendtoFragment) {
        super(0);
        this.this$0 = sendtoFragment;
    }

    public final TokenType invoke() {
        UserTokenItemDisplayModel I = this.this$0.f42110A;
        if (I == null) {
            return null;
        }
        return TokenType.Companion.mo57099b(I.getChainId());
    }
}
