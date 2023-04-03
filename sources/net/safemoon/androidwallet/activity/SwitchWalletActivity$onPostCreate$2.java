package net.safemoon.androidwallet.activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwitchWalletActivity.kt */
public final class SwitchWalletActivity$onPostCreate$2 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ SwitchWalletActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchWalletActivity$onPostCreate$2(SwitchWalletActivity switchWalletActivity) {
        super(1);
        this.this$0 = switchWalletActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<Wallet> list) {
        this.this$0.mo56922b0().submitList(list);
        if (list != null) {
            SwitchWalletActivity switchWalletActivity = this.this$0;
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Long id = list.get(i).getId();
                Wallet c = ol0.m70351c(switchWalletActivity);
                if (vx2.m53586b(id, c != null ? c.getId() : null)) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (arrayList.size() > 0) {
                RecyclerTouchListener W = switchWalletActivity.mo56921a0();
                Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
                W.mo57038z((Integer[]) Arrays.copyOf(numArr, numArr.length));
            }
        }
    }
}
