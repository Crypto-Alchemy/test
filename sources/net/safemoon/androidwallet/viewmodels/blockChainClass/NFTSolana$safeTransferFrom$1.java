package net.safemoon.androidwallet.viewmodels.blockChainClass;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana", mo48632f = "NFTSolana.kt", mo48633l = {30}, mo48634m = "safeTransferFrom")
/* compiled from: NFTSolana.kt */
public final class NFTSolana$safeTransferFrom$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NFTSolana this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NFTSolana$safeTransferFrom$1(NFTSolana nFTSolana, ns0<? super NFTSolana$safeTransferFrom$1> ns0) {
        super(ns0);
        this.this$0 = nFTSolana;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61843k((String) null, (BigInteger) null, (BigInteger) null, this);
    }
}
