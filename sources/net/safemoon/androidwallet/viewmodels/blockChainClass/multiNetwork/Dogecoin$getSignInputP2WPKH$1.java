package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Dogecoin", mo48632f = "Dogecoin.kt", mo48633l = {43, 57}, mo48634m = "getSignInputP2WPKH")
/* compiled from: Dogecoin.kt */
public final class Dogecoin$getSignInputP2WPKH$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Dogecoin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dogecoin$getSignInputP2WPKH$1(Dogecoin dogecoin, ns0<? super Dogecoin$getSignInputP2WPKH$1> ns0) {
        super(ns0);
        this.this$0 = dogecoin;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61892k(Utils.DOUBLE_EPSILON, (String) null, 0, this);
    }
}
