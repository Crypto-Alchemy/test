package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lwc0;", "invoke", "()Lwc0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ChainNetworkReflectionFragment.kt */
public final class ChainNetworkReflectionFragment$chainNetworkAdapter$2 extends Lambda implements pc2<wc0> {
    public final /* synthetic */ ChainNetworkReflectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChainNetworkReflectionFragment$chainNetworkAdapter$2(ChainNetworkReflectionFragment chainNetworkReflectionFragment) {
        super(0);
        this.this$0 = chainNetworkReflectionFragment;
    }

    public final wc0 invoke() {
        final ChainNetworkReflectionFragment chainNetworkReflectionFragment = this.this$0;
        return new wc0(new rc2<TokenType, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TokenType) obj);
                return r37.f33317a;
            }

            public final void invoke(TokenType tokenType) {
                vx2.m53591g(tokenType, "it");
                chainNetworkReflectionFragment.mo57476v().mo61189s().postValue(tokenType);
                chainNetworkReflectionFragment.requireActivity().onBackPressed();
            }
        });
    }
}
