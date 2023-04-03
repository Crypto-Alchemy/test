package net.safemoon.androidwallet.viewmodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.Coin;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/Coin;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CMCListViewModel.kt */
public final class CMCListViewModel$coinMediatorLiveData$1$2 extends Lambda implements rc2<List<? extends Coin>, r37> {
    public final /* synthetic */ ls3<List<qx1>> $this_apply;
    public final /* synthetic */ CMCListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CMCListViewModel$coinMediatorLiveData$1$2(CMCListViewModel cMCListViewModel, ls3<List<qx1>> ls3) {
        super(1);
        this.this$0 = cMCListViewModel;
        this.$this_apply = ls3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends Coin>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<? extends Coin> list) {
        CMCListViewModel.m68392l(this.this$0, this.$this_apply);
    }
}
