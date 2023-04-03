package com.walletconnect.android;

import android.app.Application;
import com.walletconnect.android.echo.EchoClient;
import com.walletconnect.android.internal.common.p013di.CoreCommonModuleKt;
import com.walletconnect.android.internal.common.p013di.CoreCryptoModuleKt$coreCryptoModule$1;
import com.walletconnect.android.internal.common.p013di.CoreJsonRpcModuleKt$coreJsonRpcModule$1;
import com.walletconnect.android.internal.common.p013di.CorePairingModuleKt;
import com.walletconnect.android.internal.common.p013di.EchoModuleKt$echoModule$1;
import com.walletconnect.android.p012di.CoreStorageModuleKt;
import com.walletconnect.android.pairing.client.PairingProtocol;
import com.walletconnect.android.pairing.handler.PairingController;
import com.walletconnect.android.relay.ConnectionType;
import com.walletconnect.android.relay.RelayClient;
import kotlin.Metadata;
import org.koin.android.ext.koin.KoinExtKt;
import p000.ll4;
import p000.tt0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b$\u0010%JF\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\"\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, mo44877d2 = {"Lcom/walletconnect/android/CoreClient;", "", "Ltt0$a;", "metaData", "", "relayServerUrl", "Lcom/walletconnect/android/relay/ConnectionType;", "connectionType", "Landroid/app/Application;", "application", "Lfc5;", "relay", "Lkotlin/Function1;", "Ltt0$c;", "Lr37;", "onError", "d", "Lcom/walletconnect/android/CoreClient$a;", "delegate", "f", "Lll4;", "b", "Lll4;", "()Lll4;", "Pairing", "c", "Lfc5;", "()Lfc5;", "setRelay", "(Lfc5;)V", "Relay", "Lbn1;", "Lbn1;", "a", "()Lbn1;", "Echo", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CoreClient.kt */
public final class CoreClient {

    /* renamed from: a */
    public static final CoreClient f27008a = new CoreClient();

    /* renamed from: b */
    public static final ll4 f27009b = PairingProtocol.f27189a;

    /* renamed from: c */
    public static fc5 f27010c = RelayClient.f27245g;

    /* renamed from: d */
    public static final bn1 f27011d = EchoClient.f27015a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo44877d2 = {"Lcom/walletconnect/android/CoreClient$a;", "Lll4$a;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.android.CoreClient$a */
    /* compiled from: CoreClient.kt */
    public interface C5506a extends ll4.C6221a {
    }

    /* renamed from: e */
    public static /* synthetic */ void m41990e(CoreClient coreClient, tt0.C6536a aVar, String str, ConnectionType connectionType, Application application, fc5 fc5, rc2 rc2, int i, Object obj) {
        if ((i & 16) != 0) {
            fc5 = null;
        }
        coreClient.mo40081d(aVar, str, connectionType, application, fc5, rc2);
    }

    /* renamed from: a */
    public final bn1 mo40078a() {
        return f27011d;
    }

    /* renamed from: b */
    public final ll4 mo40079b() {
        return f27009b;
    }

    /* renamed from: c */
    public final fc5 mo40080c() {
        return f27010c;
    }

    /* renamed from: d */
    public final void mo40081d(tt0.C6536a aVar, String str, ConnectionType connectionType, Application application, fc5 fc5, rc2<? super tt0.C6538c, r37> rc2) {
        vx2.m53591g(aVar, "metaData");
        vx2.m53591g(str, "relayServerUrl");
        vx2.m53591g(connectionType, "connectionType");
        vx2.m53591g(application, "application");
        vx2.m53591g(rc2, "onError");
        eq6.m44024a();
        gc3 a = hc3.m45112a();
        KoinExtKt.m70708a(a, application);
        a.mo51896f(CoreCommonModuleKt.m42102a(), jx3.m59607b(false, CoreCryptoModuleKt$coreCryptoModule$1.INSTANCE, 1, (Object) null), jx3.m59607b(false, new CoreClient$initialize$1$1(str), 1, (Object) null), CoreStorageModuleKt.m42001f(), jx3.m59607b(false, EchoModuleKt$echoModule$1.INSTANCE, 1, (Object) null), jx3.m59607b(false, new CoreClient$initialize$1$2(fc5), 1, (Object) null), jx3.m59607b(false, new CoreClient$initialize$1$3(aVar), 1, (Object) null), jx3.m59607b(false, CoreClient$initialize$1$4.INSTANCE, 1, (Object) null), jx3.m59607b(false, CoreJsonRpcModuleKt$coreJsonRpcModule$1.INSTANCE, 1, (Object) null), CorePairingModuleKt.m42107a(f27009b));
        if (fc5 == null) {
            RelayClient.f27245g.mo40536w(str, connectionType, new CoreClient$initialize$2(rc2));
        }
        PairingProtocol.f27189a.mo40458i();
        PairingController.f27217a.mo40501i();
    }

    /* renamed from: f */
    public final void mo40082f(C5506a aVar) {
        vx2.m53591g(aVar, "delegate");
        PairingProtocol.f27189a.mo40459j(aVar);
    }
}
