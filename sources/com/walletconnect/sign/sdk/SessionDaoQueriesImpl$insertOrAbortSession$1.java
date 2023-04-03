package com.walletconnect.sign.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lo76;", "Lr37;", "invoke", "(Lo76;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SignDatabaseImpl.kt */
public final class SessionDaoQueriesImpl$insertOrAbortSession$1 extends Lambda implements rc2<o76, r37> {
    public final /* synthetic */ String $controller_key;
    public final /* synthetic */ long $expiry;
    public final /* synthetic */ boolean $is_acknowledged;
    public final /* synthetic */ String $pairingTopic;
    public final /* synthetic */ String $peer_participant;
    public final /* synthetic */ String $relay_data;
    public final /* synthetic */ String $relay_protocol;
    public final /* synthetic */ String $self_participant;
    public final /* synthetic */ String $topic;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionDaoQueriesImpl$insertOrAbortSession$1(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, boolean z) {
        super(1);
        this.$topic = str;
        this.$pairingTopic = str2;
        this.$expiry = j;
        this.$relay_protocol = str3;
        this.$relay_data = str4;
        this.$controller_key = str5;
        this.$self_participant = str6;
        this.$peer_participant = str7;
        this.$is_acknowledged = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((o76) obj);
        return r37.f33317a;
    }

    public final void invoke(o76 o76) {
        vx2.m53591g(o76, "$this$execute");
        o76.bindString(1, this.$topic);
        o76.bindString(2, this.$pairingTopic);
        o76.mo39608b(3, Long.valueOf(this.$expiry));
        o76.bindString(4, this.$relay_protocol);
        o76.bindString(5, this.$relay_data);
        o76.bindString(6, this.$controller_key);
        o76.bindString(7, this.$self_participant);
        o76.bindString(8, this.$peer_participant);
        o76.mo39608b(9, Long.valueOf(this.$is_acknowledged ? 1 : 0));
    }
}
