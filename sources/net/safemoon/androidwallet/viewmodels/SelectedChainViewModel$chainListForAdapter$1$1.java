package net.safemoon.androidwallet.viewmodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.MyTokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SelectedChainViewModel.kt */
public final class SelectedChainViewModel$chainListForAdapter$1$1 extends Lambda implements rc2<String, r37> {
    public final /* synthetic */ ls3<List<MyTokenType>> $this_apply;
    public final /* synthetic */ SelectedChainViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectedChainViewModel$chainListForAdapter$1$1(ls3<List<MyTokenType>> ls3, SelectedChainViewModel selectedChainViewModel) {
        super(1);
        this.$this_apply = ls3;
        this.this$0 = selectedChainViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return r37.f33317a;
    }

    public final void invoke(String str) {
        SelectedChainViewModel.m68814h(this.$this_apply, this.this$0);
    }
}
