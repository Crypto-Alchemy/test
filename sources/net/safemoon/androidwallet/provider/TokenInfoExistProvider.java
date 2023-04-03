package net.safemoon.androidwallet.provider;

import android.content.Context;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, mo44877d2 = {"Lnet/safemoon/androidwallet/provider/TokenInfoExistProvider;", "", "", "cmcId", "Lk04;", "", "slugLiveData", "Lr37;", "e", "(Ljava/lang/Integer;Lk04;)V", "Lir6;", "a", "Lef3;", "d", "()Lir6;", "tokenInfoDataSource", "Lxy0;", "b", "c", "()Lxy0;", "customTokenProvider", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TokenInfoExistProvider.kt */
public final class TokenInfoExistProvider {

    /* renamed from: a */
    public final ef3 f42495a;

    /* renamed from: b */
    public final ef3 f42496b;

    public TokenInfoExistProvider(Context context) {
        vx2.m53591g(context, "context");
        this.f42495a = C6169a.m47232a(new TokenInfoExistProvider$tokenInfoDataSource$2(context));
        this.f42496b = C6169a.m47232a(new TokenInfoExistProvider$customTokenProvider$2(context));
    }

    /* renamed from: c */
    public final xy0 mo60710c() {
        return (xy0) this.f42496b.getValue();
    }

    /* renamed from: d */
    public final ir6 mo60711d() {
        return (ir6) this.f42495a.getValue();
    }

    /* renamed from: e */
    public final void mo60712e(Integer num, k04<String> k04) {
        vx2.m53591g(k04, "slugLiveData");
        if (num != null) {
            y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new TokenInfoExistProvider$getTokenInfoForSlug$1(this, num, k04, (ns0<? super TokenInfoExistProvider$getTokenInfoForSlug$1>) null), 3, (Object) null);
        }
    }
}
