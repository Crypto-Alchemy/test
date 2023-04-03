package p000;

import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo44877d2 = {"Lvf2;", "Lco2;", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "token", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "", "a", "(Lnet/safemoon/androidwallet/model/token/abstraction/IToken;Lnet/safemoon/androidwallet/common/TokenType;Lns0;)Ljava/lang/Object;", "Lip2;", "Lip2;", "userRepository", "<init>", "(Lip2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vf2 */
/* compiled from: GetIsUserHasTokenUseCase.kt */
public final class vf2 implements co2 {

    /* renamed from: a */
    public final ip2 f45284a;

    public vf2(ip2 ip2) {
        vx2.m53591g(ip2, "userRepository");
        this.f45284a = ip2;
    }

    /* renamed from: a */
    public Object mo50927a(IToken iToken, TokenType tokenType, ns0<? super Boolean> ns0) {
        return a40.m31670a(this.f45284a.mo50496h(iToken, tokenType));
    }
}
