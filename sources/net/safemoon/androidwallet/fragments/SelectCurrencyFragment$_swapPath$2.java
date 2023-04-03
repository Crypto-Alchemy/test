package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.fragments.SelectCurrencyFragment;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/fragments/SelectCurrencyFragment$SWAPPATH;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SelectCurrencyFragment.kt */
public final class SelectCurrencyFragment$_swapPath$2 extends Lambda implements pc2<SelectCurrencyFragment.SWAPPATH> {
    public final /* synthetic */ SelectCurrencyFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectCurrencyFragment$_swapPath$2(SelectCurrencyFragment selectCurrencyFragment) {
        super(0);
        this.this$0 = selectCurrencyFragment;
    }

    public final SelectCurrencyFragment.SWAPPATH invoke() {
        Bundle arguments = this.this$0.getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("SWAPPATH") : null;
        vx2.m53589e(serializable, "null cannot be cast to non-null type net.safemoon.androidwallet.fragments.SelectCurrencyFragment.SWAPPATH");
        return (SelectCurrencyFragment.SWAPPATH) serializable;
    }
}
