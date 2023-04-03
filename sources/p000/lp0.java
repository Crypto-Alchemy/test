package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000bH'\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"Llp0;", "", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "token", "Lr37;", "c", "(Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;Lns0;)Ljava/lang/Object;", "", "session", "a", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfoAndWallet;", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: lp0 */
/* compiled from: ConnectedInfoDao.kt */
public interface lp0 {
    /* renamed from: a */
    Object mo55946a(String str, ns0<? super r37> ns0);

    /* renamed from: b */
    LiveData<List<RoomConnectedInfoAndWallet>> mo55947b();

    /* renamed from: c */
    Object mo55948c(RoomConnectedInfo roomConnectedInfo, ns0<? super r37> ns0);
}
