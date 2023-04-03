package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.token.room.RoomToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H&J\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\r\u001a\u00020\fH&J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0002H&J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H&J \u0010\u001b\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H&J#\u0010\u001d\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H&J;\u0010%\u001a\u00020\u00172*\u0010$\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#0\"0!\"\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#0\"H&¢\u0006\u0004\b%\u0010&\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, mo44877d2 = {"Lgp2;", "", "Lnet/safemoon/androidwallet/common/TokenType;", "type", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/token/room/RoomToken;", "a", "tokenType", "i", "(Lnet/safemoon/androidwallet/common/TokenType;Lns0;)Ljava/lang/Object;", "l", "", "symbolWithType", "f", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "d", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "token", "", "h", "", "nativeBalance", "Lr37;", "b", "priceInUsdt", "percentChange1h", "c", "iconName", "e", "(Ljava/lang/String;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "g", "j", "", "Lkotlin/Pair;", "", "orders", "k", "([Lkotlin/Pair;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gp2 */
/* compiled from: IUserTokenDataSource.kt */
public interface gp2 {
    /* renamed from: a */
    LiveData<List<RoomToken>> mo51955a(TokenType tokenType);

    /* renamed from: b */
    void mo51956b(String str, double d);

    /* renamed from: c */
    void mo51957c(String str, double d, double d2);

    /* renamed from: d */
    LiveData<RoomToken> mo51958d(String str);

    /* renamed from: e */
    Object mo51959e(String str, String str2, ns0<? super r37> ns0);

    /* renamed from: f */
    Object mo51960f(String str, ns0<? super RoomToken> ns0);

    /* renamed from: g */
    void mo51961g(IToken iToken);

    /* renamed from: h */
    boolean mo51962h(IToken iToken, TokenType tokenType);

    /* renamed from: i */
    Object mo51963i(TokenType tokenType, ns0<? super List<RoomToken>> ns0);

    /* renamed from: j */
    void mo51964j(IToken iToken);

    /* renamed from: k */
    void mo51965k(Pair<String, Integer>... pairArr);

    /* renamed from: l */
    LiveData<List<RoomToken>> mo51966l();
}
