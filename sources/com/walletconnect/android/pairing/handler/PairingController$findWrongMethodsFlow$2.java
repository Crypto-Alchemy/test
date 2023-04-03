package com.walletconnect.android.pairing.handler;

import com.walletconnect.android.pairing.engine.domain.PairingEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lz42;", "Ljava/lang/InternalError;", "invoke", "()Lz42;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: PairingController.kt */
public final class PairingController$findWrongMethodsFlow$2 extends Lambda implements pc2<z42<? extends InternalError>> {
    public static final PairingController$findWrongMethodsFlow$2 INSTANCE = new PairingController$findWrongMethodsFlow$2();

    public PairingController$findWrongMethodsFlow$2() {
        super(0);
    }

    public final z42<InternalError> invoke() {
        z42[] z42Arr = new z42[2];
        PairingEngine g = PairingController.f27218b;
        PairingEngine pairingEngine = null;
        if (g == null) {
            vx2.m53605u("pairingEngine");
            g = null;
        }
        z42Arr[0] = g.mo40471p();
        PairingEngine g2 = PairingController.f27218b;
        if (g2 == null) {
            vx2.m53605u("pairingEngine");
        } else {
            pairingEngine = g2;
        }
        z42Arr[1] = pairingEngine.mo40472q();
        return e52.m57200A(z42Arr);
    }
}
