package org.koin.android.ext.koin;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 5, 1})
/* compiled from: KoinExt.kt */
public final class KoinExtKt$androidContext$2 extends Lambda implements rc2<dx3, r37> {
    public final /* synthetic */ Context $androidContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KoinExtKt$androidContext$2(Context context) {
        super(1);
        this.$androidContext = context;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        vx2.m53591g(dx3, "$this$module");
        final Context context = this.$androidContext;
        C90711 r5 = new fd2<Scope, ul4, Context>() {
            public final Context invoke(Scope scope, ul4 ul4) {
                vx2.m53591g(scope, "$this$single");
                vx2.m53591g(ul4, "it");
                return context;
            }
        };
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(mn5.f40974e.mo56288a(), ua5.m52727b(Context.class), (oz4) null, r5, Kind.Singleton, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory);
        }
        new jc3(dx3, singleInstanceFactory);
    }
}
