package com.walletconnect.android.relay;

import com.walletconnect.android.internal.common.p013di.AndroidCommonDITags;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lyp0;", "invoke", "()Lyp0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: RelayClient.kt */
public final class RelayClient$networkState$2 extends Lambda implements pc2<yp0> {
    public static final RelayClient$networkState$2 INSTANCE = new RelayClient$networkState$2();

    public RelayClient$networkState$2() {
        super(0);
    }

    public final yp0 invoke() {
        fc3 b = hc3.m45112a().mo51892b();
        return (yp0) b.mo51636g().mo56284d().mo64988f(ua5.m52727b(yp0.class), pz4.m71134c(AndroidCommonDITags.CONNECTIVITY_STATE), (pc2<? extends ul4>) null);
    }
}
