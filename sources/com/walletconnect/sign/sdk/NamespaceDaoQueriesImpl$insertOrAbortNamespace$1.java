package com.walletconnect.sign.sdk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lo76;", "Lr37;", "invoke", "(Lo76;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SignDatabaseImpl.kt */
public final class NamespaceDaoQueriesImpl$insertOrAbortNamespace$1 extends Lambda implements rc2<o76, r37> {
    public final /* synthetic */ List<String> $accounts;
    public final /* synthetic */ List<String> $events;
    public final /* synthetic */ String $key;
    public final /* synthetic */ List<String> $methods;
    public final /* synthetic */ long $request_id;
    public final /* synthetic */ long $session_id;
    public final /* synthetic */ NamespaceDaoQueriesImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NamespaceDaoQueriesImpl$insertOrAbortNamespace$1(long j, String str, NamespaceDaoQueriesImpl namespaceDaoQueriesImpl, List<String> list, List<String> list2, List<String> list3, long j2) {
        super(1);
        this.$session_id = j;
        this.$key = str;
        this.this$0 = namespaceDaoQueriesImpl;
        this.$accounts = list;
        this.$methods = list2;
        this.$events = list3;
        this.$request_id = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((o76) obj);
        return r37.f33317a;
    }

    public final void invoke(o76 o76) {
        vx2.m53591g(o76, "$this$execute");
        o76.mo39608b(1, Long.valueOf(this.$session_id));
        o76.bindString(2, this.$key);
        o76.bindString(3, this.this$0.f27769d.mo42468h0().mo28800a().mo40236a(this.$accounts));
        o76.bindString(4, this.this$0.f27769d.mo42468h0().mo28802c().mo40236a(this.$methods));
        o76.bindString(5, this.this$0.f27769d.mo42468h0().mo28801b().mo40236a(this.$events));
        o76.mo39608b(6, Long.valueOf(this.$request_id));
    }
}
