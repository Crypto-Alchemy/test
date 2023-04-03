package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lk04;", "", "invoke", "()Lk04;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: MyTokensListViewModel.kt */
public final class MyTokensListViewModel$totalBalanceForDefault$2 extends Lambda implements pc2<k04<Boolean>> {
    public final /* synthetic */ MyTokensListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyTokensListViewModel$totalBalanceForDefault$2(MyTokensListViewModel myTokensListViewModel) {
        super(0);
        this.this$0 = myTokensListViewModel;
    }

    public final k04<Boolean> invoke() {
        return new k04<>(Boolean.valueOf(f06.m57514e(this.this$0.mo27549b(), "DEFAULT_CHAIN_BALANCE", true)));
    }
}
