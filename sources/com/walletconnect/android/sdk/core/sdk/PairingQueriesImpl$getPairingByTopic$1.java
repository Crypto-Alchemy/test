package com.walletconnect.android.sdk.core.sdk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "T", "Ll76;", "cursor", "invoke", "(Ll76;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AndroidCoreDatabaseImpl.kt */
public final class PairingQueriesImpl$getPairingByTopic$1 extends Lambda implements rc2<l76, T> {
    public final /* synthetic */ tc2<String, Long, String, String, String, String, Boolean, String, String, String, List<String>, String, T> $mapper;
    public final /* synthetic */ PairingQueriesImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingQueriesImpl$getPairingByTopic$1(tc2<? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super List<String>, ? super String, ? extends T> tc2, PairingQueriesImpl pairingQueriesImpl) {
        super(1);
        this.$mapper = tc2;
        this.this$0 = pairingQueriesImpl;
    }

    public final T invoke(l76 l76) {
        vx2.m53591g(l76, "cursor");
        tc2<String, Long, String, String, String, String, Boolean, String, String, String, List<String>, String, T> tc2 = this.$mapper;
        boolean z = false;
        String string = l76.getString(0);
        vx2.m53588d(string);
        Long l = l76.getLong(1);
        vx2.m53588d(l);
        String string2 = l76.getString(2);
        vx2.m53588d(string2);
        String string3 = l76.getString(3);
        String string4 = l76.getString(4);
        vx2.m53588d(string4);
        String string5 = l76.getString(5);
        vx2.m53588d(string5);
        Long l2 = l76.getLong(6);
        vx2.m53588d(l2);
        if (l2.longValue() == 1) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        String string6 = l76.getString(7);
        String string7 = l76.getString(8);
        String string8 = l76.getString(9);
        String string9 = l76.getString(10);
        return tc2.invoke(string, l, string2, string3, string4, string5, valueOf, string6, string7, string8, string9 != null ? this.this$0.f27276d.mo30015i0().mo48824a().mo40237b(string9) : null, l76.getString(11));
    }
}
