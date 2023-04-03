package net.safemoon.androidwallet.repository.dataSource.token.user;

import androidx.lifecycle.LiveData;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.token.room.RoomToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J \u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J#\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J;\u0010%\u001a\u00020\u00172*\u0010$\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\"0!\"\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\"H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/dataSource/token/user/LocalUserTokenDataSource;", "Lgp2;", "Lnet/safemoon/androidwallet/common/TokenType;", "type", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/token/room/RoomToken;", "a", "i", "(Lnet/safemoon/androidwallet/common/TokenType;Lns0;)Ljava/lang/Object;", "", "symbolWithType", "f", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "l", "d", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "token", "tokenType", "", "h", "", "nativeBalance", "Lr37;", "b", "priceInUsdt", "percentChange1h", "c", "iconName", "e", "(Ljava/lang/String;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "g", "j", "", "Lkotlin/Pair;", "", "orders", "k", "([Lkotlin/Pair;)V", "Lz57;", "Lz57;", "userDao", "<init>", "(Lz57;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: LocalUserTokenDataSource.kt */
public final class LocalUserTokenDataSource implements gp2 {

    /* renamed from: a */
    public final z57 f42543a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0004\n\u0002\b\u0007\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"X", "Y", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource$a */
    /* compiled from: Transformations.kt */
    public static final class C8616a<I, O> implements sd2<List<? extends RoomToken>, List<? extends RoomToken>> {
        public final List<? extends RoomToken> apply(List<? extends RoomToken> list) {
            List<RoomToken> list2 = list;
            for (RoomToken roomToken : list2) {
                if (roomToken.getOrder() == 0) {
                    String symbolWithType = roomToken.getSymbolWithType();
                    switch (symbolWithType.hashCode()) {
                        case -1158212709:
                            if (!symbolWithType.equals("BEP_SAFEMOON_V2")) {
                                break;
                            } else {
                                roomToken.setOrder(-3);
                                break;
                            }
                        case -774390032:
                            if (symbolWithType.equals("ERC_ETH")) {
                                roomToken.setOrder(-1);
                                break;
                            } else {
                                break;
                            }
                        case 295942048:
                            if (symbolWithType.equals("BEP_SAFEMOON")) {
                                roomToken.setOrder(-1);
                                break;
                            } else {
                                break;
                            }
                        case 497889956:
                            if (symbolWithType.equals("BEP_BNB")) {
                                roomToken.setOrder(-2);
                                break;
                            } else {
                                break;
                            }
                        case 1284540565:
                            if (symbolWithType.equals("ERC_PSAFEMOON")) {
                                roomToken.setOrder(-2);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            return CollectionsKt___CollectionsKt.m47304D0(list2, new C8617b());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource$b */
    /* compiled from: Comparisons.kt */
    public static final class C8617b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(Integer.valueOf(((RoomToken) t).getOrder()), Integer.valueOf(((RoomToken) t2).getOrder()));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0004\n\u0002\b\u0007\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"X", "Y", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource$c */
    /* compiled from: Transformations.kt */
    public static final class C8618c<I, O> implements sd2<List<? extends RoomToken>, List<? extends RoomToken>> {
        public final List<? extends RoomToken> apply(List<? extends RoomToken> list) {
            List<RoomToken> list2 = list;
            for (RoomToken roomToken : list2) {
                if (roomToken.getOrder() == 0) {
                    String symbolWithType = roomToken.getSymbolWithType();
                    switch (symbolWithType.hashCode()) {
                        case -1158212709:
                            if (!symbolWithType.equals("BEP_SAFEMOON_V2")) {
                                break;
                            } else {
                                roomToken.setOrder(-3);
                                break;
                            }
                        case -774390032:
                            if (symbolWithType.equals("ERC_ETH")) {
                                roomToken.setOrder(-1);
                                break;
                            } else {
                                break;
                            }
                        case 295942048:
                            if (symbolWithType.equals("BEP_SAFEMOON")) {
                                roomToken.setOrder(-1);
                                break;
                            } else {
                                break;
                            }
                        case 497889956:
                            if (symbolWithType.equals("BEP_BNB")) {
                                roomToken.setOrder(-2);
                                break;
                            } else {
                                break;
                            }
                        case 1284540565:
                            if (symbolWithType.equals("ERC_PSAFEMOON")) {
                                roomToken.setOrder(-2);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            return CollectionsKt___CollectionsKt.m47304D0(list2, new C8619d());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource$d */
    /* compiled from: Comparisons.kt */
    public static final class C8619d<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(Integer.valueOf(((RoomToken) t).getOrder()), Integer.valueOf(((RoomToken) t2).getOrder()));
        }
    }

    public LocalUserTokenDataSource(z57 z57) {
        vx2.m53591g(z57, "userDao");
        this.f42543a = z57;
    }

    /* renamed from: a */
    public LiveData<List<RoomToken>> mo51955a(TokenType tokenType) {
        LiveData<List<RoomToken>> liveData;
        vx2.m53591g(tokenType, "type");
        if (tokenType == TokenType.MULTI_COIN) {
            liveData = this.f42543a.mo50083j();
        } else {
            liveData = this.f42543a.mo50085l(tokenType.getChainId());
        }
        LiveData<Y> b = qw6.m25942b(ho0.m58585b(liveData), new C8616a());
        vx2.m53590f(b, "Transformations.map(this) { transform(it) }");
        return b;
    }

    /* renamed from: b */
    public void mo51956b(String str, double d) {
        vx2.m53591g(str, "symbolWithType");
        this.f42543a.mo50075b(str, d);
    }

    /* renamed from: c */
    public void mo51957c(String str, double d, double d2) {
        vx2.m53591g(str, "symbolWithType");
        this.f42543a.mo50076c(str, d, d2);
    }

    /* renamed from: d */
    public LiveData<RoomToken> mo51958d(String str) {
        vx2.m53591g(str, "symbolWithType");
        return this.f42543a.mo50077d(str);
    }

    /* renamed from: e */
    public Object mo51959e(String str, String str2, ns0<? super r37> ns0) {
        Object e = this.f42543a.mo50078e(str, str2, ns0);
        if (e == wx2.m54101d()) {
            return e;
        }
        return r37.f33317a;
    }

    /* renamed from: f */
    public Object mo51960f(String str, ns0<? super RoomToken> ns0) {
        return this.f42543a.mo50079f(str, ns0);
    }

    /* renamed from: g */
    public void mo51961g(IToken iToken) {
        vx2.m53591g(iToken, "token");
        this.f42543a.mo50088o(new RoomToken(iToken));
    }

    /* renamed from: h */
    public boolean mo51962h(IToken iToken, TokenType tokenType) {
        vx2.m53591g(iToken, "token");
        vx2.m53591g(tokenType, "tokenType");
        return this.f42543a.mo50087n(iToken.getSymbolWithType(), tokenType.getChainId());
    }

    /* renamed from: i */
    public Object mo51963i(TokenType tokenType, ns0<? super List<RoomToken>> ns0) {
        return this.f42543a.mo50080g(tokenType.getChainId(), ns0);
    }

    /* renamed from: j */
    public void mo51964j(IToken iToken) {
        vx2.m53591g(iToken, "token");
        this.f42543a.mo50082i(new RoomToken(iToken));
    }

    /* renamed from: k */
    public void mo51965k(Pair<String, Integer>... pairArr) {
        vx2.m53591g(pairArr, "orders");
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new LocalUserTokenDataSource$updateOrders$1(pairArr, this, (ns0<? super LocalUserTokenDataSource$updateOrders$1>) null), 3, (Object) null);
    }

    /* renamed from: l */
    public LiveData<List<RoomToken>> mo51966l() {
        LiveData<List<RoomToken>> b = qw6.m25942b(ho0.m58585b(this.f42543a.mo50074a()), new C8618c());
        vx2.m53590f(b, "Transformations.map(this) { transform(it) }");
        return b;
    }
}
