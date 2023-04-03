package com.walletconnect.android;

import com.walletconnect.android.relay.RelayClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CoreClient.kt */
public final class CoreClient$initialize$1$2 extends Lambda implements rc2<dx3, r37> {
    public final /* synthetic */ fc5 $relay;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreClient$initialize$1$2(fc5 fc5) {
        super(1);
        this.$relay = fc5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        vx2.m53591g(dx3, "$this$module");
        final fc5 fc5 = this.$relay;
        C55081 r5 = new fd2<Scope, ul4, fc5>() {
            public final fc5 invoke(Scope scope, ul4 ul4) {
                vx2.m53591g(scope, "$this$single");
                vx2.m53591g(ul4, "it");
                fc5 fc5 = fc5;
                return fc5 == null ? RelayClient.f27245g : fc5;
            }
        };
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(mn5.f40974e.mo56288a(), ua5.m52727b(fc5.class), (oz4) null, r5, Kind.Singleton, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory);
        }
        new jc3(dx3, singleInstanceFactory);
    }
}
