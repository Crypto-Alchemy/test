package com.walletconnect.android.sdk.core.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lo76;", "Lr37;", "invoke", "(Lo76;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AndroidCoreDatabaseImpl.kt */
public final class PairingQueriesImpl$insertOrAbortPairing$1 extends Lambda implements rc2<o76, r37> {
    public final /* synthetic */ long $expiry;
    public final /* synthetic */ boolean $is_active;
    public final /* synthetic */ String $methods;
    public final /* synthetic */ String $relay_data;
    public final /* synthetic */ String $relay_protocol;
    public final /* synthetic */ String $topic;
    public final /* synthetic */ String $uri;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingQueriesImpl$insertOrAbortPairing$1(String str, long j, String str2, String str3, String str4, String str5, boolean z) {
        super(1);
        this.$topic = str;
        this.$expiry = j;
        this.$relay_protocol = str2;
        this.$relay_data = str3;
        this.$uri = str4;
        this.$methods = str5;
        this.$is_active = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((o76) obj);
        return r37.f33317a;
    }

    public final void invoke(o76 o76) {
        vx2.m53591g(o76, "$this$execute");
        o76.bindString(1, this.$topic);
        o76.mo39608b(2, Long.valueOf(this.$expiry));
        o76.bindString(3, this.$relay_protocol);
        o76.bindString(4, this.$relay_data);
        o76.bindString(5, this.$uri);
        o76.bindString(6, this.$methods);
        o76.mo39608b(7, Long.valueOf(this.$is_active ? 1 : 0));
    }
}
