package net.safemoon.androidwallet.fragments;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendFragment.kt */
public final class SendFragment$onViewCreated$1 extends Lambda implements rc2<List<? extends UserTokenItemDisplayModel>, r37> {
    public final /* synthetic */ SendFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendFragment$onViewCreated$1(SendFragment sendFragment) {
        super(1);
        this.this$0 = sendFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<UserTokenItemDisplayModel>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<UserTokenItemDisplayModel> list) {
        vx2.m53591g(list, "list");
        f14 x = this.this$0.f42091s;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (ap2.m55613a(((UserTokenItemDisplayModel) next).getSymbolWithType()).mo67354b()) {
                arrayList.add(next);
            }
        }
        x.mo51569l(arrayList);
    }
}
