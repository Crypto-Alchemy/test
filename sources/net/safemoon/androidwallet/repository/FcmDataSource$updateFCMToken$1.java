package net.safemoon.androidwallet.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.repository.FcmDataSource", mo48632f = "FcmDataSource.kt", mo48633l = {31, 33, 46}, mo48634m = "updateFCMToken")
/* compiled from: FcmDataSource.kt */
public final class FcmDataSource$updateFCMToken$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FcmDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FcmDataSource$updateFCMToken$1(FcmDataSource fcmDataSource, ns0<? super FcmDataSource$updateFCMToken$1> ns0) {
        super(ns0);
        this.this$0 = fcmDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60726e((String) null, (String) null, false, (rc2<? super Boolean, r37>) null, this);
    }
}
