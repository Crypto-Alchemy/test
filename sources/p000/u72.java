package p000;

import kotlin.Metadata;
import net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase;
import net.safemoon.androidwallet.repository.ReflectionDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lu72;", "Lzn2;", "Lr37;", "a", "", "tokenNameWithSymbol", "newIconResName", "b", "Lip2;", "Lip2;", "userTokenListRepository", "Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "reflectionDataSource", "Lhu0;", "c", "Lhu0;", "coroutineScope", "<init>", "(Lip2;Lnet/safemoon/androidwallet/repository/ReflectionDataSource;Lhu0;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: u72 */
/* compiled from: ForceTokenListLogoUpdateUseCase.kt */
public final class u72 implements zn2 {

    /* renamed from: a */
    public final ip2 f44901a;

    /* renamed from: b */
    public final ReflectionDataSource f44902b;

    /* renamed from: c */
    public final hu0 f44903c;

    public u72(ip2 ip2, ReflectionDataSource reflectionDataSource, hu0 hu0) {
        vx2.m53591g(ip2, "userTokenListRepository");
        vx2.m53591g(reflectionDataSource, "reflectionDataSource");
        vx2.m53591g(hu0, "coroutineScope");
        this.f44901a = ip2;
        this.f44902b = reflectionDataSource;
        this.f44903c = hu0;
    }

    /* renamed from: a */
    public void mo57370a() {
        mo66186b("ERC_PSAFEMOON", "p_safemoon").mo57370a();
    }

    /* renamed from: b */
    public final zn2 mo66186b(String str, String str2) {
        return new ForceTokenLogoUpdateUseCase(this.f44901a, this.f44902b, this.f44903c, str, str2);
    }
}
