package net.safemoon.androidwallet.viewmodels.blockChainClass;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721", mo48632f = "NFT721.kt", mo48633l = {29}, mo48634m = "estimateGas")
/* compiled from: NFT721.kt */
public final class NFT721$estimateGas$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NFT721 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NFT721$estimateGas$1(NFT721 nft721, ns0<? super NFT721$estimateGas$1> ns0) {
        super(ns0);
        this.this$0 = nft721;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61840d((String) null, (BigInteger) null, (BigInteger) null, false, this);
    }
}
