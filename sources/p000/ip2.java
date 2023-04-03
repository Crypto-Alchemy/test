package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.token.room.RoomToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H&J \u0010\u001c\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H&J;\u0010!\u001a\u00020\u00122*\u0010 \u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d\"\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001f0\u001eH&¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, mo44877d2 = {"Lip2;", "", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/token/room/RoomToken;", "a", "i", "(Lnet/safemoon/androidwallet/common/TokenType;Lns0;)Ljava/lang/Object;", "l", "", "symbolWithType", "d", "f", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "token", "Lr37;", "g", "j", "", "h", "", "nativeBalance", "b", "priceInUsdt", "percentChange1h", "c", "", "Lkotlin/Pair;", "", "orders", "k", "([Lkotlin/Pair;)V", "iconName", "e", "(Ljava/lang/String;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ip2 */
/* compiled from: IUserTokenListRepository.kt */
public interface ip2 {
    /* renamed from: a */
    LiveData<List<RoomToken>> mo50489a(TokenType tokenType);

    /* renamed from: b */
    void mo50490b(String str, double d);

    /* renamed from: c */
    void mo50491c(String str, double d, double d2);

    /* renamed from: d */
    LiveData<RoomToken> mo50492d(String str);

    /* renamed from: e */
    Object mo50493e(String str, String str2, ns0<? super r37> ns0);

    /* renamed from: f */
    Object mo50494f(String str, ns0<? super RoomToken> ns0);

    /* renamed from: g */
    void mo50495g(IToken iToken);

    /* renamed from: h */
    boolean mo50496h(IToken iToken, TokenType tokenType);

    /* renamed from: i */
    Object mo50497i(TokenType tokenType, ns0<? super List<RoomToken>> ns0);

    /* renamed from: j */
    void mo50498j(IToken iToken);

    /* renamed from: k */
    void mo50499k(Pair<String, Integer>... pairArr);

    /* renamed from: l */
    LiveData<List<RoomToken>> mo50500l();
}
