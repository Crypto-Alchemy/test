package com.walletconnect.android.pairing.handler;

import com.walletconnect.android.pairing.engine.domain.PairingEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lxz5;", "Les6;", "invoke", "()Lxz5;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: PairingController.kt */
public final class PairingController$topicExpiredFlow$2 extends Lambda implements pc2<xz5<? extends es6>> {
    public static final PairingController$topicExpiredFlow$2 INSTANCE = new PairingController$topicExpiredFlow$2();

    public PairingController$topicExpiredFlow$2() {
        super(0);
    }

    public final xz5<es6> invoke() {
        PairingEngine g = PairingController.f27218b;
        if (g == null) {
            vx2.m53605u("pairingEngine");
            g = null;
        }
        return g.mo40475t();
    }
}
