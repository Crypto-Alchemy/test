package net.safemoon.androidwallet.fragments;

import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.CMCListCheckable;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.model.RoomCoinPriceAlert;
import net.safemoon.androidwallet.model.priceAlert.PAToken;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/dialogs/CMCListCheckable;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: NotificationFragment.kt */
public final class NotificationFragment$cmcListDialog$2 extends Lambda implements pc2<CMCListCheckable> {
    public final /* synthetic */ NotificationFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/NotificationFragment$cmcListDialog$2$a", "Lpn2;", "Lnet/safemoon/androidwallet/model/Coin;", "coin", "Lr37;", "a", "b", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.NotificationFragment$cmcListDialog$2$a */
    /* compiled from: NotificationFragment.kt */
    public static final class C8407a implements pn2 {

        /* renamed from: a */
        public final /* synthetic */ NotificationFragment f41996a;

        /* renamed from: b */
        public final /* synthetic */ CMCListCheckable f41997b;

        public C8407a(NotificationFragment notificationFragment, CMCListCheckable cMCListCheckable) {
            this.f41996a = notificationFragment;
            this.f41997b = cMCListCheckable;
        }

        /* renamed from: e */
        public static final void m66694e(CMCListCheckable cMCListCheckable, List list) {
            Integer num;
            boolean z;
            vx2.m53591g(cMCListCheckable, "$this_apply");
            if (list != null) {
                ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RoomCoinPriceAlert) it.next()).getCoinData());
                }
                ArrayList<Coin> arrayList2 = new ArrayList<>();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    Integer num2 = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    Coin coin = (Coin) next;
                    if (coin != null) {
                        num2 = coin.getId();
                    }
                    if (num2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(dk0.m43495u(arrayList2, 10));
                for (Coin coin2 : arrayList2) {
                    if (coin2 != null) {
                        num = coin2.getId();
                    } else {
                        num = null;
                    }
                    vx2.m53588d(num);
                    arrayList3.add(Integer.valueOf(num.intValue()));
                }
                int[] J0 = CollectionsKt___CollectionsKt.m47310J0(arrayList3);
                cMCListCheckable.mo57171S(Arrays.copyOf(J0, J0.length));
            }
        }

        /* renamed from: a */
        public void mo57526a(Coin coin) {
            vx2.m53591g(coin, "coin");
            this.f41996a.mo57518M().mo61412p(coin);
        }

        /* renamed from: b */
        public void mo57527b(Coin coin) {
            Object obj;
            vx2.m53591g(coin, "coin");
            List currentList = this.f41996a.mo57520O().getCurrentList();
            vx2.m53590f(currentList, "paTokenAdapter.currentList");
            Iterator it = currentList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (vx2.m53586b(((PAToken) obj).getCmcId(), coin.getId())) {
                    break;
                }
            }
            PAToken pAToken = (PAToken) obj;
            if (pAToken != null) {
                this.f41996a.mo57518M().mo61413q(pAToken);
            }
        }

        /* renamed from: c */
        public void mo57528c() {
            LiveData<List<RoomCoinPriceAlert>> t = this.f41996a.mo57518M().mo61416t();
            ug3 viewLifecycleOwner = this.f41996a.getViewLifecycleOwner();
            vx2.m53590f(viewLifecycleOwner, "this@NotificationFragment.viewLifecycleOwner");
            pi3.m71013a(t, viewLifecycleOwner, new oa4(this.f41997b));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationFragment$cmcListDialog$2(NotificationFragment notificationFragment) {
        super(0);
        this.this$0 = notificationFragment;
    }

    public final CMCListCheckable invoke() {
        CMCListCheckable.C8279a aVar = CMCListCheckable.f41713v0;
        String string = this.this$0.getString(R.string.notifications);
        vx2.m53590f(string, "getString(R.string.notifications)");
        CMCListCheckable a = aVar.mo57173a(string, true);
        a.mo57170R(new C8407a(this.this$0, a));
        return a;
    }
}
