package net.safemoon.androidwallet.fragments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.dialogs.CMCListCheckable;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.model.RoomCoinPriceAlert;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/RoomCoinPriceAlert;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: NotificationFragment.kt */
public final class NotificationFragment$initPriceAlert$1$1$1 extends Lambda implements rc2<List<? extends RoomCoinPriceAlert>, r37> {
    public final /* synthetic */ NotificationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationFragment$initPriceAlert$1$1$1(NotificationFragment notificationFragment) {
        super(1);
        this.this$0 = notificationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<RoomCoinPriceAlert>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<RoomCoinPriceAlert> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
            for (RoomCoinPriceAlert coinData : list) {
                arrayList.add(coinData.getCoinData());
            }
            NotificationFragment notificationFragment = this.this$0;
            if (notificationFragment.mo57517L().isVisible()) {
                CMCListCheckable D = notificationFragment.mo57517L();
                ArrayList<Coin> arrayList2 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                while (true) {
                    Integer num = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Coin coin = (Coin) next;
                    if (coin != null) {
                        num = coin.getId();
                    }
                    if (num != null) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(dk0.m43495u(arrayList2, 10));
                for (Coin coin2 : arrayList2) {
                    Integer id = coin2 != null ? coin2.getId() : null;
                    vx2.m53588d(id);
                    arrayList3.add(Integer.valueOf(id.intValue()));
                }
                int[] J0 = CollectionsKt___CollectionsKt.m47310J0(arrayList3);
                D.mo57171S(Arrays.copyOf(J0, J0.length));
            }
        }
    }
}
