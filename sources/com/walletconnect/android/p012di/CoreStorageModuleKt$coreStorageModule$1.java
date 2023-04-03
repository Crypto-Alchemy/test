package com.walletconnect.android.p012di;

import com.walletconnect.android.internal.common.p013di.BaseStorageModuleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.android.di.CoreStorageModuleKt$coreStorageModule$1 */
/* compiled from: CoreStorageModule.kt */
public final class CoreStorageModuleKt$coreStorageModule$1 extends Lambda implements rc2<dx3, r37> {
    public static final CoreStorageModuleKt$coreStorageModule$1 INSTANCE = new CoreStorageModuleKt$coreStorageModule$1();

    public CoreStorageModuleKt$coreStorageModule$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        vx2.m53591g(dx3, "$this$module");
        dx3.mo51302f(BaseStorageModuleKt.m42097a(), CoreStorageModuleKt.m42006k());
        oz4 c = pz4.m71134c(AndroidCoreDITags.ANDROID_CORE_DATABASE_DRIVER);
        C55111 r5 = C55111.INSTANCE;
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(mn5.f40974e.mo56288a(), ua5.m52727b(m76.class), c, r5, Kind.Singleton, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory);
        }
        new jc3(dx3, singleInstanceFactory);
    }
}
