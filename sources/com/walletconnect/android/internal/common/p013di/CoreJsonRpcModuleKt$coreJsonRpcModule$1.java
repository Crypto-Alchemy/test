package com.walletconnect.android.internal.common.p013di;

import com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface;
import com.walletconnect.android.pairing.model.PairingRpc;
import com.walletconnect.utils.UtilFunctionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import p000.mn5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.android.internal.common.di.CoreJsonRpcModuleKt$coreJsonRpcModule$1 */
/* compiled from: CoreJsonRpcModule.kt */
public final class CoreJsonRpcModuleKt$coreJsonRpcModule$1 extends Lambda implements rc2<dx3, r37> {
    public static final CoreJsonRpcModuleKt$coreJsonRpcModule$1 INSTANCE = new CoreJsonRpcModuleKt$coreJsonRpcModule$1();

    public CoreJsonRpcModuleKt$coreJsonRpcModule$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        Class<PairingRpc.PairingDelete> cls = PairingRpc.PairingDelete.class;
        Class<PairingRpc.PairingPing> cls2 = PairingRpc.PairingPing.class;
        vx2.m53591g(dx3, "$this$module");
        C55371 r7 = C55371.INSTANCE;
        mn5.C7904a aVar = mn5.f40974e;
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(JsonRpcInteractorInterface.class), (oz4) null, r7, Kind.Singleton, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory);
        }
        new jc3(dx3, singleInstanceFactory);
        UtilFunctionsKt.m43022b(dx3, ua5.m52727b(cls2));
        UtilFunctionsKt.m43022b(dx3, ua5.m52727b(cls));
        UtilFunctionsKt.m43021a(dx3, "wc_pairingPing", ua5.m52727b(cls2));
        UtilFunctionsKt.m43021a(dx3, "wc_pairingDelete", ua5.m52727b(cls));
        C55382 r72 = C55382.INSTANCE;
        ty1 ty1 = new ty1(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(t63.class), (oz4) null, r72, Kind.Factory, ck0.m33062j()));
        dx3.mo51303g(ty1);
        new jc3(dx3, ty1);
    }
}
