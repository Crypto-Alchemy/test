package net.safemoon.androidwallet.fragments;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lr37;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TokenListFragment.kt */
public final class TokenListFragment$getCheckoutUrl$2 extends Lambda implements rc2<String, r37> {
    public final /* synthetic */ TokenListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenListFragment$getCheckoutUrl$2(TokenListFragment tokenListFragment) {
        super(1);
        this.this$0 = tokenListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return r37.f33317a;
    }

    public final void invoke(String str) {
        this.this$0.f42237y = false;
        if (str != null) {
            Context requireContext = this.this$0.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            ol0.m70346Z(requireContext, str);
        }
    }
}
