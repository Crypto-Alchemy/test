package com.tinder.scarlet.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.et1;
import p000.yj7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n"}, mo44877d2 = {"Let1$d$a;", "", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 5, 1})
/* compiled from: Connection.kt */
public final class Connection$StateManager$webSocketOpen$1 extends Lambda implements rc2<et1.C5815d.C5816a<?>, Boolean> {
    public static final Connection$StateManager$webSocketOpen$1 INSTANCE = new Connection$StateManager$webSocketOpen$1();

    public Connection$StateManager$webSocketOpen$1() {
        super(1);
    }

    public final Boolean invoke(et1.C5815d.C5816a<?> aVar) {
        vx2.m53591g(aVar, "$this$where");
        return Boolean.valueOf(aVar.mo42408a() instanceof yj7.C6739a.C6743d);
    }
}
