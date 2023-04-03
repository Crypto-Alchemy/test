package p000;

import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.token.room.RoomCustomToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000fJ\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, mo44877d2 = {"Lxy0;", "", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "iToken", "Lr37;", "e", "(Lnet/safemoon/androidwallet/model/token/abstraction/IToken;Lns0;)Ljava/lang/Object;", "", "symbolWithType", "iconPath", "f", "(Ljava/lang/String;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "id", "Lnet/safemoon/androidwallet/model/token/room/RoomCustomToken;", "d", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/common/TokenType;", "type", "", "b", "(Lnet/safemoon/androidwallet/common/TokenType;Lns0;)Ljava/lang/Object;", "a", "c", "(Lns0;)Ljava/lang/Object;", "Lvy0;", "Lvy0;", "dao", "<init>", "(Lvy0;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xy0 */
/* compiled from: CustomTokenDataSource.kt */
public final class xy0 {

    /* renamed from: a */
    public final vy0 f46059a;

    public xy0(vy0 vy0) {
        vx2.m53591g(vy0, "dao");
        this.f46059a = vy0;
    }

    /* renamed from: a */
    public final Object mo66975a(String str, ns0<? super r37> ns0) {
        Object l = this.f46059a.mo66599l(str, ns0);
        if (l == wx2.m54101d()) {
            return l;
        }
        return r37.f33317a;
    }

    /* renamed from: b */
    public final Object mo66976b(TokenType tokenType, ns0<? super List<RoomCustomToken>> ns0) {
        return this.f46059a.mo66594g(tokenType.getChainId(), ns0);
    }

    /* renamed from: c */
    public final Object mo66977c(ns0<? super List<RoomCustomToken>> ns0) {
        return this.f46059a.mo66596i(ns0);
    }

    /* renamed from: d */
    public final Object mo66978d(String str, ns0<? super RoomCustomToken> ns0) {
        return this.f46059a.mo66597j(str, ns0);
    }

    /* renamed from: e */
    public final Object mo66979e(IToken iToken, ns0<? super r37> ns0) {
        Object h = this.f46059a.mo66595h(new RoomCustomToken(iToken), ns0);
        if (h == wx2.m54101d()) {
            return h;
        }
        return r37.f33317a;
    }

    /* renamed from: f */
    public final Object mo66980f(String str, String str2, ns0<? super r37> ns0) {
        Object k = this.f46059a.mo66598k(str, str2, ns0);
        if (k == wx2.m54101d()) {
            return k;
        }
        return r37.f33317a;
    }
}
