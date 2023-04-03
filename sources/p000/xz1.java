package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH'J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH'J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH'J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u0011H'¨\u0006\u0014"}, mo44877d2 = {"Lxz1;", "", "", "Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "roomFiat", "Lr37;", "c", "([Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;)V", "", "symbol", "", "e", "", "rate", "b", "name", "d", "Landroidx/lifecycle/LiveData;", "", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xz1 */
/* compiled from: FiatListDao.kt */
public interface xz1 {
    /* renamed from: a */
    LiveData<List<RoomFiat>> mo66987a();

    /* renamed from: b */
    void mo66988b(String str, double d);

    /* renamed from: c */
    void mo66989c(RoomFiat... roomFiatArr);

    /* renamed from: d */
    void mo66990d(String str, String str2);

    /* renamed from: e */
    boolean mo66991e(String str);
}
