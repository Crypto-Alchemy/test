package com.walletconnect.android.internal.common.p013di;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import p000.mn5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.android.internal.common.di.EchoModuleKt$echoModule$1 */
/* compiled from: EchoModule.kt */
public final class EchoModuleKt$echoModule$1 extends Lambda implements rc2<dx3, r37> {
    public static final EchoModuleKt$echoModule$1 INSTANCE = new EchoModuleKt$echoModule$1();

    public EchoModuleKt$echoModule$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        vx2.m53591g(dx3, "$this$module");
        C55531 r5 = C55531.INSTANCE;
        mn5.C7904a aVar = mn5.f40974e;
        gb6 a = aVar.mo56288a();
        Kind kind = Kind.Singleton;
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(a, ua5.m52727b(cn1.class), (oz4) null, r5, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory);
        }
        new jc3(dx3, singleInstanceFactory);
        oz4 c = pz4.m71134c(AndroidCommonDITags.CLIENT_ID);
        C55542 r10 = C55542.INSTANCE;
        SingleInstanceFactory singleInstanceFactory2 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(String.class), c, r10, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory2);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory2);
        }
        new jc3(dx3, singleInstanceFactory2);
    }
}
