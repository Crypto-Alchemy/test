package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel", mo48632f = "CryptoPriceAlertViewModel.kt", mo48633l = {235, 244, 252}, mo48634m = "getNewEmptyToken")
/* compiled from: CryptoPriceAlertViewModel.kt */
public final class CryptoPriceAlertViewModel$getNewEmptyToken$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CryptoPriceAlertViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertViewModel$getNewEmptyToken$1(CryptoPriceAlertViewModel cryptoPriceAlertViewModel, ns0<? super CryptoPriceAlertViewModel$getNewEmptyToken$1> ns0) {
        super(ns0);
        this.this$0 = cryptoPriceAlertViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61136r((String) null, (String) null, (String) null, 0, (Integer) null, this);
    }
}
