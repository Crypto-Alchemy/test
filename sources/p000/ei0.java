package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.RoomCoinPriceAlert;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo44877d2 = {"Lei0;", "", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/RoomCoinPriceAlert;", "d", "c", "(Lns0;)Ljava/lang/Object;", "item", "Lr37;", "e", "(Lnet/safemoon/androidwallet/model/RoomCoinPriceAlert;Lns0;)Ljava/lang/Object;", "b", "", "id", "a", "(ILns0;)Ljava/lang/Object;", "Lci0;", "Lci0;", "dao", "<init>", "(Lci0;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ei0 */
/* compiled from: CoinPriceAlertDataSource.kt */
public final class ei0 {

    /* renamed from: a */
    public final ci0 f37555a;

    public ei0(ci0 ci0) {
        vx2.m53591g(ci0, "dao");
        this.f37555a = ci0;
    }

    /* renamed from: a */
    public final Object mo51476a(int i, ns0<? super r37> ns0) {
        Object c = this.f37555a.mo50901c(i, ns0);
        if (c == wx2.m54101d()) {
            return c;
        }
        return r37.f33317a;
    }

    /* renamed from: b */
    public final Object mo51477b(RoomCoinPriceAlert roomCoinPriceAlert, ns0<? super r37> ns0) {
        Object d = this.f37555a.mo50902d(roomCoinPriceAlert, ns0);
        if (d == wx2.m54101d()) {
            return d;
        }
        return r37.f33317a;
    }

    /* renamed from: c */
    public final Object mo51478c(ns0<? super List<RoomCoinPriceAlert>> ns0) {
        return this.f37555a.mo50900b(ns0);
    }

    /* renamed from: d */
    public final LiveData<List<RoomCoinPriceAlert>> mo51479d() {
        return this.f37555a.mo50899a();
    }

    /* renamed from: e */
    public final Object mo51480e(RoomCoinPriceAlert roomCoinPriceAlert, ns0<? super r37> ns0) {
        Object e = this.f37555a.mo50903e(roomCoinPriceAlert, ns0);
        if (e == wx2.m54101d()) {
            return e;
        }
        return r37.f33317a;
    }
}
