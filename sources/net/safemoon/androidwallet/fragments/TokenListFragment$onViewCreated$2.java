package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/TokenType;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/common/TokenType;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TokenListFragment.kt */
public final class TokenListFragment$onViewCreated$2 extends Lambda implements rc2<TokenType, r37> {
    public final /* synthetic */ TokenListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenListFragment$onViewCreated$2(TokenListFragment tokenListFragment) {
        super(1);
        this.this$0 = tokenListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TokenType) obj);
        return r37.f33317a;
    }

    public final void invoke(TokenType tokenType) {
        AddNewTokensViewModel v = this.this$0.mo57853B();
        vx2.m53590f(tokenType, "it");
        v.mo60966m(tokenType);
        this.this$0.mo57857F();
    }
}
