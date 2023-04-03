package com.walletconnect.android.internal.common.p013di;

import com.walletconnect.android.relay.ConnectionType;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000¨\u0006\b"}, mo44877d2 = {"", "serverUrl", "jwt", "Lcom/walletconnect/android/relay/ConnectionType;", "connectionType", "sdkVersion", "Ldx3;", "a", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.android.internal.common.di.CoreNetworkModuleKt */
/* compiled from: CoreNetworkModule.kt */
public final class CoreNetworkModuleKt {
    /* renamed from: a */
    public static final dx3 m42106a(String str, String str2, ConnectionType connectionType, String str3) {
        vx2.m53591g(str, "serverUrl");
        vx2.m53591g(str2, "jwt");
        vx2.m53591g(connectionType, "connectionType");
        vx2.m53591g(str3, "sdkVersion");
        return jx3.m59607b(false, new CoreNetworkModuleKt$coreAndroidNetworkModule$1(str3, connectionType, str, str2), 1, (Object) null);
    }
}
