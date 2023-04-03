package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Dogecoin", mo48632f = "Dogecoin.kt", mo48633l = {94, 100}, mo48634m = "signAndSendTransaction")
/* compiled from: Dogecoin.kt */
public final class Dogecoin$signAndSendTransaction$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Dogecoin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dogecoin$signAndSendTransaction$1(Dogecoin dogecoin, ns0<? super Dogecoin$signAndSendTransaction$1> ns0) {
        super(ns0);
        this.this$0 = dogecoin;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo56292b(Utils.DOUBLE_EPSILON, (String) null, (String) null, (BigInteger) null, (Double) null, 0, this);
    }
}
