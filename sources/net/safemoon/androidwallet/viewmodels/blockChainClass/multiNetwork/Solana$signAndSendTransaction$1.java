package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana", mo48632f = "Solana.kt", mo48633l = {201, 202}, mo48634m = "signAndSendTransaction$suspendImpl")
/* compiled from: Solana.kt */
public final class Solana$signAndSendTransaction$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Solana this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Solana$signAndSendTransaction$1(Solana solana, ns0<? super Solana$signAndSendTransaction$1> ns0) {
        super(ns0);
        this.this$0 = solana;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Solana.m69296z(this.this$0, Utils.DOUBLE_EPSILON, (String) null, (String) null, (BigInteger) null, (Double) null, 0, this);
    }
}
