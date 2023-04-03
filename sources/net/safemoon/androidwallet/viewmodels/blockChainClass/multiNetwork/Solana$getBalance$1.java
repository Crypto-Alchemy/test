package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana", mo48632f = "Solana.kt", mo48633l = {32, 36}, mo48634m = "getBalance$suspendImpl")
/* compiled from: Solana.kt */
public final class Solana$getBalance$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Solana this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Solana$getBalance$1(Solana solana, ns0<? super Solana$getBalance$1> ns0) {
        super(ns0);
        this.this$0 = solana;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Solana.m69293r(this.this$0, (String) null, this);
    }
}
