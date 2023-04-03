package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/TokenType;", "kotlin.jvm.PlatformType", "type", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/common/TokenType;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: MyTokensListFragment.kt */
public final class MyTokensListFragment$observeViewModel$1 extends Lambda implements rc2<TokenType, r37> {
    public final /* synthetic */ MyTokensListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyTokensListFragment$observeViewModel$1(MyTokensListFragment myTokensListFragment) {
        super(1);
        this.this$0 = myTokensListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TokenType) obj);
        return r37.f33317a;
    }

    public final void invoke(TokenType tokenType) {
        bb2 D = this.this$0.f41980k;
        bb2 bb2 = null;
        if (D == null) {
            vx2.m53605u("binding");
            D = null;
        }
        D.f21225h.f21731f.setText(tokenType.getPlaneName());
        bb2 D2 = this.this$0.f41980k;
        if (D2 == null) {
            vx2.m53605u("binding");
            D2 = null;
        }
        D2.f21225h.f21730e.setImageResource(tokenType.getIcon());
        bb2 D3 = this.this$0.f41980k;
        if (D3 == null) {
            vx2.m53605u("binding");
        } else {
            bb2 = D3;
        }
        bb2.f21230m.setText(tokenType == TokenType.MULTI_COIN ? R.string.my_coins_screen_title : R.string.my_tokens_screen_title);
    }
}
