package org.koin.androidx.scope;

import kotlin.Metadata;
import org.koin.core.scope.Scope;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"org/koin/androidx/scope/LifecycleViewModelScopeDelegate$2", "Lw81;", "Lug3;", "owner", "Lr37;", "x", "koin-android_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* compiled from: LifecycleViewModelScopeDelegate.kt */
public final class LifecycleViewModelScopeDelegate$2 implements w81 {

    /* renamed from: a */
    public final /* synthetic */ kn5 f43928a;

    /* renamed from: h */
    public /* synthetic */ void mo3766h(ug3 ug3) {
        v81.m28696e(this, ug3);
    }

    /* renamed from: k */
    public /* synthetic */ void mo3771k(ug3 ug3) {
        v81.m28693b(this, ug3);
    }

    /* renamed from: l */
    public /* synthetic */ void mo3772l(ug3 ug3) {
        v81.m28695d(this, ug3);
    }

    /* renamed from: p */
    public /* synthetic */ void mo3791p(ug3 ug3) {
        v81.m28697f(this, ug3);
    }

    /* renamed from: s */
    public /* synthetic */ void mo3795s(ug3 ug3) {
        v81.m28694c(this, ug3);
    }

    /* renamed from: x */
    public void mo3803x(ug3 ug3) {
        vx2.m53591g(ug3, ENS.FUNC_OWNER);
        if (this.f43928a.mo52961b() == null) {
            this.f43928a.mo52962c((Scope) ch3.m56441c((ch3) null).invoke(ch3.m56442d((ch3) null)));
        }
        ch3.m56443e((ch3) null, this.f43928a.mo52961b());
    }
}
