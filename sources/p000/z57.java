package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.token.room.RoomToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H'J\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H'J\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0010\u001a\u00020\u000fH'J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0006H'J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH'J \u0010!\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cH'J#\u0010#\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J#\u0010&\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0006H'\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, mo44877d2 = {"Lz57;", "", "", "chainId", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/token/room/RoomToken;", "l", "g", "(ILns0;)Ljava/lang/Object;", "j", "k", "(Lns0;)Ljava/lang/Object;", "a", "p", "", "symbolWithType", "f", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "contractAddress", "h", "(ILjava/lang/String;Lns0;)Ljava/lang/Object;", "d", "", "n", "token", "Lr37;", "o", "", "nativeBalance", "b", "priceInUsdt", "percentChange1h", "c", "order", "m", "(Ljava/lang/String;ILns0;)Ljava/lang/Object;", "iconName", "e", "(Ljava/lang/String;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "coin", "i", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: z57 */
/* compiled from: UserTokenListDao.kt */
public interface z57 {
    /* renamed from: a */
    LiveData<List<RoomToken>> mo50074a();

    /* renamed from: b */
    void mo50075b(String str, double d);

    /* renamed from: c */
    void mo50076c(String str, double d, double d2);

    /* renamed from: d */
    LiveData<RoomToken> mo50077d(String str);

    /* renamed from: e */
    Object mo50078e(String str, String str2, ns0<? super r37> ns0);

    /* renamed from: f */
    Object mo50079f(String str, ns0<? super RoomToken> ns0);

    /* renamed from: g */
    Object mo50080g(int i, ns0<? super List<RoomToken>> ns0);

    /* renamed from: h */
    Object mo50081h(int i, String str, ns0<? super RoomToken> ns0);

    /* renamed from: i */
    void mo50082i(RoomToken roomToken);

    /* renamed from: j */
    LiveData<List<RoomToken>> mo50083j();

    /* renamed from: k */
    Object mo50084k(ns0<? super List<RoomToken>> ns0);

    /* renamed from: l */
    LiveData<List<RoomToken>> mo50085l(int i);

    /* renamed from: m */
    Object mo50086m(String str, int i, ns0<? super r37> ns0);

    /* renamed from: n */
    boolean mo50087n(String str, int i);

    /* renamed from: o */
    void mo50088o(RoomToken roomToken);

    /* renamed from: p */
    Object mo50089p(ns0<? super List<RoomToken>> ns0);
}
