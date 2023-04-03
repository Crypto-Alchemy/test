package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH&\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, mo44877d2 = {"Lxn2;", "", "", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "roomFiat", "Lr37;", "b", "([Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;Lns0;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xn2 */
/* compiled from: IFiatTokenDataSource.kt */
public interface xn2 {
    /* renamed from: a */
    LiveData<List<RoomFiat>> mo50428a();

    /* renamed from: b */
    Object mo50429b(Fiat[] fiatArr, ns0<? super r37> ns0);
}
