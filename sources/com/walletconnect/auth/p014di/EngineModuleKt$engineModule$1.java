package com.walletconnect.auth.p014di;

import com.walletconnect.auth.engine.domain.AuthEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import p000.mn5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.auth.di.EngineModuleKt$engineModule$1 */
/* compiled from: EngineModule.kt */
public final class EngineModuleKt$engineModule$1 extends Lambda implements rc2<dx3, r37> {
    public static final EngineModuleKt$engineModule$1 INSTANCE = new EngineModuleKt$engineModule$1();

    public EngineModuleKt$engineModule$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        vx2.m53591g(dx3, "$this$module");
        C55831 r5 = C55831.INSTANCE;
        mn5.C7904a aVar = mn5.f40974e;
        gb6 a = aVar.mo56288a();
        Kind kind = Kind.Singleton;
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(a, ua5.m52727b(wf2.class), (oz4) null, r5, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory);
        }
        new jc3(dx3, singleInstanceFactory);
        C55842 r10 = C55842.INSTANCE;
        SingleInstanceFactory singleInstanceFactory2 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(xf2.class), (oz4) null, r10, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory2);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory2);
        }
        new jc3(dx3, singleInstanceFactory2);
        C55853 r102 = C55853.INSTANCE;
        SingleInstanceFactory singleInstanceFactory3 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(zf2.class), (oz4) null, r102, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory3);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory3);
        }
        new jc3(dx3, singleInstanceFactory3);
        C55864 r103 = C55864.INSTANCE;
        SingleInstanceFactory singleInstanceFactory4 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(b80.class), (oz4) null, r103, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory4);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory4);
        }
        new jc3(dx3, singleInstanceFactory4);
        C55875 r104 = C55875.INSTANCE;
        SingleInstanceFactory singleInstanceFactory5 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(AuthEngine.class), (oz4) null, r104, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory5);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory5);
        }
        new jc3(dx3, singleInstanceFactory5);
    }
}
