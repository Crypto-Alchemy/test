package com.trustwallet.walletconnect;

import java.util.Date;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u001a\b\u0010\u0004\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo44877d2 = {"JSONRPC_VERSION", "", "WS_CLOSE_NORMAL", "", "generateId", "", "library-walletconnect_release"}, mo44878k = 2, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCClient.kt */
public final class WCClientKt {
    public static final String JSONRPC_VERSION = "2.0";
    public static final int WS_CLOSE_NORMAL = 1000;

    /* access modifiers changed from: private */
    public static final long generateId() {
        return new Date().getTime();
    }
}
