package com.walletconnect.auth.p014di;

import com.walletconnect.auth.common.json_rpc.AuthRpc;
import com.walletconnect.utils.UtilFunctionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.auth.di.JsonRpcModuleKt$jsonRpcModule$1 */
/* compiled from: JsonRpcModule.kt */
public final class JsonRpcModuleKt$jsonRpcModule$1 extends Lambda implements rc2<dx3, r37> {
    public static final JsonRpcModuleKt$jsonRpcModule$1 INSTANCE = new JsonRpcModuleKt$jsonRpcModule$1();

    public JsonRpcModuleKt$jsonRpcModule$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        Class<AuthRpc.AuthRequest> cls = AuthRpc.AuthRequest.class;
        vx2.m53591g(dx3, "$this$module");
        UtilFunctionsKt.m43022b(dx3, ua5.m52727b(cls));
        UtilFunctionsKt.m43021a(dx3, "wc_authRequest", ua5.m52727b(cls));
    }
}
