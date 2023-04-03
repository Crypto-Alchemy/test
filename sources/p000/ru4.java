package p000;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0002H\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"Lru4;", "Lto2;", "Lr37;", "a", "(Lns0;)Ljava/lang/Object;", "b", "c", "Lon2;", "Lon2;", "allTokensListRepository", "Lip2;", "Lip2;", "userTokenListRepository", "<init>", "(Lon2;Lip2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ru4 */
/* compiled from: PrefillUserDefaultTokensUseCase.kt */
public final class ru4 implements to2 {

    /* renamed from: a */
    public final on2 f44463a;

    /* renamed from: b */
    public final ip2 f44464b;

    public ru4(on2 on2, ip2 ip2) {
        vx2.m53591g(on2, "allTokensListRepository");
        vx2.m53591g(ip2, "userTokenListRepository");
        this.f44463a = on2;
        this.f44464b = ip2;
    }

    /* renamed from: a */
    public Object mo65758a(ns0<? super r37> ns0) {
        mo65760c();
        return r37.f33317a;
    }

    /* renamed from: b */
    public Object mo65759b(ns0<? super r37> ns0) {
        for (Pair pair : ApplicationRoomDatabase.f41664p.mo57122e()) {
            List<IToken> a = this.f44463a.mo51655a((TokenType) pair.getFirst());
            for (String str : (List) pair.getSecond()) {
                for (IToken next : a) {
                    if (vx2.m53586b(next.getSymbolWithType(), str) && !this.f44464b.mo50496h(next, TokenType.Companion.mo57099b(next.getChainId()))) {
                        this.f44464b.mo50495g(next);
                    }
                }
            }
        }
        return r37.f33317a;
    }

    /* renamed from: c */
    public final void mo65760c() {
        for (Pair pair : ApplicationRoomDatabase.f41664p.mo57121d()) {
            List<IToken> a = this.f44463a.mo51655a((TokenType) pair.getFirst());
            for (String str : (List) pair.getSecond()) {
                for (IToken next : a) {
                    if (vx2.m53586b(next.getSymbolWithType(), str) && !this.f44464b.mo50496h(next, TokenType.Companion.mo57099b(next.getChainId()))) {
                        this.f44464b.mo50495g(next);
                    }
                }
            }
        }
    }
}
