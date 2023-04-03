package com.walletconnect.android.echo;

import com.walletconnect.android.internal.common.p013di.AndroidCommonDITags;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: EchoClient.kt */
public final class EchoClient$clientId$2 extends Lambda implements pc2<String> {
    public static final EchoClient$clientId$2 INSTANCE = new EchoClient$clientId$2();

    public EchoClient$clientId$2() {
        super(0);
    }

    public final String invoke() {
        fc3 b = hc3.m45112a().mo51892b();
        return (String) b.mo51636g().mo56284d().mo64988f(ua5.m52727b(String.class), pz4.m71134c(AndroidCommonDITags.CLIENT_ID), (pc2<? extends ul4>) null);
    }
}
