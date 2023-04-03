package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "", "it", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "invoke", "(Lnet/safemoon/androidwallet/model/token/abstraction/IToken;)Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: AddNewTokensViewModel.kt */
public final class AddNewTokensViewModel$removeDeletableItem$1 extends Lambda implements rc2<IToken, Boolean> {
    public final /* synthetic */ C9449vc $item;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddNewTokensViewModel$removeDeletableItem$1(C9449vc vcVar) {
        super(1);
        this.$item = vcVar;
    }

    public final Boolean invoke(IToken iToken) {
        vx2.m53591g(iToken, "it");
        return Boolean.valueOf(vx2.m53586b(iToken.getContractAddress(), this.$item.mo66468a()) && vx2.m53586b(iToken.getSymbol(), this.$item.mo66475g()));
    }
}
